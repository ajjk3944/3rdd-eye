package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ym0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18804a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18805b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18806c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18807d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18808e;

    public ym0(String str, boolean z3, boolean z10, boolean z11, boolean z12) {
        this.f18804a = str;
        this.f18805b = z3;
        this.f18806c = z10;
        this.f18807d = z11;
        this.f18808e = z12;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void c(Object obj) {
        Bundle bundle = ((t50) obj).f16705a;
        String str = this.f18804a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z3 = this.f18805b;
        bundle.putInt("test_mode", z3 ? 1 : 0);
        boolean z10 = this.f18806c;
        bundle.putInt("linked_device", z10 ? 1 : 0);
        if (z3 || z10) {
            pk pkVar = sk.f16404xa;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                bundle.putInt("risd", !this.f18807d ? 1 : 0);
            }
            if (((Boolean) sVar.f36166c.a(sk.Ba)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f18808e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void h(Object obj) {
        Bundle bundle = ((t50) obj).f16706b;
        String str = this.f18804a;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z3 = this.f18805b;
        bundle.putInt("test_mode", z3 ? 1 : 0);
        boolean z10 = this.f18806c;
        bundle.putInt("linked_device", z10 ? 1 : 0);
        if (z3 || z10) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.Ba)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.f18808e);
            }
        }
    }
}
