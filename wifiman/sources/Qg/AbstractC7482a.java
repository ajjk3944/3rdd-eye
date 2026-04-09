package qg;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* renamed from: qg.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC7482a extends AtomicInteger implements gg.l, Dj.c {

    /* renamed from: a, reason: collision with root package name */
    final Dj.b f58832a;

    /* renamed from: b, reason: collision with root package name */
    Dj.c f58833b;

    /* renamed from: c, reason: collision with root package name */
    volatile boolean f58834c;

    /* renamed from: d, reason: collision with root package name */
    Throwable f58835d;

    /* renamed from: e, reason: collision with root package name */
    volatile boolean f58836e;

    /* renamed from: f, reason: collision with root package name */
    final AtomicLong f58837f = new AtomicLong();

    /* renamed from: g, reason: collision with root package name */
    final AtomicReference f58838g = new AtomicReference();

    AbstractC7482a(Dj.b bVar) {
        this.f58832a = bVar;
    }

    @Override // Dj.b
    public void a() {
        this.f58834c = true;
        d();
    }

    boolean c(boolean z10, boolean z11, Dj.b bVar, AtomicReference atomicReference) {
        if (this.f58836e) {
            atomicReference.lazySet(null);
            return true;
        }
        if (!z10) {
            return false;
        }
        Throwable th2 = this.f58835d;
        if (th2 != null) {
            atomicReference.lazySet(null);
            bVar.onError(th2);
            return true;
        }
        if (!z11) {
            return false;
        }
        bVar.a();
        return true;
    }

    @Override // Dj.c
    public void cancel() {
        if (this.f58836e) {
            return;
        }
        this.f58836e = true;
        this.f58833b.cancel();
        if (getAndIncrement() == 0) {
            this.f58838g.lazySet(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r7 != r1.get()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r9 = r13.f58834c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r2.get() != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (c(r9, r10, r0, r2) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r7 == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        zg.AbstractC8751d.d(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r4 = addAndGet(-r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void d() {
        /*
            r13 = this;
            int r0 = r13.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            Dj.b r0 = r13.f58832a
            java.util.concurrent.atomic.AtomicLong r1 = r13.f58837f
            java.util.concurrent.atomic.AtomicReference r2 = r13.f58838g
            r3 = 1
            r4 = r3
        Lf:
            r5 = 0
            r7 = r5
        L12:
            long r9 = r1.get()
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L38
            boolean r9 = r13.f58834c
            r11 = 0
            java.lang.Object r11 = r2.getAndSet(r11)
            if (r11 != 0) goto L26
            r12 = r3
            goto L27
        L26:
            r12 = r10
        L27:
            boolean r9 = r13.c(r9, r12, r0, r2)
            if (r9 == 0) goto L2e
            return
        L2e:
            if (r12 == 0) goto L31
            goto L38
        L31:
            r0.h(r11)
            r9 = 1
            long r7 = r7 + r9
            goto L12
        L38:
            long r11 = r1.get()
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
            boolean r9 = r13.f58834c
            java.lang.Object r11 = r2.get()
            if (r11 != 0) goto L49
            r10 = r3
        L49:
            boolean r9 = r13.c(r9, r10, r0, r2)
            if (r9 == 0) goto L50
            return
        L50:
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L57
            zg.AbstractC8751d.d(r1, r7)
        L57:
            int r4 = -r4
            int r4 = r13.addAndGet(r4)
            if (r4 != 0) goto Lf
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qg.AbstractC7482a.d():void");
    }

    @Override // gg.l
    public void j(Dj.c cVar) {
        if (EnumC8672g.validate(this.f58833b, cVar)) {
            this.f58833b = cVar;
            this.f58832a.j(this);
            cVar.request(Long.MAX_VALUE);
        }
    }

    @Override // Dj.b
    public void onError(Throwable th2) {
        this.f58835d = th2;
        this.f58834c = true;
        d();
    }

    @Override // Dj.c
    public void request(long j10) {
        if (EnumC8672g.validate(j10)) {
            AbstractC8751d.a(this.f58837f, j10);
            d();
        }
    }
}
