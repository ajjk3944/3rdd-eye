package P8;

import If.AbstractC3026f;
import Li.N;
import Li.P;
import Li.z;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.wmw.WifimanWizard;
import com.ui.wifiman.model.wmw.b;
import h9.C5969a;
import java.util.Arrays;
import kg.n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import l9.C6556a;
import mh.q;
import org.kodein.di.DI;
import org.kodein.type.o;
import org.kodein.type.s;
import s9.d;
import sa.AbstractC7930a;
import ye.AbstractC8661g;
import ye.C8658d;

/* loaded from: classes3.dex */
public final class a extends AbstractC3026f {

    /* renamed from: k, reason: collision with root package name */
    static final /* synthetic */ th.l[] f18202k = {O.h(new F(a.class, "wizard", "getWizard()Lcom/ui/wifiman/model/wmw/WifimanWizard;", 0))};

    /* renamed from: l, reason: collision with root package name */
    public static final int f18203l = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f18204g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f18205h;

    /* renamed from: i, reason: collision with root package name */
    private final z f18206i;

    /* renamed from: j, reason: collision with root package name */
    private final N f18207j;

    /* renamed from: P8.a$a, reason: collision with other inner class name */
    static final class C0639a implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final C0639a f18208a = new C0639a();

        /* renamed from: P8.a$a$a, reason: collision with other inner class name */
        static final class C0640a implements q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5969a f18209a;

            C0640a(C5969a c5969a) {
                this.f18209a = c5969a;
            }

            public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
                AbstractC6492s.i(it, "it");
                interfaceC3540l.U(-672305019);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-672305019, i10, -1, "com.ubnt.usurvey.ui.wmw.popup.WmwPopupAdoptionFailedVM.message.<anonymous>.<anonymous>.<anonymous> (WmwPopupAdoptionFailedVM.kt:26)");
                }
                String string = it.getString(R.string.wm_wizard_popup_adoption_failed_message_format);
                AbstractC6492s.h(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{AbstractC7930a.b(Q8.a.f19239a.a(this.f18209a), interfaceC3540l, 0)}, 1));
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

        C0639a() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            C5969a c5969aA;
            AbstractC6492s.i(c6556a, "<destruct>");
            b.c.AbstractC1530c abstractC1530c = (b.c.AbstractC1530c) c6556a.a();
            d.a aVar = null;
            com.ui.wifiman.model.wmw.b bVarA = abstractC1530c != null ? abstractC1530c.a() : null;
            b.a aVar2 = bVarA instanceof b.a ? (b.a) bVarA : null;
            if (aVar2 != null && (c5969aA = aVar2.a()) != null) {
                aVar = new d.a(c5969aA.d(""), new C0640a(c5969aA));
            }
            return new C6556a(aVar);
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends o<WifimanWizard> {
    }

    public a(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f18204g = di2;
        org.kodein.type.i iVarE = s.e(new b().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f18205h = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, WifimanWizard.class), null).a(this, f18202k[0]);
        this.f18206i = P.a(new d.b(R.string.wm_wizard_popup_adoption_failed_title));
        gg.i iVarN0 = q0().e().N0(C0639a.f18208a);
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f18207j = AbstractC8661g.h0(this, iVarN0, null, null, 2, null);
    }

    private final WifimanWizard q0() {
        return (WifimanWizard) this.f18205h.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f18204g;
    }

    @Override // If.AbstractC3026f
    public N n0() {
        return this.f18207j;
    }

    @Override // If.AbstractC3026f
    public void o0() {
        C8658d.f66727a.d(q0().a(), this);
    }

    @Override // If.AbstractC3026f
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public z getTitle() {
        return this.f18206i;
    }
}
