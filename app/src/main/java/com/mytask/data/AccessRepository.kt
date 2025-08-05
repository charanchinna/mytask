package com.mytask.data


import com.mytask.data.model.UserAccessData

class AccessRepository {

    fun getUserAccessData(): UserAccessData {
        return DummyDataProvider.getDummyUserAccessData()
    }

}
