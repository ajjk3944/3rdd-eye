package s;

import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import sh.AbstractC7978m;
import sh.InterfaceC7970e;

/* loaded from: classes.dex */
public abstract class Y {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f60700a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC7970e f60701b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f60702c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, InterfaceC7970e interfaceC7970e, int i10) {
            super(1);
            this.f60700a = f10;
            this.f60701b = interfaceC7970e;
            this.f60702c = i10;
        }

        public final void a(J0.w wVar) {
            J0.t.h0(wVar, new J0.f(((Number) AbstractC7978m.o(Float.valueOf(this.f60700a), this.f60701b)).floatValue(), this.f60701b, this.f60702c));
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f60703a = new b();

        b() {
            super(1);
        }

        public final void a(J0.w wVar) {
            J0.t.h0(wVar, J0.f.f9597d.a());
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((J0.w) obj);
            return Yg.J.f24997a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar) {
        return J0.m.b(eVar, true, b.f60703a);
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f10, InterfaceC7970e interfaceC7970e, int i10) {
        return J0.m.b(eVar, true, new a(f10, interfaceC7970e, i10));
    }

    public static /* synthetic */ androidx.compose.ui.e c(androidx.compose.ui.e eVar, float f10, InterfaceC7970e interfaceC7970e, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC7970e = AbstractC7978m.b(0.0f, 1.0f);
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return b(eVar, f10, interfaceC7970e, i10);
    }
}
