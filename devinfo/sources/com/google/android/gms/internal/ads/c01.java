package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c01 extends h01 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9894f = 0;
    public final Object g;

    public c01(zc zcVar, sz0 sz0Var, sx0 sx0Var, g21 g21Var) {
        super("+u39B3Ru+as7tqO802m94mg9PjfYQkgFzji5XgHtCyBf/YnuIOHxMwz3OLEd09xH", "kRKvziikDPxXOyKPxf3roAGIVsl+QZcLY0mCgeB7yN4=", zcVar, sz0Var, g21Var.a(116));
        this.g = sx0Var;
    }

    private final void b(Method method, zc zcVar) {
        Object[] objArr = (Object[]) method.invoke("", ((sx0) this.g).G());
        objArr.getClass();
        synchronized (zcVar) {
            String str = (String) objArr[0];
            zcVar.b();
            ((md) zcVar.f14755b).F0(str);
            String str2 = (String) objArr[1];
            zcVar.b();
            ((md) zcVar.f14755b).l0(str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.h01
    public final void a(Method method, zc zcVar) {
        switch (this.f9894f) {
            case 0:
                b(method, zcVar);
                return;
            default:
                Map map = (Map) this.g;
                Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
                objArr.getClass();
                synchronized (zcVar) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    zcVar.b();
                    ((md) zcVar.f14755b).J0(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    if (jLongValue2 >= 0) {
                        zcVar.b();
                        ((md) zcVar.f14755b).h0(jLongValue2);
                    }
                    long jLongValue3 = ((Long) objArr[2]).longValue();
                    if (jLongValue3 >= 0) {
                        zcVar.b();
                        ((md) zcVar.f14755b).i0(jLongValue3);
                    }
                }
                return;
        }
    }

    public c01(zc zcVar, sz0 sz0Var, Map map, g21 g21Var) {
        super("DoplGqb2T7yuEuU5Q/qB4xZESNb88h/QJW4dcmkvxhTQcQzfkR6CzgZ/7IxnBujg", "t9POLaVAVF/e8zEpIMQR1NYpTbKPa6FoDXMGzMPACVE=", zcVar, sz0Var, g21Var.a(118));
        this.g = map;
    }
}
