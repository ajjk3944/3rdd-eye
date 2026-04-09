package com.ui.wifiman.model.discovery.engine.bonjour;

import Cc.AbstractC2558b;
import Ec.t;
import Zg.AbstractC3689v;
import Zg.U;
import com.ui.wifiman.model.discovery.engine.bonjour.a;
import gd.C5896a;
import h9.C5969a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public interface a extends t {

    /* renamed from: com.ui.wifiman.model.discovery.engine.bonjour.a$a, reason: collision with other inner class name */
    public static final class C1395a extends t.b {

        /* renamed from: a, reason: collision with root package name */
        private final inet.ipaddr.g f42594a;

        /* renamed from: b, reason: collision with root package name */
        private final long f42595b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42596c;

        /* renamed from: d, reason: collision with root package name */
        private final String f42597d;

        /* renamed from: e, reason: collision with root package name */
        private final com.ui.wifiman.model.vendor.d f42598e;

        /* renamed from: f, reason: collision with root package name */
        private final C5969a f42599f;

        /* renamed from: g, reason: collision with root package name */
        private final String f42600g;

        /* renamed from: h, reason: collision with root package name */
        private final AbstractC2558b f42601h;

        /* renamed from: i, reason: collision with root package name */
        private final long f42602i;

        /* renamed from: j, reason: collision with root package name */
        private final List f42603j;

        /* renamed from: k, reason: collision with root package name */
        private final t.c f42604k;

        /* renamed from: l, reason: collision with root package name */
        private final Yg.m f42605l;

        public C1395a(inet.ipaddr.g ipAddress, long j10, String str, String str2, com.ui.wifiman.model.vendor.d dVar, C5969a c5969a, String str3, AbstractC2558b abstractC2558b, long j11, List services) {
            AbstractC6492s.i(ipAddress, "ipAddress");
            AbstractC6492s.i(services, "services");
            this.f42594a = ipAddress;
            this.f42595b = j10;
            this.f42596c = str;
            this.f42597d = str2;
            this.f42598e = dVar;
            this.f42599f = c5969a;
            this.f42600g = str3;
            this.f42601h = abstractC2558b;
            this.f42602i = j11;
            this.f42603j = services;
            this.f42604k = t.c.BONJOUR;
            this.f42605l = Yg.n.b(new InterfaceC6824a() { // from class: Hc.a
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return a.C1395a.k(this.f7821a);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map k(C1395a c1395a) {
            List list = c1395a.f42603j;
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(O.b(((b) obj).a().getClass()), obj);
            }
            return linkedHashMap;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f42604k;
        }

        @Override // Ec.t.b
        public inet.ipaddr.g c() {
            return this.f42594a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1395a)) {
                return false;
            }
            C1395a c1395a = (C1395a) obj;
            return AbstractC6492s.d(this.f42594a, c1395a.f42594a) && this.f42595b == c1395a.f42595b && AbstractC6492s.d(this.f42596c, c1395a.f42596c) && AbstractC6492s.d(this.f42597d, c1395a.f42597d) && AbstractC6492s.d(this.f42598e, c1395a.f42598e) && AbstractC6492s.d(this.f42599f, c1395a.f42599f) && AbstractC6492s.d(this.f42600g, c1395a.f42600g) && AbstractC6492s.d(this.f42601h, c1395a.f42601h) && this.f42602i == c1395a.f42602i && AbstractC6492s.d(this.f42603j, c1395a.f42603j);
        }

        @Override // Ec.t.b
        public long f() {
            return this.f42602i;
        }

        public final AbstractC2558b h() {
            return this.f42601h;
        }

        @Override // Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public final List i() {
            return this.f42603j;
        }

        public final com.ui.wifiman.model.vendor.d j() {
            return this.f42598e;
        }

        public String toString() {
            return "Result(ipAddress=" + this.f42594a + ", createdAt=" + this.f42595b + ", name=" + this.f42596c + ", model=" + this.f42597d + ", vendor=" + this.f42598e + ", mac=" + this.f42599f + ", version=" + this.f42600g + ", deviceType=" + this.f42601h + ", validUntil=" + this.f42602i + ", services=" + this.f42603j + ")";
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f42606a;

        /* renamed from: b, reason: collision with root package name */
        private final String f42607b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42608c;

        /* renamed from: d, reason: collision with root package name */
        private final inet.ipaddr.g f42609d;

        /* renamed from: e, reason: collision with root package name */
        private final int f42610e;

        /* renamed from: f, reason: collision with root package name */
        private final c f42611f;

        /* renamed from: g, reason: collision with root package name */
        private final C5896a f42612g;

        /* renamed from: h, reason: collision with root package name */
        private final TreeMap f42613h;

        public b(String name, String type, String protocol, inet.ipaddr.g ipAddress, int i10, c details, C5896a c5896a, TreeMap txtRecords) {
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(type, "type");
            AbstractC6492s.i(protocol, "protocol");
            AbstractC6492s.i(ipAddress, "ipAddress");
            AbstractC6492s.i(details, "details");
            AbstractC6492s.i(txtRecords, "txtRecords");
            this.f42606a = name;
            this.f42607b = type;
            this.f42608c = protocol;
            this.f42609d = ipAddress;
            this.f42610e = i10;
            this.f42611f = details;
            this.f42612g = c5896a;
            this.f42613h = txtRecords;
        }

        public final c a() {
            return this.f42611f;
        }

        public final inet.ipaddr.g b() {
            return this.f42609d;
        }

        public final String c() {
            return this.f42606a;
        }

        public final int d() {
            return this.f42610e;
        }

        public final String e() {
            return this.f42608c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f42606a, bVar.f42606a) && AbstractC6492s.d(this.f42607b, bVar.f42607b) && AbstractC6492s.d(this.f42608c, bVar.f42608c) && AbstractC6492s.d(this.f42609d, bVar.f42609d) && this.f42610e == bVar.f42610e && AbstractC6492s.d(this.f42611f, bVar.f42611f) && AbstractC6492s.d(this.f42612g, bVar.f42612g) && AbstractC6492s.d(this.f42613h, bVar.f42613h);
        }

        public final C5896a f() {
            return this.f42612g;
        }

        public final String g() {
            return this.f42607b;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.f42606a.hashCode() * 31) + this.f42607b.hashCode()) * 31) + this.f42608c.hashCode()) * 31) + this.f42609d.hashCode()) * 31) + Integer.hashCode(this.f42610e)) * 31) + this.f42611f.hashCode()) * 31;
            C5896a c5896a = this.f42612g;
            return ((iHashCode + (c5896a == null ? 0 : c5896a.hashCode())) * 31) + this.f42613h.hashCode();
        }

        public String toString() {
            return "Service(name=" + this.f42606a + ", type=" + this.f42607b + ", protocol=" + this.f42608c + ", ipAddress=" + this.f42609d + ", port=" + this.f42610e + ", details=" + this.f42611f + ", serviceInfo=" + this.f42612g + ", txtRecords=" + this.f42613h + ")";
        }
    }
}
