package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.OnSuccessListener;
import com.yandex.mobile.ads.impl.nr0;
import o0.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class O5 implements nr0.a, OnSuccessListener, b.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f24220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24221c;

    public /* synthetic */ O5(Object obj, boolean z10) {
        this.f24221c = obj;
        this.f24220b = z10;
    }

    @Override // o0.b.c
    public Object i(b.a aVar) {
        v.i0 i0Var = (v.i0) this.f24221c;
        i0Var.getClass();
        i0Var.f46712b.execute(new com.applovin.impl.F(i0Var, this.f24220b, aVar, 3));
        return "enableExternalFlashAeMode";
    }

    @Override // com.yandex.mobile.ads.impl.nr0.a
    public void invoke(Object obj) {
        boolean z10 = this.f24220b;
        ((ed) obj).getClass();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        SharedPreferences.Editor editorEdit = n5.r.a((Context) this.f24221c).edit();
        editorEdit.putBoolean("proxy_retention", this.f24220b);
        editorEdit.apply();
    }
}
