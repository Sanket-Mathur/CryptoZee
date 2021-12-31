package com.github.cryptozee.data.offlineDatabase.dao

import androidx.room.*
import com.github.cryptozee.data.model.localStorage.WalletCoinEntity

@Dao
interface WalletCoinDao {

    // Inserting New Coin
    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun addCoinToWallet( walletCoinEntity: WalletCoinEntity)

    //Removing the Coin
    @Delete
     fun removeCoin(walletCoinEntity: WalletCoinEntity)

    // Getting if Coin is Present
    @Query("SELECT * FROM  wallet_Coins WHERE coin_Id= :coinId")
     fun getCoinDetail(coinId:String): WalletCoinEntity

    // Getting All the Wallet Coins
    @Query("SELECT * FROM wallet_Coins ORDER BY quantity DESC")
    fun walletCoin():List<WalletCoinEntity>

    // Updating the Coin Value
    @Query("UPDATE wallet_Coins SET quantity  = :quantity WHERE coin_Id = :coinId ")
     fun updateCoin(quantity:Double , coinId :String)

}