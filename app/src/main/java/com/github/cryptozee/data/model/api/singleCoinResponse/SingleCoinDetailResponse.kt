package com.github.cryptozee.data.model.api.singleCoinResponse


import com.github.cryptozee.data.model.api.singleCoinResponse.ImageLink
import com.github.cryptozee.data.model.api.singleCoinResponse.Links
import com.github.cryptozee.data.model.api.singleCoinResponse.MarketData
import com.google.gson.annotations.SerializedName

data class SingleCoinDetailResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("coingecko_rank")
    val rank:Int,
    @SerializedName("links")
    val links: Links,
    @SerializedName("market_data")
    val marketData: MarketData,
    @SerializedName("name")
    val name: String,
    @SerializedName("symbol")
    val symbol: String,
    @SerializedName("image")
    val imageLink: ImageLink
)