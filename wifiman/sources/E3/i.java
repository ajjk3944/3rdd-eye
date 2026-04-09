package E3;

/* loaded from: classes.dex */
final class i extends g {

    /* renamed from: c, reason: collision with root package name */
    private final k f4026c;

    i(k kVar, int i10) {
        super(kVar.size(), i10);
        this.f4026c = kVar;
    }

    @Override // E3.g
    protected final Object a(int i10) {
        return this.f4026c.get(i10);
    }
}
