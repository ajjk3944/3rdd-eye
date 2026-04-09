package L0;

import android.view.View;
import android.view.ViewParent;

/* compiled from: ViewParentCompat.java */
/* loaded from: classes.dex */
public final class P {
    public static boolean a(ViewParent viewParent, View view, float f10, float f11, boolean z10) {
        return viewParent.onNestedFling(view, f10, f11, z10);
    }

    public static boolean b(ViewParent viewParent, View view, float f10, float f11) {
        return viewParent.onNestedPreFling(view, f10, f11);
    }

    public static void c(ViewParent viewParent, View view, int i, int i10, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i10, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i, int i10, int i11, int i12) {
        viewParent.onNestedScroll(view, i, i10, i11, i12);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
