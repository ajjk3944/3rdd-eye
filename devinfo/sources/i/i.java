package i;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f25304b;

    public /* synthetic */ i(Context context, int i4) {
        this.f25303a = i4;
        this.f25304b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f25303a
            switch(r0) {
                case 0: goto L3f;
                case 1: goto L30;
                case 2: goto L14;
                default: goto L5;
            }
        L5:
            com.applovin.impl.da r0 = new com.applovin.impl.da
            r1 = 1
            r0.<init>(r1)
            ja.c r1 = r5.e.f32817a
            r2 = 0
            android.content.Context r3 = r11.f25304b
            r5.e.t(r3, r0, r1, r2)
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
            i.i r0 = new i.i
            r1 = 3
            android.content.Context r2 = r11.f25304b
            r0.<init>(r2, r1)
            r4.execute(r0)
            return
        L30:
            android.content.Context r0 = r11.f25304b
            pi.d r1 = new pi.d     // Catch: java.lang.Exception -> L3b
            r1.<init>()     // Catch: java.lang.Exception -> L3b
            com.google.android.gms.ads.MobileAds.a(r0, r1)     // Catch: java.lang.Exception -> L3b
            goto L3e
        L3b:
            r0 = 1
            ci.b.f2887i = r0
        L3e:
            return
        L3f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lbf
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            android.content.Context r5 = r11.f25304b
            r3.<init>(r5, r4)
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto Lbf
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L98
            x.f r0 = i.l.g
            r0.getClass()
            x.a r2 = new x.a
            r2.<init>(r0)
        L67:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            i.l r0 = (i.l) r0
            if (r0 == 0) goto L67
            i.v r0 = (i.v) r0
            android.content.Context r0 = r0.f25374k
            if (r0 == 0) goto L67
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L87
        L86:
            r0 = 0
        L87:
            if (r0 == 0) goto L9d
            android.os.LocaleList r0 = i.k.a(r0)
            a4.h r2 = new a4.h
            a4.k r6 = new a4.k
            r6.<init>(r0)
            r2.<init>(r6)
            goto L9f
        L98:
            a4.h r2 = i.l.f25330c
            if (r2 == 0) goto L9d
            goto L9f
        L9d:
            a4.h r2 = a4.h.f192b
        L9f:
            a4.j r0 = r2.f193a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb8
            java.lang.String r0 = r3.e.e(r5)
            java.lang.Object r2 = r5.getSystemService(r4)
            if (r2 == 0) goto Lb8
            android.os.LocaleList r0 = i.j.a(r0)
            i.k.b(r2, r0)
        Lb8:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        Lbf:
            i.l.f25333f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.i.run():void");
    }
}
