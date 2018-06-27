(function(){
    'use strict';
    angular
        .module('app')
        .controller('StudentController',StudentController);

    StudentController.$inject = ['$http'];

    function StudentController($http){
        var vm = this;

        vm.students = [];

        vm.getAll = getAll;
        vm.getByCellLeader = getByCellLeader;
        vm.getByNetworkLeader = getByNetworkLeader;
        vm.deleteStudent = deleteStudent;

        getAll();

        function getAll(){
            var url = "/students/all";
            var studentsPromise = $http.get(url);
            studentsPromise.then(function(response){
                vm.students = response.data;
            });
        }

        function getByCellLeader(){
            var url = "/students/cellLeader/Dale";
            var studentsPromise = $http.get(url);
            studentsPromise.then(function(response){
                vm.students = response.data;
            });
        }

        function getByNetworkLeader(){
            var url = "/students/netLeader/Anjo";
            var studentsPromise = $http.get(url);
            studentsPromise.then(function(response){
                vm.students = response.data;
            });
        }

        function deleteStudent(id){
            var url = "/students/delete/"+id;
            $http.post(url).then(function(response){
                vm.students = response.data;
            });
        }
    }

})();