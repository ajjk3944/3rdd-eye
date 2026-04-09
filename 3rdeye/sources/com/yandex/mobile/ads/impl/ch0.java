package com.yandex.mobile.ads.impl;

import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class ch0 extends pv {

    /* renamed from: d, reason: collision with root package name */
    public final int f25651d;

    public ch0(int i) {
        super(a(i, 1));
        this.f25651d = 1;
    }

    private static int a(int i, int i10) {
        if (i == 2000 && i10 == 1) {
            return 2001;
        }
        return i;
    }

    public static ch0 a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : (message == null || !xf.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new bh0(iOException) : new ch0(iOException, i10, i);
    }

    public ch0(IOException iOException, int i, int i10) {
        super(iOException, a(i, i10));
        this.f25651d = i10;
    }

    public ch0(String str, int i) {
        super(a(i, 1), str);
        this.f25651d = 1;
    }

    public ch0(String str, IOException iOException, int i) {
        super(a(i, 1), str, iOException);
        this.f25651d = 1;
    }
}
