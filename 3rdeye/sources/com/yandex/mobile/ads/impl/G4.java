package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class G4 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HashSet f24123c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0 f24124d;

    public /* synthetic */ G4(HashSet hashSet, tn0 tn0Var, int i) {
        this.f24122b = i;
        this.f24123c = hashSet;
        this.f24124d = tn0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24122b) {
            case 0:
                xl0.i((Set) this.f24123c, this.f24124d);
                break;
            default:
                xl0.e((Set) this.f24123c, this.f24124d);
                break;
        }
    }
}
