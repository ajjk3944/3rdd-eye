package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import c3.c;
import c3.f;

/* loaded from: classes.dex */
public class Group extends c {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // c3.c
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // c3.c
    public final void j() {
        f fVar = (f) getLayoutParams();
        fVar.f3180p0.O(0);
        fVar.f3180p0.L(0);
    }

    @Override // c3.c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }
}
