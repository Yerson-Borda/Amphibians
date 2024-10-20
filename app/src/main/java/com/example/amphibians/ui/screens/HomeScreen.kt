package com.example.amphibians.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.amphibians.R

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(dimensionResource(R.dimen.padding_medium))
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.Center

            ) {
                Image(
                    painter = painterResource(R.drawable.image_1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(dimensionResource(R.dimen.image_size))
                        .padding(horizontal = dimensionResource(R.dimen.padding_small))
                        .clip(MaterialTheme.shapes.large)
                )
                Text(
                    text = stringResource(R.string.amphibians_description),
                    style = MaterialTheme.typography.bodyMedium
                )
            }

            Text(
                text = stringResource(R.string.long_description),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
            )

            Text(
                text = stringResource(R.string.subtitle),
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(top = dimensionResource(R.dimen.padding_small))
            )

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(R.string.curiosities),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.weight(1f)
                )
                Image(
                    painter = painterResource(R.drawable.image_2),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(dimensionResource(R.dimen.image_size))
                        .padding(horizontal = dimensionResource(R.dimen.padding_small))
                        .clip(MaterialTheme.shapes.large)
                        .weight(1f)
                )
            }
        }

        OutlinedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(stringResource(R.string.know_them))
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}