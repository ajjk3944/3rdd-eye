package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ee extends v21 {
    public static final String[] F = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final ae G = new ae(0, PointF.class, "topLeft");
    public static final ae H = new ae(1, PointF.class, "bottomRight");
    public static final ae I = new ae(2, PointF.class, "bottomRight");
    public static final ae J = new ae(3, PointF.class, "topLeft");
    public static final ae K = new ae(4, PointF.class, "position");

    public static void I(d31 d31Var) {
        View view = d31Var.b;
        HashMap map = d31Var.a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // defpackage.v21
    public final void d(d31 d31Var) {
        I(d31Var);
    }

    @Override // defpackage.v21
    public final void g(d31 d31Var) {
        I(d31Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v21
    public final Animator k(ViewGroup viewGroup, d31 d31Var, d31 d31Var2) {
        int i;
        ee eeVar;
        ObjectAnimator objectAnimatorA;
        if (d31Var != null) {
            HashMap map = d31Var.a;
            if (d31Var2 != null) {
                HashMap map2 = d31Var2.a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = d31Var2.b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i2 = rect.left;
                    int i3 = rect2.left;
                    int i4 = rect.top;
                    int i5 = rect2.top;
                    int i6 = rect.right;
                    int i7 = rect2.right;
                    int i8 = rect.bottom;
                    int i9 = rect2.bottom;
                    int i10 = i6 - i2;
                    int i11 = i8 - i4;
                    int i12 = i7 - i3;
                    int i13 = i9 - i5;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
                        i = 0;
                    } else {
                        i = (i2 == i3 && i4 == i5) ? 0 : 1;
                        if (i6 != i7 || i8 != i9) {
                            i++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i++;
                    }
                    int i14 = i;
                    if (i14 > 0) {
                        f71.a(view, i2, i4, i6, i8);
                        if (i14 != 2) {
                            eeVar = this;
                            if (i2 == i3 && i4 == i5) {
                                eeVar.A.getClass();
                                objectAnimatorA = li0.a(view, I, ts0.j(i6, i8, i7, i9));
                            } else {
                                eeVar.A.getClass();
                                objectAnimatorA = li0.a(view, J, ts0.j(i2, i4, i3, i5));
                            }
                        } else if (i10 == i12 && i11 == i13) {
                            eeVar = this;
                            eeVar.A.getClass();
                            objectAnimatorA = li0.a(view, K, ts0.j(i2, i4, i3, i5));
                        } else {
                            eeVar = this;
                            de deVar = new de(view);
                            eeVar.A.getClass();
                            ObjectAnimator objectAnimatorA2 = li0.a(deVar, G, ts0.j(i2, i4, i3, i5));
                            eeVar.A.getClass();
                            ObjectAnimator objectAnimatorA3 = li0.a(deVar, H, ts0.j(i6, i8, i7, i9));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                            animatorSet.addListener(new be(deVar));
                            objectAnimatorA = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            yc0.l(viewGroup4, true);
                            eeVar.o().a(new ce(viewGroup4));
                        }
                        return objectAnimatorA;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.v21
    public final String[] q() {
        return F;
    }
}
