package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qw1 implements wv1 {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ Object g;

    public qw1(bu1 bu1Var) {
        Objects.requireNonNull(bu1Var);
        this.g = bu1Var;
    }

    @Override // defpackage.wv1
    public final void T(boolean z) {
        switch (this.f) {
            case 0:
                bu1 bu1Var = (bu1) this.g;
                if (!z) {
                    bu1Var.y();
                    break;
                } else {
                    bu1Var.E();
                    break;
                }
            case 1:
                if (((Boolean) tw1.e.c.a(mz1.y)).booleanValue()) {
                    ((gb3) this.g).b(z);
                    break;
                }
                break;
            default:
                if (((Boolean) tw1.e.c.a(mz1.y)).booleanValue()) {
                    ((nb3) this.g).c(z);
                    break;
                }
                break;
        }
    }

    public qw1(gb3 gb3Var) {
        Objects.requireNonNull(gb3Var);
        this.g = gb3Var;
    }

    public qw1(nb3 nb3Var) {
        Objects.requireNonNull(nb3Var);
        this.g = nb3Var;
    }
}
