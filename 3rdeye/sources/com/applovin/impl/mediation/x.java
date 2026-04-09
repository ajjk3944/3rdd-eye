package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.b f20530c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f20531d;

    public /* synthetic */ x(h.b bVar, Bundle bundle, int i) {
        this.f20529b = i;
        this.f20530c = bVar;
        this.f20531d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20529b) {
            case 0:
                this.f20530c.i(this.f20531d);
                break;
            default:
                this.f20530c.h(this.f20531d);
                break;
        }
    }
}
