package d5;

import java.util.RandomAccess;

/* renamed from: d5.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2275c extends AbstractC2276d implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC2276d f19812a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19813b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19814c;

    public C2275c(AbstractC2276d abstractC2276d, int i, int i3) {
        this.f19812a = abstractC2276d;
        this.f19813b = i;
        T2.g.c(i, i3, abstractC2276d.a());
        this.f19814c = i3 - i;
    }

    @Override // d5.AbstractC2276d
    public final int a() {
        return this.f19814c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i3 = this.f19814c;
        if (i < 0 || i >= i3) {
            throw new IndexOutOfBoundsException(A.f.g(i, i3, "index: ", ", size: "));
        }
        return this.f19812a.get(this.f19813b + i);
    }
}
