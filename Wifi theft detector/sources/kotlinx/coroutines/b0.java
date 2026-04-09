package kotlinx.coroutines;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22228a;

    /* renamed from: b, reason: collision with root package name */
    public final m f22229b;

    /* renamed from: c, reason: collision with root package name */
    public final l9.l f22230c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22231d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f22232e;

    public b0(Object obj, m mVar, l9.l lVar, Object obj2, Throwable th) {
        this.f22228a = obj;
        this.f22229b = mVar;
        this.f22230c = lVar;
        this.f22231d = obj2;
        this.f22232e = th;
    }

    public static /* synthetic */ b0 b(b0 b0Var, Object obj, m mVar, l9.l lVar, Object obj2, Throwable th, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = b0Var.f22228a;
        }
        if ((i10 & 2) != 0) {
            mVar = b0Var.f22229b;
        }
        if ((i10 & 4) != 0) {
            lVar = b0Var.f22230c;
        }
        if ((i10 & 8) != 0) {
            obj2 = b0Var.f22231d;
        }
        if ((i10 & 16) != 0) {
            th = b0Var.f22232e;
        }
        Throwable th2 = th;
        l9.l lVar2 = lVar;
        return b0Var.a(obj, mVar, lVar2, obj2, th2);
    }

    public final b0 a(Object obj, m mVar, l9.l lVar, Object obj2, Throwable th) {
        return new b0(obj, mVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f22232e != null;
    }

    public final void d(p pVar, Throwable th) {
        m mVar = this.f22229b;
        if (mVar != null) {
            pVar.m(mVar, th);
        }
        l9.l lVar = this.f22230c;
        if (lVar != null) {
            pVar.n(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.p.a(this.f22228a, b0Var.f22228a) && kotlin.jvm.internal.p.a(this.f22229b, b0Var.f22229b) && kotlin.jvm.internal.p.a(this.f22230c, b0Var.f22230c) && kotlin.jvm.internal.p.a(this.f22231d, b0Var.f22231d) && kotlin.jvm.internal.p.a(this.f22232e, b0Var.f22232e);
    }

    public int hashCode() {
        Object obj = this.f22228a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        m mVar = this.f22229b;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        l9.l lVar = this.f22230c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f22231d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f22232e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f22228a + ", cancelHandler=" + this.f22229b + ", onCancellation=" + this.f22230c + ", idempotentResume=" + this.f22231d + ", cancelCause=" + this.f22232e + ')';
    }

    public /* synthetic */ b0(Object obj, m mVar, l9.l lVar, Object obj2, Throwable th, int i10, kotlin.jvm.internal.i iVar) {
        this(obj, (i10 & 2) != 0 ? null : mVar, (i10 & 4) != 0 ? null : lVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th);
    }
}
