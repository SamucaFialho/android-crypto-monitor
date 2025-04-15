package samucafialho.github.com.android_crypto_monitor.service

import retrofit2.Response
import retrofit2.http.GET
import samucafialho.github.com.android_crypto_monitor.model.TickerResponse

interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>

}
