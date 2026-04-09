package Di;

/* loaded from: classes4.dex */
public final class i extends a {

    /* renamed from: c, reason: collision with root package name */
    private final Object f3587c;

    public i(Object obj, int i10) {
        super(i10, 1);
        this.f3587c = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        d();
        h(f() + 1);
        return this.f3587c;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        e();
        h(f() - 1);
        return this.f3587c;
    }
}
