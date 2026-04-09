package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class MA implements RA {

    /* renamed from: a, reason: collision with root package name */
    public final char f9812a;

    public MA(char c6) {
        this.f9812a = c6;
    }

    public final boolean a(char c6) {
        return c6 == this.f9812a;
    }

    @Override // com.google.android.gms.internal.ads.RA
    public final /* synthetic */ boolean b(Object obj) {
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
        int i = this.f9812a;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return AbstractC1135f5.n(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
    }
}
