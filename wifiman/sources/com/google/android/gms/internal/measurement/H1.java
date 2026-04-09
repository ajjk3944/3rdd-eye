package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4371i1;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
final class H1 extends C4371i1.a {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Bundle f35030e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ Activity f35031f;

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ C4371i1.c f35032g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H1(C4371i1.c cVar, Bundle bundle, Activity activity) {
        super(C4371i1.this);
        this.f35030e = bundle;
        this.f35031f = activity;
        this.f35032g = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.C4371i1.a
    final void a() {
        Bundle bundle;
        if (this.f35030e != null) {
            bundle = new Bundle();
            if (this.f35030e.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f35030e.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((P0) AbstractC7901p.l(C4371i1.this.f35258i)).onActivityCreatedByScionActivityInfo(C4353g1.b(this.f35031f), bundle, this.f35260b);
    }
}
