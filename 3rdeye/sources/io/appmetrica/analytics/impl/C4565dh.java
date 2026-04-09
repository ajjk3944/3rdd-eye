package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.dh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4565dh implements InterfaceC5042w6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40746a;

    /* renamed from: b, reason: collision with root package name */
    public final C5040w4 f40747b;

    /* renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f40748c = Ga.j().w().e();

    public C4565dh(Context context, C5040w4 c5040w4) {
        this.f40746a = context;
        this.f40747b = c5040w4;
    }

    public final void a(C4683i6 c4683i6, Bundle bundle) {
        if (c4683i6.m()) {
            return;
        }
        this.f40748c.execute(new RunnableC5053wh(this.f40746a, c4683i6, bundle, this.f40747b));
    }

    public final void a(C4758l4 c4758l4, C4683i6 c4683i6, K4 k42) {
        this.f40747b.a(c4758l4, k42).a(c4683i6, k42);
        this.f40747b.a(c4758l4.f41166b, c4758l4.f41167c, c4758l4.f41168d);
    }
}
