package com.ui.wifiman.model.discovery.engine.snmp;

import Ec.t;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class a implements t {

    /* renamed from: com.ui.wifiman.model.discovery.engine.snmp.a$a, reason: collision with other inner class name */
    public static final class C1402a extends t.b {

        /* renamed from: a, reason: collision with root package name */
        private final g f42762a;

        /* renamed from: b, reason: collision with root package name */
        private final String f42763b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42764c;

        /* renamed from: d, reason: collision with root package name */
        private final String f42765d;

        /* renamed from: e, reason: collision with root package name */
        private final String f42766e;

        /* renamed from: f, reason: collision with root package name */
        private final String f42767f;

        /* renamed from: g, reason: collision with root package name */
        private final String f42768g;

        /* renamed from: h, reason: collision with root package name */
        private final long f42769h;

        /* renamed from: i, reason: collision with root package name */
        private final long f42770i;

        /* renamed from: j, reason: collision with root package name */
        private final t.c f42771j;

        public C1402a(g ipAddress, String str, String str2, String str3, String str4, String str5, String str6, long j10, long j11) {
            AbstractC6492s.i(ipAddress, "ipAddress");
            this.f42762a = ipAddress;
            this.f42763b = str;
            this.f42764c = str2;
            this.f42765d = str3;
            this.f42766e = str4;
            this.f42767f = str5;
            this.f42768g = str6;
            this.f42769h = j10;
            this.f42770i = j11;
            this.f42771j = t.c.SNMP;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f42771j;
        }

        @Override // Ec.t.b
        public g c() {
            return this.f42762a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1402a)) {
                return false;
            }
            C1402a c1402a = (C1402a) obj;
            return AbstractC6492s.d(this.f42762a, c1402a.f42762a) && AbstractC6492s.d(this.f42763b, c1402a.f42763b) && AbstractC6492s.d(this.f42764c, c1402a.f42764c) && AbstractC6492s.d(this.f42765d, c1402a.f42765d) && AbstractC6492s.d(this.f42766e, c1402a.f42766e) && AbstractC6492s.d(this.f42767f, c1402a.f42767f) && AbstractC6492s.d(this.f42768g, c1402a.f42768g) && this.f42769h == c1402a.f42769h && this.f42770i == c1402a.f42770i;
        }

        @Override // Ec.t.b
        public long f() {
            return this.f42770i;
        }

        public final String g() {
            return this.f42766e;
        }

        public final String h() {
            return this.f42764c;
        }

        @Override // Ec.t.b
        public int hashCode() {
            return super.hashCode();
        }

        public final String i() {
            return this.f42767f;
        }

        public final String j() {
            return this.f42763b;
        }

        public String toString() {
            return "Result(ipAddress=" + this.f42762a + ", name=" + this.f42763b + ", description=" + this.f42764c + ", uptime=" + this.f42765d + ", contact=" + this.f42766e + ", location=" + this.f42767f + ", services=" + this.f42768g + ", createdAt=" + this.f42769h + ", validUntil=" + this.f42770i + ")";
        }
    }
}
