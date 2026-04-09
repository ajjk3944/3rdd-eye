package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f6104a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f6105b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6106c;

    /* renamed from: d, reason: collision with root package name */
    private final long f6107d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6108e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6109f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6110g;

    /* renamed from: h, reason: collision with root package name */
    private final int f6111h;

    /* renamed from: i, reason: collision with root package name */
    private final int f6112i;

    /* renamed from: k, reason: collision with root package name */
    private int f6114k;

    /* renamed from: l, reason: collision with root package name */
    private int f6115l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f6116m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f6117n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f6118o;

    /* renamed from: p, reason: collision with root package name */
    private Handler f6119p;

    /* renamed from: q, reason: collision with root package name */
    private HandlerThread f6120q;

    /* renamed from: s, reason: collision with root package name */
    private c f6122s;

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f6113j = new WeakReference(null);

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f6121r = new Runnable() { // from class: com.applovin.impl.za
        @Override // java.lang.Runnable
        public final void run() {
            this.f8817a.a();
        }
    };

    public class b implements PixelCopy$OnPixelCopyFinishedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f6124a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f6125b;

        public b(d dVar, Bitmap bitmap) {
            this.f6124a = dVar;
            this.f6125b = bitmap;
        }

        public void onPixelCopyFinished(int i10) {
            if (i10 == 0) {
                this.f6124a.a(this.f6125b);
                return;
            }
            com.applovin.impl.sdk.o unused = h0.this.f6105b;
            if (com.applovin.impl.sdk.o.a()) {
                h0.this.f6105b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i10);
            }
            this.f6124a.a(true);
        }
    }

    public interface c {
        void a(int i10, int i11);

        void a(int i10, int i11, int i12);
    }

    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z10);
    }

    public h0(com.applovin.impl.sdk.k kVar) {
        this.f6104a = kVar;
        this.f6105b = kVar.O();
        this.f6106c = ((Long) kVar.a(x4.f8502j6)).longValue();
        this.f6107d = ((Long) kVar.a(x4.f8493i6)).longValue();
        this.f6110g = ((Integer) kVar.a(x4.f8511k6)).intValue();
        this.f6111h = ((Integer) kVar.a(x4.f8520l6)).intValue();
        this.f6112i = ((Integer) kVar.a(x4.f8529m6)).intValue();
        this.f6108e = ((Integer) kVar.a(x4.f8577s6)).intValue();
        this.f6109f = ((Integer) kVar.a(x4.f8585t6)).intValue();
    }

    public static /* synthetic */ int a(h0 h0Var) {
        int i10 = h0Var.f6115l;
        h0Var.f6115l = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int f(h0 h0Var) {
        int i10 = h0Var.f6114k;
        h0Var.f6114k = i10 + 1;
        return i10;
    }

    private void c() {
        if (this.f6114k >= this.f6109f && !this.f6118o) {
            this.f6118o = true;
            h();
        }
        if (this.f6114k < this.f6108e || this.f6117n) {
            return;
        }
        this.f6117n = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.f6122s;
        if (cVar != null) {
            cVar.a(this.f6108e, this.f6114k, this.f6115l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        c cVar = this.f6122s;
        if (cVar != null) {
            cVar.a(this.f6114k, this.f6115l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f6122s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f6106c <= 0) {
            if (this.f6114k == 1) {
                if (!this.f6118o) {
                    this.f6118o = true;
                    h();
                }
                if (!this.f6117n) {
                    this.f6117n = true;
                    i();
                }
            }
            k();
            return;
        }
        c();
        if (this.f6119p == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6105b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            k();
        } else if (this.f6117n && this.f6118o) {
            k();
        } else {
            this.f6119p.postDelayed(this.f6121r, this.f6106c);
        }
    }

    private void h() {
        View view = (View) this.f6113j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6105b.k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ab
            @Override // java.lang.Runnable
            public final void run() {
                this.f5400a.d();
            }
        });
    }

    private void i() {
        View view = (View) this.f6113j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f6105b.k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.xa
            @Override // java.lang.Runnable
            public final void run() {
                this.f8641a.e();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f6114k = 0;
        this.f6116m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.f6113j.get() != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6105b.a("BlackViewDetector", "Stopped monitoring view: " + this.f6113j.get());
            }
            this.f6113j.clear();
        }
        Handler handler = this.f6119p;
        if (handler != null) {
            handler.removeCallbacks(this.f6121r);
            this.f6119p = null;
        }
        if (this.f6122s != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.ya
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8720a.f();
                }
            });
        }
    }

    public void b() {
        k();
        HandlerThread handlerThread = this.f6120q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f6120q = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f6104a.a(x4.f8484h6)).booleanValue()) {
            View view2 = (View) this.f6113j.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6105b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f6105b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f6120q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f6120q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f6104a.D().a(d2.L0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    k();
                }
                this.f6122s = cVar;
                this.f6113j = new WeakReference(view);
                j();
                this.f6117n = false;
                this.f6118o = false;
                Handler handler = new Handler(this.f6120q.getLooper());
                this.f6119p = handler;
                handler.postDelayed(this.f6121r, this.f6107d);
            } catch (Throwable th) {
                k();
                this.f6104a.D().a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    public class a implements d {
        public a() {
        }

        @Override // com.applovin.impl.h0.d
        public void a(Bitmap bitmap) {
            try {
                h0.a(h0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i10 = width / h0.this.f6110g;
                int i11 = height / h0.this.f6110g;
                int i12 = i10 / 2;
                for (int i13 = i11 / 2; i13 < height; i13 += i11) {
                    for (int i14 = i12; i14 < width; i14 += i10) {
                        int pixel = bitmap.getPixel(i14, i13);
                        if (h0.this.a(pixel)) {
                            bitmap.recycle();
                            h0.this.j();
                            h0.this.g();
                            return;
                        }
                        if (h0.this.f6116m == null) {
                            h0.this.f6116m = Integer.valueOf(pixel);
                        }
                    }
                }
                h0.f(h0.this);
                bitmap.recycle();
                h0.this.g();
            } catch (Exception e10) {
                h0.this.f6104a.D().a("BlackViewDetector", "onScreenshotCaptured", e10);
                h0.this.k();
            }
        }

        @Override // com.applovin.impl.h0.d
        public void a(boolean z10) {
            if (z10) {
                h0.this.k();
            } else {
                h0.this.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.f6113j.get();
        if (view == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6105b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            k();
            return;
        }
        Long l10 = (Long) this.f6104a.a(x4.f8561q6);
        if (l10.longValue() > 0 && (memoryInfoA = n7.a((ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity"))) != null && memoryInfoA.availMem < l10.longValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6105b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (this.f6104a.m0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f6105b.a("BlackViewDetector", "App is backgrounded - skipping black view detection");
            }
            j();
            g();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6105b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6105b.k("BlackViewDetector", "Monitored view is not visible due to dimensions (width = " + measuredWidth + ", height = " + measuredHeight + ")");
        }
        j();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(int r9) {
        /*
            r8 = this;
            int r0 = android.graphics.Color.red(r9)
            int r1 = android.graphics.Color.green(r9)
            int r9 = android.graphics.Color.blue(r9)
            java.lang.Integer r2 = r8.f6116m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4d
            int r2 = r2.intValue()
            int r2 = android.graphics.Color.red(r2)
            java.lang.Integer r5 = r8.f6116m
            int r5 = r5.intValue()
            int r5 = android.graphics.Color.green(r5)
            java.lang.Integer r6 = r8.f6116m
            int r6 = r6.intValue()
            int r6 = android.graphics.Color.blue(r6)
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r7 = r8.f6112i
            if (r2 > r7) goto L4f
            int r2 = r1 - r5
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f6112i
            if (r2 > r5) goto L4f
            int r2 = r9 - r6
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f6112i
            if (r2 <= r5) goto L4d
            goto L4f
        L4d:
            r2 = r4
            goto L50
        L4f:
            r2 = r3
        L50:
            int r5 = r8.f6111h
            if (r0 > r5) goto L5c
            if (r1 > r5) goto L5c
            if (r9 > r5) goto L5c
            if (r2 == 0) goto L5b
            goto L5c
        L5b:
            return r4
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h0.a(int):boolean");
    }

    private void a(View view, d dVar) {
        if (o0.g()) {
            Activity activityA = this.f6104a.e().a();
            if (activityA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6105b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            Rect rect = new Rect(i10, i11, i10 + measuredWidth, i11 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f6105b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f6105b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
