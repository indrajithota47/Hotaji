package com.example.hotaji

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(android.R.layout.simple_list_item_1)
    }
}
package com.example.hotaji

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // होम स्क्रीन के बटन पर क्लिक करने पर Agents वाली स्क्रीन खुलेगी
        val exploreButton = findViewById<Button>(R.id.exploreButton)
        exploreButton.setOnClickListener {
            val intent = Intent(this, AgentsActivity::class.java)
            startActivity(intent)
        }
    }
}

