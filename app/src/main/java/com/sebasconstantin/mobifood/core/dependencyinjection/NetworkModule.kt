package com.sebasconstantin.mobifood.core.dependencyinjection

import com.sebasconstantin.mobifood.signin.data.network.SignInClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit = Retrofit.Builder().baseUrl("https://run.mocky.io/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    @Singleton
    @Provides
    fun provideSignInClient(retrofit: Retrofit): SignInClient = retrofit.create(SignInClient::class.java)
}