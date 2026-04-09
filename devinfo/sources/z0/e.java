package z0;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import nk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: d, reason: collision with root package name */
    public final d f37814d;

    /* renamed from: e, reason: collision with root package name */
    public Object f37815e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37816f;
    public int g;

    public e(d dVar, k[] kVarArr) {
        super(dVar.f37810c, kVarArr);
        this.f37814d = dVar;
        this.g = dVar.f37812e;
    }

    public final void c(int i4, j jVar, Object obj, int i10) {
        int i11 = i10 * 5;
        k[] kVarArr = this.f37805a;
        if (i11 <= 30) {
            int iP = 1 << com.bumptech.glide.c.p(i4, i11);
            if (jVar.h(iP)) {
                kVarArr[i10].a(jVar.f37825d, Integer.bitCount(jVar.f37822a) * 2, jVar.f(iP));
                this.f37806b = i10;
                return;
            } else {
                int iT = jVar.t(iP);
                j jVarS = jVar.s(iT);
                kVarArr[i10].a(jVar.f37825d, Integer.bitCount(jVar.f37822a) * 2, iT);
                c(i4, jVarS, obj, i10 + 1);
                return;
            }
        }
        k kVar = kVarArr[i10];
        Object[] objArr = jVar.f37825d;
        kVar.a(objArr, objArr.length, 0);
        while (true) {
            k kVar2 = kVarArr[i10];
            if (nk.k.a(kVar2.f37826a[kVar2.f37828c], obj)) {
                this.f37806b = i10;
                return;
            } else {
                kVarArr[i10].f37828c += 2;
            }
        }
    }

    @Override // z0.c, java.util.Iterator
    public final Object next() {
        if (this.f37814d.f37812e != this.g) {
            throw new ConcurrentModificationException();
        }
        if (!this.f37807c) {
            throw new NoSuchElementException();
        }
        k kVar = this.f37805a[this.f37806b];
        this.f37815e = kVar.f37826a[kVar.f37828c];
        this.f37816f = true;
        return super.next();
    }

    @Override // z0.c, java.util.Iterator
    public final void remove() {
        if (!this.f37816f) {
            throw new IllegalStateException();
        }
        boolean z3 = this.f37807c;
        d dVar = this.f37814d;
        if (!z3) {
            x.c(dVar).remove(this.f37815e);
        } else {
            if (!z3) {
                throw new NoSuchElementException();
            }
            k kVar = this.f37805a[this.f37806b];
            Object obj = kVar.f37826a[kVar.f37828c];
            x.c(dVar).remove(this.f37815e);
            c(obj != null ? obj.hashCode() : 0, dVar.f37810c, obj, 0);
        }
        this.f37815e = null;
        this.f37816f = false;
        this.g = dVar.f37812e;
    }
}
