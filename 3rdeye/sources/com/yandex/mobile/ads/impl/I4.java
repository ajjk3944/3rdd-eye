package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class I4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashSet f24146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0 f24147d;

    public /* synthetic */ I4(HashSet hashSet, tn0 tn0Var, int i) {
        this.f24145b = i;
        this.f24146c = hashSet;
        this.f24147d = tn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24145b) {
            case 0:
                xl0.b((Set) this.f24146c, this.f24147d);
                break;
            default:
                xl0.g((Set) this.f24146c, this.f24147d);
                break;
        }
    }
}
