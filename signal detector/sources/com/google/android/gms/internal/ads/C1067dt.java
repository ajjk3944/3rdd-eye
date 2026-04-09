package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.dt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1067dt implements Ms {

    /* renamed from: a, reason: collision with root package name */
    public final C0538Hf f13821a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13822b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f13823c;

    /* renamed from: d, reason: collision with root package name */
    public final ID f13824d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13825e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13826f;

    public C1067dt(C0538Hf c0538Hf, boolean z6, ID id, ScheduledExecutorService scheduledExecutorService, int i, int i3) {
        this.f13821a = c0538Hf;
        this.f13822b = z6;
        this.f13824d = id;
        this.f13823c = scheduledExecutorService;
        this.f13825e = i;
        this.f13826f = i3;
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() {
        E9 e9 = H9.M7;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && this.f13822b) {
            return AbstractC1984ut.e(new Or(null, 5));
        }
        if (this.f13826f == 2) {
            return AbstractC1984ut.e(new Or(null, 5));
        }
        if (!Arrays.asList(((String) c2841s.f23270c.a(H9.O7)).split(",")).contains(String.valueOf(this.f13825e))) {
            return AbstractC1984ut.e(new Or(null, 5));
        }
        ED ed = ED.f7928b;
        C1563n2 c1563n2 = C1563n2.f15723p;
        ID id = this.f13824d;
        return AbstractC1984ut.C(AbstractC1984ut.E(AbstractC1984ut.G(ed, c1563n2, id), ((Long) AbstractC2073wa.f17447b.v()).longValue(), TimeUnit.MILLISECONDS, this.f13823c), Exception.class, new C1754qe(6, this), id);
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        return 50;
    }
}
