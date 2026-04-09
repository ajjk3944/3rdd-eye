package y1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: f, reason: collision with root package name */
    public static final com.squareup.picasso.c f25695f = new com.squareup.picasso.c(12);

    /* renamed from: a, reason: collision with root package name */
    public final Rect f25696a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f25697b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Rect f25698c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public final g1 f25699d = new g1(new f1());

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f25700e = new ArrayList();

    public static void d(ViewGroup viewGroup, Rect rect) {
        int height = viewGroup.getHeight() + viewGroup.getScrollY();
        int width = viewGroup.getWidth() + viewGroup.getScrollX();
        rect.set(width, height, width, height);
    }

    public final View a(int i10, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        int iIndexOf;
        int iLastIndexOf;
        int i11;
        Rect rect2 = this.f25696a;
        if (view != null) {
            view.getFocusedRect(rect2);
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        } else if (rect != null) {
            rect2.set(rect);
        } else if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 17 || i10 == 33) {
                    d(viewGroup, rect2);
                } else if (i10 == 66 || i10 == 130) {
                    int scrollY = viewGroup.getScrollY();
                    int scrollX = viewGroup.getScrollX();
                    rect2.set(scrollX, scrollY, scrollX, scrollY);
                }
            } else if (viewGroup.getLayoutDirection() == 1) {
                d(viewGroup, rect2);
            } else {
                int scrollY2 = viewGroup.getScrollY();
                int scrollX2 = viewGroup.getScrollX();
                rect2.set(scrollX2, scrollY2, scrollX2, scrollY2);
            }
        } else if (viewGroup.getLayoutDirection() == 1) {
            int scrollY3 = viewGroup.getScrollY();
            int scrollX3 = viewGroup.getScrollX();
            rect2.set(scrollX3, scrollY3, scrollX3, scrollY3);
        } else {
            d(viewGroup, rect2);
        }
        if (i10 != 1 && i10 != 2) {
            if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
                return c(i10, rect2, view, viewGroup, arrayList);
            }
            throw new IllegalArgumentException(h0.b.h(i10, "Unknown direction: "));
        }
        g1 g1Var = this.f25699d;
        try {
            g1Var.a(arrayList, viewGroup);
            Collections.sort(arrayList, g1Var);
            g1Var.f25687g.a();
            g1Var.f25686d.b();
            g1Var.f25688r.a();
            g1Var.f25685a.a();
            int size = arrayList.size();
            View viewC = null;
            if (size < 2) {
                return null;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 17 || i10 == 33 || i10 == 66 || i10 == 130) {
                        viewC = c(i10, this.f25696a, view, viewGroup, arrayList);
                    }
                } else if (size >= 2) {
                    viewC = (view == null || (iLastIndexOf = arrayList.lastIndexOf(view)) < 0 || (i11 = iLastIndexOf + 1) >= size) ? (View) arrayList.get(0) : (View) arrayList.get(i11);
                }
            } else if (size >= 2) {
                viewC = (view == null || (iIndexOf = arrayList.indexOf(view)) <= 0) ? (View) arrayList.get(size - 1) : (View) arrayList.get(iIndexOf - 1);
            }
            return viewC == null ? (View) arrayList.get(size - 1) : viewC;
        } catch (Throwable th2) {
            g1Var.f25687g.a();
            g1Var.f25686d.b();
            g1Var.f25688r.a();
            g1Var.f25685a.a();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b(int i10, View view, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        View viewA = null;
        if (view == null || view == viewGroup) {
            viewGroup2 = viewGroup;
        } else {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup3 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent != viewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) parent;
                    if (viewGroup4.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                        viewGroup3 = viewGroup4;
                    }
                    parent = viewGroup4.getParent();
                } else {
                    if (viewGroup3 == null) {
                        break;
                    }
                    viewGroup2 = viewGroup3;
                }
            }
            viewGroup2 = viewGroup;
        }
        View viewB = e0.b(view, viewGroup2, i10);
        int i11 = true;
        View viewB2 = viewB;
        while (viewB != null) {
            if (viewB.isFocusable() && viewB.getVisibility() == 0 && (!viewB.isInTouchMode() || viewB.isFocusableInTouchMode())) {
                viewA = viewB;
                break;
            }
            viewB = e0.b(viewB, viewGroup2, i10);
            int i12 = i11 ^ true;
            if (i11 == false) {
                viewB2 = viewB2 != null ? e0.b(viewB2, viewGroup2, i10) : null;
                if (viewB2 == viewB) {
                    break;
                }
            }
            i11 = i12;
        }
        if (viewA != null) {
            return viewA;
        }
        ArrayList<View> arrayList = this.f25700e;
        try {
            arrayList.clear();
            if (Build.VERSION.SDK_INT < 26) {
                e0.e(viewGroup2, arrayList, viewGroup2.isInTouchMode());
            } else {
                viewGroup2.addFocusables(arrayList, i10, viewGroup2.isInTouchMode() ? 1 : 0);
            }
            if (!arrayList.isEmpty()) {
                viewA = a(i10, null, view, viewGroup2, arrayList);
            }
            arrayList.clear();
            return viewA;
        } catch (Throwable th2) {
            arrayList.clear();
            throw th2;
        }
    }

    public final View c(int i10, Rect rect, View view, ViewGroup viewGroup, ArrayList arrayList) {
        Rect rect2 = this.f25697b;
        rect2.set(rect);
        if (i10 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i10 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i10 == 66) {
            rect2.offset((-rect.width()) - 1, 0);
        } else if (i10 == 130) {
            rect2.offset(0, (-rect.height()) - 1);
        }
        int size = arrayList.size();
        View view2 = null;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = (View) arrayList.get(i11);
            if (!br.l.a(view3, view) && !br.l.a(view3, viewGroup)) {
                Rect rect3 = this.f25698c;
                view3.getFocusedRect(rect3);
                viewGroup.offsetDescendantRectToMyCoords(view3, rect3);
                f1.c cVarS = g1.f0.s(rect3);
                f1.c cVarS2 = g1.f0.s(rect2);
                f1.c cVarS3 = g1.f0.s(rect);
                e1.b bVarA = e1.d.A(i10);
                if (e1.d.o(cVarS, cVarS2, cVarS3, bVarA != null ? bVarA.f7639a : 1)) {
                    rect2.set(rect3);
                    view2 = view3;
                }
            }
        }
        return view2;
    }
}
