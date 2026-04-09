package O;

import Yg.J;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6537m;
import m0.AbstractC6731u0;
import mh.InterfaceC6835l;
import o0.InterfaceC7036c;
import o0.InterfaceC7037d;
import r.G;

/* loaded from: classes.dex */
public abstract class d {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f16693a = new a();

        a() {
            super(1);
        }

        public final void a(InterfaceC7036c interfaceC7036c) {
            int iB = AbstractC6731u0.f52948a.b();
            InterfaceC7037d interfaceC7037dK1 = interfaceC7036c.k1();
            long jC = interfaceC7037dK1.c();
            interfaceC7037dK1.d().j();
            try {
                interfaceC7037dK1.e().b(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iB);
                interfaceC7036c.X1();
            } finally {
                interfaceC7037dK1.d().r();
                interfaceC7037dK1.f(jC);
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((InterfaceC7036c) obj);
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f16694a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f16695b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, boolean z10) {
            super(1);
            this.f16694a = gVar;
            this.f16695b = z10;
        }

        public final void a(androidx.compose.ui.graphics.c cVar) {
            cVar.f(this.f16694a.i() - C6537m.g(cVar.c()));
            if (!this.f16695b || this.f16694a.k()) {
                return;
            }
            float fA = G.e().a(this.f16694a.i() / this.f16694a.l());
            if (fA < 0.0f) {
                fA = 0.0f;
            }
            if (fA > 1.0f) {
                fA = 1.0f;
            }
            cVar.i(fA);
            cVar.g(fA);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((androidx.compose.ui.graphics.c) obj);
            return J.f24997a;
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, g gVar, boolean z10) {
        return androidx.compose.ui.graphics.b.a(androidx.compose.ui.draw.b.d(eVar, a.f16693a), new b(gVar, z10));
    }
}
