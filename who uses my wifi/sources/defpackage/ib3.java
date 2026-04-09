package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ib3 extends mw1 {
    public final /* synthetic */ wq3 f;
    public final /* synthetic */ ae3 g;
    public final /* synthetic */ jb3 h;

    public ib3(jb3 jb3Var, wq3 wq3Var, ae3 ae3Var) {
        this.f = wq3Var;
        this.g = ae3Var;
        this.h = jb3Var;
    }

    @Override // defpackage.nw1
    public final void W(nx2 nx2Var) {
        String string = nx2Var.b().toString();
        String str = this.g.f;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        gi2.i0(sb.toString());
        jb3 jb3Var = this.h;
        Objects.requireNonNull(jb3Var);
        jb3Var.q(nx2Var);
    }

    @Override // defpackage.nw1
    public final void d3(kw1 kw1Var) {
        Objects.requireNonNull(this.h);
        this.f.d(kw1Var);
    }

    @Override // defpackage.nw1
    public final void I(int i) {
    }
}
