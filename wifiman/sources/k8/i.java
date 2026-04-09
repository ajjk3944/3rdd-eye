package k8;

import L0.C3174d;
import L0.D;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.J;
import android.content.Context;
import b8.d;
import com.ubnt.usurvey.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import la.C6562a;
import mh.q;
import s9.d;

/* loaded from: classes3.dex */
public abstract class i {

    static final class a implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b8.d f51320a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f51321b;

        a(b8.d dVar, boolean z10) {
            this.f51320a = dVar;
            this.f51321b = z10;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            CharSequence charSequenceP;
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(-1253967115);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1253967115, i10, -1, "com.ubnt.usurvey.ui.common.string.<anonymous> (PacketLossExtensions.kt:23)");
            }
            b8.d dVar = this.f51320a;
            CharSequence string = null;
            Integer numValueOf = dVar != null ? Integer.valueOf(dVar.b()) : null;
            if (numValueOf != null) {
                boolean z10 = this.f51321b;
                b8.d dVar2 = this.f51320a;
                int iIntValue = numValueOf.intValue();
                interfaceC3540l.U(756346855);
                if (iIntValue == 0) {
                    charSequenceP = context.getString(R.string.device_detail_network_packet_loss_perfect);
                    AbstractC6492s.f(charSequenceP);
                } else if (z10) {
                    C3174d.a aVar = new C3174d.a(0, 1, null);
                    int iN = aVar.n(new D(i.a(dVar2, interfaceC3540l, 0), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                    try {
                        aVar.i(iIntValue + " %");
                        J j10 = J.f24997a;
                        aVar.l(iN);
                        charSequenceP = aVar.p();
                    } catch (Throwable th2) {
                        aVar.l(iN);
                        throw th2;
                    }
                } else {
                    charSequenceP = iIntValue + " %";
                }
                string = charSequenceP;
                interfaceC3540l.J();
            }
            if (string == null) {
                string = context.getString(R.string.value_not_available);
                AbstractC6492s.h(string, "getString(...)");
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return string;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final long a(b8.d dVar, InterfaceC3540l interfaceC3540l, int i10) {
        long jF;
        AbstractC6492s.i(dVar, "<this>");
        interfaceC3540l.U(1266050754);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1266050754, i10, -1, "com.ubnt.usurvey.ui.common.color (PacketLossExtensions.kt:13)");
        }
        if (dVar instanceof d.c) {
            interfaceC3540l.U(2100236271);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f();
            interfaceC3540l.J();
        } else if (dVar instanceof d.C1145d) {
            interfaceC3540l.U(2100238191);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().h().f();
            interfaceC3540l.J();
        } else {
            if (!(dVar instanceof d.a)) {
                interfaceC3540l.U(2100234099);
                interfaceC3540l.J();
                throw new NoWhenBranchMatchedException();
            }
            interfaceC3540l.U(2100239983);
            jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().l().f();
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jF;
    }

    public static final s9.d b(b8.d dVar, boolean z10) {
        return new d.a(String.valueOf(dVar != null ? Integer.valueOf(dVar.b()) : null), new a(dVar, z10));
    }
}
