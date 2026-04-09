package xk;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f37211a;

    /* renamed from: b, reason: collision with root package name */
    public final f f37212b;

    /* renamed from: c, reason: collision with root package name */
    public final mk.f f37213c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f37214d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f37215e;

    public o(Object obj, f fVar, mk.f fVar2, Object obj2, Throwable th2) {
        this.f37211a = obj;
        this.f37212b = fVar;
        this.f37213c = fVar2;
        this.f37214d = obj2;
        this.f37215e = th2;
    }

    public static o a(o oVar, f fVar, Throwable th2, int i4) {
        Object obj = oVar.f37211a;
        if ((i4 & 2) != 0) {
            fVar = oVar.f37212b;
        }
        f fVar2 = fVar;
        mk.f fVar3 = oVar.f37213c;
        Object obj2 = oVar.f37214d;
        if ((i4 & 16) != 0) {
            th2 = oVar.f37215e;
        }
        return new o(obj, fVar2, fVar3, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return nk.k.a(this.f37211a, oVar.f37211a) && nk.k.a(this.f37212b, oVar.f37212b) && nk.k.a(this.f37213c, oVar.f37213c) && nk.k.a(this.f37214d, oVar.f37214d) && nk.k.a(this.f37215e, oVar.f37215e);
    }

    public final int hashCode() {
        Object obj = this.f37211a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        f fVar = this.f37212b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        mk.f fVar2 = this.f37213c;
        int iHashCode3 = (iHashCode2 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        Object obj2 = this.f37214d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f37215e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f37211a + ", cancelHandler=" + this.f37212b + ", onCancellation=" + this.f37213c + ", idempotentResume=" + this.f37214d + ", cancelCause=" + this.f37215e + ')';
    }

    public /* synthetic */ o(Object obj, f fVar, mk.f fVar2, Throwable th2, int i4) {
        this(obj, (i4 & 2) != 0 ? null : fVar, (i4 & 4) != 0 ? null : fVar2, (Object) null, (i4 & 16) != 0 ? null : th2);
    }
}
