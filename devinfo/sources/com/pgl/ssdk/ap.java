package com.pgl.ssdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdConstant;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ap extends am {

    /* renamed from: n, reason: collision with root package name */
    private Context f21479n;

    /* renamed from: o, reason: collision with root package name */
    private final int f21480o;

    public ap(Context context, int i4) {
        super(context);
        this.f21479n = context;
        this.f21480o = i4;
    }

    @Override // com.pgl.ssdk.am
    public String a() {
        int i4 = this.f21480o;
        if (i4 == 222) {
            return "/ssdk/v2/r?os=0&ver=7.7.0.0.overseas-rc.1&mode=1&app_ver=" + ab.h(this.f21479n) + "&region=" + ad.a() + "&did=" + com.pgl.ssdk.ces.b.b() + "&aid=" + com.pgl.ssdk.ces.b.a();
        }
        if (i4 != 301) {
            return null;
        }
        return "/ssdk/sd/token?os=android&app_id=" + com.pgl.ssdk.ces.b.a() + "&did=" + com.pgl.ssdk.ces.b.b() + "&app_ver=" + ab.h(this.f21479n) + "&platform=android&ver=7.7.0.0.overseas-rc.1&mode=1";
    }

    @Override // com.pgl.ssdk.am
    public void a(int i4, byte[] bArr) {
        try {
            if (i4 == 200) {
                int i10 = this.f21480o;
                if (i10 == 222) {
                    ((Integer) com.pgl.ssdk.ces.a.meta(223, null, bArr)).getClass();
                    return;
                }
                if (i10 == 301) {
                    Object objA = a5.a(bArr);
                    au.b("write token result = ".concat(String.valueOf(objA)));
                    if ((objA instanceof Integer) && ((Integer) objA).intValue() == 0) {
                        au.b("write token succ");
                        a5.f21418a = TTAdConstant.MATE_VALID;
                        return;
                    } else {
                        if (objA instanceof String) {
                            a5.f21420c = (String) objA;
                            a5.f21418a = TTAdConstant.MATE_VALID;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            an.b(this.f21479n);
        } catch (Throwable unused) {
        }
    }
}
