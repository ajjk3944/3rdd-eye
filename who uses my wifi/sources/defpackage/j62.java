package defpackage;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j62 implements k42 {
    public final x52 a;
    public final pd2 b;
    public final /* synthetic */ k62 c;

    public j62(k62 k62Var, x52 x52Var, pd2 pd2Var) {
        Objects.requireNonNull(k62Var);
        this.c = k62Var;
        this.a = x52Var;
        this.b = pd2Var;
    }

    @Override // defpackage.k42
    public final void w(String str) {
        x52 x52Var = this.a;
        pd2 pd2Var = this.b;
        try {
            if (str == null) {
                pd2Var.b(new e62());
            } else {
                pd2Var.b(new e62(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            x52Var.w();
            throw th;
        }
        x52Var.w();
    }

    @Override // defpackage.k42
    public final void x(JSONObject jSONObject) {
        x52 x52Var = this.a;
        pd2 pd2Var = this.b;
        try {
            try {
                pd2Var.a(((f62) this.c.c).x(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                pd2Var.b(e);
            }
        } finally {
            x52Var.w();
        }
    }
}
