<!DOCTYPE html>
<html>
<style>
table, th , td  {
  border: 1px solid grey;
  border-collapse: collapse;
  padding: 5px;
}
table tr:nth-child(odd)	{
  background-color: #f1f1f1;
}
table tr:nth-child(even) {
  background-color: #ffffff;
}
</style>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<body>

<div ng-app="myApp" ng-controller="customersCtrl"> 

<table>
     <tr>
        <th>EmpId</th>
        <th>FirstName</th>
		<th>LastName</th>
		<th>Phone</th>
		<th>Address</th>
		<th>Email</th>
		<th>profile</th>
		<th>Date Of Join</th>
            <tr ng-repeat="x in greeting">
            <td>{{x.empid}}</td>
            <td>{{x.firstname}}</td>
            <td>{{x.lastname}}</td>
            <td>{{x.phone}}</td>
            <td>{{x.address}}</td>
            <td>{{x.email}}</td>
            <td>{{x.profile}}</td>
            <td>{{x.dateofjoin}}</td>
    
  </tr>
</table>
<button ng-click="clickFun()"> Get Employee Data</button>
</div>

<script>
var app = angular.module('myApp', []);
app.controller('customersCtrl', ['$scope', '$http', function($scope, $http) {
	$scope.clickFun = function(){
    $http.get('http://localhost:8484/SpringRestFullWebservice/getData').success(function(data) {$scope.greeting = data;}); 
	}
}]);
</script>

</body>
</html>
