package com.lennyrbriones.onboardingapp.onBoardViews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.lennyrbriones.onboardingapp.R
import com.lennyrbriones.onboardingapp.data.PageData

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainOnboarding() {
    val items = ArrayList<PageData>()

    items.add(
        PageData(
            R.raw.page1,
            "Title 1",
            "Welcome, this is the page 1"
        )
    )

    items.add(
        PageData(
            R.raw.page2,
            "Title 2",
            "This is the page 2"
        )
    )

    items.add(
        PageData(
            R.raw.page3,
            "Title 3",
            "This is the page 3"
        )
    )

    val pagerState = rememberPagerState(
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0
    )

    OnBoardingPager(
        item = items, pagerState = pagerState, modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White)
    )
}