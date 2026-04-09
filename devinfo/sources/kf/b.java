package kf;

import a0.x0;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import lf.j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f28262a;

    /* renamed from: b, reason: collision with root package name */
    public final xd.c f28263b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f28264c;

    /* renamed from: d, reason: collision with root package name */
    public final lf.b f28265d;

    /* renamed from: e, reason: collision with root package name */
    public final lf.b f28266e;

    /* renamed from: f, reason: collision with root package name */
    public final lf.b f28267f;
    public final lf.g g;

    /* renamed from: h, reason: collision with root package name */
    public final lf.h f28268h;

    /* renamed from: i, reason: collision with root package name */
    public final x0 f28269i;
    public final x0 j;

    public b(Context context, xd.c cVar, Executor executor, lf.b bVar, lf.b bVar2, lf.b bVar3, lf.g gVar, lf.h hVar, x0 x0Var, x0 x0Var2) {
        this.f28262a = context;
        this.f28263b = cVar;
        this.f28264c = executor;
        this.f28265d = bVar;
        this.f28266e = bVar2;
        this.f28267f = bVar3;
        this.g = gVar;
        this.f28268h = hVar;
        this.f28269i = x0Var;
        this.j = x0Var2;
    }

    public static b a() {
        wd.f fVarB = wd.f.b();
        fVarB.a();
        return ((i) fVarB.f36617d.a(i.class)).a();
    }

    public static ArrayList c(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i4);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final void b(boolean z3) {
        x0 x0Var = this.f28269i;
        synchronized (x0Var) {
            ((j) x0Var.f145b).k(z3);
            if (!z3) {
                x0Var.l();
            }
        }
    }
}
