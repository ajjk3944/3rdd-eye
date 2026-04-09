package io.appmetrica.analytics.impl;

import c9.C2079C;
import c9.C2092m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class Q5 implements V8, InterfaceC4686i9 {

    /* renamed from: a, reason: collision with root package name */
    public final C4555d7 f40006a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f40007b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f40008c;

    public Q5(C4555d7 c4555d7) {
        this.f40006a = c4555d7;
        Set setE = C2079C.e(Integer.valueOf(EnumC4997ub.EVENT_CLIENT_EXTERNAL_ATTRIBUTION.a()), Integer.valueOf(EnumC4997ub.EVENT_TYPE_APP_UPDATE.a()), Integer.valueOf(EnumC4997ub.EVENT_TYPE_FIRST_ACTIVATION.a()), Integer.valueOf(EnumC4997ub.EVENT_TYPE_INIT.a()), Integer.valueOf(EnumC4997ub.EVENT_TYPE_SEND_AD_REVENUE_EVENT.a()), Integer.valueOf(EnumC4997ub.EVENT_TYPE_SEND_ECOMMERCE_EVENT.a()), Integer.valueOf(EnumC4997ub.EVENT_TYPE_SEND_REFERRER.a()), Integer.valueOf(EnumC4997ub.EVENT_TYPE_SEND_REVENUE_EVENT.a()));
        this.f40007b = setE;
        this.f40008c = new AtomicLong(c4555d7.a(setE));
        c4555d7.a(this);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4686i9
    public final void a() {
        this.f40008c.set(this.f40006a.a(this.f40007b));
    }

    @Override // io.appmetrica.analytics.impl.V8
    public final boolean b() {
        return this.f40008c.get() > 0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4686i9
    public final void b(List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f40007b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    C2092m.Z();
                    throw null;
                }
            }
        }
        this.f40008c.addAndGet(-i);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4686i9
    public final void a(List<Integer> list) {
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (this.f40007b.contains(Integer.valueOf(((Number) it.next()).intValue())) && (i = i + 1) < 0) {
                    C2092m.Z();
                    throw null;
                }
            }
        }
        this.f40008c.addAndGet(i);
    }
}
