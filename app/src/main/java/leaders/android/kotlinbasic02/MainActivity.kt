package leaders.android.kotlinbasic02

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import leaders.android.kotlinbasic02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 変数宣言
        var count: Int = 0
        binding.countText.text = count.toString()

        // プラスボタンをクリックした時の処理
        binding.plusButton.setOnClickListener {
            count = count + 1
            binding.countText.text = count.toString()
        }

        binding.minusButton.setOnClickListener {
            count -= 1
            binding.countText.text = count.toString()
        }

        binding.clearButton.setOnClickListener {
            count = 0
            binding.countText.text = count.toString()
        }
    }
}
