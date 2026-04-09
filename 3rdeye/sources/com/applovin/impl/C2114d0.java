package com.applovin.impl;

import N7.G8;
import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2114d0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f19192a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f19193b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19194c;

    /* renamed from: d, reason: collision with root package name */
    private final long f19195d;

    /* renamed from: e, reason: collision with root package name */
    private final int f19196e;

    /* renamed from: f, reason: collision with root package name */
    private final int f19197f;

    /* renamed from: g, reason: collision with root package name */
    private final int f19198g;

    /* renamed from: k, reason: collision with root package name */
    private Handler f19201k;

    /* renamed from: l, reason: collision with root package name */
    private HandlerThread f19202l;

    /* renamed from: n, reason: collision with root package name */
    private c f19204n;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference f19199h = new WeakReference(null);
    private int i = 0;

    /* renamed from: j, reason: collision with root package name */
    private Integer f19200j = null;

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f19203m = new B.b(this, 15);

    /* renamed from: com.applovin.impl.d0$b */
    public class b implements PixelCopy$OnPixelCopyFinishedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f19206a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f19207b;

        public b(d dVar, Bitmap bitmap) {
            this.f19206a = dVar;
            this.f19207b = bitmap;
        }

        public void onPixelCopyFinished(int i) {
            if (i == 0) {
                this.f19206a.a(this.f19207b);
                return;
            }
            com.applovin.impl.sdk.o unused = C2114d0.this.f19193b;
            if (com.applovin.impl.sdk.o.a()) {
                C2114d0.this.f19193b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i);
            }
            this.f19206a.a(true);
        }
    }

    /* renamed from: com.applovin.impl.d0$c */
    public interface c {
        void a(View view);
    }

    /* renamed from: com.applovin.impl.d0$d */
    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z10);
    }

    public C2114d0(com.applovin.impl.sdk.k kVar) {
        this.f19192a = kVar;
        this.f19193b = kVar.O();
        this.f19194c = ((Long) kVar.a(l4.f19754H5)).longValue();
        this.f19195d = ((Long) kVar.a(l4.f19746G5)).longValue();
        this.f19196e = ((Integer) kVar.a(l4.f19762I5)).intValue();
        this.f19197f = ((Integer) kVar.a(l4.f19770J5)).intValue();
        this.f19198g = ((Integer) kVar.a(l4.f19777K5)).intValue();
    }

    public static /* synthetic */ int e(C2114d0 c2114d0) {
        int i = c2114d0.i;
        c2114d0.i = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f19204n = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        long j4 = this.f19194c;
        if (j4 <= 0) {
            if (this.i == 1) {
                e();
            }
            g();
        } else {
            if (this.i > 1) {
                e();
                g();
                return;
            }
            Handler handler = this.f19201k;
            if (handler != null) {
                handler.postDelayed(this.f19203m, j4);
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f19193b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            g();
        }
    }

    private void e() {
        View view = (View) this.f19199h.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f19193b.k("BlackViewDetector", "Detected black view: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new B.c(12, this, view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.i = 0;
        this.f19200j = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f19199h.get() != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f19193b.a("BlackViewDetector", "Stopped monitoring view: " + this.f19199h.get());
            }
            this.f19199h.clear();
        }
        Handler handler = this.f19201k;
        if (handler != null) {
            handler.removeCallbacks(this.f19203m);
            this.f19201k = null;
        }
        if (this.f19204n != null) {
            AppLovinSdkUtils.runOnUiThread(new C2.h(this, 15));
        }
    }

    public void b() {
        g();
        HandlerThread handlerThread = this.f19202l;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f19202l = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f19192a.a(l4.f19738F5)).booleanValue()) {
            View view2 = (View) this.f19199h.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f19193b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f19193b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f19202l == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f19202l = handlerThread;
                    handlerThread.start();
                } else {
                    this.f19192a.E().a(y1.f21814q0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    g();
                }
                this.f19204n = cVar;
                this.f19199h = new WeakReference(view);
                f();
                Handler handler = new Handler(this.f19202l.getLooper());
                this.f19201k = handler;
                handler.postDelayed(this.f19203m, this.f19195d);
            } catch (Throwable th) {
                g();
                this.f19192a.E().a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    /* renamed from: com.applovin.impl.d0$a */
    public class a implements d {
        public a() {
        }

        @Override // com.applovin.impl.C2114d0.d
        public void a(Bitmap bitmap) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i = width / C2114d0.this.f19196e;
                int i10 = height / C2114d0.this.f19196e;
                int i11 = i / 2;
                for (int i12 = i10 / 2; i12 < height; i12 += i10) {
                    for (int i13 = i11; i13 < width; i13 += i) {
                        int pixel = bitmap.getPixel(i13, i12);
                        if (C2114d0.this.a(pixel)) {
                            bitmap.recycle();
                            C2114d0.this.f();
                            C2114d0.this.d();
                            return;
                        }
                        if (C2114d0.this.f19200j == null) {
                            C2114d0.this.f19200j = Integer.valueOf(pixel);
                        }
                    }
                }
                C2114d0.e(C2114d0.this);
                bitmap.recycle();
                C2114d0.this.d();
            } catch (Exception e4) {
                C2114d0.this.f19192a.E().a("BlackViewDetector", "onScreenshotCaptured", e4);
                C2114d0.this.g();
            }
        }

        @Override // com.applovin.impl.C2114d0.d
        public void a(boolean z10) {
            if (z10) {
                C2114d0.this.g();
            } else {
                C2114d0.this.d();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.f19199h.get();
        if (view == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f19193b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            g();
            return;
        }
        Long l5 = (Long) this.f19192a.a(l4.f19804O5);
        if (l5.longValue() > 0 && (memoryInfoA = a7.a((ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity"))) != null && memoryInfoA.availMem < l5.longValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f19193b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f19193b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f19193b.k("BlackViewDetector", G8.r("Monitored view is not visible due to dimensions (width = ", measuredWidth, ", height = ", measuredHeight, ")"));
        }
        f();
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        c cVar = this.f19204n;
        if (cVar != null) {
            cVar.a(view);
        }
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
            java.lang.Integer r2 = r8.f19200j
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4d
            int r2 = r2.intValue()
            int r2 = android.graphics.Color.red(r2)
            java.lang.Integer r5 = r8.f19200j
            int r5 = r5.intValue()
            int r5 = android.graphics.Color.green(r5)
            java.lang.Integer r6 = r8.f19200j
            int r6 = r6.intValue()
            int r6 = android.graphics.Color.blue(r6)
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r7 = r8.f19198g
            if (r2 > r7) goto L4f
            int r2 = r1 - r5
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f19198g
            if (r2 > r5) goto L4f
            int r2 = r9 - r6
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f19198g
            if (r2 <= r5) goto L4d
            goto L4f
        L4d:
            r2 = r4
            goto L50
        L4f:
            r2 = r3
        L50:
            int r5 = r8.f19197f
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
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C2114d0.a(int):boolean");
    }

    private void a(View view, d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Activity activityA = this.f19192a.e().a();
            if (activityA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f19193b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i = iArr[0];
            int i10 = iArr[1];
            Rect rect = new Rect(i, i10, i + measuredWidth, i10 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f19193b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f19193b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
