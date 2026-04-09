package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class q extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f1089b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f1090a;

    static {
        f1089b = Build.VERSION.SDK_INT < 21;
    }

    public q(Context context, AttributeSet attributeSet, int i2, int i3) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super(context, attributeSet, i2, i3);
        a(context, attributeSet, i2, i3);
    }

    private void a(Context context, AttributeSet attributeSet, int i2, int i3) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        w0 w0VarT = w0.t(context, attributeSet, a.j.b2, i2, i3);
        int i4 = a.j.d2;
        if (w0VarT.q(i4)) {
            b(w0VarT.a(i4, false));
        }
        setBackgroundDrawable(w0VarT.f(a.j.c2));
        w0VarT.u();
    }

    private void b(boolean z2) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (f1089b) {
            this.f1090a = z2;
        } else {
            androidx.core.widget.h.a(this, z2);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
        if (f1089b && this.f1090a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (f1089b && this.f1090a) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i2, int i3, int i4, int i5) {
        if (f1089b && this.f1090a) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }
}
