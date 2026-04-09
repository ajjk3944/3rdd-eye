package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1828rz extends AbstractC2098wz {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f16653f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final Object f16654g;

    public C1828rz(S5 s5, C1291hz c1291hz, Xx xx, C1948uA c1948uA) {
        super("+u39B3Ru+as7tqO802m94mg9PjfYQkgFzji5XgHtCyBf/YnuIOHxMwz3OLEd09xH", "kRKvziikDPxXOyKPxf3roAGIVsl+QZcLY0mCgeB7yN4=", s5, c1291hz, c1948uA.a(116));
        this.f16654g = xx;
    }

    private final void b(Method method, S5 s5) {
        Object[] objArr = (Object[]) method.invoke("", ((Xx) this.f16654g).G());
        objArr.getClass();
        synchronized (s5) {
            String str = (String) objArr[0];
            s5.b();
            ((C1136f6) s5.f13551b).F0(str);
            String str2 = (String) objArr[1];
            s5.b();
            ((C1136f6) s5.f13551b).l0(str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2098wz
    public final void a(Method method, S5 s5) {
        switch (this.f16653f) {
            case 0:
                b(method, s5);
                return;
            default:
                Map map = (Map) this.f16654g;
                Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get("vf"));
                objArr.getClass();
                synchronized (s5) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    s5.b();
                    ((C1136f6) s5.f13551b).J0(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    if (jLongValue2 >= 0) {
                        s5.b();
                        ((C1136f6) s5.f13551b).h0(jLongValue2);
                    }
                    long jLongValue3 = ((Long) objArr[2]).longValue();
                    if (jLongValue3 >= 0) {
                        s5.b();
                        ((C1136f6) s5.f13551b).i0(jLongValue3);
                    }
                }
                return;
        }
    }

    public C1828rz(S5 s5, C1291hz c1291hz, Map map, C1948uA c1948uA) {
        super("DoplGqb2T7yuEuU5Q/qB4xZESNb88h/QJW4dcmkvxhTQcQzfkR6CzgZ/7IxnBujg", "t9POLaVAVF/e8zEpIMQR1NYpTbKPa6FoDXMGzMPACVE=", s5, c1291hz, c1948uA.a(118));
        this.f16654g = map;
    }
}
