package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class C9 implements InterfaceC1223gl, ZA {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7545a;

    @Override // com.google.android.gms.internal.ads.ZA
    public /* synthetic */ Object a() {
        return new C0911b(this.f7545a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((InterfaceC2029vk) obj).f(this.f7545a);
    }

    public boolean c(Intent intent) {
        M2.u.f(intent, "Intent can not be null");
        return !this.f7545a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public C9(Context context) {
        M2.u.f(context, "Context can not be null");
        this.f7545a = context;
    }
}
