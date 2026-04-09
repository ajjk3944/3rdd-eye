package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class E4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24101b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashSet f24102c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0 f24103d;

    public /* synthetic */ E4(HashSet hashSet, tn0 tn0Var, int i) {
        this.f24101b = i;
        this.f24102c = hashSet;
        this.f24103d = tn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24101b) {
            case 0:
                xl0.h((Set) this.f24102c, this.f24103d);
                break;
            case 1:
                xl0.a((Set) this.f24102c, this.f24103d);
                break;
            default:
                xl0.c(this.f24102c, this.f24103d);
                break;
        }
    }
}
