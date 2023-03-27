package com.brainjug.roomwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.brainjug.roomwithcompose.database.ContactDatabase
import com.brainjug.roomwithcompose.ui.theme.RoomWithComposeTheme
import com.brainjug.roomwithcompose.viewModel.AddPickupAddressViewModel
import com.brainjug.roomwithcompose.viewModel.ContactEventViewModel

class MainActivity : ComponentActivity() {

    private val db by lazy {
        Room.databaseBuilder(
            applicationContext,
            ContactDatabase::class.java,
            "contacts.db"
        ).build()
    }

    private val viewModel by viewModels<ContactEventViewModel>(
        factoryProducer = {
            object : ViewModelProvider.Factory{
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return ContactEventViewModel(db.dao) as T
                }
            }
        }
    )

    private val viewModelAddress by viewModels<AddPickupAddressViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoomWithComposeTheme {
                val state by viewModel.state.collectAsState()
//               ContactScreen(state = state, onEvent = viewModel::onEvent)

//                val stateAddress by viewModelAddress.pickupAddress
                AddPickupAddress()
            }
        }
    }
}