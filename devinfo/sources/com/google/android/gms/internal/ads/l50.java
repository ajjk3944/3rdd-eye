package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class l50 implements z21 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13379c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13380d;

    public /* synthetic */ l50(Object obj, Object obj2, Object obj3, int i4) {
        this.f13377a = i4;
        this.f13378b = obj;
        this.f13379c = obj2;
        this.f13380d = obj3;
    }

    @Override // com.google.android.gms.internal.ads.z21
    public final Object apply(Object obj) {
        switch (this.f13377a) {
            case 0:
                wp0 wp0Var = (wp0) obj;
                ya.g gVar = new ya.g((Context) this.f13378b);
                gVar.f37452c = wp0Var.B;
                gVar.f37455f = wp0Var.C.toString();
                gVar.f37454e = ((za.a) this.f13379c).f38129a;
                gVar.f37453d = ((hq0) this.f13380d).g;
                return gVar;
            case 1:
                qz qzVar = (qz) this.f13378b;
                if (((wp0) this.f13379c).M) {
                    qzVar.o0();
                }
                l10 l10Var = (l10) this.f13380d;
                qzVar.R0();
                qzVar.onPause();
                return l10Var.Z();
            case 2:
                qz qzVar2 = (qz) this.f13378b;
                if (((wp0) this.f13379c).M) {
                    qzVar2.o0();
                }
                s10 s10Var = (s10) this.f13380d;
                qzVar2.R0();
                qzVar2.onPause();
                return s10Var.Z();
            default:
                qz qzVar3 = (qz) this.f13378b;
                if (((wp0) this.f13379c).M) {
                    qzVar3.o0();
                }
                v10 v10Var = (v10) this.f13380d;
                qzVar3.R0();
                qzVar3.onPause();
                return v10Var.Z();
        }
    }
}
