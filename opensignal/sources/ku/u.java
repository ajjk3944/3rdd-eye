package ku;

/* loaded from: classes.dex */
public final class u extends r0 {

    /* renamed from: l, reason: collision with root package name */
    public final iu.i f14624l;

    /* renamed from: m, reason: collision with root package name */
    public final lq.q f14625m;

    public u(final String str, final int i10) {
        super(str, null, i10);
        this.f14624l = iu.i.f13010d;
        this.f14625m = kc.f.F(new ar.a() { // from class: ku.t
            @Override // ar.a
            public final Object c() {
                int i11 = i10;
                iu.e[] eVarArr = new iu.e[i11];
                for (int i12 = 0; i12 < i11; i12++) {
                    eVarArr[i12] = dr.a.c(str + '.' + this.f14610e[i12], iu.j.f13014g, new iu.e[0]);
                }
                return eVarArr;
            }
        });
    }

    @Override // ku.r0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof iu.e)) {
            return false;
        }
        iu.e eVar = (iu.e) obj;
        return eVar.f() == iu.i.f13010d && this.f14606a.equals(eVar.h()) && br.l.a(p0.b(this), p0.b(eVar));
    }

    @Override // ku.r0, iu.e
    public final i3.g f() {
        return this.f14624l;
    }

    @Override // ku.r0
    public final int hashCode() {
        int iHashCode = this.f14606a.hashCode();
        br.b bVar = new br.b(this);
        int iHashCode2 = 1;
        while (bVar.hasNext()) {
            int i10 = iHashCode2 * 31;
            String str = (String) bVar.next();
            iHashCode2 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (iHashCode * 31) + iHashCode2;
    }

    @Override // ku.r0, iu.e
    public final iu.e n(int i10) {
        return ((iu.e[]) this.f14625m.getValue())[i10];
    }

    @Override // ku.r0
    public final String toString() {
        return mq.o.x0(new iu.g(0, this), ", ", this.f14606a.concat("("), ")", null, 56);
    }
}
