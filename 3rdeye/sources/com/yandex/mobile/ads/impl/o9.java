package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class o9 {

    /* renamed from: a, reason: collision with root package name */
    private String f31298a;

    public final String a() {
        return this.f31298a;
    }

    public final void a(String str) {
        if (str == null || y9.q.i0(str)) {
            uo0.c("Ad Unit Id can't be null or empty.", new Object[0]);
            return;
        }
        String str2 = this.f31298a;
        if (str2 == null || str2.equals(str)) {
            this.f31298a = str;
        } else {
            uo0.c("Ad Unit Id can't be set twice.", new Object[0]);
        }
    }
}
