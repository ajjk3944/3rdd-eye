package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes3.dex */
public final class V implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C5141g f42528a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f42529b;

    /* renamed from: c, reason: collision with root package name */
    public final C5151q f42530c;

    public V() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N fromModel(T t10) {
        N n9 = new N();
        C5139e c5139e = t10.f42522a;
        n9.f42515a = c5139e != null ? this.f42528a.fromModel(c5139e) : null;
        X x10 = t10.f42523b;
        n9.f42516b = x10 != null ? this.f42529b.fromModel(x10) : null;
        C5149o c5149o = t10.f42524c;
        n9.f42517c = c5149o != null ? this.f42530c.fromModel(c5149o) : null;
        return n9;
    }

    public V(C5141g c5141g, Z z10, C5151q c5151q) {
        this.f42528a = c5141g;
        this.f42529b = z10;
        this.f42530c = c5151q;
    }

    public /* synthetic */ V(C5141g c5141g, Z z10, C5151q c5151q, int i, kotlin.jvm.internal.g gVar) {
        this((i & 1) != 0 ? new C5141g() : c5141g, (i & 2) != 0 ? new Z() : z10, (i & 4) != 0 ? new C5151q() : c5151q);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T toModel(N n9) {
        C5139e c5139e;
        X x10;
        K k10 = n9.f42515a;
        if (k10 != null) {
            this.f42528a.getClass();
            c5139e = new C5139e(k10.f42506a);
        } else {
            c5139e = null;
        }
        M m10 = n9.f42516b;
        if (m10 != null) {
            this.f42529b.getClass();
            x10 = new X(m10.f42512a, m10.f42513b);
        } else {
            x10 = null;
        }
        L l5 = n9.f42517c;
        return new T(c5139e, x10, l5 != null ? this.f42530c.toModel(l5) : null);
    }
}
