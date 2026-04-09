package com.applovin.impl.sdk;

import com.applovin.impl.l1;
import com.applovin.impl.y2;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final k f5476a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f5477b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f5478c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f5479d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object f5480e = new Object();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f5481a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5482b;

        /* renamed from: c, reason: collision with root package name */
        private final String f5483c;

        /* renamed from: d, reason: collision with root package name */
        private final String f5484d;

        /* renamed from: e, reason: collision with root package name */
        private final String f5485e;

        /* renamed from: f, reason: collision with root package name */
        private final String f5486f;
        private final String g;

        /* renamed from: h, reason: collision with root package name */
        private long f5487h;

        /* renamed from: i, reason: collision with root package name */
        private final ArrayDeque f5488i;

        public String b() {
            return this.f5484d;
        }

        public String c() {
            return this.f5483c;
        }

        public String d() {
            return this.f5485e;
        }

        public String e() {
            return this.f5486f;
        }

        public String f() {
            return this.g;
        }

        public String g() {
            return this.f5482b;
        }

        public String h() {
            return this.f5486f;
        }

        public c i() {
            return (c) this.f5488i.getLast();
        }

        public String toString() {
            return "AdInfo{state='" + i() + "', adUnitId='" + this.f5481a + "', format='" + this.f5482b + "', adapterName='" + this.f5483c + "', adapterClass='" + this.f5484d + "', adapterVersion='" + this.f5485e + "', bCode='" + this.f5486f + "', creativeId='" + this.g + "', updated=" + this.f5487h + '}';
        }

        private b(y2 y2Var, c cVar) {
            this.f5488i = new ArrayDeque();
            this.f5481a = y2Var.getAdUnitId();
            this.f5482b = y2Var.getFormat().getLabel();
            this.f5483c = y2Var.c();
            this.f5484d = y2Var.b();
            this.f5485e = y2Var.z();
            this.f5486f = y2Var.B();
            this.g = y2Var.getCreativeId();
            a(cVar);
        }

        public String a() {
            return this.f5481a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f5487h = System.currentTimeMillis();
            this.f5488i.add(cVar);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW("show"),
        HIDE("hide"),
        CLICK("click"),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* renamed from: a, reason: collision with root package name */
        private final String f5496a;

        c(String str) {
            this.f5496a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f5496a;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface d {
        void a(b bVar);
    }

    public g(k kVar) {
        this.f5476a = kVar;
        a();
    }

    public void a(y2 y2Var, c cVar) {
        synchronized (this.f5480e) {
            try {
                String strB = y2Var.B();
                b bVar = (b) this.f5479d.get(strB);
                if (bVar == null) {
                    if (cVar == c.DESTROY) {
                        return;
                    }
                    bVar = new b(y2Var, cVar);
                    this.f5479d.put(strB, bVar);
                } else if (bVar.i() == cVar) {
                    return;
                } else {
                    bVar.a(cVar);
                }
                if (cVar == c.DESTROY) {
                    this.f5479d.remove(strB);
                }
                a(bVar, cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f5478c) {
            try {
                for (c cVar : c.values()) {
                    this.f5477b.put(cVar, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.f5478c) {
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    a((c) it.next()).add(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(d dVar) {
        synchronized (this.f5478c) {
            try {
                Iterator it = this.f5477b.keySet().iterator();
                while (it.hasNext()) {
                    a((c) it.next()).remove(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.f5478c) {
            try {
                Set set = (Set) this.f5477b.get(cVar);
                if (l1.a(set)) {
                    return set;
                }
                return new HashSet();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a(b bVar, c cVar) {
        synchronized (this.f5478c) {
            try {
                Iterator it = a(cVar).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
