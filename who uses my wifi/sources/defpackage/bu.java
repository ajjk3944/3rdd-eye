package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class bu extends v21 {
    public static final String[] G = {"android:visibility:visibility", "android:visibility:parent"};
    public final int F;

    public bu(int i) {
        this();
        this.F = i;
    }

    public static void I(d31 d31Var) {
        View view = d31Var.b;
        int visibility = view.getVisibility();
        HashMap map = d31Var.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float K(d31 d31Var, float f) {
        Float f2;
        return (d31Var == null || (f2 = (Float) d31Var.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.t71 L(defpackage.d31 r8, defpackage.d31 r9) {
        /*
            t71 r0 = new t71
            r0.<init>()
            r1 = 0
            r0.c = r1
            r0.d = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.a = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.a = r3
            r0.e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.b = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.b = r3
            r0.f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L92
            if (r9 == 0) goto L92
            int r8 = r0.a
            int r9 = r0.b
            if (r8 != r9) goto L6c
            java.lang.Object r3 = r0.e
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r4 = r0.f
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 != r4) goto L6c
            goto La7
        L6c:
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L75
            r0.d = r1
            r0.c = r2
            return r0
        L75:
            if (r9 != 0) goto La7
            r0.d = r2
            r0.c = r2
            return r0
        L7c:
            java.lang.Object r8 = r0.f
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto L87
            r0.d = r1
            r0.c = r2
            return r0
        L87:
            java.lang.Object r8 = r0.e
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto La7
            r0.d = r2
            r0.c = r2
            return r0
        L92:
            if (r8 != 0) goto L9d
            int r8 = r0.b
            if (r8 != 0) goto L9d
            r0.d = r2
            r0.c = r2
            return r0
        L9d:
            if (r9 != 0) goto La7
            int r8 = r0.a
            if (r8 != 0) goto La7
            r0.d = r1
            r0.c = r2
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu.L(d31, d31):t71");
    }

    public final ObjectAnimator J(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        f71.a.y(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, f71.b, f2);
        au auVar = new au(view);
        objectAnimatorOfFloat.addListener(auVar);
        o().a(auVar);
        return objectAnimatorOfFloat;
    }

    @Override // defpackage.v21
    public final void d(d31 d31Var) {
        I(d31Var);
    }

    @Override // defpackage.v21
    public final void g(d31 d31Var) {
        I(d31Var);
        View view = d31Var.b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(f71.a.l(view)) : Float.valueOf(0.0f);
        }
        d31Var.a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (L(n(r3, false), r(r3, false)).c != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0218  */
    @Override // defpackage.v21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, defpackage.d31 r25, defpackage.d31 r26) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu.k(android.view.ViewGroup, d31, d31):android.animation.Animator");
    }

    @Override // defpackage.v21
    public final String[] q() {
        return G;
    }

    @Override // defpackage.v21
    public final boolean s(d31 d31Var, d31 d31Var2) {
        if (d31Var == null && d31Var2 == null) {
            return false;
        }
        if (d31Var != null && d31Var2 != null && d31Var2.a.containsKey("android:visibility:visibility") != d31Var.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        t71 t71VarL = L(d31Var, d31Var2);
        if (t71VarL.c) {
            return t71VarL.a == 0 || t71VarL.b == 0;
        }
        return false;
    }

    public bu() {
        this.F = 3;
    }
}
