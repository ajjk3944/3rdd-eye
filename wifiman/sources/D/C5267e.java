package d;

import Ii.AbstractC3063k;
import Ii.InterfaceC3091y0;
import Ii.N;
import Ki.j;
import Ki.w;
import Li.AbstractC3222i;
import Li.InterfaceC3220g;
import Li.InterfaceC3221h;
import Yg.v;
import c.AbstractC4137F;
import c.C4147b;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.J;
import mh.InterfaceC6839p;
import mh.q;

/* renamed from: d.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5267e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f45676a;

    /* renamed from: b, reason: collision with root package name */
    private final Ki.g f45677b = j.b(-2, Ki.a.SUSPEND, null, 4, null);

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3091y0 f45678c;

    /* renamed from: d.e$a */
    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f45679a;

        /* renamed from: b, reason: collision with root package name */
        int f45680b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC4137F f45681c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f45682d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C5267e f45683e;

        /* renamed from: d.e$a$a, reason: collision with other inner class name */
        static final class C1692a extends l implements q {

            /* renamed from: a, reason: collision with root package name */
            int f45684a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ J f45685b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1692a(J j10, InterfaceC5380e interfaceC5380e) {
                super(3, interfaceC5380e);
                this.f45685b = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f45684a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                this.f45685b.f51685a = true;
                return Yg.J.f24997a;
            }

            @Override // mh.q
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object s(InterfaceC3221h interfaceC3221h, Throwable th2, InterfaceC5380e interfaceC5380e) {
                return new C1692a(this.f45685b, interfaceC5380e).invokeSuspend(Yg.J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC4137F abstractC4137F, InterfaceC6839p interfaceC6839p, C5267e c5267e, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f45681c = abstractC4137F;
            this.f45682d = interfaceC6839p;
            this.f45683e = c5267e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f45681c, this.f45682d, this.f45683e, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            J j10;
            Object objG = AbstractC5467b.g();
            int i10 = this.f45680b;
            if (i10 == 0) {
                v.b(obj);
                if (this.f45681c.g()) {
                    J j11 = new J();
                    InterfaceC6839p interfaceC6839p = this.f45682d;
                    InterfaceC3220g interfaceC3220gH = AbstractC3222i.H(AbstractC3222i.m(this.f45683e.c()), new C1692a(j11, null));
                    this.f45679a = j11;
                    this.f45680b = 1;
                    if (interfaceC6839p.invoke(interfaceC3220gH, this) == objG) {
                        return objG;
                    }
                    j10 = j11;
                }
                return Yg.J.f24997a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j10 = (J) this.f45679a;
            v.b(obj);
            if (!j10.f51685a) {
                throw new IllegalStateException("You must collect the progress flow");
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public C5267e(N n10, boolean z10, InterfaceC6839p interfaceC6839p, AbstractC4137F abstractC4137F) {
        this.f45676a = z10;
        this.f45678c = AbstractC3063k.d(n10, null, null, new a(abstractC4137F, interfaceC6839p, this, null), 3, null);
    }

    public final void a() {
        this.f45677b.cancel(new CancellationException("onBack cancelled"));
        InterfaceC3091y0.a.b(this.f45678c, null, 1, null);
    }

    public final boolean b() {
        return w.a.a(this.f45677b, null, 1, null);
    }

    public final Ki.g c() {
        return this.f45677b;
    }

    public final boolean d() {
        return this.f45676a;
    }

    public final Object e(C4147b c4147b) {
        return this.f45677b.k(c4147b);
    }

    public final void f(boolean z10) {
        this.f45676a = z10;
    }
}
