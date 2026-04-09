package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class zx2 {
    public static final Pattern p = Pattern.compile("\\?");
    public final th2 a;
    public final Context b;
    public final e51 c;
    public final l83 d;
    public final Executor e;
    public final ScheduledExecutorService f;
    public final String g;
    public final da3 h;
    public final jv2 i;
    public final eb3 j;
    public final io2 k;
    public final Object l = new Object();
    public String m;
    public List n;
    public Bundle o;

    public zx2(th2 th2Var, Context context, e51 e51Var, l83 l83Var, ld2 ld2Var, String str, da3 da3Var, jv2 jv2Var, ts0 ts0Var, ScheduledExecutorService scheduledExecutorService, eb3 eb3Var, io2 io2Var) {
        this.a = th2Var;
        this.b = context;
        this.c = e51Var;
        this.d = l83Var;
        this.e = ld2Var;
        this.g = str;
        this.h = da3Var;
        this.i = jv2Var;
        this.f = scheduledExecutorService;
        this.j = eb3Var;
        this.k = io2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gp3 a(java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx2.a(java.lang.String, java.lang.String):gp3");
    }

    public final void b(int i) {
        Bundle bundle = this.i.e;
        if (((Boolean) tw1.e.c.a(mz1.B7)).booleanValue()) {
            ga1.n(hg4.C.k, bundle, ga1.b(i));
        }
    }

    public final String c(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.g));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            gi2.i0("Failed to update the ad types for rendering. ".concat(e.toString()));
            return str;
        }
    }
}
