package com.example.module01

class RemoteDataProviderImpl : RemoteDataProvider {

    override suspend fun sumValues(first: Float, second: Float): Float {

        return first + second
    }

    override suspend fun multiplyValues(first: Float, second: Float): Float {

        return first * second
    }

    override suspend fun divideValues(first: Float, second: Float): Float {

        return if (second > 0) {

            first / second
        } else {

            error("can't divide by zero.")
        }
    }

    override suspend fun subtractValues(first: Float, second: Float): Float {

        return first - second
    }
}