package j0;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements y0, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* renamed from: h, reason: collision with root package name */
    public static long f26849h;

    /* renamed from: a, reason: collision with root package name */
    public final View f26850a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26852c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f26855f;
    public long g;

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f26851b = new PriorityQueue(11, new b4.b(6));

    /* renamed from: d, reason: collision with root package name */
    public final Choreographer f26853d = Choreographer.getInstance();

    /* renamed from: e, reason: collision with root package name */
    public final i.f0 f26854e = new i.f0();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.f26850a = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            b4.b r1 = new b4.b
            r2 = 6
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.f26851b = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.f26853d = r0
            i.f0 r0 = new i.f0
            r0.<init>()
            r4.f26854e = r0
            long r0 = j0.a.f26849h
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4a
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r1 = (float) r1
            float r1 = r1 / r0
            long r0 = (long) r1
            j0.a.f26849h = r0
        L4a:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L56
            r5 = 1
            r4.f26855f = r5
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a.<init>(android.view.View):void");
    }

    @Override // j0.y0
    public final void a(x0 x0Var) {
        this.f26851b.add(new b1(1, x0Var));
        if (this.f26852c) {
            return;
        }
        this.f26852c = true;
        this.f26850a.post(this);
    }

    public final boolean b() {
        i.f0 f0Var = this.f26854e;
        long jB = f0Var.b();
        a4.l.o(jB, "compose:lazy:prefetch:available_time_nanos");
        boolean z3 = true;
        if (jB > 0) {
            PriorityQueue priorityQueue = this.f26851b;
            Object objPeek = priorityQueue.peek();
            nk.k.b(objPeek);
            if (!((b1) objPeek).f26871b.c(f0Var)) {
                priorityQueue.poll();
                z3 = false;
            }
            f0Var.f25289a = false;
        }
        return z3;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f26855f) {
            this.g = j;
            this.f26850a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f26855f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f26855f = false;
        this.f26850a.removeCallbacks(this);
        this.f26853d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.f26851b;
        if (!priorityQueue.isEmpty() && this.f26852c && this.f26855f) {
            View view = this.f26850a;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z3 = System.nanoTime() > (((long) 2) * f26849h) + nanos;
                i.f0 f0Var = this.f26854e;
                f0Var.f25289a = z3;
                f0Var.f25290b = Math.max(this.g, nanos) + f26849h;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (f0Var.f25289a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.f26853d.postFrameCallback(this);
                } else {
                    this.f26852c = false;
                }
                a4.l.o(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.f26852c = false;
    }
}
