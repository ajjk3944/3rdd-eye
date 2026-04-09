package m1;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public ar.k f16119a;

    public abstract void a(i1.d dVar);

    public ar.k b() {
        return this.f16119a;
    }

    public final void c() {
        ar.k kVarB = b();
        if (kVarB != null) {
            kVarB.a(this);
        }
    }

    public void d(j1.a aVar) {
        this.f16119a = aVar;
    }
}
