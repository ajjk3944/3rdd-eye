package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class g10 {

    /* renamed from: a, reason: collision with root package name */
    private final ct1 f27516a;

    /* renamed from: b, reason: collision with root package name */
    private final lt1 f27517b;

    public /* synthetic */ g10() {
        this(new ct1());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r7.getCurrentModeType() == 4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (r7.getPackageManager().hasSystemFeature("android.hardware.touchscreen") == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.f10 a(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.l.f(r7, r0)
            android.content.res.Resources r0 = r7.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            com.yandex.mobile.ads.impl.lt1 r1 = r6.f27517b
            android.graphics.Point r1 = r1.a(r7)
            int r2 = r1.x
            int r1 = r1.y
            float r0 = r0.density
            float r2 = (float) r2
            float r3 = r2 / r0
            float r1 = (float) r1
            float r4 = r1 / r0
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L24
            r3 = r4
        L24:
            r4 = 160(0xa0, float:2.24E-43)
            float r4 = (float) r4
            float r0 = r0 * r4
            float r2 = r2 / r0
            float r1 = r1 / r0
            float r2 = r2 * r2
            float r1 = r1 * r1
            float r1 = r1 + r2
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            r2 = 13
            boolean r2 = com.yandex.mobile.ads.impl.ba.a(r2)
            if (r2 == 0) goto L52
            java.lang.String r2 = "uimode"
            java.lang.Object r7 = r7.getSystemService(r2)
            boolean r2 = r7 instanceof android.app.UiModeManager
            if (r2 == 0) goto L47
            android.app.UiModeManager r7 = (android.app.UiModeManager) r7
            goto L48
        L47:
            r7 = 0
        L48:
            if (r7 == 0) goto L73
            int r7 = r7.getCurrentModeType()
            r2 = 4
            if (r7 != r2) goto L73
            goto L70
        L52:
            r4 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L73
            com.yandex.mobile.ads.impl.ct1 r2 = r6.f27516a
            java.lang.String r4 = "android.hardware.touchscreen"
            r2.getClass()
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch: java.lang.Throwable -> L6a
            boolean r7 = r7.hasSystemFeature(r4)     // Catch: java.lang.Throwable -> L6a
            if (r7 != 0) goto L73
            goto L70
        L6a:
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.yandex.mobile.ads.impl.fp0.c(r7)
        L70:
            com.yandex.mobile.ads.impl.f10 r7 = com.yandex.mobile.ads.impl.f10.f27168d
            return r7
        L73:
            r4 = 4619567317775286272(0x401c000000000000, double:7.0)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 >= 0) goto L83
            r7 = 1142292480(0x44160000, float:600.0)
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 < 0) goto L80
            goto L83
        L80:
            com.yandex.mobile.ads.impl.f10 r7 = com.yandex.mobile.ads.impl.f10.f27166b
            return r7
        L83:
            com.yandex.mobile.ads.impl.f10 r7 = com.yandex.mobile.ads.impl.f10.f27167c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.g10.a(android.content.Context):com.yandex.mobile.ads.impl.f10");
    }

    public g10(ct1 safePackageManager) {
        kotlin.jvm.internal.l.f(safePackageManager, "safePackageManager");
        this.f27516a = safePackageManager;
        this.f27517b = new lt1();
    }
}
