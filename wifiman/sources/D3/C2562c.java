package D3;

/* renamed from: D3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2562c extends S {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2564e f2849c;

    C2562c(AbstractC2564e abstractC2564e, int i10) {
        super(abstractC2564e.size(), i10);
        this.f2849c = abstractC2564e;
    }

    @Override // D3.S
    protected final Object a(int i10) {
        return this.f2849c.get(i10);
    }
}
