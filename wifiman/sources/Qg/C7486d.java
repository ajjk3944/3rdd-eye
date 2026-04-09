package qg;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import yg.EnumC8672g;
import zg.AbstractC8751d;

/* renamed from: qg.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7486d extends AbstractC7484b implements gg.l {

    /* renamed from: l, reason: collision with root package name */
    static final a[] f58914l = new a[0];

    /* renamed from: m, reason: collision with root package name */
    static final a[] f58915m = new a[0];

    /* renamed from: c, reason: collision with root package name */
    final AtomicBoolean f58916c;

    /* renamed from: d, reason: collision with root package name */
    final int f58917d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReference f58918e;

    /* renamed from: f, reason: collision with root package name */
    volatile long f58919f;

    /* renamed from: g, reason: collision with root package name */
    final b f58920g;

    /* renamed from: h, reason: collision with root package name */
    b f58921h;

    /* renamed from: i, reason: collision with root package name */
    int f58922i;

    /* renamed from: j, reason: collision with root package name */
    Throwable f58923j;

    /* renamed from: k, reason: collision with root package name */
    volatile boolean f58924k;

    /* renamed from: qg.d$a */
    static final class a extends AtomicInteger implements Dj.c {

        /* renamed from: a, reason: collision with root package name */
        final Dj.b f58925a;

        /* renamed from: b, reason: collision with root package name */
        final C7486d f58926b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicLong f58927c = new AtomicLong();

        /* renamed from: d, reason: collision with root package name */
        b f58928d;

        /* renamed from: e, reason: collision with root package name */
        int f58929e;

        /* renamed from: f, reason: collision with root package name */
        long f58930f;

        a(Dj.b bVar, C7486d c7486d) {
            this.f58925a = bVar;
            this.f58926b = c7486d;
            this.f58928d = c7486d.f58920g;
        }

        @Override // Dj.c
        public void cancel() {
            if (this.f58927c.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.f58926b.i2(this);
            }
        }

        @Override // Dj.c
        public void request(long j10) {
            if (EnumC8672g.validate(j10)) {
                AbstractC8751d.b(this.f58927c, j10);
                this.f58926b.j2(this);
            }
        }
    }

    /* renamed from: qg.d$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Object[] f58931a;

        /* renamed from: b, reason: collision with root package name */
        volatile b f58932b;

        b(int i10) {
            this.f58931a = new Object[i10];
        }
    }

    public C7486d(gg.i iVar, int i10) {
        super(iVar);
        this.f58917d = i10;
        this.f58916c = new AtomicBoolean();
        b bVar = new b(i10);
        this.f58920g = bVar;
        this.f58921h = bVar;
        this.f58918e = new AtomicReference(f58914l);
    }

    @Override // gg.i
    protected void E1(Dj.b bVar) {
        a aVar = new a(bVar, this);
        bVar.j(aVar);
        h2(aVar);
        if (this.f58916c.get() || !this.f58916c.compareAndSet(false, true)) {
            j2(aVar);
        } else {
            this.f58857b.D1(this);
        }
    }

    @Override // Dj.b
    public void a() {
        this.f58924k = true;
        for (a aVar : (a[]) this.f58918e.getAndSet(f58915m)) {
            j2(aVar);
        }
    }

    @Override // Dj.b
    public void h(Object obj) {
        int i10 = this.f58922i;
        if (i10 == this.f58917d) {
            b bVar = new b(i10);
            bVar.f58931a[0] = obj;
            this.f58922i = 1;
            this.f58921h.f58932b = bVar;
            this.f58921h = bVar;
        } else {
            this.f58921h.f58931a[i10] = obj;
            this.f58922i = i10 + 1;
        }
        this.f58919f++;
        for (a aVar : (a[]) this.f58918e.get()) {
            j2(aVar);
        }
    }

    void h2(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f58918e.get();
            if (aVarArr == f58915m) {
                return;
            }
            int length = aVarArr.length;
            aVarArr2 = new a[length + 1];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!r.Y.a(this.f58918e, aVarArr, aVarArr2));
    }

    void i2(a aVar) {
        a[] aVarArr;
        a[] aVarArr2;
        do {
            aVarArr = (a[]) this.f58918e.get();
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
                aVarArr2 = f58914l;
            } else {
                a[] aVarArr3 = new a[length - 1];
                System.arraycopy(aVarArr, 0, aVarArr3, 0, i10);
                System.arraycopy(aVarArr, i10 + 1, aVarArr3, i10, (length - i10) - 1);
                aVarArr2 = aVarArr3;
            }
        } while (!r.Y.a(this.f58918e, aVarArr, aVarArr2));
    }

    @Override // gg.l
    public void j(Dj.c cVar) {
        cVar.request(Long.MAX_VALUE);
    }

    void j2(a aVar) {
        if (aVar.getAndIncrement() != 0) {
            return;
        }
        long j10 = aVar.f58930f;
        int i10 = aVar.f58929e;
        b bVar = aVar.f58928d;
        AtomicLong atomicLong = aVar.f58927c;
        Dj.b bVar2 = aVar.f58925a;
        int i11 = this.f58917d;
        int iAddAndGet = 1;
        while (true) {
            boolean z10 = this.f58924k;
            boolean z11 = this.f58919f == j10;
            if (z10 && z11) {
                aVar.f58928d = null;
                Throwable th2 = this.f58923j;
                if (th2 != null) {
                    bVar2.onError(th2);
                    return;
                } else {
                    bVar2.a();
                    return;
                }
            }
            if (!z11) {
                long j11 = atomicLong.get();
                if (j11 == Long.MIN_VALUE) {
                    aVar.f58928d = null;
                    return;
                } else if (j11 != j10) {
                    if (i10 == i11) {
                        bVar = bVar.f58932b;
                        i10 = 0;
                    }
                    bVar2.h(bVar.f58931a[i10]);
                    i10++;
                    j10++;
                }
            }
            aVar.f58930f = j10;
            aVar.f58929e = i10;
            aVar.f58928d = bVar;
            iAddAndGet = aVar.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // Dj.b
    public void onError(Throwable th2) {
        if (this.f58924k) {
            Eg.a.v(th2);
            return;
        }
        this.f58923j = th2;
        this.f58924k = true;
        for (a aVar : (a[]) this.f58918e.getAndSet(f58915m)) {
            j2(aVar);
        }
    }
}
