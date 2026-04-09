package K1;

import K1.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.HashMap;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class z extends i {

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f3048D = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: C, reason: collision with root package name */
    public int f3049C = 3;

    /* compiled from: Visibility.java */
    public static class a extends AnimatorListenerAdapter implements i.d {

        /* renamed from: a, reason: collision with root package name */
        public final View f3050a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3051b;

        /* renamed from: c, reason: collision with root package name */
        public final ViewGroup f3052c;

        /* renamed from: e, reason: collision with root package name */
        public boolean f3054e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f3055f = false;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f3053d = true;

        public a(View view, int i) {
            this.f3050a = view;
            this.f3051b = i;
            this.f3052c = (ViewGroup) view.getParent();
            h(true);
        }

        @Override // K1.i.d
        public final void a(i iVar) {
            iVar.z(this);
        }

        @Override // K1.i.d
        public final void b(i iVar) {
            throw null;
        }

        @Override // K1.i.d
        public final void c(i iVar) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            h(true);
            if (this.f3055f) {
                return;
            }
            s.b(this.f3050a, 0);
        }

        @Override // K1.i.d
        public final void e(i iVar) {
            iVar.z(this);
        }

        @Override // K1.i.d
        public final void g(i iVar) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            h(false);
            if (this.f3055f) {
                return;
            }
            s.b(this.f3050a, this.f3051b);
        }

        public final void h(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f3053d || this.f3054e == z10 || (viewGroup = this.f3052c) == null) {
                return;
            }
            this.f3054e = z10;
            r.a(viewGroup, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f3055f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (!this.f3055f) {
                s.b(this.f3050a, this.f3051b);
                ViewGroup viewGroup = this.f3052c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            h(false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z10) {
                s.b(this.f3050a, 0);
                ViewGroup viewGroup = this.f3052c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (z10) {
                return;
            }
            if (!this.f3055f) {
                s.b(this.f3050a, this.f3051b);
                ViewGroup viewGroup = this.f3052c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            h(false);
        }

        @Override // K1.i.d
        public final void d(i iVar) {
        }

        @Override // K1.i.d
        public final void f(i iVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }
    }

    /* compiled from: Visibility.java */
    public class b extends AnimatorListenerAdapter implements i.d {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f3056a;

        /* renamed from: b, reason: collision with root package name */
        public final View f3057b;

        /* renamed from: c, reason: collision with root package name */
        public final View f3058c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f3059d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.f3056a = viewGroup;
            this.f3057b = view;
            this.f3058c = view2;
        }

        @Override // K1.i.d
        public final void a(i iVar) {
            iVar.z(this);
        }

        @Override // K1.i.d
        public final void b(i iVar) {
            throw null;
        }

        @Override // K1.i.d
        public final void e(i iVar) {
            iVar.z(this);
        }

        @Override // K1.i.d
        public final void f(i iVar) {
            if (this.f3059d) {
                h();
            }
        }

        public final void h() {
            this.f3058c.setTag(R.id.save_overlay_view, null);
            this.f3056a.getOverlay().remove(this.f3057b);
            this.f3059d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.f3056a.getOverlay().remove(this.f3057b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            View view = this.f3057b;
            if (view.getParent() == null) {
                this.f3056a.getOverlay().add(view);
            } else {
                z.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                View view = this.f3058c;
                View view2 = this.f3057b;
                view.setTag(R.id.save_overlay_view, view2);
                this.f3056a.getOverlay().add(view2);
                this.f3059d = true;
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            h();
        }

        @Override // K1.i.d
        public final void c(i iVar) {
        }

        @Override // K1.i.d
        public final void d(i iVar) {
        }

        @Override // K1.i.d
        public final void g(i iVar) {
        }
    }

    /* compiled from: Visibility.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3061a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3062b;

        /* renamed from: c, reason: collision with root package name */
        public int f3063c;

        /* renamed from: d, reason: collision with root package name */
        public int f3064d;

        /* renamed from: e, reason: collision with root package name */
        public ViewGroup f3065e;

        /* renamed from: f, reason: collision with root package name */
        public ViewGroup f3066f;
    }

    public static void M(p pVar) {
        int visibility = pVar.f3032b.getVisibility();
        HashMap map = pVar.f3031a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = pVar.f3032b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static K1.z.c N(K1.p r8, K1.p r9) {
        /*
            K1.z$c r0 = new K1.z$c
            r0.<init>()
            r1 = 0
            r0.f3061a = r1
            r0.f3062b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f3031a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f3063c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f3065e = r6
            goto L33
        L2f:
            r0.f3063c = r3
            r0.f3065e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f3031a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f3064d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f3066f = r2
            goto L56
        L52:
            r0.f3064d = r3
            r0.f3066f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f3063c
            int r9 = r0.f3064d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f3065e
            android.view.ViewGroup r4 = r0.f3066f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f3062b = r1
            r0.f3061a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f3062b = r2
            r0.f3061a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f3066f
            if (r8 != 0) goto L81
            r0.f3062b = r1
            r0.f3061a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f3065e
            if (r8 != 0) goto L9f
            r0.f3062b = r2
            r0.f3061a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f3064d
            if (r8 != 0) goto L95
            r0.f3062b = r2
            r0.f3061a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f3063c
            if (r8 != 0) goto L9f
            r0.f3062b = r1
            r0.f3061a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.z.N(K1.p, K1.p):K1.z$c");
    }

    public Animator O(ViewGroup viewGroup, p pVar, int i, p pVar2, int i10) {
        if ((this.f3049C & 1) != 1 || pVar2 == null) {
            return null;
        }
        View view = pVar2.f3032b;
        if (pVar == null) {
            View view2 = (View) view.getParent();
            if (N(q(view2, false), u(view2, false)).f3061a) {
                return null;
            }
        }
        return P(viewGroup, view, pVar, pVar2);
    }

    public abstract ObjectAnimator P(ViewGroup viewGroup, View view, p pVar, p pVar2);

    /* JADX WARN: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator Q(android.view.ViewGroup r22, K1.p r23, int r24, K1.p r25, int r26) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.z.Q(android.view.ViewGroup, K1.p, int, K1.p, int):android.animation.Animator");
    }

    public abstract ObjectAnimator R(ViewGroup viewGroup, View view, p pVar, p pVar2);

    public final void S(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f3049C = i;
    }

    @Override // K1.i
    public void f(p pVar) {
        M(pVar);
    }

    @Override // K1.i
    public final Animator m(ViewGroup viewGroup, p pVar, p pVar2) {
        c cVarN = N(pVar, pVar2);
        if (!cVarN.f3061a) {
            return null;
        }
        if (cVarN.f3065e == null && cVarN.f3066f == null) {
            return null;
        }
        return cVarN.f3062b ? O(viewGroup, pVar, cVarN.f3063c, pVar2, cVarN.f3064d) : Q(viewGroup, pVar, cVarN.f3063c, pVar2, cVarN.f3064d);
    }

    @Override // K1.i
    public final String[] t() {
        return f3048D;
    }

    @Override // K1.i
    public final boolean v(p pVar, p pVar2) {
        if (pVar == null && pVar2 == null) {
            return false;
        }
        if (pVar != null && pVar2 != null && pVar2.f3031a.containsKey("android:visibility:visibility") != pVar.f3031a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarN = N(pVar, pVar2);
        if (cVarN.f3061a) {
            return cVarN.f3063c == 0 || cVarN.f3064d == 0;
        }
        return false;
    }
}
