package com.bumptech.glide.load.engine;

import I2.n;
import com.bumptech.glide.load.engine.h;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private final List f34325a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f34326b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f34327c;

    /* renamed from: d, reason: collision with root package name */
    private Object f34328d;

    /* renamed from: e, reason: collision with root package name */
    private int f34329e;

    /* renamed from: f, reason: collision with root package name */
    private int f34330f;

    /* renamed from: g, reason: collision with root package name */
    private Class f34331g;

    /* renamed from: h, reason: collision with root package name */
    private h.e f34332h;

    /* renamed from: i, reason: collision with root package name */
    private C2.g f34333i;

    /* renamed from: j, reason: collision with root package name */
    private Map f34334j;

    /* renamed from: k, reason: collision with root package name */
    private Class f34335k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f34336l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f34337m;

    /* renamed from: n, reason: collision with root package name */
    private C2.e f34338n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.g f34339o;

    /* renamed from: p, reason: collision with root package name */
    private E2.a f34340p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f34341q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f34342r;

    g() {
    }

    void a() {
        this.f34327c = null;
        this.f34328d = null;
        this.f34338n = null;
        this.f34331g = null;
        this.f34335k = null;
        this.f34333i = null;
        this.f34339o = null;
        this.f34334j = null;
        this.f34340p = null;
        this.f34325a.clear();
        this.f34336l = false;
        this.f34326b.clear();
        this.f34337m = false;
    }

    F2.b b() {
        return this.f34327c.a();
    }

    List c() {
        if (!this.f34337m) {
            this.f34337m = true;
            this.f34326b.clear();
            List listG = g();
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = (n.a) listG.get(i10);
                if (!this.f34326b.contains(aVar.f8511a)) {
                    this.f34326b.add(aVar.f8511a);
                }
                for (int i11 = 0; i11 < aVar.f8512b.size(); i11++) {
                    if (!this.f34326b.contains(aVar.f8512b.get(i11))) {
                        this.f34326b.add(aVar.f8512b.get(i11));
                    }
                }
            }
        }
        return this.f34326b;
    }

    G2.a d() {
        return this.f34332h.a();
    }

    E2.a e() {
        return this.f34340p;
    }

    int f() {
        return this.f34330f;
    }

    List g() {
        if (!this.f34336l) {
            this.f34336l = true;
            this.f34325a.clear();
            List listI = this.f34327c.h().i(this.f34328d);
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVarA = ((I2.n) listI.get(i10)).a(this.f34328d, this.f34329e, this.f34330f, this.f34333i);
                if (aVarA != null) {
                    this.f34325a.add(aVarA);
                }
            }
        }
        return this.f34325a;
    }

    q h(Class cls) {
        return this.f34327c.h().h(cls, this.f34331g, this.f34335k);
    }

    Class i() {
        return this.f34328d.getClass();
    }

    List j(File file) {
        return this.f34327c.h().i(file);
    }

    C2.g k() {
        return this.f34333i;
    }

    com.bumptech.glide.g l() {
        return this.f34339o;
    }

    List m() {
        return this.f34327c.h().j(this.f34328d.getClass(), this.f34331g, this.f34335k);
    }

    C2.j n(E2.c cVar) {
        return this.f34327c.h().k(cVar);
    }

    com.bumptech.glide.load.data.e o(Object obj) {
        return this.f34327c.h().l(obj);
    }

    C2.e p() {
        return this.f34338n;
    }

    C2.d q(Object obj) {
        return this.f34327c.h().m(obj);
    }

    Class r() {
        return this.f34335k;
    }

    C2.k s(Class cls) {
        C2.k kVar = (C2.k) this.f34334j.get(cls);
        if (kVar == null) {
            Iterator it = this.f34334j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    kVar = (C2.k) entry.getValue();
                    break;
                }
            }
        }
        if (kVar != null) {
            return kVar;
        }
        if (!this.f34334j.isEmpty() || !this.f34341q) {
            return K2.j.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int t() {
        return this.f34329e;
    }

    boolean u(Class cls) {
        return h(cls) != null;
    }

    void v(com.bumptech.glide.d dVar, Object obj, C2.e eVar, int i10, int i11, E2.a aVar, Class cls, Class cls2, com.bumptech.glide.g gVar, C2.g gVar2, Map map, boolean z10, boolean z11, h.e eVar2) {
        this.f34327c = dVar;
        this.f34328d = obj;
        this.f34338n = eVar;
        this.f34329e = i10;
        this.f34330f = i11;
        this.f34340p = aVar;
        this.f34331g = cls;
        this.f34332h = eVar2;
        this.f34335k = cls2;
        this.f34339o = gVar;
        this.f34333i = gVar2;
        this.f34334j = map;
        this.f34341q = z10;
        this.f34342r = z11;
    }

    boolean w(E2.c cVar) {
        return this.f34327c.h().n(cVar);
    }

    boolean x() {
        return this.f34342r;
    }

    boolean y(C2.e eVar) {
        List listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((n.a) listG.get(i10)).f8511a.equals(eVar)) {
                return true;
            }
        }
        return false;
    }
}
