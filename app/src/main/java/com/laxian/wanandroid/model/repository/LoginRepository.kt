package com.laxian.wanandroid.model.repository

import com.laxian.wanandroid.model.api.HttpClient
import com.laxian.wanandroid.model.api.Result
import com.laxian.wanandroid.model.bean.User

class LoginRepository : IRepository {
    suspend fun login(username: String, password: String): Result<User> {
        return successOrThrow(
            HttpClient.service.login(username, password)
                .await()
        )
    }
}