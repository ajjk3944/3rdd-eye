package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import f4.InterfaceFutureC2326a;
import java.util.HashMap;
import java.util.Map;
import p2.C2771a;
import q2.C2841s;
import q2.InterfaceC2806a;
import s2.InterfaceC2891a;

/* renamed from: com.google.android.gms.internal.ads.Jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0568Jb implements InterfaceC0466Db {

    /* renamed from: a, reason: collision with root package name */
    public final C2771a f9311a;

    /* renamed from: b, reason: collision with root package name */
    public final C0784Vn f9312b;

    /* renamed from: d, reason: collision with root package name */
    public final C0468Dd f9314d;

    /* renamed from: e, reason: collision with root package name */
    public final C0633Mp f9315e;

    /* renamed from: f, reason: collision with root package name */
    public final C2189yi f9316f;

    /* renamed from: g, reason: collision with root package name */
    public final C0780Vj f9317g;

    /* renamed from: c, reason: collision with root package name */
    public u2.n f9313c = null;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2891a f9318h = null;
    public final C0623Mf i = AbstractC0640Nf.f10011g;

    public C0568Jb(C2771a c2771a, C0468Dd c0468Dd, C0633Mp c0633Mp, C0784Vn c0784Vn, C2189yi c2189yi, C0780Vj c0780Vj) {
        this.f9311a = c2771a;
        this.f9314d = c0468Dd;
        this.f9315e = c0633Mp;
        this.f9312b = c0784Vn;
        this.f9316f = c2189yi;
        this.f9317g = c0780Vj;
    }

    public static int a(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri b(Context context, H6 h6, Uri uri, View view, Activity activity, C1068du c1068du) {
        if (h6 != null) {
            try {
                if (!((Boolean) C2841s.f23267e.f23270c.a(H9.jd)).booleanValue() || c1068du == null) {
                    if (h6.c(uri)) {
                        return h6.b(uri, context, view, activity);
                    }
                } else if (h6.c(uri)) {
                    return c1068du.a(uri, context, view, activity);
                }
            } catch (I6 unused) {
            } catch (Exception e6) {
                p2.j.f22785C.f22795h.f("OpenGmsgHandler.maybeAddClickSignalsToUri", e6);
            }
        }
        return uri;
    }

    public static Uri c(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e6) {
            u2.k.f("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e6);
            return uri;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (((java.lang.Boolean) q2.C2841s.f23267e.f23270c.a(com.google.android.gms.internal.ads.H9.F9)).booleanValue() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e3, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) q2.C2841s.f23267e.f23270c.a(com.google.android.gms.internal.ads.H9.A9)).booleanValue() : ((java.lang.Boolean) q2.C2841s.f23267e.f23270c.a(com.google.android.gms.internal.ads.H9.z9)).booleanValue()) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(q2.InterfaceC2806a r11, android.content.Context r12, java.lang.String r13, java.lang.String r14) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException, s2.g {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0568Jb.d(q2.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0466Db
    public final void e(Object obj, Map map) {
        C2189yi c2189yi;
        InterfaceC2806a interfaceC2806a = (InterfaceC2806a) obj;
        String str = (String) map.get("u");
        HashMap map2 = new HashMap();
        InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) interfaceC2806a;
        if (interfaceC0828Yg.J() != null) {
            map2 = interfaceC0828Yg.J().f10799w0;
        }
        String strB = AbstractC0933bL.b(str, interfaceC0828Yg.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            u2.k.h("Action missing from an open GMSG.");
            return;
        }
        C2771a c2771a = this.f9311a;
        if (c2771a != null && !c2771a.a()) {
            c2771a.b(strB);
        } else {
            InterfaceFutureC2326a interfaceFutureC2326aA = (((Boolean) C2841s.f23267e.f23270c.a(H9.mb)).booleanValue() && (c2189yi = this.f9316f) != null && C2189yi.b(strB)) ? c2189yi.a(strB, q2.r.f23260g.f23265e) : AbstractC1984ut.e(strB);
            interfaceFutureC2326aA.a(new CD(interfaceFutureC2326aA, 0, new C1431kf(this, map, interfaceC2806a, str2, 5)), this.i);
        }
    }

    public final void f(Context context, String str, String str2) {
        C0633Mp c0633Mp = this.f9315e;
        c0633Mp.b(str);
        C0784Vn c0784Vn = this.f9312b;
        if (c0784Vn != null) {
            C1476lN.g("dialog_not_shown_reason", str2);
            BinderC0718Rp.L3(context, c0784Vn, c0633Mp, str, "dialog_not_shown", C1465lC.d(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0153, code lost:
    
        r6 = r13;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(q2.InterfaceC2806a r17, java.util.Map r18, boolean r19, java.lang.String r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0568Jb.g(q2.a, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    public final void h(boolean z6) {
        C0468Dd c0468Dd = this.f9314d;
        if (c0468Dd != null) {
            c0468Dd.E(z6);
        }
    }

    public final void i(int i) {
        C0784Vn c0784Vn;
        String str;
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8808p5)).booleanValue() || (c0784Vn = this.f9312b) == null) {
            return;
        }
        C0697Ql c0697QlA = c0784Vn.a();
        c0697QlA.r("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        c0697QlA.r("cct_open_status", str);
        c0697QlA.s();
    }
}
