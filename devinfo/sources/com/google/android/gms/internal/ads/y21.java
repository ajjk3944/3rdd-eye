package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y21 implements d31 {

    /* renamed from: a, reason: collision with root package name */
    public final char f18614a;

    public y21(char c9) {
        this.f18614a = c9;
    }

    public final boolean a(char c9) {
        return c9 == this.f18614a;
    }

    @Override // com.google.android.gms.internal.ads.d31
    public final /* synthetic */ boolean c(Object obj) {
        return a(((Character) obj).charValue());
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i4 = this.f18614a;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(i4 & 15);
            i4 >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return r5.c.m(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
    }
}
