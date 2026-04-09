package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatSpinner;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k0 extends b2 implements m0 {
    public CharSequence D;
    public i0 E;
    public final Rect F;
    public int G;
    public final /* synthetic */ AppCompatSpinner H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.H = appCompatSpinner;
        this.F = new Rect();
        this.f30643o = appCompatSpinner;
        this.f30653y = true;
        this.f30654z.setFocusable(true);
        this.f30644p = new kd.t(1, this);
    }

    @Override // p.m0
    public final CharSequence d() {
        return this.D;
    }

    @Override // p.m0
    public final void i(CharSequence charSequence) {
        this.D = charSequence;
    }

    @Override // p.m0
    public final void l(int i4) {
        this.G = i4;
    }

    @Override // p.m0
    public final void m(int i4, int i10) {
        ViewTreeObserver viewTreeObserver;
        y yVar = this.f30654z;
        boolean zIsShowing = yVar.isShowing();
        r();
        yVar.setInputMethodMode(2);
        show();
        p1 p1Var = this.f30633c;
        p1Var.setChoiceMode(1);
        p1Var.setTextDirection(i4);
        p1Var.setTextAlignment(i10);
        AppCompatSpinner appCompatSpinner = this.H;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        p1 p1Var2 = this.f30633c;
        if (yVar.isShowing() && p1Var2 != null) {
            p1Var2.setListSelectionHidden(false);
            p1Var2.setSelection(selectedItemPosition);
            if (p1Var2.getChoiceMode() != 0) {
                p1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        o.d dVar = new o.d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        yVar.setOnDismissListener(new j0(this, dVar));
    }

    @Override // p.b2, p.m0
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.E = (i0) listAdapter;
    }

    public final void r() {
        int i4;
        AppCompatSpinner appCompatSpinner = this.H;
        Rect rect = appCompatSpinner.f774h;
        y yVar = this.f30654z;
        Drawable background = yVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z3 = v3.f30896a;
            i4 = appCompatSpinner.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i4 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i10 = appCompatSpinner.g;
        if (i10 == -2) {
            int iA = appCompatSpinner.a(this.E, yVar.getBackground());
            int i11 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i11) {
                iA = i11;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i10 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i10);
        }
        boolean z10 = v3.f30896a;
        this.f30636f = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f30635e) - this.G) + i4 : paddingLeft + this.G + i4;
    }
}
