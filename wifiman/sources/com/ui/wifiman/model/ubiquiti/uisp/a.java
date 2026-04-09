package com.ui.wifiman.model.ubiquiti.uisp;

import gg.i;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.ui.wifiman.model.ubiquiti.uisp.a$a, reason: collision with other inner class name */
    public static final class C1505a {

        /* renamed from: a, reason: collision with root package name */
        private final String f43946a;

        /* renamed from: b, reason: collision with root package name */
        private final String f43947b;

        /* renamed from: c, reason: collision with root package name */
        private final String f43948c;

        public C1505a(String host, String token, String mac) {
            AbstractC6492s.i(host, "host");
            AbstractC6492s.i(token, "token");
            AbstractC6492s.i(mac, "mac");
            this.f43946a = host;
            this.f43947b = token;
            this.f43948c = mac;
        }

        public final String a() {
            return this.f43946a;
        }

        public final String b() {
            return this.f43948c;
        }

        public final String c() {
            return this.f43947b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1505a)) {
                return false;
            }
            C1505a c1505a = (C1505a) obj;
            return AbstractC6492s.d(this.f43946a, c1505a.f43946a) && AbstractC6492s.d(this.f43947b, c1505a.f43947b) && AbstractC6492s.d(this.f43948c, c1505a.f43948c);
        }

        public int hashCode() {
            return (((this.f43946a.hashCode() * 31) + this.f43947b.hashCode()) * 31) + this.f43948c.hashCode();
        }

        public String toString() {
            return "ApiParams(host=" + this.f43946a + ", token=" + this.f43947b + ", mac=" + this.f43948c + ")";
        }
    }

    i a();
}
