package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class o30 {

    /* renamed from: a, reason: collision with root package name */
    public final String f31157a;

    private o30(String str) {
        this.f31157a = str;
    }

    public static o30 a(uf1 uf1Var) {
        String str;
        uf1Var.f(2);
        int iT = uf1Var.t();
        int i = iT >> 1;
        int iT2 = ((uf1Var.t() >> 3) & 31) | ((iT & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iT2 >= 10 ? "." : ".0");
        sb.append(iT2);
        return new o30(sb.toString());
    }
}
