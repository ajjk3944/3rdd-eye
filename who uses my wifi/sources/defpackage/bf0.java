package defpackage;

import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bf0 extends v61 {
    public static final ni0 l;

    static {
        ni0 ni0VarA = ni0.a(2, new bf0(null, 0.0f, null, null));
        l = ni0VarA;
        ni0VarA.f = 0.5f;
    }

    public bf0(u61 u61Var, float f, uk1 uk1Var, View view) {
        this.g = new float[2];
        this.h = u61Var;
        this.i = f;
        this.j = uk1Var;
        this.k = view;
    }

    @Override // defpackage.mi0
    public final mi0 a() {
        return new bf0(this.h, this.i, this.j, this.k);
    }

    @Override // java.lang.Runnable
    public final void run() {
        float[] fArr = this.g;
        fArr[0] = this.i;
        fArr[1] = 0.0f;
        this.j.e(fArr);
        this.h.a(fArr, this.k);
        l.c(this);
    }
}
