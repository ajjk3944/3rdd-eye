package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class Hz extends Cw {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2259zy f9047f;

    public Hz(Context context, ExecutorService executorService, InterfaceC2259zy interfaceC2259zy) {
        super(context, executorService, new c3.j(), false);
        this.f9047f = interfaceC2259zy;
    }

    @Override // com.google.android.gms.internal.ads.Cw
    public final void b(int i, long j6) {
        ((Hy) this.f9047f).b(i, j6, null, null);
        new c3.j().g(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.Cw
    public final void c(int i, long j6, Exception exc) {
        ((Hy) this.f9047f).b(i, j6, exc, null);
        new c3.j().g(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.Cw
    public final void d(int i, String str) {
        ((Hy) this.f9047f).b(i, -1L, null, str);
        new c3.j().g(Boolean.TRUE);
    }
}
