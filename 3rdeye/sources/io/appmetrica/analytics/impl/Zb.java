package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Zb implements InterfaceC4860p2 {

    /* renamed from: a, reason: collision with root package name */
    public final H4 f40465a;

    public Zb(H4 h42) {
        this.f40465a = h42;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4860p2
    public final Zn a(Xn xn, Zn zn) {
        int i = xn.f40400b;
        int i10 = this.f40465a.f39559a;
        if (i == i10) {
            if (((Zn) ((HashMap) xn.f40399a.get(zn.f40497b)).get(new String(zn.f40496a))) != null) {
                ((HashMap) xn.f40399a.get(zn.f40497b)).put(new String(zn.f40496a), zn);
                return zn;
            }
        } else if (i < i10) {
            ((HashMap) xn.f40399a.get(zn.f40497b)).put(new String(zn.f40496a), zn);
            xn.f40400b++;
        }
        return zn;
    }
}
