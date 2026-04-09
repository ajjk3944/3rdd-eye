package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d10 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10288a;

    /* renamed from: b, reason: collision with root package name */
    public final a10 f10289b;

    /* renamed from: c, reason: collision with root package name */
    public final es1 f10290c;

    public d10(a10 a10Var, es1 es1Var) {
        this.f10288a = 3;
        this.f10290c = es1Var;
        this.f10289b = a10Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f10288a) {
            case 0:
                try {
                    return ub.b.a(this.f10289b.b()).e(0, ((ApplicationInfo) this.f10290c.a()).packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 1:
                return new za.l(this.f10289b.b(), (String) this.f10290c.a());
            case 2:
                ex exVar = fx.f11274a;
                al0.z(exVar);
                return new wn0(exVar, this.f10289b.b(), (tf0) this.f10290c.a());
            default:
                return b();
        }
    }

    public kh0 b() {
        qd0 qd0Var = (qd0) this.f10290c.a();
        this.f10289b.b();
        return new kh0(9, qd0Var);
    }

    public /* synthetic */ d10(a10 a10Var, es1 es1Var, int i4) {
        this.f10288a = i4;
        this.f10289b = a10Var;
        this.f10290c = es1Var;
    }
}
