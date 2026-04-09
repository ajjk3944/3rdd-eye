package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i42 implements y32 {
    public final su1 f;
    public final mv2 g;
    public final o82 i;
    public final jz2 j;
    public final gj2 k;
    public final im2 l;
    public ug4 h = null;
    public id1 m = null;
    public final ld2 n = md2.g;

    public i42(su1 su1Var, o82 o82Var, jz2 jz2Var, mv2 mv2Var, gj2 gj2Var, im2 im2Var) {
        this.f = su1Var;
        this.i = o82Var;
        this.j = jz2Var;
        this.g = mv2Var;
        this.k = gj2Var;
        this.l = im2Var;
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

    public static Uri b(Context context, vs1 vs1Var, Uri uri, View view, Activity activity, m83 m83Var) {
        if (vs1Var != null) {
            try {
                if (!((Boolean) tw1.e.c.a(mz1.Mc)).booleanValue() || m83Var == null) {
                    if (vs1Var.c(uri)) {
                        return vs1Var.b(uri, context, view, activity);
                    }
                } else if (vs1Var.c(uri)) {
                    return m83Var.a(uri, context, view, activity);
                }
            } catch (ws1 unused) {
            } catch (Exception e) {
                hg4.C.h.d("OpenGmsgHandler.maybeAddClickSignalsToUri", e);
            }
        }
        return uri;
    }

    public static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e) {
            gi2.c0("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
            return uri;
        }
    }

    @Override // defpackage.y32
    public final void c(Object obj, Map map) {
        gj2 gj2Var;
        fd1 fd1Var = (fd1) obj;
        String str = (String) map.get("u");
        HashMap map2 = new HashMap();
        ag2 ag2Var = (ag2) fd1Var;
        if (ag2Var.F() != null) {
            map2 = ag2Var.F().w0;
        }
        String strE = m54.E(str, ag2Var.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            gi2.i0("Action missing from an open GMSG.");
            return;
        }
        su1 su1Var = this.f;
        if (su1Var != null && !su1Var.a()) {
            su1Var.b(strE);
        } else {
            n70 n70VarA = (((Boolean) tw1.e.c.a(mz1.Pa)).booleanValue() && (gj2Var = this.k) != null && gj2.b(strE)) ? gj2Var.a(strE, sv1.f.e) : pu1.r(strE);
            n70VarA.c(new jq3(n70VarA, new mc2(this, map, fd1Var, str2, 10), 0), this.n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (((java.lang.Boolean) defpackage.tw1.e.c.a(defpackage.mz1.i9)).booleanValue() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fb, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) defpackage.tw1.e.c.a(defpackage.mz1.d9)).booleanValue() : ((java.lang.Boolean) defpackage.tw1.e.c.a(defpackage.mz1.c9)).booleanValue()) != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(defpackage.fd1 r11, android.content.Context r12, java.lang.String r13, java.lang.String r14) throws java.lang.IllegalAccessException, defpackage.ht3, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i42.e(fd1, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final void f(Context context, String str, String str2) {
        jz2 jz2Var = this.j;
        jz2Var.c(str);
        mv2 mv2Var = this.g;
        if (mv2Var != null) {
            ob1.v("dialog_not_shown_reason", str2);
            pz2.C3(context, mv2Var, jz2Var, str, "dialog_not_shown", xn3.d(1, new Object[]{"dialog_not_shown_reason", str2}, null));
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
    public final void g(defpackage.fd1 r17, java.util.Map r18, boolean r19, java.lang.String r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i42.g(fd1, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    public final void h(boolean z) {
        o82 o82Var = this.i;
        if (o82Var != null) {
            o82Var.K(z);
        }
    }

    public final void i(int i) {
        mv2 mv2Var;
        String str;
        if (!((Boolean) tw1.e.c.a(mz1.Y4)).booleanValue() || (mv2Var = this.g) == null) {
            return;
        }
        lv2 lv2VarA = mv2Var.a();
        lv2VarA.k("action", "cct_action");
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
        lv2VarA.k("cct_open_status", str);
        lv2VarA.m();
    }
}
