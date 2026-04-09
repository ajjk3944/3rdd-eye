package Hg;

import gg.x;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import r.Y;
import zg.AbstractC8755h;

/* loaded from: classes4.dex */
public final class b extends d {

    /* renamed from: c, reason: collision with root package name */
    static final a[] f7957c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    static final a[] f7958d = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference f7959a = new AtomicReference(f7958d);

    /* renamed from: b, reason: collision with root package name */
    Throwable f7960b;

    static final class a extends AtomicBoolean implements InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final x f7961a;

        /* renamed from: b, reason: collision with root package name */
        final b f7962b;

        a(x xVar, b bVar) {
            this.f7961a = xVar;
            this.f7962b = bVar;
        }

        public void a() {
            if (get()) {
                return;
            }
            this.f7961a.a();
        }

        public void c(Throwable th2) {
            if (get()) {
                Eg.a.v(th2);
            } else {
                this.f7961a.onError(th2);
            }
        }

        public void d(Object obj) {
            if (get()) {
                return;
            }
            this.f7961a.h(obj);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f7962b.l1(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get();
        }
    }

    b() {
    }

    public static b k1() {
        return new b();
    }

    @Override // gg.s
    protected void L0(x xVar) {
        a aVar = new a(xVar, this);
        xVar.c(aVar);
        if (j1(aVar)) {
            if (aVar.isDisposed()) {
                l1(aVar);
            }
        } else {
            Throwable th2 = this.f7960b;
            if (th2 != null) {
                xVar.onError(th2);
            } else {
                xVar.a();
            }
        }
    }

    @Override // gg.x
    public void a() {
        Object obj = this.f7959a.get();
        Object obj2 = f7957c;
        if (obj == obj2) {
            return;
        }
        for (a aVar : (a[]) this.f7959a.getAndSet(obj2)) {
            aVar.a();
        }
    }

    @Override // gg.x
    public void c(InterfaceC6043c interfaceC6043c) {
        if (this.f7959a.get() == f7957c) {
            interfaceC6043c.dispose();
        }
    }

    @Override // gg.x
    public void h(Object obj) {
        AbstractC8755h.c(obj, "onNext called with a null value.");
        for (a aVar : (a[]) this.f7959a.get()) {
            aVar.d(obj);
        }
    }

    boolean j1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f7959a.get();
            if (aVarArr == f7957c) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!Y.a(this.f7959a, aVarArr, aVarArr2));
        return true;
    }

    void l1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f7959a.get();
            if (aVarArr == f7957c || aVarArr == f7958d) {
                return;
            }
            int length = aVarArr.length;
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
                aVarArr2 = f7958d;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!Y.a(this.f7959a, aVarArr, aVarArr2));
    }

    @Override // gg.x
    public void onError(Throwable th2) {
        AbstractC8755h.c(th2, "onError called with a null Throwable.");
        Object obj = this.f7959a.get();
        Object obj2 = f7957c;
        if (obj == obj2) {
            Eg.a.v(th2);
            return;
        }
        this.f7960b = th2;
        for (a aVar : (a[]) this.f7959a.getAndSet(obj2)) {
            aVar.c(th2);
        }
    }
}
