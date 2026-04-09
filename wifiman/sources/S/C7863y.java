package s;

import Ii.AbstractC3063k;
import Ii.InterfaceC3052e0;
import Ii.InterfaceC3091y0;
import androidx.compose.ui.e;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import y.C8549d;
import y.C8550e;
import y.InterfaceC8555j;
import y.InterfaceC8558m;

/* renamed from: s.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7863y extends e.c {

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC8558m f60794n;

    /* renamed from: o, reason: collision with root package name */
    private C8549d f60795o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f60796p;

    /* renamed from: s.y$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f60797a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f60798b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC8555j f60799c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3052e0 f60800d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC8558m interfaceC8558m, InterfaceC8555j interfaceC8555j, InterfaceC3052e0 interfaceC3052e0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f60798b = interfaceC8558m;
            this.f60799c = interfaceC8555j;
            this.f60800d = interfaceC3052e0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f60798b, this.f60799c, this.f60800d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f60797a;
            if (i10 == 0) {
                Yg.v.b(obj);
                InterfaceC8558m interfaceC8558m = this.f60798b;
                InterfaceC8555j interfaceC8555j = this.f60799c;
                this.f60797a = 1;
                if (interfaceC8558m.a(interfaceC8555j, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            InterfaceC3052e0 interfaceC3052e0 = this.f60800d;
            if (interfaceC3052e0 != null) {
                interfaceC3052e0.dispose();
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    /* renamed from: s.y$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8558m f60801a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8555j f60802b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC8558m interfaceC8558m, InterfaceC8555j interfaceC8555j) {
            super(1);
            this.f60801a = interfaceC8558m;
            this.f60802b = interfaceC8555j;
        }

        public final void a(Throwable th2) {
            this.f60801a.c(this.f60802b);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Yg.J.f24997a;
        }
    }

    public C7863y(InterfaceC8558m interfaceC8558m) {
        this.f60794n = interfaceC8558m;
    }

    private final void D2() {
        C8549d c8549d;
        InterfaceC8558m interfaceC8558m = this.f60794n;
        if (interfaceC8558m != null && (c8549d = this.f60795o) != null) {
            interfaceC8558m.c(new C8550e(c8549d));
        }
        this.f60795o = null;
    }

    private final void E2(InterfaceC8558m interfaceC8558m, InterfaceC8555j interfaceC8555j) {
        if (!k2()) {
            interfaceC8558m.c(interfaceC8555j);
        } else {
            InterfaceC3091y0 interfaceC3091y0 = (InterfaceC3091y0) d2().getCoroutineContext().get(InterfaceC3091y0.f9363O);
            AbstractC3063k.d(d2(), null, null, new a(interfaceC8558m, interfaceC8555j, interfaceC3091y0 != null ? interfaceC3091y0.invokeOnCompletion(new b(interfaceC8558m, interfaceC8555j)) : null, null), 3, null);
        }
    }

    public final void F2(boolean z10) {
        InterfaceC8558m interfaceC8558m = this.f60794n;
        if (interfaceC8558m != null) {
            if (!z10) {
                C8549d c8549d = this.f60795o;
                if (c8549d != null) {
                    E2(interfaceC8558m, new C8550e(c8549d));
                    this.f60795o = null;
                    return;
                }
                return;
            }
            C8549d c8549d2 = this.f60795o;
            if (c8549d2 != null) {
                E2(interfaceC8558m, new C8550e(c8549d2));
                this.f60795o = null;
            }
            C8549d c8549d3 = new C8549d();
            E2(interfaceC8558m, c8549d3);
            this.f60795o = c8549d3;
        }
    }

    public final void G2(InterfaceC8558m interfaceC8558m) {
        if (AbstractC6492s.d(this.f60794n, interfaceC8558m)) {
            return;
        }
        D2();
        this.f60794n = interfaceC8558m;
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return this.f60796p;
    }
}
