package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e03 {
    public final String c;
    public c83 d = null;
    public a83 e = null;
    public qh4 f = null;
    public final Map b = Collections.synchronizedMap(new HashMap());
    public final List a = Collections.synchronizedList(new ArrayList());

    public e03(String str) {
        this.c = str;
    }

    public static String d(a83 a83Var) {
        return ((Boolean) tw1.e.c.a(mz1.V3)).booleanValue() ? a83Var.p0 : a83Var.w;
    }

    public final void a(a83 a83Var) {
        String strD = d(a83Var);
        Map map = this.b;
        Object obj = map.get(strD);
        List list = this.a;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.f);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.f = (qh4) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            qh4 qh4Var = (qh4) list.get(iIndexOf);
            qh4Var.g = 0L;
            qh4Var.h = null;
        }
    }

    public final synchronized void b(a83 a83Var, int i) {
        Map map = this.b;
        String strD = d(a83Var);
        if (map.containsKey(strD)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = a83Var.v;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        qh4 qh4Var = new qh4(a83Var.E, 0L, null, bundle, a83Var.F, a83Var.G, a83Var.H, a83Var.I);
        try {
            this.a.add(i, qh4Var);
        } catch (IndexOutOfBoundsException e) {
            hg4.C.h.d("AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation", e);
        }
        this.b.put(strD, qh4Var);
    }

    public final void c(a83 a83Var, long j, nx2 nx2Var, boolean z) {
        String strD = d(a83Var);
        Map map = this.b;
        if (map.containsKey(strD)) {
            if (this.e == null) {
                this.e = a83Var;
            }
            qh4 qh4Var = (qh4) map.get(strD);
            qh4Var.g = j;
            qh4Var.h = nx2Var;
            if (((Boolean) tw1.e.c.a(mz1.e7)).booleanValue() && z) {
                this.f = qh4Var;
            }
        }
    }
}
