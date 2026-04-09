package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.3K, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C3K extends IOException {
    public int A00;
    public boolean A01;

    @Deprecated
    public C3K() {
    }

    @Deprecated
    public C3K(String str) {
        super(str);
    }

    public C3K(String str, Throwable th2, boolean z3, int i4) {
        super(str, th2);
        this.A01 = z3;
        this.A00 = i4;
    }

    public static C3K A00(String str) {
        return new C3K(str, null, false, 1);
    }

    public static C3K A01(String str, Throwable th2) {
        return new C3K(str, th2, true, 1);
    }

    public static C3K A02(String str, Throwable th2) {
        return new C3K(str, th2, true, 0);
    }
}
