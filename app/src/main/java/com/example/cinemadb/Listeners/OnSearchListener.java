package com.example.cinemadb.Listeners;

import com.example.cinemadb.Models.SearchApiResponse;

public interface OnSearchListener {
    void onResponse(SearchApiResponse response);
    void onError(String message);
}
