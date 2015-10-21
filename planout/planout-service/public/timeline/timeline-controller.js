(function () {
    angular.module("timeline", [])
            .controller("TimelineController", function ($http, $routeParams) {
                this.position = "center";
                this.init = function (ctr, $http, $routeParams) {
                    $http.get('http://localhost:8080/experiments/commands_position?userid=' + $routeParams.userId).
                            success(function (data) {
                                ctr.position = data.position;
                                console.debug(ctr.position);
                            });
                };

                this.init(this, $http, $routeParams);
            })
            .directive('commands', function () {
                return {
                    restrict: 'E',
                    scope: {
                        align: '=align'
                    },
                    templateUrl: 'timeline/commands.html'
                };
            });
})();