package com.universalauthenticator.app.otp;

import android.net.Uri;

public interface Transferable {
    Uri getUri() throws GoogleAuthInfoException;
}
