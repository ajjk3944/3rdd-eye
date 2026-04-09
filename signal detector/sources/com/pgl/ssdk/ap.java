package com.pgl.ssdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdConstant;

/* loaded from: classes.dex */
public class ap extends am {

    /* renamed from: n, reason: collision with root package name */
    private Context f19607n;

    /* renamed from: o, reason: collision with root package name */
    private final int f19608o;

    public ap(Context context, int i) {
        super(context);
        this.f19607n = context;
        this.f19608o = i;
    }

    @Override // com.pgl.ssdk.am
    public String a() {
        int i = this.f19608o;
        if (i == 222) {
            return "/ssdk/v2/r?os=0&ver=7.7.0.0.overseas-rc.1&mode=1&app_ver=" + ab.h(this.f19607n) + "&region=" + ad.a() + "&did=" + com.pgl.ssdk.ces.b.b() + "&aid=" + com.pgl.ssdk.ces.b.a();
        }
        if (i != 301) {
            return null;
        }
        return "/ssdk/sd/token?os=android&app_id=" + com.pgl.ssdk.ces.b.a() + "&did=" + com.pgl.ssdk.ces.b.b() + "&app_ver=" + ab.h(this.f19607n) + "&platform=android&ver=7.7.0.0.overseas-rc.1&mode=1";
    }

    @Override // com.pgl.ssdk.am
    public void a(int i, byte[] bArr) {
        try {
            if (i == 200) {
                int i3 = this.f19608o;
                if (i3 == 222) {
                    ((Integer) com.pgl.ssdk.ces.a.meta(223, null, bArr)).getClass();
                    return;
                }
                if (i3 == 301) {
                    Object objA = a5.a(bArr);
                    au.b("write token result = ".concat(String.valueOf(objA)));
                    if ((objA instanceof Integer) && ((Integer) objA).intValue() == 0) {
                        au.b("write token succ");
                        a5.f19542a = TTAdConstant.MATE_VALID;
                        return;
                    } else {
                        if (objA instanceof String) {
                            a5.f19544c = (String) objA;
                            a5.f19542a = TTAdConstant.MATE_VALID;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            an.b(this.f19607n);
        } catch (Throwable unused) {
        }
    }
}
