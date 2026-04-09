package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h44 implements Iterator {
    public j44 f;
    public j44 g;
    public int h;
    public final /* synthetic */ k44 i;
    public final /* synthetic */ int j;

    public h44(k44 k44Var, int i) {
        this.j = i;
        Objects.requireNonNull(k44Var);
        this.i = k44Var;
        this.f = k44Var.j.i;
        this.g = null;
        this.h = k44Var.i;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final j44 a() {
        j44 j44Var = this.f;
        k44 k44Var = this.i;
        if (j44Var == k44Var.j) {
            throw new NoSuchElementException();
        }
        if (k44Var.i != this.h) {
            throw new ConcurrentModificationException();
        }
        this.f = j44Var.i;
        this.g = j44Var;
        return j44Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f != this.i.j;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.j) {
            case 1:
                return a().k;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        j44 j44Var = this.g;
        if (j44Var == null) {
            throw new IllegalStateException();
        }
        k44 k44Var = this.i;
        k44Var.b(j44Var, true);
        this.g = null;
        this.h = k44Var.i;
    }
}
