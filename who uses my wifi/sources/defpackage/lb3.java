package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class lb3 extends d42 {
    public final /* synthetic */ wq3 f;
    public final /* synthetic */ w23 g;
    public final /* synthetic */ jb3 h;

    public lb3(jb3 jb3Var, wq3 wq3Var, w23 w23Var) {
        this.f = wq3Var;
        this.g = w23Var;
        this.h = jb3Var;
    }

    @Override // defpackage.p42
    public final void O(nx2 nx2Var) {
        String string = nx2Var.b().toString();
        jb3 jb3Var = this.h;
        String str = jb3Var.e.f;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(string);
        sb.append(" for ad unit: ");
        sb.append(str);
        gi2.i0(sb.toString());
        jb3Var.q(nx2Var);
    }

    @Override // defpackage.p42
    public final void y() {
        Objects.requireNonNull(this.h);
        this.f.d(this.g);
    }
}
