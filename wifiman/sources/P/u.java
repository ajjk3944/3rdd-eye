package P;

import Ii.AbstractC3063k;
import Ii.N;
import Yg.J;
import Zg.AbstractC3689v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6537m;
import m0.AbstractC6731u0;
import m0.C6733v0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import o0.InterfaceC7037d;
import o0.InterfaceC7039f;
import r.AbstractC7519b;
import r.C7517a;
import r.InterfaceC7533i;
import y.C8546a;
import y.C8547b;
import y.C8548c;
import y.C8549d;
import y.C8550e;
import y.C8552g;
import y.C8553h;
import y.InterfaceC8555j;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17976a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6824a f17977b;

    /* renamed from: c, reason: collision with root package name */
    private final C7517a f17978c = AbstractC7519b.b(0.0f, 0.0f, 2, null);

    /* renamed from: d, reason: collision with root package name */
    private final List f17979d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC8555j f17980e;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17981a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f17983c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC7533i f17984d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, InterfaceC7533i interfaceC7533i, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f17983c = f10;
            this.f17984d = interfaceC7533i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return u.this.new a(this.f17983c, this.f17984d, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f17981a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C7517a c7517a = u.this.f17978c;
                Float fC = kotlin.coroutines.jvm.internal.b.c(this.f17983c);
                InterfaceC7533i interfaceC7533i = this.f17984d;
                this.f17981a = 1;
                if (C7517a.f(c7517a, fC, interfaceC7533i, null, null, this, 12, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f17985a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC7533i f17987c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC7533i interfaceC7533i, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f17987c = interfaceC7533i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return u.this.new b(this.f17987c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f17985a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C7517a c7517a = u.this.f17978c;
                Float fC = kotlin.coroutines.jvm.internal.b.c(0.0f);
                InterfaceC7533i interfaceC7533i = this.f17987c;
                this.f17985a = 1;
                if (C7517a.f(c7517a, fC, interfaceC7533i, null, null, this, 12, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public u(boolean z10, InterfaceC6824a interfaceC6824a) {
        this.f17976a = z10;
        this.f17977b = interfaceC6824a;
    }

    public final void b(InterfaceC7039f interfaceC7039f, float f10, long j10) {
        long j11;
        float fFloatValue = ((Number) this.f17978c.m()).floatValue();
        if (fFloatValue > 0.0f) {
            long jK = C6733v0.k(j10, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.f17976a) {
                InterfaceC7039f.P1(interfaceC7039f, jK, f10, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float fI = C6537m.i(interfaceC7039f.c());
            float fG = C6537m.g(interfaceC7039f.c());
            int iB = AbstractC6731u0.f52948a.b();
            InterfaceC7037d interfaceC7037dK1 = interfaceC7039f.k1();
            long jC = interfaceC7037dK1.c();
            interfaceC7037dK1.d().j();
            try {
                interfaceC7037dK1.e().b(0.0f, 0.0f, fI, fG, iB);
                j11 = jC;
            } catch (Throwable th2) {
                th = th2;
                j11 = jC;
            }
            try {
                InterfaceC7039f.P1(interfaceC7039f, jK, f10, 0L, 0.0f, null, null, 0, 124, null);
                interfaceC7037dK1.d().r();
                interfaceC7037dK1.f(j11);
            } catch (Throwable th3) {
                th = th3;
                interfaceC7037dK1.d().r();
                interfaceC7037dK1.f(j11);
                throw th;
            }
        }
    }

    public final void c(InterfaceC8555j interfaceC8555j, N n10) {
        boolean z10 = interfaceC8555j instanceof C8552g;
        if (z10) {
            this.f17979d.add(interfaceC8555j);
        } else if (interfaceC8555j instanceof C8553h) {
            this.f17979d.remove(((C8553h) interfaceC8555j).a());
        } else if (interfaceC8555j instanceof C8549d) {
            this.f17979d.add(interfaceC8555j);
        } else if (interfaceC8555j instanceof C8550e) {
            this.f17979d.remove(((C8550e) interfaceC8555j).a());
        } else if (interfaceC8555j instanceof C8547b) {
            this.f17979d.add(interfaceC8555j);
        } else if (interfaceC8555j instanceof C8548c) {
            this.f17979d.remove(((C8548c) interfaceC8555j).a());
        } else if (!(interfaceC8555j instanceof C8546a)) {
            return;
        } else {
            this.f17979d.remove(((C8546a) interfaceC8555j).a());
        }
        InterfaceC8555j interfaceC8555j2 = (InterfaceC8555j) AbstractC3689v.D0(this.f17979d);
        if (AbstractC6492s.d(this.f17980e, interfaceC8555j2)) {
            return;
        }
        if (interfaceC8555j2 != null) {
            g gVar = (g) this.f17977b.invoke();
            AbstractC3063k.d(n10, null, null, new a(z10 ? gVar.c() : interfaceC8555j instanceof C8549d ? gVar.b() : interfaceC8555j instanceof C8547b ? gVar.a() : 0.0f, p.d(interfaceC8555j2), null), 3, null);
        } else {
            AbstractC3063k.d(n10, null, null, new b(p.e(this.f17980e), null), 3, null);
        }
        this.f17980e = interfaceC8555j2;
    }
}
