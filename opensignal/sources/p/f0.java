package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
public final class f0 extends t1 implements g0 {
    public CharSequence Y;
    public d0 Z;

    /* renamed from: a0, reason: collision with root package name */
    public final Rect f20055a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f20056b0;

    /* renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.c f20057c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.appcompat.widget.c cVar, Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
        this.f20057c0 = cVar;
        this.f20055a0 = new Rect();
        this.K = cVar;
        this.U = true;
        this.V.setFocusable(true);
        this.L = new je.r(1, this);
    }

    @Override // p.g0
    public final CharSequence e() {
        return this.Y;
    }

    @Override // p.g0
    public final void h(CharSequence charSequence) {
        this.Y = charSequence;
    }

    @Override // p.g0
    public final void m(int i10) {
        this.f20056b0 = i10;
    }

    @Override // p.g0
    public final void n(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        v vVar = this.V;
        boolean zIsShowing = vVar.isShowing();
        s();
        vVar.setInputMethodMode(2);
        g();
        i1 i1Var = this.f20173g;
        i1Var.setChoiceMode(1);
        i1Var.setTextDirection(i10);
        i1Var.setTextAlignment(i11);
        androidx.appcompat.widget.c cVar = this.f20057c0;
        int selectedItemPosition = cVar.getSelectedItemPosition();
        i1 i1Var2 = this.f20173g;
        if (vVar.isShowing() && i1Var2 != null) {
            i1Var2.setListSelectionHidden(false);
            i1Var2.setSelection(selectedItemPosition);
            if (i1Var2.getChoiceMode() != 0) {
                i1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = cVar.getViewTreeObserver()) == null) {
            return;
        }
        o.d dVar = new o.d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        vVar.setOnDismissListener(new e0(this, dVar));
    }

    @Override // p.t1, p.g0
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.Z = (d0) listAdapter;
    }

    public final void s() {
        int i10;
        androidx.appcompat.widget.c cVar = this.f20057c0;
        Rect rect = cVar.D;
        v vVar = this.V;
        Drawable background = vVar.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z10 = z2.f20220a;
            i10 = cVar.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i10 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = cVar.getPaddingLeft();
        int paddingRight = cVar.getPaddingRight();
        int width = cVar.getWidth();
        int i11 = cVar.B;
        if (i11 == -2) {
            int iA = cVar.a(this.Z, vVar.getBackground());
            int i12 = (cVar.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i12) {
                iA = i12;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i11);
        }
        boolean z11 = z2.f20220a;
        this.f20176y = cVar.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f20175x) - this.f20056b0) + i10 : paddingLeft + this.f20056b0 + i10;
    }
}
