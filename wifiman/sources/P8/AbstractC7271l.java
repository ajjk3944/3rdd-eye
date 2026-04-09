package p8;

import Cc.InterfaceC2557a;
import L0.C3174d;
import L0.D;
import Me.c;
import Me.g;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import android.content.Context;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.product.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.q;
import n8.AbstractC6912m;
import s9.InterfaceC7929a;
import s9.d;
import wc.C8321a;

/* renamed from: p8.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7271l {

    /* renamed from: p8.l$a */
    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        public static final a f57803a = new a();

        a() {
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(130352992);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(130352992, i10, -1, "com.ubnt.usurvey.ui.discovery.asBleDiscoveryResultModel.<anonymous>.<anonymous> (DiscoveryItemFactoryExtensions.kt:56)");
            }
            C3174d.a aVar = new C3174d.a(0, 1, null);
            int iN = aVar.n(new D(C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().b().f(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
            try {
                String string = context.getString(R.string.connection_state_connected);
                AbstractC6492s.h(string, "getString(...)");
                aVar.i(string);
                J j10 = J.f24997a;
                aVar.l(iN);
                C3174d c3174dP = aVar.p();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return c3174dP;
            } catch (Throwable th2) {
                aVar.l(iN);
                throw th2;
            }
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final Me.c a(InterfaceC2557a interfaceC2557a) {
        AbstractC6492s.i(interfaceC2557a, "<this>");
        C8321a c8321aP = interfaceC2557a.p();
        if (c8321aP == null) {
            return null;
        }
        String strD = d(c8321aP);
        InterfaceC7929a interfaceC7929aF = AbstractC6912m.f(interfaceC2557a, m.c.SMALL, null, 2, null);
        String name = interfaceC2557a.getName();
        if (name == null) {
            com.ui.wifiman.model.vendor.d dVarC = interfaceC2557a.c();
            name = dVarC != null ? dVarC.getName() : null;
        }
        s9.d cVar = name != null ? new d.c(name) : new d.b(R.string.device_name_fallback);
        c.a aVar = interfaceC2557a.getName() != null ? c.a.IDENTIFIED : c.a.UNIDENTIFIED;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(q8.f.a(c8321aP, true, false));
        arrayList.addAll(q8.f.c(c8321aP, true));
        String lowerCase = c8321aP.h().d(":").toLowerCase(Locale.ROOT);
        AbstractC6492s.h(lowerCase, "toLowerCase(...)");
        return new Me.c(strD, interfaceC7929aF, cVar, new d.c(lowerCase), c8321aP.e() ? new d.a("connected", a.f57803a) : Ne.f.h(c8321aP.k(), true, null, 2, null), aVar, arrayList);
    }

    public static final Me.g b(InterfaceC2557a interfaceC2557a) {
        AbstractC6492s.i(interfaceC2557a, "<this>");
        Dc.j jVarJ = interfaceC2557a.j();
        String name = null;
        if (jVarJ == null) {
            return null;
        }
        String strC = c(jVarJ);
        InterfaceC7929a interfaceC7929aF = AbstractC6912m.f(interfaceC2557a, m.c.SMALL, null, 2, null);
        String name2 = interfaceC2557a.getName();
        if (name2 == null) {
            com.ui.wifiman.model.vendor.d dVarC = interfaceC2557a.c();
            if (dVarC != null) {
                name = dVarC.getName();
            }
        } else {
            name = name2;
        }
        s9.d cVar = name != null ? new d.c(name) : new d.b(R.string.device_name_fallback);
        g.a aVar = interfaceC2557a.getName() != null ? g.a.IDENTIFIED : g.a.UNIDENTIFIED;
        List listA = r8.e.a(jVarJ, true, true);
        String strA = L8.f.a(jVarJ.w());
        return new Me.g(strC, interfaceC7929aF, cVar, strA != null ? new d.c(strA) : new d.c(""), aVar, listA);
    }

    public static final String c(Dc.j jVar) {
        AbstractC6492s.i(jVar, "<this>");
        return "m" + jVar.l() + ":ip" + jVar.w();
    }

    public static final String d(C8321a c8321a) {
        AbstractC6492s.i(c8321a, "<this>");
        return "bt" + c8321a.d();
    }
}
