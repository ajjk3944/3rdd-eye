package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hc4 extends ah4 {
    public final /* synthetic */ int c = 0;
    public final Object d;

    public hc4(oz1 oz1Var, fk1 fk1Var) {
        super(oz1Var);
        this.d = fk1Var;
    }

    @Override // defpackage.ah4, defpackage.oz1
    public ez1 b(int i, ez1 ez1Var, long j) {
        switch (this.c) {
            case 1:
                this.b.b(i, ez1Var, j);
                fk1 fk1Var = (fk1) this.d;
                ez1Var.b = fk1Var;
                kh1 kh1Var = fk1Var.b;
                return ez1Var;
            default:
                return super.b(i, ez1Var, j);
        }
    }

    @Override // defpackage.ah4, defpackage.oz1
    public sw1 d(int i, sw1 sw1Var, boolean z) {
        switch (this.c) {
            case 0:
                oz1 oz1Var = this.b;
                sw1 sw1VarD = oz1Var.d(i, sw1Var, z);
                if (oz1Var.b(sw1VarD.c, (ez1) this.d, 0L).b()) {
                    Object obj = sw1Var.a;
                    Object obj2 = sw1Var.b;
                    int i2 = sw1Var.c;
                    long j = sw1Var.d;
                    zb2 zb2Var = zb2.b;
                    sw1VarD.a(obj, obj2, i2, j, true);
                } else {
                    sw1VarD.e = true;
                }
                return sw1VarD;
            default:
                return super.d(i, sw1Var, z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc4(ic4 ic4Var, oz1 oz1Var) {
        super(oz1Var);
        Objects.requireNonNull(ic4Var);
        this.d = new ez1();
    }
}
