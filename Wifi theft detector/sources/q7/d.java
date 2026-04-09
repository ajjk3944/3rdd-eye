package q7;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b1;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.m1;
import kotlinx.serialization.internal.r0;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q7.c;
import q7.e;

/* loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final e Companion = new e(null);

    @Nullable
    private final q7.c app;

    @NotNull
    private final q7.e device;

    @Nullable
    private h ext;

    @Nullable
    private i request;

    @Nullable
    private final j user;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody", aVar, 5);
            pluginGeneratedSerialDescriptor.k("device", false);
            pluginGeneratedSerialDescriptor.k(MBridgeConstans.DYNAMIC_VIEW_WX_APP, true);
            pluginGeneratedSerialDescriptor.k("user", true);
            pluginGeneratedSerialDescriptor.k("ext", true);
            pluginGeneratedSerialDescriptor.k(AdActivity.REQUEST_KEY_EXTRA, true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            return new kotlinx.serialization.b[]{e.a.INSTANCE, x9.a.s(c.a.INSTANCE), x9.a.s(j.a.INSTANCE), x9.a.s(h.a.INSTANCE), x9.a.s(i.a.INSTANCE)};
        }

        @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
        @NotNull
        public kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] typeParametersSerializers() {
            return i0.a.a(this);
        }

        @Override // kotlinx.serialization.a
        @NotNull
        public d deserialize(@NotNull y9.e decoder) {
            int i10;
            Object objY;
            Object objN;
            Object objN2;
            Object objN3;
            Object objN4;
            p.e(decoder, "decoder");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            Object objY2 = null;
            if (cVarB.p()) {
                objY = cVarB.y(descriptor2, 0, e.a.INSTANCE, null);
                objN = cVarB.n(descriptor2, 1, c.a.INSTANCE, null);
                objN2 = cVarB.n(descriptor2, 2, j.a.INSTANCE, null);
                objN3 = cVarB.n(descriptor2, 3, h.a.INSTANCE, null);
                objN4 = cVarB.n(descriptor2, 4, i.a.INSTANCE, null);
                i10 = 31;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Object objN5 = null;
                Object objN6 = null;
                Object objN7 = null;
                Object objN8 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    if (iO == -1) {
                        z10 = false;
                    } else if (iO == 0) {
                        objY2 = cVarB.y(descriptor2, 0, e.a.INSTANCE, objY2);
                        i11 |= 1;
                    } else if (iO == 1) {
                        objN5 = cVarB.n(descriptor2, 1, c.a.INSTANCE, objN5);
                        i11 |= 2;
                    } else if (iO == 2) {
                        objN6 = cVarB.n(descriptor2, 2, j.a.INSTANCE, objN6);
                        i11 |= 4;
                    } else if (iO == 3) {
                        objN7 = cVarB.n(descriptor2, 3, h.a.INSTANCE, objN7);
                        i11 |= 8;
                    } else {
                        if (iO != 4) {
                            throw new UnknownFieldException(iO);
                        }
                        objN8 = cVarB.n(descriptor2, 4, i.a.INSTANCE, objN8);
                        i11 |= 16;
                    }
                }
                Object obj = objY2;
                i10 = i11;
                objY = obj;
                objN = objN5;
                objN2 = objN6;
                objN3 = objN7;
                objN4 = objN8;
            }
            cVarB.c(descriptor2);
            return new d(i10, (q7.e) objY, (q7.c) objN, (j) objN2, (h) objN3, (i) objN4, (w1) null);
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull d value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.d dVarB = encoder.b(descriptor2);
            d.write$Self(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }
    }

    public static final class c {

        @NotNull
        public static final b Companion = new b(null);

        @NotNull
        private final String status;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.CCPA", aVar, 1);
                pluginGeneratedSerialDescriptor.k(NotificationCompat.CATEGORY_STATUS, false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                return new kotlinx.serialization.b[]{b2.f22828a};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public c deserialize(@NotNull y9.e decoder) {
                String strM;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                int i10 = 1;
                w1 w1Var = null;
                if (cVarB.p()) {
                    strM = cVarB.m(descriptor2, 0);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strM = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else {
                            if (iO != 0) {
                                throw new UnknownFieldException(iO);
                            }
                            strM = cVarB.m(descriptor2, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarB.c(descriptor2);
                return new c(i10, strM, w1Var);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull c value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                c.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ c(int i10, String str, w1 w1Var) {
            if (1 != (i10 & 1)) {
                m1.a(i10, 1, a.INSTANCE.getDescriptor());
            }
            this.status = str;
        }

        public static /* synthetic */ c copy$default(c cVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = cVar.status;
            }
            return cVar.copy(str);
        }

        @JvmStatic
        public static final void write$Self(@NotNull c self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            output.y(serialDesc, 0, self.status);
        }

        @NotNull
        public final String component1() {
            return this.status;
        }

        @NotNull
        public final c copy(@NotNull String status) {
            p.e(status, "status");
            return new c(status);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p.a(this.status, ((c) obj).status);
        }

        @NotNull
        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        @NotNull
        public String toString() {
            return "CCPA(status=" + this.status + ')';
        }

        public c(@NotNull String status) {
            p.e(status, "status");
            this.status = status;
        }
    }

    /* renamed from: q7.d$d, reason: collision with other inner class name */
    public static final class C0471d {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final Boolean isCoppa;

        /* renamed from: q7.d$d$a */
        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.COPPA", aVar, 1);
                pluginGeneratedSerialDescriptor.k("is_coppa", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                return new kotlinx.serialization.b[]{x9.a.s(kotlinx.serialization.internal.i.f22868a)};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public C0471d deserialize(@NotNull y9.e decoder) {
                Object objN;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                int i10 = 1;
                w1 w1Var = null;
                if (cVarB.p()) {
                    objN = cVarB.n(descriptor2, 0, kotlinx.serialization.internal.i.f22868a, null);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objN = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else {
                            if (iO != 0) {
                                throw new UnknownFieldException(iO);
                            }
                            objN = cVarB.n(descriptor2, 0, kotlinx.serialization.internal.i.f22868a, objN);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarB.c(descriptor2);
                return new C0471d(i10, (Boolean) objN, w1Var);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull C0471d value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                C0471d.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        /* renamed from: q7.d$d$b */
        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ C0471d(int i10, @SerialName("is_coppa") Boolean bool, w1 w1Var) {
            if (1 != (i10 & 1)) {
                m1.a(i10, 1, a.INSTANCE.getDescriptor());
            }
            this.isCoppa = bool;
        }

        public static /* synthetic */ C0471d copy$default(C0471d c0471d, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = c0471d.isCoppa;
            }
            return c0471d.copy(bool);
        }

        @JvmStatic
        public static final void write$Self(@NotNull C0471d self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            output.i(serialDesc, 0, kotlinx.serialization.internal.i.f22868a, self.isCoppa);
        }

        @Nullable
        public final Boolean component1() {
            return this.isCoppa;
        }

        @NotNull
        public final C0471d copy(@Nullable Boolean bool) {
            return new C0471d(bool);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0471d) && p.a(this.isCoppa, ((C0471d) obj).isCoppa);
        }

        public int hashCode() {
            Boolean bool = this.isCoppa;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @Nullable
        public final Boolean isCoppa() {
            return this.isCoppa;
        }

        @NotNull
        public String toString() {
            return "COPPA(isCoppa=" + this.isCoppa + ')';
        }

        public C0471d(@Nullable Boolean bool) {
            this.isCoppa = bool;
        }

        @SerialName("is_coppa")
        public static /* synthetic */ void isCoppa$annotations() {
        }
    }

    public static final class e {
        public /* synthetic */ e(kotlin.jvm.internal.i iVar) {
            this();
        }

        @NotNull
        public final kotlinx.serialization.b serializer() {
            return a.INSTANCE;
        }

        private e() {
        }
    }

    public static final class f {

        @NotNull
        public static final b Companion = new b(null);

        @NotNull
        private final String consentMessageVersion;

        @NotNull
        private final String consentSource;

        @NotNull
        private final String consentStatus;
        private final long consentTimestamp;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.GDPR", aVar, 4);
                pluginGeneratedSerialDescriptor.k("consent_status", false);
                pluginGeneratedSerialDescriptor.k("consent_source", false);
                pluginGeneratedSerialDescriptor.k("consent_timestamp", false);
                pluginGeneratedSerialDescriptor.k("consent_message_version", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                b2 b2Var = b2.f22828a;
                return new kotlinx.serialization.b[]{b2Var, b2Var, b1.f22826a, b2Var};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public f deserialize(@NotNull y9.e decoder) {
                String strM;
                String strM2;
                int i10;
                String str;
                long j10;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                if (cVarB.p()) {
                    strM = cVarB.m(descriptor2, 0);
                    String strM3 = cVarB.m(descriptor2, 1);
                    long jF = cVarB.f(descriptor2, 2);
                    strM2 = cVarB.m(descriptor2, 3);
                    i10 = 15;
                    str = strM3;
                    j10 = jF;
                } else {
                    strM = null;
                    String strM4 = null;
                    boolean z10 = true;
                    long jF2 = 0;
                    String strM5 = null;
                    int i11 = 0;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            strM = cVarB.m(descriptor2, 0);
                            i11 |= 1;
                        } else if (iO == 1) {
                            strM4 = cVarB.m(descriptor2, 1);
                            i11 |= 2;
                        } else if (iO == 2) {
                            jF2 = cVarB.f(descriptor2, 2);
                            i11 |= 4;
                        } else {
                            if (iO != 3) {
                                throw new UnknownFieldException(iO);
                            }
                            strM5 = cVarB.m(descriptor2, 3);
                            i11 |= 8;
                        }
                    }
                    strM2 = strM5;
                    i10 = i11;
                    str = strM4;
                    j10 = jF2;
                }
                String str2 = strM;
                cVarB.c(descriptor2);
                return new f(i10, str2, str, j10, strM2, null);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull f value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                f.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ f(int i10, @SerialName("consent_status") String str, @SerialName("consent_source") String str2, @SerialName("consent_timestamp") long j10, @SerialName("consent_message_version") String str3, w1 w1Var) {
            if (15 != (i10 & 15)) {
                m1.a(i10, 15, a.INSTANCE.getDescriptor());
            }
            this.consentStatus = str;
            this.consentSource = str2;
            this.consentTimestamp = j10;
            this.consentMessageVersion = str3;
        }

        public static /* synthetic */ f copy$default(f fVar, String str, String str2, long j10, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fVar.consentStatus;
            }
            if ((i10 & 2) != 0) {
                str2 = fVar.consentSource;
            }
            if ((i10 & 4) != 0) {
                j10 = fVar.consentTimestamp;
            }
            if ((i10 & 8) != 0) {
                str3 = fVar.consentMessageVersion;
            }
            String str4 = str3;
            return fVar.copy(str, str2, j10, str4);
        }

        @JvmStatic
        public static final void write$Self(@NotNull f self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            output.y(serialDesc, 0, self.consentStatus);
            output.y(serialDesc, 1, self.consentSource);
            output.F(serialDesc, 2, self.consentTimestamp);
            output.y(serialDesc, 3, self.consentMessageVersion);
        }

        @NotNull
        public final String component1() {
            return this.consentStatus;
        }

        @NotNull
        public final String component2() {
            return this.consentSource;
        }

        public final long component3() {
            return this.consentTimestamp;
        }

        @NotNull
        public final String component4() {
            return this.consentMessageVersion;
        }

        @NotNull
        public final f copy(@NotNull String consentStatus, @NotNull String consentSource, long j10, @NotNull String consentMessageVersion) {
            p.e(consentStatus, "consentStatus");
            p.e(consentSource, "consentSource");
            p.e(consentMessageVersion, "consentMessageVersion");
            return new f(consentStatus, consentSource, j10, consentMessageVersion);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p.a(this.consentStatus, fVar.consentStatus) && p.a(this.consentSource, fVar.consentSource) && this.consentTimestamp == fVar.consentTimestamp && p.a(this.consentMessageVersion, fVar.consentMessageVersion);
        }

        @NotNull
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        @NotNull
        public final String getConsentSource() {
            return this.consentSource;
        }

        @NotNull
        public final String getConsentStatus() {
            return this.consentStatus;
        }

        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        public int hashCode() {
            return (((((this.consentStatus.hashCode() * 31) + this.consentSource.hashCode()) * 31) + androidx.privacysandbox.ads.adservices.topics.d.a(this.consentTimestamp)) * 31) + this.consentMessageVersion.hashCode();
        }

        @NotNull
        public String toString() {
            return "GDPR(consentStatus=" + this.consentStatus + ", consentSource=" + this.consentSource + ", consentTimestamp=" + this.consentTimestamp + ", consentMessageVersion=" + this.consentMessageVersion + ')';
        }

        public f(@NotNull String consentStatus, @NotNull String consentSource, long j10, @NotNull String consentMessageVersion) {
            p.e(consentStatus, "consentStatus");
            p.e(consentSource, "consentSource");
            p.e(consentMessageVersion, "consentMessageVersion");
            this.consentStatus = consentStatus;
            this.consentSource = consentSource;
            this.consentTimestamp = j10;
            this.consentMessageVersion = consentMessageVersion;
        }

        @SerialName("consent_message_version")
        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        @SerialName("consent_source")
        public static /* synthetic */ void getConsentSource$annotations() {
        }

        @SerialName("consent_status")
        public static /* synthetic */ void getConsentStatus$annotations() {
        }

        @SerialName("consent_timestamp")
        public static /* synthetic */ void getConsentTimestamp$annotations() {
        }
    }

    public static final class g {

        @NotNull
        public static final b Companion = new b(null);

        @NotNull
        private final String tcf;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.IAB", aVar, 1);
                pluginGeneratedSerialDescriptor.k("tcf", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                return new kotlinx.serialization.b[]{b2.f22828a};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public g deserialize(@NotNull y9.e decoder) {
                String strM;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                int i10 = 1;
                w1 w1Var = null;
                if (cVarB.p()) {
                    strM = cVarB.m(descriptor2, 0);
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    strM = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else {
                            if (iO != 0) {
                                throw new UnknownFieldException(iO);
                            }
                            strM = cVarB.m(descriptor2, 0);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarB.c(descriptor2);
                return new g(i10, strM, w1Var);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull g value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                g.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ g(int i10, @SerialName("tcf") String str, w1 w1Var) {
            if (1 != (i10 & 1)) {
                m1.a(i10, 1, a.INSTANCE.getDescriptor());
            }
            this.tcf = str;
        }

        public static /* synthetic */ g copy$default(g gVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = gVar.tcf;
            }
            return gVar.copy(str);
        }

        @JvmStatic
        public static final void write$Self(@NotNull g self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            output.y(serialDesc, 0, self.tcf);
        }

        @NotNull
        public final String component1() {
            return this.tcf;
        }

        @NotNull
        public final g copy(@NotNull String tcf) {
            p.e(tcf, "tcf");
            return new g(tcf);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && p.a(this.tcf, ((g) obj).tcf);
        }

        @NotNull
        public final String getTcf() {
            return this.tcf;
        }

        public int hashCode() {
            return this.tcf.hashCode();
        }

        @NotNull
        public String toString() {
            return "IAB(tcf=" + this.tcf + ')';
        }

        public g(@NotNull String tcf) {
            p.e(tcf, "tcf");
            this.tcf = tcf;
        }

        @SerialName("tcf")
        public static /* synthetic */ void getTcf$annotations() {
        }
    }

    public static final class h {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final String configExtension;

        @Nullable
        private final Long configLastValidatedTimestamp;

        @Nullable
        private String signals;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.RequestExt", aVar, 3);
                pluginGeneratedSerialDescriptor.k("config_extension", true);
                pluginGeneratedSerialDescriptor.k("signals", true);
                pluginGeneratedSerialDescriptor.k("config_last_validated_ts", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                b2 b2Var = b2.f22828a;
                return new kotlinx.serialization.b[]{x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(b1.f22826a)};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public h deserialize(@NotNull y9.e decoder) {
                int i10;
                Object objN;
                Object objN2;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                Object objN3 = null;
                if (cVarB.p()) {
                    b2 b2Var = b2.f22828a;
                    Object objN4 = cVarB.n(descriptor2, 0, b2Var, null);
                    objN = cVarB.n(descriptor2, 1, b2Var, null);
                    objN2 = cVarB.n(descriptor2, 2, b1.f22826a, null);
                    objN3 = objN4;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Object objN5 = null;
                    Object objN6 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objN3 = cVarB.n(descriptor2, 0, b2.f22828a, objN3);
                            i11 |= 1;
                        } else if (iO == 1) {
                            objN5 = cVarB.n(descriptor2, 1, b2.f22828a, objN5);
                            i11 |= 2;
                        } else {
                            if (iO != 2) {
                                throw new UnknownFieldException(iO);
                            }
                            objN6 = cVarB.n(descriptor2, 2, b1.f22826a, objN6);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    objN = objN5;
                    objN2 = objN6;
                }
                cVarB.c(descriptor2);
                return new h(i10, (String) objN3, (String) objN, (Long) objN2, (w1) null);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull h value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                h.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public h() {
            this((String) null, (String) null, (Long) null, 7, (kotlin.jvm.internal.i) null);
        }

        public static /* synthetic */ h copy$default(h hVar, String str, String str2, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = hVar.configExtension;
            }
            if ((i10 & 2) != 0) {
                str2 = hVar.signals;
            }
            if ((i10 & 4) != 0) {
                l10 = hVar.configLastValidatedTimestamp;
            }
            return hVar.copy(str, str2, l10);
        }

        @JvmStatic
        public static final void write$Self(@NotNull h self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.configExtension != null) {
                output.i(serialDesc, 0, b2.f22828a, self.configExtension);
            }
            if (output.z(serialDesc, 1) || self.signals != null) {
                output.i(serialDesc, 1, b2.f22828a, self.signals);
            }
            if (!output.z(serialDesc, 2) && self.configLastValidatedTimestamp == null) {
                return;
            }
            output.i(serialDesc, 2, b1.f22826a, self.configLastValidatedTimestamp);
        }

        @Nullable
        public final String component1() {
            return this.configExtension;
        }

        @Nullable
        public final String component2() {
            return this.signals;
        }

        @Nullable
        public final Long component3() {
            return this.configLastValidatedTimestamp;
        }

        @NotNull
        public final h copy(@Nullable String str, @Nullable String str2, @Nullable Long l10) {
            return new h(str, str2, l10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return p.a(this.configExtension, hVar.configExtension) && p.a(this.signals, hVar.signals) && p.a(this.configLastValidatedTimestamp, hVar.configLastValidatedTimestamp);
        }

        @Nullable
        public final String getConfigExtension() {
            return this.configExtension;
        }

        @Nullable
        public final Long getConfigLastValidatedTimestamp() {
            return this.configLastValidatedTimestamp;
        }

        @Nullable
        public final String getSignals() {
            return this.signals;
        }

        public int hashCode() {
            String str = this.configExtension;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.signals;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l10 = this.configLastValidatedTimestamp;
            return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
        }

        public final void setSignals(@Nullable String str) {
            this.signals = str;
        }

        @NotNull
        public String toString() {
            return "RequestExt(configExtension=" + this.configExtension + ", signals=" + this.signals + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ h(int i10, @SerialName("config_extension") String str, @SerialName("signals") String str2, @SerialName("config_last_validated_ts") Long l10, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.configExtension = null;
            } else {
                this.configExtension = str;
            }
            if ((i10 & 2) == 0) {
                this.signals = null;
            } else {
                this.signals = str2;
            }
            if ((i10 & 4) == 0) {
                this.configLastValidatedTimestamp = null;
            } else {
                this.configLastValidatedTimestamp = l10;
            }
        }

        public h(@Nullable String str, @Nullable String str2, @Nullable Long l10) {
            this.configExtension = str;
            this.signals = str2;
            this.configLastValidatedTimestamp = l10;
        }

        public /* synthetic */ h(String str, String str2, Long l10, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : l10);
        }

        @SerialName("config_extension")
        public static /* synthetic */ void getConfigExtension$annotations() {
        }

        @SerialName("config_last_validated_ts")
        public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
        }

        @SerialName("signals")
        public static /* synthetic */ void getSignals$annotations() {
        }
    }

    public static final class i {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private b adSize;

        @Nullable
        private final Long adStartTime;

        @Nullable
        private final String advAppId;

        @Nullable
        private final String placementReferenceId;

        @Nullable
        private final List<String> placements;

        @Nullable
        private final String user;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.RequestParam", aVar, 6);
                pluginGeneratedSerialDescriptor.k("placements", true);
                pluginGeneratedSerialDescriptor.k("ad_size", true);
                pluginGeneratedSerialDescriptor.k("ad_start_time", true);
                pluginGeneratedSerialDescriptor.k(MBridgeConstans.APP_ID, true);
                pluginGeneratedSerialDescriptor.k("placement_reference_id", true);
                pluginGeneratedSerialDescriptor.k("user", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                b2 b2Var = b2.f22828a;
                return new kotlinx.serialization.b[]{x9.a.s(new kotlinx.serialization.internal.f(b2Var)), x9.a.s(b.a.INSTANCE), x9.a.s(b1.f22826a), x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(b2Var)};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public i deserialize(@NotNull y9.e decoder) {
                int i10;
                Object objN;
                Object objN2;
                Object objN3;
                Object objN4;
                Object objN5;
                Object objN6;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                int i11 = 5;
                Object objN7 = null;
                if (cVarB.p()) {
                    b2 b2Var = b2.f22828a;
                    objN = cVarB.n(descriptor2, 0, new kotlinx.serialization.internal.f(b2Var), null);
                    objN2 = cVarB.n(descriptor2, 1, b.a.INSTANCE, null);
                    objN3 = cVarB.n(descriptor2, 2, b1.f22826a, null);
                    objN4 = cVarB.n(descriptor2, 3, b2Var, null);
                    objN5 = cVarB.n(descriptor2, 4, b2Var, null);
                    objN6 = cVarB.n(descriptor2, 5, b2Var, null);
                    i10 = 63;
                } else {
                    boolean z10 = true;
                    int i12 = 0;
                    Object objN8 = null;
                    Object objN9 = null;
                    Object objN10 = null;
                    Object objN11 = null;
                    Object objN12 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        switch (iO) {
                            case -1:
                                z10 = false;
                                i11 = 5;
                            case 0:
                                objN7 = cVarB.n(descriptor2, 0, new kotlinx.serialization.internal.f(b2.f22828a), objN7);
                                i12 |= 1;
                                i11 = 5;
                            case 1:
                                objN8 = cVarB.n(descriptor2, 1, b.a.INSTANCE, objN8);
                                i12 |= 2;
                            case 2:
                                objN9 = cVarB.n(descriptor2, 2, b1.f22826a, objN9);
                                i12 |= 4;
                            case 3:
                                objN10 = cVarB.n(descriptor2, 3, b2.f22828a, objN10);
                                i12 |= 8;
                            case 4:
                                objN11 = cVarB.n(descriptor2, 4, b2.f22828a, objN11);
                                i12 |= 16;
                            case 5:
                                objN12 = cVarB.n(descriptor2, i11, b2.f22828a, objN12);
                                i12 |= 32;
                            default:
                                throw new UnknownFieldException(iO);
                        }
                    }
                    Object obj = objN7;
                    i10 = i12;
                    objN = obj;
                    objN2 = objN8;
                    objN3 = objN9;
                    objN4 = objN10;
                    objN5 = objN11;
                    objN6 = objN12;
                }
                cVarB.c(descriptor2);
                return new i(i10, (List) objN, (b) objN2, (Long) objN3, (String) objN4, (String) objN5, (String) objN6, (w1) null);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull i value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                i.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public i() {
            this((List) null, (b) null, (Long) null, (String) null, (String) null, (String) null, 63, (kotlin.jvm.internal.i) null);
        }

        public static /* synthetic */ i copy$default(i iVar, List list, b bVar, Long l10, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = iVar.placements;
            }
            if ((i10 & 2) != 0) {
                bVar = iVar.adSize;
            }
            if ((i10 & 4) != 0) {
                l10 = iVar.adStartTime;
            }
            if ((i10 & 8) != 0) {
                str = iVar.advAppId;
            }
            if ((i10 & 16) != 0) {
                str2 = iVar.placementReferenceId;
            }
            if ((i10 & 32) != 0) {
                str3 = iVar.user;
            }
            String str4 = str2;
            String str5 = str3;
            return iVar.copy(list, bVar, l10, str, str4, str5);
        }

        @JvmStatic
        public static final void write$Self(@NotNull i self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.placements != null) {
                output.i(serialDesc, 0, new kotlinx.serialization.internal.f(b2.f22828a), self.placements);
            }
            if (output.z(serialDesc, 1) || self.adSize != null) {
                output.i(serialDesc, 1, b.a.INSTANCE, self.adSize);
            }
            if (output.z(serialDesc, 2) || self.adStartTime != null) {
                output.i(serialDesc, 2, b1.f22826a, self.adStartTime);
            }
            if (output.z(serialDesc, 3) || self.advAppId != null) {
                output.i(serialDesc, 3, b2.f22828a, self.advAppId);
            }
            if (output.z(serialDesc, 4) || self.placementReferenceId != null) {
                output.i(serialDesc, 4, b2.f22828a, self.placementReferenceId);
            }
            if (!output.z(serialDesc, 5) && self.user == null) {
                return;
            }
            output.i(serialDesc, 5, b2.f22828a, self.user);
        }

        @Nullable
        public final List<String> component1() {
            return this.placements;
        }

        @Nullable
        public final b component2() {
            return this.adSize;
        }

        @Nullable
        public final Long component3() {
            return this.adStartTime;
        }

        @Nullable
        public final String component4() {
            return this.advAppId;
        }

        @Nullable
        public final String component5() {
            return this.placementReferenceId;
        }

        @Nullable
        public final String component6() {
            return this.user;
        }

        @NotNull
        public final i copy(@Nullable List<String> list, @Nullable b bVar, @Nullable Long l10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            return new i(list, bVar, l10, str, str2, str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return p.a(this.placements, iVar.placements) && p.a(this.adSize, iVar.adSize) && p.a(this.adStartTime, iVar.adStartTime) && p.a(this.advAppId, iVar.advAppId) && p.a(this.placementReferenceId, iVar.placementReferenceId) && p.a(this.user, iVar.user);
        }

        @Nullable
        public final b getAdSize() {
            return this.adSize;
        }

        @Nullable
        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        @Nullable
        public final String getAdvAppId() {
            return this.advAppId;
        }

        @Nullable
        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        @Nullable
        public final List<String> getPlacements() {
            return this.placements;
        }

        @Nullable
        public final String getUser() {
            return this.user;
        }

        public int hashCode() {
            List<String> list = this.placements;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            b bVar = this.adSize;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Long l10 = this.adStartTime;
            int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
            String str = this.advAppId;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.placementReferenceId;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.user;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setAdSize(@Nullable b bVar) {
            this.adSize = bVar;
        }

        @NotNull
        public String toString() {
            return "RequestParam(placements=" + this.placements + ", adSize=" + this.adSize + ", adStartTime=" + this.adStartTime + ", advAppId=" + this.advAppId + ", placementReferenceId=" + this.placementReferenceId + ", user=" + this.user + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ i(int i10, List list, @SerialName("ad_size") b bVar, @SerialName("ad_start_time") Long l10, @SerialName(MBridgeConstans.APP_ID) String str, @SerialName("placement_reference_id") String str2, String str3, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.placements = null;
            } else {
                this.placements = list;
            }
            if ((i10 & 2) == 0) {
                this.adSize = null;
            } else {
                this.adSize = bVar;
            }
            if ((i10 & 4) == 0) {
                this.adStartTime = null;
            } else {
                this.adStartTime = l10;
            }
            if ((i10 & 8) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str;
            }
            if ((i10 & 16) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str2;
            }
            if ((i10 & 32) == 0) {
                this.user = null;
            } else {
                this.user = str3;
            }
        }

        public i(@Nullable List<String> list, @Nullable b bVar, @Nullable Long l10, @Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.placements = list;
            this.adSize = bVar;
            this.adStartTime = l10;
            this.advAppId = str;
            this.placementReferenceId = str2;
            this.user = str3;
        }

        public /* synthetic */ i(List list, b bVar, Long l10, String str, String str2, String str3, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : bVar, (i10 & 4) != 0 ? null : l10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3);
        }

        @SerialName("ad_size")
        public static /* synthetic */ void getAdSize$annotations() {
        }

        @SerialName("ad_start_time")
        public static /* synthetic */ void getAdStartTime$annotations() {
        }

        @SerialName(MBridgeConstans.APP_ID)
        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        @SerialName("placement_reference_id")
        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }
    }

    public static final class j {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private c ccpa;

        @Nullable
        private C0471d coppa;

        @Nullable
        private FirstPartyData fpd;

        @Nullable
        private f gdpr;

        @Nullable
        private g iab;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.User", aVar, 5);
                pluginGeneratedSerialDescriptor.k("gdpr", true);
                pluginGeneratedSerialDescriptor.k("ccpa", true);
                pluginGeneratedSerialDescriptor.k("coppa", true);
                pluginGeneratedSerialDescriptor.k("fpd", true);
                pluginGeneratedSerialDescriptor.k("iab", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                return new kotlinx.serialization.b[]{x9.a.s(f.a.INSTANCE), x9.a.s(c.a.INSTANCE), x9.a.s(C0471d.a.INSTANCE), x9.a.s(FirstPartyData.a.INSTANCE), x9.a.s(g.a.INSTANCE)};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public j deserialize(@NotNull y9.e decoder) {
                int i10;
                Object objN;
                Object objN2;
                Object objN3;
                Object objN4;
                Object objN5;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                Object objN6 = null;
                if (cVarB.p()) {
                    objN = cVarB.n(descriptor2, 0, f.a.INSTANCE, null);
                    objN2 = cVarB.n(descriptor2, 1, c.a.INSTANCE, null);
                    objN3 = cVarB.n(descriptor2, 2, C0471d.a.INSTANCE, null);
                    objN4 = cVarB.n(descriptor2, 3, FirstPartyData.a.INSTANCE, null);
                    objN5 = cVarB.n(descriptor2, 4, g.a.INSTANCE, null);
                    i10 = 31;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Object objN7 = null;
                    Object objN8 = null;
                    Object objN9 = null;
                    Object objN10 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objN6 = cVarB.n(descriptor2, 0, f.a.INSTANCE, objN6);
                            i11 |= 1;
                        } else if (iO == 1) {
                            objN7 = cVarB.n(descriptor2, 1, c.a.INSTANCE, objN7);
                            i11 |= 2;
                        } else if (iO == 2) {
                            objN8 = cVarB.n(descriptor2, 2, C0471d.a.INSTANCE, objN8);
                            i11 |= 4;
                        } else if (iO == 3) {
                            objN9 = cVarB.n(descriptor2, 3, FirstPartyData.a.INSTANCE, objN9);
                            i11 |= 8;
                        } else {
                            if (iO != 4) {
                                throw new UnknownFieldException(iO);
                            }
                            objN10 = cVarB.n(descriptor2, 4, g.a.INSTANCE, objN10);
                            i11 |= 16;
                        }
                    }
                    Object obj = objN6;
                    i10 = i11;
                    objN = obj;
                    objN2 = objN7;
                    objN3 = objN8;
                    objN4 = objN9;
                    objN5 = objN10;
                }
                cVarB.c(descriptor2);
                return new j(i10, (f) objN, (c) objN2, (C0471d) objN3, (FirstPartyData) objN4, (g) objN5, (w1) null);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull j value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                j.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        public static final class b {
            public /* synthetic */ b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return a.INSTANCE;
            }

            private b() {
            }
        }

        public j() {
            this((f) null, (c) null, (C0471d) null, (FirstPartyData) null, (g) null, 31, (kotlin.jvm.internal.i) null);
        }

        public static /* synthetic */ j copy$default(j jVar, f fVar, c cVar, C0471d c0471d, FirstPartyData firstPartyData, g gVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                fVar = jVar.gdpr;
            }
            if ((i10 & 2) != 0) {
                cVar = jVar.ccpa;
            }
            if ((i10 & 4) != 0) {
                c0471d = jVar.coppa;
            }
            if ((i10 & 8) != 0) {
                firstPartyData = jVar.fpd;
            }
            if ((i10 & 16) != 0) {
                gVar = jVar.iab;
            }
            g gVar2 = gVar;
            C0471d c0471d2 = c0471d;
            return jVar.copy(fVar, cVar, c0471d2, firstPartyData, gVar2);
        }

        @JvmStatic
        public static final void write$Self(@NotNull j self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.gdpr != null) {
                output.i(serialDesc, 0, f.a.INSTANCE, self.gdpr);
            }
            if (output.z(serialDesc, 1) || self.ccpa != null) {
                output.i(serialDesc, 1, c.a.INSTANCE, self.ccpa);
            }
            if (output.z(serialDesc, 2) || self.coppa != null) {
                output.i(serialDesc, 2, C0471d.a.INSTANCE, self.coppa);
            }
            if (output.z(serialDesc, 3) || self.fpd != null) {
                output.i(serialDesc, 3, FirstPartyData.a.INSTANCE, self.fpd);
            }
            if (!output.z(serialDesc, 4) && self.iab == null) {
                return;
            }
            output.i(serialDesc, 4, g.a.INSTANCE, self.iab);
        }

        @Nullable
        public final f component1() {
            return this.gdpr;
        }

        @Nullable
        public final c component2() {
            return this.ccpa;
        }

        @Nullable
        public final C0471d component3() {
            return this.coppa;
        }

        @Nullable
        public final FirstPartyData component4() {
            return this.fpd;
        }

        @Nullable
        public final g component5() {
            return this.iab;
        }

        @NotNull
        public final j copy(@Nullable f fVar, @Nullable c cVar, @Nullable C0471d c0471d, @Nullable FirstPartyData firstPartyData, @Nullable g gVar) {
            return new j(fVar, cVar, c0471d, firstPartyData, gVar);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return p.a(this.gdpr, jVar.gdpr) && p.a(this.ccpa, jVar.ccpa) && p.a(this.coppa, jVar.coppa) && p.a(this.fpd, jVar.fpd) && p.a(this.iab, jVar.iab);
        }

        @Nullable
        public final c getCcpa() {
            return this.ccpa;
        }

        @Nullable
        public final C0471d getCoppa() {
            return this.coppa;
        }

        @Nullable
        public final FirstPartyData getFpd() {
            return this.fpd;
        }

        @Nullable
        public final f getGdpr() {
            return this.gdpr;
        }

        @Nullable
        public final g getIab() {
            return this.iab;
        }

        public int hashCode() {
            f fVar = this.gdpr;
            int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
            c cVar = this.ccpa;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            C0471d c0471d = this.coppa;
            int iHashCode3 = (iHashCode2 + (c0471d == null ? 0 : c0471d.hashCode())) * 31;
            FirstPartyData firstPartyData = this.fpd;
            int iHashCode4 = (iHashCode3 + (firstPartyData == null ? 0 : firstPartyData.hashCode())) * 31;
            g gVar = this.iab;
            return iHashCode4 + (gVar != null ? gVar.hashCode() : 0);
        }

        public final void setCcpa(@Nullable c cVar) {
            this.ccpa = cVar;
        }

        public final void setCoppa(@Nullable C0471d c0471d) {
            this.coppa = c0471d;
        }

        public final void setFpd(@Nullable FirstPartyData firstPartyData) {
            this.fpd = firstPartyData;
        }

        public final void setGdpr(@Nullable f fVar) {
            this.gdpr = fVar;
        }

        public final void setIab(@Nullable g gVar) {
            this.iab = gVar;
        }

        @NotNull
        public String toString() {
            return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ", fpd=" + this.fpd + ", iab=" + this.iab + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ j(int i10, f fVar, c cVar, C0471d c0471d, FirstPartyData firstPartyData, g gVar, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = fVar;
            }
            if ((i10 & 2) == 0) {
                this.ccpa = null;
            } else {
                this.ccpa = cVar;
            }
            if ((i10 & 4) == 0) {
                this.coppa = null;
            } else {
                this.coppa = c0471d;
            }
            if ((i10 & 8) == 0) {
                this.fpd = null;
            } else {
                this.fpd = firstPartyData;
            }
            if ((i10 & 16) == 0) {
                this.iab = null;
            } else {
                this.iab = gVar;
            }
        }

        public j(@Nullable f fVar, @Nullable c cVar, @Nullable C0471d c0471d, @Nullable FirstPartyData firstPartyData, @Nullable g gVar) {
            this.gdpr = fVar;
            this.ccpa = cVar;
            this.coppa = c0471d;
            this.fpd = firstPartyData;
            this.iab = gVar;
        }

        public /* synthetic */ j(f fVar, c cVar, C0471d c0471d, FirstPartyData firstPartyData, g gVar, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : fVar, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? null : c0471d, (i10 & 8) != 0 ? null : firstPartyData, (i10 & 16) != 0 ? null : gVar);
        }
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ d(int i10, q7.e eVar, q7.c cVar, j jVar, h hVar, i iVar, w1 w1Var) {
        if (1 != (i10 & 1)) {
            m1.a(i10, 1, a.INSTANCE.getDescriptor());
        }
        this.device = eVar;
        if ((i10 & 2) == 0) {
            this.app = null;
        } else {
            this.app = cVar;
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

    public static /* synthetic */ d copy$default(d dVar, q7.e eVar, q7.c cVar, j jVar, h hVar, i iVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = dVar.device;
        }
        if ((i10 & 2) != 0) {
            cVar = dVar.app;
        }
        if ((i10 & 4) != 0) {
            jVar = dVar.user;
        }
        if ((i10 & 8) != 0) {
            hVar = dVar.ext;
        }
        if ((i10 & 16) != 0) {
            iVar = dVar.request;
        }
        i iVar2 = iVar;
        j jVar2 = jVar;
        return dVar.copy(eVar, cVar, jVar2, hVar, iVar2);
    }

    @JvmStatic
    public static final void write$Self(@NotNull d self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        output.C(serialDesc, 0, e.a.INSTANCE, self.device);
        if (output.z(serialDesc, 1) || self.app != null) {
            output.i(serialDesc, 1, c.a.INSTANCE, self.app);
        }
        if (output.z(serialDesc, 2) || self.user != null) {
            output.i(serialDesc, 2, j.a.INSTANCE, self.user);
        }
        if (output.z(serialDesc, 3) || self.ext != null) {
            output.i(serialDesc, 3, h.a.INSTANCE, self.ext);
        }
        if (!output.z(serialDesc, 4) && self.request == null) {
            return;
        }
        output.i(serialDesc, 4, i.a.INSTANCE, self.request);
    }

    @NotNull
    public final q7.e component1() {
        return this.device;
    }

    @Nullable
    public final q7.c component2() {
        return this.app;
    }

    @Nullable
    public final j component3() {
        return this.user;
    }

    @Nullable
    public final h component4() {
        return this.ext;
    }

    @Nullable
    public final i component5() {
        return this.request;
    }

    @NotNull
    public final d copy(@NotNull q7.e device, @Nullable q7.c cVar, @Nullable j jVar, @Nullable h hVar, @Nullable i iVar) {
        p.e(device, "device");
        return new d(device, cVar, jVar, hVar, iVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p.a(this.device, dVar.device) && p.a(this.app, dVar.app) && p.a(this.user, dVar.user) && p.a(this.ext, dVar.ext) && p.a(this.request, dVar.request);
    }

    @Nullable
    public final q7.c getApp() {
        return this.app;
    }

    @NotNull
    public final q7.e getDevice() {
        return this.device;
    }

    @Nullable
    public final h getExt() {
        return this.ext;
    }

    @Nullable
    public final i getRequest() {
        return this.request;
    }

    @Nullable
    public final j getUser() {
        return this.user;
    }

    public int hashCode() {
        int iHashCode = this.device.hashCode() * 31;
        q7.c cVar = this.app;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        j jVar = this.user;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        h hVar = this.ext;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        i iVar = this.request;
        return iHashCode4 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final void setExt(@Nullable h hVar) {
        this.ext = hVar;
    }

    public final void setRequest(@Nullable i iVar) {
        this.request = iVar;
    }

    @NotNull
    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ')';
    }

    public static final class b {

        @NotNull
        public static final C0470b Companion = new C0470b(null);
        private final int height;
        private final int width;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.CommonRequestBody.AdSizeParam", aVar, 2);
                pluginGeneratedSerialDescriptor.k("w", false);
                pluginGeneratedSerialDescriptor.k("h", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                r0 r0Var = r0.f22908a;
                return new kotlinx.serialization.b[]{r0Var, r0Var};
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public b deserialize(@NotNull y9.e decoder) {
                int i10;
                int i11;
                int i12;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                if (cVarB.p()) {
                    i10 = cVarB.i(descriptor2, 0);
                    i11 = cVarB.i(descriptor2, 1);
                    i12 = 3;
                } else {
                    boolean z10 = true;
                    i10 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            i10 = cVarB.i(descriptor2, 0);
                            i14 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            i13 = cVarB.i(descriptor2, 1);
                            i14 |= 2;
                        }
                    }
                    i11 = i13;
                    i12 = i14;
                }
                cVarB.c(descriptor2);
                return new b(i12, i10, i11, null);
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull b value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                b.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }
        }

        /* renamed from: q7.d$b$b, reason: collision with other inner class name */
        public static final class C0470b {
            public /* synthetic */ C0470b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return a.INSTANCE;
            }

            private C0470b() {
            }
        }

        public b(int i10, int i11) {
            this.width = i10;
            this.height = i11;
        }

        public static /* synthetic */ b copy$default(b bVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = bVar.width;
            }
            if ((i12 & 2) != 0) {
                i11 = bVar.height;
            }
            return bVar.copy(i10, i11);
        }

        @JvmStatic
        public static final void write$Self(@NotNull b self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            output.w(serialDesc, 0, self.width);
            output.w(serialDesc, 1, self.height);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        @NotNull
        public final b copy(int i10, int i11) {
            return new b(i10, i11);
        }

        public boolean equals(@Nullable Object obj) {
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

        @NotNull
        public String toString() {
            return "AdSizeParam(width=" + this.width + ", height=" + this.height + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ b(int i10, @SerialName("w") int i11, @SerialName("h") int i12, w1 w1Var) {
            if (3 != (i10 & 3)) {
                m1.a(i10, 3, a.INSTANCE.getDescriptor());
            }
            this.width = i11;
            this.height = i12;
        }

        @SerialName("h")
        public static /* synthetic */ void getHeight$annotations() {
        }

        @SerialName("w")
        public static /* synthetic */ void getWidth$annotations() {
        }
    }

    public d(@NotNull q7.e device, @Nullable q7.c cVar, @Nullable j jVar, @Nullable h hVar, @Nullable i iVar) {
        p.e(device, "device");
        this.device = device;
        this.app = cVar;
        this.user = jVar;
        this.ext = hVar;
        this.request = iVar;
    }

    public /* synthetic */ d(q7.e eVar, q7.c cVar, j jVar, h hVar, i iVar, int i10, kotlin.jvm.internal.i iVar2) {
        this(eVar, (i10 & 2) != 0 ? null : cVar, (i10 & 4) != 0 ? null : jVar, (i10 & 8) != 0 ? null : hVar, (i10 & 16) != 0 ? null : iVar);
    }
}
