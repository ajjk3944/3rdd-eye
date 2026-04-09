package F3;

import java.util.Objects;

/* loaded from: classes.dex */
final class r extends AbstractC2792h {

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f5936d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f5937e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f5938f;

    r(Object[] objArr, int i10, int i11) {
        this.f5936d = objArr;
        this.f5937e = i10;
        this.f5938f = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC2807x.a(i10, this.f5938f, "index");
        Object obj = this.f5936d[i10 + i10 + this.f5937e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5938f;
    }
}
