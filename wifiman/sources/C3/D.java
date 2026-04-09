package C3;

/* loaded from: classes.dex */
final class D extends B {

    /* renamed from: c, reason: collision with root package name */
    private final F f2202c;

    D(F f10, int i10) {
        super(f10.size(), i10);
        this.f2202c = f10;
    }

    @Override // C3.B
    protected final Object a(int i10) {
        return this.f2202c.get(i10);
    }
}
