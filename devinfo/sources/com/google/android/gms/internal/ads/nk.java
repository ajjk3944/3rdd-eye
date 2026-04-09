package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nk implements l31, c80 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14308a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f14309b;

    public /* synthetic */ nk(Context context, int i4) {
        this.f14308a = i4;
        this.f14309b = context;
    }

    public vd.b a(boolean z3) {
        try {
            q5.b bVar = new q5.b(z3);
            o5.a aVarA = o5.a.a(this.f14309b);
            return aVarA != null ? aVarA.b(bVar) : yo0.w(new IllegalStateException());
        } catch (Exception e2) {
            return yo0.w(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.l31
    public /* synthetic */ Object b() {
        switch (this.f14308a) {
            case 1:
                return jz.d(this.f14309b);
            default:
                new v1();
                return new uu1(this.f14309b);
        }
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public /* synthetic */ void mo162c(Object obj) {
        ((r60) obj).f(this.f14309b);
    }

    public boolean d(Intent intent) {
        pb.y.i(intent, "Intent can not be null");
        return !this.f14309b.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public nk(Context context) {
        this.f14308a = 0;
        pb.y.i(context, "Context can not be null");
        this.f14309b = context;
    }
}
