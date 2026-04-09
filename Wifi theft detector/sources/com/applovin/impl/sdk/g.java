package com.applovin.impl.sdk;

import com.applovin.impl.y2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final k f7757a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f7758b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f7759c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Map f7760d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final Object f7761e = new Object();

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f7762a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7763b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7764c;

        /* renamed from: d, reason: collision with root package name */
        private final String f7765d;

        /* renamed from: e, reason: collision with root package name */
        private final String f7766e;

        /* renamed from: f, reason: collision with root package name */
        private final String f7767f;

        /* renamed from: g, reason: collision with root package name */
        private final String f7768g;

        /* renamed from: h, reason: collision with root package name */
        private long f7769h;

        /* renamed from: i, reason: collision with root package name */
        private final ArrayDeque f7770i;

        public String b() {
            return this.f7765d;
        }

        public String c() {
            return this.f7764c;
        }

        public String d() {
            return this.f7766e;
        }

        public String e() {
            return this.f7767f;
        }

        public String f() {
            return this.f7768g;
        }

        public String g() {
            return this.f7763b;
        }

        public String h() {
            return this.f7767f;
        }

        public c i() {
            return (c) this.f7770i.getLast();
        }

        public String toString() {
            return "AdInfo{state='" + i() + "', adUnitId='" + this.f7762a + "', format='" + this.f7763b + "', adapterName='" + this.f7764c + "', adapterClass='" + this.f7765d + "', adapterVersion='" + this.f7766e + "', bCode='" + this.f7767f + "', creativeId='" + this.f7768g + "', updated=" + this.f7769h + '}';
        }

        private b(y2 y2Var, c cVar) {
            this.f7770i = new ArrayDeque();
            this.f7762a = y2Var.getAdUnitId();
            this.f7763b = y2Var.getFormat().getLabel();
            this.f7764c = y2Var.c();
            this.f7765d = y2Var.b();
            this.f7766e = y2Var.z();
            this.f7767f = y2Var.B();
            this.f7768g = y2Var.getCreativeId();
            a(cVar);
        }

        public String a() {
            return this.f7762a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(c cVar) {
            this.f7769h = System.currentTimeMillis();
            this.f7770i.add(cVar);
        }
    }

    public enum c {
        LOADING("loading"),
        LOAD("load"),
        SHOW("show"),
        HIDE("hide"),
        CLICK(CampaignEx.JSON_NATIVE_VIDEO_CLICK),
        DESTROY("destroy"),
        SHOW_ERROR("show_error");


        /* renamed from: a, reason: collision with root package name */
        private final String f7779a;

        c(String str) {
            this.f7779a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f7779a;
        }
    }

    public interface d {
        void a(b bVar);
    }

    public g(k kVar) {
        this.f7757a = kVar;
        a();
    }

    public void a(y2 y2Var, c cVar) {
        synchronized (this.f7761e) {
            try {
                String strB = y2Var.B();
                b bVar = (b) this.f7760d.get(strB);
                if (bVar == null) {
                    if (cVar == c.DESTROY) {
                        return;
                    }
                    bVar = new b(y2Var, cVar);
                    this.f7760d.put(strB, bVar);
                } else if (bVar.i() == cVar) {
                    return;
                } else {
                    bVar.a(cVar);
                }
                if (cVar == c.DESTROY) {
                    this.f7760d.remove(strB);
                }
                a(bVar, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.f7759c) {
            try {
                for (c cVar : c.values()) {
                    this.f7758b.put(cVar, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar, Set set) {
        synchronized (this.f7759c) {
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
        synchronized (this.f7759c) {
            try {
                Iterator it = this.f7758b.keySet().iterator();
                while (it.hasNext()) {
                    a((c) it.next()).remove(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Set a(c cVar) {
        synchronized (this.f7759c) {
            try {
                Set set = (Set) this.f7758b.get(cVar);
                if (com.applovin.impl.l1.a(set)) {
                    return set;
                }
                return new HashSet();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(b bVar, c cVar) {
        synchronized (this.f7759c) {
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
