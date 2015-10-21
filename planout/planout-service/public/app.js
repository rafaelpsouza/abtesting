(function () {
    var app = angular.module("catalog", ["ngRoute", "timeline"]);
    
    app.config(['$locationProvider', function ($locationProvider) {
        //$locationProvider.html5Mode(true);
    }]);

    app.config(function ($routeProvider) {
        $routeProvider
                .when("/", {
                    templateUrl: "timeline/timeline.html"
                })
                .when("/page1", {
                    templateUrl: "page1.html"
                })
                .when("/page2", {
                    templateUrl: "page2.html"
                });

    });
    
})();