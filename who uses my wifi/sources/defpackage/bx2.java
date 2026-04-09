package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bx2 extends um {
    public final /* synthetic */ ex2 A;
    public final /* synthetic */ int y;
    public final /* synthetic */ String z;

    public bx2(ex2 ex2Var, String str, int i) {
        this.y = i;
        switch (i) {
            case 1:
                this.z = str;
                Objects.requireNonNull(ex2Var);
                this.A = ex2Var;
                break;
            case 2:
                this.z = str;
                Objects.requireNonNull(ex2Var);
                this.A = ex2Var;
                break;
            default:
                this.z = str;
                Objects.requireNonNull(ex2Var);
                this.A = ex2Var;
                break;
        }
    }

    @Override // defpackage.um
    public final void q(u70 u70Var) {
        switch (this.y) {
            case 0:
                this.A.C3(ex2.F3(u70Var));
                break;
            case 1:
                this.A.C3(ex2.F3(u70Var));
                break;
            default:
                this.A.C3(ex2.F3(u70Var));
                break;
        }
    }

    @Override // defpackage.um
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        switch (this.y) {
            case 0:
                String str = this.z;
                this.A.B3((hw1) obj, str);
                break;
            case 1:
                String str2 = this.z;
                this.A.B3((hb2) obj, str2);
                break;
            default:
                String str3 = this.z;
                this.A.B3((pb2) obj, str3);
                break;
        }
    }
}
