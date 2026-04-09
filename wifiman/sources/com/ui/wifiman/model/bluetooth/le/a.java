package com.ui.wifiman.model.bluetooth.le;

import a8.C3772b;
import gg.z;
import h9.C5969a;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.ui.wifiman.model.bluetooth.le.a$a, reason: collision with other inner class name */
    public static final class C1388a {

        /* renamed from: a, reason: collision with root package name */
        private final C5969a f42503a;

        /* renamed from: b, reason: collision with root package name */
        private final String f42504b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42505c;

        /* renamed from: d, reason: collision with root package name */
        private final com.ui.wifiman.model.vendor.d f42506d;

        /* renamed from: e, reason: collision with root package name */
        private final String f42507e;

        /* renamed from: f, reason: collision with root package name */
        private final String f42508f;

        /* renamed from: g, reason: collision with root package name */
        private final long f42509g;

        /* renamed from: h, reason: collision with root package name */
        private final Map f42510h;

        /* renamed from: i, reason: collision with root package name */
        private final C3772b f42511i;

        public C1388a(C5969a mac, String str, String str2, com.ui.wifiman.model.vendor.d dVar, String str3, String str4, long j10, Map characteristics) {
            AbstractC6492s.i(mac, "mac");
            AbstractC6492s.i(characteristics, "characteristics");
            this.f42503a = mac;
            this.f42504b = str;
            this.f42505c = str2;
            this.f42506d = dVar;
            this.f42507e = str3;
            this.f42508f = str4;
            this.f42509g = j10;
            this.f42510h = characteristics;
            this.f42511i = C3772b.f25747c.b(mac);
        }

        public final String a() {
            return this.f42507e;
        }

        public final String b() {
            return this.f42508f;
        }

        public final C3772b c() {
            return this.f42511i;
        }

        public final String d() {
            return this.f42505c;
        }

        public final String e() {
            return this.f42504b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1388a)) {
                return false;
            }
            C1388a c1388a = (C1388a) obj;
            return AbstractC6492s.d(this.f42503a, c1388a.f42503a) && AbstractC6492s.d(this.f42504b, c1388a.f42504b) && AbstractC6492s.d(this.f42505c, c1388a.f42505c) && AbstractC6492s.d(this.f42506d, c1388a.f42506d) && AbstractC6492s.d(this.f42507e, c1388a.f42507e) && AbstractC6492s.d(this.f42508f, c1388a.f42508f) && this.f42509g == c1388a.f42509g && AbstractC6492s.d(this.f42510h, c1388a.f42510h);
        }

        public final com.ui.wifiman.model.vendor.d f() {
            return this.f42506d;
        }

        public int hashCode() {
            return this.f42503a.hashCode();
        }

        public String toString() {
            return "Device(mac=" + this.f42503a + ", name=" + this.f42504b + ", model=" + this.f42505c + ", vendor=" + this.f42506d + ", batteryLevel=" + this.f42507e + ", firmwareVersion=" + this.f42508f + ", timestamp=" + this.f42509g + ", characteristics=" + this.f42510h + ")";
        }
    }

    z a(C5969a c5969a);

    gg.i b();
}
