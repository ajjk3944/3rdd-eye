package t7;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import p.f2;

/* loaded from: classes.dex */
public final class e extends q {
    public static final String[] Z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: a0, reason: collision with root package name */
    public static final f2 f22468a0 = new f2(PointF.class, "topLeft", 1);

    /* renamed from: b0, reason: collision with root package name */
    public static final f2 f22469b0 = new f2(PointF.class, "bottomRight", 2);

    /* renamed from: c0, reason: collision with root package name */
    public static final f2 f22470c0 = new f2(PointF.class, "bottomRight", 3);

    /* renamed from: d0, reason: collision with root package name */
    public static final f2 f22471d0 = new f2(PointF.class, "topLeft", 4);

    /* renamed from: e0, reason: collision with root package name */
    public static final f2 f22472e0 = new f2(PointF.class, "position", 5);

    public static void M(y yVar) {
        View view = yVar.f22529b;
        HashMap map = yVar.f22528a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // t7.q
    public final void d(y yVar) {
        M(yVar);
    }

    @Override // t7.q
    public final void g(y yVar) {
        M(yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t7.q
    public final Animator k(ViewGroup viewGroup, y yVar, y yVar2) {
        int i10;
        e eVar;
        ObjectAnimator objectAnimatorA;
        if (yVar != null) {
            HashMap map = yVar.f22528a;
            if (yVar2 != null) {
                HashMap map2 = yVar2.f22528a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = yVar2.f22529b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i11 = rect.left;
                    int i12 = rect2.left;
                    int i13 = rect.top;
                    int i14 = rect2.top;
                    int i15 = rect.right;
                    int i16 = rect2.right;
                    int i17 = rect.bottom;
                    int i18 = rect2.bottom;
                    int i19 = i15 - i11;
                    int i20 = i17 - i13;
                    int i21 = i16 - i12;
                    int i22 = i18 - i14;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
                        i10 = 0;
                    } else {
                        i10 = (i11 == i12 && i13 == i14) ? 0 : 1;
                        if (i15 != i16 || i17 != i18) {
                            i10++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i10++;
                    }
                    int i23 = i10;
                    if (i23 > 0) {
                        a0.a(view, i11, i13, i15, i17);
                        if (i23 != 2) {
                            eVar = this;
                            if (i11 == i12 && i13 == i14) {
                                eVar.S.getClass();
                                objectAnimatorA = h.a(view, f22470c0, df.c.v(i15, i17, i16, i18));
                            } else {
                                eVar.S.getClass();
                                objectAnimatorA = h.a(view, f22471d0, df.c.v(i11, i13, i12, i14));
                            }
                        } else if (i19 == i21 && i20 == i22) {
                            eVar = this;
                            eVar.S.getClass();
                            objectAnimatorA = h.a(view, f22472e0, df.c.v(i11, i13, i12, i14));
                        } else {
                            eVar = this;
                            d dVar = new d(view);
                            eVar.S.getClass();
                            ObjectAnimator objectAnimatorA2 = h.a(dVar, f22468a0, df.c.v(i11, i13, i12, i14));
                            eVar.S.getClass();
                            ObjectAnimator objectAnimatorA3 = h.a(dVar, f22469b0, df.c.v(i15, i17, i16, i18));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                            animatorSet.addListener(new b(dVar));
                            objectAnimatorA = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            xu.l.Y(viewGroup4, true);
                            eVar.p().a(new c(viewGroup4));
                        }
                        return objectAnimatorA;
                    }
                }
            }
        }
        return null;
    }

    @Override // t7.q
    public final String[] r() {
        return Z;
    }
}
