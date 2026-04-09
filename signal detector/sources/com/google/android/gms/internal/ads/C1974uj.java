package com.google.android.gms.internal.ads;

import f4.InterfaceFutureC2326a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.uj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1974uj implements InterfaceC0719Rq {

    /* renamed from: a, reason: collision with root package name */
    public final List f17148a;

    public C1974uj(List list) {
        this.f17148a = list;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0719Rq
    public final void n() {
        for (InterfaceFutureC2326a interfaceFutureC2326a : this.f17148a) {
            interfaceFutureC2326a.a(new CD(interfaceFutureC2326a, 0, new W9(28)), EnumC2059wD.f17407a);
        }
    }

    public C1974uj(AbstractC1812rj abstractC1812rj) {
        this.f17148a = Collections.singletonList(AbstractC1984ut.e(abstractC1812rj));
    }
}
