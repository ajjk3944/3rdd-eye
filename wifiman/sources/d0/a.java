package D0;

/* loaded from: classes.dex */
public final class a extends g {

    /* renamed from: a, reason: collision with root package name */
    private j f2766a;

    public a(j jVar) {
        super(null);
        this.f2766a = jVar;
    }

    @Override // D0.g
    public boolean a(c cVar) {
        return cVar == this.f2766a.getKey();
    }

    @Override // D0.g
    public Object b(c cVar) {
        if (!(cVar == this.f2766a.getKey())) {
            B0.a.b("Check failed.");
        }
        return this.f2766a.getValue();
    }

    public final void c(j jVar) {
        this.f2766a = jVar;
    }
}
