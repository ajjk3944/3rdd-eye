package defpackage;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rg2 {
    public final kf3 a;
    public final og2 b;

    public rg2(og2 og2Var, kf3 kf3Var) {
        this.a = kf3Var;
        this.b = og2Var;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            gi2.G("Click string is empty, not proceeding.");
            return "";
        }
        og2 og2Var = this.b;
        vs1 vs1Var = og2Var.g;
        if (vs1Var == null) {
            gi2.G("Signal utils is empty, ignoring.");
            return "";
        }
        rs1 rs1Var = vs1Var.b;
        if (rs1Var == null) {
            gi2.G("Signals object is empty, ignoring.");
            return "";
        }
        if (og2Var.getContext() != null) {
            return rs1Var.h(og2Var.getContext(), str, og2Var, og2Var.f.a);
        }
        gi2.G("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        og2 og2Var = this.b;
        vs1 vs1Var = og2Var.g;
        if (vs1Var == null) {
            gi2.G("Signal utils is empty, ignoring.");
            return "";
        }
        rs1 rs1Var = vs1Var.b;
        if (rs1Var == null) {
            gi2.G("Signals object is empty, ignoring.");
            return "";
        }
        if (og2Var.getContext() != null) {
            return rs1Var.i(og2Var.getContext(), og2Var, og2Var.f.a);
        }
        gi2.G("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public void notify(String str) {
        if (TextUtils.isEmpty(str)) {
            gi2.i0("URL is empty, ignoring message");
        } else {
            lf4.l.post(new n62(this, str, 13));
        }
    }
}
