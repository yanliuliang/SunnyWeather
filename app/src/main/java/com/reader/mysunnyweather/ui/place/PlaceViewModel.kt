package com.reader.mysunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.reader.mysunnyweather.logic.Repository
import com.reader.mysunnyweather.logic.model.Place
import retrofit2.http.Query

class PlaceViewModel :ViewModel() {
    private val searchLiveDate=MutableLiveData<String>()
    val placeList =ArrayList<Place>()
    val placeLiveData=Transformations.switchMap(searchLiveDate){
        Repository.searchPlaces(it)
    }
    fun searchPlace(query: String){
        searchLiveDate.value=query
    }
    fun savePlace(place: Place)=Repository.savePlace(place)
    fun getSavePlace()=Repository.getSavePlace()
    fun isPlaceSaved()=Repository.isPlaceSaved()
}