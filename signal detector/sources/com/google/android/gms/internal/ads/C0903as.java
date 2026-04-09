package com.google.android.gms.internal.ads;

import android.content.Context;
import f4.InterfaceFutureC2326a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.as, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0903as implements Ms {

    /* renamed from: a, reason: collision with root package name */
    public final C0538Hf f13236a;

    /* renamed from: b, reason: collision with root package name */
    public final V2.h f13237b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f13238c;

    /* renamed from: d, reason: collision with root package name */
    public final ID f13239d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f13240e;

    public C0903as(Context context, C0538Hf c0538Hf, ScheduledExecutorService scheduledExecutorService, ID id) {
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8592F3)).booleanValue()) {
            this.f13237b = new V2.h(context);
        }
        this.f13240e = context;
        this.f13236a = c0538Hf;
        this.f13238c = scheduledExecutorService;
        this.f13239d = id;
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() {
        c3.j jVarB;
        E9 e9 = H9.f8566B3;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
            if (!((Boolean) c2841s.f23270c.a(H9.f8598G3)).booleanValue()) {
                if (!((Boolean) c2841s.f23270c.a(H9.f8572C3)).booleanValue()) {
                    return AbstractC1984ut.G(Cr.f(this.f13237b.b()), C1563n2.f15720m, AbstractC0640Nf.f10011g);
                }
                if (((Boolean) c2841s.f23270c.a(H9.f8592F3)).booleanValue()) {
                    AbstractC0709Rg.g(this.f13240e, false);
                    synchronized (AbstractC0709Rg.f10940x) {
                        jVarB = AbstractC0709Rg.f10938v;
                    }
                } else {
                    jVarB = this.f13237b.b();
                }
                if (jVarB == null) {
                    return AbstractC1984ut.e(new C0958bs(null, -1, 0));
                }
                InterfaceFutureC2326a interfaceFutureC2326aF = AbstractC1984ut.F(Cr.f(jVarB), C1704pi.f16208j, AbstractC0640Nf.f10011g);
                if (((Boolean) c2841s.f23270c.a(H9.f8579D3)).booleanValue()) {
                    interfaceFutureC2326aF = AbstractC1984ut.E(interfaceFutureC2326aF, ((Long) c2841s.f23270c.a(H9.f8586E3)).longValue(), TimeUnit.MILLISECONDS, this.f13238c);
                }
                return AbstractC1984ut.C(interfaceFutureC2326aF, Exception.class, new C1754qe(4, this), this.f13239d);
            }
        }
        return AbstractC1984ut.e(new C0958bs(null, -1, 0));
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        return 11;
    }
}
