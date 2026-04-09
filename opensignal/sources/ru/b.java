package ru;

import br.l;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import lf.t1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f21804a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21805b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21806c;

    /* renamed from: d, reason: collision with root package name */
    public a f21807d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f21808e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21809f;

    public b(c cVar, String str) {
        l.e(str, "name");
        this.f21804a = cVar;
        this.f21805b = str;
        this.f21808e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = pu.b.f20645a;
        synchronized (this.f21804a) {
            if (b()) {
                this.f21804a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f21807d;
        if (aVar != null && aVar.f21801b) {
            this.f21809f = true;
        }
        ArrayList arrayList = this.f21808e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f21801b) {
                a aVar2 = (a) arrayList.get(size);
                if (c.f21811i.isLoggable(Level.FINE)) {
                    t1.a(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(a aVar, long j) {
        l.e(aVar, "task");
        synchronized (this.f21804a) {
            if (!this.f21806c) {
                if (e(aVar, j, false)) {
                    this.f21804a.d(this);
                }
            } else if (aVar.f21801b) {
                if (c.f21811i.isLoggable(Level.FINE)) {
                    t1.a(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (c.f21811i.isLoggable(Level.FINE)) {
                    t1.a(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(ru.a r11, long r12, boolean r14) {
        /*
            r10 = this;
            java.lang.String r0 = "task"
            br.l.e(r11, r0)
            ru.b r0 = r11.f21802c
            if (r0 != r10) goto La
            goto Le
        La:
            if (r0 != 0) goto L8a
            r11.f21802c = r10
        Le:
            long r0 = java.lang.System.nanoTime()
            long r2 = r0 + r12
            java.util.ArrayList r4 = r10.f21808e
            int r5 = r4.indexOf(r11)
            r6 = 0
            r7 = -1
            if (r5 == r7) goto L37
            long r8 = r11.f21803d
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 > 0) goto L34
            java.util.logging.Logger r12 = ru.c.f21811i
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r12 = r12.isLoggable(r13)
            if (r12 == 0) goto L89
            java.lang.String r12 = "already scheduled"
            lf.t1.a(r11, r10, r12)
            return r6
        L34:
            r4.remove(r5)
        L37:
            r11.f21803d = r2
            java.util.logging.Logger r5 = ru.c.f21811i
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            boolean r5 = r5.isLoggable(r8)
            if (r5 == 0) goto L5f
            if (r14 == 0) goto L51
            long r2 = r2 - r0
            java.lang.String r14 = lf.t1.n(r2)
            java.lang.String r2 = "run again after "
            java.lang.String r14 = r2.concat(r14)
            goto L5c
        L51:
            long r2 = r2 - r0
            java.lang.String r14 = lf.t1.n(r2)
            java.lang.String r2 = "scheduled after "
            java.lang.String r14 = r2.concat(r14)
        L5c:
            lf.t1.a(r11, r10, r14)
        L5f:
            java.util.Iterator r14 = r4.iterator()
            r2 = r6
        L64:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r14.next()
            ru.a r3 = (ru.a) r3
            long r8 = r3.f21803d
            long r8 = r8 - r0
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 <= 0) goto L78
            goto L7c
        L78:
            int r2 = r2 + 1
            goto L64
        L7b:
            r2 = r7
        L7c:
            if (r2 != r7) goto L82
            int r2 = r4.size()
        L82:
            r4.add(r2, r11)
            if (r2 != 0) goto L89
            r11 = 1
            return r11
        L89:
            return r6
        L8a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "task is in multiple queues"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.b.e(ru.a, long, boolean):boolean");
    }

    public final void f() {
        byte[] bArr = pu.b.f20645a;
        synchronized (this.f21804a) {
            this.f21806c = true;
            if (b()) {
                this.f21804a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f21805b;
    }
}
