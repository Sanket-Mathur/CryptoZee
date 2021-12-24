package com.github.cryptozee.data.api

import com.github.cryptozee.data.model.api.singleCoinResponse.SingleCoinChartResponse
import com.github.cryptozee.utils.CONSTANTS.Companion.SINGLE_COIN_CHART_SUFFIX
import com.github.cryptozee.utils.CONSTANTS.Companion.SINGLE_COIN_URL_DETAIL_PREFIX

object AllChartApiRequest {
    suspend fun getAllCoinChart(coinId: String): ArrayList<SingleCoinChartResponse> {
        val response = ArrayList<SingleCoinChartResponse>(0)
        val retrofitInstance = RetrofitInstance.responseAllApi
        val oneDayData = retrofitInstance.getSingleCoinMarketChart(
            SINGLE_COIN_URL_DETAIL_PREFIX + coinId + SINGLE_COIN_CHART_SUFFIX + "1"
        )
        val oneWeekData = retrofitInstance.getSingleCoinMarketChart(
            SINGLE_COIN_URL_DETAIL_PREFIX + coinId + SINGLE_COIN_CHART_SUFFIX + "7"
        )
        val oneMonthData = retrofitInstance.getSingleCoinMarketChart(
            SINGLE_COIN_URL_DETAIL_PREFIX + coinId + SINGLE_COIN_CHART_SUFFIX + "30"
        )
        val oneDayYear = retrofitInstance.getSingleCoinMarketChart(
            SINGLE_COIN_URL_DETAIL_PREFIX + coinId + SINGLE_COIN_CHART_SUFFIX + "365"
        )
        val maxData = retrofitInstance.getSingleCoinMarketChart(
            SINGLE_COIN_URL_DETAIL_PREFIX + coinId + SINGLE_COIN_CHART_SUFFIX + "max"
        )
        response.addAll(arrayListOf(oneDayData, oneWeekData, oneMonthData,oneDayYear, maxData))
        return response
    }
}