package com.yandex.mobile.ads.impl;

import N7.G8;
import com.yandex.mobile.ads.impl.dy;
import d9.C4284b;
import java.util.List;

/* loaded from: classes3.dex */
public final class r9 {
    public static List a(dy.g adapter) {
        kotlin.jvm.internal.l.f(adapter, "adapter");
        C4284b c4284bU = E.u.u();
        c4284bU.add(dy.d.f26532a);
        c4284bU.add(new dy.e("Info"));
        if (adapter.i() == nw.f31029c && adapter.a() != null) {
            String strG = adapter.g();
            c4284bU.add(new dy.f((strG == null || y9.q.i0(strG)) ? "ID" : adapter.g(), adapter.a()));
        }
        c4284bU.add(new dy.f("Type", adapter.i().a()));
        List<kx> listH = adapter.h();
        if (listH != null) {
            for (kx kxVar : listH) {
                c4284bU.add(new dy.f(kxVar.a(), kxVar.b()));
            }
        }
        List<gy> listB = adapter.b();
        if (listB != null && !listB.isEmpty()) {
            c4284bU.add(dy.d.f26532a);
            c4284bU.add(new dy.e("CPM floors"));
            String strG2 = adapter.g();
            String strS = (strG2 == null || y9.q.i0(strG2)) ? "" : G8.s(adapter.g(), ": ");
            for (gy gyVar : adapter.b()) {
                c4284bU.add(new dy.f(G8.s(strS, gyVar.b()), "cpm: " + gyVar.a()));
            }
        }
        return E.u.m(c4284bU);
    }
}
