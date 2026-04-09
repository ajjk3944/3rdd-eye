package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.cA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0976cA implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1031dA f13538b;

    public /* synthetic */ CallableC0976cA(C1031dA c1031dA, int i) {
        this.f13537a = i;
        this.f13538b = c1031dA;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f13537a) {
            case 0:
                Jz jz = this.f13538b.f13734a;
                Ly lyB = jz.b(1);
                if (lyB == null) {
                    jz.f9407e.b(15315);
                    return null;
                }
                String strA = lyB.A().A();
                File fileB = AbstractC0582Jp.b(strA, "pcam.jar", jz.c());
                fileB.getClass();
                if (!fileB.exists()) {
                    fileB = AbstractC0582Jp.b(strA, "pcam", jz.c());
                    fileB.getClass();
                }
                File fileB2 = AbstractC0582Jp.b(strA, "pcopt", jz.c());
                fileB2.getClass();
                File fileB3 = AbstractC0582Jp.b(strA, "pcbc", jz.c());
                fileB3.getClass();
                return new Tw(lyB.A(), fileB, fileB3, fileB2);
            default:
                Ly lyB2 = this.f13538b.f13734a.b(1);
                return lyB2 == null ? Ly.F() : lyB2;
        }
    }
}
