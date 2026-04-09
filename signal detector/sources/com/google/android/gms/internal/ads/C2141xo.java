package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.xo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2141xo implements InterfaceC1545ml {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f17627a = new Bundle();

    @Override // com.google.android.gms.internal.ads.InterfaceC1545ml
    public final void F(String str) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1545ml
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1545ml
    public final synchronized void c(String str) {
        this.f17627a.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1545ml
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1545ml
    public final synchronized void f(String str, String str2) {
        this.f17627a.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1545ml
    public final synchronized void v(String str) {
        this.f17627a.putInt(str, 2);
    }
}
