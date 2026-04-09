package P8;

import If.y;
import Li.N;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import com.ubnt.usurvey.R;
import com.ui.wifiman.model.wmw.WifimanWizard;
import com.ui.wifiman.model.wmw.b;
import java.util.Arrays;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
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

/* loaded from: classes3.dex */
public final class e extends y {

    /* renamed from: m, reason: collision with root package name */
    static final /* synthetic */ th.l[] f18251m = {O.h(new F(e.class, "wizard", "getWizard()Lcom/ui/wifiman/model/wmw/WifimanWizard;", 0))};

    /* renamed from: n, reason: collision with root package name */
    public static final int f18252n = 8;

    /* renamed from: g, reason: collision with root package name */
    private final DI f18253g;

    /* renamed from: h, reason: collision with root package name */
    private final Yg.m f18254h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f18255i;

    /* renamed from: j, reason: collision with root package name */
    private final N f18256j;

    /* renamed from: k, reason: collision with root package name */
    private final N f18257k;

    /* renamed from: l, reason: collision with root package name */
    private final N f18258l;

    private static abstract class a {

        /* renamed from: P8.e$a$a, reason: collision with other inner class name */
        public static final class C0645a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final b.c f18259a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0645a(b.c adoptionState) {
                super(null);
                AbstractC6492s.i(adoptionState, "adoptionState");
                this.f18259a = adoptionState;
            }

            public final b.c a() {
                return this.f18259a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0645a) && AbstractC6492s.d(this.f18259a, ((C0645a) obj).f18259a);
            }

            public int hashCode() {
                return this.f18259a.hashCode();
            }

            public String toString() {
                return "Adoption(adoptionState=" + this.f18259a + ")";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final WifimanWizard.a f18260a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WifimanWizard.a connectionState) {
                super(null);
                AbstractC6492s.i(connectionState, "connectionState");
                this.f18260a = connectionState;
            }

            public final WifimanWizard.a a() {
                return this.f18260a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC6492s.d(this.f18260a, ((b) obj).f18260a);
            }

            public int hashCode() {
                return this.f18260a.hashCode();
            }

            public String toString() {
                return "Connection(connectionState=" + this.f18260a + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static final class b implements n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(a it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(e.this.s0(it));
        }
    }

    static final class c implements n {
        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float apply(a it) {
            AbstractC6492s.i(it, "it");
            return Float.valueOf(e.this.t0(it));
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d extends o<WifimanWizard> {
    }

    /* renamed from: P8.e$e, reason: collision with other inner class name */
    static final class C0646e implements kg.g {

        /* renamed from: a, reason: collision with root package name */
        public static final C0646e f18263a = new C0646e();

        C0646e() {
        }

        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a a(b.c adoptionState, C6556a c6556a, WifimanWizard.a connectionState) {
            AbstractC6492s.i(adoptionState, "adoptionState");
            AbstractC6492s.i(c6556a, "<destruct>");
            AbstractC6492s.i(connectionState, "connectionState");
            b.c.AbstractC1530c abstractC1530c = (b.c.AbstractC1530c) c6556a.a();
            if (abstractC1530c != null) {
                return new a.C0645a(abstractC1530c);
            }
            if (!(adoptionState instanceof b.c.C1529b) && !(adoptionState instanceof b.c.a)) {
                return new a.b(connectionState);
            }
            a.C0645a c0645a = new a.C0645a(adoptionState);
            return c0645a;
        }
    }

    static final class f implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f18264a;

        f(a aVar) {
            this.f18264a = aVar;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(138817469);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(138817469, i10, -1, "com.ubnt.usurvey.ui.wmw.popup.WmwPopupConnectionVM.<get-title>.<anonymous> (WmwPopupConnectionVM.kt:54)");
            }
            String string = it.getString(R.string.wm_wizard_popup_connection_title_format);
            AbstractC6492s.h(string, "getString(...)");
            Q8.a aVar = Q8.a.f19239a;
            com.ui.wifiman.model.wmw.b bVarA = ((a.C0645a) this.f18264a).a().a();
            AbstractC6492s.g(bVarA, "null cannot be cast to non-null type com.ui.wifiman.model.wmw.WifimanWizardAdoption.Adopted");
            String str = String.format(string, Arrays.copyOf(new Object[]{AbstractC7930a.b(aVar.a(((b.a) bVarA).a()), interfaceC3540l, 0)}, 1));
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

    static final class g implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a f18265a;

        g(a aVar) {
            this.f18265a = aVar;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(219098022);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(219098022, i10, -1, "com.ubnt.usurvey.ui.wmw.popup.WmwPopupConnectionVM.<get-title>.<anonymous> (WmwPopupConnectionVM.kt:66)");
            }
            String string = it.getString(R.string.wm_wizard_popup_connection_title_format);
            AbstractC6492s.h(string, "getString(...)");
            String str = String.format(string, Arrays.copyOf(new Object[]{AbstractC7930a.b(Q8.a.f19239a.a(((WifimanWizard.a.AbstractC1520a) ((a.b) this.f18265a).a()).a().a()), interfaceC3540l, 0)}, 1));
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

    static final class h implements n {
        h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(a it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(e.this.u0(it));
        }
    }

    public e(DI di2) {
        AbstractC6492s.i(di2, "di");
        this.f18253g = di2;
        org.kodein.type.i iVarE = s.e(new d().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f18254h = org.kodein.di.d.a(this, new org.kodein.type.d(iVarE, WifimanWizard.class), null).a(this, f18251m[0]);
        gg.i iVarI2 = gg.i.u(v0().d(), v0().e(), v0().getState(), C0646e.f18263a).W().o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f18255i = iVarI2;
        gg.i iVarN0 = iVarI2.N0(new c());
        AbstractC6492s.h(iVarN0, "map(...)");
        this.f18256j = AbstractC8661g.d0(this, iVarN0, Float.valueOf(0.0f), true, null, 4, null);
        gg.i iVarN02 = iVarI2.N0(new h());
        AbstractC6492s.h(iVarN02, "map(...)");
        this.f18257k = AbstractC8661g.h0(this, iVarN02, null, null, 2, null);
        gg.i iVarN03 = iVarI2.N0(new b());
        AbstractC6492s.h(iVarN03, "map(...)");
        this.f18258l = AbstractC8661g.h0(this, iVarN03, null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s9.d s0(a aVar) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float t0(a aVar) {
        if (aVar instanceof a.C0645a) {
            return ((a.C0645a) aVar).a().b();
        }
        if (!(aVar instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) aVar;
        WifimanWizard.a aVarA = bVar.a();
        if ((aVarA instanceof WifimanWizard.a.c) || (aVarA instanceof WifimanWizard.a.b) || (aVarA instanceof WifimanWizard.a.AbstractC1520a.c) || (aVarA instanceof WifimanWizard.a.AbstractC1520a.d)) {
            return 0.0f;
        }
        if (aVarA instanceof WifimanWizard.a.AbstractC1520a.b) {
            return ((WifimanWizard.a.AbstractC1520a.b) bVar.a()).b();
        }
        if (aVarA instanceof WifimanWizard.a.AbstractC1520a.C1521a) {
            return 1.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s9.d u0(a aVar) {
        if (aVar instanceof a.C0645a) {
            a.C0645a c0645a = (a.C0645a) aVar;
            com.ui.wifiman.model.wmw.b bVarA = c0645a.a().a();
            if (bVarA instanceof b.C1528b) {
                return null;
            }
            if (bVarA instanceof b.a) {
                return new d.a(c0645a.a().a().toString(), new f(aVar));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!(aVar instanceof a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.b bVar = (a.b) aVar;
        WifimanWizard.a aVarA = bVar.a();
        if ((aVarA instanceof WifimanWizard.a.c) || (aVarA instanceof WifimanWizard.a.b)) {
            return null;
        }
        if (aVarA instanceof WifimanWizard.a.AbstractC1520a) {
            return new d.a(((WifimanWizard.a.AbstractC1520a) bVar.a()).a().a().d(""), new g(aVar));
        }
        throw new NoWhenBranchMatchedException();
    }

    private final WifimanWizard v0() {
        return (WifimanWizard) this.f18254h.getValue();
    }

    @Override // org.kodein.di.c
    public DI d() {
        return this.f18253g;
    }

    @Override // If.y
    public N getTitle() {
        return this.f18257k;
    }

    @Override // If.y
    public N n0() {
        return this.f18258l;
    }

    @Override // If.y
    public N o0() {
        return this.f18256j;
    }
}
