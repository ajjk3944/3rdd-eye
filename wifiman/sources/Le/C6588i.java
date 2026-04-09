package le;

import S8.e;
import S8.j;
import S8.k;
import S8.l;
import Yg.m;
import Yg.n;
import a8.C3772b;
import com.ubnt.usurvey.wifi.WifiMcs;
import h9.C5969a;
import java.util.Set;
import ke.AbstractC6456a;
import ke.AbstractC6458c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mh.InterfaceC6824a;

/* renamed from: le.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6588i {

    /* renamed from: x, reason: collision with root package name */
    public static final a f52567x = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6458c f52568a;

    /* renamed from: b, reason: collision with root package name */
    private final C5969a f52569b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6456a f52570c;

    /* renamed from: d, reason: collision with root package name */
    private final S8.a f52571d;

    /* renamed from: e, reason: collision with root package name */
    private final S8.e f52572e;

    /* renamed from: f, reason: collision with root package name */
    private final l f52573f;

    /* renamed from: g, reason: collision with root package name */
    private final long f52574g;

    /* renamed from: h, reason: collision with root package name */
    private final j f52575h;

    /* renamed from: i, reason: collision with root package name */
    private final com.ui.wifiman.model.vendor.d f52576i;

    /* renamed from: j, reason: collision with root package name */
    private final Boolean f52577j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f52578k;

    /* renamed from: l, reason: collision with root package name */
    private final WifiMcs f52579l;

    /* renamed from: m, reason: collision with root package name */
    private final Integer f52580m;

    /* renamed from: n, reason: collision with root package name */
    private final Float f52581n;

    /* renamed from: o, reason: collision with root package name */
    private final Integer f52582o;

    /* renamed from: p, reason: collision with root package name */
    private final W7.a f52583p;

    /* renamed from: q, reason: collision with root package name */
    private final W7.a f52584q;

    /* renamed from: r, reason: collision with root package name */
    private final Set f52585r;

    /* renamed from: s, reason: collision with root package name */
    private final String f52586s;

    /* renamed from: t, reason: collision with root package name */
    private final C3772b f52587t;

    /* renamed from: u, reason: collision with root package name */
    private final String f52588u;

    /* renamed from: v, reason: collision with root package name */
    private final l f52589v;

    /* renamed from: w, reason: collision with root package name */
    private final m f52590w;

    /* renamed from: le.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C6588i(AbstractC6458c ssid, C5969a bssid, AbstractC6456a linkStatus, S8.a aVar, S8.e channel, l strength, long j10, j jVar, com.ui.wifiman.model.vendor.d dVar, Boolean bool, boolean z10, WifiMcs wifiMcs, Integer num, Float f10, Integer num2, W7.a aVar2, W7.a aVar3, Set affiliatedMloLinks) {
        String strA;
        AbstractC6492s.i(ssid, "ssid");
        AbstractC6492s.i(bssid, "bssid");
        AbstractC6492s.i(linkStatus, "linkStatus");
        AbstractC6492s.i(channel, "channel");
        AbstractC6492s.i(strength, "strength");
        AbstractC6492s.i(affiliatedMloLinks, "affiliatedMloLinks");
        this.f52568a = ssid;
        this.f52569b = bssid;
        this.f52570c = linkStatus;
        this.f52571d = aVar;
        this.f52572e = channel;
        this.f52573f = strength;
        this.f52574g = j10;
        this.f52575h = jVar;
        this.f52576i = dVar;
        this.f52577j = bool;
        this.f52578k = z10;
        this.f52579l = wifiMcs;
        this.f52580m = num;
        this.f52581n = f10;
        this.f52582o = num2;
        this.f52583p = aVar2;
        this.f52584q = aVar3;
        this.f52585r = affiliatedMloLinks;
        this.f52586s = k.b(bssid.d(":"));
        this.f52587t = C3772b.f25747c.b(bssid);
        if (ssid instanceof AbstractC6458c.a) {
            strA = S8.i.f20383b.b(((AbstractC6458c.a) ssid).b());
        } else {
            if (!(ssid instanceof AbstractC6458c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            strA = S8.i.f20383b.a(bssid);
        }
        this.f52588u = strA;
        this.f52589v = d() ? strength : null;
        this.f52590w = n.b(new InterfaceC6824a() { // from class: le.h
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return Double.valueOf(C6588i.b(this.f52566a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double b(C6588i c6588i) {
        int iD;
        double d10 = 20;
        e.b bVarE = c6588i.f52572e.e();
        if (bVarE instanceof e.b.C0729b) {
            iD = ((e.b.C0729b) bVarE).a();
        } else {
            if (!(bVarE instanceof e.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            iD = ((e.b.a) bVarE).d();
        }
        return Math.pow(10.0d, ((27.55d - (d10 * Math.log10(iD))) + Math.abs(c6588i.f52573f.b())) / 20.0d);
    }

    public final Set c() {
        return this.f52585r;
    }

    public final boolean d() {
        return this.f52574g > System.currentTimeMillis() - 75000;
    }

    public final C5969a e() {
        return this.f52569b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6588i)) {
            return false;
        }
        C6588i c6588i = (C6588i) obj;
        return AbstractC6492s.d(this.f52568a, c6588i.f52568a) && AbstractC6492s.d(this.f52569b, c6588i.f52569b) && AbstractC6492s.d(this.f52570c, c6588i.f52570c) && this.f52571d == c6588i.f52571d && AbstractC6492s.d(this.f52572e, c6588i.f52572e) && AbstractC6492s.d(this.f52573f, c6588i.f52573f) && this.f52574g == c6588i.f52574g && AbstractC6492s.d(this.f52575h, c6588i.f52575h) && AbstractC6492s.d(this.f52576i, c6588i.f52576i) && AbstractC6492s.d(this.f52577j, c6588i.f52577j) && this.f52578k == c6588i.f52578k && AbstractC6492s.d(this.f52579l, c6588i.f52579l) && AbstractC6492s.d(this.f52580m, c6588i.f52580m) && AbstractC6492s.d(this.f52581n, c6588i.f52581n) && AbstractC6492s.d(this.f52582o, c6588i.f52582o) && AbstractC6492s.d(this.f52583p, c6588i.f52583p) && AbstractC6492s.d(this.f52584q, c6588i.f52584q) && AbstractC6492s.d(this.f52585r, c6588i.f52585r);
    }

    public final S8.e f() {
        return this.f52572e;
    }

    public final Integer g() {
        return this.f52582o;
    }

    public final W7.a h() {
        return this.f52584q;
    }

    public int hashCode() {
        return k.e(this.f52586s);
    }

    public final C3772b i() {
        return this.f52587t;
    }

    public final double j() {
        return ((Number) this.f52590w.getValue()).doubleValue();
    }

    public final String k() {
        return this.f52586s;
    }

    public final S8.a l() {
        return this.f52571d;
    }

    public final AbstractC6456a m() {
        return this.f52570c;
    }

    public final WifiMcs n() {
        return this.f52579l;
    }

    public final String o() {
        return this.f52588u;
    }

    public final j p() {
        return this.f52575h;
    }

    public final l q() {
        return this.f52589v;
    }

    public final AbstractC6458c r() {
        return this.f52568a;
    }

    public final Integer s() {
        return this.f52580m;
    }

    public final Float t() {
        return this.f52581n;
    }

    public String toString() {
        return "WifiSignal(ssid=" + this.f52568a + ", bssid=" + this.f52569b + ", linkStatus=" + this.f52570c + ", ieeeMode=" + this.f52571d + ", channel=" + this.f52572e + ", strength=" + this.f52573f + ", lastSeenTimestamp=" + this.f52574g + ", securityType=" + this.f52575h + ", vendor=" + this.f52576i + ", wifiRTTSupport=" + this.f52577j + ", networkLinked=" + this.f52578k + ", mcs=" + this.f52579l + ", transmitPower=" + this.f52580m + ", utilization=" + this.f52581n + ", clientCount=" + this.f52582o + ", dataRateCapability=" + this.f52583p + ", dataRateOverallCapability=" + this.f52584q + ", affiliatedMloLinks=" + this.f52585r + ")";
    }

    public final com.ui.wifiman.model.vendor.d u() {
        return this.f52576i;
    }

    public final Boolean v() {
        return this.f52577j;
    }
}
