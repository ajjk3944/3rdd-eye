package p7;

import android.os.Process;
import e7.InterfaceC4322a;
import java.lang.ref.WeakReference;
import java.util.PriorityQueue;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import p7.C5469a;

/* compiled from: ViewCreator.kt */
/* renamed from: p7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5473e {

    /* renamed from: a, reason: collision with root package name */
    public final b f45261a;

    /* compiled from: ViewCreator.kt */
    /* renamed from: p7.e$a */
    public static final class a implements Runnable, Comparable<a> {

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ w9.i<Object>[] f45262e;

        /* renamed from: b, reason: collision with root package name */
        public final int f45263b;

        /* renamed from: c, reason: collision with root package name */
        public final String f45264c;

        /* renamed from: d, reason: collision with root package name */
        public final F3.f f45265d;

        static {
            q qVar = new q(a.class, "channelRef", "getChannelRef()Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", 0);
            x.f43661a.getClass();
            f45262e = new w9.i[]{qVar};
        }

        public a(C5469a.C0511a<?> channel, int i) {
            l.f(channel, "channel");
            this.f45263b = i;
            this.f45264c = channel.f45240a;
            F3.f fVar = new F3.f();
            fVar.f1607b = new WeakReference(channel);
            this.f45265d = fVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            a other = aVar;
            l.f(other, "other");
            int i = this.f45263b - other.f45263b;
            return i != 0 ? i : !l.b(this.f45264c, other.f45264c) ? 1 : 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!a.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            l.d(obj, "null cannot be cast to non-null type com.yandex.div.internal.viewpool.ViewCreator.CreateViewTask");
            a aVar = (a) obj;
            return l.b(this.f45264c, aVar.f45264c) && this.f45263b == aVar.f45263b;
        }

        public final int hashCode() {
            return this.f45264c.hashCode() + ((6913 + this.f45263b) * 31);
        }

        @Override // java.lang.Runnable
        public final void run() {
            w9.i<Object> property = f45262e[0];
            F3.f fVar = this.f45265d;
            fVar.getClass();
            l.f(property, "property");
            WeakReference weakReference = (WeakReference) fVar.f1607b;
            C5469a.C0511a c0511a = (C5469a.C0511a) (weakReference != null ? weakReference.get() : null);
            if (c0511a == null || c0511a.f45246g.get()) {
                return;
            }
            try {
                c0511a.f45244e.offer(c0511a.f45242c.a());
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: ViewCreator.kt */
    /* renamed from: p7.e$b */
    public static final class b extends Thread {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC4322a f45266b;

        /* renamed from: c, reason: collision with root package name */
        public final BlockingQueueC5470b<a> f45267c;

        /* renamed from: d, reason: collision with root package name */
        public volatile String f45268d;

        public b(InterfaceC4322a interfaceC4322a) {
            super("ViewPoolThread");
            this.f45266b = interfaceC4322a;
            this.f45267c = new BlockingQueueC5470b<>(new PriorityQueue(32));
            setPriority(5);
        }

        public final void a() throws InterruptedException {
            a aVarPoll = this.f45267c.poll();
            if (aVarPoll == null) {
                try {
                    setPriority(3);
                    aVarPoll = this.f45267c.take();
                    setPriority(5);
                    l.e(aVarPoll, "run {\n                //…          }\n            }");
                } catch (Throwable th) {
                    setPriority(5);
                    throw th;
                }
            }
            this.f45268d = aVarPoll.f45264c;
            aVarPoll.run();
            this.f45268d = null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.myTid();
            this.f45266b.a();
            while (true) {
                try {
                    a();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public C5473e(InterfaceC4322a interfaceC4322a) {
        b bVar = new b(interfaceC4322a);
        this.f45261a = bVar;
        bVar.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        r2.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(p7.C5469a.C0511a<?> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "channel"
            kotlin.jvm.internal.l.f(r6, r0)
            java.lang.String r0 = r6.f45240a
            p7.e$b r1 = r5.f45261a
            java.lang.String r1 = r1.f45268d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8a
            boolean r0 = r6.f45247h
            if (r0 == 0) goto L17
            goto L8a
        L17:
            p7.e$b r0 = r5.f45261a
            p7.b<p7.e$a> r0 = r0.f45267c
            java.util.concurrent.locks.ReentrantLock r1 = r0.f45249c
            r1.lock()
            java.lang.String r1 = r6.f45240a     // Catch: java.lang.Throwable -> L76
            p7.e$b r2 = r5.f45261a     // Catch: java.lang.Throwable -> L76
            java.lang.String r2 = r2.f45268d     // Catch: java.lang.Throwable -> L76
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L7e
            boolean r1 = r6.f45247h     // Catch: java.lang.Throwable -> L76
            if (r1 == 0) goto L31
            goto L7e
        L31:
            p7.e$b r1 = r5.f45261a     // Catch: java.lang.Throwable -> L76
            p7.b<p7.e$a> r1 = r1.f45267c     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.locks.ReentrantLock r2 = r1.f45249c     // Catch: java.lang.Throwable -> L76
            r2.lock()     // Catch: java.lang.Throwable -> L76
            java.util.PriorityQueue r2 = r1.f45248b     // Catch: java.lang.Throwable -> L5a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L5a
        L40:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L5a
            p7.e$a r3 = (p7.C5473e.a) r3     // Catch: java.lang.Throwable -> L5a
            java.lang.String r3 = r3.f45264c     // Catch: java.lang.Throwable -> L5a
            java.lang.String r4 = r6.f45240a     // Catch: java.lang.Throwable -> L5a
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L40
            r2.remove()     // Catch: java.lang.Throwable -> L5a
            goto L5c
        L5a:
            r6 = move-exception
            goto L78
        L5c:
            java.util.concurrent.locks.ReentrantLock r1 = r1.f45249c     // Catch: java.lang.Throwable -> L76
            r1.unlock()     // Catch: java.lang.Throwable -> L76
            p7.e$b r1 = r5.f45261a     // Catch: java.lang.Throwable -> L76
            p7.b<p7.e$a> r1 = r1.f45267c     // Catch: java.lang.Throwable -> L76
            p7.e$a r2 = new p7.e$a     // Catch: java.lang.Throwable -> L76
            r3 = -1
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L76
            r1.offer(r2)     // Catch: java.lang.Throwable -> L76
            b9.A r6 = b9.C1992A.f18074a     // Catch: java.lang.Throwable -> L76
            java.util.concurrent.locks.ReentrantLock r6 = r0.f45249c
            r6.unlock()
            return
        L76:
            r6 = move-exception
            goto L84
        L78:
            java.util.concurrent.locks.ReentrantLock r1 = r1.f45249c     // Catch: java.lang.Throwable -> L76
            r1.unlock()     // Catch: java.lang.Throwable -> L76
            throw r6     // Catch: java.lang.Throwable -> L76
        L7e:
            java.util.concurrent.locks.ReentrantLock r6 = r0.f45249c
            r6.unlock()
            return
        L84:
            java.util.concurrent.locks.ReentrantLock r0 = r0.f45249c
            r0.unlock()
            throw r6
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.C5473e.a(p7.a$a):void");
    }
}
