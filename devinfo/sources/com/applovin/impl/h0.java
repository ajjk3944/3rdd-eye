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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f4189a;

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f4190b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4191c;

    /* renamed from: d, reason: collision with root package name */
    private final long f4192d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4193e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4194f;
    private final int g;

    /* renamed from: h, reason: collision with root package name */
    private final int f4195h;

    /* renamed from: i, reason: collision with root package name */
    private final int f4196i;

    /* renamed from: k, reason: collision with root package name */
    private int f4197k;

    /* renamed from: l, reason: collision with root package name */
    private int f4198l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f4199m;

    /* renamed from: n, reason: collision with root package name */
    private volatile boolean f4200n;

    /* renamed from: o, reason: collision with root package name */
    private volatile boolean f4201o;

    /* renamed from: p, reason: collision with root package name */
    private Handler f4202p;

    /* renamed from: q, reason: collision with root package name */
    private HandlerThread f4203q;

    /* renamed from: s, reason: collision with root package name */
    private c f4205s;
    private WeakReference j = new WeakReference(null);

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f4204r = new l9(this, 2);

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class b implements PixelCopy$OnPixelCopyFinishedListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f4207a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Bitmap f4208b;

        public b(d dVar, Bitmap bitmap) {
            this.f4207a = dVar;
            this.f4208b = bitmap;
        }

        public void onPixelCopyFinished(int i4) {
            if (i4 == 0) {
                this.f4207a.a(this.f4208b);
                return;
            }
            com.applovin.impl.sdk.o unused = h0.this.f4190b;
            if (com.applovin.impl.sdk.o.a()) {
                h0.this.f4190b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i4);
            }
            this.f4207a.a(true);
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface c {
        void a(int i4, int i10);

        void a(int i4, int i10, int i11);
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z3);
    }

    public h0(com.applovin.impl.sdk.k kVar) {
        this.f4189a = kVar;
        this.f4190b = kVar.O();
        this.f4191c = ((Long) kVar.a(x4.f6067j6)).longValue();
        this.f4192d = ((Long) kVar.a(x4.f6059i6)).longValue();
        this.g = ((Integer) kVar.a(x4.f6075k6)).intValue();
        this.f4195h = ((Integer) kVar.a(x4.f6084l6)).intValue();
        this.f4196i = ((Integer) kVar.a(x4.m6)).intValue();
        this.f4193e = ((Integer) kVar.a(x4.f6137s6)).intValue();
        this.f4194f = ((Integer) kVar.a(x4.f6145t6)).intValue();
    }

    public static /* synthetic */ int a(h0 h0Var) {
        int i4 = h0Var.f4198l;
        h0Var.f4198l = i4 + 1;
        return i4;
    }

    public static /* synthetic */ int f(h0 h0Var) {
        int i4 = h0Var.f4197k;
        h0Var.f4197k = i4 + 1;
        return i4;
    }

    private void c() {
        if (this.f4197k >= this.f4194f && !this.f4201o) {
            this.f4201o = true;
            h();
        }
        if (this.f4197k < this.f4193e || this.f4200n) {
            return;
        }
        this.f4200n = true;
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        c cVar = this.f4205s;
        if (cVar != null) {
            cVar.a(this.f4193e, this.f4197k, this.f4198l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        c cVar = this.f4205s;
        if (cVar != null) {
            cVar.a(this.f4197k, this.f4198l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f4205s = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f4191c <= 0) {
            if (this.f4197k == 1) {
                if (!this.f4201o) {
                    this.f4201o = true;
                    h();
                }
                if (!this.f4200n) {
                    this.f4200n = true;
                    i();
                }
            }
            k();
            return;
        }
        c();
        if (this.f4202p == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4190b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            k();
        } else if (this.f4200n && this.f4201o) {
            k();
        } else {
            this.f4202p.postDelayed(this.f4204r, this.f4191c);
        }
    }

    private void h() {
        View view = (View) this.j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4190b.k("BlackViewDetector", "Notifying black view confirmed: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new l9(this, 3));
    }

    private void i() {
        View view = (View) this.j.get();
        if (com.applovin.impl.sdk.o.a()) {
            this.f4190b.k("BlackViewDetector", "Notifying black view detected: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new l9(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f4197k = 0;
        this.f4199m = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (this.j.get() != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4190b.a("BlackViewDetector", "Stopped monitoring view: " + this.j.get());
            }
            this.j.clear();
        }
        Handler handler = this.f4202p;
        if (handler != null) {
            handler.removeCallbacks(this.f4204r);
            this.f4202p = null;
        }
        if (this.f4205s != null) {
            AppLovinSdkUtils.runOnUiThread(new l9(this, 1));
        }
    }

    public void b() {
        k();
        HandlerThread handlerThread = this.f4203q;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f4203q = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f4189a.a(x4.f6051h6)).booleanValue()) {
            View view2 = (View) this.j.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4190b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f4190b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f4203q == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f4203q = handlerThread;
                    handlerThread.start();
                } else {
                    this.f4189a.D().a(d2.L0, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    k();
                }
                this.f4205s = cVar;
                this.j = new WeakReference(view);
                j();
                this.f4200n = false;
                this.f4201o = false;
                Handler handler = new Handler(this.f4203q.getLooper());
                this.f4202p = handler;
                handler.postDelayed(this.f4204r, this.f4192d);
            } catch (Throwable th2) {
                k();
                this.f4189a.D().a("BlackViewDetector", "maybeStartMonitoring", th2);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements d {
        public a() {
        }

        @Override // com.applovin.impl.h0.d
        public void a(Bitmap bitmap) {
            try {
                h0.a(h0.this);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i4 = width / h0.this.g;
                int i10 = height / h0.this.g;
                int i11 = i4 / 2;
                for (int i12 = i10 / 2; i12 < height; i12 += i10) {
                    for (int i13 = i11; i13 < width; i13 += i4) {
                        int pixel = bitmap.getPixel(i13, i12);
                        if (h0.this.a(pixel)) {
                            bitmap.recycle();
                            h0.this.j();
                            h0.this.g();
                            return;
                        }
                        if (h0.this.f4199m == null) {
                            h0.this.f4199m = Integer.valueOf(pixel);
                        }
                    }
                }
                h0.f(h0.this);
                bitmap.recycle();
                h0.this.g();
            } catch (Exception e2) {
                h0.this.f4189a.D().a("BlackViewDetector", "onScreenshotCaptured", e2);
                h0.this.k();
            }
        }

        @Override // com.applovin.impl.h0.d
        public void a(boolean z3) {
            if (z3) {
                h0.this.k();
            } else {
                h0.this.g();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ActivityManager.MemoryInfo memoryInfoA;
        View view = (View) this.j.get();
        if (view == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4190b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            k();
            return;
        }
        Long l10 = (Long) this.f4189a.a(x4.f6121q6);
        if (l10.longValue() > 0 && (memoryInfoA = n7.a((ActivityManager) com.applovin.impl.sdk.k.o().getSystemService("activity"))) != null && memoryInfoA.availMem < l10.longValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4190b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (this.f4189a.m0().isApplicationPaused()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f4190b.a("BlackViewDetector", "App is backgrounded - skipping black view detection");
            }
            j();
            g();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4190b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4190b.k("BlackViewDetector", r5.c.i(measuredWidth, "Monitored view is not visible due to dimensions (width = ", ", height = ", measuredHeight, ")"));
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
            java.lang.Integer r2 = r8.f4199m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4d
            int r2 = r2.intValue()
            int r2 = android.graphics.Color.red(r2)
            java.lang.Integer r5 = r8.f4199m
            int r5 = r5.intValue()
            int r5 = android.graphics.Color.green(r5)
            java.lang.Integer r6 = r8.f4199m
            int r6 = r6.intValue()
            int r6 = android.graphics.Color.blue(r6)
            int r2 = r0 - r2
            int r2 = java.lang.Math.abs(r2)
            int r7 = r8.f4196i
            if (r2 > r7) goto L4f
            int r2 = r1 - r5
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f4196i
            if (r2 > r5) goto L4f
            int r2 = r9 - r6
            int r2 = java.lang.Math.abs(r2)
            int r5 = r8.f4196i
            if (r2 <= r5) goto L4d
            goto L4f
        L4d:
            r2 = r4
            goto L50
        L4f:
            r2 = r3
        L50:
            int r5 = r8.f4195h
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
            Activity activityA = this.f4189a.e().a();
            if (activityA == null) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4190b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i4 = iArr[0];
            int i10 = iArr[1];
            Rect rect = new Rect(i4, i10, i4 + measuredWidth, i10 + measuredHeight);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(activityA.getWindow(), rect, bitmapCreateBitmap, new b(dVar, bitmapCreateBitmap), new Handler());
                return;
            } catch (Throwable th2) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f4190b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th2);
                }
                dVar.a(true);
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f4190b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
