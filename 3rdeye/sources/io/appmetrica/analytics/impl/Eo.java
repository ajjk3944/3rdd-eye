package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class Eo implements P1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f39390b;

    public /* synthetic */ Eo(Object obj, int i) {
        this.f39389a = i;
        this.f39390b = obj;
    }

    @Override // io.appmetrica.analytics.impl.P1
    public final void a(Intent intent) {
        switch (this.f39389a) {
            case 0:
                ((J1) this.f39390b).d(intent);
                break;
            default:
                C4974td.a((ModuleServiceLifecycleObserver) this.f39390b, intent);
                break;
        }
    }
}
