package fb;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.od0;
import com.google.android.gms.internal.ads.pk;
import com.google.android.gms.internal.ads.rk;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.ud0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23890a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23891b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23892c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23893d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f23894e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f23895f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final ud0 f23896h;

    /* renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap f23897i;

    public e0(ud0 ud0Var) {
        this.f23896h = ud0Var;
        pk pkVar = sk.G7;
        va.s sVar = va.s.f36163e;
        this.f23890a = ((Integer) sVar.f36166c.a(pkVar)).intValue();
        pk pkVar2 = sk.H7;
        rk rkVar = sVar.f36166c;
        this.f23891b = ((Long) rkVar.a(pkVar2)).longValue();
        this.f23892c = ((Boolean) rkVar.a(sk.L7)).booleanValue();
        this.f23893d = ((Boolean) rkVar.a(sk.K7)).booleanValue();
        this.f23894e = DesugarCollections.synchronizedMap(new c0(this));
    }

    public final synchronized void a(String str, String str2, od0 od0Var) {
        ua.j.C.f35267k.getClass();
        this.f23894e.put(str, new d0(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
        f();
        g(od0Var);
    }

    public final synchronized String b(String str, od0 od0Var) {
        d0 d0Var = (d0) this.f23894e.get(str);
        od0Var.f14674a.put("request_id", str);
        if (d0Var == null) {
            od0Var.f14674a.put("mhit", "false");
            return null;
        }
        od0Var.f14674a.put("mhit", "true");
        return d0Var.f23887b;
    }

    public final synchronized void c(String str) {
        this.f23894e.remove(str);
    }

    public final synchronized boolean d(String str, String str2) {
        d0 d0Var = (d0) this.f23894e.get(str);
        if (d0Var != null) {
            if (d0Var.f23888c.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean e(int i4, String str, String str2) {
        d0 d0Var = (d0) this.f23894e.get(str);
        if (d0Var == null) {
            return false;
        }
        HashSet hashSet = d0Var.f23888c;
        hashSet.add(str2);
        return hashSet.size() < i4;
    }

    public final synchronized void f() {
        ua.j.C.f35267k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f23894e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((d0) entry.getValue()).f23886a.longValue() <= this.f23891b) {
                    break;
                }
                this.g.add(new Pair((String) entry.getKey(), ((d0) entry.getValue()).f23887b));
                it.remove();
            }
        } catch (ConcurrentModificationException e2) {
            ua.j.C.f35265h.f("QueryJsonMap.removeExpiredEntries", e2);
        }
    }

    public final synchronized void g(od0 od0Var) throws Throwable {
        try {
            try {
                if (this.f23892c) {
                    ArrayDeque arrayDeque = this.g;
                    ArrayDeque arrayDequeClone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.f23895f;
                    ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    fx.f11274a.execute(new ab.c(this, od0Var, arrayDequeClone, arrayDequeClone2, 12));
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final void h(od0 od0Var, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(od0Var.f14674a);
            this.f23897i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f23897i.put("e_r", str);
            this.f23897i.put("e_id", (String) pair2.first);
            if (this.f23893d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(u6.t.v(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap2 = this.f23897i;
                String str2 = (String) pair.first;
                if (!TextUtils.isEmpty(str2)) {
                    concurrentHashMap2.put("e_type", str2);
                }
                ConcurrentHashMap concurrentHashMap3 = this.f23897i;
                String str3 = (String) pair.second;
                if (!TextUtils.isEmpty(str3)) {
                    concurrentHashMap3.put("e_agent", str3);
                }
            }
            this.f23896h.a(this.f23897i, false);
        }
    }
}
