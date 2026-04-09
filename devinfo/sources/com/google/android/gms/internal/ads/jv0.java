package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jv0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12845a;

    /* renamed from: b, reason: collision with root package name */
    public final Looper f12846b;

    public jv0(Context context, Looper looper) {
        this.f12845a = context;
        this.f12846b = looper;
    }

    public final void a(String str) {
        ov0 ov0VarA = pv0.A();
        Context context = this.f12845a;
        String packageName = context.getPackageName();
        ov0VarA.b();
        ((pv0) ov0VarA.f14755b).B(packageName);
        ov0VarA.b();
        ((pv0) ov0VarA.f14755b).D(2);
        lv0 lv0VarA = nv0.A();
        lv0VarA.b();
        ((nv0) lv0VarA.f14755b).B(str);
        lv0VarA.b();
        ((nv0) lv0VarA.f14755b).C(2);
        ov0VarA.b();
        ((pv0) ov0VarA.f14755b).C((nv0) lv0VarA.e());
        ur0 ur0Var = new ur0(context, this.f12846b, (pv0) ov0VarA.e());
        synchronized (ur0Var.f17306f) {
            try {
                if (!ur0Var.f17302b) {
                    ur0Var.f17302b = true;
                    ((tv0) ur0Var.f17304d).n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
