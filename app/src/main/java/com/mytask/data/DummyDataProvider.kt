package com.mytask.data



import com.mytask.data.model.Module
import com.mytask.data.model.User
import com.mytask.data.model.UserAccessData

object DummyDataProvider {

    fun getDummyUser(): User {
        return User(
            userType = "active",
            coolingStartTime = "2025-07-16T13:55:00Z",
            coolingEndTime = "2025-06-16T14:00:00Z",
            accessibleModules = listOf("payments", "account_info")
        )
    }

    fun getDummyModules(): List<Module> {
        return listOf(
            Module(id = "payments", title = "Payments", requiresConsent = true),
            Module(id = "account_info", title = "Account Info", requiresConsent = false),
            Module(id = "consent_center", title = "Consent Center", requiresConsent = true)
        )
    }

    fun getDummyUserAccessData(): UserAccessData {
        return UserAccessData(getDummyUser(), getDummyModules())
    }
}
