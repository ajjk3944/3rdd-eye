package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class oh4 {
    public final int a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final Map e;
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();
    public final pv2 h;
    public ConcurrentHashMap i;

    public oh4(pv2 pv2Var) {
        this.h = pv2Var;
        iz1 iz1Var = mz1.l7;
        tw1 tw1Var = tw1.e;
        this.a = ((Integer) tw1Var.c.a(iz1Var)).intValue();
        iz1 iz1Var2 = mz1.m7;
        kz1 kz1Var = tw1Var.c;
        this.b = ((Long) kz1Var.a(iz1Var2)).longValue();
        this.c = ((Boolean) kz1Var.a(mz1.q7)).booleanValue();
        this.d = ((Boolean) kz1Var.a(mz1.p7)).booleanValue();
        this.e = Collections.synchronizedMap(new mf4(this));
    }

    public final synchronized void a(String str, String str2, jv2 jv2Var) {
        hg4.C.k.getClass();
        this.e.put(str, new fg4(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
        c();
        d(jv2Var);
    }

    public final synchronized String b(String str, jv2 jv2Var) {
        fg4 fg4Var = (fg4) this.e.get(str);
        jv2Var.a.put("request_id", str);
        if (fg4Var == null) {
            jv2Var.a.put("mhit", "false");
            return null;
        }
        jv2Var.a.put("mhit", "true");
        return fg4Var.b;
    }

    public final synchronized void c() {
        hg4.C.k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((fg4) entry.getValue()).a.longValue() <= this.b) {
                    break;
                }
                this.g.add(new Pair((String) entry.getKey(), ((fg4) entry.getValue()).b));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            hg4.C.h.d("QueryJsonMap.removeExpiredEntries", e);
        }
    }

    public final synchronized void d(jv2 jv2Var) throws Throwable {
        try {
            try {
                if (this.c) {
                    ArrayDeque arrayDeque = this.g;
                    ArrayDeque arrayDequeClone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.f;
                    ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    md2.a.execute(new vd(this, jv2Var, arrayDequeClone, arrayDequeClone2, 9, false));
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final void e(jv2 jv2Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(jv2Var.a);
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(a30.s(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.h.a(this.i, false);
        }
    }
}
