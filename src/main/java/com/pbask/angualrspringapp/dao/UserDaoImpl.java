package com.pbask.angualrspringapp.dao;

import com.pbask.angualrspringapp.beans.User;
import com.pbask.angualrspringapp.daoentities.UsersEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Pavel on 15.02.2016.
 */
@Transactional
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<User> getAllUsers() {

        return sessionFactory.getCurrentSession().createCriteria(UsersEntity.class).list();
    }

    public void addUser(UsersEntity user) {
        sessionFactory.getCurrentSession().save(user);
    }
//    private JdbcTemplate jdbcTemplate;
//    @Autowired
//    public void setDataSource(DataSource dataSource) {
//        this.jdbcTemplate = new JdbcTemplate(dataSource);
//    }
//
//    public List<User> getAllUsers() {
//        return this.jdbcTemplate.query(
//
//                "select * from users",
//                new RowMapper<User>() {
//                    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//                        return new User(rs.getString("name"));
//                    }
//                });
//    }
//
//    public void addUser(User user){
//        this.jdbcTemplate.update("insert into users (name) value(?)",user.getName());
//    };
}

