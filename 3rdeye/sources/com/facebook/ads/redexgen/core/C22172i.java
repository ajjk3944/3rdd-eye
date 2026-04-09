package com.facebook.ads.redexgen.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.2i, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C22172i extends IOException {
    public int A00;
    public boolean A01;

    @Deprecated
    public C22172i() {
    }

    @Deprecated
    public C22172i(String str) {
        super(str);
    }

    public C22172i(String str, Throwable th, boolean z10, int i) {
        super(str, th);
        this.A01 = z10;
        this.A00 = i;
    }

    public static C22172i A00(String str) {
        return new C22172i(str, null, false, 1);
    }

    public static C22172i A01(String str, Throwable th) {
        return new C22172i(str, th, true, 1);
    }

    public static C22172i A02(String str, Throwable th) {
        return new C22172i(str, th, true, 0);
    }
}
