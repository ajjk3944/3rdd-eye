package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class im3 implements Iterator {
    public int f;
    public int g;
    public int h;
    public final /* synthetic */ lm3 i;
    public final /* synthetic */ int j;
    public final /* synthetic */ lm3 k;

    public im3(lm3 lm3Var, char c) {
        Objects.requireNonNull(lm3Var);
        this.i = lm3Var;
        this.f = lm3Var.j;
        this.g = lm3Var.isEmpty() ? -1 : 0;
        this.h = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object km3Var;
        lm3 lm3Var = this.i;
        if (lm3Var.j != this.f) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.g;
        this.h = i;
        switch (this.j) {
            case 0:
                km3Var = this.k.b()[i];
                break;
            case 1:
                km3Var = new km3(this.k, i);
                break;
            default:
                km3Var = this.k.c()[i];
                break;
        }
        int i2 = this.g + 1;
        if (i2 >= lm3Var.k) {
            i2 = -1;
        }
        this.g = i2;
        return km3Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        lm3 lm3Var = this.i;
        if (lm3Var.j != this.f) {
            throw new ConcurrentModificationException();
        }
        zt0.c0("no calls to next() since the last call to remove()", this.h >= 0);
        this.f += 32;
        lm3Var.remove(lm3Var.b()[this.h]);
        this.g--;
        this.h = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public im3(lm3 lm3Var, int i) {
        this(lm3Var, (char) 0);
        this.j = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(lm3Var);
                this.k = lm3Var;
                this(lm3Var, (char) 0);
                break;
            case 2:
                Objects.requireNonNull(lm3Var);
                this.k = lm3Var;
                this(lm3Var, (char) 0);
                break;
            default:
                Objects.requireNonNull(lm3Var);
                this.k = lm3Var;
                break;
        }
    }
}
