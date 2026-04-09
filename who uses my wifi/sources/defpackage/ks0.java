package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ks0 extends ns0 implements Iterator {
    public ls0 f;
    public ls0 g;
    public final /* synthetic */ int h;

    public ks0(ls0 ls0Var, ls0 ls0Var2, int i) {
        this.h = i;
        this.f = ls0Var2;
        this.g = ls0Var;
    }

    @Override // defpackage.ns0
    public final void a(ls0 ls0Var) {
        ls0 ls0Var2;
        ls0 ls0VarB = null;
        if (this.f == ls0Var && ls0Var == this.g) {
            this.g = null;
            this.f = null;
        }
        ls0 ls0Var3 = this.f;
        if (ls0Var3 == ls0Var) {
            switch (this.h) {
                case 0:
                    ls0Var2 = ls0Var3.i;
                    break;
                default:
                    ls0Var2 = ls0Var3.h;
                    break;
            }
            this.f = ls0Var2;
        }
        ls0 ls0Var4 = this.g;
        if (ls0Var4 == ls0Var) {
            ls0 ls0Var5 = this.f;
            if (ls0Var4 != ls0Var5 && ls0Var5 != null) {
                ls0VarB = b(ls0Var4);
            }
            this.g = ls0VarB;
        }
    }

    public final ls0 b(ls0 ls0Var) {
        switch (this.h) {
            case 0:
                return ls0Var.h;
            default:
                return ls0Var.i;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ls0 ls0Var = this.g;
        ls0 ls0Var2 = this.f;
        this.g = (ls0Var == ls0Var2 || ls0Var2 == null) ? null : b(ls0Var);
        return ls0Var;
    }
}
