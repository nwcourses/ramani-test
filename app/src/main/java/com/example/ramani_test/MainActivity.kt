package com.example.ramani_test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.ramani_test.ui.theme.RamanitestTheme
import org.maplibre.android.geometry.LatLng
import org.maplibre.android.maps.Style
import org.ramani.compose.MapLibre
import org.ramani.compose.CameraPosition

// See https://www.youtube.com/watch?v=GI4rs9SDgX8 for more detail
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RamanitestTheme {
                MapLibre(
                    modifier=Modifier.fillMaxSize(),
                    styleBuilder= Style.Builder().fromUri("https://tiles.openfreemap.org/styles/bright"),
                    cameraPosition = CameraPosition(target  = LatLng(51.05, -0.72), zoom = 14.0)
                )
            }
        }
    }
}
