package com.mcma.callbacks;

import com.mcma.utils.NetworkError;

import okhttp3.ResponseBody;

/**
 * Created by anil on 2/6/2017.
 */

public interface UpdateContactCallback {
    void onSuccess(retrofit2.Response<ResponseBody> response);

    void onError(NetworkError networkError);
}
