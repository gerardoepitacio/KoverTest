package com.example.module01

interface RemoteDataProvider {

    companion object {

        fun newInstance(): RemoteDataProvider {

            return RemoteDataProviderImpl()
        }
    }

    suspend fun sumValues(first: Float, second: Float): Float

    suspend fun multiplyValues(first: Float, second: Float): Float

    suspend fun divideValues(first: Float, second: Float): Float

    suspend fun subtractValues(first: Float, second: Float): Float

}