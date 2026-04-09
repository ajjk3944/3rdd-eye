package com.google.android.exoplayer2;

import java.io.IOException;

/* loaded from: classes.dex */
public class y0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4791a;

    /* renamed from: d, reason: collision with root package name */
    public final int f4792d;

    public y0(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f4791a = z10;
        this.f4792d = i10;
    }

    public static y0 a(RuntimeException runtimeException, String str) {
        return new y0(str, runtimeException, true, 1);
    }

    public static y0 b(Exception exc, String str) {
        return new y0(str, exc, true, 4);
    }

    public static y0 c(String str) {
        return new y0(str, null, false, 1);
    }
}
