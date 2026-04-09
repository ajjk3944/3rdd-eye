package j6;

import android.animation.ObjectAnimator;
import android.view.View;
import com.google.android.gms.internal.ads.lu1;
import com.liuzh.deviceinfo.R;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends o {
    public static final String[] D = {"android:visibility:visibility", "android:visibility:parent"};
    public final int C;

    public h(int i4) {
        this();
        this.C = i4;
    }

    public static void L(v vVar) {
        View view = vVar.f27458b;
        int visibility = view.getVisibility();
        HashMap map = vVar.f27457a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float N(v vVar, float f10) {
        Float f11;
        return (vVar == null || (f11 = (Float) vVar.f27457a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.lu1 O(j6.v r8, j6.v r9) {
        /*
            com.google.android.gms.internal.ads.lu1 r0 = new com.google.android.gms.internal.ads.lu1
            r0.<init>()
            r1 = 0
            r0.f13633a = r1
            r0.f13634b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f27457a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f13635c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f13637e = r6
            goto L33
        L2f:
            r0.f13635c = r3
            r0.f13637e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f27457a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f13636d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f13638f = r2
            goto L56
        L52:
            r0.f13636d = r3
            r0.f13638f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L92
            if (r9 == 0) goto L92
            int r8 = r0.f13635c
            int r9 = r0.f13636d
            if (r8 != r9) goto L6c
            java.lang.Object r3 = r0.f13637e
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r4 = r0.f13638f
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 != r4) goto L6c
            goto La7
        L6c:
            if (r8 == r9) goto L7c
            if (r8 != 0) goto L75
            r0.f13634b = r1
            r0.f13633a = r2
            return r0
        L75:
            if (r9 != 0) goto La7
            r0.f13634b = r2
            r0.f13633a = r2
            return r0
        L7c:
            java.lang.Object r8 = r0.f13638f
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto L87
            r0.f13634b = r1
            r0.f13633a = r2
            return r0
        L87:
            java.lang.Object r8 = r0.f13637e
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            if (r8 != 0) goto La7
            r0.f13634b = r2
            r0.f13633a = r2
            return r0
        L92:
            if (r8 != 0) goto L9d
            int r8 = r0.f13636d
            if (r8 != 0) goto L9d
            r0.f13634b = r2
            r0.f13633a = r2
            return r0
        L9d:
            if (r9 != 0) goto La7
            int r8 = r0.f13635c
            if (r8 != 0) goto La7
            r0.f13634b = r1
            r0.f13633a = r2
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.h.O(j6.v, j6.v):com.google.android.gms.internal.ads.lu1");
    }

    public final ObjectAnimator M(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        w.f27460a.J(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, w.f27461b, f11);
        g gVar = new g(view);
        objectAnimatorOfFloat.addListener(gVar);
        o().a(gVar);
        return objectAnimatorOfFloat;
    }

    @Override // j6.o
    public final void d(v vVar) {
        L(vVar);
    }

    @Override // j6.o
    public final void g(v vVar) {
        L(vVar);
        View view = vVar.f27458b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(w.f27460a.B(view)) : Float.valueOf(0.0f);
        }
        vVar.f27457a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (O(n(r3, false), r(r3, false)).f13633a != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0216  */
    @Override // j6.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r25, j6.v r26, j6.v r27) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.h.k(android.view.ViewGroup, j6.v, j6.v):android.animation.Animator");
    }

    @Override // j6.o
    public final String[] q() {
        return D;
    }

    @Override // j6.o
    public final boolean t(v vVar, v vVar2) {
        if (vVar == null && vVar2 == null) {
            return false;
        }
        if (vVar != null && vVar2 != null && vVar2.f27457a.containsKey("android:visibility:visibility") != vVar.f27457a.containsKey("android:visibility:visibility")) {
            return false;
        }
        lu1 lu1VarO = O(vVar, vVar2);
        if (lu1VarO.f13633a) {
            return lu1VarO.f13635c == 0 || lu1VarO.f13636d == 0;
        }
        return false;
    }

    public h() {
        this.C = 3;
    }
}
