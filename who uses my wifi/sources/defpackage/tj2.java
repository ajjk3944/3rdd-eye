package defpackage;

import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class tj2 implements Runnable {
    public final /* synthetic */ int f = 1;
    public final /* synthetic */ ag2 g;
    public final /* synthetic */ JSONObject h;

    public /* synthetic */ tj2(JSONObject jSONObject, ag2 ag2Var) {
        this.h = jSONObject;
        this.g = ag2Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.f;
        JSONObject jSONObject = this.h;
        ag2 ag2Var = this.g;
        switch (i) {
            case 0:
                String string = jSONObject.toString();
                StringBuilder sb = new StringBuilder(string.length() + 31);
                sb.append("Calling AFMA_updateActiveView(");
                sb.append(string);
                sb.append(")");
                gi2.U(sb.toString());
                ag2Var.b("AFMA_updateActiveView", jSONObject);
                break;
            default:
                sn3 sn3Var = pr2.J;
                ag2Var.c("onVideoEvent", jSONObject);
                break;
        }
    }

    public /* synthetic */ tj2(ag2 ag2Var, JSONObject jSONObject) {
        this.g = ag2Var;
        this.h = jSONObject;
    }
}
