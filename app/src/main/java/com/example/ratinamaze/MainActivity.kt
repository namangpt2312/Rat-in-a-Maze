package com.example.ratinamaze

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var board: Array<Array<Button>>
    var maze = Array(6) {IntArray(6)}
    var path = ArrayList<Button>()
    var finalPath = ArrayList<Button>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        board = arrayOf(
            arrayOf(button1, button2, button3, button4, button5, button6),
            arrayOf(button7, button8, button9, button10, button11, button12),
            arrayOf(button13, button14, button15, button16, button17, button18),
            arrayOf(button19, button20, button21, button22, button23, button24),
            arrayOf(button25, button26, button27, button28, button29, button30),
            arrayOf(button31, button32, button33, button34, button35, button36),
        )

        for(i in board) {
            for(button in i)
                button.setOnClickListener(this)
        }

        initializeMaze()

        reset.setOnClickListener {
            initializeMaze()
        }
    }

    private fun initializeMaze() {
        for(i in 0..5) {
            for(j in 0..5) {
                maze[i][j] = 0
            }
        }

        helper()
    }

    private fun helper() {
        var visited = Array(6) {IntArray(6)}
        finalPath.clear()

        for(i in 0..5) {
            for(j in 0..5) {
                visited[i][j] = 0
                board[i][j].setBackgroundColor(resources.getColor(R.color.gray))

                if(maze[i][j] == 1)
                    board[i][j].setBackgroundColor(resources.getColor(R.color.red))
            }
        }

        if(solve(0, 0, visited)) {
            player.text = "The rat reached the destination with a minimum of ${finalPath.size} steps. Try creating different paths to see if the little guy is smart enough to escape again."
            cheer.text = "Yayy, the rat can escape!!"

            for(btn in finalPath) {
                btn.setBackgroundColor(resources.getColor(R.color.orange))
            }

//            Toast.makeText(this, "${finalPath.size}", Toast.LENGTH_SHORT).show()
        }
        else {
            cheer.text = "Boo, the rat is trapped!!"
            player.text = "Oh no! Looks like the rat is unable to reach the destination. Try to create another path for the little guy to escape."
        }
    }

    override fun onClick(view: View) {
        when(view.id) {
            R.id.button1 -> {
                maze[0][0] = 1 xor maze[0][0]
                helper()
            }
            R.id.button2 -> {
                maze[0][1] = 1 xor maze[0][1]
                helper()
            }
            R.id.button3 -> {
                maze[0][2] = 1 xor maze[0][2]
                helper()
            }
            R.id.button4 -> {
                maze[0][3] = 1 xor maze[0][3]
                helper()
            }
            R.id.button5 -> {
                maze[0][4] = 1 xor maze[0][4]
                helper()
            }
            R.id.button6 -> {
                maze[0][5] = 1 xor maze[0][5]
                helper()
            }
            R.id.button7 -> {
                maze[1][0] = 1 xor maze[1][0]
                helper()
            }
            R.id.button8 -> {
                maze[1][1] = 1 xor maze[1][1]
                helper()
            }
            R.id.button9 -> {
                maze[1][2] = 1 xor maze[1][2]
                helper()
            }
            R.id.button10 -> {
                maze[1][3] = 1 xor maze[1][3]
                helper()
            }
            R.id.button11 -> {
                maze[1][4] = 1 xor maze[1][4]
                helper()
            }
            R.id.button12 -> {
                maze[1][5] = 1 xor maze[1][5]
                helper()
            }
            R.id.button13 -> {
                maze[2][0] = 1 xor maze[2][0]
                helper()
            }
            R.id.button14 -> {
                maze[2][1] = 1 xor maze[2][1]
                helper()
            }
            R.id.button15 -> {
                maze[2][2] = 1 xor maze[2][2]
                helper()
            }
            R.id.button16 -> {
                maze[2][3] = 1 xor maze[2][3]
                helper()
            }
            R.id.button17 -> {
                maze[2][4] = 1 xor maze[2][4]
                helper()
            }
            R.id.button18 -> {
                maze[2][5] = 1 xor maze[2][5]
                helper()
            }
            R.id.button19 -> {
                maze[3][0] = 1 xor maze[3][0]
                helper()
            }
            R.id.button20 -> {
                maze[3][1] = 1 xor maze[3][1]
                helper()
            }
            R.id.button21 -> {
                maze[3][2] = 1 xor maze[3][2]
                helper()
            }
            R.id.button22 -> {
                maze[3][3] = 1 xor maze[3][3]
                helper()
            }
            R.id.button23 -> {
                maze[3][4] = 1 xor maze[3][4]
                helper()
            }
            R.id.button24 -> {
                maze[3][5] = 1 xor maze[3][5]
                helper()
            }
            R.id.button25 -> {
                maze[4][0] = 1 xor maze[4][0]
                helper()
            }
            R.id.button26 -> {
                maze[4][1] = 1 xor maze[4][1]
                helper()
            }
            R.id.button27 -> {
                maze[4][2] = 1 xor maze[4][2]
                helper()
            }
            R.id.button28 -> {
                maze[4][3] = 1 xor maze[4][3]
                helper()
            }
            R.id.button29 -> {
                maze[4][4] = 1 xor maze[4][4]
                helper()
            }
            R.id.button30 -> {
                maze[4][5] = 1 xor maze[4][5]
                helper()
            }
            R.id.button31 -> {
                maze[5][0] = 1 xor maze[5][0]
                helper()
            }
            R.id.button32 -> {
                maze[5][1] = 1 xor maze[5][1]
                helper()
            }
            R.id.button33 -> {
                maze[5][2] = 1 xor maze[5][2]
                helper()
            }
            R.id.button34 -> {
                maze[5][3] = 1 xor maze[5][3]
                helper()
            }
            R.id.button35 -> {
                maze[5][4] = 1 xor maze[5][4]
                helper()
            }
            R.id.button36 -> {
                maze[5][5] = 1 xor maze[5][5]
                helper()
            }
        }
    }

    private fun solve(row: Int, col: Int, visited: Array<IntArray>) : Boolean {
        if(row < 0 || col < 0 || row == 6 || col == 6 || maze[row][col] == 1 || visited[row][col] == 1)
            return false

        visited[row][col] = 1
        path.add(board[row][col])

        if(row == 5 && col == 5) {
            if(finalPath.isEmpty() || finalPath.size > path.size) {
                finalPath.clear()
                finalPath.addAll(path)
            }

            path.removeLast()
            visited[row][col] = 0
            return true
        }

        var ans = false

        if(solve(row + 1, col, visited))
            ans = true
        if(solve(row - 1, col, visited))
            ans = true
        if(solve(row, col + 1, visited))
            ans = true
        if(solve(row, col - 1, visited))
            ans = true

        path.removeLast()
        visited[row][col] = 0

        return ans
    }
}