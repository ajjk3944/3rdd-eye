package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.b f20538c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f20539d;

    public /* synthetic */ z(h.b bVar, Bundle bundle, int i) {
        this.f20537b = i;
        this.f20538c = bVar;
        this.f20539d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20537b) {
            case 0:
                this.f20538c.f(this.f20539d);
                break;
            default:
                this.f20538c.c(this.f20539d);
                break;
        }
    }
}
