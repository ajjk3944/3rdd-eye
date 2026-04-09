package k6;

/* compiled from: DivActionTypedFocusElementHandler.kt */
/* renamed from: k6.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5233l implements InterfaceC5234m {
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[PHI: r4
  0x0075: PHI (r4v3 android.view.View) = (r4v2 android.view.View), (r4v13 android.view.View) binds: [B:5:0x001b, B:19:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // k6.InterfaceC5234m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r3, N7.AbstractC1192h2 r4, H6.C0675l r5, A7.d r6) {
        /*
            r2 = this;
            java.lang.String r3 = "action"
            kotlin.jvm.internal.l.f(r4, r3)
            boolean r3 = r4 instanceof N7.AbstractC1192h2.j
            if (r3 == 0) goto L98
            N7.h2$j r4 = (N7.AbstractC1192h2.j) r4
            N7.d1 r3 = r4.f8328b
            A7.b<java.lang.String> r3 = r3.f8048a
            java.lang.Object r3 = r3.a(r6)
            java.lang.String r3 = (java.lang.String) r3
            android.view.View r4 = r5.findViewWithTag(r3)
            r6 = 0
            r0 = 1
            if (r4 != 0) goto L75
            com.yandex.div.core.dagger.Div2ViewComponent r4 = r5.getViewComponent$div_release()
            B6.k r4 = r4.j()
            java.lang.String r5 = "id"
            kotlin.jvm.internal.l.f(r3, r5)
            java.util.LinkedHashMap r4 = r4.f557h
            java.util.Set r4 = r4.entrySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L3b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            B6.q r1 = (B6.q) r1
            C6.k r1 = r1.f569d
            android.view.View r1 = r1.getContentView()
            if (r1 == 0) goto L3b
            r5.add(r1)
            goto L3b
        L59:
            java.util.Iterator r4 = r5.iterator()
        L5d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L71
            java.lang.Object r5 = r4.next()
            android.view.View r5 = (android.view.View) r5
            android.view.View r5 = r5.findViewWithTag(r3)
            if (r5 == 0) goto L5d
            r4 = r5
            goto L72
        L71:
            r4 = r6
        L72:
            if (r4 != 0) goto L75
            goto L97
        L75:
            r4.requestFocus()
            r3 = 64
            r4.performAccessibilityAction(r3, r6)
            r4.sendAccessibilityEvent(r0)
            boolean r3 = r4 instanceof O6.p
            if (r3 == 0) goto L97
            O6.p r4 = (O6.p) r4
            android.content.Context r3 = r4.getContext()
            java.lang.Class<android.view.inputmethod.InputMethodManager> r5 = android.view.inputmethod.InputMethodManager.class
            java.lang.Object r3 = z0.C5848a.getSystemService(r3, r5)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            if (r3 == 0) goto L97
            r3.showSoftInput(r4, r0)
        L97:
            return r0
        L98:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.C5233l.a(java.lang.String, N7.h2, H6.l, A7.d):boolean");
    }
}
