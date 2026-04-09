package n1;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f29515a = new int[2];

    /* renamed from: b, reason: collision with root package name */
    public static final Rect f29516b = new Rect();

    public static final o1.c a(View view, View view2) {
        int[] iArr = f29515a;
        view.getLocationInWindow(iArr);
        int i4 = iArr[0];
        int i10 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i11 = iArr[0];
        float f10 = i10 - iArr[1];
        view.getFocusedRect(f29516b);
        float f11 = (i4 - i11) + r1.left;
        return new o1.c(f11, r1.top + f10, r1.width() + f11, f10 + r1.top + r1.height());
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
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof j2.r) {
            return ((j2.r) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return viewFindNextFocusFromRect != null ? viewFindNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return viewFindNextFocus != null ? viewFindNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i4) {
        if (i4 == 5) {
            return 33;
        }
        if (i4 == 6) {
            return 130;
        }
        if (i4 == 3) {
            return 17;
        }
        if (i4 == 4) {
            return 66;
        }
        if (i4 == 1) {
            return 2;
        }
        return i4 == 2 ? 1 : null;
    }

    public static final c d(int i4) {
        if (i4 == 1) {
            return new c(2);
        }
        if (i4 == 2) {
            return new c(1);
        }
        if (i4 == 17) {
            return new c(3);
        }
        if (i4 == 33) {
            return new c(5);
        }
        if (i4 == 66) {
            return new c(4);
        }
        if (i4 != 130) {
            return null;
        }
        return new c(6);
    }
}
