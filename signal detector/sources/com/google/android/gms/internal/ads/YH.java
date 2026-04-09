package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class YH extends C1359jE {

    /* renamed from: b, reason: collision with root package name */
    public final int f12623b;

    public YH() {
        this.f12623b = 1;
    }

    public static YH a(IOException iOException, int i) {
        String message = iOException.getMessage();
        int i3 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !AbstractC0582Jp.h(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i3 == 2007 ? new BH("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007, 1) : new YH(iOException, i3, i);
    }

    public YH(IOException iOException, int i, int i3) {
        super(iOException, i == 2000 ? i3 != 1 ? 2000 : 2001 : i);
        this.f12623b = i3;
    }

    public YH(String str, int i, int i3) {
        super(str, i == 2000 ? i3 != 1 ? 2000 : 2001 : i);
        this.f12623b = i3;
    }

    public YH(String str, IOException iOException, int i, int i3) {
        super(str, iOException, i == 2000 ? i3 != 1 ? 2000 : 2001 : i);
        this.f12623b = i3;
    }
}
