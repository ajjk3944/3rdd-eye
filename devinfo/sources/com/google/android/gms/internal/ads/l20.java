package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l20 implements h20 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13333a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13334b;

    public /* synthetic */ l20(int i4, Object obj) {
        this.f13333a = i4;
        this.f13334b = obj;
    }

    @Override // com.google.android.gms.internal.ads.h20
    public final void a(HashMap map) {
        switch (this.f13333a) {
            case 0:
                if (((Boolean) va.s.f36163e.f36166c.a(sk.Hb)).booleanValue()) {
                    yo0.D(n81.s(((nk) this.f13334b).a(true)), Throwable.class, k20.f12989b, fx.f11274a);
                    return;
                }
                return;
            case 1:
                String str = (String) map.get("render_in_browser");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    ((vp0) this.f13334b).a(Boolean.parseBoolean(str));
                    return;
                } catch (Exception e2) {
                    throw new IllegalStateException("Invalid render_in_browser state", e2);
                }
            default:
                CookieManager cookieManager = (CookieManager) this.f13334b;
                if (cookieManager == null) {
                    return;
                }
                if (((String) map.get("clear")) == null) {
                    String str2 = (String) map.get("cookie");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    cookieManager.setCookie((String) va.s.f36163e.f36166c.a(sk.f16205l1), str2);
                    return;
                }
                String str3 = (String) va.s.f36163e.f36166c.a(sk.f16205l1);
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null) {
                    List listR = rg0.k(new y21(';')).r(cookie);
                    for (int i4 = 0; i4 < listR.size(); i4++) {
                        String str4 = (String) listR.get(i4);
                        rg0 rg0VarK = rg0.k(new y21('='));
                        str4.getClass();
                        j31 j31Var = (j31) ((k31) rg0VarK.f15651b).m(rg0VarK, str4);
                        if (!j31Var.hasNext()) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(0).length() + 70);
                            sb2.append("position (0) must be less than the number of elements that remained (0)");
                            throw new IndexOutOfBoundsException(sb2.toString());
                        }
                        cookieManager.setCookie(str3, String.valueOf((String) j31Var.next()).concat(String.valueOf((String) va.s.f36163e.f36166c.a(sk.X0))));
                    }
                    return;
                }
                return;
        }
    }

    public l20() {
        this.f13333a = 2;
        ua.j.C.f35264f.getClass();
        this.f13334b = ja.c.D();
    }
}
