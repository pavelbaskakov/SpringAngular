'use strict';

/**
 * @constructor
 */
var CarController = function($scope, $http) {
    $scope.user={}
    $scope.fetchUsersList = function() {
        $http.get('cars/userlist').success(function(userList){
            $scope.users = userList;
        });
    };

    $scope.addNewUser = function(user) {
        $http.post('cars/adduser/',user).success(function() {
            //alert("!"+user.name+"!");
            $scope.fetchUsersList();
            $scope.user.name = ' ';
        });

    };


    $scope.fetchUsersList();
};