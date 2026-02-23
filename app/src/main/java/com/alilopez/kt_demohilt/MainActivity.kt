package com.alilopez.kt_demohilt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.alilopez.kt_demohilt.core.navigation.NavigationNavGraph
import com.alilopez.kt_demohilt.core.navigation.NavigationWrapper
import com.alilopez.kt_demohilt.core.ui.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationGraphs: List<@JvmSuppressWildcards NavigationNavGraph>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            AppTheme {
                NavigationWrapper(navcGraphs = navigationGraphs)
            }
        }
    }
}

