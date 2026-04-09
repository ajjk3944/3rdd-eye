package Ii;

import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6492s;

/* renamed from: Ii.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C3051e {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f9307b = AtomicIntegerFieldUpdater.newUpdater(C3051e.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    private final V[] f9308a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* renamed from: Ii.e$a */
    private final class a extends C0 {

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f9309h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC3069n f9310e;

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC3052e0 f9311f;

        public a(InterfaceC3069n interfaceC3069n) {
            this.f9310e = interfaceC3069n;
        }

        public final void A(b bVar) {
            f9309h.set(this, bVar);
        }

        public final void B(InterfaceC3052e0 interfaceC3052e0) {
            this.f9311f = interfaceC3052e0;
        }

        @Override // Ii.C0
        public boolean u() {
            return false;
        }

        @Override // Ii.C0
        public void v(Throwable th2) {
            if (th2 != null) {
                Object objR = this.f9310e.r(th2);
                if (objR != null) {
                    this.f9310e.C0(objR);
                    b bVarX = x();
                    if (bVarX != null) {
                        bVarX.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (C3051e.d().decrementAndGet(C3051e.this) == 0) {
                InterfaceC3069n interfaceC3069n = this.f9310e;
                V[] vArr = C3051e.this.f9308a;
                ArrayList arrayList = new ArrayList(vArr.length);
                for (V v10 : vArr) {
                    arrayList.add(v10.getCompleted());
                }
                interfaceC3069n.resumeWith(Yg.u.c(arrayList));
            }
        }

        public final b x() {
            return (b) f9309h.get(this);
        }

        public final InterfaceC3052e0 y() {
            InterfaceC3052e0 interfaceC3052e0 = this.f9311f;
            if (interfaceC3052e0 != null) {
                return interfaceC3052e0;
            }
            AbstractC6492s.v("handle");
            return null;
        }
    }

    /* renamed from: Ii.e$b */
    private final class b implements InterfaceC3067m {

        /* renamed from: a, reason: collision with root package name */
        private final a[] f9313a;

        public b(a[] aVarArr) {
            this.f9313a = aVarArr;
        }

        @Override // Ii.InterfaceC3067m
        public void a(Throwable th2) {
            b();
        }

        public final void b() {
            for (a aVar : this.f9313a) {
                aVar.y().dispose();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f9313a + ']';
        }
    }

    public C3051e(V[] vArr) {
        this.f9308a = vArr;
        this.notCompletedCount$volatile = vArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f9307b;
    }

    public final Object c(InterfaceC5380e interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        int length = this.f9308a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            V v10 = this.f9308a[i10];
            v10.start();
            a aVar = new a(c3073p);
            aVar.B(B0.o(v10, false, aVar, 1, null));
            Yg.J j10 = Yg.J.f24997a;
            aVarArr[i10] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].A(bVar);
        }
        if (c3073p.isCompleted()) {
            bVar.b();
        } else {
            r.c(c3073p, bVar);
        }
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }
}
