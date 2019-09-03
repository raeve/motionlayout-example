package xyz.raeve.motionlayout_example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    configureList()
    configureHeader()
  }

  private fun configureList() {
    recyclerView.adapter = MainAdapter()
    recyclerView.layoutManager = LinearLayoutManager(this)
  }

  private fun configureHeader() {
    imageView.setImageDrawable(getDrawable(R.drawable.image_album))
    textView.text = getString(R.string.album_name)
    val albumOfArtist = "${getString(R.string.album_of)} ${getString(
      R.string.album_artist
    )}"
    textView2.text = albumOfArtist
  }
}

class MainAdapter : RecyclerView.Adapter<MainAdapter.SongViewHolder>() {

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongViewHolder =
    SongViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))

  override fun getItemCount(): Int = 20

  override fun onBindViewHolder(holder: SongViewHolder, position: Int) {

  }

  inner class SongViewHolder(view: View) : RecyclerView.ViewHolder(view)
}

