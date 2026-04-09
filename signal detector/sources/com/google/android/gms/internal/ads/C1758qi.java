package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.List;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.qi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1758qi implements InterfaceC1542mi {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16391a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16392b;

    public /* synthetic */ C1758qi(int i, Object obj) {
        this.f16391a = i;
        this.f16392b = obj;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1542mi
    public final void a(HashMap map) {
        switch (this.f16391a) {
            case 0:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.Fb)).booleanValue()) {
                    AbstractC1984ut.D(AbstractC2221zD.r(((C2083wk) this.f16392b).c(true)), Throwable.class, C1704pi.f16201b, AbstractC0640Nf.f10005a);
                    return;
                }
                return;
            case 1:
                String str = (String) map.get("render_in_browser");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    ((Pt) this.f16392b).a(Boolean.parseBoolean(str));
                    return;
                } catch (Exception e6) {
                    throw new IllegalStateException("Invalid render_in_browser state", e6);
                }
            default:
                CookieManager cookieManager = (CookieManager) this.f16392b;
                if (cookieManager == null) {
                    return;
                }
                if (((String) map.get("clear")) == null) {
                    String str2 = (String) map.get("cookie");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    cookieManager.setCookie((String) C2841s.f23267e.f23270c.a(H9.f8778l1), str2);
                    return;
                }
                String str3 = (String) C2841s.f23267e.f23270c.a(H9.f8778l1);
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null) {
                    List listJ = C1448kw.f(new MA(';')).j(cookie);
                    for (int i = 0; i < listJ.size(); i++) {
                        String str4 = (String) listJ.get(i);
                        C1448kw c1448kwF = C1448kw.f(new MA('='));
                        str4.getClass();
                        XA xa = (XA) ((YA) c1448kwF.f15314b).e(c1448kwF, str4);
                        if (!xa.hasNext()) {
                            StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                            sb.append("position (0) must be less than the number of elements that remained (0)");
                            throw new IndexOutOfBoundsException(sb.toString());
                        }
                        cookieManager.setCookie(str3, String.valueOf((String) xa.next()).concat(String.valueOf((String) C2841s.f23267e.f23270c.a(H9.f8694X0))));
                    }
                    return;
                }
                return;
        }
    }

    public C1758qi() {
        this.f16391a = 2;
        p2.j.f22785C.f22793f.getClass();
        this.f16392b = p1.e.g();
    }
}
