package Tc;

import Cc.AbstractC2558b;
import Ec.t;
import S8.l;
import com.ui.wifiman.model.vendor.d;
import h9.C5969a;
import inet.ipaddr.g;
import kotlin.jvm.internal.AbstractC6492s;
import xa.InterfaceC8439a;

/* loaded from: classes4.dex */
public interface a extends t {

    /* renamed from: Tc.a$a, reason: collision with other inner class name */
    public static final class C0794a extends t.a {

        /* renamed from: a, reason: collision with root package name */
        private final g f21551a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21552b;

        /* renamed from: c, reason: collision with root package name */
        private final C5969a f21553c;

        /* renamed from: d, reason: collision with root package name */
        private final W7.b f21554d;

        /* renamed from: e, reason: collision with root package name */
        private final S8.g f21555e;

        /* renamed from: f, reason: collision with root package name */
        private final String f21556f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC8439a.d f21557g;

        /* renamed from: h, reason: collision with root package name */
        private final d f21558h;

        /* renamed from: i, reason: collision with root package name */
        private final String f21559i;

        /* renamed from: j, reason: collision with root package name */
        private final String f21560j;

        /* renamed from: k, reason: collision with root package name */
        private final S8.a f21561k;

        /* renamed from: l, reason: collision with root package name */
        private final l f21562l;

        /* renamed from: m, reason: collision with root package name */
        private final AbstractC2558b f21563m;

        /* renamed from: n, reason: collision with root package name */
        private final long f21564n;

        /* renamed from: o, reason: collision with root package name */
        private final long f21565o;

        /* renamed from: p, reason: collision with root package name */
        private final t.c f21566p;

        public C0794a(g ipAddress, String str, C5969a mac, W7.b bVar, S8.g gVar, String str2, InterfaceC8439a.d dVar, d dVar2, String str3, String str4, S8.a aVar, l lVar, AbstractC2558b abstractC2558b, long j10, long j11) {
            AbstractC6492s.i(ipAddress, "ipAddress");
            AbstractC6492s.i(mac, "mac");
            this.f21551a = ipAddress;
            this.f21552b = str;
            this.f21553c = mac;
            this.f21554d = bVar;
            this.f21555e = gVar;
            this.f21556f = str2;
            this.f21557g = dVar;
            this.f21558h = dVar2;
            this.f21559i = str3;
            this.f21560j = str4;
            this.f21561k = aVar;
            this.f21562l = lVar;
            this.f21563m = abstractC2558b;
            this.f21564n = j10;
            this.f21565o = j11;
            this.f21566p = t.c.UNIFI;
        }

        @Override // Ec.t.b
        public t.c a() {
            return this.f21566p;
        }

        @Override // Ec.t.b
        public g c() {
            return this.f21551a;
        }

        @Override // Ec.t.b
        public long f() {
            return this.f21565o;
        }

        @Override // Ec.t.a
        public C5969a g() {
            return this.f21553c;
        }

        public final AbstractC2558b h() {
            return this.f21563m;
        }

        public final String i() {
            return this.f21552b;
        }

        public final String j() {
            return this.f21556f;
        }

        public final String k() {
            return this.f21559i;
        }

        public final String l() {
            return this.f21560j;
        }

        public final l m() {
            return this.f21562l;
        }

        public final InterfaceC8439a.d n() {
            return this.f21557g;
        }

        public final d o() {
            return this.f21558h;
        }

        public final S8.g p() {
            return this.f21555e;
        }
    }
}
