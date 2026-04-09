package defpackage;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class j42 implements k42 {
    public final /* synthetic */ int a = 1;
    public final pd2 b;

    public j42(v32 v32Var, pd2 pd2Var) {
        this.b = pd2Var;
        Objects.requireNonNull(v32Var);
    }

    @Override // defpackage.k42
    public final void w(String str) {
        switch (this.a) {
            case 0:
                this.b.b(new e62(str));
                break;
            default:
                pd2 pd2Var = this.b;
                try {
                    if (str == null) {
                        pd2Var.b(new e62());
                    } else {
                        pd2Var.b(new e62(str));
                    }
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
        }
    }

    @Override // defpackage.k42
    public final void x(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                this.b.a(jSONObject);
                break;
            default:
                pd2 pd2Var = this.b;
                try {
                    pd2Var.a(jSONObject);
                    break;
                } catch (IllegalStateException unused) {
                    return;
                } catch (JSONException e) {
                    pd2Var.b(e);
                }
        }
    }

    public j42(p62 p62Var, pd2 pd2Var) {
        this.b = pd2Var;
    }
}
