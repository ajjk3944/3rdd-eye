package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xb2 implements ca4 {
    public final /* synthetic */ int a;
    public final ba4 b;
    public final da4 c;

    public /* synthetic */ xb2(ba4 ba4Var, da4 da4Var, int i) {
        this.a = i;
        this.b = ba4Var;
        this.c = da4Var;
    }

    @Override // defpackage.ga4
    public final Object d() {
        switch (this.a) {
            case 0:
                return new gw3((ym) this.c.a, (vb2) this.b.d(), 24, false);
            case 1:
                return new cv2((cx1) this.b.d(), (m73) this.c.a);
            case 2:
                Context context = (Context) this.b.d();
                zh2 zh2Var = (zh2) this.c.a;
                ld2 ld2Var = md2.a;
                i41.M(ld2Var);
                return new l03(context, zh2Var, ld2Var, 0);
            case 3:
                return new n03((Context) this.b.d(), (zh2) this.c.a, 0);
            case 4:
                return new r03((Context) this.b.d(), (bi2) this.c.a);
            case 5:
                return new n03((Context) this.b.d(), (ei2) this.c.a, 1);
            default:
                return new n03((Context) this.b.d(), (ji2) this.c.a, 2);
        }
    }

    public xb2(da4 da4Var, ba4 ba4Var) {
        this.a = 0;
        this.c = da4Var;
        this.b = ba4Var;
    }
}
