package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.phuongpn.whousemywifi.networkscanner.R;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e7 extends i70 implements g7 {
    public CharSequence H;
    public b7 I;
    public final Rect J;
    public int K;
    public final /* synthetic */ h7 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(h7 h7Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.L = h7Var;
        this.J = new Rect();
        this.t = h7Var;
        this.D = true;
        this.E.setFocusable(true);
        this.u = new c7(0, this);
    }

    @Override // defpackage.g7
    public final void e(CharSequence charSequence) {
        this.H = charSequence;
    }

    @Override // defpackage.g7
    public final void j(int i) {
        this.K = i;
    }

    @Override // defpackage.g7
    public final void m(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        r6 r6Var = this.E;
        boolean zIsShowing = r6Var.isShowing();
        s();
        r6Var.setInputMethodMode(2);
        c();
        kq kqVar = this.h;
        kqVar.setChoiceMode(1);
        kqVar.setTextDirection(i);
        kqVar.setTextAlignment(i2);
        h7 h7Var = this.L;
        int selectedItemPosition = h7Var.getSelectedItemPosition();
        kq kqVar2 = this.h;
        if (r6Var.isShowing() && kqVar2 != null) {
            kqVar2.setListSelectionHidden(false);
            kqVar2.setSelection(selectedItemPosition);
            if (kqVar2.getChoiceMode() != 0) {
                kqVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = h7Var.getViewTreeObserver()) == null) {
            return;
        }
        y6 y6Var = new y6(1, this);
        viewTreeObserver.addOnGlobalLayoutListener(y6Var);
        r6Var.setOnDismissListener(new d7(this, y6Var));
    }

    @Override // defpackage.g7
    public final CharSequence o() {
        return this.H;
    }

    @Override // defpackage.i70, defpackage.g7
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.I = (b7) listAdapter;
    }

    public final void s() {
        int i;
        h7 h7Var = this.L;
        Rect rect = h7Var.m;
        r6 r6Var = this.E;
        Drawable background = r6Var.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z = g71.a;
            i = h7Var.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = h7Var.getPaddingLeft();
        int paddingRight = h7Var.getPaddingRight();
        int width = h7Var.getWidth();
        int i2 = h7Var.l;
        if (i2 == -2) {
            int iA = h7Var.a(this.I, r6Var.getBackground());
            int i3 = (h7Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i3) {
                iA = i3;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        boolean z2 = g71.a;
        this.k = h7Var.getLayoutDirection() == 1 ? (((width - paddingRight) - this.j) - this.K) + i : paddingLeft + this.K + i;
    }
}
