package L0;

import android.animation.ObjectAnimator;
import android.view.View;
import com.apm.insight.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: Q, reason: collision with root package name */
    public static final String[] f2440Q = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: P, reason: collision with root package name */
    public final int f2441P;

    public g(int i) {
        this();
        this.f2441P = i;
    }

    public static void J(t tVar) {
        int visibility = tVar.f2489b.getVisibility();
        HashMap map = tVar.f2488a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = tVar.f2489b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float L(t tVar, float f2) {
        Float f5;
        return (tVar == null || (f5 = (Float) tVar.f2488a.get("android:fade:transitionAlpha")) == null) ? f2 : f5.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static L0.E M(L0.t r8, L0.t r9) {
        /*
            L0.E r0 = new L0.E
            r0.<init>()
            r1 = 0
            r0.f2414c = r1
            r0.f2415d = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f2488a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f2412a = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f2416e = r6
            goto L33
        L2f:
            r0.f2412a = r3
            r0.f2416e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f2488a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f2413b = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f2417f = r2
            goto L56
        L52:
            r0.f2413b = r3
            r0.f2417f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L92
            if (r9 == 0) goto L92
            int r8 = r0.f2412a
            int r9 = r0.f2413b
            if (r8 != r9) goto L6c
            java.lang.Object r3 = r0.f2416e
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r4 = r0.f2417f
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 != r4) goto L6c
            goto La7
        L6c:
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L75
            r0.f2415d = r1
            r0.f2414c = r2
            return r0
        L75:
            if (r9 != 0) goto La7
            r0.f2415d = r2
            r0.f2414c = r2
            return r0
        L7c:
            java.lang.Object r8 = r0.f2417f
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto L87
            r0.f2415d = r1
            r0.f2414c = r2
            return r0
        L87:
            java.lang.Object r8 = r0.f2416e
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto La7
            r0.f2415d = r2
            r0.f2414c = r2
            return r0
        L92:
            if (r8 != 0) goto L9d
            int r8 = r0.f2413b
            if (r8 != 0) goto L9d
            r0.f2415d = r2
            r0.f2414c = r2
            return r0
        L9d:
            if (r9 != 0) goto La7
            int r8 = r0.f2412a
            if (r8 != 0) goto La7
            r0.f2415d = r1
            r0.f2414c = r2
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.g.M(L0.t, L0.t):L0.E");
    }

    public final ObjectAnimator K(View view, float f2, float f5) {
        if (f2 == f5) {
            return null;
        }
        v.f2491a.r(view, f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, v.f2492b, f5);
        f fVar = new f(view);
        objectAnimatorOfFloat.addListener(fVar);
        p().a(fVar);
        return objectAnimatorOfFloat;
    }

    @Override // L0.l
    public final void d(t tVar) {
        J(tVar);
    }

    @Override // L0.l
    public final void g(t tVar) {
        J(tVar);
        View view = tVar.f2489b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(v.f2491a.k(view)) : Float.valueOf(0.0f);
        }
        tVar.f2488a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (M(o(r3, false), s(r3, false)).f2414c != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0218  */
    @Override // L0.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, L0.t r25, L0.t r26) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L0.g.k(android.view.ViewGroup, L0.t, L0.t):android.animation.Animator");
    }

    @Override // L0.l
    public final String[] r() {
        return f2440Q;
    }

    @Override // L0.l
    public final boolean t(t tVar, t tVar2) {
        if (tVar == null && tVar2 == null) {
            return false;
        }
        if (tVar != null && tVar2 != null && tVar2.f2488a.containsKey("android:visibility:visibility") != tVar.f2488a.containsKey("android:visibility:visibility")) {
            return false;
        }
        E eM = M(tVar, tVar2);
        if (eM.f2414c) {
            return eM.f2412a == 0 || eM.f2413b == 0;
        }
        return false;
    }

    public g() {
        this.f2441P = 3;
    }
}
