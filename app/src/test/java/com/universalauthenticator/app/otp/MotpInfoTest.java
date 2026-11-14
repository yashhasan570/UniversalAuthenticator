package com.universalauthenticator.app.otp;

import static org.junit.Assert.assertEquals;

import com.universalauthenticator.app.crypto.otp.MOTPTest;
import com.universalauthenticator.app.encoding.EncodingException;
import com.universalauthenticator.app.encoding.Hex;

import org.junit.Test;

public class MotpInfoTest {
    @Test
    public void testMotpInfoOtp() throws OtpInfoException, EncodingException {
        for (MOTPTest.Vector vector : MOTPTest.VECTORS) {
            MotpInfo info = new MotpInfo(Hex.decode(vector.Secret), vector.Pin);
            assertEquals(vector.OTP, info.getOtp(vector.Time));
        }
    }
}
