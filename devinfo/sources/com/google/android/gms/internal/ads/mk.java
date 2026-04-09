package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Environment;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ mk f13916b = new mk(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ mk f13917c = new mk(2);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ mk f13918d = new mk(5);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ mk f13919e = new mk(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13920a;

    public /* synthetic */ mk(int i4) {
        this.f13920a = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        switch (this.f13920a) {
            case 0:
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            case 1:
                ua.j jVar = ua.j.C;
                jVar.f35267k.getClass();
                return new om0(System.currentTimeMillis() - jVar.f35265h.i().s().f18214f);
            case 2:
                ua.j jVar2 = ua.j.C;
                t5.p pVar = jVar2.f35271o;
                synchronized (pVar.f34254c) {
                    str = (String) pVar.f34256e;
                }
                return new wl0(1, str, jVar2.f35271o.o());
            case 3:
                pk pkVar = sk.f16040a6;
                va.s sVar = va.s.f36163e;
                if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                    return new ml0(null, 3);
                }
                if (!((Boolean) sVar.f36166c.a(sk.f16181j6)).booleanValue()) {
                    ua.j.C.f35280x.getClass();
                    return new ml0(h80.g(), 3);
                }
                if (vl0.f17645d == null) {
                    ua.j.C.f35280x.getClass();
                    vl0.f17645d = h80.g();
                }
                return new ml0(vl0.f17645d, 3);
            case 4:
                return new do0(new JSONObject());
            case 5:
                HashMap map = new HashMap();
                pk pkVar2 = sk.f16190k0;
                va.s sVar2 = va.s.f36163e;
                String str2 = (String) sVar2.f36166c.a(pkVar2);
                if (str2 != null && !str2.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) sVar2.f36166c.a(sk.f16204l0)).intValue()) {
                        for (String str3 : str2.split(",", -1)) {
                            map.put(str3, ya.z.a(str3));
                        }
                    }
                }
                return new cn0(map, 1);
            default:
                return null;
        }
    }
}
