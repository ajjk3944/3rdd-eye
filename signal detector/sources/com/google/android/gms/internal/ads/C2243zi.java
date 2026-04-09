package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.zi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2243zi implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17897a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f17898b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f17899c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f17900d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f17901e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2069wN f17902f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2069wN f17903g;

    public /* synthetic */ C2243zi(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, Object obj, C1799rN c1799rN, Object obj2, Object obj3, int i) {
        this.f17897a = i;
        this.f17898b = interfaceC2069wN;
        this.f17899c = interfaceC2069wN2;
        this.f17900d = (InterfaceC2069wN) obj;
        this.f17901e = c1799rN;
        this.f17902f = (InterfaceC2069wN) obj2;
        this.f17903g = (InterfaceC2069wN) obj3;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f17897a) {
            case 0:
                Context contextA = ((C0540Hh) this.f17898b).a();
                C2909E c2909eC = ((C0489Eh) this.f17899c).c();
                C0854Zp c0854Zp = (C0854Zp) this.f17900d.c();
                C0478Dn c0478Dn = (C0478Dn) this.f17901e.c();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new C2189yi(contextA, c2909eC, c0854Zp, c0478Dn, c0623Mf, (ID) this.f17902f.c(), (ScheduledExecutorService) this.f17903g.c());
            case 1:
                InterfaceC1195gA interfaceC1195gA = (InterfaceC1195gA) this.f17898b.c();
                Sz sz = (Sz) this.f17899c.c();
                Vz vz = (Vz) this.f17900d.c();
                C1948uA c1948uA = (C1948uA) this.f17901e.c();
                InterfaceC1666oy interfaceC1666oy = (InterfaceC1666oy) this.f17902f.c();
                Xx xx = (Xx) this.f17903g.c();
                return new Gz(interfaceC1195gA, sz, vz, c1948uA, interfaceC1666oy, xx.M().E(), xx.M().F(), xx.M().G());
            case 2:
                return new Pz((InterfaceC1195gA) this.f17898b.c(), (C1140fA) this.f17899c.c(), (C1355jA) this.f17900d.c(), (C1948uA) this.f17901e.c(), (Xx) this.f17902f.c(), (ExecutorService) this.f17903g.c());
            default:
                return new Sz((Context) this.f17898b.c(), (ExecutorService) this.f17899c.c(), (Xx) this.f17900d.c(), (C1612ny) this.f17901e.c(), (C1948uA) this.f17902f.c(), (Uz) this.f17903g.c());
        }
    }
}
