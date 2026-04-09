package F3;

/* renamed from: F3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2790f extends AbstractC2809z {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC2792h f5900c;

    C2790f(AbstractC2792h abstractC2792h, int i10) {
        super(abstractC2792h.size(), i10);
        this.f5900c = abstractC2792h;
    }

    @Override // F3.AbstractC2809z
    protected final Object a(int i10) {
        return this.f5900c.get(i10);
    }
}
