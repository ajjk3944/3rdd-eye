package com.applovin.impl.sdk;

import com.applovin.impl.g1;
import com.applovin.impl.q2;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final k f21116a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f21117b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f21118c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f21119d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object f21120e = new Object();

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f21121a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21122b;

        /* renamed from: c, reason: collision with root package name */
        private final String f21123c;

        /* renamed from: d, reason: collision with root package name */
        private final String f21124d;

        /* renamed from: e, reason: collision with root package name */
        private final String f21125e;

        /* renamed from: f, reason: collision with root package name */
        private final String f21126f;

        /* renamed from: g, reason: collision with root package name */
        private final String f21127g;

        /* renamed from: h, reason: collision with root package name */
        private long f21128h;
        private final ArrayDeque i;

        public String b() {
            return this.f21124d;
        }

        public String c() {
            return this.f21123c;
        }

        public String d() {
            return this.f21125e;
        }

        public String e() {
            return this.f21126f;
        }

        public String f() {
            return this.f21127g;
        }

        public String g() {
            return this.f21122b;
        }

        public String h() {
            return this.f21126f;
        }

        public c i() {
            return (c) this.i.getLast();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AdInfo{state='");
            sb.append(i());
            sb.append("', adUnitId='");
            sb.append(this.f21121a);
            sb.append("', format='");
            sb.append(this.f21122b);
            sb.append("', adapterName='");
            sb.append(this.f21123c);
            sb.append("', adapterClass='");
            sb.append(this.f21124d);
            sb.append("', adapterVersion='");
            sb.append(this.f21125e);
            sb.append("', bCode='");
            sb.append(this.f21126f);
            sb.append("', creativeId='");
            sb.append(this.f21127g);
            sb.append("', updated=");
            return androidx.work.s.f(sb, this.f21128h, '}');
        }

        private b(q2 q2Var, c cVar) {
            this.i = new ArrayDeque();
            this.f21121a = q2Var.getAdUnitId();
            this.f21122b = q2Var.getFormat().getLabel();
            this.f21123c = q2Var.c();
            this.f21124d = q2Var.b();
            this.f21125e = q2Var.z();
            this.f21126f = q2Var.C();
            this.f21127g = q2Var.getCreativeId();
            a(cVar);
        }

        public String a() {
            return this.f21121a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f21128h = System.currentTimeMillis();
            this.i.add(cVar);
        }
    }

    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW("show"),
        HIDE("hide"),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* renamed from: a, reason: collision with root package name */
        private final String f21136a;

        c(String str) {
            this.f21136a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f21136a;
        }
    }

    public interface d {
        void a(b bVar);
    }

    public g(k kVar) {
        this.f21116a = kVar;
        a();
    }

    public void a(q2 q2Var, c cVar) {
        synchronized (this.f21120e) {
            try {
                String strC = q2Var.C();
                b bVar = (b) this.f21119d.get(strC);
                if (bVar == null) {
                    if (cVar == c.DESTROY) {
                        return;
                    }
                    bVar = new b(q2Var, cVar);
                    this.f21119d.put(strC, bVar);
                } else if (bVar.i() == cVar) {
                    return;
                } else {
                    bVar.a(cVar);
                }
                if (cVar == c.DESTROY) {
                    this.f21119d.remove(strC);
                }
                a(bVar, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.f21118c) {
            try {
                for (c cVar : c.values()) {
                    this.f21117b.put(cVar, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.f21118c) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    a((c) it.next()).add(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f21118c) {
            try {
                Iterator it = this.f21117b.keySet().iterator();
                while (it.hasNext()) {
                    a((c) it.next()).remove(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.f21118c) {
            try {
                Set set = (Set) this.f21117b.get(cVar);
                if (g1.a(set)) {
                    return set;
                }
                return new HashSet();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(b bVar, c cVar) {
        synchronized (this.f21118c) {
            try {
                Iterator it = a(cVar).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
