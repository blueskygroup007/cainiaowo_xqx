package com.example.netdemo

interface IHttpCallback {
    /**
     * [data]
     * @param data 返回毁掉的数据结果
     */
    fun onSuccess(data: Any)
    fun onFailed(data: Any)
}