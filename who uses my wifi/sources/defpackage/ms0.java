package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ms0 extends ns0 implements Iterator {
    public ls0 f;
    public boolean g = true;
    public final /* synthetic */ os0 h;

    public ms0(os0 os0Var) {
        this.h = os0Var;
    }

    @Override // defpackage.ns0
    public final void a(ls0 ls0Var) {
        ls0 ls0Var2 = this.f;
        if (ls0Var == ls0Var2) {
            ls0 ls0Var3 = ls0Var2.i;
            this.f = ls0Var3;
            this.g = ls0Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.g) {
            return this.h.f != null;
        }
        ls0 ls0Var = this.f;
        return (ls0Var == null || ls0Var.h == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.g) {
            this.g = false;
            this.f = this.h.f;
        } else {
            ls0 ls0Var = this.f;
            this.f = ls0Var != null ? ls0Var.h : null;
        }
        return this.f;
    }
}
