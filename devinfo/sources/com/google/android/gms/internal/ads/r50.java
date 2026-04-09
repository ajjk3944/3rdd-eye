package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r50 implements w60, r60 {

    /* renamed from: a, reason: collision with root package name */
    public final wp0 f15550a;

    public r50(wp0 wp0Var) {
        this.f15550a = wp0Var;
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void e() {
        kt ktVar = this.f15550a.f18079d0;
        if (ktVar == null || !ktVar.f13234a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = ktVar.f13235b;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void f(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void h(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.r60
    public final void k(Context context) {
    }
}
