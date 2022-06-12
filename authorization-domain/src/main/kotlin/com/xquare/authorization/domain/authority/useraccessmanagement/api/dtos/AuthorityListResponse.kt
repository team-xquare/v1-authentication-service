package com.xquare.authorization.domain.authority.useraccessmanagement.api.dtos

import java.util.UUID

data class AuthorityListResponse(
    val authorityList: List<AuthorityResponse>
)

data class AuthorityResponse(
    val authorityId: UUID,
    val authorityName: String,
    val description: String
)
