package defpackage;

import java.io.File;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b42 implements ca4 {
    public final /* synthetic */ int a;
    public final ba4 b;
    public final ga4 c;
    public final ba4 d;

    public b42(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = ba4Var;
                this.c = ba4Var2;
                this.d = ba4Var3;
                break;
            case 2:
                this.b = ba4Var;
                this.d = ba4Var2;
                this.c = ba4Var3;
                break;
            default:
                this.c = ba4Var;
                this.b = ba4Var2;
                this.d = ba4Var3;
                break;
        }
    }

    @Override // defpackage.ga4
    public final /* bridge */ /* synthetic */ Object d() {
        switch (this.a) {
            case 0:
                return new q32((lu1) this.c.d(), ((Integer) this.b.d()).intValue(), (String) this.d.d());
            case 1:
                return new hv2((jv2) this.b.d(), (pv2) this.c.d(), ((Integer) this.d.d()).intValue());
            default:
                return new jj3((File) this.b.d(), (fd3) this.d.d(), (gk3) this.c.d());
        }
    }
}
