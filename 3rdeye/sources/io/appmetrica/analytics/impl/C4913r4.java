package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: io.appmetrica.analytics.impl.r4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4913r4 extends AbstractC4535cd {

    /* renamed from: a, reason: collision with root package name */
    public final C4666hf f41530a;

    public C4913r4(Context context) {
        this(new C4666hf(C4916r7.a(context).b()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4535cd
    public final void a(int i) {
        this.f41530a.c(i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4535cd
    public final int b() {
        return (int) this.f41530a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4535cd
    public final SparseArray<InterfaceC4509bd> c() {
        return new SparseArray<>();
    }

    public C4913r4(C4666hf c4666hf) {
        this.f41530a = c4666hf;
    }
}
