package L6;

import android.view.ViewGroup;
import r7.C5533d;

/* compiled from: DivGalleryItemLayout.kt */
/* loaded from: classes.dex */
public final class h {
    public static final void a(ViewGroup.LayoutParams layoutParams, ViewGroup.LayoutParams layoutParams2) {
        if (layoutParams2 == null) {
            return;
        }
        layoutParams.width = layoutParams2.width;
        layoutParams.height = layoutParams2.height;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.leftMargin = marginLayoutParams2.leftMargin;
            marginLayoutParams.topMargin = marginLayoutParams2.topMargin;
            marginLayoutParams.rightMargin = marginLayoutParams2.rightMargin;
            marginLayoutParams.bottomMargin = marginLayoutParams2.bottomMargin;
            if (marginLayoutParams2.isMarginRelative()) {
                marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
                marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
            }
        }
        if ((layoutParams instanceof C5533d) && (layoutParams2 instanceof C5533d)) {
            C5533d c5533d = (C5533d) layoutParams;
            C5533d c5533d2 = (C5533d) layoutParams2;
            c5533d.f45765h = c5533d2.f45765h;
            c5533d.f45764g = c5533d2.f45764g;
        }
    }
}
