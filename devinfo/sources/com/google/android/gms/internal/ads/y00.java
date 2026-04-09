package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class y00 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18598a;

    /* renamed from: b, reason: collision with root package name */
    public final w00 f18599b;

    public /* synthetic */ y00(w00 w00Var, int i4) {
        this.f18598a = i4;
        this.f18599b = w00Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f18598a) {
            case 0:
                w00 w00Var = this.f18599b;
                return new u00(w00Var.f17809b, w00Var.f17808a);
            case 1:
                Context context = this.f18599b.f17809b;
                al0.z(context);
                return context;
            case 2:
                WeakReference weakReference = this.f18599b.f17811d;
                al0.z(weakReference);
                return weakReference;
            case 3:
                return new jm(this.f18599b.f17809b, 0);
            case 4:
                w00 w00Var2 = this.f18599b;
                return new ua.e(w00Var2.f17809b, w00Var2.f17808a);
            case 5:
                ya.f0 f0Var = ua.j.C.f35261c;
                w00 w00Var3 = this.f18599b;
                String strF = f0Var.F(w00Var3.f17809b, w00Var3.f17808a.f38129a);
                al0.z(strF);
                return strF;
            default:
                return Long.valueOf(this.f18599b.f17810c);
        }
    }
}
