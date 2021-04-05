package tk.gabrielpaim.mycontacts

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

object ContactList {

    private val _contacts = MutableLiveData<List<Contact>>()

    val contacts: LiveData<List<Contact>>
        get() = _contacts

    fun addContact(contact: Contact) {
        val list = mutableListOf<Contact>()
        list.addAll(_contacts.value!!)
        list.add(contact)
        _contacts.value = list
    }

    fun editContact(index: Int, contact: Contact) {
        val list = mutableListOf<Contact>()
        list.addAll(_contacts.value!!)
        list.elementAt(index).apply {
            age = contact.age
            name = contact.name
            phoneNumber = contact.phoneNumber
        }
        _contacts.value = list
    }

    fun removeContact(index: Int) {
        val list = mutableListOf<Contact>()
        list.addAll(_contacts.value!!)
        list.removeAt(index)
        _contacts.value = list
    }
}