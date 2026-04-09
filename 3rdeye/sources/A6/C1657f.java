package a6;

import M9.n;
import N7.B8;
import N7.H7;
import Q9.C0;
import Q9.C1526e;
import Q9.C1532h;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.G0;
import Q9.H;
import Q9.Q;
import Q9.Y;
import Q9.x0;
import Y5.c;
import a6.C1655d;
import a6.C1659h;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;

/* compiled from: CommonRequestBody.kt */
@M9.h
/* renamed from: a6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1657f {
    public static final e Companion = new e(null);
    private final C1655d app;
    private final C1659h device;
    private h ext;
    private i request;
    private final j user;

    /* compiled from: CommonRequestBody.kt */
    /* renamed from: a6.f$a */
    public static final class a implements H<C1657f> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.CommonRequestBody", aVar, 5);
            c1547o0.k("device", false);
            c1547o0.k("app", true);
            c1547o0.k("user", true);
            c1547o0.k("ext", true);
            c1547o0.k(com.vungle.ads.internal.ui.a.REQUEST_KEY_EXTRA, true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            return new M9.b[]{C1659h.a.INSTANCE, N9.a.b(C1655d.a.INSTANCE), N9.a.b(j.a.INSTANCE), N9.a.b(h.a.INSTANCE), N9.a.b(i.a.INSTANCE)};
        }

        @Override // M9.b
        public C1657f deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Object objH = null;
            boolean z10 = true;
            int i = 0;
            Object objG = null;
            Object objG2 = null;
            Object objG3 = null;
            Object objG4 = null;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objH = bVarD.h(descriptor2, 0, C1659h.a.INSTANCE, objH);
                    i |= 1;
                } else if (iX == 1) {
                    objG = bVarD.G(descriptor2, 1, C1655d.a.INSTANCE, objG);
                    i |= 2;
                } else if (iX == 2) {
                    objG2 = bVarD.G(descriptor2, 2, j.a.INSTANCE, objG2);
                    i |= 4;
                } else if (iX == 3) {
                    objG3 = bVarD.G(descriptor2, 3, h.a.INSTANCE, objG3);
                    i |= 8;
                } else {
                    if (iX != 4) {
                        throw new n(iX);
                    }
                    objG4 = bVarD.G(descriptor2, 4, i.a.INSTANCE, objG4);
                    i |= 16;
                }
            }
            bVarD.b(descriptor2);
            return new C1657f(i, (C1659h) objH, (C1655d) objG, (j) objG2, (h) objG3, (i) objG4, (x0) null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, C1657f value) {
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            C1657f.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: CommonRequestBody.kt */
    @M9.h
    /* renamed from: a6.f$c */
    public static final class c {
        public static final b Companion = new b(null);
        private final String status;

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$c$a */
        public static final class a implements H<c> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.CommonRequestBody.CCPA", aVar, 1);
                c1547o0.k("status", false);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                return new M9.b[]{C0.f11399a};
            }

            @Override // M9.b
            public c deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                x0 x0Var = null;
                boolean z10 = true;
                int i = 0;
                String strN = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else {
                        if (iX != 0) {
                            throw new n(iX);
                        }
                        strN = bVarD.n(descriptor2, 0);
                        i = 1;
                    }
                }
                bVarD.b(descriptor2);
                return new c(i, strN, x0Var);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, c value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                c.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$c$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<c> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public /* synthetic */ c(int i, String str, x0 x0Var) {
            if (1 == (i & 1)) {
                this.status = str;
            } else {
                G0.a(i, 1, a.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ c copy$default(c cVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cVar.status;
            }
            return cVar.copy(str);
        }

        public static final void write$Self(c self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            output.k(serialDesc, 0, self.status);
        }

        public final String component1() {
            return this.status;
        }

        public final c copy(String status) {
            kotlin.jvm.internal.l.f(status, "status");
            return new c(status);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.l.b(this.status, ((c) obj).status);
        }

        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return B8.j(new StringBuilder("CCPA(status="), this.status, ')');
        }

        public c(String status) {
            kotlin.jvm.internal.l.f(status, "status");
            this.status = status;
        }
    }

    /* compiled from: CommonRequestBody.kt */
    @M9.h
    /* renamed from: a6.f$d */
    public static final class d {
        public static final b Companion = new b(null);
        private final Boolean isCoppa;

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$d$a */
        public static final class a implements H<d> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.CommonRequestBody.COPPA", aVar, 1);
                c1547o0.k("is_coppa", false);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                return new M9.b[]{N9.a.b(C1532h.f11487a)};
            }

            @Override // M9.b
            public d deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                x0 x0Var = null;
                boolean z10 = true;
                int i = 0;
                Object objG = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else {
                        if (iX != 0) {
                            throw new n(iX);
                        }
                        objG = bVarD.G(descriptor2, 0, C1532h.f11487a, objG);
                        i = 1;
                    }
                }
                bVarD.b(descriptor2);
                return new d(i, (Boolean) objG, x0Var);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, d value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                d.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$d$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<d> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public /* synthetic */ d(int i, Boolean bool, x0 x0Var) {
            if (1 == (i & 1)) {
                this.isCoppa = bool;
            } else {
                G0.a(i, 1, a.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ d copy$default(d dVar, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = dVar.isCoppa;
            }
            return dVar.copy(bool);
        }

        public static final void write$Self(d self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            output.w(serialDesc, 0, C1532h.f11487a, self.isCoppa);
        }

        public final Boolean component1() {
            return this.isCoppa;
        }

        public final d copy(Boolean bool) {
            return new d(bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.l.b(this.isCoppa, ((d) obj).isCoppa);
        }

        public int hashCode() {
            Boolean bool = this.isCoppa;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final Boolean isCoppa() {
            return this.isCoppa;
        }

        public String toString() {
            return "COPPA(isCoppa=" + this.isCoppa + ')';
        }

        public d(Boolean bool) {
            this.isCoppa = bool;
        }

        public static /* synthetic */ void isCoppa$annotations() {
        }
    }

    /* compiled from: CommonRequestBody.kt */
    /* renamed from: a6.f$e */
    public static final class e {
        public /* synthetic */ e(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<C1657f> serializer() {
            return a.INSTANCE;
        }

        private e() {
        }
    }

    /* compiled from: CommonRequestBody.kt */
    @M9.h
    /* renamed from: a6.f$f, reason: collision with other inner class name */
    public static final class C0221f {
        public static final b Companion = new b(null);
        private final String consentMessageVersion;
        private final String consentSource;
        private final String consentStatus;
        private final long consentTimestamp;

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$f$a */
        public static final class a implements H<C0221f> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.CommonRequestBody.GDPR", aVar, 4);
                c1547o0.k("consent_status", false);
                c1547o0.k("consent_source", false);
                c1547o0.k("consent_timestamp", false);
                c1547o0.k("consent_message_version", false);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                C0 c02 = C0.f11399a;
                return new M9.b[]{c02, c02, Y.f11465a, c02};
            }

            @Override // M9.b
            public C0221f deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                int i = 0;
                String strN = null;
                String strN2 = null;
                String strN3 = null;
                long jC = 0;
                boolean z10 = true;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        strN = bVarD.n(descriptor2, 0);
                        i |= 1;
                    } else if (iX == 1) {
                        strN2 = bVarD.n(descriptor2, 1);
                        i |= 2;
                    } else if (iX == 2) {
                        jC = bVarD.C(descriptor2, 2);
                        i |= 4;
                    } else {
                        if (iX != 3) {
                            throw new n(iX);
                        }
                        strN3 = bVarD.n(descriptor2, 3);
                        i |= 8;
                    }
                }
                bVarD.b(descriptor2);
                return new C0221f(i, strN, strN2, jC, strN3, null);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, C0221f value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                C0221f.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$f$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<C0221f> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public /* synthetic */ C0221f(int i, String str, String str2, long j4, String str3, x0 x0Var) {
            if (15 != (i & 15)) {
                G0.a(i, 15, a.INSTANCE.getDescriptor());
                throw null;
            }
            this.consentStatus = str;
            this.consentSource = str2;
            this.consentTimestamp = j4;
            this.consentMessageVersion = str3;
        }

        public static /* synthetic */ C0221f copy$default(C0221f c0221f, String str, String str2, long j4, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c0221f.consentStatus;
            }
            if ((i & 2) != 0) {
                str2 = c0221f.consentSource;
            }
            if ((i & 4) != 0) {
                j4 = c0221f.consentTimestamp;
            }
            if ((i & 8) != 0) {
                str3 = c0221f.consentMessageVersion;
            }
            String str4 = str3;
            return c0221f.copy(str, str2, j4, str4);
        }

        public static final void write$Self(C0221f self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            output.k(serialDesc, 0, self.consentStatus);
            output.k(serialDesc, 1, self.consentSource);
            output.m(serialDesc, 2, self.consentTimestamp);
            output.k(serialDesc, 3, self.consentMessageVersion);
        }

        public final String component1() {
            return this.consentStatus;
        }

        public final String component2() {
            return this.consentSource;
        }

        public final long component3() {
            return this.consentTimestamp;
        }

        public final String component4() {
            return this.consentMessageVersion;
        }

        public final C0221f copy(String consentStatus, String consentSource, long j4, String consentMessageVersion) {
            kotlin.jvm.internal.l.f(consentStatus, "consentStatus");
            kotlin.jvm.internal.l.f(consentSource, "consentSource");
            kotlin.jvm.internal.l.f(consentMessageVersion, "consentMessageVersion");
            return new C0221f(consentStatus, consentSource, j4, consentMessageVersion);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0221f)) {
                return false;
            }
            C0221f c0221f = (C0221f) obj;
            return kotlin.jvm.internal.l.b(this.consentStatus, c0221f.consentStatus) && kotlin.jvm.internal.l.b(this.consentSource, c0221f.consentSource) && this.consentTimestamp == c0221f.consentTimestamp && kotlin.jvm.internal.l.b(this.consentMessageVersion, c0221f.consentMessageVersion);
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentSource() {
            return this.consentSource;
        }

        public final String getConsentStatus() {
            return this.consentStatus;
        }

        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        public int hashCode() {
            int iN = B4.g.n(this.consentStatus.hashCode() * 31, 31, this.consentSource);
            long j4 = this.consentTimestamp;
            return this.consentMessageVersion.hashCode() + ((iN + ((int) (j4 ^ (j4 >>> 32)))) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("GDPR(consentStatus=");
            sb.append(this.consentStatus);
            sb.append(", consentSource=");
            sb.append(this.consentSource);
            sb.append(", consentTimestamp=");
            sb.append(this.consentTimestamp);
            sb.append(", consentMessageVersion=");
            return B8.j(sb, this.consentMessageVersion, ')');
        }

        public C0221f(String consentStatus, String consentSource, long j4, String consentMessageVersion) {
            kotlin.jvm.internal.l.f(consentStatus, "consentStatus");
            kotlin.jvm.internal.l.f(consentSource, "consentSource");
            kotlin.jvm.internal.l.f(consentMessageVersion, "consentMessageVersion");
            this.consentStatus = consentStatus;
            this.consentSource = consentSource;
            this.consentTimestamp = j4;
            this.consentMessageVersion = consentMessageVersion;
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentSource$annotations() {
        }

        public static /* synthetic */ void getConsentStatus$annotations() {
        }

        public static /* synthetic */ void getConsentTimestamp$annotations() {
        }
    }

    /* compiled from: CommonRequestBody.kt */
    @M9.h
    /* renamed from: a6.f$g */
    public static final class g {
        public static final b Companion = new b(null);
        private final String tcf;

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$g$a */
        public static final class a implements H<g> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.CommonRequestBody.IAB", aVar, 1);
                c1547o0.k("tcf", false);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                return new M9.b[]{C0.f11399a};
            }

            @Override // M9.b
            public g deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                x0 x0Var = null;
                boolean z10 = true;
                int i = 0;
                String strN = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else {
                        if (iX != 0) {
                            throw new n(iX);
                        }
                        strN = bVarD.n(descriptor2, 0);
                        i = 1;
                    }
                }
                bVarD.b(descriptor2);
                return new g(i, strN, x0Var);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, g value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                g.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$g$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<g> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public /* synthetic */ g(int i, String str, x0 x0Var) {
            if (1 == (i & 1)) {
                this.tcf = str;
            } else {
                G0.a(i, 1, a.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ g copy$default(g gVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.tcf;
            }
            return gVar.copy(str);
        }

        public static final void write$Self(g self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            output.k(serialDesc, 0, self.tcf);
        }

        public final String component1() {
            return this.tcf;
        }

        public final g copy(String tcf) {
            kotlin.jvm.internal.l.f(tcf, "tcf");
            return new g(tcf);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && kotlin.jvm.internal.l.b(this.tcf, ((g) obj).tcf);
        }

        public final String getTcf() {
            return this.tcf;
        }

        public int hashCode() {
            return this.tcf.hashCode();
        }

        public String toString() {
            return B8.j(new StringBuilder("IAB(tcf="), this.tcf, ')');
        }

        public g(String tcf) {
            kotlin.jvm.internal.l.f(tcf, "tcf");
            this.tcf = tcf;
        }

        public static /* synthetic */ void getTcf$annotations() {
        }
    }

    /* compiled from: CommonRequestBody.kt */
    @M9.h
    /* renamed from: a6.f$h */
    public static final class h {
        public static final b Companion = new b(null);
        private final String configExtension;
        private final Long configLastValidatedTimestamp;
        private String signals;

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$h$a */
        public static final class a implements H<h> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.CommonRequestBody.RequestExt", aVar, 3);
                c1547o0.k("config_extension", true);
                c1547o0.k("signals", true);
                c1547o0.k("config_last_validated_ts", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                C0 c02 = C0.f11399a;
                return new M9.b[]{N9.a.b(c02), N9.a.b(c02), N9.a.b(Y.f11465a)};
            }

            @Override // M9.b
            public h deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                Object objG = null;
                boolean z10 = true;
                int i = 0;
                Object objG2 = null;
                Object objG3 = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        objG = bVarD.G(descriptor2, 0, C0.f11399a, objG);
                        i |= 1;
                    } else if (iX == 1) {
                        objG2 = bVarD.G(descriptor2, 1, C0.f11399a, objG2);
                        i |= 2;
                    } else {
                        if (iX != 2) {
                            throw new n(iX);
                        }
                        objG3 = bVarD.G(descriptor2, 2, Y.f11465a, objG3);
                        i |= 4;
                    }
                }
                bVarD.b(descriptor2);
                return new h(i, (String) objG, (String) objG2, (Long) objG3, (x0) null);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, h value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                h.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$h$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<h> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public h() {
            this((String) null, (String) null, (Long) null, 7, (kotlin.jvm.internal.g) null);
        }

        public static /* synthetic */ h copy$default(h hVar, String str, String str2, Long l5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hVar.configExtension;
            }
            if ((i & 2) != 0) {
                str2 = hVar.signals;
            }
            if ((i & 4) != 0) {
                l5 = hVar.configLastValidatedTimestamp;
            }
            return hVar.copy(str, str2, l5);
        }

        public static final void write$Self(h self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || self.configExtension != null) {
                output.w(serialDesc, 0, C0.f11399a, self.configExtension);
            }
            if (output.F(serialDesc, 1) || self.signals != null) {
                output.w(serialDesc, 1, C0.f11399a, self.signals);
            }
            if (!output.F(serialDesc, 2) && self.configLastValidatedTimestamp == null) {
                return;
            }
            output.w(serialDesc, 2, Y.f11465a, self.configLastValidatedTimestamp);
        }

        public final String component1() {
            return this.configExtension;
        }

        public final String component2() {
            return this.signals;
        }

        public final Long component3() {
            return this.configLastValidatedTimestamp;
        }

        public final h copy(String str, String str2, Long l5) {
            return new h(str, str2, l5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return kotlin.jvm.internal.l.b(this.configExtension, hVar.configExtension) && kotlin.jvm.internal.l.b(this.signals, hVar.signals) && kotlin.jvm.internal.l.b(this.configLastValidatedTimestamp, hVar.configLastValidatedTimestamp);
        }

        public final String getConfigExtension() {
            return this.configExtension;
        }

        public final Long getConfigLastValidatedTimestamp() {
            return this.configLastValidatedTimestamp;
        }

        public final String getSignals() {
            return this.signals;
        }

        public int hashCode() {
            String str = this.configExtension;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.signals;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l5 = this.configLastValidatedTimestamp;
            return iHashCode2 + (l5 != null ? l5.hashCode() : 0);
        }

        public final void setSignals(String str) {
            this.signals = str;
        }

        public String toString() {
            return "RequestExt(configExtension=" + this.configExtension + ", signals=" + this.signals + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ')';
        }

        public /* synthetic */ h(int i, String str, String str2, Long l5, x0 x0Var) {
            if ((i & 1) == 0) {
                this.configExtension = null;
            } else {
                this.configExtension = str;
            }
            if ((i & 2) == 0) {
                this.signals = null;
            } else {
                this.signals = str2;
            }
            if ((i & 4) == 0) {
                this.configLastValidatedTimestamp = null;
            } else {
                this.configLastValidatedTimestamp = l5;
            }
        }

        public h(String str, String str2, Long l5) {
            this.configExtension = str;
            this.signals = str2;
            this.configLastValidatedTimestamp = l5;
        }

        public /* synthetic */ h(String str, String str2, Long l5, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l5);
        }

        public static /* synthetic */ void getConfigExtension$annotations() {
        }

        public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
        }

        public static /* synthetic */ void getSignals$annotations() {
        }
    }

    /* compiled from: CommonRequestBody.kt */
    @M9.h
    /* renamed from: a6.f$i */
    public static final class i {
        public static final b Companion = new b(null);
        private b adSize;
        private final Long adStartTime;
        private final String advAppId;
        private final String placementReferenceId;
        private final List<String> placements;
        private final String user;

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$i$a */
        public static final class a implements H<i> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", aVar, 6);
                c1547o0.k("placements", true);
                c1547o0.k("ad_size", true);
                c1547o0.k("ad_start_time", true);
                c1547o0.k(CommonUrlParts.APP_ID, true);
                c1547o0.k("placement_reference_id", true);
                c1547o0.k("user", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                C0 c02 = C0.f11399a;
                return new M9.b[]{N9.a.b(new C1526e(c02)), N9.a.b(b.a.INSTANCE), N9.a.b(Y.f11465a), N9.a.b(c02), N9.a.b(c02), N9.a.b(c02)};
            }

            @Override // M9.b
            public i deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                Object objG = null;
                boolean z10 = true;
                int i = 0;
                Object objG2 = null;
                Object objG3 = null;
                Object objG4 = null;
                Object objG5 = null;
                Object objG6 = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    switch (iX) {
                        case -1:
                            z10 = false;
                            break;
                        case 0:
                            objG = bVarD.G(descriptor2, 0, new C1526e(C0.f11399a), objG);
                            i |= 1;
                            break;
                        case 1:
                            objG2 = bVarD.G(descriptor2, 1, b.a.INSTANCE, objG2);
                            i |= 2;
                            break;
                        case 2:
                            objG3 = bVarD.G(descriptor2, 2, Y.f11465a, objG3);
                            i |= 4;
                            break;
                        case 3:
                            objG4 = bVarD.G(descriptor2, 3, C0.f11399a, objG4);
                            i |= 8;
                            break;
                        case 4:
                            objG5 = bVarD.G(descriptor2, 4, C0.f11399a, objG5);
                            i |= 16;
                            break;
                        case 5:
                            objG6 = bVarD.G(descriptor2, 5, C0.f11399a, objG6);
                            i |= 32;
                            break;
                        default:
                            throw new n(iX);
                    }
                }
                bVarD.b(descriptor2);
                return new i(i, (List) objG, (b) objG2, (Long) objG3, (String) objG4, (String) objG5, (String) objG6, (x0) null);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, i value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                i.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$i$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<i> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public i() {
            this((List) null, (b) null, (Long) null, (String) null, (String) null, (String) null, 63, (kotlin.jvm.internal.g) null);
        }

        public static /* synthetic */ i copy$default(i iVar, List list, b bVar, Long l5, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                list = iVar.placements;
            }
            if ((i & 2) != 0) {
                bVar = iVar.adSize;
            }
            if ((i & 4) != 0) {
                l5 = iVar.adStartTime;
            }
            if ((i & 8) != 0) {
                str = iVar.advAppId;
            }
            if ((i & 16) != 0) {
                str2 = iVar.placementReferenceId;
            }
            if ((i & 32) != 0) {
                str3 = iVar.user;
            }
            String str4 = str2;
            String str5 = str3;
            return iVar.copy(list, bVar, l5, str, str4, str5);
        }

        public static final void write$Self(i self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || self.placements != null) {
                output.w(serialDesc, 0, new C1526e(C0.f11399a), self.placements);
            }
            if (output.F(serialDesc, 1) || self.adSize != null) {
                output.w(serialDesc, 1, b.a.INSTANCE, self.adSize);
            }
            if (output.F(serialDesc, 2) || self.adStartTime != null) {
                output.w(serialDesc, 2, Y.f11465a, self.adStartTime);
            }
            if (output.F(serialDesc, 3) || self.advAppId != null) {
                output.w(serialDesc, 3, C0.f11399a, self.advAppId);
            }
            if (output.F(serialDesc, 4) || self.placementReferenceId != null) {
                output.w(serialDesc, 4, C0.f11399a, self.placementReferenceId);
            }
            if (!output.F(serialDesc, 5) && self.user == null) {
                return;
            }
            output.w(serialDesc, 5, C0.f11399a, self.user);
        }

        public final List<String> component1() {
            return this.placements;
        }

        public final b component2() {
            return this.adSize;
        }

        public final Long component3() {
            return this.adStartTime;
        }

        public final String component4() {
            return this.advAppId;
        }

        public final String component5() {
            return this.placementReferenceId;
        }

        public final String component6() {
            return this.user;
        }

        public final i copy(List<String> list, b bVar, Long l5, String str, String str2, String str3) {
            return new i(list, bVar, l5, str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return kotlin.jvm.internal.l.b(this.placements, iVar.placements) && kotlin.jvm.internal.l.b(this.adSize, iVar.adSize) && kotlin.jvm.internal.l.b(this.adStartTime, iVar.adStartTime) && kotlin.jvm.internal.l.b(this.advAppId, iVar.advAppId) && kotlin.jvm.internal.l.b(this.placementReferenceId, iVar.placementReferenceId) && kotlin.jvm.internal.l.b(this.user, iVar.user);
        }

        public final b getAdSize() {
            return this.adSize;
        }

        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public final List<String> getPlacements() {
            return this.placements;
        }

        public final String getUser() {
            return this.user;
        }

        public int hashCode() {
            List<String> list = this.placements;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            b bVar = this.adSize;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Long l5 = this.adStartTime;
            int iHashCode3 = (iHashCode2 + (l5 == null ? 0 : l5.hashCode())) * 31;
            String str = this.advAppId;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placementReferenceId;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.user;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setAdSize(b bVar) {
            this.adSize = bVar;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RequestParam(placements=");
            sb.append(this.placements);
            sb.append(", adSize=");
            sb.append(this.adSize);
            sb.append(", adStartTime=");
            sb.append(this.adStartTime);
            sb.append(", advAppId=");
            sb.append(this.advAppId);
            sb.append(", placementReferenceId=");
            sb.append(this.placementReferenceId);
            sb.append(", user=");
            return B8.j(sb, this.user, ')');
        }

        public /* synthetic */ i(int i, List list, b bVar, Long l5, String str, String str2, String str3, x0 x0Var) {
            if ((i & 1) == 0) {
                this.placements = null;
            } else {
                this.placements = list;
            }
            if ((i & 2) == 0) {
                this.adSize = null;
            } else {
                this.adSize = bVar;
            }
            if ((i & 4) == 0) {
                this.adStartTime = null;
            } else {
                this.adStartTime = l5;
            }
            if ((i & 8) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str;
            }
            if ((i & 16) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str2;
            }
            if ((i & 32) == 0) {
                this.user = null;
            } else {
                this.user = str3;
            }
        }

        public i(List<String> list, b bVar, Long l5, String str, String str2, String str3) {
            this.placements = list;
            this.adSize = bVar;
            this.adStartTime = l5;
            this.advAppId = str;
            this.placementReferenceId = str2;
            this.user = str3;
        }

        public /* synthetic */ i(List list, b bVar, Long l5, String str, String str2, String str3, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bVar, (i & 4) != 0 ? null : l5, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
        }

        public static /* synthetic */ void getAdSize$annotations() {
        }

        public static /* synthetic */ void getAdStartTime$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }
    }

    /* compiled from: CommonRequestBody.kt */
    @M9.h
    /* renamed from: a6.f$j */
    public static final class j {
        public static final b Companion = new b(null);
        private c ccpa;
        private d coppa;
        private Y5.c fpd;
        private C0221f gdpr;
        private g iab;

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$j$a */
        public static final class a implements H<j> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.CommonRequestBody.User", aVar, 5);
                c1547o0.k("gdpr", true);
                c1547o0.k("ccpa", true);
                c1547o0.k("coppa", true);
                c1547o0.k("fpd", true);
                c1547o0.k("iab", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                return new M9.b[]{N9.a.b(C0221f.a.INSTANCE), N9.a.b(c.a.INSTANCE), N9.a.b(d.a.INSTANCE), N9.a.b(c.a.INSTANCE), N9.a.b(g.a.INSTANCE)};
            }

            @Override // M9.b
            public j deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                Object objG = null;
                boolean z10 = true;
                int i = 0;
                Object objG2 = null;
                Object objG3 = null;
                Object objG4 = null;
                Object objG5 = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        objG = bVarD.G(descriptor2, 0, C0221f.a.INSTANCE, objG);
                        i |= 1;
                    } else if (iX == 1) {
                        objG2 = bVarD.G(descriptor2, 1, c.a.INSTANCE, objG2);
                        i |= 2;
                    } else if (iX == 2) {
                        objG3 = bVarD.G(descriptor2, 2, d.a.INSTANCE, objG3);
                        i |= 4;
                    } else if (iX == 3) {
                        objG4 = bVarD.G(descriptor2, 3, c.a.INSTANCE, objG4);
                        i |= 8;
                    } else {
                        if (iX != 4) {
                            throw new n(iX);
                        }
                        objG5 = bVarD.G(descriptor2, 4, g.a.INSTANCE, objG5);
                        i |= 16;
                    }
                }
                bVarD.b(descriptor2);
                return new j(i, (C0221f) objG, (c) objG2, (d) objG3, (Y5.c) objG4, (g) objG5, (x0) null);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, j value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                j.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$j$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<j> serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public j() {
            this((C0221f) null, (c) null, (d) null, (Y5.c) null, (g) null, 31, (kotlin.jvm.internal.g) null);
        }

        public static /* synthetic */ j copy$default(j jVar, C0221f c0221f, c cVar, d dVar, Y5.c cVar2, g gVar, int i, Object obj) {
            if ((i & 1) != 0) {
                c0221f = jVar.gdpr;
            }
            if ((i & 2) != 0) {
                cVar = jVar.ccpa;
            }
            if ((i & 4) != 0) {
                dVar = jVar.coppa;
            }
            if ((i & 8) != 0) {
                cVar2 = jVar.fpd;
            }
            if ((i & 16) != 0) {
                gVar = jVar.iab;
            }
            g gVar2 = gVar;
            d dVar2 = dVar;
            return jVar.copy(c0221f, cVar, dVar2, cVar2, gVar2);
        }

        public static final void write$Self(j self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || self.gdpr != null) {
                output.w(serialDesc, 0, C0221f.a.INSTANCE, self.gdpr);
            }
            if (output.F(serialDesc, 1) || self.ccpa != null) {
                output.w(serialDesc, 1, c.a.INSTANCE, self.ccpa);
            }
            if (output.F(serialDesc, 2) || self.coppa != null) {
                output.w(serialDesc, 2, d.a.INSTANCE, self.coppa);
            }
            if (output.F(serialDesc, 3) || self.fpd != null) {
                output.w(serialDesc, 3, c.a.INSTANCE, self.fpd);
            }
            if (!output.F(serialDesc, 4) && self.iab == null) {
                return;
            }
            output.w(serialDesc, 4, g.a.INSTANCE, self.iab);
        }

        public final C0221f component1() {
            return this.gdpr;
        }

        public final c component2() {
            return this.ccpa;
        }

        public final d component3() {
            return this.coppa;
        }

        public final Y5.c component4() {
            return this.fpd;
        }

        public final g component5() {
            return this.iab;
        }

        public final j copy(C0221f c0221f, c cVar, d dVar, Y5.c cVar2, g gVar) {
            return new j(c0221f, cVar, dVar, cVar2, gVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.l.b(this.gdpr, jVar.gdpr) && kotlin.jvm.internal.l.b(this.ccpa, jVar.ccpa) && kotlin.jvm.internal.l.b(this.coppa, jVar.coppa) && kotlin.jvm.internal.l.b(this.fpd, jVar.fpd) && kotlin.jvm.internal.l.b(this.iab, jVar.iab);
        }

        public final c getCcpa() {
            return this.ccpa;
        }

        public final d getCoppa() {
            return this.coppa;
        }

        public final Y5.c getFpd() {
            return this.fpd;
        }

        public final C0221f getGdpr() {
            return this.gdpr;
        }

        public final g getIab() {
            return this.iab;
        }

        public int hashCode() {
            C0221f c0221f = this.gdpr;
            int iHashCode = (c0221f == null ? 0 : c0221f.hashCode()) * 31;
            c cVar = this.ccpa;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            d dVar = this.coppa;
            int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            Y5.c cVar2 = this.fpd;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            g gVar = this.iab;
            return iHashCode4 + (gVar != null ? gVar.hashCode() : 0);
        }

        public final void setCcpa(c cVar) {
            this.ccpa = cVar;
        }

        public final void setCoppa(d dVar) {
            this.coppa = dVar;
        }

        public final void setFpd(Y5.c cVar) {
            this.fpd = cVar;
        }

        public final void setGdpr(C0221f c0221f) {
            this.gdpr = c0221f;
        }

        public final void setIab(g gVar) {
            this.iab = gVar;
        }

        public String toString() {
            return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ", fpd=" + this.fpd + ", iab=" + this.iab + ')';
        }

        public /* synthetic */ j(int i, C0221f c0221f, c cVar, d dVar, Y5.c cVar2, g gVar, x0 x0Var) {
            if ((i & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = c0221f;
            }
            if ((i & 2) == 0) {
                this.ccpa = null;
            } else {
                this.ccpa = cVar;
            }
            if ((i & 4) == 0) {
                this.coppa = null;
            } else {
                this.coppa = dVar;
            }
            if ((i & 8) == 0) {
                this.fpd = null;
            } else {
                this.fpd = cVar2;
            }
            if ((i & 16) == 0) {
                this.iab = null;
            } else {
                this.iab = gVar;
            }
        }

        public j(C0221f c0221f, c cVar, d dVar, Y5.c cVar2, g gVar) {
            this.gdpr = c0221f;
            this.ccpa = cVar;
            this.coppa = dVar;
            this.fpd = cVar2;
            this.iab = gVar;
        }

        public /* synthetic */ j(C0221f c0221f, c cVar, d dVar, Y5.c cVar2, g gVar, int i, kotlin.jvm.internal.g gVar2) {
            this((i & 1) != 0 ? null : c0221f, (i & 2) != 0 ? null : cVar, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? null : cVar2, (i & 16) != 0 ? null : gVar);
        }
    }

    public /* synthetic */ C1657f(int i10, C1659h c1659h, C1655d c1655d, j jVar, h hVar, i iVar, x0 x0Var) {
        if (1 != (i10 & 1)) {
            G0.a(i10, 1, a.INSTANCE.getDescriptor());
            throw null;
        }
        this.device = c1659h;
        if ((i10 & 2) == 0) {
            this.app = null;
        } else {
            this.app = c1655d;
        }
        if ((i10 & 4) == 0) {
            this.user = null;
        } else {
            this.user = jVar;
        }
        if ((i10 & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = hVar;
        }
        if ((i10 & 16) == 0) {
            this.request = null;
        } else {
            this.request = iVar;
        }
    }

    public static /* synthetic */ C1657f copy$default(C1657f c1657f, C1659h c1659h, C1655d c1655d, j jVar, h hVar, i iVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c1659h = c1657f.device;
        }
        if ((i10 & 2) != 0) {
            c1655d = c1657f.app;
        }
        if ((i10 & 4) != 0) {
            jVar = c1657f.user;
        }
        if ((i10 & 8) != 0) {
            hVar = c1657f.ext;
        }
        if ((i10 & 16) != 0) {
            iVar = c1657f.request;
        }
        i iVar2 = iVar;
        j jVar2 = jVar;
        return c1657f.copy(c1659h, c1655d, jVar2, hVar, iVar2);
    }

    public static final void write$Self(C1657f self, P9.c output, O9.e serialDesc) {
        kotlin.jvm.internal.l.f(self, "self");
        kotlin.jvm.internal.l.f(output, "output");
        kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
        output.y(serialDesc, 0, C1659h.a.INSTANCE, self.device);
        if (output.F(serialDesc, 1) || self.app != null) {
            output.w(serialDesc, 1, C1655d.a.INSTANCE, self.app);
        }
        if (output.F(serialDesc, 2) || self.user != null) {
            output.w(serialDesc, 2, j.a.INSTANCE, self.user);
        }
        if (output.F(serialDesc, 3) || self.ext != null) {
            output.w(serialDesc, 3, h.a.INSTANCE, self.ext);
        }
        if (!output.F(serialDesc, 4) && self.request == null) {
            return;
        }
        output.w(serialDesc, 4, i.a.INSTANCE, self.request);
    }

    public final C1659h component1() {
        return this.device;
    }

    public final C1655d component2() {
        return this.app;
    }

    public final j component3() {
        return this.user;
    }

    public final h component4() {
        return this.ext;
    }

    public final i component5() {
        return this.request;
    }

    public final C1657f copy(C1659h device, C1655d c1655d, j jVar, h hVar, i iVar) {
        kotlin.jvm.internal.l.f(device, "device");
        return new C1657f(device, c1655d, jVar, hVar, iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1657f)) {
            return false;
        }
        C1657f c1657f = (C1657f) obj;
        return kotlin.jvm.internal.l.b(this.device, c1657f.device) && kotlin.jvm.internal.l.b(this.app, c1657f.app) && kotlin.jvm.internal.l.b(this.user, c1657f.user) && kotlin.jvm.internal.l.b(this.ext, c1657f.ext) && kotlin.jvm.internal.l.b(this.request, c1657f.request);
    }

    public final C1655d getApp() {
        return this.app;
    }

    public final C1659h getDevice() {
        return this.device;
    }

    public final h getExt() {
        return this.ext;
    }

    public final i getRequest() {
        return this.request;
    }

    public final j getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        C1655d c1655d = this.app;
        int iHashCode2 = (iHashCode + (c1655d == null ? 0 : c1655d.hashCode())) * 31;
        j jVar = this.user;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        h hVar = this.ext;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i iVar = this.request;
        return iHashCode4 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final void setExt(h hVar) {
        this.ext = hVar;
    }

    public final void setRequest(i iVar) {
        this.request = iVar;
    }

    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ')';
    }

    /* compiled from: CommonRequestBody.kt */
    @M9.h
    /* renamed from: a6.f$b */
    public static final class b {
        public static final C0220b Companion = new C0220b(null);
        private final int height;
        private final int width;

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$b$a */
        public static final class a implements H<b> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam", aVar, 2);
                c1547o0.k("w", false);
                c1547o0.k("h", false);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                Q q10 = Q.f11448a;
                return new M9.b[]{q10, q10};
            }

            @Override // M9.b
            public b deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                boolean z10 = true;
                int i = 0;
                int i10 = 0;
                int i11 = 0;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        i10 = bVarD.i(descriptor2, 0);
                        i |= 1;
                    } else {
                        if (iX != 1) {
                            throw new n(iX);
                        }
                        i11 = bVarD.i(descriptor2, 1);
                        i |= 2;
                    }
                }
                bVarD.b(descriptor2);
                return new b(i, i10, i11, null);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, b value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                b.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: CommonRequestBody.kt */
        /* renamed from: a6.f$b$b, reason: collision with other inner class name */
        public static final class C0220b {
            public /* synthetic */ C0220b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<b> serializer() {
                return a.INSTANCE;
            }

            private C0220b() {
            }
        }

        public b(int i, int i10) {
            this.width = i;
            this.height = i10;
        }

        public static /* synthetic */ b copy$default(b bVar, int i, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i = bVar.width;
            }
            if ((i11 & 2) != 0) {
                i10 = bVar.height;
            }
            return bVar.copy(i, i10);
        }

        public static final void write$Self(b self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            output.n(0, self.width, serialDesc);
            output.n(1, self.height, serialDesc);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final b copy(int i, int i10) {
            return new b(i, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.width == bVar.width && this.height == bVar.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (this.width * 31) + this.height;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AdSizeParam(width=");
            sb.append(this.width);
            sb.append(", height=");
            return H7.p(sb, this.height, ')');
        }

        public /* synthetic */ b(int i, int i10, int i11, x0 x0Var) {
            if (3 != (i & 3)) {
                G0.a(i, 3, a.INSTANCE.getDescriptor());
                throw null;
            }
            this.width = i10;
            this.height = i11;
        }

        public static /* synthetic */ void getHeight$annotations() {
        }

        public static /* synthetic */ void getWidth$annotations() {
        }
    }

    public C1657f(C1659h device, C1655d c1655d, j jVar, h hVar, i iVar) {
        kotlin.jvm.internal.l.f(device, "device");
        this.device = device;
        this.app = c1655d;
        this.user = jVar;
        this.ext = hVar;
        this.request = iVar;
    }

    public /* synthetic */ C1657f(C1659h c1659h, C1655d c1655d, j jVar, h hVar, i iVar, int i10, kotlin.jvm.internal.g gVar) {
        this(c1659h, (i10 & 2) != 0 ? null : c1655d, (i10 & 4) != 0 ? null : jVar, (i10 & 8) != 0 ? null : hVar, (i10 & 16) != 0 ? null : iVar);
    }
}
