package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t70 {
    public final ug0 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ nf0 d;

    public t70(nf0 nf0Var, ug0 ug0Var) {
        this.d = nf0Var;
        this.a = ug0Var;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        nf0 nf0Var = this.d;
        int i2 = nf0Var.c;
        nf0Var.c = i + i2;
        if (!nf0Var.d) {
            nf0Var.d = true;
            while (true) {
                try {
                    int i3 = nf0Var.c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    nf0Var.d = false;
                }
            }
        }
        if (this.b) {
            nf0Var.c(this);
        }
    }
}
