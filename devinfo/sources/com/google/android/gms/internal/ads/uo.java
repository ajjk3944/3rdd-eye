package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class uo implements oo {

    /* renamed from: a, reason: collision with root package name */
    public final ua.a f17265a;

    /* renamed from: b, reason: collision with root package name */
    public final qd0 f17266b;

    /* renamed from: d, reason: collision with root package name */
    public final ts f17268d;

    /* renamed from: e, reason: collision with root package name */
    public final lh0 f17269e;

    /* renamed from: f, reason: collision with root package name */
    public final t20 f17270f;
    public final s50 g;

    /* renamed from: c, reason: collision with root package name */
    public za.l f17267c = null;

    /* renamed from: h, reason: collision with root package name */
    public xa.a f17271h = null;

    /* renamed from: i, reason: collision with root package name */
    public final ex f17272i = fx.g;

    public uo(ua.a aVar, ts tsVar, lh0 lh0Var, qd0 qd0Var, t20 t20Var, s50 s50Var) {
        this.f17265a = aVar;
        this.f17268d = tsVar;
        this.f17269e = lh0Var;
        this.f17266b = qd0Var;
        this.f17270f = t20Var;
        this.g = s50Var;
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

    public static Uri b(Context context, oe oeVar, Uri uri, View view, Activity activity, jq0 jq0Var) {
        if (oeVar != null) {
            try {
                if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16216ld)).booleanValue() || jq0Var == null) {
                    if (oeVar.c(uri)) {
                        return oeVar.b(uri, context, view, activity);
                    }
                } else if (oeVar.c(uri)) {
                    return jq0Var.a(uri, context, view, activity);
                }
            } catch (pe unused) {
            } catch (Exception e2) {
                ua.j.C.f35265h.f("OpenGmsgHandler.maybeAddClickSignalsToUri", e2);
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
        } catch (UnsupportedOperationException e2) {
            za.i.f("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e2);
            return uri;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0084, code lost:
    
        if (((java.lang.Boolean) va.s.f36163e.f36166c.a(com.google.android.gms.internal.ads.sk.H9)).booleanValue() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e3, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) va.s.f36163e.f36166c.a(com.google.android.gms.internal.ads.sk.C9)).booleanValue() : ((java.lang.Boolean) va.s.f36163e.f36166c.a(com.google.android.gms.internal.ads.sk.B9)).booleanValue()) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(va.a r11, android.content.Context r12, java.lang.String r13, java.lang.String r14) throws xa.g, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uo.d(va.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final void e(Context context, String str, String str2) {
        lh0 lh0Var = this.f17269e;
        lh0Var.e(str);
        qd0 qd0Var = this.f17266b;
        if (qd0Var != null) {
            yr1.h("dialog_not_shown_reason", str2);
            qh0.i4(context, qd0Var, lh0Var, str, "dialog_not_shown", z51.d(1, new Object[]{"dialog_not_shown_reason", str2}, null));
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
    public final void f(va.a r17, java.util.Map r18, boolean r19, java.lang.String r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uo.f(va.a, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    public final void g(boolean z3) {
        ts tsVar = this.f17268d;
        if (tsVar != null) {
            tsVar.C(z3);
        }
    }

    public final void h(int i4) {
        qd0 qd0Var;
        String str;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16271p5)).booleanValue() || (qd0Var = this.f17266b) == null) {
            return;
        }
        rt rtVarA = qd0Var.a();
        rtVarA.u("action", "cct_action");
        switch (i4) {
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
        rtVarA.u("cct_open_status", str);
        rtVarA.v();
    }

    @Override // com.google.android.gms.internal.ads.oo
    public final void k(Object obj, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        t20 t20Var;
        va.a aVar = (va.a) obj;
        String str = (String) map.get("u");
        HashMap map2 = new HashMap();
        qz qzVar = (qz) aVar;
        if (qzVar.s() != null) {
            map2 = qzVar.s().f18115w0;
        }
        String strA = a80.a(str, qzVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            za.i.h("Action missing from an open GMSG.");
            return;
        }
        ua.a aVar2 = this.f17265a;
        if (aVar2 != null && !aVar2.a()) {
            aVar2.b(strA);
        } else {
            vd.b bVarA = (((Boolean) va.s.f36163e.f36166c.a(sk.f16261ob)).booleanValue() && (t20Var = this.f17270f) != null && t20.b(strA)) ? t20Var.a(strA, va.r.g.f36161e) : yo0.e(strA);
            bVarA.a(new q81(0, bVarA, new aw(this, map, aVar, str2, 5)), this.f17272i);
        }
    }
}
