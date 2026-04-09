package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.h;
import com.applovin.impl.t2;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxReward;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.b f20533c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20536f;

    public /* synthetic */ y(h.b bVar, Object obj, Object obj2, Object obj3, int i) {
        this.f20532b = i;
        this.f20533c = bVar;
        this.f20534d = obj;
        this.f20535e = obj2;
        this.f20536f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20532b) {
            case 0:
                this.f20533c.a((t2) this.f20534d, (MaxReward) this.f20535e, (Bundle) this.f20536f);
                break;
            default:
                this.f20533c.a((Runnable) this.f20534d, (MaxAdListener) this.f20535e, (String) this.f20536f);
                break;
        }
    }
}
