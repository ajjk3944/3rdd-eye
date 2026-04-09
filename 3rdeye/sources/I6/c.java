package I6;

import H6.C0675l;
import java.util.LinkedHashMap;

/* compiled from: DivAnimatorController.kt */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C0675l f2523a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2524b;

    public c(C0675l divView) {
        kotlin.jvm.internal.l.f(divView, "divView");
        this.f2523a = divView;
        this.f2524b = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final N7.AbstractC1402w2 a(android.view.View r6, java.lang.String r7) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof O6.l
            r1 = 0
            if (r0 == 0) goto L72
            r0 = r6
            O6.l r0 = (O6.l) r0
            N7.Z r0 = r0.getDiv()
            if (r0 == 0) goto L19
            N7.S2 r0 = r0.d()
            if (r0 == 0) goto L19
            java.util.List r0 = r0.x()
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L4c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r0.next()
            r4 = r3
            N7.w2 r4 = (N7.AbstractC1402w2) r4
            N7.x2 r4 = r4.c()
            java.lang.String r4 = r4.getId()
            boolean r4 = kotlin.jvm.internal.l.b(r4, r7)
            if (r4 == 0) goto L27
            r2.add(r3)
            goto L27
        L46:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L4e
        L4c:
            r0 = r1
            goto L5c
        L4e:
            int r0 = r2.size()
            r3 = 1
            if (r0 <= r3) goto L56
            goto L4c
        L56:
            java.lang.Object r0 = c9.C2097r.p0(r2)
            N7.w2 r0 = (N7.AbstractC1402w2) r0
        L5c:
            if (r0 != 0) goto L71
            android.view.ViewParent r6 = r6.getParent()
            boolean r0 = r6 instanceof android.view.View
            if (r0 == 0) goto L69
            android.view.View r6 = (android.view.View) r6
            goto L6a
        L69:
            r6 = r1
        L6a:
            if (r6 == 0) goto L9c
            N7.w2 r6 = r5.a(r6, r7)
            return r6
        L71:
            return r0
        L72:
            boolean r0 = r6 instanceof H6.C0675l
            if (r0 == 0) goto L89
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "Unable to find animator with id '"
            r2 = 39
            java.lang.String r7 = androidx.work.s.e(r0, r7, r2)
            r6.<init>(r7)
            H6.l r7 = r5.f2523a
            k6.C5246y.e(r7, r6)
            return r1
        L89:
            android.view.ViewParent r6 = r6.getParent()
            boolean r0 = r6 instanceof android.view.View
            if (r0 == 0) goto L94
            android.view.View r6 = (android.view.View) r6
            goto L95
        L94:
            r6 = r1
        L95:
            if (r6 == 0) goto L9c
            N7.w2 r6 = r5.a(r6, r7)
            return r6
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I6.c.a(android.view.View, java.lang.String):N7.w2");
    }
}
