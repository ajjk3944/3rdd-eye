package je;

import Zg.d0;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import gg.EnumC5911a;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import je.AbstractC6317r;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: je.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6296B implements u {

    /* renamed from: g, reason: collision with root package name */
    public static final a f50732g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final WifiManager f50733a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6300a f50734b;

    /* renamed from: c, reason: collision with root package name */
    private final T7.a f50735c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f50736d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f50737e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f50738f;

    /* renamed from: je.B$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: je.B$b */
    static final class b implements kg.n {
        b() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC6317r apply(Long it) {
            AbstractC6492s.i(it, "it");
            return C6296B.this.h();
        }
    }

    public C6296B(WifiManager wifiManager, InterfaceC6300a wifiInfoParser, T7.a sdkVersion, fe.u schedulers) {
        AbstractC6492s.i(wifiManager, "wifiManager");
        AbstractC6492s.i(wifiInfoParser, "wifiInfoParser");
        AbstractC6492s.i(sdkVersion, "sdkVersion");
        AbstractC6492s.i(schedulers, "schedulers");
        this.f50733a = wifiManager;
        this.f50734b = wifiInfoParser;
        this.f50735c = sdkVersion;
        gg.k kVar = new gg.k() { // from class: je.z
            @Override // gg.k
            public final void a(gg.j jVar) {
                C6296B.i(this.f50810a, jVar);
            }
        };
        EnumC5911a enumC5911a = EnumC5911a.LATEST;
        gg.i iVarI2 = gg.i.N(kVar, enumC5911a).F1(schedulers.a()).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f50736d = iVarI2;
        gg.i iVarI22 = gg.i.N(new gg.k() { // from class: je.A
            @Override // gg.k
            public final void a(gg.j jVar) {
                C6296B.j(this.f50731a, jVar);
            }
        }, enumC5911a).F1(schedulers.a()).o1(1).i2();
        AbstractC6492s.h(iVarI22, "refCount(...)");
        this.f50737e = iVarI22;
        gg.i iVarI23 = gg.i.G0(0L, 200L, TimeUnit.MILLISECONDS, schedulers.a()).e1().Y0(schedulers.a(), false, 1).N0(new b()).W().o1(1).i2();
        AbstractC6492s.h(iVarI23, "refCount(...)");
        this.f50738f = iVarI23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC6317r h() {
        if (!this.f50733a.isWifiEnabled()) {
            return AbstractC6317r.a.f50770a;
        }
        InterfaceC6300a interfaceC6300a = this.f50734b;
        WifiInfo connectionInfo = this.f50733a.getConnectionInfo();
        AbstractC6492s.h(connectionInfo, "getConnectionInfo(...)");
        return interfaceC6300a.a(connectionInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C6296B c6296b, gg.j it) {
        AbstractC6492s.i(it, "it");
        Set setB = d0.b();
        setB.add(S8.c.GHZ_2_4);
        setB.add(S8.c.GHZ_5);
        if (c6296b.f50735c.b(30) && c6296b.f50733a.is6GHzBandSupported()) {
            setB.add(S8.c.GHZ_6);
        }
        it.h(d0.a(setB));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C6296B c6296b, gg.j it) {
        AbstractC6492s.i(it, "it");
        Set setB = d0.b();
        if (c6296b.f50735c.b(30)) {
            if (c6296b.f50733a.isWifiStandardSupported(1)) {
                setB.add(S8.a.f20354A);
                setB.add(S8.a.f20355B);
                setB.add(S8.a.f20356G);
            }
            if (c6296b.f50733a.isWifiStandardSupported(4)) {
                setB.add(S8.a.f20357N);
            }
            if (c6296b.f50733a.isWifiStandardSupported(5)) {
                setB.add(S8.a.AC);
            }
            if (c6296b.f50733a.isWifiStandardSupported(6)) {
                setB.add(S8.a.AX);
            }
            if (c6296b.f50733a.isWifiStandardSupported(8)) {
                setB.add(S8.a.BE);
            }
        }
        it.h(d0.a(setB));
    }

    @Override // je.u
    public gg.i a() {
        return this.f50738f;
    }

    public final S8.j e(S8.j securityFromWifiInfo, S8.j securityFromWifiScan) {
        AbstractC6492s.i(securityFromWifiInfo, "securityFromWifiInfo");
        AbstractC6492s.i(securityFromWifiScan, "securityFromWifiScan");
        return this.f50734b.b(securityFromWifiInfo, securityFromWifiScan);
    }

    public gg.i f() {
        return this.f50736d;
    }

    public gg.i g() {
        return this.f50737e;
    }
}
