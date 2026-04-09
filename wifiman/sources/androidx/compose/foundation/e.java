package androidx.compose.foundation;

import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.q;
import s.InterfaceC7836I;
import w.AbstractC8235B;
import w.r;
import y.InterfaceC8558m;
import y0.InterfaceC8567G;

/* loaded from: classes.dex */
public class e extends androidx.compose.foundation.a {

    static final class a extends kotlin.coroutines.jvm.internal.l implements q {

        /* renamed from: a, reason: collision with root package name */
        int f27825a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27826b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ long f27827c;

        a(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27825a;
            if (i10 == 0) {
                v.b(obj);
                r rVar = (r) this.f27826b;
                long j10 = this.f27827c;
                if (e.this.V2()) {
                    e eVar = e.this;
                    this.f27825a = 1;
                    if (eVar.X2(rVar, j10, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        public final Object n(r rVar, long j10, InterfaceC5380e interfaceC5380e) {
            a aVar = e.this.new a(interfaceC5380e);
            aVar.f27826b = rVar;
            aVar.f27827c = j10;
            return aVar.invokeSuspend(J.f24997a);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return n((r) obj, ((C6531g) obj2).v(), (InterfaceC5380e) obj3);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final void a(long j10) {
            if (e.this.V2()) {
                e.this.W2().invoke();
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6531g) obj).v());
            return J.f24997a;
        }
    }

    public /* synthetic */ e(InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC8558m, interfaceC7836I, z10, str, gVar, interfaceC6824a);
    }

    static /* synthetic */ Object c3(e eVar, InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
        Object objI = AbstractC8235B.i(interfaceC8567G, eVar.new a(null), eVar.new b(), interfaceC5380e);
        return objI == AbstractC5467b.g() ? objI : J.f24997a;
    }

    @Override // androidx.compose.foundation.a
    public Object Q2(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
        return c3(this, interfaceC8567G, interfaceC5380e);
    }

    public final void d3(InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a) {
        b3(interfaceC8558m, interfaceC7836I, z10, str, gVar, interfaceC6824a);
    }

    private e(InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z10, String str, J0.g gVar, InterfaceC6824a interfaceC6824a) {
        super(interfaceC8558m, interfaceC7836I, z10, str, gVar, interfaceC6824a, null);
    }
}
