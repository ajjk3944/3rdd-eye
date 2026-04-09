package com.yandex.mobile.ads.impl;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class jx1 extends AbstractC4110g<Object> {

    /* renamed from: d, reason: collision with root package name */
    final Iterator<Object> f29379d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ kx1 f29380e;

    public jx1(kx1 kx1Var) {
        this.f29380e = kx1Var;
        this.f29379d = kx1Var.f29807b.iterator();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4110g
    public final Object a() {
        while (this.f29379d.hasNext()) {
            Object next = this.f29379d.next();
            if (this.f29380e.f29808c.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
