package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class La extends O2 {
    public La(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.O2, io.appmetrica.analytics.impl.Ma
    public final Gn a(String str) {
        int length = 0;
        if (str != null) {
            int length2 = str.length();
            int i = this.f39918a;
            if (length2 > i) {
                String strSubstring = str.substring(0, i);
                length = str.getBytes().length - strSubstring.getBytes().length;
                str = strSubstring;
            }
        }
        return new Gn(str, new C5039w3(length));
    }
}
