package defpackage;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ei4 implements dq2 {
    public final jv2 f;
    public final oh4 g;
    public final String h;
    public final int i;

    public ei4(jv2 jv2Var, oh4 oh4Var, String str, int i) {
        this.f = jv2Var;
        this.g = oh4Var;
        this.h = str;
        this.i = i;
    }

    @Override // defpackage.dq2
    public final void a(l22 l22Var) {
        String strOptString;
        if (l22Var == null || this.i == 2) {
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(l22Var.c);
        jv2 jv2Var = this.f;
        oh4 oh4Var = this.g;
        if (zIsEmpty) {
            oh4Var.a(this.h, l22Var.b, jv2Var);
            return;
        }
        try {
            strOptString = new JSONObject(l22Var.c).optString("request_id");
        } catch (JSONException e) {
            hg4.C.h.d("RenderSignals.getRequestId", e);
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        oh4Var.a(strOptString, l22Var.c, jv2Var);
    }

    @Override // defpackage.dq2
    public final void G(String str) {
    }
}
