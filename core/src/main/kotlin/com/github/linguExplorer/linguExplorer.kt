package com.github.linguExplorer

import com.badlogic.gdx.Game
import com.github.linguExplorer.screen.GameScreen
import com.github.linguExplorer.screen.MainMenuScreen

class linguExplorer : Game() {
    override fun create() {
        this.screen = MainMenuScreen()
        //this.screen = GameScreen() // Setzt den GameScreen
    }
}