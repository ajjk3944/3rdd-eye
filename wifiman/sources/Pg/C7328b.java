package pg;

import gg.AbstractC5912b;
import gg.InterfaceC5914d;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import r.Y;

/* renamed from: pg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7328b extends AbstractC5912b implements InterfaceC5914d {

    /* renamed from: e, reason: collision with root package name */
    static final a[] f57926e = new a[0];

    /* renamed from: f, reason: collision with root package name */
    static final a[] f57927f = new a[0];

    /* renamed from: a, reason: collision with root package name */
    final gg.f f57928a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference f57929b = new AtomicReference(f57926e);

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f57930c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    Throwable f57931d;

    /* renamed from: pg.b$a */
    final class a extends AtomicBoolean implements InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC5914d f57932a;

        a(InterfaceC5914d interfaceC5914d) {
            this.f57932a = interfaceC5914d;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (compareAndSet(false, true)) {
                C7328b.this.l0(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get();
        }
    }

    public C7328b(gg.f fVar) {
        this.f57928a = fVar;
    }

    @Override // gg.AbstractC5912b
    protected void V(InterfaceC5914d interfaceC5914d) {
        a aVar = new a(interfaceC5914d);
        interfaceC5914d.c(aVar);
        if (k0(aVar)) {
            if (aVar.isDisposed()) {
                l0(aVar);
            }
            if (this.f57930c.compareAndSet(false, true)) {
                this.f57928a.e(this);
                return;
            }
            return;
        }
        Throwable th2 = this.f57931d;
        if (th2 != null) {
            interfaceC5914d.onError(th2);
        } else {
            interfaceC5914d.a();
        }
    }

    @Override // gg.InterfaceC5914d
    public void a() {
        for (a aVar : (a[]) this.f57929b.getAndSet(f57927f)) {
            if (!aVar.get()) {
                aVar.f57932a.a();
            }
        }
    }

    @Override // gg.InterfaceC5914d
    public void c(InterfaceC6043c interfaceC6043c) {
    }

    boolean k0(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f57929b.get();
            if (aVarArr == f57927f) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!Y.a(this.f57929b, aVarArr, aVarArr2));
        return true;
    }

    void l0(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f57929b.get();
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
                aVarArr2 = f57926e;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!Y.a(this.f57929b, aVarArr, aVarArr2));
    }

    @Override // gg.InterfaceC5914d
    public void onError(Throwable th2) {
        this.f57931d = th2;
        for (a aVar : (a[]) this.f57929b.getAndSet(f57927f)) {
            if (!aVar.get()) {
                aVar.f57932a.onError(th2);
            }
        }
    }
}
