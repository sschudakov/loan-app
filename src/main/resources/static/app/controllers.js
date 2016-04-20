(function (angular) {
	var LoanRequestController = function ($scope, $http, $window) {
		$scope.processLoanRequest = function (newLoanRequest) {
			debugger
			$http({
				method : 'POST',
				url : '/loan-requests',
				data : newLoanRequest
			}).then(function successCallback(response) {
				newLoanRequest = {}; debugger
				if (response.status == 201) {
					$window.location.href = '/success';
				} else {
					$window.location.href = '/reject';
				}
			}, function errorCallback(response) {
				$window.location.href = '/reject';
			});
		};
	};

	LoanRequestController.$inject = ['$scope', '$http', '$window'];
	angular.module("myApp.controllers").controller("LoanRequestController", LoanRequestController);
}(angular));