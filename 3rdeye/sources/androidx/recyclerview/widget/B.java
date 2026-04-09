package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes.dex */
public final class B extends u {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C f16367q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c10, Context context) {
        super(context);
        this.f16367q = c10;
    }

    @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.RecyclerView.A
    public final void e(View view, RecyclerView.A.a aVar) {
        C c10 = this.f16367q;
        int[] iArrB = c10.b(c10.f16381a.getLayoutManager(), view);
        int i = iArrB[0];
        int i10 = iArrB[1];
        int iCeil = (int) Math.ceil(k(Math.max(Math.abs(i), Math.abs(i10))) / 0.3356d);
        if (iCeil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f16769j;
            aVar.f16456a = i;
            aVar.f16457b = i10;
            aVar.f16458c = iCeil;
            aVar.f16460e = decelerateInterpolator;
            aVar.f16461f = true;
        }
    }

    @Override // androidx.recyclerview.widget.u
    public final float j(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.u
    public final int k(int i) {
        return Math.min(100, super.k(i));
    }
}
