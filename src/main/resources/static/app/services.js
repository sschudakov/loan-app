//(function(angular) {
//  var LoanRequestFactory = function($resource) { debugger
//    return $resource('/loanRequests/:id', {
//      id: '@id'
//    }, {
//      update: {
//        method: "PUT"
//      },
//      remove: {
//        method: "DELETE"
//      }
//    });
//  };
//
//  LoanRequestFactory.$inject = ['$resource'];
//  angular.module("myApp.services").factory("LoanRequest", LoanRequestFactory);
//}(angular));