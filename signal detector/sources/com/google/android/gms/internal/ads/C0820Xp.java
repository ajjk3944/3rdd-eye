package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import org.json.JSONObject;
import q2.C2841s;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.Xp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820Xp {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12496a;

    /* renamed from: b, reason: collision with root package name */
    public final C2951a f12497b;

    /* renamed from: c, reason: collision with root package name */
    public final Qt f12498c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0828Yg f12499d;

    /* renamed from: e, reason: collision with root package name */
    public final C0784Vn f12500e;

    /* renamed from: f, reason: collision with root package name */
    public Vv f12501f;

    public C0820Xp(Context context, C2951a c2951a, Qt qt, InterfaceC0828Yg interfaceC0828Yg, C0784Vn c0784Vn) {
        this.f12496a = context;
        this.f12497b = c2951a;
        this.f12498c = qt;
        this.f12499d = interfaceC0828Yg;
        this.f12500e = c0784Vn;
    }

    public final synchronized boolean a() {
        InterfaceC0828Yg interfaceC0828Yg;
        Qt qt = this.f12498c;
        if (qt.f10750T) {
            E9 e9 = H9.a6;
            C2841s c2841s = C2841s.f23267e;
            if (((Boolean) c2841s.f23270c.a(e9)).booleanValue()) {
                if (((Boolean) c2841s.f23270c.a(H9.d6)).booleanValue() && (interfaceC0828Yg = this.f12499d) != null) {
                    if (this.f12501f != null) {
                        u2.k.h("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.f12496a;
                    p2.j jVar = p2.j.f22785C;
                    jVar.f22810x.getClass();
                    if (!C1437kl.g(context)) {
                        u2.k.h("Unable to initialize omid.");
                        return false;
                    }
                    C1014cu c1014cu = qt.f10752V;
                    c1014cu.getClass();
                    if (((JSONObject) c1014cu.f13695b).optBoolean((String) c2841s.f23270c.a(H9.f6), true)) {
                        C2951a c2951a = this.f12497b;
                        C1437kl c1437kl = jVar.f22810x;
                        WebView webViewT = interfaceC0828Yg.t();
                        c1437kl.getClass();
                        Vv vv = (Vv) C1437kl.p(new C0697Ql(c2951a, 23, webViewT));
                        if (((Boolean) c2841s.f23270c.a(H9.e6)).booleanValue()) {
                            C0784Vn c0784Vn = this.f12500e;
                            String str = vv != null ? "1" : "0";
                            C0697Ql c0697QlA = c0784Vn.a();
                            c0697QlA.r("omid_js_session_success", str);
                            c0697QlA.s();
                        }
                        if (vv == null) {
                            u2.k.h("Unable to create javascript session service.");
                            return false;
                        }
                        u2.k.g("Created omid javascript session service.");
                        this.f12501f = vv;
                        interfaceC0828Yg.H0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        InterfaceC0828Yg interfaceC0828Yg;
        try {
            Vv vv = this.f12501f;
            if (vv == null || (interfaceC0828Yg = this.f12499d) == null) {
                return;
            }
            ArrayList arrayListC = interfaceC0828Yg.C();
            int size = arrayListC.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListC.get(i);
                i++;
                p2.j.f22785C.f22810x.getClass();
                C1437kl.q(new RunnableC0786Vp(vv, 1, (View) obj));
            }
            interfaceC0828Yg.a("onSdkLoaded", C1465lC.f15361g);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        InterfaceC0828Yg interfaceC0828Yg;
        if (this.f12501f == null || (interfaceC0828Yg = this.f12499d) == null) {
            return;
        }
        interfaceC0828Yg.a("onSdkImpression", C1465lC.f15361g);
    }
}
