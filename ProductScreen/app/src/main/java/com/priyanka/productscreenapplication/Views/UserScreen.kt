package com.priyanka.productscreenapplication.Views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.priyanka.productscreenapplication.Model.Data.User
import com.priyanka.productscreenapplication.ViewModels.UserViewModel

@Composable
fun UserScreen(userVm: UserViewModel){
    val users by userVm.users.observeAsState(emptyList())
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ){
        items(users){
            UserItem(user = it)
        }
    }
}

@Composable
fun UserItem(user: User) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = user.username)
            Text(text = "${user.id}")
            Text(text = user.email)
            Text(text = user.password)
            Text(text = user.name.firstname)
            Text(text = user.name.lastname)

        }
    }
}
