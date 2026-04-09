package androidx.datastore.core;

/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2922a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2923b;

    public b(Object obj, int i10) {
        super(null);
        this.f2922a = obj;
        this.f2923b = i10;
    }

    public final void a() {
        Object obj = this.f2922a;
        if (!((obj != null ? obj.hashCode() : 0) == this.f2923b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object b() {
        return this.f2922a;
    }
}
