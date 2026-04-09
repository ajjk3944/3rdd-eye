package com.yandex.mobile.ads.impl;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class xp0 extends AbstractC4110g<Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Iterator f35377d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ qj1 f35378e;

    public xp0(Iterator it, qj1 qj1Var) {
        this.f35377d = it;
        this.f35378e = qj1Var;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4110g
    public final Object a() {
        while (this.f35377d.hasNext()) {
            Object next = this.f35377d.next();
            if (this.f35378e.apply(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
