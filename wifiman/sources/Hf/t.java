package hf;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import W7.a;
import b8.AbstractC4075b;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s9.InterfaceC7929a;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f48710a = new t();

    public static abstract class a {

        /* renamed from: hf.t$a$a, reason: collision with other inner class name */
        public static final class C1805a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final b f48711a;

            /* renamed from: b, reason: collision with root package name */
            private final c f48712b;

            /* renamed from: c, reason: collision with root package name */
            private final b f48713c;

            /* renamed from: d, reason: collision with root package name */
            private final c f48714d;

            /* renamed from: e, reason: collision with root package name */
            private final b f48715e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1805a(b internetNode, c internetStats, b gatewayNode, c gatewayStats, b myself) {
                super(null);
                AbstractC6492s.i(internetNode, "internetNode");
                AbstractC6492s.i(internetStats, "internetStats");
                AbstractC6492s.i(gatewayNode, "gatewayNode");
                AbstractC6492s.i(gatewayStats, "gatewayStats");
                AbstractC6492s.i(myself, "myself");
                this.f48711a = internetNode;
                this.f48712b = internetStats;
                this.f48713c = gatewayNode;
                this.f48714d = gatewayStats;
                this.f48715e = myself;
            }

            public final b a() {
                return this.f48713c;
            }

            public final c b() {
                return this.f48714d;
            }

            public b c() {
                return this.f48711a;
            }

            public final c d() {
                return this.f48712b;
            }

            public final b e() {
                return this.f48715e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1805a)) {
                    return false;
                }
                C1805a c1805a = (C1805a) obj;
                return AbstractC6492s.d(this.f48711a, c1805a.f48711a) && AbstractC6492s.d(this.f48712b, c1805a.f48712b) && AbstractC6492s.d(this.f48713c, c1805a.f48713c) && AbstractC6492s.d(this.f48714d, c1805a.f48714d) && AbstractC6492s.d(this.f48715e, c1805a.f48715e);
            }

            public int hashCode() {
                return (((((((this.f48711a.hashCode() * 31) + this.f48712b.hashCode()) * 31) + this.f48713c.hashCode()) * 31) + this.f48714d.hashCode()) * 31) + this.f48715e.hashCode();
            }

            public String toString() {
                return "Combined(internetNode=" + this.f48711a + ", internetStats=" + this.f48712b + ", gatewayNode=" + this.f48713c + ", gatewayStats=" + this.f48714d + ", myself=" + this.f48715e + ")";
            }
        }

        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            private final b f48716a;

            /* renamed from: b, reason: collision with root package name */
            private final c f48717b;

            /* renamed from: c, reason: collision with root package name */
            private final b f48718c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b internetNode, c targetStats, b myself) {
                super(null);
                AbstractC6492s.i(internetNode, "internetNode");
                AbstractC6492s.i(targetStats, "targetStats");
                AbstractC6492s.i(myself, "myself");
                this.f48716a = internetNode;
                this.f48717b = targetStats;
                this.f48718c = myself;
            }

            public b a() {
                return this.f48716a;
            }

            public final b b() {
                return this.f48718c;
            }

            public final c c() {
                return this.f48717b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return AbstractC6492s.d(this.f48716a, bVar.f48716a) && AbstractC6492s.d(this.f48717b, bVar.f48717b) && AbstractC6492s.d(this.f48718c, bVar.f48718c);
            }

            public int hashCode() {
                return (((this.f48716a.hashCode() * 31) + this.f48717b.hashCode()) * 31) + this.f48718c.hashCode();
            }

            public String toString() {
                return "Direct(internetNode=" + this.f48716a + ", targetStats=" + this.f48717b + ", myself=" + this.f48718c + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC7929a f48719a;

        public b(InterfaceC7929a image) {
            AbstractC6492s.i(image, "image");
            this.f48719a = image;
        }

        public final InterfaceC7929a a() {
            return this.f48719a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC6492s.d(this.f48719a, ((b) obj).f48719a);
        }

        public int hashCode() {
            return this.f48719a.hashCode();
        }

        public String toString() {
            return "Node(image=" + this.f48719a + ")";
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final a f48720a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC4075b f48721b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f48722c;

        /* renamed from: d, reason: collision with root package name */
        private final W7.a f48723d;

        /* renamed from: e, reason: collision with root package name */
        private final W7.a f48724e;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            private static final /* synthetic */ InterfaceC5826a $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;
            public static final a IDLE = new a("IDLE", 0);
            public static final a DOWN = new a("DOWN", 1);
            public static final a UP = new a("UP", 2);
            public static final a COMPLETE = new a("COMPLETE", 3);

            private static final /* synthetic */ a[] $values() {
                return new a[]{IDLE, DOWN, UP, COMPLETE};
            }

            static {
                a[] aVarArr$values = $values();
                $VALUES = aVarArr$values;
                $ENTRIES = AbstractC5827b.a(aVarArr$values);
            }

            private a(String str, int i10) {
            }

            public static InterfaceC5826a getEntries() {
                return $ENTRIES;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) $VALUES.clone();
            }
        }

        public c(a state, AbstractC4075b abstractC4075b, Integer num, W7.a aVar, W7.a aVar2) {
            AbstractC6492s.i(state, "state");
            this.f48720a = state;
            this.f48721b = abstractC4075b;
            this.f48722c = num;
            this.f48723d = aVar;
            this.f48724e = aVar2;
        }

        public final W7.a a() {
            return this.f48723d;
        }

        public final Integer b() {
            return this.f48722c;
        }

        public final AbstractC4075b c() {
            return this.f48721b;
        }

        public final a d() {
            return this.f48720a;
        }

        public final W7.a e() {
            return this.f48724e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f48720a == cVar.f48720a && AbstractC6492s.d(this.f48721b, cVar.f48721b) && AbstractC6492s.d(this.f48722c, cVar.f48722c) && AbstractC6492s.d(this.f48723d, cVar.f48723d) && AbstractC6492s.d(this.f48724e, cVar.f48724e);
        }

        public int hashCode() {
            int iHashCode = this.f48720a.hashCode() * 31;
            AbstractC4075b abstractC4075b = this.f48721b;
            int iHashCode2 = (iHashCode + (abstractC4075b == null ? 0 : abstractC4075b.hashCode())) * 31;
            Integer num = this.f48722c;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            W7.a aVar = this.f48723d;
            int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            W7.a aVar2 = this.f48724e;
            return iHashCode4 + (aVar2 != null ? aVar2.hashCode() : 0);
        }

        public String toString() {
            return "NodeConnectionStats(state=" + this.f48720a + ", latency=" + this.f48721b + ", jitter=" + this.f48722c + ", down=" + this.f48723d + ", up=" + this.f48724e + ")";
        }
    }

    private t() {
    }

    public final c a(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(1453827534);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1453827534, i10, -1, "com.ui.wifiman.ui.speedtest.component.SpeedtestTopology.measurementInternetStatsModel (SpeedtestTopology.kt:112)");
        }
        c.a aVar = c.a.COMPLETE;
        AbstractC4075b abstractC4075bA = AbstractC4075b.f33002a.a(1000);
        a.C0878a c0878a = W7.a.f23676b;
        c cVar = new c(aVar, abstractC4075bA, 1000, c0878a.d(1000), c0878a.d(1000));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return cVar;
    }

    public final a b(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(1553712342);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1553712342, i10, -1, "com.ui.wifiman.ui.speedtest.component.SpeedtestTopology.measurementModel (SpeedtestTopology.kt:97)");
        }
        Pe.a aVar = Pe.a.f18599a;
        b bVar = new b(aVar.k());
        c cVarA = a(interfaceC3540l, i10 & 14);
        b bVar2 = new b(aVar.k());
        c.a aVar2 = c.a.COMPLETE;
        AbstractC4075b abstractC4075bA = AbstractC4075b.f33002a.a(1000);
        a.C0878a c0878a = W7.a.f23676b;
        a.C1805a c1805a = new a.C1805a(bVar, cVarA, bVar2, new c(aVar2, abstractC4075bA, 1000, c0878a.d(1000), c0878a.d(1000)), new b(aVar.k()));
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return c1805a;
    }
}
