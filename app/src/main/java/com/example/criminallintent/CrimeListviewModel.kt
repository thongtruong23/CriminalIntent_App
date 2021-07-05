package com.example.criminallintent

import androidx.lifecycle.ViewModel

class CrimeListviewModel : ViewModel() {
    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()

    fun addCrime(crime: Crime){
        crimeRepository.addCrime(crime)
    }
}