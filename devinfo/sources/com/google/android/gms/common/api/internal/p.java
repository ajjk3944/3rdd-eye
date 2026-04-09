package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.internal.ads.d1;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.n21;
import com.google.android.gms.internal.ads.ne0;
import com.google.android.gms.internal.ads.p21;
import com.google.android.gms.internal.ads.qz;
import com.google.android.gms.internal.ads.s21;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.v21;
import com.google.android.gms.internal.ads.w21;
import com.google.android.gms.internal.ads.xi0;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p implements pb.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9114a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9115b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9116c;

    /* renamed from: d, reason: collision with root package name */
    public Object f9117d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9118e = new t7.s(this, true);

    /* renamed from: f, reason: collision with root package name */
    public Object f9119f = new t7.s(this, false);

    public p(Context context, t7.h hVar, km.n nVar) {
        this.f9115b = context;
        this.f9116c = hVar;
        this.f9117d = nVar;
    }

    @Override // pb.d
    public void a(nb.b bVar) {
        ((d) this.f9119f).f9092m.post(new vd.a(this, false, bVar, 7));
    }

    public void b(nb.b bVar) {
        n nVar = (n) ((d) this.f9119f).j.get((a) this.f9116c);
        if (nVar != null) {
            nVar.m(bVar);
        }
    }

    public synchronized boolean c(Context context) {
        if (!w21.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f9118e = new ne0(20, new s21(context));
        } catch (NullPointerException e2) {
            ya.a0.m("Error connecting LMD Overlay service");
            ua.j.C.f35265h.f("LastMileDeliveryOverlay.bindLastMileDeliveryService", e2);
        }
        if (((ne0) this.f9118e) == null) {
            this.f9114a = false;
            return false;
        }
        if (((km.y) this.f9119f) == null) {
            this.f9119f = new km.y(27, this);
        }
        this.f9114a = true;
        return true;
    }

    public void d(qz qzVar, n21 n21Var) {
        String str = n21Var.f14135b;
        if (qzVar == null) {
            e("adWebview missing", "onLMDShow");
            return;
        }
        this.f9117d = qzVar;
        if (!this.f9114a && !c(qzVar.getContext())) {
            e("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.Lc)).booleanValue()) {
            this.f9116c = str;
        }
        if (((km.y) this.f9119f) == null) {
            this.f9119f = new km.y(27, this);
        }
        ne0 ne0Var = (ne0) this.f9118e;
        if (ne0Var != null) {
            km.y yVar = (km.y) this.f9119f;
            s21 s21Var = (s21) ne0Var.f14280b;
            xi0 xi0Var = s21Var.f15847a;
            if (xi0Var == null) {
                s21.f15845c.d("error: %s", "Play Store not found.");
            } else if (s21.c(yVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, str))) {
                xi0Var.i(new v21(xi0Var, new d1(s21Var, n21Var, yVar, 11), 0));
            }
        }
    }

    public void e(String str, String str2) {
        ya.a0.m(str);
        if (((qz) this.f9117d) != null) {
            HashMap map = new HashMap();
            map.put(PglCryptUtils.KEY_MESSAGE, str);
            map.put("action", str2);
            f(map, "onError");
        }
    }

    public void f(HashMap map, String str) {
        fx.f11279f.execute(new b4.o(this, str, map, false, 23));
    }

    public p21 g() {
        String str;
        String str2 = null;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.Lc)).booleanValue() || TextUtils.isEmpty((String) this.f9116c)) {
            String str3 = (String) this.f9115b;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                e("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = (String) this.f9116c;
        }
        return new p21(str2, str);
    }
}
