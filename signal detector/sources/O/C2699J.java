package o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.apm.insight.R;

/* renamed from: o.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2699J extends A0 implements L {

    /* renamed from: R, reason: collision with root package name */
    public CharSequence f22393R;

    /* renamed from: S, reason: collision with root package name */
    public C2697H f22394S;

    /* renamed from: T, reason: collision with root package name */
    public final Rect f22395T;

    /* renamed from: U, reason: collision with root package name */
    public int f22396U;

    /* renamed from: V, reason: collision with root package name */
    public final /* synthetic */ M f22397V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2699J(M m6, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f22397V = m6;
        this.f22395T = new Rect();
        this.f22337C = m6;
        this.M = true;
        this.f22347N.setFocusable(true);
        this.f22338D = new M3.u(1, this);
    }

    @Override // o.L
    public final CharSequence e() {
        return this.f22393R;
    }

    @Override // o.L
    public final void h(CharSequence charSequence) {
        this.f22393R = charSequence;
    }

    @Override // o.L
    public final void l(int i) {
        this.f22396U = i;
    }

    @Override // o.L
    public final void m(int i, int i3) {
        ViewTreeObserver viewTreeObserver;
        C2746x c2746x = this.f22347N;
        boolean zIsShowing = c2746x.isShowing();
        s();
        this.f22347N.setInputMethodMode(2);
        g();
        C2732p0 c2732p0 = this.f22350c;
        c2732p0.setChoiceMode(1);
        c2732p0.setTextDirection(i);
        c2732p0.setTextAlignment(i3);
        M m6 = this.f22397V;
        int selectedItemPosition = m6.getSelectedItemPosition();
        C2732p0 c2732p02 = this.f22350c;
        if (c2746x.isShowing() && c2732p02 != null) {
            c2732p02.setListSelectionHidden(false);
            c2732p02.setSelection(selectedItemPosition);
            if (c2732p02.getChoiceMode() != 0) {
                c2732p02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = m6.getViewTreeObserver()) == null) {
            return;
        }
        A3.C c6 = new A3.C(4, this);
        viewTreeObserver.addOnGlobalLayoutListener(c6);
        this.f22347N.setOnDismissListener(new C2698I(this, c6));
    }

    @Override // o.A0, o.L
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f22394S = (C2697H) listAdapter;
    }

    public final void s() {
        int i;
        M m6 = this.f22397V;
        Rect rect = m6.f22414h;
        C2746x c2746x = this.f22347N;
        Drawable background = c2746x.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z6 = q1.f22618a;
            i = m6.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = m6.getPaddingLeft();
        int paddingRight = m6.getPaddingRight();
        int width = m6.getWidth();
        int i3 = m6.f22413g;
        if (i3 == -2) {
            int iA = m6.a(this.f22394S, c2746x.getBackground());
            int i6 = (m6.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i6) {
                iA = i6;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i3);
        }
        boolean z7 = q1.f22618a;
        this.f22353f = m6.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f22352e) - this.f22396U) + i : paddingLeft + this.f22396U + i;
    }
}
