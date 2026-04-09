package J5;

import gg.x;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import r.Y;

/* loaded from: classes3.dex */
public final class c extends d {

    /* renamed from: b, reason: collision with root package name */
    static final a[] f9779b = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference f9780a = new AtomicReference(f9779b);

    static final class a extends AtomicBoolean implements InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final x f9781a;

        /* renamed from: b, reason: collision with root package name */
        final c f9782b;

        a(x xVar, c cVar) {
            this.f9781a = xVar;
            this.f9782b = cVar;
        }

        public void a(Object obj) {
            if (get()) {
                return;
            }
            this.f9781a.h(obj);
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f9782b.m1(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get();
        }
    }

    c() {
    }

    public static c l1() {
        return new c();
    }

    @Override // gg.s
    protected void L0(x xVar) {
        a aVar = new a(xVar, this);
        xVar.c(aVar);
        k1(aVar);
        if (aVar.isDisposed()) {
            m1(aVar);
        }
    }

    @Override // J5.d, kg.InterfaceC6469f
    public void accept(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        for (a aVar : (a[]) this.f9780a.get()) {
            aVar.a(obj);
        }
    }

    @Override // J5.d
    public boolean i1() {
        return ((a[]) this.f9780a.get()).length != 0;
    }

    void k1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f9780a.get();
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!Y.a(this.f9780a, aVarArr, aVarArr2));
    }

    void m1(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f9780a.get();
            if (aVarArr == f9779b) {
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
                aVarArr2 = f9779b;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!Y.a(this.f9780a, aVarArr, aVarArr2));
    }
}
