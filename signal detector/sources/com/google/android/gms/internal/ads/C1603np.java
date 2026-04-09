package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.np, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1603np implements InterfaceC0730Sk {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15817a;

    /* renamed from: b, reason: collision with root package name */
    public final C1593nf f15818b;

    public C1603np(Context context, C1593nf c1593nf) {
        this.f15817a = context;
        this.f15818b = c1593nf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void E(C1807re c1807re) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void w(Xt xt) {
        String str = ((St) xt.f12510b.f15174c).f11272e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1593nf c1593nf = this.f15818b;
        Context context = this.f15817a;
        c1593nf.getClass();
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8649P0)).booleanValue() && c1593nf.a(context) && C1593nf.g(context)) {
            synchronized (c1593nf.i) {
            }
        }
        c1593nf.h(context, null, "_aq", str);
    }
}
