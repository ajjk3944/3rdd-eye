package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.ko, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1440ko implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15277a;

    /* renamed from: b, reason: collision with root package name */
    public final C1907tN f15278b;

    public /* synthetic */ C1440ko(C1907tN c1907tN, int i) {
        this.f15277a = i;
        this.f15278b = c1907tN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        ID od;
        switch (this.f15277a) {
            case 0:
                return new C1283hr(20, (C0636Nb) this.f15278b.f16902a);
            case 1:
                return new L6(26, (C0893ai) this.f15278b.f16902a);
            case 2:
                return new Gr(3, (C1822rt) this.f15278b.f16902a);
            case 3:
                return new Ks((Ct) this.f15278b.f16902a);
            case 4:
                File dir = ((Context) this.f15278b.f16902a).getDir("yqzdkcache", 0);
                Cr.v(dir);
                return dir;
            case 5:
                ExecutorService executorService = (ExecutorService) this.f15278b.f16902a;
                if (executorService instanceof ID) {
                    od = (ID) executorService;
                } else {
                    od = executorService instanceof ScheduledExecutorService ? new OD((ScheduledExecutorService) executorService) : new C0623Mf(executorService);
                }
                Cr.v(od);
                return od;
            case 6:
                return new C2097wy((ExecutorService) this.f15278b.f16902a);
            default:
                DisplayMetrics displayMetrics = ((Context) this.f15278b.f16902a).getResources().getDisplayMetrics();
                Cr.v(displayMetrics);
                return displayMetrics;
        }
    }
}
