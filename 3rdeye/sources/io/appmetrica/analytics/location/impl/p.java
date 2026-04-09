package io.appmetrica.analytics.location.impl;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public i f42261a;

    /* renamed from: b, reason: collision with root package name */
    public final m f42262b;

    /* renamed from: c, reason: collision with root package name */
    public final h f42263c;

    /* renamed from: d, reason: collision with root package name */
    public final List f42264d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f42265e = new HashMap();

    public p(List list, i iVar) {
        this.f42264d = list;
        this.f42261a = iVar;
        m mVar = new m();
        this.f42262b = mVar;
        this.f42263c = new h(mVar);
    }

    public final m a() {
        return this.f42262b;
    }
}
