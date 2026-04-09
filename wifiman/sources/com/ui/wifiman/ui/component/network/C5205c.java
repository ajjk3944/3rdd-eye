package com.ui.wifiman.ui.component.network;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import W7.f;
import b8.EnumC4076c;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import la.C6562a;
import m0.C6733v0;
import ze.AbstractC8735d;

/* renamed from: com.ui.wifiman.ui.component.network.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5205c {

    /* renamed from: a, reason: collision with root package name */
    public static final C5205c f44468a = new C5205c();

    /* renamed from: com.ui.wifiman.ui.component.network.c$a */
    public static abstract class a {

        /* renamed from: com.ui.wifiman.ui.component.network.c$a$a, reason: collision with other inner class name */
        public static final class C1554a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final V7.a f44469a;

            /* renamed from: b, reason: collision with root package name */
            private final s9.b f44470b;

            /* renamed from: c, reason: collision with root package name */
            private final s9.d f44471c;

            public C1554a(V7.a aVar) {
                super(null);
                this.f44469a = aVar;
                EnumC4076c enumC4076c = EnumC4076c.MOBILE;
                this.f44470b = AbstractC5218p.a(enumC4076c);
                this.f44471c = AbstractC5218p.c(enumC4076c, null, 1, null);
            }

            @Override // com.ui.wifiman.ui.component.network.C5205c.a
            public s9.b a() {
                return this.f44470b;
            }

            @Override // com.ui.wifiman.ui.component.network.C5205c.a
            public s9.d b() {
                return this.f44471c;
            }

            @Override // com.ui.wifiman.ui.component.network.C5205c.a
            public long c(InterfaceC3540l interfaceC3540l, int i10) {
                interfaceC3540l.U(-1149358569);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1149358569, i10, -1, "com.ui.wifiman.ui.component.network.NetworkConnectionInfo.NetworkState.Cellular.iconTint (NetworkConnectionInfo.kt:101)");
                }
                V7.a aVar = this.f44469a;
                interfaceC3540l.U(946232285);
                C6733v0 c6733v0G = aVar != null ? C6733v0.g(Ne.f.c(aVar, null, interfaceC3540l, 0, 1)) : null;
                interfaceC3540l.J();
                long jF = c6733v0G == null ? C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f() : c6733v0G.u();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return jF;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1554a) && AbstractC6492s.d(this.f44469a, ((C1554a) obj).f44469a);
            }

            public int hashCode() {
                V7.a aVar = this.f44469a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            public String toString() {
                return "Cellular(signal=" + this.f44469a + ")";
            }
        }

        /* renamed from: com.ui.wifiman.ui.component.network.c$a$b */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f44472a = new b();

            /* renamed from: b, reason: collision with root package name */
            private static final s9.b f44473b;

            /* renamed from: c, reason: collision with root package name */
            private static final s9.d f44474c;

            static {
                EnumC4076c enumC4076c = EnumC4076c.ETHERNET;
                f44473b = AbstractC5218p.a(enumC4076c);
                f44474c = AbstractC5218p.c(enumC4076c, null, 1, null);
            }

            private b() {
                super(null);
            }

            @Override // com.ui.wifiman.ui.component.network.C5205c.a
            public s9.b a() {
                return f44473b;
            }

            @Override // com.ui.wifiman.ui.component.network.C5205c.a
            public s9.d b() {
                return f44474c;
            }

            @Override // com.ui.wifiman.ui.component.network.C5205c.a
            public long c(InterfaceC3540l interfaceC3540l, int i10) {
                interfaceC3540l.U(173099466);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(173099466, i10, -1, "com.ui.wifiman.ui.component.network.NetworkConnectionInfo.NetworkState.Ethernet.iconTint (NetworkConnectionInfo.kt:90)");
                }
                long jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return jF;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -562019943;
            }

            public String toString() {
                return "Ethernet";
            }
        }

        /* renamed from: com.ui.wifiman.ui.component.network.c$a$c, reason: collision with other inner class name */
        public static final class C1555c extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C1555c f44475a = new C1555c();

            /* renamed from: b, reason: collision with root package name */
            private static final s9.b f44476b = Pe.a.f18599a.a0();

            /* renamed from: c, reason: collision with root package name */
            private static final s9.d f44477c = AbstractC5218p.c(EnumC4076c.DISCONNECTED, null, 1, null);

            private C1555c() {
                super(null);
            }

            @Override // com.ui.wifiman.ui.component.network.C5205c.a
            public s9.b a() {
                return f44476b;
            }

            @Override // com.ui.wifiman.ui.component.network.C5205c.a
            public s9.d b() {
                return f44477c;
            }

            @Override // com.ui.wifiman.ui.component.network.C5205c.a
            public long c(InterfaceC3540l interfaceC3540l, int i10) {
                interfaceC3540l.U(-1921396676);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(-1921396676, i10, -1, "com.ui.wifiman.ui.component.network.NetworkConnectionInfo.NetworkState.NoNetwork.iconTint (NetworkConnectionInfo.kt:63)");
                }
                long jA = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).c().a();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return jA;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1555c);
            }

            public int hashCode() {
                return -1052221525;
            }

            public String toString() {
                return "NoNetwork";
            }
        }

        /* renamed from: com.ui.wifiman.ui.component.network.c$a$d */
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f44478a;

            /* renamed from: b, reason: collision with root package name */
            private final S8.l f44479b;

            /* renamed from: c, reason: collision with root package name */
            private final s9.b f44480c;

            /* renamed from: d, reason: collision with root package name */
            private final s9.d f44481d;

            /* renamed from: com.ui.wifiman.ui.component.network.c$a$d$a, reason: collision with other inner class name */
            public /* synthetic */ class C1556a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f44482a;

                static {
                    int[] iArr = new int[f.a.values().length];
                    try {
                        iArr[f.a.EXCELLENT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[f.a.GOOD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[f.a.POOR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f44482a = iArr;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public d(java.lang.String r2, S8.l r3) {
                /*
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    r1.f44478a = r2
                    r1.f44479b = r3
                    if (r3 == 0) goto L3b
                    W7.f$a r3 = r3.h()
                    int[] r0 = com.ui.wifiman.ui.component.network.C5205c.a.d.C1556a.f44482a
                    int r3 = r3.ordinal()
                    r3 = r0[r3]
                    r0 = 1
                    if (r3 == r0) goto L33
                    r0 = 2
                    if (r3 == r0) goto L2c
                    r0 = 3
                    if (r3 != r0) goto L26
                    Pe.a r3 = Pe.a.f18599a
                    s9.b r3 = r3.X()
                    goto L39
                L26:
                    kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
                    r2.<init>()
                    throw r2
                L2c:
                    Pe.a r3 = Pe.a.f18599a
                    s9.b r3 = r3.Z()
                    goto L39
                L33:
                    Pe.a r3 = Pe.a.f18599a
                    s9.b r3 = r3.Y()
                L39:
                    if (r3 != 0) goto L41
                L3b:
                    b8.c r3 = b8.EnumC4076c.WIFI
                    s9.b r3 = com.ui.wifiman.ui.component.network.AbstractC5218p.a(r3)
                L41:
                    r1.f44480c = r3
                    b8.c r3 = b8.EnumC4076c.WIFI
                    s9.d r2 = com.ui.wifiman.ui.component.network.AbstractC5218p.b(r3, r2)
                    r1.f44481d = r2
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ui.wifiman.ui.component.network.C5205c.a.d.<init>(java.lang.String, S8.l):void");
            }

            @Override // com.ui.wifiman.ui.component.network.C5205c.a
            public s9.b a() {
                return this.f44480c;
            }

            @Override // com.ui.wifiman.ui.component.network.C5205c.a
            public s9.d b() {
                return this.f44481d;
            }

            @Override // com.ui.wifiman.ui.component.network.C5205c.a
            public long c(InterfaceC3540l interfaceC3540l, int i10) {
                interfaceC3540l.U(1208810284);
                if (AbstractC3546o.H()) {
                    AbstractC3546o.Q(1208810284, i10, -1, "com.ui.wifiman.ui.component.network.NetworkConnectionInfo.NetworkState.WiFi.iconTint (NetworkConnectionInfo.kt:81)");
                }
                long jF = C6562a.f52458a.a(interfaceC3540l, C6562a.f52459b).a().d().f();
                if (AbstractC3546o.H()) {
                    AbstractC3546o.P();
                }
                interfaceC3540l.J();
                return jF;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return AbstractC6492s.d(this.f44478a, dVar.f44478a) && AbstractC6492s.d(this.f44479b, dVar.f44479b);
            }

            public int hashCode() {
                String str = this.f44478a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                S8.l lVar = this.f44479b;
                return iHashCode + (lVar != null ? lVar.hashCode() : 0);
            }

            public String toString() {
                return "WiFi(ssid=" + this.f44478a + ", signal=" + this.f44479b + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract s9.b a();

        public abstract s9.d b();

        public abstract long c(InterfaceC3540l interfaceC3540l, int i10);

        private a() {
        }
    }

    /* renamed from: com.ui.wifiman.ui.component.network.c$b */
    public static abstract class b extends AbstractC8735d {
        public abstract Li.N n0();

        public abstract void o0();
    }

    private C5205c() {
    }
}
