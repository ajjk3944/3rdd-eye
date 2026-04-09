package F3;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: F3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2799o extends AbstractC2792h {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C2800p f5930d;

    C2799o(C2800p c2800p) {
        this.f5930d = c2800p;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        AbstractC2807x.a(i10, this.f5930d.f5933e, "index");
        int i11 = i10 + i10;
        Object obj = this.f5930d.f5932d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f5930d.f5932d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5930d.f5933e;
    }
}
