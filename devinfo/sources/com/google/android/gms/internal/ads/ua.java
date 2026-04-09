package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ua extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17132a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17133b;

    public ua(boolean z3, int i4, String str, Throwable th2) {
        super(str, th2);
        this.f17132a = z3;
        this.f17133b = i4;
    }

    public static ua a(RuntimeException runtimeException, String str) {
        return new ua(true, 1, str, runtimeException);
    }

    public static ua b(String str) {
        return new ua(false, 1, str, null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        int length = strConcat.length();
        boolean z3 = this.f17132a;
        int length2 = String.valueOf(z3).length() + length + 20;
        int i4 = this.f17133b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + length2 + 11 + 1);
        sb2.append(strConcat);
        sb2.append("{contentIsMalformed=");
        sb2.append(z3);
        sb2.append(", dataType=");
        return r5.c.j(i4, "}", sb2);
    }
}
