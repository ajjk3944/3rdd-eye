package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.h;
import com.applovin.impl.t2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20519c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20520d;

    public /* synthetic */ t(int i, Object obj, Object obj2) {
        this.f20518b = i;
        this.f20519c = obj;
        this.f20520d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20518b) {
            case 0:
                ((h.b) this.f20519c).j((Bundle) this.f20520d);
                break;
            case 1:
                ((h.b) this.f20519c).a((Bundle) this.f20520d);
                break;
            case 2:
                ((h.b) this.f20519c).d((Bundle) this.f20520d);
                break;
            default:
                ((c) this.f20519c).a((t2) this.f20520d);
                break;
        }
    }
}
