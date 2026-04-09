package tg;

import hg.InterfaceC6043c;
import ig.AbstractC6152a;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import lg.EnumC6592b;
import lg.EnumC6593c;

/* renamed from: tg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8091b extends gg.s {

    /* renamed from: a, reason: collision with root package name */
    final gg.v[] f62292a;

    /* renamed from: b, reason: collision with root package name */
    final Iterable f62293b;

    /* renamed from: tg.b$a */
    static final class a implements InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.x f62294a;

        /* renamed from: b, reason: collision with root package name */
        final C2182b[] f62295b;

        /* renamed from: c, reason: collision with root package name */
        final AtomicInteger f62296c = new AtomicInteger();

        a(gg.x xVar, int i10) {
            this.f62294a = xVar;
            this.f62295b = new C2182b[i10];
        }

        public void a(gg.v[] vVarArr) {
            C2182b[] c2182bArr = this.f62295b;
            int length = c2182bArr.length;
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                c2182bArr[i10] = new C2182b(this, i11, this.f62294a);
                i10 = i11;
            }
            this.f62296c.lazySet(0);
            this.f62294a.c(this);
            for (int i12 = 0; i12 < length && this.f62296c.get() == 0; i12++) {
                vVarArr[i12].d(c2182bArr[i12]);
            }
        }

        public boolean b(int i10) {
            int i11 = 0;
            if (this.f62296c.get() != 0 || !this.f62296c.compareAndSet(0, i10)) {
                return false;
            }
            C2182b[] c2182bArr = this.f62295b;
            int length = c2182bArr.length;
            while (i11 < length) {
                int i12 = i11 + 1;
                if (i12 != i10) {
                    c2182bArr[i11].d();
                }
                i11 = i12;
            }
            return true;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (this.f62296c.get() != -1) {
                this.f62296c.lazySet(-1);
                for (C2182b c2182b : this.f62295b) {
                    c2182b.d();
                }
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return this.f62296c.get() == -1;
        }
    }

    /* renamed from: tg.b$b, reason: collision with other inner class name */
    static final class C2182b extends AtomicReference implements gg.x {

        /* renamed from: a, reason: collision with root package name */
        final a f62297a;

        /* renamed from: b, reason: collision with root package name */
        final int f62298b;

        /* renamed from: c, reason: collision with root package name */
        final gg.x f62299c;

        /* renamed from: d, reason: collision with root package name */
        boolean f62300d;

        C2182b(a aVar, int i10, gg.x xVar) {
            this.f62297a = aVar;
            this.f62298b = i10;
            this.f62299c = xVar;
        }

        @Override // gg.x
        public void a() {
            if (this.f62300d) {
                this.f62299c.a();
            } else if (this.f62297a.b(this.f62298b)) {
                this.f62300d = true;
                this.f62299c.a();
            }
        }

        @Override // gg.x
        public void c(InterfaceC6043c interfaceC6043c) {
            EnumC6592b.setOnce(this, interfaceC6043c);
        }

        public void d() {
            EnumC6592b.dispose(this);
        }

        @Override // gg.x
        public void h(Object obj) {
            if (this.f62300d) {
                this.f62299c.h(obj);
            } else if (!this.f62297a.b(this.f62298b)) {
                ((InterfaceC6043c) get()).dispose();
            } else {
                this.f62300d = true;
                this.f62299c.h(obj);
            }
        }

        @Override // gg.x
        public void onError(Throwable th2) {
            if (this.f62300d) {
                this.f62299c.onError(th2);
            } else if (!this.f62297a.b(this.f62298b)) {
                Eg.a.v(th2);
            } else {
                this.f62300d = true;
                this.f62299c.onError(th2);
            }
        }
    }

    public C8091b(gg.v[] vVarArr, Iterable iterable) {
        this.f62292a = vVarArr;
        this.f62293b = iterable;
    }

    @Override // gg.s
    public void L0(gg.x xVar) {
        int length;
        gg.v[] vVarArr = this.f62292a;
        if (vVarArr == null) {
            vVarArr = new gg.v[8];
            try {
                length = 0;
                for (gg.v vVar : this.f62293b) {
                    if (vVar == null) {
                        EnumC6593c.error(new NullPointerException("One of the sources is null"), xVar);
                        return;
                    }
                    if (length == vVarArr.length) {
                        gg.v[] vVarArr2 = new gg.v[(length >> 2) + length];
                        System.arraycopy(vVarArr, 0, vVarArr2, 0, length);
                        vVarArr = vVarArr2;
                    }
                    int i10 = length + 1;
                    vVarArr[length] = vVar;
                    length = i10;
                }
            } catch (Throwable th2) {
                AbstractC6152a.b(th2);
                EnumC6593c.error(th2, xVar);
                return;
            }
        } else {
            length = vVarArr.length;
        }
        if (length == 0) {
            EnumC6593c.complete(xVar);
        } else if (length == 1) {
            vVarArr[0].d(xVar);
        } else {
            new a(xVar, length).a(vVarArr);
        }
    }
}
