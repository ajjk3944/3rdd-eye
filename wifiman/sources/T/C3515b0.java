package T;

import Ii.C3073p;
import Ii.InterfaceC3069n;
import Yg.u;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* renamed from: T.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3515b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f21025a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private List f21026b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private List f21027c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f21028d = true;

    /* renamed from: T.b0$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f21030b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC3069n interfaceC3069n) {
            super(1);
            this.f21030b = interfaceC3069n;
        }

        public final void a(Throwable th2) {
            Object obj = C3515b0.this.f21025a;
            C3515b0 c3515b0 = C3515b0.this;
            InterfaceC3069n interfaceC3069n = this.f21030b;
            synchronized (obj) {
                c3515b0.f21026b.remove(interfaceC3069n);
                Yg.J j10 = Yg.J.f24997a;
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Yg.J.f24997a;
        }
    }

    public final Object c(InterfaceC5380e interfaceC5380e) {
        if (e()) {
            return Yg.J.f24997a;
        }
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        synchronized (this.f21025a) {
            this.f21026b.add(c3073p);
        }
        c3073p.B(new a(c3073p));
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU == AbstractC5467b.g() ? objU : Yg.J.f24997a;
    }

    public final void d() {
        synchronized (this.f21025a) {
            this.f21028d = false;
            Yg.J j10 = Yg.J.f24997a;
        }
    }

    public final boolean e() {
        boolean z10;
        synchronized (this.f21025a) {
            z10 = this.f21028d;
        }
        return z10;
    }

    public final void f() {
        synchronized (this.f21025a) {
            try {
                if (e()) {
                    return;
                }
                List list = this.f21026b;
                this.f21026b = this.f21027c;
                this.f21027c = list;
                this.f21028d = true;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    InterfaceC5380e interfaceC5380e = (InterfaceC5380e) list.get(i10);
                    u.a aVar = Yg.u.f25017b;
                    interfaceC5380e.resumeWith(Yg.u.c(Yg.J.f24997a));
                }
                list.clear();
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
