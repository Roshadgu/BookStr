import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

class Home
{

}

@Composable
fun HomePage()
{
  //8 rows 5 columns
  Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.End) //Row 1
  {
    Column { //Column 1
      Text("Yaoi")
      Image(
        painterResource("the-demon-wants-to-be-a-good-boy-yaoi-manga.jpeg"),
        contentDescription = "Yaoi",
        modifier = Modifier.fillMaxSize()
      )
    }
    Column { //Column 2
      Text("Doujinshi")
      Image(
        painterResource("the-demon-wants-to-be-a-good-boy-yaoi-manga.jpeg"),
        contentDescription = "Doujinshi",
        modifier = Modifier.fillMaxSize()
      )
    }
    Column { //Column 3
      Text("Shounen Ai")
      Image(
        painterResource("the-demon-wants-to-be-a-good-boy-yaoi-manga.jpeg"),
        contentDescription = "Shounen Ai",
        modifier = Modifier.fillMaxSize()
      )
    }
    Column { //Column 4
      Text("Shoujo")
      Image(
        painterResource("the-demon-wants-to-be-a-good-boy-yaoi-manga.jpeg"),
        contentDescription = "Shoujo",
        modifier = Modifier.fillMaxSize()
      )
    }
    Column { //Column 5
      Text("Yuri")
      Image(
        painterResource("the-demon-wants-to-be-a-good-boy-yaoi-manga.jpeg"),
        contentDescription = "Yuri",
        modifier = Modifier.fillMaxSize()
      )
    }
  }
}

@Preview
@Composable
fun PreviewHomePage()
{
  HomePage()
}


