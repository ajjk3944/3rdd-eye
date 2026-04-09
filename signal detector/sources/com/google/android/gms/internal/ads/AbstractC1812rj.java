package com.google.android.gms.internal.ads;

import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.rj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1812rj implements InterfaceC0719Rq {

    /* renamed from: a, reason: collision with root package name */
    public final Xt f16600a;

    /* renamed from: b, reason: collision with root package name */
    public final Qt f16601b;

    /* renamed from: c, reason: collision with root package name */
    public final C2137xk f16602c;

    /* renamed from: d, reason: collision with root package name */
    public final C0424Ak f16603d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2200yt f16604e;

    /* renamed from: f, reason: collision with root package name */
    public final BinderC1168fk f16605f;

    /* renamed from: g, reason: collision with root package name */
    public final C0764Uk f16606g;

    /* renamed from: h, reason: collision with root package name */
    public final C0458Ck f16607h;
    public final C1814rl i;

    /* renamed from: j, reason: collision with root package name */
    public final C0712Rj f16608j;

    /* renamed from: k, reason: collision with root package name */
    public final C1280ho f16609k;

    public AbstractC1812rj(K4.j jVar) {
        this.f16600a = (Xt) jVar.f2315a;
        this.f16601b = (Qt) jVar.f2316b;
        this.f16602c = (C2137xk) jVar.f2317c;
        this.f16603d = (C0424Ak) jVar.f2318d;
        this.f16604e = (InterfaceC2200yt) jVar.f2319e;
        this.f16605f = (BinderC1168fk) jVar.f2320f;
        this.f16606g = (C0764Uk) jVar.f2321g;
        this.f16607h = (C0458Ck) jVar.f2322h;
        this.i = (C1814rl) jVar.i;
        this.f16608j = (C0712Rj) jVar.f2323j;
        this.f16609k = (C1280ho) jVar.f2324k;
    }

    public void a() {
        this.f16603d.e();
        this.f16607h.I(this);
    }

    public final void b() {
        C1280ho c1280ho;
        C1197gC c1197gC = this.f16601b.f10729C0;
        if (c1197gC == null || c1197gC.isEmpty() || (c1280ho = this.f16609k) == null) {
            return;
        }
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.H8)).booleanValue() || c1197gC.isEmpty()) {
            return;
        }
        JB jbListIterator = c1197gC.listIterator(0);
        while (jbListIterator.hasNext()) {
            C1333io c1333io = (C1333io) jbListIterator.next();
            int[] iArr = c1333io.f14804b;
            int length = iArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (iArr[i] == 1) {
                    long j6 = c1333io.f14803a;
                    p2.j.f22785C.f22797k.getClass();
                    c1280ho.a(j6, System.currentTimeMillis(), 1);
                    break;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0719Rq
    public final void n() {
        this.i.j();
    }
}
