package ug;

import gg.D;
import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import ug.r;

/* renamed from: ug.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8164A extends gg.z {

    /* renamed from: a, reason: collision with root package name */
    final D[] f62946a;

    /* renamed from: b, reason: collision with root package name */
    final kg.n f62947b;

    /* renamed from: ug.A$a */
    final class a implements kg.n {
        a() {
        }

        @Override // kg.n
        public Object apply(Object obj) {
            Object objApply = C8164A.this.f62947b.apply(new Object[]{obj});
            Objects.requireNonNull(objApply, "The zipper returned a null value");
            return objApply;
        }
    }

    /* renamed from: ug.A$b */
    static final class b extends AtomicInteger implements InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f62949a;

        /* renamed from: b, reason: collision with root package name */
        final kg.n f62950b;

        /* renamed from: c, reason: collision with root package name */
        final c[] f62951c;

        /* renamed from: d, reason: collision with root package name */
        Object[] f62952d;

        b(gg.B b10, int i10, kg.n nVar) {
            super(i10);
            this.f62949a = b10;
            this.f62950b = nVar;
            c[] cVarArr = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11] = new c(this, i11);
            }
            this.f62951c = cVarArr;
            this.f62952d = new Object[i10];
        }

        void a(int i10) {
            c[] cVarArr = this.f62951c;
            int length = cVarArr.length;
            for (int i11 = 0; i11 < i10; i11++) {
                cVarArr[i11].a();
            }
            while (true) {
                i10++;
                if (i10 >= length) {
                    return;
                } else {
                    cVarArr[i10].a();
                }
            }
        }

        void c(Throwable th2, int i10) {
            if (getAndSet(0) <= 0) {
                Eg.a.v(th2);
                return;
            }
            a(i10);
            this.f62952d = null;
            this.f62949a.onError(th2);
        }

        void d(Object obj, int i10) {
            Object[] objArr = this.f62952d;
            if (objArr != null) {
                objArr[i10] = obj;
            }
            if (decrementAndGet() == 0) {
                try {
                    Object objApply = this.f62950b.apply(objArr);
                    Objects.requireNonNull(objApply, "The zipper returned a null value");
                    this.f62952d = null;
                    this.f62949a.onSuccess(objApply);
                } catch (Throwable th2) {
                    AbstractC6152a.b(th2);
                    this.f62952d = null;
                    this.f62949a.onError(th2);
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (getAndSet(0) > 0) {
                for (c cVar : this.f62951c) {
                    cVar.a();
                }
                this.f62952d = null;
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get() <= 0;
        }
    }

    /* renamed from: ug.A$c */
    static final class c extends AtomicReference implements gg.B {

        /* renamed from: a, reason: collision with root package name */
        final b f62953a;

        /* renamed from: b, reason: collision with root package name */
        final int f62954b;

        c(b bVar, int i10) {
            this.f62953a = bVar;
            this.f62954b = i10;
        }

        public void a() {
            EnumC6592b.dispose(this);
        }

        @Override // gg.B
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this, interfaceC6043c);
        }

        @Override // gg.B
        public void onError(Throwable th2) {
            this.f62953a.c(th2, this.f62954b);
        }

        @Override // gg.B
        public void onSuccess(Object obj) {
            this.f62953a.d(obj, this.f62954b);
        }
    }

    public C8164A(D[] dArr, kg.n nVar) {
        this.f62946a = dArr;
        this.f62947b = nVar;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        D[] dArr = this.f62946a;
        int length = dArr.length;
        if (length == 1) {
            dArr[0].a(new r.a(b10, new a()));
            return;
        }
        b bVar = new b(b10, length, this.f62947b);
        b10.c(bVar);
        for (int i10 = 0; i10 < length && !bVar.isDisposed(); i10++) {
            D d10 = dArr[i10];
            if (d10 == null) {
                bVar.c(new NullPointerException("One of the sources is null"), i10);
                return;
            }
            d10.a(bVar.f62951c[i10]);
        }
    }
}
