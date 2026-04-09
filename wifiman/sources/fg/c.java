package Fg;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import r.Y;
import yg.EnumC8672g;
import zg.AbstractC8751d;
import zg.AbstractC8755h;

/* loaded from: classes4.dex */
public final class c extends b {

    /* renamed from: d, reason: collision with root package name */
    static final a[] f6644d = new a[0];

    /* renamed from: e, reason: collision with root package name */
    static final a[] f6645e = new a[0];

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference f6646b = new AtomicReference(f6645e);

    /* renamed from: c, reason: collision with root package name */
    Throwable f6647c;

    static final class a extends AtomicLong implements Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f6648a;

        /* renamed from: b, reason: collision with root package name */
        final c f6649b;

        a(Dj.b bVar, c cVar) {
            this.f6648a = bVar;
            this.f6649b = cVar;
        }

        public boolean a() {
            return get() == Long.MIN_VALUE;
        }

        boolean c() {
            return get() == 0;
        }

        @Override // Dj.c
        public void cancel() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f6649b.l2(this);
            }
        }

        public void d() {
            if (get() != Long.MIN_VALUE) {
                this.f6648a.a();
            }
        }

        public void g(Throwable th2) {
            if (get() != Long.MIN_VALUE) {
                this.f6648a.onError(th2);
            } else {
                Eg.a.v(th2);
            }
        }

        public void h(Object obj) {
            long j10 = get();
            if (j10 == Long.MIN_VALUE) {
                return;
            }
            if (j10 != 0) {
                this.f6648a.h(obj);
                AbstractC8751d.e(this, 1L);
            } else {
                cancel();
                this.f6648a.onError(MissingBackpressureException.a());
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.b(this, j10);
            }
        }
    }

    c() {
    }

    public static c j2() {
        return new c();
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        a aVar = new a(bVar, this);
        bVar.j(aVar);
        if (i2(aVar)) {
            if (aVar.a()) {
                l2(aVar);
            }
        } else {
            Throwable th2 = this.f6647c;
            if (th2 != null) {
                bVar.onError(th2);
            } else {
                bVar.a();
            }
        }
    }

    @Override // Dj.b
    public void a() {
        Object obj = this.f6646b.get();
        Object obj2 = f6644d;
        if (obj == obj2) {
            return;
        }
        for (a aVar : (a[]) this.f6646b.getAndSet(obj2)) {
            aVar.d();
        }
    }

    @Override // Dj.b
    public void h(Object obj) {
        AbstractC8755h.c(obj, "onNext called with a null value.");
        for (a aVar : (a[]) this.f6646b.get()) {
            aVar.h(obj);
        }
    }

    boolean i2(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f6646b.get();
            if (aVarArr == f6644d) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!Y.a(this.f6646b, aVarArr, aVarArr2));
        return true;
    }

    @Override // Dj.b, gg.l
    public void j(Dj.c cVar) {
        if (this.f6646b.get() == f6644d) {
            cVar.cancel();
        } else {
            cVar.request(Long.MAX_VALUE);
        }
    }

    public boolean k2(Object obj) {
        AbstractC8755h.c(obj, "offer called with a null value.");
        a[] aVarArr = (a[]) this.f6646b.get();
        for (a aVar : aVarArr) {
            if (aVar.c()) {
                return false;
            }
        }
        for (a aVar2 : aVarArr) {
            aVar2.h(obj);
        }
        return true;
    }

    void l2(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f6646b.get();
            if (aVarArr == f6644d || aVarArr == f6645e) {
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
                aVarArr2 = f6645e;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!Y.a(this.f6646b, aVarArr, aVarArr2));
    }

    @Override // Dj.b
    public void onError(Throwable th2) {
        AbstractC8755h.c(th2, "onError called with a null Throwable.");
        Object obj = this.f6646b.get();
        Object obj2 = f6644d;
        if (obj == obj2) {
            Eg.a.v(th2);
            return;
        }
        this.f6647c = th2;
        for (a aVar : (a[]) this.f6646b.getAndSet(obj2)) {
            aVar.g(th2);
        }
    }
}
