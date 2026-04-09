package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.c3;
import com.applovin.impl.mediation.h;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4849c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4851e;

    public /* synthetic */ v(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f4847a = i4;
        this.f4848b = obj;
        this.f4849c = obj2;
        this.f4850d = obj3;
        this.f4851e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4847a) {
            case 0:
                ((h.b) this.f4848b).a((c3) this.f4849c, (MaxReward) this.f4850d, (Bundle) this.f4851e);
                break;
            case 1:
                ((h.b) this.f4848b).a((Runnable) this.f4849c, (MaxAdListener) this.f4850d, (String) this.f4851e);
                break;
            case 2:
                ((MediationServiceImpl) this.f4848b).a((c3) this.f4849c, (Long) this.f4850d, (MaxAdListener) this.f4851e);
                break;
            case 3:
                ((h) this.f4848b).a((MaxAdapter.OnCompletionListener) this.f4849c, (MaxAdapterInitializationParameters) this.f4850d, (Activity) this.f4851e);
                break;
            default:
                ((h) this.f4848b).a((MaxAdapterResponseParameters) this.f4849c, (MaxAdFormat) this.f4850d, (Activity) this.f4851e);
                break;
        }
    }
}
