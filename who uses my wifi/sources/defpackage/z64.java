package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class z64 implements Iterator {
    public int f;
    public boolean g;
    public Iterator h;
    public final /* synthetic */ x64 i;

    public /* synthetic */ z64(x64 x64Var) {
        Objects.requireNonNull(x64Var);
        this.i = x64Var;
        this.f = -1;
    }

    public final Iterator a() {
        if (this.h == null) {
            this.h = this.i.h.entrySet().iterator();
        }
        return this.h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f + 1;
        x64 x64Var = this.i;
        if (i >= x64Var.g) {
            return !x64Var.h.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.g = true;
        int i = this.f + 1;
        this.f = i;
        x64 x64Var = this.i;
        return i < x64Var.g ? (y64) x64Var.f[i] : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.g = false;
        x64 x64Var = this.i;
        x64Var.f();
        int i = this.f;
        if (i >= x64Var.g) {
            a().remove();
        } else {
            this.f = i - 1;
            x64Var.d(i);
        }
    }
}
