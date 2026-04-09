package s8;

import Bc.a;
import Cc.InterfaceC2557a;
import L0.C3174d;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import Yg.m;
import Zg.AbstractC3689v;
import a8.C3771a;
import a8.C3772b;
import android.content.Context;
import com.ubnt.usurvey.R;
import com.ubnt.usurvey.wifi.WifiChannelUtils;
import gg.i;
import gg.o;
import gg.r;
import h9.C5969a;
import hd.AbstractC5975a;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kg.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.O;
import mh.q;
import org.kodein.di.DI;
import org.kodein.type.s;
import rj.InterfaceC7810x2;
import s9.d;
import sa.AbstractC7930a;
import th.l;

/* renamed from: s8.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7928f implements InterfaceC7927e {

    /* renamed from: a, reason: collision with root package name */
    private final m f61401a;

    /* renamed from: b, reason: collision with root package name */
    private final m f61402b;

    /* renamed from: c, reason: collision with root package name */
    private final i f61403c;

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ l[] f61399e = {O.h(new F(C7928f.class, "roamingService", "getRoamingService()Lcom/ui/wifiman/model/network/roaming/AccessPointRoaming$Service;", 0)), O.h(new F(C7928f.class, "deviceManager", "getDeviceManager()Lcom/ui/wifiman/model/device/WifimanDeviceManager;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public static final a f61398d = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f61400f = 8;

    /* renamed from: s8.f$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: s8.f$b */
    static final class b implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S8.l f61404a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Integer f61405b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S8.c f61406c;

        b(S8.l lVar, Integer num, S8.c cVar) {
            this.f61404a = lVar;
            this.f61405b = num;
            this.f61406c = cVar;
        }

        public final CharSequence a(Context context, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(context, "context");
            interfaceC3540l.U(999543791);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(999543791, i10, -1, "com.ubnt.usurvey.ui.notification.NetworkConnectionNotificationServiceImpl.additionalInfoText.<anonymous>.<anonymous> (NetworkConnectionNotificationServiceImpl.kt:75)");
            }
            S8.l lVar = this.f61404a;
            Integer num = this.f61405b;
            S8.c cVar = this.f61406c;
            C3174d.a aVar = new C3174d.a(0, 1, null);
            s9.d dVarH = lVar != null ? Ne.f.h(lVar, true, null, 2, null) : null;
            interfaceC3540l.U(-1926024427);
            if (dVarH != null) {
                aVar.g(AbstractC7930a.a(dVarH, interfaceC3540l, 0));
            }
            interfaceC3540l.J();
            if (num != null) {
                int iIntValue = num.intValue();
                if (aVar.j() > 0) {
                    aVar.i("  ");
                }
                String string = context.getString(R.string.network_connection_notification_wifi_channel_format);
                AbstractC6492s.h(string, "getString(...)");
                String str = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(iIntValue)}, 1));
                AbstractC6492s.h(str, "format(...)");
                aVar.i(str);
                if (cVar != null) {
                    aVar.i("  ");
                    String string2 = context.getString(R.string.unit_mhz_format);
                    AbstractC6492s.h(string2, "getString(...)");
                    String str2 = String.format(string2, Arrays.copyOf(new Object[]{WifiChannelUtils.f41035a.b(iIntValue, cVar)}, 1));
                    AbstractC6492s.h(str2, "format(...)");
                    aVar.i(str2);
                }
            }
            C3174d c3174dP = aVar.p();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return c3174dP;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: s8.f$c */
    static final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.b.AbstractC0054a.AbstractC0056b f61407a;

        c(a.b.AbstractC0054a.AbstractC0056b abstractC0056b) {
            this.f61407a = abstractC0056b;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-686805672);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-686805672, i10, -1, "com.ubnt.usurvey.ui.notification.NetworkConnectionNotificationServiceImpl.additionalInfoText.<anonymous>.<anonymous> (NetworkConnectionNotificationServiceImpl.kt:102)");
            }
            a.b.AbstractC0054a.AbstractC0056b abstractC0056b = this.f61407a;
            C3174d.a aVar = new C3174d.a(0, 1, null);
            V7.a aVarB = abstractC0056b.b();
            s9.d dVarH = aVarB != null ? Ne.f.h(aVarB, true, null, 2, null) : null;
            interfaceC3540l.U(-1925978955);
            if (dVarH != null) {
                aVar.g(AbstractC7930a.a(dVarH, interfaceC3540l, 0));
            }
            interfaceC3540l.J();
            V7.b bVarC = abstractC0056b.c();
            Integer numValueOf = bVarC != null ? Integer.valueOf(Ne.a.a(bVarC)) : null;
            interfaceC3540l.U(-1925976198);
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                if (aVar.j() > 0) {
                    aVar.i("  ");
                }
                aVar.g(AbstractC7930a.a(new d.b(iIntValue), interfaceC3540l, 0));
            }
            interfaceC3540l.J();
            C3174d c3174dP = aVar.p();
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
            interfaceC3540l.J();
            return c3174dP;
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return a((Context) obj, (InterfaceC3540l) obj2, ((Number) obj3).intValue());
        }
    }

    /* renamed from: s8.f$d */
    static final class d implements q {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s9.d f61408a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s9.d f61409b;

        d(s9.d dVar, s9.d dVar2) {
            this.f61408a = dVar;
            this.f61409b = dVar2;
        }

        public final CharSequence a(Context it, InterfaceC3540l interfaceC3540l, int i10) {
            AbstractC6492s.i(it, "it");
            interfaceC3540l.U(-2132670685);
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-2132670685, i10, -1, "com.ubnt.usurvey.ui.notification.NetworkConnectionNotificationServiceImpl.connectionFlowText.<anonymous> (NetworkConnectionNotificationServiceImpl.kt:56)");
            }
            String string = it.getString(R.string.network_connection_notification_subtitle_format);
            AbstractC6492s.h(string, "getString(...)");
            int i11 = i10 & 14;
            String str = String.format(string, Arrays.copyOf(new Object[]{this.f61408a.a(it, interfaceC3540l, i11), this.f61409b.a(it, interfaceC3540l, i11)}, 2));
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

    /* renamed from: s8.f$e */
    static final class e implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f61410a = new e();

        /* renamed from: s8.f$e$a */
        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f61411a;

            public a(List list) {
                this.f61411a = list;
            }

            @Override // gg.q
            public final void a(o oVar) {
                try {
                    AbstractC6492s.f(this.f61411a);
                    AbstractC5975a abstractC5975a = (AbstractC5975a) AbstractC3689v.D0(this.f61411a);
                    if (abstractC5975a != null) {
                        oVar.onSuccess(abstractC5975a);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(List it) {
            AbstractC6492s.i(it, "it");
            gg.n nVarC = gg.n.c(new a(it));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: s8.f$f, reason: collision with other inner class name */
    static final class C2140f implements n {

        /* renamed from: s8.f$f$a */
        static final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbstractC5975a f61413a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C7928f f61414b;

            /* renamed from: s8.f$f$a$a, reason: collision with other inner class name */
            public static final class C2141a implements gg.q {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC5975a f61415a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C7928f f61416b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ C3771a f61417c;

                public C2141a(AbstractC5975a abstractC5975a, C7928f c7928f, C3771a c3771a) {
                    this.f61415a = abstractC5975a;
                    this.f61416b = c7928f;
                    this.f61417c = c3771a;
                }

                @Override // gg.q
                public final void a(o oVar) {
                    Ge.a aVar;
                    try {
                        AbstractC5975a abstractC5975a = this.f61415a;
                        if (abstractC5975a instanceof AbstractC5975a.AbstractC1797a.b) {
                            String strJ = this.f61416b.j(this.f61415a);
                            d.b bVar = new d.b(R.string.network_connection_notification_title_wifi_connected);
                            C7928f c7928f = this.f61416b;
                            AbstractC5975a abstractC5975a2 = this.f61415a;
                            AbstractC6492s.f(this.f61417c);
                            aVar = new Ge.a(strJ, bVar, c7928f.h(abstractC5975a2, this.f61417c), this.f61416b.g(this.f61415a));
                        } else if (abstractC5975a instanceof AbstractC5975a.AbstractC1797a.c) {
                            String strJ2 = this.f61416b.j(this.f61415a);
                            d.b bVar2 = new d.b(R.string.network_connection_notification_title_wifi_ap_roaming);
                            C7928f c7928f2 = this.f61416b;
                            AbstractC5975a abstractC5975a3 = this.f61415a;
                            AbstractC6492s.f(this.f61417c);
                            aVar = new Ge.a(strJ2, bVar2, c7928f2.h(abstractC5975a3, this.f61417c), this.f61416b.g(this.f61415a));
                        } else {
                            if (!(abstractC5975a instanceof AbstractC5975a.AbstractC1797a.C1798a) && !(abstractC5975a instanceof AbstractC5975a.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            AbstractC5975a.d dVarA = abstractC5975a.a();
                            if (dVarA instanceof AbstractC5975a.d.AbstractC1799a.b) {
                                C7928f c7928f3 = this.f61416b;
                                AbstractC6492s.f(this.f61415a);
                                String strJ3 = c7928f3.j(this.f61415a);
                                d.b bVar3 = new d.b(R.string.network_connection_notification_title_wifi_disconnected);
                                C7928f c7928f4 = this.f61416b;
                                AbstractC6492s.f(this.f61415a);
                                AbstractC5975a abstractC5975a4 = this.f61415a;
                                AbstractC6492s.f(this.f61417c);
                                s9.d dVarH = c7928f4.h(abstractC5975a4, this.f61417c);
                                C7928f c7928f5 = this.f61416b;
                                AbstractC6492s.f(this.f61415a);
                                aVar = new Ge.a(strJ3, bVar3, dVarH, c7928f5.g(this.f61415a));
                            } else {
                                if (!(dVarA instanceof AbstractC5975a.d.b) && !(dVarA instanceof AbstractC5975a.d.AbstractC1799a.C1800a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar = null;
                            }
                        }
                        if (aVar != null) {
                            oVar.onSuccess(aVar);
                        } else {
                            oVar.a();
                        }
                    } catch (Throwable th2) {
                        oVar.onError(th2);
                    }
                }
            }

            a(AbstractC5975a abstractC5975a, C7928f c7928f) {
                this.f61413a = abstractC5975a;
                this.f61414b = c7928f;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r apply(C3771a devices) {
                AbstractC6492s.i(devices, "devices");
                gg.n nVarC = gg.n.c(new C2141a(this.f61413a, this.f61414b, devices));
                AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
                return nVarC;
            }
        }

        C2140f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r apply(AbstractC5975a roaming) {
            AbstractC6492s.i(roaming, "roaming");
            return C7928f.this.i().a().o0().u(new a(roaming, C7928f.this));
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: s8.f$g */
    public static final class g extends org.kodein.type.o<AbstractC5975a.c> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"org/kodein/type/TypeTokensJVMKt$generic$1", "Lorg/kodein/type/o;", "rj/w4", "kaverit"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: s8.f$h */
    public static final class h extends org.kodein.type.o<Cc.n> {
    }

    public C7928f(DI di2) {
        AbstractC6492s.i(di2, "di");
        org.kodein.type.i iVarE = s.e(new g().getSuperType());
        AbstractC6492s.g(iVarE, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        InterfaceC7810x2 interfaceC7810x2A = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE, AbstractC5975a.c.class), null);
        l[] lVarArr = f61399e;
        this.f61401a = interfaceC7810x2A.a(this, lVarArr[0]);
        org.kodein.type.i iVarE2 = s.e(new h().getSuperType());
        AbstractC6492s.g(iVarE2, "null cannot be cast to non-null type org.kodein.type.JVMTypeToken<T of org.kodein.type.TypeTokensJVMKt.generic>");
        this.f61402b = org.kodein.di.d.a(di2, new org.kodein.type.d(iVarE2, Cc.n.class), null).a(this, lVarArr[1]);
        i iVarI2 = k().a().v1(3000L, TimeUnit.MILLISECONDS).v0(e.f61410a).W().v0(new C2140f()).h1().i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f61403c = iVarI2;
    }

    private final s9.d f(AbstractC5975a.d dVar, C3771a c3771a) {
        String strD;
        String name;
        C3772b c3772bB;
        if (dVar instanceof AbstractC5975a.d.b) {
            return new d.b(R.string.connection_state_disconnected);
        }
        if (!(dVar instanceof AbstractC5975a.d.AbstractC1799a.b)) {
            if (dVar instanceof AbstractC5975a.d.AbstractC1799a.C1800a) {
                return new d.b(R.string.active_network_connection_type_cellular);
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC6492s.g(dVar, "null cannot be cast to non-null type com.ui.wifiman.model.network.roaming.AccessPointRoaming.State.Connected.Wifi");
        AbstractC5975a.d.AbstractC1799a.b bVar = (AbstractC5975a.d.AbstractC1799a.b) dVar;
        C5969a c5969aC = bVar.a().c();
        InterfaceC2557a.b bVar2 = (c5969aC == null || (c3772bB = C3772b.f25747c.b(c5969aC)) == null) ? null : (InterfaceC2557a.b) c3771a.a(c3772bB);
        if (bVar2 != null && (name = bVar2.getName()) != null) {
            return new d.c(name);
        }
        C5969a c5969aC2 = bVar.a().c();
        if (c5969aC2 == null || (strD = c5969aC2.d(":")) == null) {
            return null;
        }
        return new d.c(strD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s9.d g(AbstractC5975a abstractC5975a) {
        AbstractC5975a.d dVarC = abstractC5975a.c();
        if (dVarC instanceof AbstractC5975a.d.AbstractC1799a.b) {
            AbstractC5975a.d.AbstractC1799a.b bVar = (AbstractC5975a.d.AbstractC1799a.b) dVarC;
            S8.l lVarH = bVar.a().h();
            S8.c cVarB = bVar.a().b();
            Integer numD = bVar.a().d();
            if (lVarH == null && numD == null) {
                return null;
            }
            Integer numValueOf = lVarH != null ? Integer.valueOf(lVarH.b()) : null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(numValueOf);
            sb2.append(numD);
            return new d.a(sb2.toString(), new b(lVarH, numD, cVarB));
        }
        if (!(dVarC instanceof AbstractC5975a.d.AbstractC1799a.C1800a)) {
            if (dVarC instanceof AbstractC5975a.d.b) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC5975a.d dVarC2 = abstractC5975a.c();
        AbstractC6492s.g(dVarC2, "null cannot be cast to non-null type com.ui.wifiman.model.network.roaming.AccessPointRoaming.State.Connected.Cellular");
        a.b.AbstractC0054a.AbstractC0056b abstractC0056bA = ((AbstractC5975a.d.AbstractC1799a.C1800a) dVarC2).a();
        if (abstractC0056bA.b() == null && abstractC0056bA.c() == null) {
            return null;
        }
        V7.a aVarB = abstractC0056bA.b();
        V7.b bVarC = abstractC0056bA.c();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(aVarB);
        sb3.append(bVarC);
        return new d.a(sb3.toString(), new c(abstractC0056bA));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s9.d h(AbstractC5975a abstractC5975a, C3771a c3771a) {
        s9.d dVarF = f(abstractC5975a.a(), c3771a);
        s9.d dVarF2 = f(abstractC5975a.c(), c3771a);
        if (dVarF == null || dVarF2 == null) {
            if (dVarF2 == null) {
                return null;
            }
            return dVarF2;
        }
        int iHashCode = dVarF.hashCode();
        int iHashCode2 = dVarF2.hashCode();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(iHashCode);
        sb2.append(iHashCode2);
        return new d.a(sb2.toString(), new d(dVarF, dVarF2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Cc.n i() {
        return (Cc.n) this.f61402b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(AbstractC5975a abstractC5975a) {
        return String.valueOf(abstractC5975a.b());
    }

    private final AbstractC5975a.c k() {
        return (AbstractC5975a.c) this.f61401a.getValue();
    }

    @Override // s8.InterfaceC7927e
    public i a() {
        return this.f61403c;
    }
}
