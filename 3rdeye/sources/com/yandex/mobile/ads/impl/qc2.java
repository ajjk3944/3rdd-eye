package com.yandex.mobile.ads.impl;

import c9.C2095p;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class qc2 implements pc2, rc2 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f32139a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f32140b = new LinkedHashSet();

    public final void a(pc2... newProgressChangeListeners) {
        kotlin.jvm.internal.l.f(newProgressChangeListeners, "newProgressChangeListeners");
        C2095p.c0(this.f32139a, newProgressChangeListeners);
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void b() {
        Iterator it = this.f32140b.iterator();
        while (it.hasNext()) {
            ((rc2) it.next()).b();
        }
    }

    public final void a(rc2... newProgressLifecycleListeners) {
        kotlin.jvm.internal.l.f(newProgressLifecycleListeners, "newProgressLifecycleListeners");
        C2095p.c0(this.f32140b, newProgressLifecycleListeners);
    }

    @Override // com.yandex.mobile.ads.impl.pc2
    public final void a(long j4, long j10) {
        Iterator it = this.f32139a.iterator();
        while (it.hasNext()) {
            ((pc2) it.next()).a(j4, j10);
        }
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a() {
        Iterator it = this.f32140b.iterator();
        while (it.hasNext()) {
            ((rc2) it.next()).a();
        }
    }
}
