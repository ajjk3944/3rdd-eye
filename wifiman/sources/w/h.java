package w;

import Ii.AbstractC3059i;
import Ii.N;
import Yg.J;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import r.AbstractC7537l;
import r.C7531h;
import r.C7536k;
import r.InterfaceC7550z;
import r.m0;

/* loaded from: classes.dex */
public final class h implements n {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC7550z f63902a;

    /* renamed from: b, reason: collision with root package name */
    private final f0.g f63903b;

    /* renamed from: c, reason: collision with root package name */
    private int f63904c;

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        Object f63905a;

        /* renamed from: b, reason: collision with root package name */
        Object f63906b;

        /* renamed from: c, reason: collision with root package name */
        int f63907c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f63908d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f63909e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ v f63910f;

        /* renamed from: w.h$a$a, reason: collision with other inner class name */
        static final class C2274a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ K f63911a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f63912b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ K f63913c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ h f63914d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2274a(K k10, v vVar, K k11, h hVar) {
                super(1);
                this.f63911a = k10;
                this.f63912b = vVar;
                this.f63913c = k11;
                this.f63914d = hVar;
            }

            public final void a(C7531h c7531h) {
                float fFloatValue = ((Number) c7531h.e()).floatValue() - this.f63911a.f51686a;
                float fA = this.f63912b.a(fFloatValue);
                this.f63911a.f51686a = ((Number) c7531h.e()).floatValue();
                this.f63913c.f51686a = ((Number) c7531h.f()).floatValue();
                if (Math.abs(fFloatValue - fA) > 0.5f) {
                    c7531h.a();
                }
                h hVar = this.f63914d;
                hVar.g(hVar.e() + 1);
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C7531h) obj);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, h hVar, v vVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f63908d = f10;
            this.f63909e = hVar;
            this.f63910f = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(this.f63908d, this.f63909e, this.f63910f, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            float f10;
            K k10;
            C7536k c7536k;
            InterfaceC7550z interfaceC7550zD;
            C2274a c2274a;
            Object objG = AbstractC5467b.g();
            int i10 = this.f63907c;
            if (i10 == 0) {
                Yg.v.b(obj);
                if (Math.abs(this.f63908d) > 1.0f) {
                    K k11 = new K();
                    k11.f51686a = this.f63908d;
                    K k12 = new K();
                    C7536k c7536kC = AbstractC7537l.c(0.0f, this.f63908d, 0L, 0L, false, 28, null);
                    try {
                        interfaceC7550zD = this.f63909e.d();
                        c2274a = new C2274a(k12, this.f63910f, k11, this.f63909e);
                        this.f63905a = k11;
                        this.f63906b = c7536kC;
                        this.f63907c = 1;
                    } catch (CancellationException unused) {
                        k10 = k11;
                        c7536k = c7536kC;
                        k10.f51686a = ((Number) c7536k.p()).floatValue();
                        f10 = k10.f51686a;
                        return kotlin.coroutines.jvm.internal.b.c(f10);
                    }
                    if (m0.h(c7536kC, interfaceC7550zD, false, c2274a, this, 2, null) == objG) {
                        return objG;
                    }
                    k10 = k11;
                    f10 = k10.f51686a;
                } else {
                    f10 = this.f63908d;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c7536k = (C7536k) this.f63906b;
                k10 = (K) this.f63905a;
                try {
                    Yg.v.b(obj);
                } catch (CancellationException unused2) {
                    k10.f51686a = ((Number) c7536k.p()).floatValue();
                    f10 = k10.f51686a;
                    return kotlin.coroutines.jvm.internal.b.c(f10);
                }
                f10 = k10.f51686a;
            }
            return kotlin.coroutines.jvm.internal.b.c(f10);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public h(InterfaceC7550z interfaceC7550z, f0.g gVar) {
        this.f63902a = interfaceC7550z;
        this.f63903b = gVar;
    }

    @Override // w.n
    public Object a(v vVar, float f10, InterfaceC5380e interfaceC5380e) {
        this.f63904c = 0;
        return AbstractC3059i.g(this.f63903b, new a(f10, this, vVar, null), interfaceC5380e);
    }

    public final InterfaceC7550z d() {
        return this.f63902a;
    }

    public final int e() {
        return this.f63904c;
    }

    public final void f(InterfaceC7550z interfaceC7550z) {
        this.f63902a = interfaceC7550z;
    }

    public final void g(int i10) {
        this.f63904c = i10;
    }

    public /* synthetic */ h(InterfaceC7550z interfaceC7550z, f0.g gVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC7550z, (i10 & 2) != 0 ? androidx.compose.foundation.gestures.d.e() : gVar);
    }
}
