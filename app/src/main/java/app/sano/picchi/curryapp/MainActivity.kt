package app.sano.picchi.curryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val people = arrayListOf<String>("アンディ","スヌーピー","ウッドストック","マーベル")
    val food = arrayListOf<String>("家","公園","学校","庭")
    val result = arrayListOf<String>("飛べた","飛べなかった")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun savedfood(view: View?){
        val randomName = Random
        val index = randomName.nextInt(4)
        val name = people[index]
        nameText.text = name + "は"
        curryText.text = food[Random.nextInt(4)] + "で"
        resultText.text = result[Random.nextInt(2)]
        

    }
}
