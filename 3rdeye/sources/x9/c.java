package X9;

import b9.C1992A;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.l;
import t4.C5606d;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f13673a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13674b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13675c;

    /* renamed from: d, reason: collision with root package name */
    public a f13676d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f13677e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13678f;

    public c(d taskRunner, String name) {
        l.f(taskRunner, "taskRunner");
        l.f(name, "name");
        this.f13673a = taskRunner;
        this.f13674b = name;
        this.f13677e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = V9.b.f13053a;
        synchronized (this.f13673a) {
            try {
                if (b()) {
                    this.f13673a.d(this);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        a aVar = this.f13676d;
        if (aVar != null && aVar.f13669b) {
            this.f13678f = true;
        }
        ArrayList arrayList = this.f13677e;
        boolean z10 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f13669b) {
                a aVar2 = (a) arrayList.get(size);
                if (d.i.isLoggable(Level.FINE)) {
                    C5606d.f(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(a task, long j4) {
        l.f(task, "task");
        synchronized (this.f13673a) {
            if (!this.f13675c) {
                if (e(task, j4, false)) {
                    this.f13673a.d(this);
                }
                C1992A c1992a = C1992A.f18074a;
            } else if (task.f13669b) {
                if (d.i.isLoggable(Level.FINE)) {
                    C5606d.f(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.i.isLoggable(Level.FINE)) {
                    C5606d.f(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(X9.a r11, long r12, boolean r14) {
        /*
            r10 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.l.f(r11, r0)
            X9.c r0 = r11.f13670c
            if (r0 != r10) goto La
            goto Le
        La:
            if (r0 != 0) goto L8e
            r11.f13670c = r10
        Le:
            X9.d r0 = r10.f13673a
            X9.d$a r0 = r0.f13680a
            long r0 = java.lang.System.nanoTime()
            long r2 = r0 + r12
            java.util.ArrayList r4 = r10.f13677e
            int r5 = r4.indexOf(r11)
            r6 = 0
            r7 = -1
            if (r5 == r7) goto L3b
            long r8 = r11.f13671d
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 > 0) goto L38
            java.util.logging.Logger r12 = X9.d.i
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r12 = r12.isLoggable(r13)
            if (r12 == 0) goto L8d
            java.lang.String r12 = "already scheduled"
            t4.C5606d.f(r11, r10, r12)
            return r6
        L38:
            r4.remove(r5)
        L3b:
            r11.f13671d = r2
            java.util.logging.Logger r5 = X9.d.i
            java.util.logging.Level r8 = java.util.logging.Level.FINE
            boolean r5 = r5.isLoggable(r8)
            if (r5 == 0) goto L63
            if (r14 == 0) goto L55
            long r2 = r2 - r0
            java.lang.String r14 = t4.C5606d.t(r2)
            java.lang.String r2 = "run again after "
            java.lang.String r14 = r2.concat(r14)
            goto L60
        L55:
            long r2 = r2 - r0
            java.lang.String r14 = t4.C5606d.t(r2)
            java.lang.String r2 = "scheduled after "
            java.lang.String r14 = r2.concat(r14)
        L60:
            t4.C5606d.f(r11, r10, r14)
        L63:
            java.util.Iterator r14 = r4.iterator()
            r2 = r6
        L68:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r14.next()
            X9.a r3 = (X9.a) r3
            long r8 = r3.f13671d
            long r8 = r8 - r0
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 <= 0) goto L7c
            goto L80
        L7c:
            int r2 = r2 + 1
            goto L68
        L7f:
            r2 = r7
        L80:
            if (r2 != r7) goto L86
            int r2 = r4.size()
        L86:
            r4.add(r2, r11)
            if (r2 != 0) goto L8d
            r11 = 1
            return r11
        L8d:
            return r6
        L8e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "task is in multiple queues"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X9.c.e(X9.a, long, boolean):boolean");
    }

    public final void f() {
        byte[] bArr = V9.b.f13053a;
        synchronized (this.f13673a) {
            try {
                this.f13675c = true;
                if (b()) {
                    this.f13673a.d(this);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return this.f13674b;
    }
}
