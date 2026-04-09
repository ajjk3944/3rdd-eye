package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class q8 implements Iterator, Map.Entry {
    public int f;
    public int g = -1;
    public boolean h;
    public final /* synthetic */ s8 i;

    public q8(s8 s8Var) {
        this.i = s8Var;
        this.f = s8Var.h - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.g;
        s8 s8Var = this.i;
        return i30.c(key, s8Var.f(i)) && i30.c(entry.getValue(), s8Var.i(this.g));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.h) {
            return this.i.f(this.g);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.h) {
            return this.i.i(this.g);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g < this.f;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.h) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.g;
        s8 s8Var = this.i;
        Object objF = s8Var.f(i);
        Object objI = s8Var.i(this.g);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.g++;
        this.h = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            throw new IllegalStateException();
        }
        this.i.g(this.g);
        this.g--;
        this.f--;
        this.h = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.h) {
            return this.i.h(this.g, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
