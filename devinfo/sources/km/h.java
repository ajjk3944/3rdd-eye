package km;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28419a;

    /* renamed from: b, reason: collision with root package name */
    public final j f28420b;

    public /* synthetic */ h(j jVar, int i4) {
        this.f28419a = i4;
        this.f28420b = jVar;
    }

    @Override // km.g
    public final void g(d dVar, Throwable th2) {
        switch (this.f28419a) {
            case 0:
                this.f28420b.completeExceptionally(th2);
                break;
            default:
                this.f28420b.completeExceptionally(th2);
                break;
        }
    }

    @Override // km.g
    public final void p(d dVar, v0 v0Var) {
        switch (this.f28419a) {
            case 0:
                boolean z3 = v0Var.f28510a.f33217p;
                j jVar = this.f28420b;
                if (!z3) {
                    jVar.completeExceptionally(new s(v0Var));
                    break;
                } else {
                    jVar.complete(v0Var.f28511b);
                    break;
                }
            default:
                this.f28420b.complete(v0Var);
                break;
        }
    }
}
