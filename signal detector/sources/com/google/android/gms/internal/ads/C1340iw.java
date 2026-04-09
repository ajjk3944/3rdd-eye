package com.google.android.gms.internal.ads;

import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.iw, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1340iw implements InterfaceC1070dw {

    /* renamed from: d, reason: collision with root package name */
    public static C1340iw f14825d;

    /* renamed from: a, reason: collision with root package name */
    public float f14826a;

    /* renamed from: b, reason: collision with root package name */
    public Zv f14827b;

    /* renamed from: c, reason: collision with root package name */
    public C1016cw f14828c;

    public static C1340iw a() {
        if (f14825d == null) {
            C1340iw c1340iw = new C1340iw();
            c1340iw.f14826a = 0.0f;
            f14825d = c1340iw;
        }
        return f14825d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1070dw
    public final void b(boolean z6) {
        if (z6) {
            C1933tw.f16994g.getClass();
            C1933tw.b();
            return;
        }
        C1933tw.f16994g.getClass();
        Handler handler = C1933tw.i;
        if (handler != null) {
            handler.removeCallbacks(C1933tw.f16997k);
            C1933tw.i = null;
        }
    }
}
