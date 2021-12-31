package com.github.cryptozee.data.offlineDatabase.dao

import androidx.room.*
import com.github.cryptozee.data.model.localStorage.WalletInfoEntity

@Dao
interface WalletInfoDao {
    @Insert
     fun addWalletDetail(walletInfoEntity: WalletInfoEntity)

    @Query("DELETE from wallet_info")
     fun deleteWalletDB()

    @Query("SELECT *  FROM wallet_info WHERE id = 1")
     fun getWalletDetail(): WalletInfoEntity

    @Query("UPDATE wallet_info SET Usable_Money = :usableMoney WHERE id = 1")
     fun updateWallet(usableMoney:String)
}