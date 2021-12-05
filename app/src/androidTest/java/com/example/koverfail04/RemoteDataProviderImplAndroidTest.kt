package com.example.koverfail04

import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RemoteDataProviderImplAndroidTest {

    val remoteDataProvider: RemoteDataProvider = RemoteDataProvider.newInstance()

    @Test
    fun sumValuesTest() = runTest {

        val result: Float = remoteDataProvider.sumValues(1F, 1F)

        assert(result == 2F)
    }

    @Test
    fun multiplyValuesTest() = runTest {

        val result: Float = remoteDataProvider.multiplyValues(1F, 1F)

        assert(result == 1F)
    }

    @Test
    fun divideValuesTest() = runTest {

        val result: Float = remoteDataProvider.divideValues(1F, 1F)

        assert(result == 1F)
    }

    @Test(expected = IllegalStateException::class)
    fun divideValuesErrorTest() = runTest {

        val result: Float = remoteDataProvider.divideValues(1F, 0F)

        assert(result == 1F)
    }

    @Test
    fun subtractValuesTest() = runTest {

        val result: Float = remoteDataProvider.subtractValues(1F, 1F)

        assert(result == 0F)
    }
}