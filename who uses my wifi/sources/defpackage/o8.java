package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o8 implements Iterator, p40 {
    public int f;
    public int g;
    public boolean h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    public o8(int i) {
        this.f = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.g;
        switch (this.i) {
            case 0:
                objF = ((s8) this.j).f(i);
                break;
            case 1:
                objF = ((s8) this.j).i(i);
                break;
            default:
                objF = ((u8) this.j).g[i];
                break;
        }
        this.g++;
        this.h = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.g - 1;
        this.g = i;
        switch (this.i) {
            case 0:
                ((s8) this.j).g(i);
                break;
            case 1:
                ((s8) this.j).g(i);
                break;
            default:
                ((u8) this.j).a(i);
                break;
        }
        this.f--;
        this.h = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o8(u8 u8Var) {
        this(u8Var.h);
        this.i = 2;
        this.j = u8Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o8(s8 s8Var, int i) {
        this(s8Var.h);
        this.i = i;
        switch (i) {
            case 1:
                this.j = s8Var;
                this(s8Var.h);
                break;
            default:
                this.j = s8Var;
                break;
        }
    }
}
