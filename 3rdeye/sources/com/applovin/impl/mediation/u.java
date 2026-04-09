package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.mediation.h;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20522c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20524e;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i) {
        this.f20521b = i;
        this.f20522c = obj;
        this.f20523d = obj2;
        this.f20524e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20521b) {
            case 0:
                ((h.b) this.f20522c).a((MaxError) this.f20523d, (Bundle) this.f20524e);
                break;
            case 1:
                ((h) this.f20522c).c((MaxAdapterResponseParameters) this.f20523d, (Activity) this.f20524e);
                break;
            default:
                ((h) this.f20522c).a((String) this.f20523d, (Runnable) this.f20524e);
                break;
        }
    }
}
