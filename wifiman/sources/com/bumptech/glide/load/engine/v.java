package com.bumptech.glide.load.engine;

import I2.n;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
class v implements f, f.a {

    /* renamed from: a, reason: collision with root package name */
    private final g f34498a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a f34499b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f34500c;

    /* renamed from: d, reason: collision with root package name */
    private volatile c f34501d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Object f34502e;

    /* renamed from: f, reason: collision with root package name */
    private volatile n.a f34503f;

    /* renamed from: g, reason: collision with root package name */
    private volatile d f34504g;

    class a implements d.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a f34505a;

        a(n.a aVar) {
            this.f34505a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            if (v.this.g(this.f34505a)) {
                v.this.i(this.f34505a, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (v.this.g(this.f34505a)) {
                v.this.h(this.f34505a, obj);
            }
        }
    }

    v(g gVar, f.a aVar) {
        this.f34498a = gVar;
        this.f34499b = aVar;
    }

    private boolean e(Object obj) throws Throwable {
        long jB = W2.g.b();
        boolean z10 = false;
        try {
            com.bumptech.glide.load.data.e eVarO = this.f34498a.o(obj);
            Object objA = eVarO.a();
            C2.d dVarQ = this.f34498a.q(objA);
            e eVar = new e(dVarQ, objA, this.f34498a.k());
            d dVar = new d(this.f34503f.f8511a, this.f34498a.p());
            G2.a aVarD = this.f34498a.d();
            aVarD.a(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + dVarQ + ", duration: " + W2.g.a(jB));
            }
            if (aVarD.b(dVar) != null) {
                this.f34504g = dVar;
                this.f34501d = new c(Collections.singletonList(this.f34503f.f8511a), this.f34498a, this);
                this.f34503f.f8513c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f34504g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f34499b.a(this.f34503f.f8511a, eVarO.a(), this.f34503f.f8513c, this.f34503f.f8513c.d(), this.f34503f.f8511a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    this.f34503f.f8513c.b();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private boolean f() {
        return this.f34500c < this.f34498a.g().size();
    }

    private void j(n.a aVar) {
        this.f34503f.f8513c.e(this.f34498a.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(C2.e eVar, Object obj, com.bumptech.glide.load.data.d dVar, C2.a aVar, C2.e eVar2) {
        this.f34499b.a(eVar, obj, dVar, this.f34503f.f8513c.d(), eVar);
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        if (this.f34502e != null) {
            Object obj = this.f34502e;
            this.f34502e = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException e10) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e10);
                }
            }
        }
        if (this.f34501d != null && this.f34501d.b()) {
            return true;
        }
        this.f34501d = null;
        this.f34503f = null;
        boolean z10 = false;
        while (!z10 && f()) {
            List listG = this.f34498a.g();
            int i10 = this.f34500c;
            this.f34500c = i10 + 1;
            this.f34503f = (n.a) listG.get(i10);
            if (this.f34503f != null && (this.f34498a.e().c(this.f34503f.f8513c.d()) || this.f34498a.u(this.f34503f.f8513c.a()))) {
                j(this.f34503f);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c(C2.e eVar, Exception exc, com.bumptech.glide.load.data.d dVar, C2.a aVar) {
        this.f34499b.c(eVar, exc, dVar, this.f34503f.f8513c.d());
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a aVar = this.f34503f;
        if (aVar != null) {
            aVar.f8513c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void d() {
        throw new UnsupportedOperationException();
    }

    boolean g(n.a aVar) {
        n.a aVar2 = this.f34503f;
        return aVar2 != null && aVar2 == aVar;
    }

    void h(n.a aVar, Object obj) {
        E2.a aVarE = this.f34498a.e();
        if (obj != null && aVarE.c(aVar.f8513c.d())) {
            this.f34502e = obj;
            this.f34499b.d();
        } else {
            f.a aVar2 = this.f34499b;
            C2.e eVar = aVar.f8511a;
            com.bumptech.glide.load.data.d dVar = aVar.f8513c;
            aVar2.a(eVar, obj, dVar, dVar.d(), this.f34504g);
        }
    }

    void i(n.a aVar, Exception exc) {
        f.a aVar2 = this.f34499b;
        d dVar = this.f34504g;
        com.bumptech.glide.load.data.d dVar2 = aVar.f8513c;
        aVar2.c(dVar, exc, dVar2, dVar2.d());
    }
}
