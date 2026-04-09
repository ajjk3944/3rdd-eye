package defpackage;

import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class yi2 implements si2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ yi2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.si2
    public final void a(HashMap map) {
        switch (this.a) {
            case 0:
                if (((Boolean) tw1.e.c.a(mz1.ib)).booleanValue()) {
                    pu1.L(gq3.r(((x91) this.b).b(true)), Throwable.class, fi1.c, md2.a);
                    return;
                }
                return;
            case 1:
                String str = (String) map.get("render_in_browser");
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                try {
                    ((z73) this.b).a(Boolean.parseBoolean(str));
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException("Invalid render_in_browser state", e);
                }
            default:
                CookieManager cookieManager = (CookieManager) this.b;
                if (cookieManager == null) {
                    return;
                }
                if (((String) map.get("clear")) == null) {
                    String str2 = (String) map.get("cookie");
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    cookieManager.setCookie((String) tw1.e.c.a(mz1.W0), str2);
                    return;
                }
                String str3 = (String) tw1.e.c.a(mz1.W0);
                String cookie = cookieManager.getCookie(str3);
                if (cookie != null) {
                    List listV = sq0.p(new yk3(';')).v(cookie);
                    for (int i = 0; i < listV.size(); i++) {
                        String str4 = (String) listV.get(i);
                        sq0 sq0VarP = sq0.p(new yk3('='));
                        str4.getClass();
                        jl3 jl3Var = (jl3) ((kl3) sq0VarP.g).d(sq0VarP, str4);
                        if (!jl3Var.hasNext()) {
                            StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 70);
                            sb.append("position (0) must be less than the number of elements that remained (0)");
                            throw new IndexOutOfBoundsException(sb.toString());
                        }
                        cookieManager.setCookie(str3, String.valueOf((String) jl3Var.next()).concat(String.valueOf((String) tw1.e.c.a(mz1.I0))));
                    }
                    return;
                }
                return;
        }
    }

    public yi2() {
        this.a = 2;
        hg4.C.f.getClass();
        this.b = bd2.D();
    }
}
