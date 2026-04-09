package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import q2.C2841s;
import t2.AbstractC2906B;
import t2.C2928l;

/* loaded from: classes.dex */
public final /* synthetic */ class B9 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ B9 f7306b = new B9(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ B9 f7307c = new B9(2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ B9 f7308d = new B9(3);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ B9 f7309e = new B9(6);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ B9 f7310f = new B9(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7311a;

    public /* synthetic */ B9(int i) {
        this.f7311a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.f7311a) {
            case 0:
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            case 1:
                p2.j jVar = p2.j.f22785C;
                jVar.f22797k.getClass();
                return new C1660os(System.currentTimeMillis() - jVar.f22795h.i().s().f7977f);
            case 2:
                p2.j jVar2 = p2.j.f22785C;
                C2928l c2928l = jVar2.f22801o;
                synchronized (c2928l.f23631a) {
                    str = c2928l.f23633c;
                }
                return new Xr(str, jVar2.f22801o.h(), 1);
            case 3:
                Bundle bundle = new Bundle();
                Runtime runtime = Runtime.getRuntime();
                bundle.putLong("runtime_free", runtime.freeMemory());
                bundle.putLong("runtime_max", runtime.maxMemory());
                bundle.putLong("runtime_total", runtime.totalMemory());
                p2.j jVar3 = p2.j.f22785C;
                bundle.putInt("web_view_count", jVar3.f22795h.f8977k.get());
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.Df)).booleanValue()) {
                    ActivityManager.MemoryInfo memoryInfoI = u2.f.i(jVar3.f22795h.f8972e);
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
                return new Ur(1, bundle);
            case 4:
                E9 e9 = H9.a6;
                C2841s c2841s = C2841s.f23267e;
                if (!((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                    return new Or(null, 3);
                }
                if (!((Boolean) c2841s.f23270c.a(H9.j6)).booleanValue()) {
                    p2.j.f22785C.f22810x.getClass();
                    return new Or(C1437kl.h(), 3);
                }
                if (Wr.f12324d == null) {
                    p2.j.f22785C.f22810x.getClass();
                    Wr.f12324d = C1437kl.h();
                }
                return new Or(Wr.f12324d, 3);
            case 5:
                return new C2145xs(1, new JSONObject());
            case 6:
                HashMap map = new HashMap();
                E9 e92 = H9.f8770k0;
                C2841s c2841s2 = C2841s.f23267e;
                String str2 = (String) c2841s2.f23270c.a(e92);
                if (str2 != null && !str2.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) c2841s2.f23270c.a(H9.f8777l0)).intValue()) {
                        for (String str3 : str2.split(",", -1)) {
                            map.put(str3, AbstractC2906B.a(str3));
                        }
                    }
                }
                return new C2253zs(map, 1);
            default:
                return null;
        }
    }
}
