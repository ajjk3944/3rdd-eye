package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zj2 implements ov1 {
    public ag2 f;
    public final Executor g;
    public final rj2 h;
    public final ym i;
    public boolean j = false;
    public boolean k = false;
    public final wj2 l = new wj2();

    public zj2(Executor executor, rj2 rj2Var, ym ymVar) {
        this.g = executor;
        this.h = rj2Var;
        this.i = ymVar;
    }

    @Override // defpackage.ov1
    public final void S0(nv1 nv1Var) {
        boolean z = this.k ? false : nv1Var.j;
        wj2 wj2Var = this.l;
        wj2Var.a = z;
        this.i.getClass();
        wj2Var.c = SystemClock.elapsedRealtime();
        wj2Var.e = nv1Var;
        if (this.j) {
            a();
        }
    }

    public final void a() {
        try {
            JSONObject jSONObjectP = this.h.p(this.l);
            if (this.f != null) {
                this.g.execute(new n62(this, jSONObjectP, 14));
            }
        } catch (JSONException unused) {
            gi2.R();
        }
    }
}
