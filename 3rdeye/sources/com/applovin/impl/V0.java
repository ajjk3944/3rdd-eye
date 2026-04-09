package com.applovin.impl;

import android.view.Surface;
import com.yandex.mobile.ads.impl.if2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18880b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f18881c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18883e;

    public /* synthetic */ V0(Object obj, Object obj2, long j4, int i) {
        this.f18880b = i;
        this.f18882d = obj;
        this.f18883e = obj2;
        this.f18881c = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18880b) {
            case 0:
                ((w4) this.f18882d).a((Thread) this.f18883e, this.f18881c);
                break;
            default:
                ((if2.a) this.f18882d).a((Surface) this.f18883e, this.f18881c);
                break;
        }
    }
}
