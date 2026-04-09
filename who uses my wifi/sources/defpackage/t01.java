package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t01 extends ob1 {
    public final /* synthetic */ Context q;
    public final /* synthetic */ TextPaint r;
    public final /* synthetic */ ob1 s;
    public final /* synthetic */ u01 t;

    public t01(u01 u01Var, Context context, TextPaint textPaint, ob1 ob1Var) {
        this.t = u01Var;
        this.q = context;
        this.r = textPaint;
        this.s = ob1Var;
    }

    @Override // defpackage.ob1
    public final void p(int i) {
        this.s.p(i);
    }

    @Override // defpackage.ob1
    public final void q(Typeface typeface, boolean z) {
        this.t.f(this.q, this.r, typeface);
        this.s.q(typeface, z);
    }
}
