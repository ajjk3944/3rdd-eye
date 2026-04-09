package com.applovin.impl.mediation;

import com.applovin.impl.mediation.h;
import com.applovin.impl.q2;
import com.applovin.mediation.adapter.MaxAdapter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20164b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20165c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20167e;

    public /* synthetic */ A(Object obj, Object obj2, Object obj3, int i) {
        this.f20164b = i;
        this.f20165c = obj;
        this.f20166d = obj2;
        this.f20167e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20164b) {
            case 0:
                ((h.c) this.f20165c).a((MaxAdapter.InitializationStatus) this.f20166d, (String) this.f20167e);
                break;
            default:
                ((h) this.f20165c).a((q2) this.f20166d, (Runnable) this.f20167e);
                break;
        }
    }
}
