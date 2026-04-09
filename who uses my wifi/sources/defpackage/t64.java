package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t64 implements Iterator {
    public final ArrayDeque f;
    public y44 g;

    public t64(a54 a54Var) {
        if (!(a54Var instanceof u64)) {
            this.f = null;
            this.g = (y44) a54Var;
            return;
        }
        u64 u64Var = (u64) a54Var;
        ArrayDeque arrayDeque = new ArrayDeque(u64Var.l);
        this.f = arrayDeque;
        arrayDeque.push(u64Var);
        a54 a54Var2 = u64Var.i;
        while (a54Var2 instanceof u64) {
            u64 u64Var2 = (u64) a54Var2;
            this.f.push(u64Var2);
            a54Var2 = u64Var2.i;
        }
        this.g = (y44) a54Var2;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y44 next() {
        y44 y44Var;
        y44 y44Var2 = this.g;
        if (y44Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f;
            y44Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            a54 a54Var = ((u64) arrayDeque.pop()).j;
            while (a54Var instanceof u64) {
                u64 u64Var = (u64) a54Var;
                arrayDeque.push(u64Var);
                a54Var = u64Var.i;
            }
            y44Var = (y44) a54Var;
        } while (y44Var.d() == 0);
        this.g = y44Var;
        return y44Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
