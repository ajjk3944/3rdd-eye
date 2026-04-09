package com.ui.wifiman.model.wmw;

import Mf.a;
import P7.c;
import Zg.AbstractC3689v;
import android.content.Context;
import cc.C4237a;
import cc.InterfaceC4238b;
import com.ui.common.semver.SemVer;
import com.ui.wifiman.model.ubiquiti.firmware.UbiquitiFirmwareClient;
import com.ui.wifiman.model.wmw.WifimanWizard;
import com.ui.wifiman.model.wmw.g;
import com.ui.wifiman.model.wmw.h;
import com.ui.wifiman.model.wmw.upgrade.WifimanWizardUpgradeForegroundService;
import com.ui.wmw.WMWizard;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.AbstractC5912b;
import gg.C;
import gg.D;
import gg.InterfaceC5910A;
import gg.InterfaceC5913c;
import gg.InterfaceC5915e;
import hg.InterfaceC6043c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kg.InterfaceC6464a;
import kg.InterfaceC6465b;
import kg.InterfaceC6469f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l9.C6556a;
import oh.AbstractC7137b;
import se.InterfaceC7944a;

/* loaded from: classes4.dex */
public final class h implements com.ui.wifiman.model.wmw.g, se.h {

    /* renamed from: n, reason: collision with root package name */
    public static final C5201a f44145n = new C5201a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f44146a;

    /* renamed from: b, reason: collision with root package name */
    private final WifimanWizard f44147b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4238b f44148c;

    /* renamed from: d, reason: collision with root package name */
    private final Wd.f f44149d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC7944a f44150e;

    /* renamed from: f, reason: collision with root package name */
    private final P7.a f44151f;

    /* renamed from: g, reason: collision with root package name */
    private final Fg.a f44152g;

    /* renamed from: h, reason: collision with root package name */
    private final Fg.a f44153h;

    /* renamed from: i, reason: collision with root package name */
    private final gg.i f44154i;

    /* renamed from: j, reason: collision with root package name */
    private final gg.i f44155j;

    /* renamed from: k, reason: collision with root package name */
    private final gg.i f44156k;

    /* renamed from: l, reason: collision with root package name */
    private final gg.i f44157l;

    /* renamed from: m, reason: collision with root package name */
    private final gg.i f44158m;

    static final class A implements kg.n {
        A() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(g.c it) {
            AbstractC6492s.i(it, "it");
            if (it instanceof g.c.b.AbstractC1535b.C1536b) {
                gg.i iVarU0 = gg.i.K0(it).U0(h.this.f44151f.d(new c.q.b()));
                AbstractC6492s.h(iVarU0, "mergeWith(...)");
                return iVarU0;
            }
            gg.i iVarK0 = gg.i.K0(it);
            AbstractC6492s.h(iVarK0, "just(...)");
            return iVarK0;
        }
    }

    public static final class B implements InterfaceC5915e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.b f44161b;

        public B(g.b bVar) {
            this.f44161b = bVar;
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                h.this.f44146a.startService(WifimanWizardUpgradeForegroundService.INSTANCE.d(h.this.f44146a, this.f44161b));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    /* renamed from: com.ui.wifiman.model.wmw.h$a, reason: case insensitive filesystem */
    public static final class C5201a {
        public /* synthetic */ C5201a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5201a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.ui.wifiman.model.wmw.h$b, reason: case insensitive filesystem */
    public static final class EnumC5202b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC5202b[] $VALUES;
        public static final EnumC5202b DOWNLOAD = new EnumC5202b("DOWNLOAD", 0);
        public static final EnumC5202b UPLOAD = new EnumC5202b("UPLOAD", 1);
        public static final EnumC5202b UPGRADE = new EnumC5202b("UPGRADE", 2);
        public static final EnumC5202b FINISH = new EnumC5202b("FINISH", 3);

        /* renamed from: com.ui.wifiman.model.wmw.h$b$a */
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f44162a;

            static {
                int[] iArr = new int[EnumC5202b.values().length];
                try {
                    iArr[EnumC5202b.DOWNLOAD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5202b.UPLOAD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5202b.UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC5202b.FINISH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f44162a = iArr;
            }
        }

        private static final /* synthetic */ EnumC5202b[] $values() {
            return new EnumC5202b[]{DOWNLOAD, UPLOAD, UPGRADE, FINISH};
        }

        static {
            EnumC5202b[] enumC5202bArr$values = $values();
            $VALUES = enumC5202bArr$values;
            $ENTRIES = AbstractC5827b.a(enumC5202bArr$values);
        }

        private EnumC5202b(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC5202b valueOf(String str) {
            return (EnumC5202b) Enum.valueOf(EnumC5202b.class, str);
        }

        public static EnumC5202b[] values() {
            return (EnumC5202b[]) $VALUES.clone();
        }

        public final float mapStageProgressToTotalProgress(float f10) {
            int i10 = a.f44162a[ordinal()];
            if (i10 == 1) {
                return f10 * 0.2f;
            }
            if (i10 == 2) {
                return (f10 * 0.55f) + 0.2f;
            }
            if (i10 == 3) {
                return (f10 * 0.25f) + 0.75f;
            }
            if (i10 == 4) {
                return 1.0f;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class c implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final c f44163a = new c();

        c() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(List it) {
            AbstractC6492s.i(it, "it");
            return new C6556a(AbstractC3689v.s0(it));
        }
    }

    static final class d implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final d f44164a = new d();

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f44165a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C6556a apply(Pf.a it) {
                AbstractC6492s.i(it, "it");
                return new C6556a(it.b());
            }
        }

        d() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(WifimanWizard.a state) {
            AbstractC6492s.i(state, "state");
            if ((state instanceof WifimanWizard.a.c) || (state instanceof WifimanWizard.a.b) || (state instanceof WifimanWizard.a.AbstractC1520a.b) || (state instanceof WifimanWizard.a.AbstractC1520a.c) || (state instanceof WifimanWizard.a.AbstractC1520a.d)) {
                gg.i iVarK0 = gg.i.K0(new C6556a(null));
                AbstractC6492s.h(iVarK0, "just(...)");
                return iVarK0;
            }
            if (!(state instanceof WifimanWizard.a.AbstractC1520a.C1521a)) {
                throw new NoWhenBranchMatchedException();
            }
            gg.i iVarN0 = ((WifimanWizard.a.AbstractC1520a.C1521a) state).b().a().N0(a.f44165a);
            AbstractC6492s.h(iVarN0, "map(...)");
            return iVarN0;
        }
    }

    static final class e implements kg.n {

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f44167a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ SemVer f44168b;

            /* renamed from: com.ui.wifiman.model.wmw.h$e$a$a, reason: collision with other inner class name */
            static final class C1538a implements kg.n {

                /* renamed from: a, reason: collision with root package name */
                public static final C1538a f44169a = new C1538a();

                C1538a() {
                }

                @Override // kg.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean apply(com.ubnt.usurvey.a it) {
                    AbstractC6492s.i(it, "it");
                    return Boolean.valueOf(it.s());
                }
            }

            static final class b implements InterfaceC6465b {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ g.b f44170a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ SemVer f44171b;

                b(g.b bVar, SemVer semVer) {
                    this.f44170a = bVar;
                    this.f44171b = semVer;
                }

                @Override // kg.InterfaceC6465b
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g.a apply(Boolean upgradeAlwaysRecommended, C6556a c6556a) {
                    AbstractC6492s.i(upgradeAlwaysRecommended, "upgradeAlwaysRecommended");
                    AbstractC6492s.i(c6556a, "<destruct>");
                    SemVer semVer = (SemVer) c6556a.a();
                    if (this.f44170a == null || (!upgradeAlwaysRecommended.booleanValue() && this.f44170a.c().compareTo(this.f44171b) <= 0)) {
                        return g.a.b.f44120a;
                    }
                    g.b bVar = this.f44170a;
                    return new g.a.C1534a(bVar, AbstractC6492s.d(semVer, bVar.c()));
                }
            }

            a(h hVar, SemVer semVer) {
                this.f44167a = hVar;
                this.f44168b = semVer;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(C6556a c6556a) {
                AbstractC6492s.i(c6556a, "<destruct>");
                return gg.i.v(com.ubnt.usurvey.a.f39654r.a().b().N0(C1538a.f44169a), this.f44167a.f44155j, new b((g.b) c6556a.a(), this.f44168b));
            }
        }

        e() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            SemVer semVer = (SemVer) c6556a.a();
            if (semVer != null) {
                gg.i iVarI1 = h.this.f44150e.a().I1(new a(h.this, semVer));
                AbstractC6492s.f(iVarI1);
                return iVarI1;
            }
            gg.i iVarK0 = gg.i.K0(g.a.c.f44121a);
            AbstractC6492s.f(iVarK0);
            return iVarK0;
        }
    }

    public static final class f implements InterfaceC5915e {
        public f() {
        }

        @Override // gg.InterfaceC5915e
        public final void a(InterfaceC5913c interfaceC5913c) {
            try {
                h.this.f44153h.h(new C6556a(null));
                interfaceC5913c.a();
            } catch (Throwable th2) {
                interfaceC5913c.onError(th2);
            }
        }
    }

    static final class g implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final g f44173a = new g();

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C4237a f44174a;

            public a(C4237a c4237a) {
                this.f44174a = c4237a;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    C4237a c4237a = this.f44174a;
                    if (c4237a != null) {
                        oVar.onSuccess(c4237a);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        g() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            gg.n nVarC = gg.n.c(new a((C4237a) c6556a.a()));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    /* renamed from: com.ui.wifiman.model.wmw.h$h, reason: collision with other inner class name */
    static final class C1539h implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final C1539h f44175a = new C1539h();

        C1539h() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C4237a adoption) {
            AbstractC6492s.i(adoption, "adoption");
            String strC = adoption.c();
            return new C6556a(strC != null ? SemVer.f41336i.b(strC) : null);
        }
    }

    static final class i implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final i f44176a = new i();

        public static final class a implements gg.q {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f44177a;

            public a(List list) {
                this.f44177a = list;
            }

            @Override // gg.q
            public final void a(gg.o oVar) {
                try {
                    AbstractC6492s.f(this.f44177a);
                    C4237a c4237a = (C4237a) AbstractC3689v.s0(this.f44177a);
                    if (c4237a != null) {
                        oVar.onSuccess(c4237a);
                    } else {
                        oVar.a();
                    }
                } catch (Throwable th2) {
                    oVar.onError(th2);
                }
            }
        }

        i() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(List it) {
            AbstractC6492s.i(it, "it");
            gg.n nVarC = gg.n.c(new a(it));
            AbstractC6492s.h(nVarC, "crossinline action: () -…or(error)\n        }\n    }");
            return nVarC;
        }
    }

    static final class j implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.b f44179b;

        public static final class a implements InterfaceC5915e {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h f44180a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C4237a f44181b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ g.b f44182c;

            public a(h hVar, C4237a c4237a, g.b bVar) {
                this.f44180a = hVar;
                this.f44181b = c4237a;
                this.f44182c = bVar;
            }

            @Override // gg.InterfaceC5915e
            public final void a(InterfaceC5913c interfaceC5913c) {
                try {
                    this.f44180a.f44148c.b(C4237a.b(this.f44181b, 0, null, null, this.f44182c.c().toString(), 7, null));
                    Z7.b.h("WMW - Firmware " + this.f44182c.c() + " MARKED as seen", null, 2, null);
                    interfaceC5913c.a();
                } catch (Throwable th2) {
                    interfaceC5913c.onError(th2);
                }
            }
        }

        j(g.b bVar) {
            this.f44179b = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(C4237a adoption) {
            AbstractC6492s.i(adoption, "adoption");
            AbstractC5912b abstractC5912bR = AbstractC5912b.r(new a(h.this, adoption, this.f44179b));
            AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
            return abstractC5912bR.W(Gg.a.d());
        }
    }

    static final class k implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.b f44183a;

        k(g.b bVar) {
            this.f44183a = bVar;
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(InterfaceC6043c it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h("WMW - Marking firmware " + this.f44183a.c() + " as seen", null, 2, null);
        }
    }

    static final class l implements kg.n {
        l() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.f apply(g.a availability) {
            AbstractC6492s.i(availability, "availability");
            if (availability instanceof g.a.C1534a) {
                return h.this.v(((g.a.C1534a) availability).a());
            }
            if ((availability instanceof g.a.b) || (availability instanceof g.a.c)) {
                return AbstractC5912b.m();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class m implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final m f44185a = new m();

        m() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof TimeoutException ? gg.z.p(new WifimanWizard.Error.Upgrade.Failed("Failed to obtain FW api in specified timeout", error)) : gg.z.p(error);
        }
    }

    static final class n implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.b f44186a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f44187b;

        n(g.b bVar, h hVar) {
            this.f44186a = bVar;
            this.f44187b = hVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(UbiquitiFirmwareClient client) {
            AbstractC6492s.i(client, "client");
            return client.c(this.f44186a.a(), this.f44187b.u(this.f44186a));
        }
    }

    static final class o implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final o f44188a = new o();

        o() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof UbiquitiFirmwareClient.Error ? gg.i.k0(new WifimanWizard.Error.Upgrade.Failed("Failed to download fw", error)) : gg.i.k0(error);
        }
    }

    static final class p implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.b f44189a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f44190b;

        p(g.b bVar, long j10) {
            this.f44189a = bVar;
            this.f44190b = j10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g.c.b.a apply(Float progress) {
            AbstractC6492s.i(progress, "progress");
            return new g.c.b.a(this.f44189a.c(), this.f44190b, this.f44189a.a().c(), AbstractC7137b.g(this.f44189a.a().c() * progress.floatValue()), EnumC5202b.DOWNLOAD.mapStageProgressToTotalProgress(progress.floatValue()));
        }
    }

    public static final class q implements C {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.b f44192b;

        public q(g.b bVar) {
            this.f44192b = bVar;
        }

        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(new Mf.a(r0.available(), new BufferedInputStream(new FileInputStream(h.this.u(this.f44192b)), 8192)));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class r implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.b f44194b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f44195c;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f44196a = new a();

            a() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final gg.r apply(WifimanWizard.a state) {
                AbstractC6492s.i(state, "state");
                if ((state instanceof WifimanWizard.a.c) || (state instanceof WifimanWizard.a.b)) {
                    return gg.n.i(new WifimanWizard.Error.NoDeviceAdopted("No device adopted while doing FW upgrade"));
                }
                if ((state instanceof WifimanWizard.a.AbstractC1520a.b) || (state instanceof WifimanWizard.a.AbstractC1520a.c) || (state instanceof WifimanWizard.a.AbstractC1520a.d)) {
                    return gg.n.h();
                }
                if (state instanceof WifimanWizard.a.AbstractC1520a.C1521a) {
                    return gg.n.o(((WifimanWizard.a.AbstractC1520a.C1521a) state).b());
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        static final class b implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f44197a = new b();

            b() {
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                return error instanceof TimeoutException ? gg.z.p(new WifimanWizard.Error.Upgrade.DeviceUnavailable("FW upgrade cannot be started since device was not found with timeout 10000")) : gg.z.p(error);
            }
        }

        static final class c implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Mf.a f44198a;

            c(Mf.a aVar) {
                this.f44198a = aVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(com.ui.wmw.g session) {
                AbstractC6492s.i(session, "session");
                a.InterfaceC0524a interfaceC0524aB = session.b();
                Mf.a aVar = this.f44198a;
                AbstractC6492s.f(aVar);
                return interfaceC0524aB.b(aVar);
            }
        }

        static final class d implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g.b f44199a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f44200b;

            d(g.b bVar, long j10) {
                this.f44199a = bVar;
                this.f44200b = j10;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g.c.b.d apply(a.b it) {
                AbstractC6492s.i(it, "it");
                if (it instanceof a.b.C0526b) {
                    return new g.c.b.d(this.f44199a.c(), this.f44200b, it.b(), it.c(), EnumC5202b.UPLOAD.mapStageProgressToTotalProgress(it.c() / it.b()));
                }
                if (!(it instanceof a.b.C0525a)) {
                    throw new NoWhenBranchMatchedException();
                }
                a.b.C0525a c0525a = (a.b.C0525a) it;
                return new g.c.b.d(this.f44199a.c(), this.f44200b, c0525a.b(), c0525a.c(), EnumC5202b.UPLOAD.mapStageProgressToTotalProgress(1.0f));
            }
        }

        r(g.b bVar, long j10) {
            this.f44194b = bVar;
            this.f44195c = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Mf.a aVar) throws IOException {
            try {
                aVar.b().close();
            } catch (IOException e10) {
                Z7.b.j("Failed to close FW file", e10, null, 4, null);
            }
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(final Mf.a fw) {
            AbstractC6492s.i(fw, "fw");
            return h.this.f44147b.getState().M1(a.f44196a).o0().Q(10000L, TimeUnit.MILLISECONDS).F(b.f44197a).w(new c(fw)).N0(new d(this.f44194b, this.f44195c)).Z(new InterfaceC6464a() { // from class: com.ui.wifiman.model.wmw.i
                @Override // kg.InterfaceC6464a
                public final void run() throws IOException {
                    h.r.c(fw);
                }
            }).z1(new g.c.b.d(this.f44194b.c(), this.f44195c, fw.a(), 0L, EnumC5202b.UPLOAD.mapStageProgressToTotalProgress(0.0f)));
        }
    }

    static final class s implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.b f44201a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f44202b;

        s(g.b bVar, long j10) {
            this.f44201a = bVar;
            this.f44202b = j10;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g.c.b.C1537c apply(Long it) {
            AbstractC6492s.i(it, "it");
            return new g.c.b.C1537c(this.f44201a.c(), this.f44202b, EnumC5202b.UPGRADE.mapStageProgressToTotalProgress((it.longValue() * 200) / 180000));
        }
    }

    static final class t implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final t f44203a = new t();

        t() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gg.r apply(WifimanWizard.a state) {
            AbstractC6492s.i(state, "state");
            if ((state instanceof WifimanWizard.a.c) || (state instanceof WifimanWizard.a.b)) {
                return gg.n.i(new WifimanWizard.Error.NoDeviceAdopted("No device adopted while doing FW upgrade"));
            }
            if ((state instanceof WifimanWizard.a.AbstractC1520a.b) || (state instanceof WifimanWizard.a.AbstractC1520a.c) || (state instanceof WifimanWizard.a.AbstractC1520a.d)) {
                return gg.n.h();
            }
            if (state instanceof WifimanWizard.a.AbstractC1520a.C1521a) {
                return gg.n.o(((WifimanWizard.a.AbstractC1520a.C1521a) state).b());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static final class u implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final u f44204a = new u();

        u() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(Throwable error) {
            AbstractC6492s.i(error, "error");
            return error instanceof TimeoutException ? gg.z.p(new WifimanWizard.Error.Upgrade.Failed("Device not reachable after 180000ms since upload was completed.", null, 2, null)) : gg.z.p(error);
        }
    }

    static final class v implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.b f44205a;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g.b f44206a;

            /* renamed from: com.ui.wifiman.model.wmw.h$v$a$a, reason: collision with other inner class name */
            public static final class C1540a implements C {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ Pf.a f44207a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ g.b f44208b;

                public C1540a(Pf.a aVar, g.b bVar) {
                    this.f44207a = aVar;
                    this.f44208b = bVar;
                }

                @Override // gg.C
                public final void a(InterfaceC5910A interfaceC5910A) {
                    try {
                        if (AbstractC6492s.d(this.f44207a.b(), this.f44208b.c())) {
                            interfaceC5910A.onSuccess(this.f44207a);
                            return;
                        }
                        throw new WifimanWizard.Error.Upgrade.Failed("FW version after successfull firmware upgrade was " + this.f44207a.b() + ", but expected was " + this.f44208b.c(), null, 2, null);
                    } catch (Throwable th2) {
                        interfaceC5910A.onError(th2);
                    }
                }
            }

            a(g.b bVar) {
                this.f44206a = bVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final D apply(Pf.a status) {
                AbstractC6492s.i(status, "status");
                gg.z zVarI = gg.z.i(new C1540a(status, this.f44206a));
                AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
                return zVarI;
            }
        }

        v(g.b bVar) {
            this.f44205a = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D apply(com.ui.wmw.g it) {
            AbstractC6492s.i(it, "it");
            return it.a().x0(new a(this.f44205a)).o0();
        }
    }

    public static final class w implements C {
        @Override // gg.C
        public final void a(InterfaceC5910A interfaceC5910A) {
            try {
                interfaceC5910A.onSuccess(Long.valueOf(System.currentTimeMillis()));
            } catch (Throwable th2) {
                interfaceC5910A.onError(th2);
            }
        }
    }

    static final class x implements kg.n {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.b f44210b;

        static final class a implements kg.n {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Long f44211a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ g.b f44212b;

            a(Long l10, g.b bVar) {
                this.f44211a = l10;
                this.f44212b = bVar;
            }

            @Override // kg.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Dj.a apply(Throwable error) {
                AbstractC6492s.i(error, "error");
                if (!(error instanceof WMWizard.Error) && !(error instanceof WifimanWizard.Error)) {
                    return gg.i.k0(error);
                }
                Long l10 = this.f44211a;
                AbstractC6492s.f(l10);
                g.c.b.AbstractC1535b.a aVar = new g.c.b.AbstractC1535b.a(this.f44212b.c(), l10.longValue(), new WifimanWizard.Error.Upgrade.Failed("Firmware upgrade failed", error));
                Z7.b.j("WMW Upgrade failed", error, null, 4, null);
                return gg.i.K0(aVar);
            }
        }

        x(g.b bVar) {
            this.f44210b = bVar;
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Dj.a apply(Long startedAt) {
            AbstractC6492s.i(startedAt, "startedAt");
            return gg.i.A(h.this.w(this.f44210b, startedAt.longValue()), h.this.x(this.f44210b, startedAt.longValue()), h.this.y(this.f44210b, startedAt.longValue()), gg.i.K0(new g.c.b.AbstractC1535b.C1536b(this.f44210b.c(), startedAt.longValue()))).f1(new a(startedAt, this.f44210b));
        }
    }

    static final class y implements InterfaceC6469f {
        y() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(g.c it) {
            AbstractC6492s.i(it, "it");
            h.this.A(it);
        }
    }

    static final class z implements kg.p {

        /* renamed from: a, reason: collision with root package name */
        public static final z f44214a = new z();

        z() {
        }

        @Override // kg.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean test(g.c it) {
            AbstractC6492s.i(it, "it");
            return it instanceof g.c.b.AbstractC1535b;
        }
    }

    public h(Context context, WifimanWizard wizard, InterfaceC4238b adoptionDao, Wd.f fwService, InterfaceC7944a wizardFwService, P7.a analytics) {
        AbstractC6492s.i(context, "context");
        AbstractC6492s.i(wizard, "wizard");
        AbstractC6492s.i(adoptionDao, "adoptionDao");
        AbstractC6492s.i(fwService, "fwService");
        AbstractC6492s.i(wizardFwService, "wizardFwService");
        AbstractC6492s.i(analytics, "analytics");
        this.f44146a = context;
        this.f44147b = wizard;
        this.f44148c = adoptionDao;
        this.f44149d = fwService;
        this.f44150e = wizardFwService;
        this.f44151f = analytics;
        Fg.a aVarK2 = Fg.a.k2(g.c.a.f44124a);
        AbstractC6492s.h(aVarK2, "createDefault(...)");
        this.f44152g = aVarK2;
        Fg.a aVarK22 = Fg.a.k2(new C6556a(null));
        AbstractC6492s.h(aVarK22, "createDefault(...)");
        this.f44153h = aVarK22;
        gg.i iVarI2 = adoptionDao.a().X0(Gg.a.a()).W().N0(c.f44163a).F1(Gg.a.d()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f44154i = iVarI2;
        gg.i iVarW = iVarI2.v0(g.f44173a).N0(C1539h.f44175a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f44155j = iVarW;
        gg.i iVarI22 = aVarK2.W().e1().Y0(Gg.a.a(), false, 1).p0(new A()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f44156k = iVarI22;
        gg.i iVarI23 = aVarK22.W().e1().Y0(Gg.a.a(), false, 1).o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f44157l = iVarI23;
        gg.i iVarI24 = wizard.getState().I1(d.f44164a).W().I1(new e()).z1(g.a.c.f44121a).W().o1(1).i2();
        AbstractC6492s.h(iVarI24, "refCount(...)");
        this.f44158m = iVarI24;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(g.c cVar) {
        Z7.b.h("WMW Upgrade process state - " + cVar, null, 2, null);
        this.f44152g.h(cVar);
        if (cVar instanceof g.c.b.AbstractC1535b) {
            this.f44153h.h(new C6556a(cVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File u(g.b bVar) {
        return new File(this.f44146a.getCacheDir(), "fw_" + bVar.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5912b v(g.b bVar) {
        AbstractC5912b abstractC5912bW = this.f44148c.a().X0(Gg.a.a()).o0().u(i.f44176a).k(new j(bVar)).B(new k(bVar)).W(Gg.a.d());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i w(g.b bVar, long j10) {
        gg.i iVarZ1 = this.f44149d.getClient().o0().Q(10000L, TimeUnit.MILLISECONDS).F(m.f44185a).w(new n(bVar, this)).f1(o.f44188a).N0(new p(bVar, j10)).z1(new g.c.b.a(bVar.c(), j10, bVar.a().c(), 0L, EnumC5202b.DOWNLOAD.mapStageProgressToTotalProgress(0.0f)));
        AbstractC6492s.h(iVarZ1, "startWithItem(...)");
        return iVarZ1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i x(g.b bVar, long j10) {
        gg.z zVarI = gg.z.i(new q(bVar));
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarW = zVarI.w(new r(bVar, j10));
        AbstractC6492s.h(iVarW, "flatMapPublisher(...)");
        return iVarW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gg.i y(g.b bVar, long j10) {
        gg.i iVarK0 = gg.i.K0(new g.c.b.C1537c(bVar.c(), j10, EnumC5202b.UPGRADE.mapStageProgressToTotalProgress(0.0f)));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gg.i iVarA = gg.i.A(iVarK0, gg.i.F0(0L, 200L, timeUnit).N0(new s(bVar, j10)).e1().Y0(Gg.a.a(), false, 1).Q1(AbstractC5912b.a0(20000L, timeUnit).h(this.f44147b.getState()).M1(t.f44203a).o0().Q(180000L, timeUnit).F(u.f44204a).s(new v(bVar)).W()), gg.i.K0(new g.c.b.C1537c(bVar.c(), j10, 1.0f)));
        AbstractC6492s.h(iVarA, "concatArray(...)");
        return iVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(h hVar) {
        hVar.A(g.c.a.f44124a);
    }

    @Override // com.ui.wifiman.model.wmw.g
    public gg.i a() {
        return this.f44158m;
    }

    @Override // se.h
    public gg.i b(g.b firmware) {
        AbstractC6492s.i(firmware, "firmware");
        gg.z zVarI = gg.z.i(new w());
        AbstractC6492s.h(zVarI, "crossinline action: () -…or(error)\n        }\n    }");
        gg.i iVarY0 = zVarI.w(new x(firmware)).f0(new y()).U0(this.f44147b.c()).R1(z.f44214a).Z(new InterfaceC6464a() { // from class: qe.k
            @Override // kg.InterfaceC6464a
            public final void run() {
                com.ui.wifiman.model.wmw.h.z(this.f58656a);
            }
        }).W().e1().Y0(Gg.a.a(), false, 1);
        AbstractC6492s.h(iVarY0, "observeOn(...)");
        return iVarY0;
    }

    @Override // com.ui.wifiman.model.wmw.g
    public AbstractC5912b c() {
        AbstractC5912b abstractC5912bT = a().o0().t(new l());
        AbstractC6492s.h(abstractC5912bT, "flatMapCompletable(...)");
        return abstractC5912bT;
    }

    @Override // com.ui.wifiman.model.wmw.g
    public AbstractC5912b d(g.b firmware) {
        AbstractC6492s.i(firmware, "firmware");
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new B(firmware));
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        return abstractC5912bR;
    }

    @Override // com.ui.wifiman.model.wmw.g
    public AbstractC5912b e() {
        AbstractC5912b abstractC5912bR = AbstractC5912b.r(new f());
        AbstractC6492s.h(abstractC5912bR, "crossinline action: () -…or(error)\n        }\n    }");
        AbstractC5912b abstractC5912bW = abstractC5912bR.W(Gg.a.a());
        AbstractC6492s.h(abstractC5912bW, "subscribeOn(...)");
        return abstractC5912bW;
    }

    @Override // com.ui.wifiman.model.wmw.g
    public gg.i f() {
        return this.f44157l;
    }

    @Override // com.ui.wifiman.model.wmw.g
    public gg.i getState() {
        return this.f44156k;
    }
}
