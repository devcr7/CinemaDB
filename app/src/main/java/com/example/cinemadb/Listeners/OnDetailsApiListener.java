package com.example.cinemadb.Listeners;

import com.example.cinemadb.Models.DetailApiResponse;

public interface OnDetailsApiListener {
    void onResponse(DetailApiResponse response);
    void onError(String message);
}
