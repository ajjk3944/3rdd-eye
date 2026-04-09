package Lc;

import Cc.AbstractC2558b;
import Ec.t;
import Zg.AbstractC3689v;
import h9.C5969a;
import inet.ipaddr.g;
import inet.ipaddr.ipv4.C6180b;
import inet.ipaddr.ipv6.C6205b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface a extends t {

    /* renamed from: Lc.a$a, reason: collision with other inner class name */
    public static final class C0455a extends t.a {

        /* renamed from: a, reason: collision with root package name */
        private final g f11541a;

        /* renamed from: b, reason: collision with root package name */
        private final C5969a f11542b;

        /* renamed from: c, reason: collision with root package name */
        private final List f11543c;

        /* renamed from: d, reason: collision with root package name */
        private final long f11544d;

        /* renamed from: e, reason: collision with root package name */
        private final com.ui.wifiman.model.vendor.d f11545e;

        /* renamed from: f, reason: collision with root package name */
        private final String f11546f;

        /* renamed from: g, reason: collision with root package name */
        private final Long f11547g;

        /* renamed from: h, reason: collision with root package name */
        private final String f11548h;

        /* renamed from: i, reason: collision with root package name */
        private final String f11549i;

        /* renamed from: j, reason: collision with root package name */
        private final String f11550j;

        /* renamed from: k, reason: collision with root package name */
        private final String f11551k;

        /* renamed from: l, reason: collision with root package name */
        private final Boolean f11552l;

        /* renamed from: m, reason: collision with root package name */
        private final AbstractC2558b f11553m;

        /* renamed from: n, reason: collision with root package name */
        private final long f11554n;

        /* renamed from: o, reason: collision with root package name */
        private final t.c f11555o;

        /* renamed from: p, reason: collision with root package name */
        private final String f11556p;

        public C0455a(g ipAddress, C5969a mac, List addresses, long j10, com.ui.wifiman.model.vendor.d vendor, String str, Long l10, String str2, String str3, String str4, String str5, Boolean bool, AbstractC2558b abstractC2558b, long j11) {
            String str6;
            AbstractC6492s.i(ipAddress, "ipAddress");
            AbstractC6492s.i(mac, "mac");
            AbstractC6492s.i(addresses, "addresses");
            AbstractC6492s.i(vendor, "vendor");
            this.f11541a = ipAddress;
            this.f11542b = mac;
            this.f11543c = addresses;
            this.f11544d = j10;
            this.f11545e = vendor;
            this.f11546f = str;
            this.f11547g = l10;
            this.f11548h = str2;
            this.f11549i = str3;
            this.f11550j = str4;
            this.f11551k = str5;
            this.f11552l = bool;
            this.f11553m = abstractC2558b;
            this.f11554n = j11;
            this.f11555o = t.c.MIKROTIK;
            if (str3 == null || str5 == null) {
                str6 = str5;
            } else {
                str6 = vendor.getName() + " " + str5;
            }
            this.f11556p = str6;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f11555o;
        }

        @Override // Ec.t.b
        public g c() {
            return this.f11541a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ec.t.b
        public C6180b d() {
            C6180b c6180b;
            List list = this.f11543c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) it.next();
                c6180b = gVar instanceof C6180b ? (C6180b) gVar : null;
                if (c6180b != null) {
                    arrayList.add(c6180b);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!((C6180b) next).g1()) {
                    c6180b = next;
                    break;
                }
            }
            C6180b c6180b2 = c6180b;
            return c6180b2 == null ? (C6180b) AbstractC3689v.s0(arrayList) : c6180b2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ec.t.b
        public C6205b e() {
            C6205b c6205b;
            List list = this.f11543c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                g gVar = (g) it.next();
                c6205b = gVar instanceof C6205b ? (C6205b) gVar : null;
                if (c6205b != null) {
                    arrayList.add(c6205b);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!((C6205b) next).g1()) {
                    c6205b = next;
                    break;
                }
            }
            C6205b c6205b2 = c6205b;
            return c6205b2 == null ? (C6205b) AbstractC3689v.s0(arrayList) : c6205b2;
        }

        @Override // Ec.t.b
        public long f() {
            return this.f11554n;
        }

        @Override // Ec.t.a
        public C5969a g() {
            return this.f11542b;
        }

        public final AbstractC2558b h() {
            return this.f11553m;
        }

        @Override // Ec.t.a, Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public final String i() {
            return this.f11548h;
        }

        public final Boolean j() {
            return this.f11552l;
        }

        public final String k() {
            return this.f11546f;
        }

        public final String l() {
            return this.f11556p;
        }

        public final String m() {
            return this.f11550j;
        }

        public final Long n() {
            Long l10 = this.f11547g;
            if (l10 != null) {
                return Long.valueOf(l10.longValue() * 1000);
            }
            return null;
        }

        public final com.ui.wifiman.model.vendor.d o() {
            return this.f11545e;
        }
    }
}
