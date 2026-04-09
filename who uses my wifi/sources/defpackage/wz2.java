package defpackage;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wz2 {
    public final Context a;
    public final e51 b;
    public final a83 c;
    public final ag2 d;
    public final mv2 e;
    public cc3 f;

    public wz2(Context context, e51 e51Var, a83 a83Var, ag2 ag2Var, mv2 mv2Var) {
        this.a = context;
        this.b = e51Var;
        this.c = a83Var;
        this.d = ag2Var;
        this.e = mv2Var;
    }

    public final synchronized boolean a() {
        ag2 ag2Var;
        a83 a83Var = this.c;
        if (a83Var.T) {
            iz1 iz1Var = mz1.G5;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue()) {
                if (((Boolean) tw1Var.c.a(mz1.J5)).booleanValue() && (ag2Var = this.d) != null) {
                    if (this.f != null) {
                        gi2.i0("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.a;
                    hg4 hg4Var = hg4.C;
                    hg4Var.x.getClass();
                    if (!su2.d(context)) {
                        gi2.i0("Unable to initialize omid.");
                        return false;
                    }
                    ug0 ug0Var = a83Var.V;
                    ug0Var.getClass();
                    if (((JSONObject) ug0Var.g).optBoolean((String) tw1Var.c.a(mz1.L5), true)) {
                        e51 e51Var = this.b;
                        su2 su2Var = hg4Var.x;
                        WebView webViewT = ag2Var.t();
                        su2Var.getClass();
                        cc3 cc3Var = (cc3) su2.r(new lv2(e51Var, webViewT, 2));
                        if (((Boolean) tw1Var.c.a(mz1.K5)).booleanValue()) {
                            mv2 mv2Var = this.e;
                            String str = cc3Var != null ? "1" : "0";
                            lv2 lv2VarA = mv2Var.a();
                            lv2VarA.k("omid_js_session_success", str);
                            lv2VarA.m();
                        }
                        if (cc3Var == null) {
                            gi2.i0("Unable to create javascript session service.");
                            return false;
                        }
                        gi2.f0("Created omid javascript session service.");
                        this.f = cc3Var;
                        ag2Var.G(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        ag2 ag2Var;
        try {
            cc3 cc3Var = this.f;
            if (cc3Var == null || (ag2Var = this.d) == null) {
                return;
            }
            ArrayList arrayListA = ag2Var.A();
            int size = arrayListA.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListA.get(i);
                i++;
                hg4.C.x.getClass();
                su2.t(new sz2(cc3Var, (View) obj, 1));
            }
            ag2Var.a("onSdkLoaded", xn3.l);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        ag2 ag2Var;
        if (this.f == null || (ag2Var = this.d) == null) {
            return;
        }
        ag2Var.a("onSdkImpression", xn3.l);
    }
}
