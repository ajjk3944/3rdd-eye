package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.sA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1840sA implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16685a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f16686b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1853sN f16687c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f16688d;

    public /* synthetic */ C1840sA(InterfaceC1853sN interfaceC1853sN, C1799rN c1799rN, Object obj, int i) {
        this.f16685a = i;
        this.f16687c = interfaceC1853sN;
        this.f16686b = c1799rN;
        this.f16688d = (InterfaceC2069wN) obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f16685a) {
            case 0:
                Context context = (Context) ((C1907tN) this.f16687c).f16902a;
                return new C1786rA(context, (ExecutorService) ((C1907tN) this.f16688d).f16902a, C1786rA.f16472g);
            default:
                Cr.v(((C1807re) ((C1013ct) this.f16687c).f13693b.f2570c).f16579d);
                C0538Hf c0538Hf = (C0538Hf) this.f16686b.c();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f16688d.c();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new Qr(c0538Hf, scheduledExecutorService, c0623Mf);
        }
    }
}
