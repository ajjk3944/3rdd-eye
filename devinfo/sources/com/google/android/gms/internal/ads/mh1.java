package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class mh1 extends x91 {

    /* renamed from: b, reason: collision with root package name */
    public final int f13895b;

    public mh1() {
        this.f13895b = 1;
    }

    public static mh1 a(IOException iOException, int i4) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? AdError.CACHE_ERROR_CODE : iOException instanceof InterruptedIOException ? TTAdConstant.IMAGE_MODE_CAROUSEL_IMG : (message == null || !mq0.h(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new pg1("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new mh1(iOException, i10, i4);
    }

    public mh1(IOException iOException, int i4, int i10) {
        super(i4 == 2000 ? i10 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i4, iOException);
        this.f13895b = i10;
    }

    public mh1(String str, int i4, int i10) {
        super(str, i4 == 2000 ? i10 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i4);
        this.f13895b = i10;
    }

    public mh1(String str, IOException iOException, int i4, int i10) {
        super(str, iOException, i4 == 2000 ? i10 != 1 ? 2000 : AdError.INTERNAL_ERROR_CODE : i4);
        this.f13895b = i10;
    }
}
