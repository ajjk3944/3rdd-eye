package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ee0 implements fs1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10767a;

    /* renamed from: b, reason: collision with root package name */
    public final gs1 f10768b;

    public /* synthetic */ ee0(gs1 gs1Var, int i4) {
        this.f10767a = i4;
        this.f10768b = gs1Var;
    }

    @Override // com.google.android.gms.internal.ads.js1
    public final Object a() {
        switch (this.f10767a) {
            case 0:
                return new mx0(26, (zo) this.f10768b.f11600a);
            case 1:
                return new ne0(9, (t10) this.f10768b.f11600a);
            case 2:
                return new el0(3, (vo0) this.f10768b.f11600a);
            case 3:
                return new on0((hp0) this.f10768b.f11600a);
            case 4:
                File dir = ((Context) this.f10768b.f11600a).getDir("yqzdkcache", 0);
                al0.z(dir);
                return dir;
            case 5:
                ExecutorService executorService = (ExecutorService) this.f10768b.f11600a;
                if (executorService instanceof w81) {
                    return (w81) executorService;
                }
                return executorService instanceof ScheduledExecutorService ? new c91((ScheduledExecutorService) executorService) : new ex(executorService);
            case 6:
                return new ly0((ExecutorService) this.f10768b.f11600a);
            default:
                DisplayMetrics displayMetrics = ((Context) this.f10768b.f11600a).getResources().getDisplayMetrics();
                al0.z(displayMetrics);
                return displayMetrics;
        }
    }
}
