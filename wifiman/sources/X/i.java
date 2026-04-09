package X;

/* loaded from: classes.dex */
public final class i extends a {

    /* renamed from: c, reason: collision with root package name */
    private final Object f23997c;

    public i(Object obj, int i10) {
        super(i10, 1);
        this.f23997c = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        d();
        h(f() + 1);
        return this.f23997c;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        e();
        h(f() - 1);
        return this.f23997c;
    }
}
