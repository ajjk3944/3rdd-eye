package t7;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g extends q {

    /* renamed from: a0, reason: collision with root package name */
    public static final String[] f22479a0 = {"android:visibility:visibility", "android:visibility:parent"};
    public final int Z;

    public g(int i10) {
        this();
        this.Z = i10;
    }

    public static void M(y yVar) {
        View view = yVar.f22529b;
        int visibility = view.getVisibility();
        HashMap map = yVar.f22528a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float O(y yVar, float f10) {
        Float f11;
        return (yVar == null || (f11 = (Float) yVar.f22528a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static t7.j0 P(t7.y r8, t7.y r9) {
        /*
            t7.j0 r0 = new t7.j0
            r0.<init>()
            r1 = 0
            r0.f22494a = r1
            r0.f22495b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f22528a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f22496c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f22498e = r6
            goto L33
        L2f:
            r0.f22496c = r3
            r0.f22498e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f22528a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f22497d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f22499f = r2
            goto L56
        L52:
            r0.f22497d = r3
            r0.f22499f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f22496c
            int r9 = r0.f22497d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f22498e
            android.view.ViewGroup r4 = r0.f22499f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f22495b = r1
            r0.f22494a = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.f22495b = r2
            r0.f22494a = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.f22499f
            if (r8 != 0) goto L81
            r0.f22495b = r1
            r0.f22494a = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.f22498e
            if (r8 != 0) goto L9f
            r0.f22495b = r2
            r0.f22494a = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f22497d
            if (r8 != 0) goto L95
            r0.f22495b = r2
            r0.f22494a = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f22496c
            if (r8 != 0) goto L9f
            r0.f22495b = r1
            r0.f22494a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.g.P(t7.y, t7.y):t7.j0");
    }

    public final ObjectAnimator N(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        a0.f22457a.B(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, a0.f22458b, f11);
        f fVar = new f(view);
        objectAnimatorOfFloat.addListener(fVar);
        p().a(fVar);
        return objectAnimatorOfFloat;
    }

    @Override // t7.q
    public final void d(y yVar) {
        M(yVar);
    }

    @Override // t7.q
    public final void g(y yVar) {
        M(yVar);
        View view = yVar.f22529b;
        Float fValueOf = (Float) view.getTag(i.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(a0.f22457a.s(view)) : Float.valueOf(0.0f);
        }
        yVar.f22528a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (P(o(r3, false), s(r3, false)).f22494a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0215  */
    @Override // t7.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, t7.y r25, t7.y r26) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.g.k(android.view.ViewGroup, t7.y, t7.y):android.animation.Animator");
    }

    @Override // t7.q
    public final String[] r() {
        return f22479a0;
    }

    @Override // t7.q
    public final boolean u(y yVar, y yVar2) {
        if (yVar == null && yVar2 == null) {
            return false;
        }
        if (yVar != null && yVar2 != null && yVar2.f22528a.containsKey("android:visibility:visibility") != yVar.f22528a.containsKey("android:visibility:visibility")) {
            return false;
        }
        j0 j0VarP = P(yVar, yVar2);
        if (j0VarP.f22494a) {
            return j0VarP.f22496c == 0 || j0VarP.f22497d == 0;
        }
        return false;
    }

    public g() {
        this.Z = 3;
    }
}
