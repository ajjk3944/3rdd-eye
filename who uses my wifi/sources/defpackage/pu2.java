package defpackage;

import android.content.Context;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class pu2 {
    public final Context a;
    public final vs1 b;
    public final f02 c;
    public final e51 d;
    public final l92 e;
    public final cx1 f;
    public final go2 g;
    public final pz2 h;
    public final m83 i;
    public final mv2 j;
    public final wg2 k;

    public pu2(Context context, vs1 vs1Var, f02 f02Var, e51 e51Var, l92 l92Var, cx1 cx1Var, go2 go2Var, pz2 pz2Var, m83 m83Var, mv2 mv2Var, wg2 wg2Var) {
        this.a = context;
        this.b = vs1Var;
        this.c = f02Var;
        this.d = e51Var;
        this.e = l92Var;
        this.f = cx1Var;
        this.g = go2Var;
        this.h = pz2Var;
        this.i = m83Var;
        this.j = mv2Var;
        this.k = wg2Var;
    }

    public final ag2 a(xe4 xe4Var, a83 a83Var, c83 c83Var) {
        ag2 ag2VarB = sd2.b(this.a, zq.a(xe4Var), xe4Var.f, false, false, this.b, this.c, this.d, new kf3(23, this), this.e, this.f, a83Var, c83Var, this.h, this.i, this.j);
        if (((Boolean) tw1.e.c.a(mz1.De)).booleanValue()) {
            WebView webViewT = ag2VarB.t();
            if (this.k.a != null) {
                try {
                    int i = c81.a;
                    if (!f81.f.b()) {
                        throw f81.a();
                    }
                    ((WebViewProviderBoundaryInterface) c81.a(webViewT).g).setProfile("GMA_WEBVIEW_PROFILE");
                    gi2.G("WebViewCompat Profile is defined");
                    return ag2VarB;
                } catch (IllegalStateException e) {
                    gi2.i0("WebViewCompat error: ".concat(e.toString()));
                    if (((Boolean) tw1.e.c.a(mz1.Ce)).booleanValue()) {
                        hg4.C.h.d("WebViewCompat.setProfile", e);
                    }
                }
            }
        }
        return ag2VarB;
    }
}
