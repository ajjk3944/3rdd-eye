package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC4036k;

/* loaded from: classes.dex */
public abstract class K extends AbstractC4036k {

    /* renamed from: Z, reason: collision with root package name */
    private static final String[] f32370Z = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: Y, reason: collision with root package name */
    private int f32371Y = 3;

    private static class a extends AnimatorListenerAdapter implements AbstractC4036k.f {

        /* renamed from: a, reason: collision with root package name */
        private final View f32372a;

        /* renamed from: b, reason: collision with root package name */
        private final int f32373b;

        /* renamed from: c, reason: collision with root package name */
        private final ViewGroup f32374c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f32375d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f32376e;

        /* renamed from: f, reason: collision with root package name */
        boolean f32377f = false;

        a(View view, int i10, boolean z10) {
            this.f32372a = view;
            this.f32373b = i10;
            this.f32374c = (ViewGroup) view.getParent();
            this.f32375d = z10;
            i(true);
        }

        private void h() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (!this.f32377f) {
                y.f(this.f32372a, this.f32373b);
                ViewGroup viewGroup = this.f32374c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            i(false);
        }

        private void i(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f32375d || this.f32376e == z10 || (viewGroup = this.f32374c) == null) {
                return;
            }
            this.f32376e = z10;
            x.b(viewGroup, z10);
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void a(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void b(AbstractC4036k abstractC4036k) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            i(false);
            if (this.f32377f) {
                return;
            }
            y.f(this.f32372a, this.f32373b);
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void d(AbstractC4036k abstractC4036k) {
            abstractC4036k.a0(this);
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void e(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void g(AbstractC4036k abstractC4036k) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            i(true);
            if (this.f32377f) {
                return;
            }
            y.f(this.f32372a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f32377f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z10) {
                return;
            }
            h();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z10) {
                y.f(this.f32372a, 0);
                ViewGroup viewGroup = this.f32374c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    private class b extends AnimatorListenerAdapter implements AbstractC4036k.f {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f32378a;

        /* renamed from: b, reason: collision with root package name */
        private final View f32379b;

        /* renamed from: c, reason: collision with root package name */
        private final View f32380c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f32381d = true;

        b(ViewGroup viewGroup, View view, View view2) {
            this.f32378a = viewGroup;
            this.f32379b = view;
            this.f32380c = view2;
        }

        private void h() {
            this.f32380c.setTag(AbstractC4033h.f32443a, null);
            this.f32378a.getOverlay().remove(this.f32379b);
            this.f32381d = false;
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void a(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void b(AbstractC4036k abstractC4036k) {
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void d(AbstractC4036k abstractC4036k) {
            abstractC4036k.a0(this);
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void e(AbstractC4036k abstractC4036k) {
            if (this.f32381d) {
                h();
            }
        }

        @Override // androidx.transition.AbstractC4036k.f
        public void g(AbstractC4036k abstractC4036k) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f32378a.getOverlay().remove(this.f32379b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f32379b.getParent() == null) {
                this.f32378a.getOverlay().add(this.f32379b);
            } else {
                K.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                this.f32380c.setTag(AbstractC4033h.f32443a, this.f32379b);
                this.f32378a.getOverlay().add(this.f32379b);
                this.f32381d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            h();
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        boolean f32383a;

        /* renamed from: b, reason: collision with root package name */
        boolean f32384b;

        /* renamed from: c, reason: collision with root package name */
        int f32385c;

        /* renamed from: d, reason: collision with root package name */
        int f32386d;

        /* renamed from: e, reason: collision with root package name */
        ViewGroup f32387e;

        /* renamed from: f, reason: collision with root package name */
        ViewGroup f32388f;

        c() {
        }
    }

    private void o0(v vVar) {
        vVar.f32516a.put("android:visibility:visibility", Integer.valueOf(vVar.f32517b.getVisibility()));
        vVar.f32516a.put("android:visibility:parent", vVar.f32517b.getParent());
        int[] iArr = new int[2];
        vVar.f32517b.getLocationOnScreen(iArr);
        vVar.f32516a.put("android:visibility:screenLocation", iArr);
    }

    private c p0(v vVar, v vVar2) {
        c cVar = new c();
        cVar.f32383a = false;
        cVar.f32384b = false;
        if (vVar == null || !vVar.f32516a.containsKey("android:visibility:visibility")) {
            cVar.f32385c = -1;
            cVar.f32387e = null;
        } else {
            cVar.f32385c = ((Integer) vVar.f32516a.get("android:visibility:visibility")).intValue();
            cVar.f32387e = (ViewGroup) vVar.f32516a.get("android:visibility:parent");
        }
        if (vVar2 == null || !vVar2.f32516a.containsKey("android:visibility:visibility")) {
            cVar.f32386d = -1;
            cVar.f32388f = null;
        } else {
            cVar.f32386d = ((Integer) vVar2.f32516a.get("android:visibility:visibility")).intValue();
            cVar.f32388f = (ViewGroup) vVar2.f32516a.get("android:visibility:parent");
        }
        if (vVar != null && vVar2 != null) {
            int i10 = cVar.f32385c;
            int i11 = cVar.f32386d;
            if (i10 == i11 && cVar.f32387e == cVar.f32388f) {
                return cVar;
            }
            if (i10 != i11) {
                if (i10 == 0) {
                    cVar.f32384b = false;
                    cVar.f32383a = true;
                } else if (i11 == 0) {
                    cVar.f32384b = true;
                    cVar.f32383a = true;
                }
            } else if (cVar.f32388f == null) {
                cVar.f32384b = false;
                cVar.f32383a = true;
            } else if (cVar.f32387e == null) {
                cVar.f32384b = true;
                cVar.f32383a = true;
            }
        } else if (vVar == null && cVar.f32386d == 0) {
            cVar.f32384b = true;
            cVar.f32383a = true;
        } else if (vVar2 == null && cVar.f32385c == 0) {
            cVar.f32384b = false;
            cVar.f32383a = true;
        }
        return cVar;
    }

    @Override // androidx.transition.AbstractC4036k
    public String[] L() {
        return f32370Z;
    }

    @Override // androidx.transition.AbstractC4036k
    public boolean N(v vVar, v vVar2) {
        if (vVar == null && vVar2 == null) {
            return false;
        }
        if (vVar != null && vVar2 != null && vVar2.f32516a.containsKey("android:visibility:visibility") != vVar.f32516a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarP0 = p0(vVar, vVar2);
        if (cVarP0.f32383a) {
            return cVarP0.f32385c == 0 || cVarP0.f32386d == 0;
        }
        return false;
    }

    @Override // androidx.transition.AbstractC4036k
    public void h(v vVar) {
        o0(vVar);
    }

    @Override // androidx.transition.AbstractC4036k
    public void l(v vVar) {
        o0(vVar);
    }

    @Override // androidx.transition.AbstractC4036k
    public Animator p(ViewGroup viewGroup, v vVar, v vVar2) {
        c cVarP0 = p0(vVar, vVar2);
        if (!cVarP0.f32383a) {
            return null;
        }
        if (cVarP0.f32387e == null && cVarP0.f32388f == null) {
            return null;
        }
        return cVarP0.f32384b ? s0(viewGroup, vVar, cVarP0.f32385c, vVar2, cVarP0.f32386d) : u0(viewGroup, vVar, cVarP0.f32385c, vVar2, cVarP0.f32386d);
    }

    public abstract Animator r0(ViewGroup viewGroup, View view, v vVar, v vVar2);

    public Animator s0(ViewGroup viewGroup, v vVar, int i10, v vVar2, int i11) {
        if ((this.f32371Y & 1) != 1 || vVar2 == null) {
            return null;
        }
        if (vVar == null) {
            View view = (View) vVar2.f32517b.getParent();
            if (p0(x(view, false), M(view, false)).f32383a) {
                return null;
            }
        }
        return r0(viewGroup, vVar2.f32517b, vVar, vVar2);
    }

    public abstract Animator t0(ViewGroup viewGroup, View view, v vVar, v vVar2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[PHI: r8
  0x0073: PHI (r8v3 android.view.View) = 
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v2 android.view.View)
  (r8v6 android.view.View)
 binds: [B:26:0x0048, B:31:0x0057, B:37:0x0082, B:39:0x0085, B:41:0x008b, B:43:0x008f, B:34:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator u0(android.view.ViewGroup r18, androidx.transition.v r19, int r20, androidx.transition.v r21, int r22) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.K.u0(android.view.ViewGroup, androidx.transition.v, int, androidx.transition.v, int):android.animation.Animator");
    }

    public void v0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f32371Y = i10;
    }
}
