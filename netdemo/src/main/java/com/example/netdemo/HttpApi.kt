package com.example.netdemo

interface HttpApi {
    /**
     * 抽象的http的get请求封装，异步
     */
    fun get(params: Map<String, Any>, path: String, callback: IHttpCallback) {}

    /**
     * 同步的get请求
     * 当接口方法有实现体的话，实现类就可以不必实现该方法
     */
    fun getSync(params: Map<String, Any>, path: String): Any? {
        return Any()
    }


    /**
     * 异步的post请求
     */
    fun post(body: Any, path: String, callback: IHttpCallback) {}

    /**
     *
     */
    fun postSync(body: Any, path: String): Any? = Any()
}