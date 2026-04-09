package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bk0 extends w60 {
    public final /* synthetic */ ck0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk0(ck0 ck0Var, Context context) {
        super(context);
        this.p = ck0Var;
    }

    @Override // defpackage.w60
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // defpackage.w60
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // defpackage.w60
    public final void h(View view, ro0 ro0Var) {
        ck0 ck0Var = this.p;
        int[] iArrA = ck0Var.a(ck0Var.a.getLayoutManager(), view);
        int i = iArrA[0];
        int i2 = iArrA[1];
        int iCeil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
        if (iCeil > 0) {
            ro0Var.a = i;
            ro0Var.b = i2;
            ro0Var.c = iCeil;
            ro0Var.e = this.i;
            ro0Var.f = true;
        }
    }
}
