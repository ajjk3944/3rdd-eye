package D3;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: D3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2571l extends AbstractC2564e {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2572m f2865d;

    C2571l(C2572m c2572m) {
        this.f2865d = c2572m;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        P.a(i10, this.f2865d.f2868e, "index");
        int i11 = i10 + i10;
        Object obj = this.f2865d.f2867d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f2865d.f2867d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2865d.f2868e;
    }
}
