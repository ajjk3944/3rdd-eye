package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.mediation.h;
import com.applovin.impl.t2;
import com.applovin.mediation.MaxError;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20516c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20517d;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.f20515b = i;
        this.f20516c = obj;
        this.f20517d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20515b) {
            case 0:
                ((h.b) this.f20516c).a((MaxError) this.f20517d);
                break;
            case 1:
                ((b) this.f20516c).c((t2) this.f20517d);
                break;
            case 2:
                ((h) this.f20516c).a((Runnable) this.f20517d);
                break;
            default:
                ((h) this.f20516c).c((Activity) this.f20517d);
                break;
        }
    }
}
