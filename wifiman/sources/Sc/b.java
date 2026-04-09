package Sc;

import Cc.AbstractC2558b;
import Ec.t;
import Sc.b;
import Zg.AbstractC3689v;
import h9.C5969a;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv6.C6205b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6835l;
import xa.InterfaceC8439a;
import y7.n;

/* loaded from: classes4.dex */
public interface b extends t {

    public static final class a extends t.a {

        /* renamed from: a, reason: collision with root package name */
        private final Set f20421a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f20422b;

        /* renamed from: c, reason: collision with root package name */
        private final com.ui.wifiman.model.vendor.d f20423c;

        /* renamed from: d, reason: collision with root package name */
        private final C5969a f20424d;

        /* renamed from: e, reason: collision with root package name */
        private final InterfaceC8439a.d f20425e;

        /* renamed from: f, reason: collision with root package name */
        private final AbstractC2558b f20426f;

        /* renamed from: g, reason: collision with root package name */
        private final Set f20427g;

        /* renamed from: h, reason: collision with root package name */
        private final Set f20428h;

        /* renamed from: i, reason: collision with root package name */
        private final Map f20429i;

        /* renamed from: j, reason: collision with root package name */
        private final Long f20430j;

        /* renamed from: k, reason: collision with root package name */
        private final S8.h f20431k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f20432l;

        /* renamed from: m, reason: collision with root package name */
        private final String f20433m;

        /* renamed from: n, reason: collision with root package name */
        private final long f20434n;

        /* renamed from: o, reason: collision with root package name */
        private final long f20435o;

        /* renamed from: p, reason: collision with root package name */
        private final t.c f20436p;

        /* renamed from: q, reason: collision with root package name */
        private final C6180b f20437q;

        /* renamed from: r, reason: collision with root package name */
        private final C6205b f20438r;

        public a(Set deviceNames, Set addresses, com.ui.wifiman.model.vendor.d vendor, C5969a mac, InterfaceC8439a.d dVar, AbstractC2558b abstractC2558b, Set ssid, Set firmwareInfo, Map interfaces, Long l10, S8.h hVar, boolean z10, String str, long j10, long j11) {
            Object obj;
            Object next;
            AbstractC6492s.i(deviceNames, "deviceNames");
            AbstractC6492s.i(addresses, "addresses");
            AbstractC6492s.i(vendor, "vendor");
            AbstractC6492s.i(mac, "mac");
            AbstractC6492s.i(ssid, "ssid");
            AbstractC6492s.i(firmwareInfo, "firmwareInfo");
            AbstractC6492s.i(interfaces, "interfaces");
            this.f20421a = deviceNames;
            this.f20422b = addresses;
            this.f20423c = vendor;
            this.f20424d = mac;
            this.f20425e = dVar;
            this.f20426f = abstractC2558b;
            this.f20427g = ssid;
            this.f20428h = firmwareInfo;
            this.f20429i = interfaces;
            this.f20430j = l10;
            this.f20431k = hVar;
            this.f20432l = z10;
            this.f20433m = str;
            this.f20434n = j10;
            this.f20435o = j11;
            this.f20436p = t.c.UBNT;
            ArrayList arrayList = new ArrayList();
            Iterator it = addresses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                inet.ipaddr.g gVar = (inet.ipaddr.g) it.next();
                obj = gVar instanceof C6180b ? (C6180b) gVar : null;
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (!((C6180b) next).g1()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C6180b c6180b = (C6180b) next;
            this.f20437q = c6180b == null ? (C6180b) AbstractC3689v.s0(arrayList) : c6180b;
            Set<inet.ipaddr.g> set = this.f20422b;
            ArrayList arrayList2 = new ArrayList();
            for (inet.ipaddr.g gVar2 : set) {
                C6205b c6205b = gVar2 instanceof C6205b ? (C6205b) gVar2 : null;
                if (c6205b != null) {
                    arrayList2.add(c6205b);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (!((C6205b) next2).g1()) {
                    obj = next2;
                    break;
                }
            }
            C6205b c6205b2 = (C6205b) obj;
            this.f20438r = c6205b2 == null ? (C6205b) AbstractC3689v.s0(arrayList2) : c6205b2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence i(a aVar, n it) {
            AbstractC6492s.i(it, "it");
            return aVar.l(it);
        }

        private final String l(n nVar) {
            String str = String.format("%d.%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf(nVar.e().d()), Integer.valueOf(nVar.e().g()), Integer.valueOf(nVar.e().h())}, 3));
            AbstractC6492s.h(str, "format(...)");
            return str;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f20436p;
        }

        @Override // Ec.t.b
        public inet.ipaddr.g c() {
            inet.ipaddr.g gVarD = d();
            if (gVarD == null && (gVarD = e()) == null) {
                throw new IllegalStateException("There must be at least since IP for the result");
            }
            return gVarD;
        }

        @Override // Ec.t.b
        public C6180b d() {
            return this.f20437q;
        }

        @Override // Ec.t.b
        public C6205b e() {
            return this.f20438r;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f20421a, aVar.f20421a) && AbstractC6492s.d(this.f20422b, aVar.f20422b) && AbstractC6492s.d(this.f20423c, aVar.f20423c) && AbstractC6492s.d(this.f20424d, aVar.f20424d) && AbstractC6492s.d(this.f20425e, aVar.f20425e) && AbstractC6492s.d(this.f20426f, aVar.f20426f) && AbstractC6492s.d(this.f20427g, aVar.f20427g) && AbstractC6492s.d(this.f20428h, aVar.f20428h) && AbstractC6492s.d(this.f20429i, aVar.f20429i) && AbstractC6492s.d(this.f20430j, aVar.f20430j) && this.f20431k == aVar.f20431k && this.f20432l == aVar.f20432l && AbstractC6492s.d(this.f20433m, aVar.f20433m) && this.f20434n == aVar.f20434n && this.f20435o == aVar.f20435o;
        }

        @Override // Ec.t.b
        public long f() {
            return this.f20435o;
        }

        @Override // Ec.t.a
        public C5969a g() {
            return this.f20424d;
        }

        @Override // Ec.t.a, Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public final Set j() {
            return this.f20421a;
        }

        public final AbstractC2558b k() {
            return this.f20426f;
        }

        public final String m() {
            if (this.f20428h.isEmpty()) {
                return null;
            }
            return AbstractC3689v.z0(this.f20428h, "\n", null, null, 0, null, new InterfaceC6835l() { // from class: Sc.a
                @Override // mh.InterfaceC6835l
                public final Object invoke(Object obj) {
                    return b.a.i(this.f20420a, (n) obj);
                }
            }, 30, null);
        }

        public final boolean n() {
            return this.f20432l;
        }

        public final Map o() {
            return this.f20429i;
        }

        public final String p() {
            String name;
            InterfaceC8439a.d dVar = this.f20425e;
            return (dVar == null || (name = dVar.getName()) == null) ? this.f20433m : name;
        }

        public final Set q() {
            return this.f20427g;
        }

        public final InterfaceC8439a.d r() {
            return this.f20425e;
        }

        public final Long s() {
            Long l10 = this.f20430j;
            if (l10 != null) {
                return Long.valueOf(l10.longValue() * 1000);
            }
            return null;
        }

        public final com.ui.wifiman.model.vendor.d t() {
            return this.f20423c;
        }

        public String toString() {
            return "Result(deviceNames=" + this.f20421a + ", addresses=" + this.f20422b + ", vendor=" + this.f20423c + ", mac=" + this.f20424d + ", ubntProduct=" + this.f20425e + ", deviceType=" + this.f20426f + ", ssid=" + this.f20427g + ", firmwareInfo=" + this.f20428h + ", interfaces=" + this.f20429i + ", uptimeSeconds=" + this.f20430j + ", wirelessMode=" + this.f20431k + ", inFactoryDefaults=" + this.f20432l + ", _productName=" + this.f20433m + ", createdAt=" + this.f20434n + ", validUntil=" + this.f20435o + ")";
        }

        public final S8.h u() {
            return this.f20431k;
        }
    }
}
