package p7;

import android.view.View;
import b9.C1992A;
import java.util.NoSuchElementException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.l;
import m0.C5308a;
import p7.C5472d;
import p7.C5473e;
import q7.C5495a;

/* compiled from: AdvanceViewPool.kt */
/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5469a implements InterfaceC5475g {

    /* renamed from: b, reason: collision with root package name */
    public final C5476h f45236b;

    /* renamed from: c, reason: collision with root package name */
    public final C5495a f45237c;

    /* renamed from: d, reason: collision with root package name */
    public final C5473e f45238d;

    /* renamed from: e, reason: collision with root package name */
    public final C5308a f45239e;

    /* compiled from: AdvanceViewPool.kt */
    /* renamed from: p7.a$a, reason: collision with other inner class name */
    public static final class C0511a<T extends View> implements InterfaceC5474f<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f45240a;

        /* renamed from: b, reason: collision with root package name */
        public final C5476h f45241b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC5474f<T> f45242c;

        /* renamed from: d, reason: collision with root package name */
        public final C5473e f45243d;

        /* renamed from: e, reason: collision with root package name */
        public final LinkedBlockingQueue f45244e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicInteger f45245f;

        /* renamed from: g, reason: collision with root package name */
        public final AtomicBoolean f45246g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f45247h;
        public volatile int i;

        public C0511a(String str, C5476h c5476h, C5495a c5495a, InterfaceC5474f<T> interfaceC5474f, C5473e viewCreator, int i) {
            l.f(viewCreator, "viewCreator");
            this.f45240a = str;
            this.f45241b = c5476h;
            this.f45242c = interfaceC5474f;
            this.f45243d = viewCreator;
            this.f45244e = new LinkedBlockingQueue();
            this.f45245f = new AtomicInteger(i);
            this.f45246g = new AtomicBoolean(false);
            this.f45247h = !r1.isEmpty();
            this.i = i;
            for (int i10 = 0; i10 < i; i10++) {
                C5473e c5473e = this.f45243d;
                c5473e.getClass();
                c5473e.f45261a.f45267c.offer(new C5473e.a(this, 0));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v13 */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v4, types: [p7.f, p7.f<T extends android.view.View>] */
        /* JADX WARN: Type inference failed for: r2v5, types: [p7.f] */
        /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
        /* JADX WARN: Type inference failed for: r2v7 */
        /* JADX WARN: Type inference failed for: r2v9 */
        @Override // p7.InterfaceC5474f
        public final T a() {
            Object obj;
            long jNanoTime = System.nanoTime();
            Object objPoll = this.f45244e.poll();
            long jNanoTime2 = System.nanoTime() - jNanoTime;
            if (objPoll == null) {
                long jNanoTime3 = System.nanoTime();
                InterfaceC5474f<T> interfaceC5474fA = this.f45242c;
                try {
                    this.f45243d.a(this);
                    View view = (View) this.f45244e.poll(16L, TimeUnit.MILLISECONDS);
                    if (view != null) {
                        this.f45245f.decrementAndGet();
                        interfaceC5474fA = (InterfaceC5474f<T>) view;
                    } else {
                        interfaceC5474fA = interfaceC5474fA.a();
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    interfaceC5474fA = interfaceC5474fA.a();
                }
                long jNanoTime4 = System.nanoTime() - jNanoTime3;
                C5476h c5476h = this.f45241b;
                if (c5476h != null) {
                    String str = this.f45240a;
                    synchronized (c5476h.f45270b) {
                        C5472d c5472d = c5476h.f45270b;
                        c5472d.getClass();
                        C5472d.a aVar = c5472d.f45256a;
                        aVar.f45259a += jNanoTime4;
                        aVar.f45260b++;
                        C5308a<String, C5472d.a> c5308a = c5472d.f45258c;
                        C5472d.a aVar2 = c5308a.get(str);
                        if (aVar2 == null) {
                            aVar2 = new C5472d.a();
                            c5308a.put(str, aVar2);
                        }
                        C5472d.a aVar3 = aVar2;
                        aVar3.f45259a += jNanoTime4;
                        aVar3.f45260b++;
                        c5476h.f45271c.a(c5476h.f45272d);
                        C1992A c1992a = C1992A.f18074a;
                    }
                }
                this.f45244e.size();
                obj = interfaceC5474fA;
            } else {
                this.f45245f.decrementAndGet();
                C5476h c5476h2 = this.f45241b;
                if (c5476h2 != null) {
                    c5476h2.a(jNanoTime2);
                }
                this.f45244e.size();
                obj = objPoll;
            }
            if (this.i > this.f45245f.get()) {
                long jNanoTime5 = System.nanoTime();
                int size = this.f45244e.size();
                C5473e c5473e = this.f45243d;
                c5473e.getClass();
                c5473e.f45261a.f45267c.offer(new C5473e.a(this, size));
                this.f45245f.incrementAndGet();
                long jNanoTime6 = System.nanoTime() - jNanoTime5;
                C5476h c5476h3 = this.f45241b;
                if (c5476h3 != null) {
                    C5472d c5472d2 = c5476h3.f45270b;
                    c5472d2.f45256a.f45259a += jNanoTime6;
                    if (jNanoTime6 >= 1000000) {
                        C5472d.a aVar4 = c5472d2.f45257b;
                        aVar4.f45259a += jNanoTime6;
                        aVar4.f45260b++;
                    }
                    c5476h3.f45271c.a(c5476h3.f45272d);
                }
            }
            return (T) obj;
        }
    }

    public C5469a(C5476h c5476h, C5495a c5495a, C5473e viewCreator) {
        l.f(viewCreator, "viewCreator");
        this.f45236b = c5476h;
        this.f45237c = c5495a;
        this.f45238d = viewCreator;
        this.f45239e = new C5308a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p7.InterfaceC5475g
    public final <T extends View> T d(String tag) {
        C0511a c0511a;
        l.f(tag, "tag");
        synchronized (this.f45239e) {
            C5308a c5308a = this.f45239e;
            l.f(c5308a, "<this>");
            V v10 = c5308a.get(tag);
            if (v10 == 0) {
                throw new NoSuchElementException("Factory is not registered");
            }
            c0511a = (C0511a) v10;
        }
        return (T) c0511a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p7.InterfaceC5475g
    public final void j(int i, String str) {
        synchronized (this.f45239e) {
            C5308a c5308a = this.f45239e;
            l.f(c5308a, "<this>");
            V v10 = c5308a.get(str);
            if (v10 == 0) {
                throw new NoSuchElementException("Factory is not registered");
            }
            ((C0511a) v10).i = i;
        }
    }

    @Override // p7.InterfaceC5475g
    public final <T extends View> void m(String str, InterfaceC5474f<T> interfaceC5474f, int i) {
        synchronized (this.f45239e) {
            if (this.f45239e.containsKey(str)) {
                return;
            }
            this.f45239e.put(str, new C0511a(str, this.f45236b, this.f45237c, interfaceC5474f, this.f45238d, i));
            C1992A c1992a = C1992A.f18074a;
        }
    }
}
