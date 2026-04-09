package r5;

import b2.C1833n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s5.C5576b;
import s5.C5577c;

/* compiled from: FirebaseRemoteConfig.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final C4.c f45690a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f45691b;

    /* renamed from: c, reason: collision with root package name */
    public final C5576b f45692c;

    /* renamed from: d, reason: collision with root package name */
    public final C5576b f45693d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.c f45694e;

    /* renamed from: f, reason: collision with root package name */
    public final C5577c f45695f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.d f45696g;

    /* renamed from: h, reason: collision with root package name */
    public final h5.c f45697h;
    public final C1833n i;

    /* renamed from: j, reason: collision with root package name */
    public final t5.b f45698j;

    public e(h5.c cVar, C4.c cVar2, Executor executor, C5576b c5576b, C5576b c5576b2, C5576b c5576b3, com.google.firebase.remoteconfig.internal.c cVar3, C5577c c5577c, com.google.firebase.remoteconfig.internal.d dVar, C1833n c1833n, t5.b bVar) {
        this.f45697h = cVar;
        this.f45690a = cVar2;
        this.f45691b = executor;
        this.f45692c = c5576b;
        this.f45693d = c5576b2;
        this.f45694e = cVar3;
        this.f45695f = c5577c;
        this.f45696g = dVar;
        this.i = c1833n;
        this.f45698j = bVar;
    }

    public static ArrayList d(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final HashMap a() {
        C5577c c5577c = this.f45695f;
        HashSet hashSet = new HashSet();
        hashSet.addAll(C5577c.c(c5577c.f46078c));
        hashSet.addAll(C5577c.c(c5577c.f46079d));
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            map.put(str, c5577c.e(str));
        }
        return map;
    }

    public final long b(String str) {
        Long lValueOf;
        C5577c c5577c = this.f45695f;
        C5576b c5576b = c5577c.f46078c;
        com.google.firebase.remoteconfig.internal.b bVarC = c5576b.c();
        Long lValueOf2 = null;
        if (bVarC == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(bVarC.f23299b.getLong(str));
            } catch (JSONException unused) {
            }
        }
        if (lValueOf != null) {
            c5577c.b(str, c5576b.c());
            return lValueOf.longValue();
        }
        com.google.firebase.remoteconfig.internal.b bVarC2 = c5577c.f46079d.c();
        if (bVarC2 != null) {
            try {
                lValueOf2 = Long.valueOf(bVarC2.f23299b.getLong(str));
            } catch (JSONException unused2) {
            }
        }
        if (lValueOf2 != null) {
            return lValueOf2.longValue();
        }
        C5577c.f(str, "Long");
        return 0L;
    }

    public final void c(boolean z10) {
        C1833n c1833n = this.i;
        synchronized (c1833n) {
            ((com.google.firebase.remoteconfig.internal.e) c1833n.f17125b).f23340e = z10;
            if (!z10) {
                c1833n.f();
            }
        }
    }
}
