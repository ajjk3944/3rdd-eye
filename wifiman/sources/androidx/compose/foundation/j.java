package androidx.compose.foundation;

import T.AbstractC3546o;
import T.AbstractC3561w;
import T.H0;
import T.InterfaceC3540l;
import Yg.J;
import androidx.compose.ui.platform.AbstractC3964z0;
import androidx.compose.ui.platform.B0;
import f.AbstractC5487d;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.q;
import s.InterfaceC7834G;
import s.InterfaceC7835H;
import s.InterfaceC7836I;
import y.InterfaceC8556k;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f28031a = AbstractC3561w.f(a.f28032a);

    static final class a extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f28032a = new a();

        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC7834G invoke() {
            return g.f27841a;
        }
    }

    public static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC8556k f28033a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC7834G f28034b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC8556k interfaceC8556k, InterfaceC7834G interfaceC7834G) {
            super(1);
            this.f28033a = interfaceC8556k;
            this.f28034b = interfaceC7834G;
        }

        public final void a(B0 b02) {
            throw null;
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC5487d.a(obj);
            a(null);
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC7834G f28035a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC8556k f28036b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC7834G interfaceC7834G, InterfaceC8556k interfaceC8556k) {
            super(3);
            this.f28035a = interfaceC7834G;
            this.f28036b = interfaceC8556k;
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, InterfaceC3540l interfaceC3540l, int i10) {
            interfaceC3540l.U(-353972293);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-353972293, i10, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:182)");
            }
            InterfaceC7835H interfaceC7835HB = this.f28035a.b(this.f28036b, interfaceC3540l, 0);
            boolean zT = interfaceC3540l.T(interfaceC7835HB);
            Object objF = interfaceC3540l.f();
            if (zT || objF == InterfaceC3540l.f21100a.a()) {
                objF = new k(interfaceC7835HB);
                interfaceC3540l.K(objF);
            }
            k kVar = (k) objF;
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return kVar;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final H0 a() {
        return f28031a;
    }

    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, InterfaceC8556k interfaceC8556k, InterfaceC7834G interfaceC7834G) {
        if (interfaceC7834G == null) {
            return eVar;
        }
        if (interfaceC7834G instanceof InterfaceC7836I) {
            return eVar.b0(new IndicationModifierElement(interfaceC8556k, (InterfaceC7836I) interfaceC7834G));
        }
        return androidx.compose.ui.c.b(eVar, AbstractC3964z0.b() ? new b(interfaceC8556k, interfaceC7834G) : AbstractC3964z0.a(), new c(interfaceC7834G, interfaceC8556k));
    }
}
