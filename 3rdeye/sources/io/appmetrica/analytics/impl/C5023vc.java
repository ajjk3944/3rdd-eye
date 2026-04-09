package io.appmetrica.analytics.impl;

import b9.C2001h;
import b9.InterfaceC2000g;
import c9.C2097r;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.vc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5023vc {

    /* renamed from: a, reason: collision with root package name */
    public final C4513bh f41848a;

    /* renamed from: b, reason: collision with root package name */
    public final J9 f41849b;

    /* renamed from: c, reason: collision with root package name */
    public final J4 f41850c;

    /* renamed from: d, reason: collision with root package name */
    public final Cif f41851d;

    /* renamed from: e, reason: collision with root package name */
    public final C4682i5 f41852e;

    /* renamed from: f, reason: collision with root package name */
    public final Oc f41853f = new Oc();

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2000g f41854g = C2001h.b(new C4998uc(this));

    public C5023vc(C4555d7 c4555d7, C4513bh c4513bh, J9 j92, J4 j4, Cif cif) {
        this.f41848a = c4513bh;
        this.f41849b = j92;
        this.f41850c = j4;
        this.f41851d = cif;
        this.f41852e = new C4682i5(c4555d7, c4513bh);
    }

    public final List<V8> a() {
        return this.f41852e.a();
    }

    public final List<V8> b() {
        return C2097r.y0(E.u.G((V8) this.f41854g.getValue()), E.u.G(this.f41852e.f41043c));
    }
}
