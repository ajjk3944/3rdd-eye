package wt;

/* loaded from: classes.dex */
public abstract class q extends pq.a implements pq.e {

    /* renamed from: d, reason: collision with root package name */
    public static final p f24650d = new p(pq.d.f20620a, new lu.u(10));

    public q() {
        super(pq.d.f20620a);
    }

    @Override // pq.a, pq.h
    public final pq.f Y(pq.g gVar) {
        pq.f fVar;
        br.l.e(gVar, "key");
        if (gVar instanceof p) {
            p pVar = (p) gVar;
            pq.g gVar2 = this.f20617a;
            if ((gVar2 == pVar || pVar.f24648d == gVar2) && (fVar = (pq.f) pVar.f24647a.a(this)) != null) {
                return fVar;
            }
        } else if (pq.d.f20620a == gVar) {
            return this;
        }
        return null;
    }

    public abstract void n0(pq.h hVar, Runnable runnable);

    public void o0(pq.h hVar, Runnable runnable) {
        n0(hVar, runnable);
    }

    public boolean p0(pq.h hVar) {
        return !(this instanceof n1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((pq.f) r3.f24647a.a(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (pq.d.f20620a == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return pq.i.f20621a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    @Override // pq.a, pq.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pq.h q(pq.g r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            br.l.e(r3, r0)
            boolean r0 = r3 instanceof wt.p
            if (r0 == 0) goto L20
            wt.p r3 = (wt.p) r3
            pq.g r0 = r2.f20617a
            if (r0 == r3) goto L15
            pq.g r1 = r3.f24648d
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            ar.k r3 = r3.f24647a
            java.lang.Object r3 = r3.a(r2)
            pq.f r3 = (pq.f) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            pq.d r0 = pq.d.f20620a
            if (r0 != r3) goto L27
        L24:
            pq.i r3 = pq.i.f20621a
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.q.q(pq.g):pq.h");
    }

    public q q0(int i10) {
        bu.a.a(i10);
        return new bu.g(this, i10);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + w.l(this);
    }
}
