package io.appmetrica.analytics.impl;

import android.util.SparseArray;

/* renamed from: io.appmetrica.analytics.impl.rk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4929rk extends AbstractC4535cd {

    /* renamed from: a, reason: collision with root package name */
    public final C4908qo f41589a;

    public C4929rk() {
        this(Ga.j().B().b());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4535cd
    public final void a(int i) {
        C4908qo c4908qo = this.f41589a;
        synchronized (c4908qo) {
            C4959so c4959so = c4908qo.f41502a;
            c4959so.a(c4959so.a().put("last_migration_api_level", i));
        }
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4535cd
    public final int b() {
        int iOptInt;
        C4908qo c4908qo = this.f41589a;
        synchronized (c4908qo) {
            iOptInt = c4908qo.f41502a.a().optInt("last_migration_api_level", -1);
        }
        return iOptInt;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4535cd
    public final SparseArray<InterfaceC4509bd> c() {
        SparseArray<InterfaceC4509bd> sparseArray = new SparseArray<>(1);
        sparseArray.put(112, new C4955sk(this.f41589a));
        sparseArray.put(115, new C4981tk());
        return sparseArray;
    }

    public C4929rk(C4908qo c4908qo) {
        this.f41589a = c4908qo;
    }
}
