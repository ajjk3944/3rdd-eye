package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class w72 extends f74 {
    public final ug4 i;
    public final String j;
    public final x34 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w72(Context context, String str, String str2, x34 x34Var) {
        super(6);
        String strD = hg4.C.c.D(context, str);
        this.i = new ug4(context, strD);
        this.j = str2;
        this.k = x34Var;
    }

    @Override // defpackage.f74
    public final void p1() {
        String str = this.j;
        x34 x34Var = this.k;
        if (x34Var == null) {
            this.i.a(str, null);
            return;
        }
        new g4((cd4) x34Var.f, this.i, md2.e, null, null, 16).g(str);
    }
}
