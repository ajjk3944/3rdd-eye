package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.Format;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class s implements ja.d, l6.c, n0.c, w.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5977a;

    /* renamed from: d, reason: collision with root package name */
    public int f5978d;

    /* renamed from: g, reason: collision with root package name */
    public int f5979g;

    /* renamed from: r, reason: collision with root package name */
    public final Object f5980r;

    public s(int i10, int i11, Boolean bool) {
        this.f5977a = 8;
        this.f5978d = i10;
        this.f5979g = i11;
        this.f5980r = bool;
    }

    @Override // w.g0
    public w.l E(long j, w.l lVar, w.l lVar2, w.l lVar3) {
        return ((js.e) this.f5980r).E(j, lVar, lVar2, lVar3);
    }

    @Override // w.g0
    public long L(w.l lVar, w.l lVar2, w.l lVar3) {
        return (this.f5979g + this.f5978d) * 1000000;
    }

    @Override // ja.d, l6.c
    public int a() {
        switch (this.f5977a) {
        }
        return this.f5978d;
    }

    @Override // ja.d, l6.c
    public int b() {
        switch (this.f5977a) {
        }
        return this.f5979g;
    }

    @Override // ja.d, l6.c
    public int c() {
        switch (this.f5977a) {
            case 1:
                int i10 = this.f5978d;
                return i10 == -1 ? ((fb.f) this.f5980r).r() : i10;
            default:
                int i11 = this.f5978d;
                return i11 == -1 ? ((a5.v) this.f5980r).w() : i11;
        }
    }

    @Override // n0.c
    public void d(int i10, Object obj) {
        ((n0.c) this.f5980r).d(i10 + (this.f5979g == 0 ? this.f5978d : 0), obj);
    }

    @Override // n0.c
    public void e(Object obj) {
        this.f5979g++;
        ((n0.c) this.f5980r).e(obj);
    }

    @Override // n0.c
    public void f() {
        ((n0.c) this.f5980r).f();
    }

    public Bitmap g(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Bitmap bitmap = (Bitmap) ((LinkedHashMap) this.f5980r).get(str);
                if (bitmap != null) {
                    return bitmap;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // n0.c
    public void h(int i10, int i11, int i12) {
        int i13 = this.f5979g == 0 ? this.f5978d : 0;
        ((n0.c) this.f5980r).h(i10 + i13, i11 + i13, i12);
    }

    @Override // n0.c
    public void i(int i10, int i11) {
        ((n0.c) this.f5980r).i(i10 + (this.f5979g == 0 ? this.f5978d : 0), i11);
    }

    public int j() {
        if (this.f5979g == 0) {
            m();
        }
        ch.n.b("ScreenInfo", "height: " + this.f5979g);
        return this.f5979g;
    }

    @Override // n0.c
    public void k() {
        if (!(this.f5979g > 0)) {
            n0.q.c("OffsetApplier up called with no corresponding down");
        }
        this.f5979g--;
        ((n0.c) this.f5980r).k();
    }

    public int l() {
        if (this.f5978d == 0) {
            m();
        }
        ch.n.b("ScreenInfo", "width: " + this.f5978d);
        return this.f5978d;
    }

    public void m() {
        ch.n.b("ScreenInfo", "initializeScreenInfo()");
        try {
            Display defaultDisplay = ((WindowManager) this.f5980r).getDefaultDisplay();
            defaultDisplay.getMetrics(new DisplayMetrics());
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int i10 = point.x;
            int i11 = point.y;
            this.f5978d = i10 < i11 ? i11 : i10;
            if (i10 > i11) {
                i10 = i11;
            }
            this.f5979g = i10;
        } catch (Exception unused) {
            this.f5978d = 0;
            this.f5979g = 0;
        }
    }

    @Override // n0.c
    public void o(ar.n nVar, Object obj) {
        ((n0.c) this.f5980r).o(nVar, obj);
    }

    @Override // n0.c
    public void p(int i10, Object obj) {
        ((n0.c) this.f5980r).p(i10 + (this.f5979g == 0 ? this.f5978d : 0), obj);
    }

    @Override // n0.c
    public Object r() {
        return ((n0.c) this.f5980r).r();
    }

    public synchronized int s() {
        PackageInfo packageInfoC;
        if (this.f5978d == 0) {
            try {
                packageInfoC = ic.c.a((Context) this.f5980r).c(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e4) {
                io.sentry.android.core.e0.p("Metadata", "Failed to find package ".concat(e4.toString()));
                packageInfoC = null;
            }
            if (packageInfoC != null) {
                this.f5978d = packageInfoC.versionCode;
            }
        }
        return this.f5978d;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0025, B:14:0x0030, B:16:0x0037, B:18:0x0049, B:26:0x006a, B:21:0x0050, B:23:0x0063, B:29:0x006e, B:33:0x007d), top: B:38:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized int t() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f5979g     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L7
            monitor-exit(r5)
            return r0
        L7:
            java.lang.Object r0 = r5.f5980r     // Catch: java.lang.Throwable -> L2e
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L2e
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L2e
            ic.b r0 = ic.c.a(r0)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r3 = "com.google.android.gms"
            android.content.Context r0 = r0.f11323a     // Catch: java.lang.Throwable -> L2e
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L2e
            int r0 = r0.checkPermission(r2, r3)     // Catch: java.lang.Throwable -> L2e
            r2 = -1
            r3 = 0
            if (r0 != r2) goto L30
            java.lang.String r0 = "Metadata"
            java.lang.String r1 = "Google Play services missing or without correct permission."
            io.sentry.android.core.e0.d(r0, r1)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r5)
            return r3
        L2e:
            r0 = move-exception
            goto L81
        L30:
            boolean r0 = gc.b.e()     // Catch: java.lang.Throwable -> L2e
            r2 = 1
            if (r0 != 0) goto L50
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L2e
            java.util.List r0 = r1.queryIntentServices(r0, r3)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L50
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L50
            goto L6a
        L50:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = "com.google.android.gms"
            r0.setPackage(r4)     // Catch: java.lang.Throwable -> L2e
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r3)     // Catch: java.lang.Throwable -> L2e
            r1 = 2
            if (r0 == 0) goto L6e
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L6e
            r2 = r1
        L6a:
            r5.f5979g = r2     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r5)
            return r2
        L6e:
            java.lang.String r0 = "Metadata"
            java.lang.String r3 = "Failed to resolve IID implementation package, falling back"
            io.sentry.android.core.e0.p(r0, r3)     // Catch: java.lang.Throwable -> L2e
            boolean r0 = gc.b.e()     // Catch: java.lang.Throwable -> L2e
            if (r2 == r0) goto L7c
            goto L7d
        L7c:
            r2 = r1
        L7d:
            r5.f5979g = r2     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r5)
            return r2
        L81:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.s.t():int");
    }

    @Override // w.g0
    public w.l v(long j, w.l lVar, w.l lVar2, w.l lVar3) {
        return ((js.e) this.f5980r).v(j, lVar, lVar2, lVar3);
    }

    public s(WindowManager windowManager) {
        this.f5977a = 2;
        br.l.e(windowManager, "windowManager");
        this.f5980r = windowManager;
    }

    public s() {
        this.f5977a = 5;
        this.f5980r = new s[256];
        this.f5978d = 0;
        this.f5979g = 0;
    }

    public s(int i10, int i11) {
        this.f5977a = 5;
        this.f5980r = null;
        this.f5978d = i10;
        int i12 = i11 & 7;
        this.f5979g = i12 == 0 ? 8 : i12;
    }

    public s(n0.c cVar, int i10) {
        this.f5977a = 4;
        this.f5980r = cVar;
        this.f5978d = i10;
    }

    public s(Context context, int i10) {
        this.f5977a = i10;
        switch (i10) {
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                this.f5979g = 0;
                this.f5980r = context;
                return;
            default:
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                int largeMemoryClass = (((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7;
                if (largeMemoryClass > 0) {
                    this.f5978d = largeMemoryClass;
                    this.f5980r = new LinkedHashMap(0, 0.75f, true);
                    return;
                }
                throw new IllegalArgumentException("Max size must be positive.");
        }
    }

    public s(int i10, int i11, w.o oVar) {
        this.f5977a = 6;
        this.f5978d = i10;
        this.f5979g = i11;
        this.f5980r = new js.e(new w.r(i10, i11, oVar));
    }

    public s(ja.b bVar, Format format) {
        this.f5977a = 1;
        fb.f fVar = bVar.f13433g;
        this.f5980r = fVar;
        fVar.y(12);
        int iR = fVar.r();
        if ("audio/raw".equals(format.H)) {
            int iU = qb.v.u(format.W, format.U);
            if (iR == 0 || iR % iU != 0) {
                StringBuilder sb2 = new StringBuilder(88);
                sb2.append("Audio sample size mismatch. stsd sample size: ");
                sb2.append(iU);
                sb2.append(", stsz sample size: ");
                sb2.append(iR);
                io.sentry.android.core.e0.p("AtomParsers", sb2.toString());
                iR = iU;
            }
        }
        this.f5978d = iR == 0 ? -1 : iR;
        this.f5979g = fVar.r();
    }

    public s(l6.b bVar, androidx.media3.common.r rVar) {
        this.f5977a = 3;
        a5.v vVar = bVar.f14779g;
        this.f5980r = vVar;
        vVar.E(12);
        int iW = vVar.w();
        if ("audio/raw".equals(rVar.H)) {
            int iW2 = a5.d0.w(rVar.W, rVar.U);
            if (iW == 0 || iW % iW2 != 0) {
                a5.a.B("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iW2 + ", stsz sample size: " + iW);
                iW = iW2;
            }
        }
        this.f5978d = iW == 0 ? -1 : iW;
        this.f5979g = vVar.w();
    }
}
