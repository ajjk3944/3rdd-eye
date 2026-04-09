package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.Map;
import y1.p;
import y1.q;
import y1.s;
import y1.t;

/* loaded from: classes.dex */
public class a extends Transition {
    public static final String[] N = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property O = new C0047a(PointF.class, "topLeft");
    public static final Property P = new b(PointF.class, "bottomRight");
    public static final Property Q = new c(PointF.class, "bottomRight");
    public static final Property R = new d(PointF.class, "topLeft");
    public static final Property S = new e(PointF.class, "position");
    public static final y1.f T = new y1.f();
    public boolean M = false;

    /* renamed from: androidx.transition.a$a, reason: collision with other inner class name */
    public class C0047a extends Property {
        public C0047a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    public class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            t.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            t.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public class e extends Property {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            t.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f4193a;
        private final i mViewBounds;

        public f(i iVar) {
            this.f4193a = iVar;
            this.mViewBounds = iVar;
        }
    }

    public static class g extends AnimatorListenerAdapter implements Transition.f {

        /* renamed from: a, reason: collision with root package name */
        public final View f4195a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f4196b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f4197c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect f4198d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f4199e;

        /* renamed from: f, reason: collision with root package name */
        public final int f4200f;

        /* renamed from: g, reason: collision with root package name */
        public final int f4201g;

        /* renamed from: h, reason: collision with root package name */
        public final int f4202h;

        /* renamed from: i, reason: collision with root package name */
        public final int f4203i;

        /* renamed from: j, reason: collision with root package name */
        public final int f4204j;

        /* renamed from: k, reason: collision with root package name */
        public final int f4205k;

        /* renamed from: l, reason: collision with root package name */
        public final int f4206l;

        /* renamed from: m, reason: collision with root package name */
        public final int f4207m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f4208n;

        public g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f4195a = view;
            this.f4196b = rect;
            this.f4197c = z10;
            this.f4198d = rect2;
            this.f4199e = z11;
            this.f4200f = i10;
            this.f4201g = i11;
            this.f4202h = i12;
            this.f4203i = i13;
            this.f4204j = i14;
            this.f4205k = i15;
            this.f4206l = i16;
            this.f4207m = i17;
        }

        @Override // androidx.transition.Transition.f
        public void a(Transition transition) {
            View view = this.f4195a;
            int i10 = y1.e.transition_clip;
            Rect rect = (Rect) view.getTag(i10);
            this.f4195a.setTag(i10, null);
            this.f4195a.setClipBounds(rect);
        }

        @Override // androidx.transition.Transition.f
        public void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void c(Transition transition) {
            this.f4195a.setTag(y1.e.transition_clip, this.f4195a.getClipBounds());
            this.f4195a.setClipBounds(this.f4199e ? null : this.f4198d);
        }

        @Override // androidx.transition.Transition.f
        public /* synthetic */ void d(Transition transition, boolean z10) {
            y1.h.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void f(Transition transition) {
            this.f4208n = true;
        }

        @Override // androidx.transition.Transition.f
        public /* synthetic */ void g(Transition transition, boolean z10) {
            y1.h.b(this, transition, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f4208n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f4197c) {
                    rect = this.f4196b;
                }
            } else if (!this.f4199e) {
                rect = this.f4198d;
            }
            this.f4195a.setClipBounds(rect);
            if (z10) {
                t.d(this.f4195a, this.f4200f, this.f4201g, this.f4202h, this.f4203i);
            } else {
                t.d(this.f4195a, this.f4204j, this.f4205k, this.f4206l, this.f4207m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f4202h - this.f4200f, this.f4206l - this.f4204j);
            int iMax2 = Math.max(this.f4203i - this.f4201g, this.f4207m - this.f4205k);
            int i10 = z10 ? this.f4204j : this.f4200f;
            int i11 = z10 ? this.f4205k : this.f4201g;
            t.d(this.f4195a, i10, i11, iMax + i10, iMax2 + i11);
            this.f4195a.setClipBounds(z10 ? this.f4198d : this.f4196b);
        }
    }

    public static class h extends androidx.transition.d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4209a = false;

        /* renamed from: b, reason: collision with root package name */
        public final ViewGroup f4210b;

        public h(ViewGroup viewGroup) {
            this.f4210b = viewGroup;
        }

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public void a(Transition transition) {
            s.b(this.f4210b, true);
        }

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public void c(Transition transition) {
            s.b(this.f4210b, false);
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
            if (!this.f4209a) {
                s.b(this.f4210b, false);
            }
            transition.R(this);
        }

        @Override // androidx.transition.d, androidx.transition.Transition.f
        public void f(Transition transition) {
            s.b(this.f4210b, false);
            this.f4209a = true;
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f4211a;

        /* renamed from: b, reason: collision with root package name */
        public int f4212b;

        /* renamed from: c, reason: collision with root package name */
        public int f4213c;

        /* renamed from: d, reason: collision with root package name */
        public int f4214d;

        /* renamed from: e, reason: collision with root package name */
        public final View f4215e;

        /* renamed from: f, reason: collision with root package name */
        public int f4216f;

        /* renamed from: g, reason: collision with root package name */
        public int f4217g;

        public i(View view) {
            this.f4215e = view;
        }

        public void a(PointF pointF) {
            this.f4213c = Math.round(pointF.x);
            this.f4214d = Math.round(pointF.y);
            int i10 = this.f4217g + 1;
            this.f4217g = i10;
            if (this.f4216f == i10) {
                b();
            }
        }

        public final void b() {
            t.d(this.f4215e, this.f4211a, this.f4212b, this.f4213c, this.f4214d);
            this.f4216f = 0;
            this.f4217g = 0;
        }

        public void c(PointF pointF) {
            this.f4211a = Math.round(pointF.x);
            this.f4212b = Math.round(pointF.y);
            int i10 = this.f4216f + 1;
            this.f4216f = i10;
            if (i10 == this.f4217g) {
                b();
            }
        }
    }

    @Override // androidx.transition.Transition
    public String[] D() {
        return N;
    }

    public final void e0(q qVar) {
        View view = qVar.f25090b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        qVar.f25089a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        qVar.f25089a.put("android:changeBounds:parent", qVar.f25090b.getParent());
        if (this.M) {
            qVar.f25089a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.Transition
    public void f(q qVar) {
        e0(qVar);
    }

    @Override // androidx.transition.Transition
    public void i(q qVar) {
        Rect rect;
        e0(qVar);
        if (!this.M || (rect = (Rect) qVar.f25090b.getTag(y1.e.transition_clip)) == null) {
            return;
        }
        qVar.f25089a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    public Animator m(ViewGroup viewGroup, q qVar, q qVar2) {
        int i10;
        int i11;
        int i12;
        int i13;
        ObjectAnimator objectAnimatorA;
        int i14;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (qVar == null || qVar2 == null) {
            return null;
        }
        Map map = qVar.f25089a;
        Map map2 = qVar2.f25089a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = qVar2.f25090b;
        Rect rect2 = (Rect) qVar.f25089a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) qVar2.f25089a.get("android:changeBounds:bounds");
        int i15 = rect2.left;
        int i16 = rect3.left;
        int i17 = rect2.top;
        int i18 = rect3.top;
        int i19 = rect2.right;
        int i20 = rect3.right;
        int i21 = rect2.bottom;
        int i22 = rect3.bottom;
        int i23 = i19 - i15;
        int i24 = i21 - i17;
        int i25 = i20 - i16;
        int i26 = i22 - i18;
        Rect rect4 = (Rect) qVar.f25089a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) qVar2.f25089a.get("android:changeBounds:clip");
        if ((i23 == 0 || i24 == 0) && (i25 == 0 || i26 == 0)) {
            i10 = 0;
        } else {
            i10 = (i15 == i16 && i17 == i18) ? 0 : 1;
            if (i19 != i20 || i21 != i22) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i27 = i10;
        if (i27 <= 0) {
            return null;
        }
        if (this.M) {
            t.d(view, i15, i17, i15 + Math.max(i23, i25), i17 + Math.max(i24, i26));
            if (i15 == i16 && i17 == i18) {
                objectAnimatorA = null;
                i11 = i22;
                i13 = i16;
                i12 = i20;
            } else {
                i11 = i22;
                i12 = i20;
                i13 = i16;
                objectAnimatorA = y1.c.a(view, S, u().a(i15, i17, i16, i18));
            }
            boolean z10 = rect4 == null;
            if (z10) {
                i14 = 0;
                rect = new Rect(0, 0, i23, i24);
            } else {
                i14 = 0;
                rect = rect4;
            }
            int i28 = rect5 == null ? 1 : i14;
            Rect rect6 = i28 != 0 ? new Rect(i14, i14, i25, i26) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                y1.f fVar = T;
                Object[] objArr = new Object[2];
                objArr[i14] = rect;
                objArr[1] = rect6;
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", fVar, objArr);
                g gVar = new g(view, rect, z10, rect6, i28, i15, i17, i19, i21, i13, i18, i12, i11);
                objectAnimatorOfObject.addListener(gVar);
                a(gVar);
            }
            animatorC = p.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            t.d(view, i15, i17, i19, i21);
            if (i27 != 2) {
                animatorC = (i15 == i16 && i17 == i18) ? y1.c.a(view, Q, u().a(i19, i21, i20, i22)) : y1.c.a(view, R, u().a(i15, i17, i16, i18));
            } else if (i23 == i25 && i24 == i26) {
                animatorC = y1.c.a(view, S, u().a(i15, i17, i16, i18));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = y1.c.a(iVar, O, u().a(i15, i17, i16, i18));
                ObjectAnimator objectAnimatorA3 = y1.c.a(iVar, P, u().a(i19, i21, i20, i22));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            s.b(viewGroup4, true);
            w().a(new h(viewGroup4));
        }
        return animatorC;
    }
}
