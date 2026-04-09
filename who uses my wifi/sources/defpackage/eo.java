package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class eo implements Iterator, p40 {
    public int f = -1;
    public int g;
    public int h;
    public d30 i;
    public final /* synthetic */ fo j;

    public eo(fo foVar) {
        this.j = foVar;
        int length = ((CharSequence) foVar.b).length();
        if (length >= 0) {
            length = length >= 0 ? 0 : length;
            this.g = length;
            this.h = length;
        } else {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
    }

    public final void a() {
        gk0 gk0Var;
        fo foVar = this.j;
        CharSequence charSequence = (CharSequence) foVar.b;
        int i = this.h;
        if (i < 0) {
            this.f = 0;
            this.i = null;
            return;
        }
        if (i <= charSequence.length() && (gk0Var = (gk0) ((fa0) foVar.c).f(charSequence, Integer.valueOf(this.h))) != null) {
            int iIntValue = ((Number) gk0Var.f).intValue();
            int iIntValue2 = ((Number) gk0Var.g).intValue();
            this.i = iIntValue <= Integer.MIN_VALUE ? d30.i : new d30(this.g, iIntValue - 1, 1);
            int i2 = iIntValue + iIntValue2;
            this.g = i2;
            this.h = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.i = new d30(this.g, sy0.z(charSequence), 1);
            this.h = -1;
        }
        this.f = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f == -1) {
            a();
        }
        return this.f == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f == -1) {
            a();
        }
        if (this.f == 0) {
            throw new NoSuchElementException();
        }
        d30 d30Var = this.i;
        i30.k(d30Var, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.i = null;
        this.f = -1;
        return d30Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
