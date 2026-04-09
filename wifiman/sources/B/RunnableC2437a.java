package B;

import T.S0;
import android.view.Choreographer;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: B.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2437a implements Q, S0, Runnable, Choreographer.FrameCallback {

    /* renamed from: g, reason: collision with root package name */
    public static final C0034a f917g = new C0034a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f918h = 8;

    /* renamed from: i, reason: collision with root package name */
    private static long f919i;

    /* renamed from: a, reason: collision with root package name */
    private final View f920a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f922c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f924e;

    /* renamed from: f, reason: collision with root package name */
    private long f925f;

    /* renamed from: b, reason: collision with root package name */
    private final V.b f921b = new V.b(new O[16], 0);

    /* renamed from: d, reason: collision with root package name */
    private final Choreographer f923d = Choreographer.getInstance();

    /* renamed from: B.a$a, reason: collision with other inner class name */
    public static final class C0034a {
        public /* synthetic */ C0034a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(android.view.View r5) {
            /*
                r4 = this;
                long r0 = B.RunnableC2437a.e()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L2c
                android.view.Display r0 = r5.getDisplay()
                boolean r5 = r5.isInEditMode()
                if (r5 != 0) goto L21
                if (r0 == 0) goto L21
                float r5 = r0.getRefreshRate()
                r0 = 1106247680(0x41f00000, float:30.0)
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 < 0) goto L21
                goto L23
            L21:
                r5 = 1114636288(0x42700000, float:60.0)
            L23:
                r0 = 1000000000(0x3b9aca00, float:0.0047237873)
                float r0 = (float) r0
                float r0 = r0 / r5
                long r0 = (long) r0
                B.RunnableC2437a.f(r0)
            L2c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: B.RunnableC2437a.C0034a.b(android.view.View):void");
        }

        private C0034a() {
        }
    }

    /* renamed from: B.a$b */
    public static final class b implements P {

        /* renamed from: a, reason: collision with root package name */
        private final long f926a;

        public b(long j10) {
            this.f926a = j10;
        }

        @Override // B.P
        public long a() {
            return Math.max(0L, this.f926a - System.nanoTime());
        }
    }

    public RunnableC2437a(View view) {
        this.f920a = view;
        f917g.b(view);
    }

    @Override // B.Q
    public void a(O o10) {
        this.f921b.b(o10);
        if (this.f922c) {
            return;
        }
        this.f922c = true;
        this.f920a.post(this);
    }

    @Override // T.S0
    public void b() {
    }

    @Override // T.S0
    public void c() {
        this.f924e = false;
        this.f920a.removeCallbacks(this);
        this.f923d.removeFrameCallback(this);
    }

    @Override // T.S0
    public void d() {
        this.f924e = true;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        if (this.f924e) {
            this.f925f = j10;
            this.f920a.post(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f921b.s() || !this.f922c || !this.f924e || this.f920a.getWindowVisibility() != 0) {
            this.f922c = false;
            return;
        }
        b bVar = new b(this.f925f + f919i);
        boolean z10 = false;
        while (this.f921b.u() && !z10) {
            if (bVar.a() <= 0 || ((O) this.f921b.m()[0]).a(bVar)) {
                z10 = true;
            } else {
                this.f921b.z(0);
            }
        }
        if (z10) {
            this.f923d.postFrameCallback(this);
        } else {
            this.f922c = false;
        }
    }
}
