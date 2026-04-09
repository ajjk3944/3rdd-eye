package androidx.lifecycle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public s f1099a;

    /* renamed from: b, reason: collision with root package name */
    public y f1100b;

    public final void a(a0 a0Var, r rVar) {
        s sVarA = rVar.a();
        s sVar = this.f1099a;
        nk.k.e(sVar, "state1");
        if (sVarA.compareTo(sVar) < 0) {
            sVar = sVarA;
        }
        this.f1099a = sVar;
        this.f1100b.g(a0Var, rVar);
        this.f1099a = sVarA;
    }
}
