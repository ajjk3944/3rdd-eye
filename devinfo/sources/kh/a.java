package kh;

import ee.j;
import ja.c;
import java.util.HashMap;
import je.y;
import kf.b;
import lf.g;
import org.json.JSONException;
import vk.i;
import yj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final n f28294a = a.a.u(new b6.a(16));

    /* renamed from: b, reason: collision with root package name */
    public static c f28295b;

    public static final void a() {
        if (f28295b == null) {
            return;
        }
        b bVarA = b.a();
        g gVar = bVarA.g;
        long j = gVar.g.f28797a.getLong("minimum_fetch_interval_in_seconds", g.f28762i);
        HashMap map = new HashMap(gVar.f28769h);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        gVar.f28767e.b().continueWithTask(gVar.f28765c, new ge.a(gVar, j, map)).onSuccessTask(j.f23422a, new y(4)).onSuccessTask(bVarA.f28264c, new kf.a(bVarA)).addOnCompleteListener(new y(11));
    }

    public static Object b(Object obj, String str) throws JSONException {
        if (f28295b == null) {
            return obj;
        }
        String strX = c.x(str);
        Object objC = null;
        if (!i.H0(strX)) {
            try {
                com.google.gson.j jVar = (com.google.gson.j) f28294a.getValue();
                Class<?> cls = obj.getClass();
                jVar.getClass();
                objC = jVar.c(strX, new xf.a(cls));
            } catch (Exception unused) {
            }
        }
        return objC == null ? obj : objC;
    }
}
