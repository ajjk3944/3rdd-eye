package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class Y3 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ t7 f36299a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Bundle f36300b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ A3 f36301c;

    Y3(A3 a32, t7 t7Var, Bundle bundle) {
        this.f36299a = t7Var;
        this.f36300b = bundle;
        this.f36301c = a32;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        this.f36301c.f35772a.K0();
        return this.f36301c.f35772a.n(this.f36299a, this.f36300b);
    }
}
