package uk;

import e4.y0;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements f, c {

    /* renamed from: a, reason: collision with root package name */
    public final f f35517a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35518b;

    public b(f fVar, int i4) {
        nk.k.e(fVar, "sequence");
        this.f35517a = fVar;
        this.f35518b = i4;
        if (i4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i4 + '.').toString());
    }

    @Override // uk.c
    public final f a(int i4) {
        int i10 = this.f35518b + i4;
        return i10 < 0 ? new b(this, i4) : new b(this.f35517a, i10);
    }

    @Override // uk.f
    public final Iterator iterator() {
        return new y0(this);
    }
}
