package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class X4 extends Of {

    /* renamed from: a, reason: collision with root package name */
    public final W4 f40371a;

    public X4(S4 s42) {
        this.f40371a = new W4(s42);
    }

    @Override // io.appmetrica.analytics.impl.Of
    public final AbstractC4841o9 a(int i) {
        ArrayList arrayList = new ArrayList();
        int iOrdinal = EnumC4997ub.a(i).ordinal();
        if (iOrdinal == 12) {
            arrayList.add(this.f40371a.f40313a);
        } else if (iOrdinal == 14) {
            arrayList.add(this.f40371a.f40314b);
        } else if (iOrdinal == 34) {
            arrayList.add(this.f40371a.f40315c);
        }
        return new C4815n9(arrayList);
    }
}
