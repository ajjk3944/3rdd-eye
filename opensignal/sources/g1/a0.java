package g1;

/* loaded from: classes.dex */
public final class a0 extends f0 {

    /* renamed from: e, reason: collision with root package name */
    public final f1.c f9197e;

    public a0(f1.c cVar) {
        this.f9197e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            return br.l.a(this.f9197e, ((a0) obj).f9197e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9197e.hashCode();
    }

    @Override // g1.f0
    public final f1.c i() {
        return this.f9197e;
    }
}
