package kotlinx.coroutines;

/* loaded from: classes4.dex */
public final class v extends s1 implements u {

    /* renamed from: e, reason: collision with root package name */
    public final w f22695e;

    public v(w wVar) {
        this.f22695e = wVar;
    }

    @Override // kotlinx.coroutines.u
    public boolean b(Throwable th) {
        return z().S(th);
    }

    @Override // kotlinx.coroutines.u
    public r1 getParent() {
        return z();
    }

    @Override // l9.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        y((Throwable) obj);
        return y8.s.f25199a;
    }

    @Override // kotlinx.coroutines.e0
    public void y(Throwable th) {
        this.f22695e.g(z());
    }
}
