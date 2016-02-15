package com.xvitcoder.angualrspringapp.dao;

import com.xvitcoder.angualrspringapp.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Pavel on 15.02.2016.
 */
@Service
public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<User> getAllUsers() {
        return this.jdbcTemplate.query(

                "select * from users",
                new RowMapper<User>() {
                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return new User(rs.getString("name"));
                    }
                });
    }

    public void addUser(User user){
        this.jdbcTemplate.update("insert into users (name) value(?)",user.getName());
    };
}
