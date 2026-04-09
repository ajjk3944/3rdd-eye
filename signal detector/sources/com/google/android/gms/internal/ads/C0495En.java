package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;
import z5.AbstractC3046w;

/* renamed from: com.google.android.gms.internal.ads.En, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0495En {

    /* renamed from: a, reason: collision with root package name */
    public final C1009cp f8002a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f8003b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f8004c = new AtomicBoolean(false);

    public C0495En(C1009cp c1009cp) {
        this.f8002a = c1009cp;
    }

    public final void a(A1.w wVar) {
        this.f8004c.set(true);
        synchronized (wVar.f141d) {
            try {
                if (((S7) wVar.f139b) == null) {
                    wVar.f139b = new S7();
                }
                ((S7) wVar.f139b).c(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        C1009cp c1009cp = this.f8002a;
        c1009cp.getClass();
        AbstractC3046w.l((E5.e) c1009cp.f13674c, null, new Ix(c1009cp, null), 3);
    }

    public final void b() {
        if (this.f8003b.get()) {
            C1009cp c1009cp = this.f8002a;
            c1009cp.getClass();
            AbstractC3046w.l((E5.e) c1009cp.f13674c, null, new Mx(c1009cp, null), 3);
        }
    }

    public final void c() {
        if (this.f8003b.get()) {
            C1009cp c1009cp = this.f8002a;
            c1009cp.getClass();
            AbstractC3046w.l((E5.e) c1009cp.f13674c, null, new C2150xx(c1009cp, null), 3);
        }
    }

    public final void d() {
        if (this.f8003b.getAndSet(false)) {
            C1009cp c1009cp = this.f8002a;
            c1009cp.getClass();
            AbstractC3046w.l((E5.e) c1009cp.f13674c, null, new Kx(c1009cp, null), 3);
        }
    }
}
