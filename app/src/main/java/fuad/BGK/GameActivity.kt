package fuad.BGK

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.ComponentActivity

class GameActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_layout)

        initComponents()
        initListener()
    }

    lateinit var computerImageView: ImageView
    lateinit var rockImageButton: ImageButton
    lateinit var paperImageButton: ImageButton
    lateinit var scissorsImageButton: ImageButton
    lateinit var resultImageView: ImageView

    fun gameStart(option: String){
        val computerOption = Game.pickRandomOption()
        computerImageView.setImageResource(Game.pickDrawable(computerOption))
        when{
            Game.isDraw(option, computerOption) -> resultImageView.setImageResource(R.drawable.draw)
            Game.isWin(option, computerOption) -> resultImageView.setImageResource(R.drawable.win)
            else -> resultImageView.setImageResource(R.drawable.lose)
        }
    }

    fun initComponents(){
        computerImageView = findViewById(R.id.computerImageView)
        rockImageButton = findViewById(R.id.rockImageButton)
        paperImageButton = findViewById(R.id.paperImageButton)
        scissorsImageButton = findViewById(R.id.scissorsImageButton)
        resultImageView = findViewById(R.id.resultImageView)
    }

    fun initListener(){
        rockImageButton.setOnClickListener { gameStart("ROCK") }
        paperImageButton.setOnClickListener { gameStart("PAPER") }
        scissorsImageButton.setOnClickListener { gameStart("SCISSORS") }
    }
}