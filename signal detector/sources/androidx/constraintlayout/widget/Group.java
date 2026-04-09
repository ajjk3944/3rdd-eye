package androidx.constraintlayout.widget;

import C.c;
import C.e;
import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class Group extends c {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // C.c
    public final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // C.c
    public final void j() {
        e eVar = (e) getLayoutParams();
        eVar.f871p0.O(0);
        eVar.f871p0.L(0);
    }

    @Override // C.c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }
}
