package qg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jg.AbstractC6327a;
import kg.InterfaceC6469f;
import yg.EnumC8672g;
import zg.AbstractC8751d;
import zg.AbstractC8755h;

/* renamed from: qg.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7483a0 extends AbstractC6327a {

    /* renamed from: b, reason: collision with root package name */
    final Dj.a f58839b;

    /* renamed from: c, reason: collision with root package name */
    final int f58840c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReference f58841d = new AtomicReference();

    /* renamed from: qg.a0$a */
    static final class a extends AtomicLong implements Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58842a;

        /* renamed from: b, reason: collision with root package name */
        final b f58843b;

        /* renamed from: c, reason: collision with root package name */
        long f58844c;

        a(Dj.b bVar, b bVar2) {
            this.f58842a = bVar;
            this.f58843b = bVar2;
        }

        public boolean a() {
            return get() == Long.MIN_VALUE;
        }

        @Override // Dj.c
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f58843b.o(this);
                this.f58843b.g();
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.b(this, j10);
                this.f58843b.g();
            }
        }
    }

    /* renamed from: qg.a0$b */
    static final class b extends AtomicInteger implements gg.l, InterfaceC6043c {

        /* renamed from: k, reason: collision with root package name */
        static final a[] f58845k = new a[0];

        /* renamed from: l, reason: collision with root package name */
        static final a[] f58846l = new a[0];

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference f58847a;

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference f58848b = new AtomicReference();

        /* renamed from: c, reason: collision with root package name */
        final AtomicBoolean f58849c = new AtomicBoolean();

        /* renamed from: d, reason: collision with root package name */
        final AtomicReference f58850d = new AtomicReference(f58845k);

        /* renamed from: e, reason: collision with root package name */
        final int f58851e;

        /* renamed from: f, reason: collision with root package name */
        volatile Dg.g f58852f;

        /* renamed from: g, reason: collision with root package name */
        int f58853g;

        /* renamed from: h, reason: collision with root package name */
        volatile boolean f58854h;

        /* renamed from: i, reason: collision with root package name */
        Throwable f58855i;

        /* renamed from: j, reason: collision with root package name */
        int f58856j;

        b(AtomicReference atomicReference, int i10) {
            this.f58847a = atomicReference;
            this.f58851e = i10;
        }

        @Override // Dj.b
        public void a() {
            this.f58854h = true;
            g();
        }

        boolean c(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f58850d.get();
                if (aVarArr == f58846l) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!r.Y.a(this.f58850d, aVarArr, aVarArr2));
            return true;
        }

        boolean d(boolean z10, boolean z11) {
            if (!z10 || !z11) {
                return false;
            }
            Throwable th2 = this.f58855i;
            if (th2 != null) {
                s(th2);
                return true;
            }
            for (a aVar : (a[]) this.f58850d.getAndSet(f58846l)) {
                if (!aVar.a()) {
                    aVar.f58842a.a();
                }
            }
            return true;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            this.f58850d.getAndSet(f58846l);
            r.Y.a(this.f58847a, this, null);
            EnumC8672g.cancel(this.f58848b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void g() {
            if (getAndIncrement() != 0) {
                return;
            }
            Dg.g gVar = this.f58852f;
            int i10 = this.f58856j;
            int i11 = this.f58851e;
            int i12 = i11 - (i11 >> 2);
            boolean z10 = this.f58853g != 1;
            int iAddAndGet = 1;
            Dg.g gVar2 = gVar;
            int i13 = i10;
            while (true) {
                if (gVar2 != null) {
                    a[] aVarArr = (a[]) this.f58850d.get();
                    long jMin = Long.MAX_VALUE;
                    boolean z11 = false;
                    for (a aVar : aVarArr) {
                        long j10 = aVar.get();
                        if (j10 != Long.MIN_VALUE) {
                            jMin = Math.min(j10 - aVar.f58844c, jMin);
                            z11 = true;
                        }
                    }
                    if (!z11) {
                        jMin = 0;
                    }
                    for (long j11 = 0; jMin != j11; j11 = 0) {
                        boolean z12 = this.f58854h;
                        try {
                            Object objPoll = gVar2.poll();
                            boolean z13 = objPoll == null;
                            if (d(z12, z13)) {
                                return;
                            }
                            if (z13) {
                                break;
                            }
                            for (a aVar2 : aVarArr) {
                                if (!aVar2.a()) {
                                    aVar2.f58842a.h(objPoll);
                                    aVar2.f58844c++;
                                }
                            }
                            if (z10 && (i13 = i13 + 1) == i12) {
                                ((Dj.c) this.f58848b.get()).request(i12);
                                i13 = 0;
                            }
                            jMin--;
                            if (aVarArr != this.f58850d.get()) {
                                break;
                            }
                        } catch (Throwable th2) {
                            AbstractC6152a.b(th2);
                            ((Dj.c) this.f58848b.get()).cancel();
                            gVar2.clear();
                            this.f58854h = true;
                            s(th2);
                            return;
                        }
                    }
                    if (d(this.f58854h, gVar2.isEmpty())) {
                        return;
                    }
                }
                this.f58856j = i13;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (gVar2 == null) {
                    gVar2 = this.f58852f;
                }
            }
        }

        @Override // Dj.b
        public void h(Object obj) {
            if (this.f58853g != 0 || this.f58852f.offer(obj)) {
                g();
            } else {
                onError(new QueueOverflowException());
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f58850d.get() == f58846l;
        }

        @Override // gg.l
        public void j(Dj.c cVar) {
            if (EnumC8672g.setOnce(this.f58848b, cVar)) {
                if (cVar instanceof Dg.d) {
                    Dg.d dVar = (Dg.d) cVar;
                    int iRequestFusion = dVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f58853g = iRequestFusion;
                        this.f58852f = dVar;
                        this.f58854h = true;
                        g();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f58853g = iRequestFusion;
                        this.f58852f = dVar;
                        cVar.request(this.f58851e);
                        return;
                    }
                }
                this.f58852f = new Dg.h(this.f58851e);
                cVar.request(this.f58851e);
            }
        }

        void o(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) this.f58850d.get();
                int length = aVarArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        i10 = -1;
                        break;
                    } else if (aVarArr[i10] == aVar) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    aVarArr2 = f58845k;
                } else {
                    a[] aVarArr3 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                    aVarArr2 = aVarArr3;
                }
            } while (!r.Y.a(this.f58850d, aVarArr, aVarArr2));
        }

        @Override // Dj.b
        public void onError(Throwable th2) {
            if (this.f58854h) {
                Eg.a.v(th2);
                return;
            }
            this.f58855i = th2;
            this.f58854h = true;
            g();
        }

        void s(Throwable th2) {
            for (a aVar : (a[]) this.f58850d.getAndSet(f58846l)) {
                if (!aVar.a()) {
                    aVar.f58842a.onError(th2);
                }
            }
        }
    }

    public C7483a0(Dj.a aVar, int i10) {
        this.f58839b = aVar;
        this.f58840c = i10;
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        b bVar2;
        while (true) {
            bVar2 = (b) this.f58841d.get();
            if (bVar2 != null) {
                break;
            }
            b bVar3 = new b(this.f58841d, this.f58840c);
            if (r.Y.a(this.f58841d, bVar2, bVar3)) {
                bVar2 = bVar3;
                break;
            }
        }
        a aVar = new a(bVar, bVar2);
        bVar.j(aVar);
        if (bVar2.c(aVar)) {
            if (aVar.a()) {
                bVar2.o(aVar);
                return;
            } else {
                bVar2.g();
                return;
            }
        }
        Throwable th2 = bVar2.f58855i;
        if (th2 != null) {
            aVar.f58842a.onError(th2);
        } else {
            aVar.f58842a.a();
        }
    }

    @Override // jg.AbstractC6327a
    public void h2(InterfaceC6469f interfaceC6469f) {
        b bVar;
        while (true) {
            bVar = (b) this.f58841d.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b bVar2 = new b(this.f58841d, this.f58840c);
            if (r.Y.a(this.f58841d, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z10 = false;
        if (!bVar.f58849c.get() && bVar.f58849c.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            interfaceC6469f.accept(bVar);
            if (z10) {
                this.f58839b.b(bVar);
            }
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            throw AbstractC8755h.h(th2);
        }
    }

    @Override // jg.AbstractC6327a
    public void l2() {
        b bVar = (b) this.f58841d.get();
        if (bVar == null || !bVar.isDisposed()) {
            return;
        }
        r.Y.a(this.f58841d, bVar, null);
    }
}
