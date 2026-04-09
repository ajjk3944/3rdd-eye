package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vb3 extends eb2 {
    public final /* synthetic */ wq3 f;
    public final /* synthetic */ x73 g;
    public final /* synthetic */ jb3 h;

    public vb3(jb3 jb3Var, wq3 wq3Var, x73 x73Var) {
        this.f = wq3Var;
        this.g = x73Var;
        this.h = jb3Var;
    }

    @Override // defpackage.fb2
    public final void a(nx2 nx2Var) {
        String string = nx2Var.b().toString();
        jb3 jb3Var = this.h;
        String str = jb3Var.e.f;
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(string);
        sb.append(", adUnitId: ");
        sb.append(str);
        gi2.i0(sb.toString());
        jb3Var.q(nx2Var);
    }

    @Override // defpackage.fb2
    public final void b() {
        Objects.requireNonNull(this.h);
        this.f.d(this.g);
    }

    @Override // defpackage.fb2
    public final void t(int i) {
    }
}
