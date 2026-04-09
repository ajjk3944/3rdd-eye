package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b0 extends c0 implements RandomAccess {
    public final c0 f;
    public final int g;
    public final int h;

    public b0(c0 c0Var, int i, int i2) {
        this.f = c0Var;
        this.g = i;
        gi2.c(i, i2, c0Var.a());
        this.h = i2 - i;
    }

    @Override // defpackage.c0
    public final int a() {
        return this.h;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.h;
        if (i >= 0 && i < i2) {
            return this.f.get(this.g + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }

    @Override // defpackage.c0, java.util.List
    public final List subList(int i, int i2) {
        gi2.c(i, i2, this.h);
        int i3 = this.g;
        return new b0(this.f, i + i3, i3 + i2);
    }
}
