package ug;

import gg.D;
import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import r.Y;

/* renamed from: ug.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8166a extends gg.z implements gg.B {

    /* renamed from: f, reason: collision with root package name */
    static final C2232a[] f62958f = new C2232a[0];

    /* renamed from: g, reason: collision with root package name */
    static final C2232a[] f62959g = new C2232a[0];

    /* renamed from: a, reason: collision with root package name */
    final D f62960a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicInteger f62961b = new AtomicInteger();

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference f62962c = new AtomicReference(f62958f);

    /* renamed from: d, reason: collision with root package name */
    Object f62963d;

    /* renamed from: e, reason: collision with root package name */
    Throwable f62964e;

    /* renamed from: ug.a$a, reason: collision with other inner class name */
    static final class C2232a extends AtomicBoolean implements InterfaceC6043c {

        /* renamed from: a, reason: collision with root package name */
        final gg.B f62965a;

        /* renamed from: b, reason: collision with root package name */
        final C8166a f62966b;

        C2232a(gg.B b10, C8166a c8166a) {
            this.f62965a = b10;
            this.f62966b = c8166a;
        }

        @Override // hg.InterfaceC6043c
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f62966b.i0(this);
            }
        }

        @Override // hg.InterfaceC6043c
        public boolean isDisposed() {
            return get();
        }
    }

    public C8166a(D d10) {
        this.f62960a = d10;
    }

    @Override // gg.z
    protected void N(gg.B b10) {
        C2232a c2232a = new C2232a(b10, this);
        b10.c(c2232a);
        if (h0(c2232a)) {
            if (c2232a.isDisposed()) {
                i0(c2232a);
            }
            if (this.f62961b.getAndIncrement() == 0) {
                this.f62960a.a(this);
                return;
            }
            return;
        }
        Throwable th2 = this.f62964e;
        if (th2 != null) {
            b10.onError(th2);
        } else {
            b10.onSuccess(this.f62963d);
        }
    }

    @Override // gg.B
    public void c(InterfaceC6043c interfaceC6043c) {
    }

    boolean h0(C2232a c2232a) {
        C2232a[] c2232aArr;
        C2232a[] c2232aArr2;
        do {
            c2232aArr = (C2232a[]) this.f62962c.get();
            if (c2232aArr == f62959g) {
                return false;
            }
            int length = c2232aArr.length;
            c2232aArr2 = new C2232a[length + 1];
            System.arraycopy(c2232aArr, 0, c2232aArr2, 0, length);
            c2232aArr2[length] = c2232a;
        } while (!Y.a(this.f62962c, c2232aArr, c2232aArr2));
        return true;
    }

    void i0(C2232a c2232a) {
        C2232a[] c2232aArr;
        C2232a[] c2232aArr2;
        do {
            c2232aArr = (C2232a[]) this.f62962c.get();
            int length = c2232aArr.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (c2232aArr[i10] == c2232a) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                c2232aArr2 = f62958f;
            } else {
                C2232a[] c2232aArr3 = new C2232a[length - 1];
                System.arraycopy(c2232aArr, 0, c2232aArr3, 0, i10);
                System.arraycopy(c2232aArr, i10 + 1, c2232aArr3, i10, (length - i10) - 1);
                c2232aArr2 = c2232aArr3;
            }
        } while (!Y.a(this.f62962c, c2232aArr, c2232aArr2));
    }

    @Override // gg.B
    public void onError(Throwable th2) {
        this.f62964e = th2;
        for (C2232a c2232a : (C2232a[]) this.f62962c.getAndSet(f62959g)) {
            if (!c2232a.isDisposed()) {
                c2232a.f62965a.onError(th2);
            }
        }
    }

    @Override // gg.B
    public void onSuccess(Object obj) {
        this.f62963d = obj;
        for (C2232a c2232a : (C2232a[]) this.f62962c.getAndSet(f62959g)) {
            if (!c2232a.isDisposed()) {
                c2232a.f62965a.onSuccess(obj);
            }
        }
    }
}
