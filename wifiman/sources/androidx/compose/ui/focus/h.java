package androidx.compose.ui.focus;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.d;
import l0.C6533i;

/* loaded from: classes.dex */
public abstract class h {
    public static final C6533i a(View view) {
        int[] iArrA = g.f28834a.a();
        view.getLocationInWindow(iArrA);
        int i10 = iArrA[0];
        return new C6533i(i10, iArrA[1], i10 + view.getWidth(), iArrA[1] + view.getHeight());
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof androidx.compose.ui.platform.r)) {
            if (rect != null) {
                View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
            return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue(), rect);
    }

    public static final Integer c(int i10) {
        d.a aVar = d.f28823b;
        if (d.l(i10, aVar.h())) {
            return 33;
        }
        if (d.l(i10, aVar.a())) {
            return 130;
        }
        if (d.l(i10, aVar.d())) {
            return 17;
        }
        if (d.l(i10, aVar.g())) {
            return 66;
        }
        if (d.l(i10, aVar.e())) {
            return 2;
        }
        return d.l(i10, aVar.f()) ? 1 : null;
    }

    public static final d d(int i10) {
        if (i10 == 1) {
            return d.i(d.f28823b.f());
        }
        if (i10 == 2) {
            return d.i(d.f28823b.e());
        }
        if (i10 == 17) {
            return d.i(d.f28823b.d());
        }
        if (i10 == 33) {
            return d.i(d.f28823b.h());
        }
        if (i10 == 66) {
            return d.i(d.f28823b.g());
        }
        if (i10 != 130) {
            return null;
        }
        return d.i(d.f28823b.a());
    }

    public static final Y0.t e(int i10) {
        if (i10 == 0) {
            return Y0.t.Ltr;
        }
        if (i10 != 1) {
            return null;
        }
        return Y0.t.Rtl;
    }
}
