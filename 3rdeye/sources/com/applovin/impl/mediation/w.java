package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.mediation.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20526b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20527c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20528d;

    public /* synthetic */ w(int i, Object obj, Object obj2) {
        this.f20526b = i;
        this.f20527c = obj;
        this.f20528d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20526b) {
            case 0:
                ((h.b) this.f20527c).e((Bundle) this.f20528d);
                break;
            case 1:
                ((h.b) this.f20527c).g((Bundle) this.f20528d);
                break;
            case 2:
                ((h.b) this.f20527c).b((Bundle) this.f20528d);
                break;
            default:
                ((h) this.f20527c).b((Activity) this.f20528d);
                break;
        }
    }
}
