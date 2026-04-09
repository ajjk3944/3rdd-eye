package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import h.AbstractC5936j;

/* renamed from: androidx.appcompat.widget.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3894t extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f27455b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f27456a;

    public C3894t(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    private void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        b0 b0VarV = b0.v(context, attributeSet, AbstractC5936j.f48183Y1, i10, i11);
        int i12 = AbstractC5936j.f48192a2;
        if (b0VarV.s(i12)) {
            b(b0VarV.a(i12, false));
        }
        setBackgroundDrawable(b0VarV.g(AbstractC5936j.f48187Z1));
        b0VarV.x();
    }

    private void b(boolean z10) {
        if (f27455b) {
            this.f27456a = z10;
        } else {
            androidx.core.widget.g.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f27455b && this.f27456a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f27455b && this.f27456a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f27455b && this.f27456a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
