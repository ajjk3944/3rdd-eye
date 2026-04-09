package com.google.android.gms.internal.ads;

import java.io.IOException;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public class P4 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10323a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10324b;

    public P4(String str, Throwable th, boolean z6, int i) {
        super(str, th);
        this.f10323a = z6;
        this.f10324b = i;
    }

    public static P4 a(RuntimeException runtimeException, String str) {
        return new P4(str, runtimeException, true, 1);
    }

    public static P4 b(String str) {
        return new P4(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        String strConcat = message != null ? message.concat(" ") : "";
        int length = strConcat.length();
        boolean z6 = this.f10323a;
        int length2 = String.valueOf(z6).length() + length + 20;
        int i = this.f10324b;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + length2 + 11 + 1);
        sb.append(strConcat);
        sb.append("{contentIsMalformed=");
        sb.append(z6);
        sb.append(", dataType=");
        return AbstractC2763b.d(i, "}", sb);
    }
}
