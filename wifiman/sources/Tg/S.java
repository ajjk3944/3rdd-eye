package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kg.InterfaceC6469f;
import lg.EnumC6592b;
import zg.AbstractC8755h;

/* loaded from: classes4.dex */
public final class S extends Bg.a {

    /* renamed from: a, reason: collision with root package name */
    final gg.v f62200a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference f62201b = new AtomicReference();

    static final class a extends AtomicReference implements InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62202a;

        a(gg.x xVar, b bVar) {
            this.f62202a = xVar;
            lazySet(bVar);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            b bVar = (b) getAndSet(null);
            if (bVar != null) {
                bVar.g(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get() == null;
        }
    }

    static final class b extends AtomicReference implements gg.x, InterfaceC6043c {

        /* renamed from: e, reason: collision with root package name */
        static final a[] f62203e = new a[0];

        /* renamed from: f, reason: collision with root package name */
        static final a[] f62204f = new a[0];

        /* renamed from: b, reason: collision with root package name */
        final AtomicReference f62206b;

        /* renamed from: d, reason: collision with root package name */
        Throwable f62208d;

        /* renamed from: a, reason: collision with root package name */
        final AtomicBoolean f62205a = new AtomicBoolean();

        /* renamed from: c, reason: collision with root package name */
        final AtomicReference f62207c = new AtomicReference();

        b(AtomicReference atomicReference) {
            this.f62206b = atomicReference;
            lazySet(f62203e);
        }

        @Override // gg.x
        public void a() {
            this.f62207c.lazySet(EnumC6592b.DISPOSED);
            for (a aVar : (a[]) getAndSet(f62204f)) {
                aVar.f62202a.a();
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this.f62207c, interfaceC6043c);
        }

        public boolean d(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) get();
                if (aVarArr == f62204f) {
                    return false;
                }
                int length = aVarArr.length;
                aVarArr2 = new a[length + 1];
                System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
                aVarArr2[length] = aVar;
            } while (!compareAndSet(aVarArr, aVarArr2));
            return true;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            getAndSet(f62204f);
            r.Y.a(this.f62206b, this, null);
            EnumC6592b.dispose(this.f62207c);
        }

        public void g(a aVar) {
            a[] aVarArr;
            a[] aVarArr2;
            do {
                aVarArr = (a[]) get();
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
                aVarArr2 = f62203e;
                if (length != 1) {
                    aVarArr2 = new a[length - 1];
                    System.arraycopy(aVarArr, 0, aVarArr2, 0, i10);
                    System.arraycopy(aVarArr, i10 + 1, aVarArr2, i10, (length - i10) - 1);
                }
            } while (!compareAndSet(aVarArr, aVarArr2));
        }

        @Override // gg.x
        public void h(Object obj) {
            for (a aVar : (a[]) get()) {
                aVar.f62202a.h(obj);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get() == f62204f;
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            Object obj = this.f62207c.get();
            EnumC6592b enumC6592b = EnumC6592b.DISPOSED;
            if (obj == enumC6592b) {
                Eg.a.v(th2);
                return;
            }
            this.f62208d = th2;
            this.f62207c.lazySet(enumC6592b);
            for (a aVar : (a[]) getAndSet(f62204f)) {
                aVar.f62202a.onError(th2);
            }
        }
    }

    public S(gg.v vVar) {
        this.f62200a = vVar;
    }

    @Override // gg.s
    protected void L0(gg.x xVar) {
        b bVar;
        while (true) {
            bVar = (b) this.f62201b.get();
            if (bVar != null) {
                break;
            }
            b bVar2 = new b(this.f62201b);
            if (r.Y.a(this.f62201b, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        a aVar = new a(xVar, bVar);
        xVar.c(aVar);
        if (bVar.d(aVar)) {
            if (aVar.isDisposed()) {
                bVar.g(aVar);
            }
        } else {
            Throwable th2 = bVar.f62208d;
            if (th2 != null) {
                xVar.onError(th2);
            } else {
                xVar.a();
            }
        }
    }

    @Override // Bg.a
    public void k1(InterfaceC6469f interfaceC6469f) {
        b bVar;
        while (true) {
            bVar = (b) this.f62201b.get();
            if (bVar != null && !bVar.isDisposed()) {
                break;
            }
            b bVar2 = new b(this.f62201b);
            if (r.Y.a(this.f62201b, bVar, bVar2)) {
                bVar = bVar2;
                break;
            }
        }
        boolean z10 = false;
        if (!bVar.f62205a.get() && bVar.f62205a.compareAndSet(false, true)) {
            z10 = true;
        }
        try {
            interfaceC6469f.accept(bVar);
            if (z10) {
                this.f62200a.d(bVar);
            }
        } catch (Throwable th2) {
            AbstractC6152a.b(th2);
            throw AbstractC8755h.h(th2);
        }
    }

    @Override // Bg.a
    public void o1() {
        b bVar = (b) this.f62201b.get();
        if (bVar == null || !bVar.isDisposed()) {
            return;
        }
        r.Y.a(this.f62201b, bVar, null);
    }
}
