package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import q2.C2841s;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.qk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1760qk extends VL implements InterfaceC1598nk {

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f16393c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f16394d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16395e;

    public C1760qk(C1706pk c1706pk, Set set, C0623Mf c0623Mf, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f16395e = false;
        this.f16393c = scheduledExecutorService;
        z1(c1706pk, c0623Mf);
    }

    public final void H1() {
        this.f16394d = this.f16393c.schedule(new RunnableC0558Ii(6, this), ((Integer) C2841s.f23267e.f23270c.a(H9.Ub)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1598nk
    public final void V(C2852x0 c2852x0) {
        C1(new C1436kk(1, c2852x0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1598nk
    public final void W(C0578Jl c0578Jl) {
        if (this.f16395e) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f16394d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        C1(new L6(15, c0578Jl));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1598nk
    public final void b() {
        C1(C1652ok.f16039b);
    }
}
