package defpackage;

import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e4 implements j4 {
    public final c4 f;
    public final c4 g;

    public e4(c4 c4Var, c4 c4Var2) {
        this.f = c4Var;
        this.g = c4Var2;
    }

    @Override // defpackage.j4
    public final ba Q0() {
        return new mx0(this.f.Q0(), this.g.Q0());
    }

    @Override // defpackage.j4
    public final List c1() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.j4
    public final boolean g1() {
        return this.f.g1() && this.g.g1();
    }
}
