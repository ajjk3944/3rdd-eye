package je;

import Zg.AbstractC3689v;
import Zg.U;
import be.InterfaceC4091e;
import ce.ApiNetworkWifimanDeviceInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.AbstractC6317r;
import je.v;
import kg.InterfaceC6469f;
import kotlin.jvm.internal.AbstractC6492s;
import l9.C6556a;
import le.C6588i;
import le.InterfaceC6586g;
import mh.InterfaceC6835l;
import zi.AbstractC8783m;
import zi.InterfaceC8780j;

/* loaded from: classes4.dex */
public final class v implements u {

    /* renamed from: a, reason: collision with root package name */
    private final C6296B f50792a;

    /* renamed from: b, reason: collision with root package name */
    private final gg.i f50793b;

    /* renamed from: c, reason: collision with root package name */
    private final gg.i f50794c;

    /* renamed from: d, reason: collision with root package name */
    private final gg.i f50795d;

    /* renamed from: e, reason: collision with root package name */
    private final gg.i f50796e;

    /* renamed from: f, reason: collision with root package name */
    private final gg.i f50797f;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final S8.a f50798a;

        /* renamed from: b, reason: collision with root package name */
        private final S8.j f50799b;

        /* renamed from: c, reason: collision with root package name */
        private final C6316q f50800c;

        public a(S8.a aVar, S8.j jVar, C6316q link) {
            AbstractC6492s.i(link, "link");
            this.f50798a = aVar;
            this.f50799b = jVar;
            this.f50800c = link;
        }

        public final S8.a a() {
            return this.f50798a;
        }

        public final C6316q b() {
            return this.f50800c;
        }

        public final S8.j c() {
            return this.f50799b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f50798a == aVar.f50798a && AbstractC6492s.d(this.f50799b, aVar.f50799b) && AbstractC6492s.d(this.f50800c, aVar.f50800c);
        }

        public int hashCode() {
            S8.a aVar = this.f50798a;
            int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            S8.j jVar = this.f50799b;
            return ((iHashCode + (jVar != null ? jVar.hashCode() : 0)) * 31) + this.f50800c.hashCode();
        }

        public String toString() {
            return "WifiScanLinkInfo(ieeeMode=" + this.f50798a + ", security=" + this.f50799b + ", link=" + this.f50800c + ")";
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final S8.c f50801a;

        /* renamed from: b, reason: collision with root package name */
        private final S8.a f50802b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f50803c;

        /* renamed from: d, reason: collision with root package name */
        private final W7.b f50804d;

        /* renamed from: e, reason: collision with root package name */
        private final S8.d f50805e;

        public b(S8.c band, S8.a aVar, Integer num, W7.b bVar, S8.d dVar) {
            AbstractC6492s.i(band, "band");
            this.f50801a = band;
            this.f50802b = aVar;
            this.f50803c = num;
            this.f50804d = bVar;
            this.f50805e = dVar;
        }

        public final S8.c a() {
            return this.f50801a;
        }

        public final S8.d b() {
            return this.f50805e;
        }

        public final Integer c() {
            return this.f50803c;
        }

        public final S8.a d() {
            return this.f50802b;
        }

        public final W7.b e() {
            return this.f50804d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f50801a == bVar.f50801a && this.f50802b == bVar.f50802b && AbstractC6492s.d(this.f50803c, bVar.f50803c) && AbstractC6492s.d(this.f50804d, bVar.f50804d) && this.f50805e == bVar.f50805e;
        }

        public int hashCode() {
            int iHashCode = this.f50801a.hashCode() * 31;
            S8.a aVar = this.f50802b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Integer num = this.f50803c;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            W7.b bVar = this.f50804d;
            int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            S8.d dVar = this.f50805e;
            return iHashCode4 + (dVar != null ? dVar.hashCode() : 0);
        }

        public String toString() {
            return "WifimanApiLinkInfo(band=" + this.f50801a + ", ieeeMode=" + this.f50802b + ", channelNum=" + this.f50803c + ", phyRate=" + this.f50804d + ", bandwidth=" + this.f50805e + ")";
        }
    }

    static final class c implements kg.g {
        c() {
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[PHI: r0
  0x0050: PHI (r0v13 S8.a) = (r0v12 S8.a), (r0v17 S8.a), (r0v18 S8.a) binds: [B:14:0x003e, B:18:0x0048, B:20:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0099 A[PHI: r3
  0x0099: PHI (r3v1 S8.a) = (r3v0 S8.a), (r3v14 S8.a), (r3v15 S8.a) binds: [B:30:0x0087, B:34:0x0091, B:36:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kg.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final je.AbstractC6317r a(je.AbstractC6317r r13, l9.C6556a r14, java.util.Map r15) {
            /*
                Method dump skipped, instructions count: 342
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: je.v.c.a(je.r, l9.a, java.util.Map):je.r");
        }
    }

    static final class d implements InterfaceC6469f {

        /* renamed from: a, reason: collision with root package name */
        public static final d f50807a = new d();

        d() {
        }

        @Override // kg.InterfaceC6469f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(AbstractC6317r it) {
            AbstractC6492s.i(it, "it");
            Z7.b.h(String.valueOf(it), null, 2, null);
        }
    }

    static final class e implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final e f50808a = new e();

        e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a c(C6588i it) {
            AbstractC6492s.i(it, "it");
            return new a(it.l(), it.p(), new C6316q(it.f().a(), it.e(), null, null, Integer.valueOf(it.f().d()), it.f().b(), it.m()));
        }

        @Override // kg.n
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Map apply(List signals) {
            AbstractC6492s.i(signals, "signals");
            if (signals.isEmpty()) {
                return U.h();
            }
            InterfaceC8780j interfaceC8780jN = AbstractC8783m.N(AbstractC3689v.d0(signals), new InterfaceC6835l() { // from class: je.w
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return v.e.c((C6588i) obj);
                }
            });
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : interfaceC8780jN) {
                linkedHashMap.put(((a) obj).b().c(), obj);
            }
            return linkedHashMap;
        }
    }

    static final class f implements kg.n {

        /* renamed from: a, reason: collision with root package name */
        public static final f f50809a = new f();

        f() {
        }

        @Override // kg.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6556a apply(C6556a c6556a) {
            AbstractC6492s.i(c6556a, "<destruct>");
            ApiNetworkWifimanDeviceInfo apiNetworkWifimanDeviceInfo = (ApiNetworkWifimanDeviceInfo) c6556a.a();
            if (apiNetworkWifimanDeviceInfo != null && apiNetworkWifimanDeviceInfo.e() != null) {
                S8.a aVarB = apiNetworkWifimanDeviceInfo.b();
                S8.c cVarE = apiNetworkWifimanDeviceInfo.e();
                AbstractC6492s.f(cVarE);
                return new C6556a(new b(cVarE, aVarB, apiNetworkWifimanDeviceInfo.getChannelNum(), apiNetworkWifimanDeviceInfo.c(), apiNetworkWifimanDeviceInfo.f()));
            }
            return new C6556a(null);
        }
    }

    public v(C6296B wifiConnectionServiceAndroid, InterfaceC6586g wifiScanner, InterfaceC4091e unifiWifimanApiService) {
        AbstractC6492s.i(wifiConnectionServiceAndroid, "wifiConnectionServiceAndroid");
        AbstractC6492s.i(wifiScanner, "wifiScanner");
        AbstractC6492s.i(unifiWifimanApiService, "unifiWifimanApiService");
        this.f50792a = wifiConnectionServiceAndroid;
        gg.i iVarW = unifiWifimanApiService.a().N0(f.f50809a).W();
        AbstractC6492s.h(iVarW, "distinctUntilChanged(...)");
        this.f50793b = iVarW;
        gg.i iVarW2 = wifiScanner.b().N0(e.f50808a).W();
        AbstractC6492s.h(iVarW2, "distinctUntilChanged(...)");
        this.f50794c = iVarW2;
        gg.i iVarI2 = gg.i.u(wifiConnectionServiceAndroid.a(), iVarW, iVarW2, new c()).W().f0(d.f50807a).o1(1).i2();
        AbstractC6492s.h(iVarI2, "refCount(...)");
        this.f50795d = iVarI2;
        this.f50796e = wifiConnectionServiceAndroid.f();
        this.f50797f = wifiConnectionServiceAndroid.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c A[PHI: r0
  0x002c: PHI (r0v3 java.lang.Integer) = (r0v2 java.lang.Integer), (r0v5 java.lang.Integer), (r0v7 java.lang.Integer) binds: [B:9:0x0014, B:13:0x001e, B:17:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final je.C6316q d(je.C6316q r13, je.v.a r14, je.v.b r15) {
        /*
            r12 = this;
            W7.b r0 = r13.g()
            r1 = 0
            if (r0 != 0) goto Ld
            if (r15 == 0) goto Lf
            W7.b r0 = r15.e()
        Ld:
            r6 = r0
            goto L10
        Lf:
            r6 = r1
        L10:
            java.lang.Integer r0 = r13.f()
            if (r0 != 0) goto L2c
            if (r15 == 0) goto L1d
            java.lang.Integer r0 = r15.c()
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 != 0) goto L2c
            if (r14 == 0) goto L2e
            je.q r0 = r14.b()
            if (r0 == 0) goto L2e
            java.lang.Integer r0 = r0.f()
        L2c:
            r7 = r0
            goto L2f
        L2e:
            r7 = r1
        L2f:
            if (r14 == 0) goto L40
            je.q r14 = r14.b()
            if (r14 == 0) goto L40
            S8.d r14 = r14.d()
            if (r14 != 0) goto L3e
            goto L40
        L3e:
            r8 = r14
            goto L4d
        L40:
            S8.d r14 = r13.d()
            if (r14 != 0) goto L3e
            if (r15 == 0) goto L4c
            S8.d r1 = r15.b()
        L4c:
            r8 = r1
        L4d:
            r10 = 71
            r11 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r9 = 0
            r2 = r13
            je.q r13 = je.C6316q.b(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: je.v.d(je.q, je.v$a, je.v$b):je.q");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S8.j e(AbstractC6317r.b.a aVar, a aVar2) {
        S8.j jVarG = aVar.g();
        if (jVarG != null) {
            if ((aVar2 != null ? aVar2.c() : null) != null) {
                return this.f50792a.e(jVarG, aVar2.c());
            }
        }
        if (jVarG != null) {
            return jVarG;
        }
        if (aVar2 != null) {
            return aVar2.c();
        }
        return null;
    }

    @Override // je.u
    public gg.i a() {
        return this.f50795d;
    }
}
