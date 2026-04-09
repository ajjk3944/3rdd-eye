package com.yandex.mobile.ads.common;

import android.content.res.Configuration;
import c.ActivityC2008f;
import com.yandex.mobile.ads.impl.C4229x0;
import com.yandex.mobile.ads.impl.pe1;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class AdActivity extends ActivityC2008f {

    /* renamed from: a, reason: collision with root package name */
    private pe1 f23949a;

    /* renamed from: b, reason: collision with root package name */
    private C4229x0 f23950b;

    @Override // c.ActivityC2008f, android.app.Activity
    public final void onBackPressed() {
        C4229x0 c4229x0 = this.f23950b;
        if (c4229x0 == null || c4229x0.c()) {
            super.onBackPressed();
        }
    }

    @Override // c.ActivityC2008f, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration config) {
        l.f(config, "config");
        super.onConfigurationChanged(config);
        C4229x0 c4229x0 = this.f23950b;
        if (c4229x0 != null) {
            c4229x0.a(config);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @Override // c.ActivityC2008f, y0.h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            java.lang.String r0 = "data_identifier"
            super.onCreate(r13)
            com.yandex.mobile.ads.impl.a1 r5 = new com.yandex.mobile.ads.impl.a1
            r5.<init>(r12)
            android.widget.RelativeLayout r3 = new android.widget.RelativeLayout
            r3.<init>(r12)
            android.content.Intent r6 = r12.getIntent()
            r13 = 0
            if (r6 != 0) goto L18
            r4 = r13
            goto L6b
        L18:
            android.view.Window r7 = r12.getWindow()
            com.yandex.mobile.ads.impl.z0 r1 = com.yandex.mobile.ads.impl.C4242z0.a.a()
            r2 = 0
            boolean r4 = r6.hasExtra(r0)     // Catch: java.lang.Exception -> L37
            if (r4 == 0) goto L35
            r8 = -1
            long r10 = r6.getLongExtra(r0, r8)     // Catch: java.lang.Exception -> L37
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Exception -> L37
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 != 0) goto L3d
        L35:
            r0 = r13
            goto L3d
        L37:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.yandex.mobile.ads.impl.fp0.b(r0)
            goto L35
        L3d:
            if (r0 == 0) goto L49
            long r8 = r0.longValue()
            com.yandex.mobile.ads.impl.y0 r0 = r1.a(r8)
            r8 = r0
            goto L4a
        L49:
            r8 = r13
        L4a:
            if (r8 == 0) goto L56
            com.yandex.mobile.ads.impl.f8 r0 = r8.d()     // Catch: java.lang.Exception -> L51
            goto L57
        L51:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.yandex.mobile.ads.impl.fp0.b(r0)
        L56:
            r0 = r13
        L57:
            com.yandex.mobile.ads.impl.r1 r4 = new com.yandex.mobile.ads.impl.r1
            r4.<init>(r12, r0)
            com.yandex.mobile.ads.impl.k1$a r0 = com.yandex.mobile.ads.impl.C4140k1.f29460b
            com.yandex.mobile.ads.impl.k1 r1 = r0.a()
            kotlin.jvm.internal.l.c(r7)
            r2 = r12
            com.yandex.mobile.ads.impl.i1 r0 = r1.a(r2, r3, r4, r5, r6, r7, r8)
            r4 = r0
        L6b:
            if (r4 == 0) goto L79
            com.yandex.mobile.ads.impl.x0 r1 = new com.yandex.mobile.ads.impl.x0
            com.yandex.mobile.ads.impl.hh2 r6 = new com.yandex.mobile.ads.impl.hh2
            r6.<init>()
            r2 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            goto L7b
        L79:
            r2 = r12
            r1 = r13
        L7b:
            r2.f23950b = r1
            if (r1 == 0) goto L84
            r1.b()
            b9.A r13 = b9.C1992A.f18074a
        L84:
            if (r13 != 0) goto L89
            r12.finish()
        L89:
            com.yandex.mobile.ads.impl.se1 r13 = new com.yandex.mobile.ads.impl.se1
            r13.<init>()
            com.yandex.mobile.ads.impl.x0 r13 = r2.f23950b
            com.yandex.mobile.ads.impl.pe1 r13 = com.yandex.mobile.ads.impl.se1.a(r12, r13)
            r2.f23949a = r13
            if (r13 == 0) goto L9b
            r13.a()
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.common.AdActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C4229x0 c4229x0 = this.f23950b;
        if (c4229x0 != null) {
            c4229x0.a();
        }
        pe1 pe1Var = this.f23949a;
        if (pe1Var != null) {
            pe1Var.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        C4229x0 c4229x0 = this.f23950b;
        if (c4229x0 != null) {
            c4229x0.d();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        C4229x0 c4229x0 = this.f23950b;
        if (c4229x0 != null) {
            c4229x0.e();
        }
    }
}
