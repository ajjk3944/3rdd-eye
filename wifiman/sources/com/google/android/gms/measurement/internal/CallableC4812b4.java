package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.b4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class CallableC4812b4 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f36348a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f36349b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ A3 f36350c;

    CallableC4812b4(A3 a32, t7 t7Var, Bundle bundle) {
        this.f36348a = t7Var;
        this.f36349b = bundle;
        this.f36350c = a32;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f36350c.f35772a.K0();
        return this.f36350c.f35772a.n(this.f36348a, this.f36349b);
    }
}
