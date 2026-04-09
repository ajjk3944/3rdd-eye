package A2;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.C0750Tn;
import com.google.android.gms.internal.ads.C0852Zn;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.G9;
import com.google.android.gms.internal.ads.H9;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public final int f202a;

    /* renamed from: b, reason: collision with root package name */
    public final long f203b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f204c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f205d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f206e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f207f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f208g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public final C0852Zn f209h;
    public ConcurrentHashMap i;

    public Q(C0852Zn c0852Zn) {
        this.f209h = c0852Zn;
        E9 e9 = H9.G7;
        C2841s c2841s = C2841s.f23267e;
        this.f202a = ((Integer) c2841s.f23270c.a(e9)).intValue();
        E9 e92 = H9.H7;
        G9 g9 = c2841s.f23270c;
        this.f203b = ((Long) g9.a(e92)).longValue();
        this.f204c = ((Boolean) g9.a(H9.L7)).booleanValue();
        this.f205d = ((Boolean) g9.a(H9.K7)).booleanValue();
        this.f206e = DesugarCollections.synchronizedMap(new O(this));
    }

    public final synchronized void a(String str, String str2, C0750Tn c0750Tn) {
        p2.j.f22785C.f22797k.getClass();
        this.f206e.put(str, new P(Long.valueOf(System.currentTimeMillis()), str2, new HashSet()));
        f();
        g(c0750Tn);
    }

    public final synchronized String b(String str, C0750Tn c0750Tn) {
        P p6 = (P) this.f206e.get(str);
        c0750Tn.f11457a.put("request_id", str);
        if (p6 == null) {
            c0750Tn.f11457a.put("mhit", "false");
            return null;
        }
        c0750Tn.f11457a.put("mhit", "true");
        return p6.f200b;
    }

    public final synchronized void c(String str) {
        this.f206e.remove(str);
    }

    public final synchronized boolean d(String str, String str2) {
        P p6 = (P) this.f206e.get(str);
        if (p6 != null) {
            if (p6.f201c.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean e(int i, String str, String str2) {
        P p6 = (P) this.f206e.get(str);
        if (p6 == null) {
            return false;
        }
        HashSet hashSet = p6.f201c;
        hashSet.add(str2);
        return hashSet.size() < i;
    }

    public final synchronized void f() {
        p2.j.f22785C.f22797k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Iterator it = this.f206e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((P) entry.getValue()).f199a.longValue() <= this.f203b) {
                    break;
                }
                this.f208g.add(new Pair((String) entry.getKey(), ((P) entry.getValue()).f200b));
                it.remove();
            }
        } catch (ConcurrentModificationException e6) {
            p2.j.f22785C.f22795h.f("QueryJsonMap.removeExpiredEntries", e6);
        }
    }

    public final synchronized void g(C0750Tn c0750Tn) throws Throwable {
        try {
            try {
                if (this.f204c) {
                    ArrayDeque arrayDeque = this.f208g;
                    ArrayDeque arrayDequeClone = arrayDeque.clone();
                    arrayDeque.clear();
                    ArrayDeque arrayDeque2 = this.f207f;
                    ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
                    arrayDeque2.clear();
                    AbstractC0640Nf.f10005a.execute(new RunnableC0114b(this, c0750Tn, arrayDequeClone, arrayDequeClone2, 1));
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

    public final void h(C0750Tn c0750Tn, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(c0750Tn.f11457a);
            this.i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.i.put("e_r", str);
            this.i.put("e_id", (String) pair2.first);
            if (this.f205d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(I5.b.A(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
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
            this.f209h.a(this.i, false);
        }
    }
}
