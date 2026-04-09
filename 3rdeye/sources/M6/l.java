package M6;

import K6.C0713c;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: DivPagerPageLayout.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class l extends X6.g {

    /* renamed from: o, reason: collision with root package name */
    public final F7.m f4269o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j6.e context, F7.m mVar) {
        super(context);
        kotlin.jvm.internal.l.f(context, "context");
        this.f4269o = mVar;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        kotlin.jvm.internal.l.f(canvas, "canvas");
        if (view != null && view.getVisibility() == 0) {
            C0713c.E(view, canvas);
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // r7.g, android.view.View
    public final void onMeasure(int i, int i10) {
        if (getChildCount() == 0) {
            super.onMeasure(i, i10);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getChildAt(0).getLayoutParams();
        boolean zBooleanValue = ((Boolean) this.f4269o.invoke()).booleanValue();
        if (zBooleanValue) {
            setMinimumHeight(View.MeasureSpec.getMode(i10) == 0 ? 0 : View.MeasureSpec.getSize(i10));
        } else {
            setMinimumWidth(View.MeasureSpec.getMode(i) == 0 ? 0 : View.MeasureSpec.getSize(i));
        }
        int i11 = layoutParams.width;
        if (!zBooleanValue && i11 != -1 && i11 != -3) {
            i = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        int i12 = layoutParams.height;
        if (zBooleanValue && i12 != -1 && i12 != -3) {
            i10 = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        super.onMeasure(i, i10);
    }
}
