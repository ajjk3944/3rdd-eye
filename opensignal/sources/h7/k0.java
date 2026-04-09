package h7;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: classes.dex */
public final class k0 extends e0 {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l0 f10118q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(l0 l0Var, Context context) {
        super(context);
        this.f10118q = l0Var;
    }

    @Override // h7.e0
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // h7.e0
    public final int e(int i10) {
        return Math.min(100, super.e(i10));
    }

    @Override // h7.e0
    public final void i(View view, h1 h1Var) {
        l0 l0Var = this.f10118q;
        int[] iArrB = l0Var.b(l0Var.f10125a.getLayoutManager(), view);
        int i10 = iArrB[0];
        int i11 = iArrB[1];
        int iCeil = (int) Math.ceil(e(Math.max(Math.abs(i10), Math.abs(i11))) / 0.3356d);
        if (iCeil > 0) {
            h1Var.f10079a = i10;
            h1Var.f10080b = i11;
            h1Var.f10081c = iCeil;
            h1Var.f10083e = this.j;
            h1Var.f10084f = true;
        }
    }
}
