package j6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f extends o {
    public static final String[] C = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b D = new b(0, PointF.class, "topLeft");
    public static final b E = new b(1, PointF.class, "bottomRight");
    public static final b F = new b(2, PointF.class, "bottomRight");
    public static final b G = new b(3, PointF.class, "topLeft");
    public static final b H = new b(4, PointF.class, "position");

    public static void L(v vVar) {
        View view = vVar.f27458b;
        HashMap map = vVar.f27457a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // j6.o
    public final void d(v vVar) {
        L(vVar);
    }

    @Override // j6.o
    public final void g(v vVar) {
        L(vVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j6.o
    public final Animator k(ViewGroup viewGroup, v vVar, v vVar2) {
        int i4;
        f fVar;
        ObjectAnimator objectAnimatorOfObject;
        if (vVar != null) {
            HashMap map = vVar.f27457a;
            if (vVar2 != null) {
                HashMap map2 = vVar2.f27457a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = vVar2.f27458b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i10 = rect.left;
                    int i11 = rect2.left;
                    int i12 = rect.top;
                    int i13 = rect2.top;
                    int i14 = rect.right;
                    int i15 = rect2.right;
                    int i16 = rect.bottom;
                    int i17 = rect2.bottom;
                    int i18 = i14 - i10;
                    int i19 = i16 - i12;
                    int i20 = i15 - i11;
                    int i21 = i17 - i13;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i18 == 0 || i19 == 0) && (i20 == 0 || i21 == 0)) {
                        i4 = 0;
                    } else {
                        i4 = (i10 == i11 && i12 == i13) ? 0 : 1;
                        if (i14 != i15 || i16 != i17) {
                            i4++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i4++;
                    }
                    int i22 = i4;
                    if (i22 > 0) {
                        w.a(view, i10, i12, i14, i16);
                        if (i22 != 2) {
                            fVar = this;
                            if (i10 == i11 && i12 == i13) {
                                fVar.f27444v.getClass();
                                objectAnimatorOfObject = ObjectAnimator.ofObject(view, F, (TypeConverter) null, i.n(i14, i16, i15, i17));
                            } else {
                                fVar.f27444v.getClass();
                                objectAnimatorOfObject = ObjectAnimator.ofObject(view, G, (TypeConverter) null, i.n(i10, i12, i11, i13));
                            }
                        } else if (i18 == i20 && i19 == i21) {
                            fVar = this;
                            fVar.f27444v.getClass();
                            objectAnimatorOfObject = ObjectAnimator.ofObject(view, H, (TypeConverter) null, i.n(i10, i12, i11, i13));
                        } else {
                            fVar = this;
                            e eVar = new e(view);
                            fVar.f27444v.getClass();
                            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(eVar, D, (TypeConverter) null, i.n(i10, i12, i11, i13));
                            fVar.f27444v.getClass();
                            ObjectAnimator objectAnimatorOfObject3 = ObjectAnimator.ofObject(eVar, E, (TypeConverter) null, i.n(i14, i16, i15, i17));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorOfObject2, objectAnimatorOfObject3);
                            animatorSet.addListener(new c(eVar));
                            objectAnimatorOfObject = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            u6.t.r(viewGroup4, true);
                            fVar.o().a(new d(viewGroup4));
                        }
                        return objectAnimatorOfObject;
                    }
                }
            }
        }
        return null;
    }

    @Override // j6.o
    public final String[] q() {
        return C;
    }
}
