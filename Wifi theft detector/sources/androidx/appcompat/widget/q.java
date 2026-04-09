package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class q extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f1290b = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1291a;

    public q(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(context, attributeSet, i10, i11);
    }

    public final void a(Context context, AttributeSet attributeSet, int i10, int i11) {
        z0 z0VarV = z0.v(context, attributeSet, c.j.PopupWindow, i10, i11);
        int i12 = c.j.PopupWindow_overlapAnchor;
        if (z0VarV.s(i12)) {
            b(z0VarV.a(i12, false));
        }
        setBackgroundDrawable(z0VarV.g(c.j.PopupWindow_android_popupBackground));
        z0VarV.x();
    }

    public final void b(boolean z10) {
        if (f1290b) {
            this.f1291a = z10;
        } else {
            androidx.core.widget.g.a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f1290b && this.f1291a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f1290b && this.f1291a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f1290b && this.f1291a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }
}
