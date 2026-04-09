package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import c9.C2097r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class xm2 implements oa2 {

    /* renamed from: a, reason: collision with root package name */
    private final ge1 f35360a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f35361b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f35362c;

    public xm2(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f35360a = ge1.f27640g.a(context);
        this.f35361b = new Object();
        this.f35362c = new ArrayList();
    }

    @Override // com.yandex.mobile.ads.impl.oa2
    public final void a() {
        List listG0;
        synchronized (this.f35361b) {
            listG0 = C2097r.G0(this.f35362c);
            this.f35362c.clear();
            C1992A c1992a = C1992A.f18074a;
        }
        Iterator it = listG0.iterator();
        while (it.hasNext()) {
            this.f35360a.a((pa2) it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.oa2
    public final void a(pa2 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f35361b) {
            this.f35362c.add(listener);
            this.f35360a.b(listener);
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
