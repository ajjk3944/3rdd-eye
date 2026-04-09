package L0;

import G3.C0152f;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: L0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160e extends l {

    /* renamed from: P, reason: collision with root package name */
    public static final String[] f2432P = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: Q, reason: collision with root package name */
    public static final B3.h f2433Q = new B3.h(7, PointF.class, "topLeft");

    /* renamed from: R, reason: collision with root package name */
    public static final B3.h f2434R = new B3.h(8, PointF.class, "bottomRight");

    /* renamed from: S, reason: collision with root package name */
    public static final B3.h f2435S = new B3.h(9, PointF.class, "bottomRight");

    /* renamed from: T, reason: collision with root package name */
    public static final B3.h f2436T = new B3.h(10, PointF.class, "topLeft");

    /* renamed from: U, reason: collision with root package name */
    public static final B3.h f2437U = new B3.h(11, PointF.class, "position");

    public static void J(t tVar) {
        View view = tVar.f2489b;
        HashMap map = tVar.f2488a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", tVar.f2489b.getParent());
    }

    @Override // L0.l
    public final void d(t tVar) {
        J(tVar);
    }

    @Override // L0.l
    public final void g(t tVar) {
        J(tVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // L0.l
    public final Animator k(ViewGroup viewGroup, t tVar, t tVar2) {
        int i;
        C0160e c0160e;
        ObjectAnimator objectAnimatorA;
        if (tVar != null) {
            HashMap map = tVar.f2488a;
            if (tVar2 != null) {
                HashMap map2 = tVar2.f2488a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = tVar2.f2489b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i3 = rect.left;
                    int i6 = rect2.left;
                    int i7 = rect.top;
                    int i8 = rect2.top;
                    int i9 = rect.right;
                    int i10 = rect2.right;
                    int i11 = rect.bottom;
                    int i12 = rect2.bottom;
                    int i13 = i9 - i3;
                    int i14 = i11 - i7;
                    int i15 = i10 - i6;
                    int i16 = i12 - i8;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i13 == 0 || i14 == 0) && (i15 == 0 || i16 == 0)) {
                        i = 0;
                    } else {
                        i = (i3 == i6 && i7 == i8) ? 0 : 1;
                        if (i9 != i10 || i11 != i12) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i17 = i;
                    if (i17 > 0) {
                        v.a(view, i3, i7, i9, i11);
                        if (i17 != 2) {
                            c0160e = this;
                            if (i3 == i6 && i7 == i8) {
                                c0160e.f2464K.getClass();
                                objectAnimatorA = h.a(view, f2435S, C0152f.o(i9, i11, i10, i12));
                            } else {
                                c0160e.f2464K.getClass();
                                objectAnimatorA = h.a(view, f2436T, C0152f.o(i3, i7, i6, i8));
                            }
                        } else if (i13 == i15 && i14 == i16) {
                            c0160e = this;
                            c0160e.f2464K.getClass();
                            objectAnimatorA = h.a(view, f2437U, C0152f.o(i3, i7, i6, i8));
                        } else {
                            c0160e = this;
                            C0159d c0159d = new C0159d(view);
                            c0160e.f2464K.getClass();
                            ObjectAnimator objectAnimatorA2 = h.a(c0159d, f2433Q, C0152f.o(i3, i7, i6, i8));
                            c0160e.f2464K.getClass();
                            ObjectAnimator objectAnimatorA3 = h.a(c0159d, f2434R, C0152f.o(i9, i11, i10, i12));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                            animatorSet.addListener(new C0157b(c0159d));
                            objectAnimatorA = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            a4.p.t(viewGroup4, true);
                            c0160e.p().a(new C0158c(viewGroup4));
                        }
                        return objectAnimatorA;
                    }
                }
            }
        }
        return null;
    }

    @Override // L0.l
    public final String[] r() {
        return f2432P;
    }
}
