package com.google.android.gms.internal.ads;

import android.content.Context;
import f4.InterfaceFutureC2326a;
import x0.C2987b;
import z0.C3014a;

/* renamed from: com.google.android.gms.internal.ads.wk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2083wk implements InterfaceC1223gl, ZA {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17470a;

    public /* synthetic */ C2083wk(Context context) {
        this.f17470a = context;
    }

    @Override // com.google.android.gms.internal.ads.ZA
    public /* synthetic */ Object a() {
        new C1884t0();
        return new EO(this.f17470a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((InterfaceC2029vk) obj).c(this.f17470a);
    }

    public InterfaceFutureC2326a c(boolean z6) {
        try {
            C3014a c3014a = new C3014a(z6);
            C2987b c2987bA = C2987b.a(this.f17470a);
            return c2987bA != null ? c2987bA.b(c3014a) : AbstractC1984ut.w(new IllegalStateException());
        } catch (Exception e6) {
            return AbstractC1984ut.w(e6);
        }
    }
}
