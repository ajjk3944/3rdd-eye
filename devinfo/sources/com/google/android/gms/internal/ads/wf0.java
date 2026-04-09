package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf0 implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iu f18008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f18009c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18010d;

    public /* synthetic */ wf0(Object obj, iu iuVar, int i4, int i10) {
        this.f18007a = i10;
        this.f18010d = obj;
        this.f18008b = iuVar;
        this.f18009c = i4;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final /* synthetic */ vd.b c(Object obj) {
        Bundle bundle;
        Bundle bundle2;
        switch (this.f18007a) {
            case 0:
                aw awVar = (aw) this.f18010d;
                iu iuVar = this.f18008b;
                if (iuVar != null && (bundle = iuVar.f12483m) != null) {
                    bundle.putBoolean("ls", true);
                }
                return yo0.F(((xg0) ((cs1) awVar.f9454e).a()).h4(iuVar, this.f18009c), new xf0(iuVar, 0), (w81) awVar.f9452c);
            default:
                r7 r7Var = (r7) this.f18010d;
                iu iuVar2 = this.f18008b;
                if (iuVar2 != null && (bundle2 = iuVar2.f12483m) != null) {
                    bundle2.putBoolean("ls", true);
                }
                return yo0.F(((xg0) ((cs1) r7Var.f15561f).a()).k4(iuVar2, this.f18009c), new xf0(iuVar2, 1), (w81) r7Var.f15558c);
        }
    }
}
