package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.h;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4841a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4842b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4843c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4844d;

    public /* synthetic */ t(Object obj, Object obj2, Object obj3, int i4) {
        this.f4841a = i4;
        this.f4842b = obj;
        this.f4843c = obj2;
        this.f4844d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4841a) {
            case 0:
                ((h.b) this.f4842b).a((MaxError) this.f4843c, (Bundle) this.f4844d);
                break;
            case 1:
                ((h.c) this.f4842b).a((MaxAdapter.InitializationStatus) this.f4843c, (String) this.f4844d);
                break;
            case 2:
                ((h) this.f4842b).a((String) this.f4843c, (Runnable) this.f4844d);
                break;
            default:
                ((h) this.f4842b).a((y2) this.f4843c, (Runnable) this.f4844d);
                break;
        }
    }
}
