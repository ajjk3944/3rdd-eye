package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final List f42521a;

    public S(List list) {
        this.f42521a = list;
    }

    public final void a(C5145k c5145k) {
        for (P p10 : this.f42521a) {
            C5146l c5146l = null;
            if (c5145k != null) {
                C5145k c5145k2 = c5145k.f42569a ? c5145k : null;
                if (c5145k2 != null) {
                    c5146l = c5145k2.f42570b;
                }
            }
            p10.a(c5146l);
        }
    }
}
