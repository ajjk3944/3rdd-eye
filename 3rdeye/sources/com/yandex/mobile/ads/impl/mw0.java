package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.kw0;
import com.yandex.mobile.ads.impl.xx1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class mw0 {

    /* renamed from: a, reason: collision with root package name */
    private final gi1 f30538a;

    /* renamed from: e, reason: collision with root package name */
    private final d f30542e;

    /* renamed from: f, reason: collision with root package name */
    private final kw0.a f30543f;

    /* renamed from: g, reason: collision with root package name */
    private final c40.a f30544g;

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<c, b> f30545h;
    private final HashSet i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f30547k;

    /* renamed from: l, reason: collision with root package name */
    private q62 f30548l;

    /* renamed from: j, reason: collision with root package name */
    private xx1 f30546j = new xx1.a();

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<dw0, c> f30540c = new IdentityHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f30541d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f30539b = new ArrayList();

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final jw0 f30553a;

        /* renamed from: b, reason: collision with root package name */
        public final jw0.c f30554b;

        /* renamed from: c, reason: collision with root package name */
        public final a f30555c;

        public b(xt0 xt0Var, jw0.c cVar, a aVar) {
            this.f30553a = xt0Var;
            this.f30554b = cVar;
            this.f30555c = aVar;
        }
    }

    public static final class c implements lw0 {

        /* renamed from: a, reason: collision with root package name */
        public final xt0 f30556a;

        /* renamed from: d, reason: collision with root package name */
        public int f30559d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f30560e;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f30558c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f30557b = new Object();

        public c(jw0 jw0Var, boolean z10) {
            this.f30556a = new xt0(jw0Var, z10);
        }

        @Override // com.yandex.mobile.ads.impl.lw0
        public final Object a() {
            return this.f30557b;
        }

        @Override // com.yandex.mobile.ads.impl.lw0
        public final v42 b() {
            return this.f30556a.f();
        }
    }

    public interface d {
    }

    public mw0(d dVar, xc xcVar, Handler handler, gi1 gi1Var) {
        this.f30538a = gi1Var;
        this.f30542e = dVar;
        kw0.a aVar = new kw0.a();
        this.f30543f = aVar;
        c40.a aVar2 = new c40.a();
        this.f30544g = aVar2;
        this.f30545h = new HashMap<>();
        this.i = new HashSet();
        aVar.a(handler, xcVar);
        aVar2.a(handler, xcVar);
    }

    public final v42 d() {
        if (this.f30539b.size() < 0) {
            throw new IllegalArgumentException();
        }
        this.f30546j = null;
        return a();
    }

    public final void e() {
        for (b bVar : this.f30545h.values()) {
            try {
                bVar.f30553a.a(bVar.f30554b);
            } catch (RuntimeException e4) {
                rs0.a("MediaSourceList", "Failed to release child source.", e4);
            }
            bVar.f30553a.a((kw0) bVar.f30555c);
            bVar.f30553a.a((c40) bVar.f30555c);
        }
        this.f30545h.clear();
        this.i.clear();
        this.f30547k = false;
    }

    public final class a implements kw0, c40 {

        /* renamed from: a, reason: collision with root package name */
        private final c f30549a;

        /* renamed from: b, reason: collision with root package name */
        private kw0.a f30550b;

        /* renamed from: c, reason: collision with root package name */
        private c40.a f30551c;

        public a(c cVar) {
            this.f30550b = mw0.this.f30543f;
            this.f30551c = mw0.this.f30544g;
            this.f30549a = cVar;
        }

        private boolean e(int i, jw0.b bVar) {
            jw0.b bVar2 = null;
            if (bVar != null) {
                c cVar = this.f30549a;
                int i10 = 0;
                while (true) {
                    if (i10 >= cVar.f30558c.size()) {
                        break;
                    }
                    if (((jw0.b) cVar.f30558c.get(i10)).f27473d == bVar.f27473d) {
                        bVar2 = new jw0.b(bVar.a(AbstractC4089d.a(cVar.f30557b, bVar.f27470a)));
                        break;
                    }
                    i10++;
                }
                if (bVar2 == null) {
                    return false;
                }
            }
            int i11 = i + this.f30549a.f30559d;
            kw0.a aVar = this.f30550b;
            if (aVar.f29797a != i11 || !s82.a(aVar.f29798b, bVar2)) {
                this.f30550b = mw0.this.f30543f.a(i11, bVar2);
            }
            c40.a aVar2 = this.f30551c;
            if (aVar2.f25523a == i11 && s82.a(aVar2.f25524b, bVar2)) {
                return true;
            }
            this.f30551c = mw0.this.f30544g.a(i11, bVar2);
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.kw0
        public final void a(int i, jw0.b bVar, zv0 zv0Var) {
            if (e(i, bVar)) {
                this.f30550b.a(zv0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.c40
        public final void b(int i, jw0.b bVar) {
            if (e(i, bVar)) {
                this.f30551c.d();
            }
        }

        @Override // com.yandex.mobile.ads.impl.c40
        public final void c(int i, jw0.b bVar) {
            if (e(i, bVar)) {
                this.f30551c.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.c40
        public final void d(int i, jw0.b bVar) {
            if (e(i, bVar)) {
                this.f30551c.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.c40
        public final void a(int i, jw0.b bVar) {
            if (e(i, bVar)) {
                this.f30551c.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.kw0
        public final void b(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var) {
            if (e(i, bVar)) {
                this.f30550b.b(rr0Var, zv0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.kw0
        public final void c(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var) {
            if (e(i, bVar)) {
                this.f30550b.c(rr0Var, zv0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.c40
        public final void a(int i, jw0.b bVar, int i10) {
            if (e(i, bVar)) {
                this.f30551c.a(i10);
            }
        }

        @Override // com.yandex.mobile.ads.impl.c40
        public final void a(int i, jw0.b bVar, Exception exc) {
            if (e(i, bVar)) {
                this.f30551c.a(exc);
            }
        }

        @Override // com.yandex.mobile.ads.impl.kw0
        public final void a(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var) {
            if (e(i, bVar)) {
                this.f30550b.a(rr0Var, zv0Var);
            }
        }

        @Override // com.yandex.mobile.ads.impl.kw0
        public final void a(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var, IOException iOException, boolean z10) {
            if (e(i, bVar)) {
                this.f30550b.a(rr0Var, zv0Var, iOException, z10);
            }
        }
    }

    public final v42 a(int i, List<c> list, xx1 xx1Var) {
        if (!list.isEmpty()) {
            this.f30546j = xx1Var;
            for (int i10 = i; i10 < list.size() + i; i10++) {
                c cVar = list.get(i10 - i);
                if (i10 > 0) {
                    c cVar2 = (c) this.f30539b.get(i10 - 1);
                    cVar.f30559d = cVar2.f30556a.f().b() + cVar2.f30559d;
                    cVar.f30560e = false;
                    cVar.f30558c.clear();
                } else {
                    cVar.f30559d = 0;
                    cVar.f30560e = false;
                    cVar.f30558c.clear();
                }
                int iB = cVar.f30556a.f().b();
                for (int i11 = i10; i11 < this.f30539b.size(); i11++) {
                    ((c) this.f30539b.get(i11)).f30559d += iB;
                }
                this.f30539b.add(i10, cVar);
                this.f30541d.put(cVar.f30557b, cVar);
                if (this.f30547k) {
                    a(cVar);
                    if (this.f30540c.isEmpty()) {
                        this.i.add(cVar);
                    } else {
                        b bVar = this.f30545h.get(cVar);
                        if (bVar != null) {
                            bVar.f30553a.b(bVar.f30554b);
                        }
                    }
                }
            }
        }
        return a();
    }

    public final int b() {
        return this.f30539b.size();
    }

    public final boolean c() {
        return this.f30547k;
    }

    public final wt0 a(jw0.b bVar, vc vcVar, long j4) {
        Object objD = AbstractC4089d.d(bVar.f27470a);
        jw0.b bVar2 = new jw0.b(bVar.a(AbstractC4089d.c(bVar.f27470a)));
        c cVar = (c) this.f30541d.get(objD);
        cVar.getClass();
        this.i.add(cVar);
        b bVar3 = this.f30545h.get(cVar);
        if (bVar3 != null) {
            bVar3.f30553a.c(bVar3.f30554b);
        }
        cVar.f30558c.add(bVar2);
        wt0 wt0VarB = cVar.f30556a.a(bVar2, vcVar, j4);
        this.f30540c.put(wt0VarB, cVar);
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            c cVar2 = (c) it.next();
            if (cVar2.f30558c.isEmpty()) {
                b bVar4 = this.f30545h.get(cVar2);
                if (bVar4 != null) {
                    bVar4.f30553a.b(bVar4.f30554b);
                }
                it.remove();
            }
        }
        return wt0VarB;
    }

    public final v42 a() {
        if (this.f30539b.isEmpty()) {
            return v42.f34342b;
        }
        int iB = 0;
        for (int i = 0; i < this.f30539b.size(); i++) {
            c cVar = (c) this.f30539b.get(i);
            cVar.f30559d = iB;
            iB += cVar.f30556a.f().b();
        }
        return new cj1(this.f30539b, this.f30546j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(jw0 jw0Var, v42 v42Var) {
        ((o60) this.f30542e).h();
    }

    public final void a(q62 q62Var) {
        if (!this.f30547k) {
            this.f30548l = q62Var;
            for (int i = 0; i < this.f30539b.size(); i++) {
                c cVar = (c) this.f30539b.get(i);
                a(cVar);
                this.i.add(cVar);
            }
            this.f30547k = true;
            return;
        }
        throw new IllegalStateException();
    }

    private void a(c cVar) {
        xt0 xt0Var = cVar.f30556a;
        jw0.c cVar2 = new jw0.c() { // from class: com.yandex.mobile.ads.impl.K2
            @Override // com.yandex.mobile.ads.impl.jw0.c
            public final void a(jw0 jw0Var, v42 v42Var) {
                this.f24169a.a(jw0Var, v42Var);
            }
        };
        a aVar = new a(cVar);
        this.f30545h.put(cVar, new b(xt0Var, cVar2, aVar));
        xt0Var.a(s82.b((Handler.Callback) null), (kw0) aVar);
        xt0Var.a(s82.b((Handler.Callback) null), (c40) aVar);
        xt0Var.a(cVar2, this.f30548l, this.f30538a);
    }

    public final void a(dw0 dw0Var) {
        c cVarRemove = this.f30540c.remove(dw0Var);
        cVarRemove.getClass();
        cVarRemove.f30556a.a(dw0Var);
        cVarRemove.f30558c.remove(((wt0) dw0Var).f35050b);
        if (!this.f30540c.isEmpty()) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (cVar.f30558c.isEmpty()) {
                    b bVar = this.f30545h.get(cVar);
                    if (bVar != null) {
                        bVar.f30553a.b(bVar.f30554b);
                    }
                    it.remove();
                }
            }
        }
        if (cVarRemove.f30560e && cVarRemove.f30558c.isEmpty()) {
            b bVarRemove = this.f30545h.remove(cVarRemove);
            bVarRemove.getClass();
            bVarRemove.f30553a.a(bVarRemove.f30554b);
            bVarRemove.f30553a.a((kw0) bVarRemove.f30555c);
            bVarRemove.f30553a.a((c40) bVarRemove.f30555c);
            this.i.remove(cVarRemove);
        }
    }

    public final v42 a(int i, int i10, xx1 xx1Var) {
        if (i >= 0 && i <= i10 && i10 <= this.f30539b.size()) {
            this.f30546j = xx1Var;
            a(i, i10);
            return a();
        }
        throw new IllegalArgumentException();
    }

    private void a(int i, int i10) {
        for (int i11 = i10 - 1; i11 >= i; i11--) {
            c cVar = (c) this.f30539b.remove(i11);
            this.f30541d.remove(cVar.f30557b);
            int i12 = -cVar.f30556a.f().b();
            for (int i13 = i11; i13 < this.f30539b.size(); i13++) {
                ((c) this.f30539b.get(i13)).f30559d += i12;
            }
            cVar.f30560e = true;
            if (this.f30547k && cVar.f30558c.isEmpty()) {
                b bVarRemove = this.f30545h.remove(cVar);
                bVarRemove.getClass();
                bVarRemove.f30553a.a(bVarRemove.f30554b);
                bVarRemove.f30553a.a((kw0) bVarRemove.f30555c);
                bVarRemove.f30553a.a((c40) bVarRemove.f30555c);
                this.i.remove(cVar);
            }
        }
    }

    public final v42 a(List<c> list, xx1 xx1Var) {
        a(0, this.f30539b.size());
        return a(this.f30539b.size(), list, xx1Var);
    }

    public final v42 a(xx1 xx1Var) {
        int size = this.f30539b.size();
        if (xx1Var.b() != size) {
            xx1Var = xx1Var.d().b(size);
        }
        this.f30546j = xx1Var;
        return a();
    }
}
