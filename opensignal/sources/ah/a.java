package ah;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f364a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f365d;

    public /* synthetic */ a(Context context, int i10) {
        this.f364a = i10;
        this.f365d = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f364a
            switch(r0) {
                case 0: goto Lcc;
                case 1: goto Lb0;
                case 2: goto La1;
                case 3: goto L1c;
                default: goto L5;
            }
        L5:
            ch.l r0 = ch.l.f3962t5
            r0.k()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "EXECUTION_TYPE"
            cj.e r2 = cj.e.RESCHEDULE_TASKS
            ic.a.F(r0, r1, r2)
            android.content.Context r1 = r11.f365d
            cj.t.a(r1, r0)
            return
        L1c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L9e
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            android.content.Context r5 = r11.f365d
            r3.<init>(r5, r4)
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto L9e
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L75
            u.f r0 = i.o.B
            r0.getClass()
            u.a r2 = new u.a
            r2.<init>(r0)
        L44:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            i.o r0 = (i.o) r0
            if (r0 == 0) goto L44
            i.a0 r0 = (i.a0) r0
            android.content.Context r0 = r0.G
            if (r0 == 0) goto L44
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L64
        L63:
            r0 = 0
        L64:
            if (r0 == 0) goto L7a
            android.os.LocaleList r0 = i.m.a(r0)
            p3.d r2 = new p3.d
            p3.e r6 = new p3.e
            r6.<init>(r0)
            r2.<init>(r6)
            goto L7c
        L75:
            p3.d r2 = i.o.f11101g
            if (r2 == 0) goto L7a
            goto L7c
        L7a:
            p3.d r2 = p3.d.f20244b
        L7c:
            p3.e r0 = r2.f20245a
            android.os.LocaleList r0 = r0.f20246a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L97
            java.lang.String r0 = g3.e.e(r5)
            java.lang.Object r2 = r5.getSystemService(r4)
            if (r2 == 0) goto L97
            android.os.LocaleList r0 = i.l.a(r0)
            i.m.b(r2, r0)
        L97:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L9e:
            i.o.f11104y = r1
            return
        La1:
            e7.d r0 = new e7.d
            r1 = 0
            r0.<init>(r1)
            ee.f r1 = f7.e.f8653a
            r2 = 0
            android.content.Context r3 = r11.f365d
            f7.e.t(r3, r0, r1, r2)
            return
        Lb0:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            ah.a r0 = new ah.a
            r1 = 2
            android.content.Context r2 = r11.f365d
            r0.<init>(r2, r1)
            r4.execute(r0)
            return
        Lcc:
            android.content.Context r0 = r11.f365d
            java.lang.String r1 = "manual_core_assistant"
            cj.t.c(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.a.run():void");
    }
}
