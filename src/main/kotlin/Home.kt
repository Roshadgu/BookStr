import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomePage()
{
  //8 rows 5 columns
  Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.End) //Row 1
  {
    Column { //Column 1
      Modifier.padding(10.dp)
      Text("Yaoi", fontSize = 20.sp)
      Image(
        painter = painterResource("yaoi.jpeg"),
        contentDescription = "The Demon Wants to Be a Good boy",
        modifier = Modifier.width(200.dp).height(400.dp).padding(top = 1.dp)
      )
    }

    Column { //Column 2
      Text("Action", fontSize = 20.sp)
      Image(
        painter = painterResource("Action.png"),
        contentDescription = "The Demon Wants to Be a Good boy",
        modifier = Modifier.width(200.dp).height(400.dp).padding(top = 1.dp)
      )
    }

    Column { //Column 3
      Text("Adventure", fontSize = 20.sp)
      Image(
        painter = painterResource("Adventure.jpeg"),
        contentDescription = "The Demon Wants to Be a Good boy",
        modifier = Modifier.width(200.dp).height(600.dp).padding(top = 1.dp)
      )
    }

    Column { //Column 4
      Text("Comedy", fontSize = 20.sp)
      Image(
        painter = painterResource("Comedy.jpeg"),
        contentDescription = "The Demon Wants to Be a Good boy",
        modifier = Modifier.width(200.dp).height(400.dp).padding(top = 1.dp)
      )
    }

    Column { //Column 5
      Text("Fantasy", fontSize = 20.sp)
      Image(
        painter = painterResource("Fantasy.jpeg"),
        contentDescription = "The Demon Wants to Be a Good boy",
        modifier = Modifier.width(200.dp).height(400.dp).padding(top = 1.dp)
      )
    }

    Column { //Column 5
      Text("Sci-Fi", fontSize = 20.sp)
      Image(
        painter = painterResource("Sci-Fi.jpeg"),
        contentDescription = "The Demon Wants to Be a Good boy",
        modifier = Modifier.width(200.dp).height(400.dp).padding(top = 1.dp)
      )
    }

    Column { //Column 5
      Text("Horror", fontSize = 20.sp)
      Image(
        painter = painterResource("Horro.jpeg"),
        contentDescription = "The Demon Wants to Be a Good boy",
        modifier = Modifier.width(200.dp).height(400.dp).padding(top = 1.dp)
      )
    }

    Column { //Column 5
      Text("Drama", fontSize = 20.sp)
      Image(
        painter = painterResource("Drama.jpeg"),
        contentDescription = "The Demon Wants to Be a Good boy",
        modifier = Modifier.width(200.dp).height(400.dp).padding(top = 1.dp)
      )
    }

    Column { //Column 5
      Text("Supernatural", fontSize = 20.sp)
      Image(
        painter = painterResource("Supernatural.jpeg"),
        contentDescription = "The Demon Wants to Be a Good boy",
        modifier = Modifier.width(200.dp).height(400.dp).padding(top = 1.dp)
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


