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
import androidx.transition.AbstractC4036k;
import java.util.Map;

/* renamed from: androidx.transition.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4027b extends AbstractC4036k {

    /* renamed from: Z, reason: collision with root package name */
    private static final String[] f32389Z = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: f1, reason: collision with root package name */
    private static final Property f32390f1 = new a(PointF.class, "topLeft");

    /* renamed from: g1, reason: collision with root package name */
    private static final Property f32391g1 = new C1130b(PointF.class, "bottomRight");

    /* renamed from: h1, reason: collision with root package name */
    private static final Property f32392h1 = new c(PointF.class, "bottomRight");

    /* renamed from: i1, reason: collision with root package name */
    private static final Property f32393i1 = new d(PointF.class, "topLeft");

    /* renamed from: j1, reason: collision with root package name */
    private static final Property f32394j1 = new e(PointF.class, "position");

    /* renamed from: k1, reason: collision with root package name */
    private static final C4034i f32395k1 = new C4034i();

    /* renamed from: Y, reason: collision with root package name */
    private boolean f32396Y = false;

    /* renamed from: androidx.transition.b$a */
    class a extends Property {
        a(Class cls, String str) {
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

    /* renamed from: androidx.transition.b$b, reason: collision with other inner class name */
    class C1130b extends Property {
        C1130b(Class cls, String str) {
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

    /* renamed from: androidx.transition.b$c */
    class c extends Property {
        c(Class cls, String str) {
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
            y.d(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.b$d */
    class d extends Property {
        d(Class cls, String str) {
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
            y.d(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.b$e */
    class e extends Property {
        e(Class cls, String str) {
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
            y.d(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    /* renamed from: androidx.transition.b$f */
    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f32397a;
        private final i mViewBounds;

        f(i iVar) {
            this.f32397a = iVar;
            this.mViewBounds = iVar;
        }
    }

    /* renamed from: androidx.transition.b$g */
    private static class g extends AnimatorListenerAdapter implements AbstractC4036k.f {

        /* renamed from: a, reason: collision with root package name */
        private final View f32399a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f32400b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f32401c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f32402d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f32403e;

        /* renamed from: f, reason: collision with root package name */
        private final int f32404f;

        /* renamed from: g, reason: collision with root package name */
        private final int f32405g;

        /* renamed from: h, reason: collision with root package name */
        private final int f32406h;

        /* renamed from: i, reason: collision with root package name */
        private final int f32407i;

        /* renamed from: j, reason: collision with root package name */
        private final int f32408j;

        /* renamed from: k, reason: collision with root package name */
        private final int f32409k;

        /* renamed from: l, reason: collision with root package name */
        private final int f32410l;

        /* renamed from: m, reason: collision with root package name */
        private final int f32411m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f32412n;

        g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f32399a = view;
            this.f32400b = rect;
            this.f32401c = z10;
            this.f32402d = rect2;
            this.f32403e = z11;
            this.f32404f = i10;
            this.f32405g = i11;
            this.f32406h = i12;
            this.f32407i = i13;
            this.f32408j = i14;
            this.f32409k = i15;
            this.f32410l = i16;
            this.f32411m = i17;
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void a(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void b(AbstractC4036k abstractC4036k) {
            this.f32399a.setTag(AbstractC4033h.f32444b, this.f32399a.getClipBounds());
            this.f32399a.setClipBounds(this.f32403e ? null : this.f32402d);
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void d(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void e(AbstractC4036k abstractC4036k) {
            this.f32412n = true;
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void g(AbstractC4036k abstractC4036k) {
            View view = this.f32399a;
            int i10 = AbstractC4033h.f32444b;
            Rect rect = (Rect) view.getTag(i10);
            this.f32399a.setTag(i10, null);
            this.f32399a.setClipBounds(rect);
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
            if (this.f32412n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f32401c) {
                    rect = this.f32400b;
                }
            } else if (!this.f32403e) {
                rect = this.f32402d;
            }
            this.f32399a.setClipBounds(rect);
            if (z10) {
                y.d(this.f32399a, this.f32404f, this.f32405g, this.f32406h, this.f32407i);
            } else {
                y.d(this.f32399a, this.f32408j, this.f32409k, this.f32410l, this.f32411m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f32406h - this.f32404f, this.f32410l - this.f32408j);
            int iMax2 = Math.max(this.f32407i - this.f32405g, this.f32411m - this.f32409k);
            int i10 = z10 ? this.f32408j : this.f32404f;
            int i11 = z10 ? this.f32409k : this.f32405g;
            y.d(this.f32399a, i10, i11, iMax + i10, iMax2 + i11);
            this.f32399a.setClipBounds(z10 ? this.f32402d : this.f32400b);
        }
    }

    /* renamed from: androidx.transition.b$h */
    private static class h extends q {

        /* renamed from: a, reason: collision with root package name */
        boolean f32413a = false;

        /* renamed from: b, reason: collision with root package name */
        final ViewGroup f32414b;

        h(ViewGroup viewGroup) {
            this.f32414b = viewGroup;
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC4036k.f
        public void b(AbstractC4036k abstractC4036k) {
            x.b(this.f32414b, false);
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void d(AbstractC4036k abstractC4036k) {
            if (!this.f32413a) {
                x.b(this.f32414b, false);
            }
            abstractC4036k.a0(this);
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC4036k.f
        public void e(AbstractC4036k abstractC4036k) {
            x.b(this.f32414b, false);
            this.f32413a = true;
        }

        @Override // androidx.transition.q, androidx.transition.AbstractC4036k.f
        public void g(AbstractC4036k abstractC4036k) {
            x.b(this.f32414b, true);
        }
    }

    /* renamed from: androidx.transition.b$i */
    private static class i {

        /* renamed from: a, reason: collision with root package name */
        private int f32415a;

        /* renamed from: b, reason: collision with root package name */
        private int f32416b;

        /* renamed from: c, reason: collision with root package name */
        private int f32417c;

        /* renamed from: d, reason: collision with root package name */
        private int f32418d;

        /* renamed from: e, reason: collision with root package name */
        private final View f32419e;

        /* renamed from: f, reason: collision with root package name */
        private int f32420f;

        /* renamed from: g, reason: collision with root package name */
        private int f32421g;

        i(View view) {
            this.f32419e = view;
        }

        private void b() {
            y.d(this.f32419e, this.f32415a, this.f32416b, this.f32417c, this.f32418d);
            this.f32420f = 0;
            this.f32421g = 0;
        }

        void a(PointF pointF) {
            this.f32417c = Math.round(pointF.x);
            this.f32418d = Math.round(pointF.y);
            int i10 = this.f32421g + 1;
            this.f32421g = i10;
            if (this.f32420f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f32415a = Math.round(pointF.x);
            this.f32416b = Math.round(pointF.y);
            int i10 = this.f32420f + 1;
            this.f32420f = i10;
            if (i10 == this.f32421g) {
                b();
            }
        }
    }

    private void o0(v vVar) {
        View view = vVar.f32517b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        vVar.f32516a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        vVar.f32516a.put("android:changeBounds:parent", vVar.f32517b.getParent());
        if (this.f32396Y) {
            vVar.f32516a.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // androidx.transition.AbstractC4036k
    public String[] L() {
        return f32389Z;
    }

    @Override // androidx.transition.AbstractC4036k
    public void h(v vVar) {
        o0(vVar);
    }

    @Override // androidx.transition.AbstractC4036k
    public void l(v vVar) {
        Rect rect;
        o0(vVar);
        if (!this.f32396Y || (rect = (Rect) vVar.f32517b.getTag(AbstractC4033h.f32444b)) == null) {
            return;
        }
        vVar.f32516a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.AbstractC4036k
    public Animator p(ViewGroup viewGroup, v vVar, v vVar2) {
        int i10;
        View view;
        int i11;
        int i12;
        int i13;
        ObjectAnimator objectAnimatorA;
        int i14;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (vVar == null || vVar2 == null) {
            return null;
        }
        Map map = vVar.f32516a;
        Map map2 = vVar2.f32516a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = vVar2.f32517b;
        Rect rect = (Rect) vVar.f32516a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) vVar2.f32516a.get("android:changeBounds:bounds");
        int i15 = rect.left;
        int i16 = rect2.left;
        int i17 = rect.top;
        int i18 = rect2.top;
        int i19 = rect.right;
        int i20 = rect2.right;
        int i21 = rect.bottom;
        int i22 = rect2.bottom;
        int i23 = i19 - i15;
        int i24 = i21 - i17;
        int i25 = i20 - i16;
        int i26 = i22 - i18;
        Rect rect3 = (Rect) vVar.f32516a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) vVar2.f32516a.get("android:changeBounds:clip");
        if ((i23 == 0 || i24 == 0) && (i25 == 0 || i26 == 0)) {
            i10 = 0;
        } else {
            i10 = (i15 == i16 && i17 == i18) ? 0 : 1;
            if (i19 != i20 || i21 != i22) {
                i10++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i10++;
        }
        if (i10 <= 0) {
            return null;
        }
        if (this.f32396Y) {
            view = view2;
            y.d(view, i15, i17, Math.max(i23, i25) + i15, i17 + Math.max(i24, i26));
            if (i15 == i16 && i17 == i18) {
                i11 = i20;
                i12 = i19;
                i13 = i17;
                objectAnimatorA = null;
            } else {
                i11 = i20;
                i12 = i19;
                i13 = i17;
                objectAnimatorA = AbstractC4031f.a(view, f32394j1, A().a(i15, i17, i16, i18));
            }
            boolean z10 = rect3 == null;
            if (z10) {
                i14 = 0;
                rect3 = new Rect(0, 0, i23, i24);
            } else {
                i14 = 0;
            }
            Rect rect5 = rect3;
            int i27 = rect4 == null ? 1 : i14;
            Rect rect6 = i27 != 0 ? new Rect(i14, i14, i25, i26) : rect4;
            if (rect5.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect5);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f32395k1, rect5, rect6);
                g gVar = new g(view, rect5, z10, rect6, i27, i15, i13, i12, i21, i16, i18, i11, i22);
                objectAnimatorOfObject.addListener(gVar);
                b(gVar);
            }
            animatorC = u.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            view = view2;
            y.d(view, i15, i17, i19, i21);
            if (i10 != 2) {
                animatorC = (i15 == i16 && i17 == i18) ? AbstractC4031f.a(view, f32392h1, A().a(i19, i21, i20, i22)) : AbstractC4031f.a(view, f32393i1, A().a(i15, i17, i16, i18));
            } else if (i23 == i25 && i24 == i26) {
                animatorC = AbstractC4031f.a(view, f32394j1, A().a(i15, i17, i16, i18));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = AbstractC4031f.a(iVar, f32390f1, A().a(i15, i17, i16, i18));
                ObjectAnimator objectAnimatorA3 = AbstractC4031f.a(iVar, f32391g1, A().a(i19, i21, i20, i22));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.b(viewGroup4, true);
            D().b(new h(viewGroup4));
        }
        return animatorC;
    }
}
