package tk.gabrielpaim.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tk.gabrielpaim.mycontacts.ContactList.contacts
import tk.gabrielpaim.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        binding.contactList = ContactList
    }


}