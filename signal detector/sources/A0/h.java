package A0;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallerInitializer;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f84b;

    public /* synthetic */ h(Context context, int i) {
        this.f83a = i;
        this.f84b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f83a
            switch(r0) {
                case 0: goto L93;
                case 1: goto L77;
                case 2: goto L68;
                case 3: goto Lb;
                default: goto L5;
            }
        L5:
            android.content.Context r0 = r11.f84b
            h.k.r(r0)
            return
        Lb:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto L65
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            android.content.Context r5 = r11.f84b
            r3.<init>(r5, r4)
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto L65
            if (r0 < r2) goto L3c
            java.lang.Object r0 = h.k.b()
            if (r0 == 0) goto L41
            android.os.LocaleList r0 = h.j.a(r0)
            N.h r2 = new N.h
            N.k r4 = new N.k
            r4.<init>(r0)
            r2.<init>(r4)
            goto L43
        L3c:
            N.h r2 = h.k.f20348c
            if (r2 == 0) goto L41
            goto L43
        L41:
            N.h r2 = N.h.f2965b
        L43:
            N.j r0 = r2.f2966a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5e
            java.lang.String r0 = G.c.g(r5)
            java.lang.String r2 = "locale"
            java.lang.Object r2 = r5.getSystemService(r2)
            if (r2 == 0) goto L5e
            android.os.LocaleList r0 = h.i.a(r0)
            h.j.b(r2, r0)
        L5e:
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            r0.setComponentEnabledSetting(r3, r1, r1)
        L65:
            h.k.f20351f = r1
            return
        L68:
            p.a r0 = new p.a
            r1 = 1
            r0.<init>(r1)
            G3.f r1 = A0.g.f74a
            r2 = 0
            android.content.Context r3 = r11.f84b
            A0.g.s(r3, r0, r1, r2)
            return
        L77:
            java.util.concurrent.ThreadPoolExecutor r4 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4.<init>(r5, r6, r7, r9, r10)
            A0.h r0 = new A0.h
            r1 = 2
            android.content.Context r2 = r11.f84b
            r0.<init>(r2, r1)
            r4.execute(r0)
            return
        L93:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto La2
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = A0.k.a(r0)
            goto Lab
        La2:
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
        Lab:
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 1000(0x3e8, float:1.401E-42)
            r3 = 1
            int r2 = java.lang.Math.max(r2, r3)
            int r1 = r1.nextInt(r2)
            A0.h r2 = new A0.h
            android.content.Context r4 = r11.f84b
            r2.<init>(r4, r3)
            int r1 = r1 + 5000
            long r3 = (long) r1
            r0.postDelayed(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.h.run():void");
    }

    public /* synthetic */ h(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f83a = 0;
        this.f84b = context;
    }
}
