package com.fyam

import io.github.tabilzad.ktor.annotations.GenerateOpenApi
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route

@GenerateOpenApi
fun Route.rootRoute() {
    route("/root") {
        routeExpression()
        routeBlockBodyWithReturn()
        routeNoReturnType()
        routeExplicitUnit()
    }
}

fun Route.routeExpression(): Route = route("/expressBody") {
    get {}
}

fun Route.routeBlockBodyWithReturn(): Route {
    return route("/blockBodyWithReturn") {
        get {}
    }
}

fun Route.routeNoReturnType() {
    route("/noReturnType") {
        get {}
    }
}

@Suppress("RedundantUnitReturnType")
fun Route.routeExplicitUnit(): Unit {
    route("/explicitUnit") {
        get {}
    }
}
