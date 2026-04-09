package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zz1 extends il {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final List b = Arrays.asList(((String) tw1.e.c.a(mz1.Ia)).split(","));
    public final b02 c;
    public final il d;
    public final pv2 e;

    public zz1(b02 b02Var, il ilVar, pv2 pv2Var) {
        this.d = ilVar;
        this.c = b02Var;
        this.e = pv2Var;
    }

    @Override // defpackage.il
    public final void a(Bundle bundle, String str) {
        il ilVar = this.d;
        if (ilVar != null) {
            ilVar.a(bundle, str);
        }
    }

    @Override // defpackage.il
    public final Bundle b(Bundle bundle, String str) {
        il ilVar = this.d;
        if (ilVar != null) {
            return ilVar.b(bundle, str);
        }
        return null;
    }

    @Override // defpackage.il
    public final void c(int i, int i2, Bundle bundle) {
        il ilVar = this.d;
        if (ilVar != null) {
            ilVar.c(i, i2, bundle);
        }
    }

    @Override // defpackage.il
    public final void d(Bundle bundle) {
        this.a.set(false);
        il ilVar = this.d;
        if (ilVar != null) {
            ilVar.d(bundle);
        }
    }

    @Override // defpackage.il
    public final void e(int i, Bundle bundle) {
        this.a.set(false);
        il ilVar = this.d;
        if (ilVar != null) {
            ilVar.e(i, bundle);
        }
        hg4 hg4Var = hg4.C;
        hg4Var.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        b02 b02Var = this.c;
        b02Var.j = jCurrentTimeMillis;
        List list = this.b;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        hg4Var.k.getClass();
        b02Var.i = SystemClock.elapsedRealtime() + ((Integer) tw1.e.c.a(mz1.Fa)).intValue();
        if (b02Var.e == null) {
            b02Var.e = new fu1(7, b02Var);
        }
        b02Var.d();
        a30.B(this.e, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // defpackage.il
    public final void f(Bundle bundle, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.a.set(true);
                a30.B(this.e, "pact_action", new Pair("pe", "pact_con"));
                this.c.a(jSONObject.getString("paw_id"));
            }
        } catch (JSONException unused) {
            gi2.R();
        }
        il ilVar = this.d;
        if (ilVar != null) {
            ilVar.f(bundle, str);
        }
    }

    @Override // defpackage.il
    public final void g(int i, Uri uri, boolean z, Bundle bundle) {
        il ilVar = this.d;
        if (ilVar != null) {
            ilVar.g(i, uri, z, bundle);
        }
    }
}
