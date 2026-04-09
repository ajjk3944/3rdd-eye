package wt;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f24636a;

    /* renamed from: b, reason: collision with root package name */
    public final e f24637b;

    /* renamed from: c, reason: collision with root package name */
    public final ar.o f24638c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f24639d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f24640e;

    public n(Object obj, e eVar, ar.o oVar, Object obj2, Throwable th2) {
        this.f24636a = obj;
        this.f24637b = eVar;
        this.f24638c = oVar;
        this.f24639d = obj2;
        this.f24640e = th2;
    }

    public static n a(n nVar, e eVar, Throwable th2, int i10) {
        Object obj = nVar.f24636a;
        if ((i10 & 2) != 0) {
            eVar = nVar.f24637b;
        }
        e eVar2 = eVar;
        ar.o oVar = nVar.f24638c;
        Object obj2 = nVar.f24639d;
        if ((i10 & 16) != 0) {
            th2 = nVar.f24640e;
        }
        return new n(obj, eVar2, oVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return br.l.a(this.f24636a, nVar.f24636a) && br.l.a(this.f24637b, nVar.f24637b) && br.l.a(this.f24638c, nVar.f24638c) && br.l.a(this.f24639d, nVar.f24639d) && br.l.a(this.f24640e, nVar.f24640e);
    }

    public final int hashCode() {
        Object obj = this.f24636a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        e eVar = this.f24637b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        ar.o oVar = this.f24638c;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Object obj2 = this.f24639d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f24640e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f24636a + ", cancelHandler=" + this.f24637b + ", onCancellation=" + this.f24638c + ", idempotentResume=" + this.f24639d + ", cancelCause=" + this.f24640e + ')';
    }

    public /* synthetic */ n(Object obj, e eVar, ar.o oVar, Throwable th2, int i10) {
        this(obj, (i10 & 2) != 0 ? null : eVar, (i10 & 4) != 0 ? null : oVar, (Object) null, (i10 & 16) != 0 ? null : th2);
    }
}
