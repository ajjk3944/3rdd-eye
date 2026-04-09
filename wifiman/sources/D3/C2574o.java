package D3;

import java.util.Objects;

/* renamed from: D3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2574o extends AbstractC2564e {

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f2871d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f2872e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f2873f;

    C2574o(Object[] objArr, int i10, int i11) {
        this.f2871d = objArr;
        this.f2872e = i10;
        this.f2873f = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        P.a(i10, this.f2873f, "index");
        Object obj = this.f2871d[i10 + i10 + this.f2872e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2873f;
    }
}
