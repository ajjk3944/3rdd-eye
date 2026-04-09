package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class ge2 {

    /* renamed from: a, reason: collision with root package name */
    private final fb0 f27649a = new fb0();

    /* renamed from: b, reason: collision with root package name */
    private final b f27650b;

    /* renamed from: c, reason: collision with root package name */
    private final e f27651c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f27652d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f27653e;

    /* renamed from: f, reason: collision with root package name */
    private float f27654f;

    /* renamed from: g, reason: collision with root package name */
    private float f27655g;

    /* renamed from: h, reason: collision with root package name */
    private float f27656h;
    private float i;

    /* renamed from: j, reason: collision with root package name */
    private int f27657j;

    /* renamed from: k, reason: collision with root package name */
    private long f27658k;

    /* renamed from: l, reason: collision with root package name */
    private long f27659l;

    /* renamed from: m, reason: collision with root package name */
    private long f27660m;

    /* renamed from: n, reason: collision with root package name */
    private long f27661n;

    /* renamed from: o, reason: collision with root package name */
    private long f27662o;

    /* renamed from: p, reason: collision with root package name */
    private long f27663p;

    /* renamed from: q, reason: collision with root package name */
    private long f27664q;

    public static final class a {
        public static void a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e4) {
                rs0.a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e4);
            }
        }
    }

    public interface b {

        public interface a {
            void a(Display display);
        }

        void a();

        void a(a aVar);
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final WindowManager f27665a;

        public /* synthetic */ c(WindowManager windowManager, int i) {
            this(windowManager);
        }

        @Override // com.yandex.mobile.ads.impl.ge2.b
        public final void a() {
        }

        private c(WindowManager windowManager) {
            this.f27665a = windowManager;
        }

        @Override // com.yandex.mobile.ads.impl.ge2.b
        public final void a(b.a aVar) {
            aVar.a(this.f27665a.getDefaultDisplay());
        }
    }

    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f, reason: collision with root package name */
        private static final e f27668f = new e();

        /* renamed from: b, reason: collision with root package name */
        public volatile long f27669b = -9223372036854775807L;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f27670c;

        /* renamed from: d, reason: collision with root package name */
        private Choreographer f27671d;

        /* renamed from: e, reason: collision with root package name */
        private int f27672e;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Handler handlerA = s82.a(handlerThread.getLooper(), (Handler.Callback) this);
            this.f27670c = handlerA;
            handlerA.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j4) {
            this.f27669b = j4;
            Choreographer choreographer = this.f27671d;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                try {
                    this.f27671d = Choreographer.getInstance();
                } catch (RuntimeException e4) {
                    rs0.b("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e4);
                }
                return true;
            }
            if (i == 1) {
                Choreographer choreographer = this.f27671d;
                if (choreographer != null) {
                    int i10 = this.f27672e + 1;
                    this.f27672e = i10;
                    if (i10 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f27671d;
            if (choreographer2 != null) {
                int i11 = this.f27672e - 1;
                this.f27672e = i11;
                if (i11 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f27669b = -9223372036854775807L;
                }
            }
            return true;
        }

        public static e a() {
            return f27668f;
        }
    }

    public ge2(Context context) {
        b bVarA = a(context);
        this.f27650b = bVarA;
        this.f27651c = bVarA != null ? e.a() : null;
        this.f27658k = -9223372036854775807L;
        this.f27659l = -9223372036854775807L;
        this.f27654f = -1.0f;
        this.i = 1.0f;
        this.f27657j = 0;
    }

    private void d() {
        if (s82.f32899a < 30 || this.f27653e == null) {
            return;
        }
        float fB = this.f27649a.e() ? this.f27649a.b() : this.f27654f;
        float f10 = this.f27655g;
        if (fB == f10) {
            return;
        }
        if (fB != -1.0f && f10 != -1.0f) {
            if (Math.abs(fB - this.f27655g) < ((!this.f27649a.e() || this.f27649a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB == -1.0f && this.f27649a.c() < 30) {
            return;
        }
        this.f27655g = fB;
        a(false);
    }

    public final void b(long j4) {
        long j10 = this.f27661n;
        if (j10 != -1) {
            this.f27663p = j10;
            this.f27664q = this.f27662o;
        }
        this.f27660m++;
        this.f27649a.a(j4 * 1000);
        d();
    }

    public final void c() {
        Surface surface;
        this.f27652d = false;
        b bVar = this.f27650b;
        if (bVar != null) {
            bVar.a();
            e eVar = this.f27651c;
            eVar.getClass();
            eVar.f27670c.sendEmptyMessage(2);
        }
        if (s82.f32899a < 30 || (surface = this.f27653e) == null || this.f27657j == Integer.MIN_VALUE || this.f27656h == 0.0f) {
            return;
        }
        this.f27656h = 0.0f;
        a.a(surface, 0.0f);
    }

    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayManager f27666a;

        /* renamed from: b, reason: collision with root package name */
        private b.a f27667b;

        private d(DisplayManager displayManager) {
            this.f27666a = displayManager;
        }

        public static d a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            b.a aVar = this.f27667b;
            if (aVar == null || i != 0) {
                return;
            }
            aVar.a(this.f27666a.getDisplay(0));
        }

        @Override // com.yandex.mobile.ads.impl.ge2.b
        public final void a(b.a aVar) {
            this.f27667b = aVar;
            this.f27666a.registerDisplayListener(this, s82.a((Handler.Callback) null));
            aVar.a(this.f27666a.getDisplay(0));
        }

        @Override // com.yandex.mobile.ads.impl.ge2.b
        public final void a() {
            this.f27666a.unregisterDisplayListener(this);
            this.f27667b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    public final long a(long j4) {
        long j10;
        if (this.f27663p != -1 && this.f27649a.e()) {
            long jA = this.f27664q + ((long) (((this.f27660m - this.f27663p) * this.f27649a.a()) / this.i));
            if (Math.abs(j4 - jA) <= 20000000) {
                j4 = jA;
            } else {
                this.f27660m = 0L;
                this.f27663p = -1L;
                this.f27661n = -1L;
            }
        }
        this.f27661n = this.f27660m;
        this.f27662o = j4;
        e eVar = this.f27651c;
        if (eVar != null && this.f27658k != -9223372036854775807L) {
            long j11 = eVar.f27669b;
            if (j11 != -9223372036854775807L) {
                long j12 = this.f27658k;
                long j13 = (((j4 - j11) / j12) * j12) + j11;
                if (j4 <= j13) {
                    j10 = j13 - j12;
                } else {
                    j10 = j13;
                    j13 = j12 + j13;
                }
                if (j13 - j4 >= j4 - j10) {
                    j13 = j10;
                }
                return j13 - this.f27659l;
            }
        }
        return j4;
    }

    public final void b(float f10) {
        this.i = f10;
        this.f27660m = 0L;
        this.f27663p = -1L;
        this.f27661n = -1L;
        a(false);
    }

    public final void b() {
        this.f27652d = true;
        this.f27660m = 0L;
        this.f27663p = -1L;
        this.f27661n = -1L;
        if (this.f27650b != null) {
            e eVar = this.f27651c;
            eVar.getClass();
            eVar.f27670c.sendEmptyMessage(1);
            this.f27650b.a(new R1(this, 3));
        }
        a(false);
    }

    private static b a(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            d dVarA = s82.f32899a >= 17 ? d.a(applicationContext) : null;
            if (dVarA != null) {
                return dVarA;
            }
            WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager, 0);
            }
        }
        return null;
    }

    public final void a(float f10) {
        this.f27654f = f10;
        this.f27649a.f();
        d();
    }

    public final void a() {
        this.f27660m = 0L;
        this.f27663p = -1L;
        this.f27661n = -1L;
    }

    public final void a(Surface surface) {
        if (surface instanceof ih1) {
            surface = null;
        }
        Surface surface2 = this.f27653e;
        if (surface2 == surface) {
            return;
        }
        if (s82.f32899a >= 30 && surface2 != null && this.f27657j != Integer.MIN_VALUE && this.f27656h != 0.0f) {
            this.f27656h = 0.0f;
            a.a(surface2, 0.0f);
        }
        this.f27653e = surface;
        a(true);
    }

    public final void a(int i) {
        if (this.f27657j == i) {
            return;
        }
        this.f27657j = i;
        a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f27658k = refreshRate;
            this.f27659l = (refreshRate * 80) / 100;
        } else {
            rs0.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f27658k = -9223372036854775807L;
            this.f27659l = -9223372036854775807L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(boolean r4) {
        /*
            r3 = this;
            int r0 = com.yandex.mobile.ads.impl.s82.f32899a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f27653e
            if (r0 == 0) goto L30
            int r1 = r3.f27657j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f27652d
            if (r1 == 0) goto L21
            float r1 = r3.f27655g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f27656h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            goto L30
        L2b:
            r3.f27656h = r1
            com.yandex.mobile.ads.impl.ge2.a.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ge2.a(boolean):void");
    }
}
