package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class G1 {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC4866h4 f35875a;

    G1(EnumC4866h4 enumC4866h4) {
        this.f35875a = enumC4866h4;
    }

    static G1 a(String str) {
        return new G1((TextUtils.isEmpty(str) || str.length() > 1) ? EnumC4866h4.UNINITIALIZED : C4839e4.g(str.charAt(0)));
    }

    final EnumC4866h4 b() {
        return this.f35875a;
    }

    final String c() {
        return String.valueOf(C4839e4.a(this.f35875a));
    }
}
