package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class F4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24109b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashSet f24110c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0 f24111d;

    public /* synthetic */ F4(HashSet hashSet, tn0 tn0Var, int i) {
        this.f24109b = i;
        this.f24110c = hashSet;
        this.f24111d = tn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24109b) {
            case 0:
                xl0.d((Set) this.f24110c, this.f24111d);
                break;
            default:
                xl0.f(this.f24110c, this.f24111d);
                break;
        }
    }
}
