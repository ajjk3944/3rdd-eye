package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.c40;
import com.yandex.mobile.ads.impl.jw0;
import com.yandex.mobile.ads.impl.kw0;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes3.dex */
public abstract class zq<T> extends jk {

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<T, b<T>> f36588h = new HashMap<>();
    private Handler i;

    /* renamed from: j, reason: collision with root package name */
    private q62 f36589j;

    public static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final jw0 f36594a;

        /* renamed from: b, reason: collision with root package name */
        public final jw0.c f36595b;

        /* renamed from: c, reason: collision with root package name */
        public final zq<T>.a f36596c;

        public b(jw0 jw0Var, jw0.c cVar, zq<T>.a aVar) {
            this.f36594a = jw0Var;
            this.f36595b = cVar;
            this.f36596c = aVar;
        }
    }

    public abstract jw0.b a(T t10, jw0.b bVar);

    @Override // com.yandex.mobile.ads.impl.jk
    public final void a() {
        for (b<T> bVar : this.f36588h.values()) {
            bVar.f36594a.b(bVar.f36595b);
        }
    }

    @Override // com.yandex.mobile.ads.impl.jk
    public final void b() {
        for (b<T> bVar : this.f36588h.values()) {
            bVar.f36594a.c(bVar.f36595b);
        }
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract void a(T t10, jw0 jw0Var, v42 v42Var);

    @Override // com.yandex.mobile.ads.impl.jk
    public void e() {
        for (b<T> bVar : this.f36588h.values()) {
            bVar.f36594a.a(bVar.f36595b);
            bVar.f36594a.a((kw0) bVar.f36596c);
            bVar.f36594a.a((c40) bVar.f36596c);
        }
        this.f36588h.clear();
    }

    public final class a implements kw0, c40 {

        /* renamed from: a, reason: collision with root package name */
        private final T f36590a;

        /* renamed from: b, reason: collision with root package name */
        private kw0.a f36591b;

        /* renamed from: c, reason: collision with root package name */
        private c40.a f36592c;

        public a(T t10) {
            this.f36591b = zq.this.b((jw0.b) null);
            this.f36592c = zq.this.a((jw0.b) null);
            this.f36590a = t10;
        }

        private zv0 a(zv0 zv0Var) {
            zq zqVar = zq.this;
            long j4 = zv0Var.f36761f;
            zqVar.getClass();
            zq zqVar2 = zq.this;
            long j10 = zv0Var.f36762g;
            zqVar2.getClass();
            return (j4 == zv0Var.f36761f && j10 == zv0Var.f36762g) ? zv0Var : new zv0(zv0Var.f36756a, zv0Var.f36757b, zv0Var.f36758c, zv0Var.f36759d, zv0Var.f36760e, j4, j10);
        }

        private boolean e(int i, jw0.b bVar) {
            jw0.b bVarA;
            if (bVar != null) {
                bVarA = zq.this.a((zq) this.f36590a, bVar);
                if (bVarA == null) {
                    return false;
                }
            } else {
                bVarA = null;
            }
            zq.this.getClass();
            kw0.a aVar = this.f36591b;
            if (aVar.f29797a != i || !s82.a(aVar.f29798b, bVarA)) {
                this.f36591b = zq.this.b(i, bVarA);
            }
            c40.a aVar2 = this.f36592c;
            if (aVar2.f25523a == i && s82.a(aVar2.f25524b, bVarA)) {
                return true;
            }
            this.f36592c = zq.this.a(i, bVarA);
            return true;
        }

        @Override // com.yandex.mobile.ads.impl.c40
        public final void b(int i, jw0.b bVar) {
            if (e(i, bVar)) {
                this.f36592c.d();
            }
        }

        @Override // com.yandex.mobile.ads.impl.c40
        public final void c(int i, jw0.b bVar) {
            if (e(i, bVar)) {
                this.f36592c.a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.c40
        public final void d(int i, jw0.b bVar) {
            if (e(i, bVar)) {
                this.f36592c.b();
            }
        }

        @Override // com.yandex.mobile.ads.impl.kw0
        public final void b(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var) {
            if (e(i, bVar)) {
                this.f36591b.b(rr0Var, a(zv0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.kw0
        public final void c(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var) {
            if (e(i, bVar)) {
                this.f36591b.c(rr0Var, a(zv0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.kw0
        public final void a(int i, jw0.b bVar, zv0 zv0Var) {
            if (e(i, bVar)) {
                this.f36591b.a(a(zv0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.c40
        public final void a(int i, jw0.b bVar) {
            if (e(i, bVar)) {
                this.f36592c.c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.c40
        public final void a(int i, jw0.b bVar, int i10) {
            if (e(i, bVar)) {
                this.f36592c.a(i10);
            }
        }

        @Override // com.yandex.mobile.ads.impl.c40
        public final void a(int i, jw0.b bVar, Exception exc) {
            if (e(i, bVar)) {
                this.f36592c.a(exc);
            }
        }

        @Override // com.yandex.mobile.ads.impl.kw0
        public final void a(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var) {
            if (e(i, bVar)) {
                this.f36591b.a(rr0Var, a(zv0Var));
            }
        }

        @Override // com.yandex.mobile.ads.impl.kw0
        public final void a(int i, jw0.b bVar, rr0 rr0Var, zv0 zv0Var, IOException iOException, boolean z10) {
            if (e(i, bVar)) {
                this.f36591b.a(rr0Var, a(zv0Var), iOException, z10);
            }
        }
    }

    public final void a(final T t10, jw0 jw0Var) {
        if (!this.f36588h.containsKey(t10)) {
            jw0.c cVar = new jw0.c() { // from class: com.yandex.mobile.ads.impl.P4
                @Override // com.yandex.mobile.ads.impl.jw0.c
                public final void a(jw0 jw0Var2, v42 v42Var) {
                    this.f24227a.a(t10, jw0Var2, v42Var);
                }
            };
            a aVar = new a(t10);
            this.f36588h.put(t10, new b<>(jw0Var, cVar, aVar));
            Handler handler = this.i;
            handler.getClass();
            jw0Var.a(handler, (kw0) aVar);
            Handler handler2 = this.i;
            handler2.getClass();
            jw0Var.a(handler2, (c40) aVar);
            jw0Var.a(cVar, this.f36589j, c());
            if (d()) {
                return;
            }
            jw0Var.b(cVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.jk
    public void a(q62 q62Var) {
        this.f36589j = q62Var;
        this.i = s82.a((Handler.Callback) null);
    }
}
