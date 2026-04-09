package O1;

/* loaded from: classes.dex */
final class b extends m {

    /* renamed from: a, reason: collision with root package name */
    private final Object f16763a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16764b;

    public b(Object obj, int i10) {
        super(null);
        this.f16763a = obj;
        this.f16764b = i10;
    }

    public final void a() {
        Object obj = this.f16763a;
        if (!((obj != null ? obj.hashCode() : 0) == this.f16764b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object b() {
        return this.f16763a;
    }
}
