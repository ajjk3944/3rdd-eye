package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w44 extends yq2 {
    public int g;
    public final int h;
    public final /* synthetic */ a54 i;

    public w44(a54 a54Var) {
        super(2);
        this.i = a54Var;
        this.g = 0;
        this.h = a54Var.d();
    }

    @Override // defpackage.yq2
    public final byte a() {
        int i = this.g;
        if (i >= this.h) {
            throw new NoSuchElementException();
        }
        this.g = i + 1;
        return this.i.c(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.h;
    }
}
