package com.example.netdemo

import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

class OkHttpApi : HttpApi {

    companion object {
        private const val TAG = "OkHttpApi"//Tag
    }

    private var baseUrl = "http://api.qingyunke.com/"

    private val mClient: OkHttpClient = OkHttpClient.Builder()
        .callTimeout(10, TimeUnit.SECONDS)
        .connectTimeout(10, TimeUnit.SECONDS)
        .readTimeout(10, TimeUnit.SECONDS)
        .writeTimeout(10, TimeUnit.SECONDS)
        .retryOnConnectionFailure(true)
        .followRedirects(false)
        .build()

    override fun get(params: Map<String, Any>, path: String, callback: IHttpCallback) {
        val url = "$baseUrl$path"
        val urlBuilder = HttpUrl.Builder()
        params.forEach { entry ->
            urlBuilder.addEncodedQueryParameter(entry.key, entry.value.toString())
        }
    }

    override fun post(body: Any, path: String, callback: IHttpCallback) {
        super.post(body, path, callback)
    }
}