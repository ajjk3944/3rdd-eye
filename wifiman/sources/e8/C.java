package E8;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import android.text.format.DateUtils;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.product.m;
import com.ui.wifiman.model.speedtest.result.b;
import java.net.URI;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import r8.AbstractC7578a;
import rd.b;
import s9.InterfaceC7929a;
import s9.c;
import s9.d;
import xa.InterfaceC8439a;

/* loaded from: classes3.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public static final C f4095a = new C();

    static final class a implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b.AbstractC1432b f4096a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.AbstractC1432b f4097b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f4098c;

        a(b.AbstractC1432b abstractC1432b, b.AbstractC1432b abstractC1432b2, String str) {
            this.f4096a = abstractC1432b;
            this.f4097b = abstractC1432b2;
            this.f4098c = str;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            String strF;
            String string;
            String strF2;
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(-861033693);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-861033693, i10, -1, "com.ubnt.usurvey.ui.speedtest.SpeedtestResultPresentationUtil.measurementDirectionText.<anonymous> (SpeedtestResultPresentationUtil.kt:53)");
            }
            String string2 = context.getString(R.string.speedtest_result_direction_format);
            AbstractC6492s.h(string2, "getString(...)");
            b.AbstractC1432b abstractC1432b = this.f4096a;
            if ((abstractC1432b instanceof b.AbstractC1432b.a) || (abstractC1432b instanceof b.AbstractC1432b.c)) {
                strF = C.f4095a.f(abstractC1432b);
                if (strF == null) {
                    strF = context.getString(R.string.device_name_fallback);
                    AbstractC6492s.h(strF, "getString(...)");
                }
            } else {
                if (!(abstractC1432b instanceof b.AbstractC1432b.AbstractC1433b)) {
                    throw new NoWhenBranchMatchedException();
                }
                strF = context.getString(R.string.internet);
                AbstractC6492s.h(strF, "getString(...)");
            }
            b.AbstractC1432b abstractC1432b2 = this.f4097b;
            if (abstractC1432b2 == null || (strF2 = C.f4095a.f(abstractC1432b2)) == null) {
                b.AbstractC1432b abstractC1432b3 = this.f4097b;
                if ((abstractC1432b3 instanceof b.AbstractC1432b.a) || (abstractC1432b3 instanceof b.AbstractC1432b.c)) {
                    string = context.getString(R.string.device_name_fallback);
                } else if (abstractC1432b3 instanceof b.AbstractC1432b.AbstractC1433b) {
                    string = context.getString(R.string.internet);
                } else {
                    if (abstractC1432b3 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    strF2 = this.f4098c;
                    if (strF2 == null) {
                        string = context.getString(R.string.device_myself);
                        AbstractC6492s.h(string, "getString(...)");
                    }
                    AbstractC6492s.f(strF2);
                }
                strF2 = string;
                AbstractC6492s.f(strF2);
            }
            String str = String.format(string2, Arrays.copyOf(new Object[]{strF, strF2}, 2));
            AbstractC6492s.h(str, "format(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return str;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    static final class b implements mh.q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.ui.wifiman.model.speedtest.result.b f4099a;

        b(com.ui.wifiman.model.speedtest.result.b bVar) {
            this.f4099a = bVar;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(-1112172201);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1112172201, i10, -1, "com.ubnt.usurvey.ui.speedtest.SpeedtestResultPresentationUtil.timestampText.<anonymous> (SpeedtestResultPresentationUtil.kt:27)");
            }
            CharSequence relativeDateTimeString = DateUtils.getRelativeDateTimeString(context, this.f4099a.h(), 60000L, 86400000L, 128);
            AbstractC6492s.h(relativeDateTimeString, "getRelativeDateTimeString(...)");
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return relativeDateTimeString;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    private C() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f(b.AbstractC1432b abstractC1432b) {
        if (abstractC1432b instanceof b.AbstractC1432b.a) {
            return ((b.AbstractC1432b.a) abstractC1432b).b();
        }
        if (abstractC1432b instanceof b.AbstractC1432b.c) {
            return ((b.AbstractC1432b.c) abstractC1432b).b();
        }
        if (abstractC1432b instanceof b.AbstractC1432b.AbstractC1433b) {
            return ((b.AbstractC1432b.AbstractC1433b) abstractC1432b).d();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final b.AbstractC1432b.AbstractC1433b.C1434b b(com.ui.wifiman.model.speedtest.result.b result) {
        b.AbstractC1432b.AbstractC1433b.C1434b c1434b;
        AbstractC6492s.i(result, "result");
        Iterator it = result.g().iterator();
        do {
            c1434b = null;
            if (!it.hasNext()) {
                break;
            }
            b.AbstractC1432b abstractC1432bC = ((b.c) it.next()).c();
            if (abstractC1432bC instanceof b.AbstractC1432b.AbstractC1433b.C1434b) {
                c1434b = (b.AbstractC1432b.AbstractC1433b.C1434b) abstractC1432bC;
            }
        } while (c1434b == null);
        return c1434b;
    }

    public final s9.d c(b.AbstractC1432b from, b.AbstractC1432b abstractC1432b, String str) {
        AbstractC6492s.i(from, "from");
        return new d.a(f(from) + (abstractC1432b != null ? f(abstractC1432b) : null) + str, new a(from, abstractC1432b, str));
    }

    public final s9.b d(b.c measurement) {
        com.ubnt.usurvey.product.l lVar;
        s9.b bVarA;
        AbstractC6492s.i(measurement, "measurement");
        b.AbstractC1432b abstractC1432bC = measurement.c();
        if (abstractC1432bC instanceof b.AbstractC1432b.a) {
            return N9.b.f16117a.I();
        }
        if (abstractC1432bC instanceof b.AbstractC1432b.c) {
            InterfaceC8439a.d dVarE = ((b.AbstractC1432b.c) abstractC1432bC).e();
            return (dVarE == null || (lVar = (com.ubnt.usurvey.product.l) dVarE.N()) == null || (bVarA = k8.j.a(lVar)) == null) ? Pe.a.f18599a.V() : bVarA;
        }
        if (abstractC1432bC instanceof b.AbstractC1432b.AbstractC1433b) {
            return N9.b.f16117a.B();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC7929a e(b.c measurement, m.c variant) {
        InterfaceC7929a.b bVarB;
        com.ubnt.usurvey.product.m mVarB;
        InterfaceC7929a aVar;
        String strC;
        URI uriA;
        AbstractC6492s.i(measurement, "measurement");
        AbstractC6492s.i(variant, "variant");
        b.AbstractC1432b abstractC1432bC = measurement.c();
        boolean z10 = abstractC1432bC instanceof b.AbstractC1432b.a;
        if (z10) {
            b.a.EnumC2104a enumC2104aE = ((b.AbstractC1432b.a) abstractC1432bC).e();
            if (enumC2104aE == null || (bVarB = AbstractC7578a.a(enumC2104aE)) == null) {
                bVarB = Pe.a.f18599a.k();
            }
        } else if (abstractC1432bC instanceof b.AbstractC1432b.c) {
            bVarB = Pe.a.f18599a.k();
        } else {
            if (!(abstractC1432bC instanceof b.AbstractC1432b.AbstractC1433b)) {
                throw new NoWhenBranchMatchedException();
            }
            bVarB = N9.b.f16117a.B();
        }
        c.b bVar = null;
        if (z10) {
            InterfaceC8439a.d dVarF = ((b.AbstractC1432b.a) abstractC1432bC).f();
            mVarB = dVarF != null ? com.ubnt.usurvey.product.o.b(dVarF, variant) : null;
        } else {
            if (abstractC1432bC instanceof b.AbstractC1432b.c) {
                InterfaceC8439a.d dVarE = ((b.AbstractC1432b.c) abstractC1432bC).e();
                if (dVarE != null) {
                    mVarB = com.ubnt.usurvey.product.o.b(dVarE, variant);
                }
            } else if (!(abstractC1432bC instanceof b.AbstractC1432b.AbstractC1433b)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        if (mVarB == null) {
            aVar = null;
        } else if (mVarB instanceof m.b) {
            aVar = new c.b(((m.b) mVarB).a(), bVarB, null, null, 12, null);
        } else {
            if (!(mVarB instanceof m.a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = new c.a(((m.a) mVarB).a(), null, 2, null);
        }
        if (z10) {
            strC = ((b.AbstractC1432b.a) abstractC1432bC).c();
        } else if (abstractC1432bC instanceof b.AbstractC1432b.c) {
            strC = ((b.AbstractC1432b.c) abstractC1432bC).c();
        } else {
            if (!(abstractC1432bC instanceof b.AbstractC1432b.AbstractC1433b)) {
                throw new NoWhenBranchMatchedException();
            }
            strC = ((b.AbstractC1432b.AbstractC1433b) abstractC1432bC).c();
        }
        if (strC != null && (uriA = L8.j.f11266a.a(strC)) != null) {
            bVar = new c.b(uriA, null, null, null, 14, null);
        }
        return aVar != null ? aVar : bVar != null ? bVar : bVarB;
    }

    public final s9.d g(com.ui.wifiman.model.speedtest.result.b result) {
        AbstractC6492s.i(result, "result");
        return System.currentTimeMillis() - result.h() < 61000 ? new d.b(R.string.timestamp_now) : new d.a(String.valueOf(System.currentTimeMillis() - result.h()), new b(result));
    }
}
