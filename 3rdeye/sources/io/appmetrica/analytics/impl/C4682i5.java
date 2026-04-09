package io.appmetrica.analytics.impl;

import c9.C2092m;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4682i5 {

    /* renamed from: a, reason: collision with root package name */
    public final Q5 f41041a;

    /* renamed from: b, reason: collision with root package name */
    public final Xc f41042b;

    /* renamed from: c, reason: collision with root package name */
    public final Xc f41043c;

    public C4682i5(C4555d7 c4555d7, C4513bh c4513bh) {
        Fe fe = new Fe(c4555d7);
        this.f41041a = new Q5(c4555d7);
        this.f41042b = new Xc(fe, new C4656h5(c4513bh));
        this.f41043c = new Xc(fe, C4630g5.f40927a);
    }

    public final List<V8> a() {
        return C2092m.W(this.f41041a, this.f41042b);
    }

    public final List<V8> b() {
        return E.u.G(this.f41043c);
    }
}
