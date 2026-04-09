package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class r extends ck.a implements ck.e {

    /* renamed from: b, reason: collision with root package name */
    public static final q f37232b = new q(ck.d.f2897a, new sl.b(11));

    public r() {
        super(ck.d.f2897a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((ck.f) r3.f37223a.invoke(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (ck.d.f2897a == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return ck.i.f2898a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    @Override // ck.a, ck.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ck.h L(ck.g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            nk.k.e(r3, r0)
            boolean r0 = r3 instanceof xk.q
            if (r0 == 0) goto L20
            xk.q r3 = (xk.q) r3
            ck.g r0 = r2.f2894a
            if (r0 == r3) goto L15
            ck.g r1 = r3.f37224b
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            mk.c r3 = r3.f37223a
            java.lang.Object r3 = r3.invoke(r2)
            ck.f r3 = (ck.f) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            ck.d r0 = ck.d.f2897a
            if (r0 != r3) goto L27
        L24:
            ck.i r3 = ck.i.f2898a
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xk.r.L(ck.g):ck.h");
    }

    @Override // ck.a, ck.h
    public final ck.f O(ck.g gVar) {
        ck.f fVar;
        nk.k.e(gVar, "key");
        if (!(gVar instanceof q)) {
            if (ck.d.f2897a == gVar) {
                return this;
            }
            return null;
        }
        q qVar = (q) gVar;
        ck.g gVar2 = this.f2894a;
        if ((gVar2 == qVar || qVar.f37224b == gVar2) && (fVar = (ck.f) qVar.f37223a.invoke(this)) != null) {
            return fVar;
        }
        return null;
    }

    public abstract void T(ck.h hVar, Runnable runnable);

    public void U(ck.h hVar, Runnable runnable) {
        cl.b.i(this, hVar, runnable);
    }

    public boolean V(ck.h hVar) {
        return !(this instanceof r1);
    }

    public r W(int i4) {
        cl.b.a(i4);
        return new cl.h(this, i4);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + x.n(this);
    }
}
