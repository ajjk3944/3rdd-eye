package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class an0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ an0 f9367a = new an0();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        ua.j jVar = ua.j.C;
        bundle.putInt("web_view_count", jVar.f35265h.f19201k.get());
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Ff)).booleanValue()) {
            ActivityManager.MemoryInfo memoryInfoI = za.d.i(jVar.f35265h.f19197e);
            if (memoryInfoI != null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    bundle.putLong("a_ad_mem", memoryInfoI.advertisedMem);
                }
                bundle.putLong("a_total", memoryInfoI.totalMem);
                bundle.putLong("a_avai", memoryInfoI.availMem);
                bundle.putLong("a_threshold", memoryInfoI.threshold);
                bundle.putBoolean("a_is_low_mem", memoryInfoI.lowMemory);
            }
            bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
        }
        return new tl0(1, bundle);
    }
}
