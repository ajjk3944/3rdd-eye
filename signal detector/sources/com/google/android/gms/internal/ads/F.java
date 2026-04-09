package com.google.android.gms.internal.ads;

import android.os.Trace;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JP f8055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f8057c;

    public F(H h6, JP jp, int i, long j6) {
        this.f8055a = jp;
        this.f8056b = i;
        this.f8057c = h6;
    }

    public final void a() {
        H h6 = this.f8057c;
        h6.getClass();
        Trace.beginSection("dropVideoBuffer");
        this.f8055a.E(this.f8056b);
        Trace.endSection();
        h6.t0(0, 1);
    }
}
