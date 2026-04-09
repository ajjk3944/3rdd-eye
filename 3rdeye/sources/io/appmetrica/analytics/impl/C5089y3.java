package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.y3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5089y3 implements InterfaceC4830no {

    /* renamed from: a, reason: collision with root package name */
    public final X8 f42105a;

    public C5089y3() {
        this(new X8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4830no
    public final byte[] a(C4557d9 c4557d9, C5028vh c5028vh) {
        byte[] bArrDecode = new byte[0];
        String str = c4557d9.f40723b;
        if (str != null) {
            try {
                bArrDecode = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        X8 x82 = this.f42105a;
        return ((W8) x82.f40379a.a(c4557d9.f40735o)).a(bArrDecode);
    }

    public C5089y3(X8 x82) {
        this.f42105a = x82;
    }
}
