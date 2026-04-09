package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import y1.h;
import y1.q;
import y1.s;
import y1.t;

/* loaded from: classes.dex */
public abstract class Visibility extends Transition {
    public static final String[] N = {"android:visibility:visibility", "android:visibility:parent"};
    public int M = 3;

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Mode {
    }

    public static class a extends AnimatorListenerAdapter implements Transition.f {

        /* renamed from: a, reason: collision with root package name */
        public final View f4176a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4177b;

        /* renamed from: c, reason: collision with root package name */
        public final ViewGroup f4178c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f4179d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4180e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f4181f = false;

        public a(View view, int i10, boolean z10) {
            this.f4176a = view;
            this.f4177b = i10;
            this.f4178c = (ViewGroup) view.getParent();
            this.f4179d = z10;
            i(true);
        }

        @Override // androidx.transition.Transition.f
        public void a(Transition transition) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            i(true);
            if (this.f4181f) {
                return;
            }
            t.f(this.f4176a, 0);
        }

        @Override // androidx.transition.Transition.f
        public void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void c(Transition transition) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            i(false);
            if (this.f4181f) {
                return;
            }
            t.f(this.f4176a, this.f4177b);
        }

        @Override // androidx.transition.Transition.f
        public /* synthetic */ void d(Transition transition, boolean z10) {
            h.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
            transition.R(this);
        }

        @Override // androidx.transition.Transition.f
        public void f(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public /* synthetic */ void g(Transition transition, boolean z10) {
            h.b(this, transition, z10);
        }

        public final void h() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
            if (!this.f4181f) {
                t.f(this.f4176a, this.f4177b);
                ViewGroup viewGroup = this.f4178c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            i(false);
        }

        public final void i(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f4179d || this.f4180e == z10 || (viewGroup = this.f4178c) == null) {
                return;
            }
            this.f4180e = z10;
            s.b(viewGroup, z10);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4181f = true;
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
                t.f(this.f4176a, 0);
                ViewGroup viewGroup = this.f4178c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    public class b extends AnimatorListenerAdapter implements Transition.f {

        /* renamed from: a, reason: collision with root package name */
        public final ViewGroup f4182a;

        /* renamed from: b, reason: collision with root package name */
        public final View f4183b;

        /* renamed from: c, reason: collision with root package name */
        public final View f4184c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4185d = true;

        public b(ViewGroup viewGroup, View view, View view2) {
            this.f4182a = viewGroup;
            this.f4183b = view;
            this.f4184c = view2;
        }

        @Override // androidx.transition.Transition.f
        public void a(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public void c(Transition transition) {
        }

        @Override // androidx.transition.Transition.f
        public /* synthetic */ void d(Transition transition, boolean z10) {
            h.a(this, transition, z10);
        }

        @Override // androidx.transition.Transition.f
        public void e(Transition transition) {
            transition.R(this);
        }

        @Override // androidx.transition.Transition.f
        public void f(Transition transition) {
            if (this.f4185d) {
                h();
            }
        }

        @Override // androidx.transition.Transition.f
        public /* synthetic */ void g(Transition transition, boolean z10) {
            h.b(this, transition, z10);
        }

        public final void h() {
            this.f4184c.setTag(y1.e.save_overlay_view, null);
            this.f4182a.getOverlay().remove(this.f4183b);
            this.f4185d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f4182a.getOverlay().remove(this.f4183b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f4183b.getParent() == null) {
                this.f4182a.getOverlay().add(this.f4183b);
            } else {
                Visibility.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            if (z10) {
                this.f4184c.setTag(y1.e.save_overlay_view, this.f4183b);
                this.f4182a.getOverlay().add(this.f4183b);
                this.f4185d = true;
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

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4187a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4188b;

        /* renamed from: c, reason: collision with root package name */
        public int f4189c;

        /* renamed from: d, reason: collision with root package name */
        public int f4190d;

        /* renamed from: e, reason: collision with root package name */
        public ViewGroup f4191e;

        /* renamed from: f, reason: collision with root package name */
        public ViewGroup f4192f;
    }

    private void e0(q qVar) {
        qVar.f25089a.put("android:visibility:visibility", Integer.valueOf(qVar.f25090b.getVisibility()));
        qVar.f25089a.put("android:visibility:parent", qVar.f25090b.getParent());
        int[] iArr = new int[2];
        qVar.f25090b.getLocationOnScreen(iArr);
        qVar.f25089a.put("android:visibility:screenLocation", iArr);
    }

    @Override // androidx.transition.Transition
    public String[] D() {
        return N;
    }

    @Override // androidx.transition.Transition
    public boolean F(q qVar, q qVar2) {
        if (qVar == null && qVar2 == null) {
            return false;
        }
        if (qVar != null && qVar2 != null && qVar2.f25089a.containsKey("android:visibility:visibility") != qVar.f25089a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarF0 = f0(qVar, qVar2);
        return cVarF0.f4187a && (cVarF0.f4189c == 0 || cVarF0.f4190d == 0);
    }

    @Override // androidx.transition.Transition
    public void f(q qVar) {
        e0(qVar);
    }

    public final c f0(q qVar, q qVar2) {
        c cVar = new c();
        cVar.f4187a = false;
        cVar.f4188b = false;
        if (qVar == null || !qVar.f25089a.containsKey("android:visibility:visibility")) {
            cVar.f4189c = -1;
            cVar.f4191e = null;
        } else {
            cVar.f4189c = ((Integer) qVar.f25089a.get("android:visibility:visibility")).intValue();
            cVar.f4191e = (ViewGroup) qVar.f25089a.get("android:visibility:parent");
        }
        if (qVar2 == null || !qVar2.f25089a.containsKey("android:visibility:visibility")) {
            cVar.f4190d = -1;
            cVar.f4192f = null;
        } else {
            cVar.f4190d = ((Integer) qVar2.f25089a.get("android:visibility:visibility")).intValue();
            cVar.f4192f = (ViewGroup) qVar2.f25089a.get("android:visibility:parent");
        }
        if (qVar != null && qVar2 != null) {
            int i10 = cVar.f4189c;
            int i11 = cVar.f4190d;
            if (i10 != i11 || cVar.f4191e != cVar.f4192f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        cVar.f4188b = false;
                        cVar.f4187a = true;
                        return cVar;
                    }
                    if (i11 == 0) {
                        cVar.f4188b = true;
                        cVar.f4187a = true;
                        return cVar;
                    }
                } else {
                    if (cVar.f4192f == null) {
                        cVar.f4188b = false;
                        cVar.f4187a = true;
                        return cVar;
                    }
                    if (cVar.f4191e == null) {
                        cVar.f4188b = true;
                        cVar.f4187a = true;
                        return cVar;
                    }
                }
            }
        } else {
            if (qVar == null && cVar.f4190d == 0) {
                cVar.f4188b = true;
                cVar.f4187a = true;
                return cVar;
            }
            if (qVar2 == null && cVar.f4189c == 0) {
                cVar.f4188b = false;
                cVar.f4187a = true;
            }
        }
        return cVar;
    }

    public abstract Animator g0(ViewGroup viewGroup, View view, q qVar, q qVar2);

    public Animator h0(ViewGroup viewGroup, q qVar, int i10, q qVar2, int i11) {
        if ((this.M & 1) != 1 || qVar2 == null) {
            return null;
        }
        if (qVar == null) {
            View view = (View) qVar2.f25090b.getParent();
            if (f0(s(view, false), E(view, false)).f4187a) {
                return null;
            }
        }
        return g0(viewGroup, qVar2.f25090b, qVar, qVar2);
    }

    @Override // androidx.transition.Transition
    public void i(q qVar) {
        e0(qVar);
    }

    public abstract Animator i0(ViewGroup viewGroup, View view, q qVar, q qVar2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069 A[PHI: r2
  0x0069: PHI (r2v3 android.view.View) = 
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v2 android.view.View)
  (r2v6 android.view.View)
 binds: [B:26:0x003e, B:31:0x004d, B:37:0x0076, B:39:0x0079, B:41:0x007f, B:43:0x0083, B:34:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator j0(android.view.ViewGroup r11, y1.q r12, int r13, y1.q r14, int r15) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.j0(android.view.ViewGroup, y1.q, int, y1.q, int):android.animation.Animator");
    }

    public void k0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.M = i10;
    }

    @Override // androidx.transition.Transition
    public Animator m(ViewGroup viewGroup, q qVar, q qVar2) {
        c cVarF0 = f0(qVar, qVar2);
        if (!cVarF0.f4187a) {
            return null;
        }
        if (cVarF0.f4191e == null && cVarF0.f4192f == null) {
            return null;
        }
        return cVarF0.f4188b ? h0(viewGroup, qVar, cVarF0.f4189c, qVar2, cVarF0.f4190d) : j0(viewGroup, qVar, cVarF0.f4189c, qVar2, cVarF0.f4190d);
    }
}
