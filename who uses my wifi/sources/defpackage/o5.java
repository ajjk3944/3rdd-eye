package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ Context g;

    public /* synthetic */ o5(Context context, int i) {
        this.f = i;
        this.g = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f
            switch(r0) {
                case 0: goto L30;
                case 1: goto L14;
                default: goto L5;
            }
        L5:
            i8 r0 = new i8
            r1 = 1
            r0.<init>(r1)
            pz r1 = defpackage.qb1.h
            r2 = 0
            android.content.Context r3 = r11.g
            defpackage.qb1.v(r3, r0, r1, r2)
            return
        L14:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            o5 r0 = new o5
            r1 = 2
            android.content.Context r2 = r11.g
            r0.<init>(r2, r1)
            r4.execute(r0)
            return
        L30:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lb2
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            android.content.Context r5 = r11.g
            r3.<init>(r5, r4)
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto Lb2
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L89
            u8 r0 = defpackage.u5.l
            r0.getClass()
            o8 r2 = new o8
            r2.<init>(r0)
        L58:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            u5 r0 = (defpackage.u5) r0
            if (r0 == 0) goto L58
            h6 r0 = (defpackage.h6) r0
            android.content.Context r0 = r0.p
            if (r0 == 0) goto L58
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L78
        L77:
            r0 = 0
        L78:
            if (r0 == 0) goto L8e
            android.os.LocaleList r0 = defpackage.q5.a(r0)
            y70 r2 = new y70
            z70 r6 = new z70
            r6.<init>(r0)
            r2.<init>(r6)
            goto L90
        L89:
            y70 r2 = defpackage.u5.h
            if (r2 == 0) goto L8e
            goto L90
        L8e:
            y70 r2 = defpackage.y70.b
        L90:
            z70 r0 = r2.a
            android.os.LocaleList r0 = r0.a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lab
            java.lang.String r0 = defpackage.um.v(r5)
            java.lang.Object r2 = r5.getSystemService(r4)
            if (r2 == 0) goto Lab
            android.os.LocaleList r0 = defpackage.p5.a(r0)
            defpackage.q5.b(r2, r0)
        Lab:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        Lb2:
            defpackage.u5.k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o5.run():void");
    }
}
