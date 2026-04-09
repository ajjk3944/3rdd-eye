package io.appmetrica.analytics.impl;

import com.singular.sdk.internal.Constants;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: io.appmetrica.analytics.impl.qj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4903qj {
    public static byte[] a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes(Constants.ENCODING));
        return messageDigest.digest();
    }
}
