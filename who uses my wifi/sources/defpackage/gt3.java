package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gt3 extends d42 {
    public final um f;
    public final k52 g;

    public gt3(um umVar, k52 k52Var) {
        this.f = umVar;
        this.g = k52Var;
    }

    @Override // defpackage.p42
    public final void O(nx2 nx2Var) {
        um umVar = this.f;
        if (umVar != null) {
            umVar.q(nx2Var.b());
        }
    }

    @Override // defpackage.p42
    public final void y() {
        k52 k52Var;
        um umVar = this.f;
        if (umVar == null || (k52Var = this.g) == null) {
            return;
        }
        umVar.r(k52Var);
    }
}
