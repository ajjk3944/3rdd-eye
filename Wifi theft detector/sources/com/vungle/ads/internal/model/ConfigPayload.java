package com.vungle.ads.internal.model;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.p;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.b1;
import kotlinx.serialization.internal.b2;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.r0;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.KEYRecord;
import q7.h;
import z8.h0;

/* loaded from: classes3.dex */
public final class ConfigPayload {

    @NotNull
    public static final d Companion = new d(null);

    @Nullable
    private b autoRedirect;

    @Nullable
    private final c cleverCache;

    @Nullable
    private final String configExtension;

    @Nullable
    private Long configLastValidatedTimestamp;

    @Nullable
    private final e configSettings;

    @Nullable
    private final Boolean disableAdId;

    @Nullable
    private Boolean enableOT;

    @Nullable
    private final f endpoints;

    @Nullable
    private final Boolean fpdEnabled;

    @Nullable
    private final Boolean isReportIncentivizedEnabled;

    @Nullable
    private final h logMetricsSettings;

    @Nullable
    private final List<q7.h> placements;

    @Nullable
    private Boolean retryPriorityTPATs;

    @Nullable
    private final Boolean rtaDebugging;

    @Nullable
    private final Integer sessionTimeout;

    @Nullable
    private final Integer signalSessionTimeout;

    @Nullable
    private final Boolean signalsDisabled;

    @Nullable
    private final i userPrivacy;

    @Nullable
    private final Boolean waitForConnectivityForTPAT;

    public static final class IABSettings {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final Integer tcfStatus;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "", "", "rawValue", "<init>", "(Ljava/lang/String;II)V", "I", "getRawValue", "()I", "Companion", "a", "ALLOW_ID", "DISABLE_ID", "LEGACY", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum TcfStatus {
            ALLOW_ID(0),
            DISABLE_ID(1),
            LEGACY(2);


            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            @NotNull
            private static final Map<Integer, TcfStatus> rawValueMap;
            private final int rawValue;

            /* renamed from: com.vungle.ads.internal.model.ConfigPayload$IABSettings$TcfStatus$a, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
                    this();
                }

                @Nullable
                public final TcfStatus fromRawValue(@Nullable Integer num) {
                    return (TcfStatus) TcfStatus.rawValueMap.get(num);
                }

                private Companion() {
                }
            }

            static {
                TcfStatus[] tcfStatusArrValues = values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(q9.e.b(h0.e(tcfStatusArrValues.length), 16));
                for (TcfStatus tcfStatus : tcfStatusArrValues) {
                    linkedHashMap.put(Integer.valueOf(tcfStatus.rawValue), tcfStatus);
                }
                rawValueMap = linkedHashMap;
            }

            TcfStatus(int i10) {
                this.rawValue = i10;
            }

            public final int getRawValue() {
                return this.rawValue;
            }
        }

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.IABSettings", aVar, 1);
                pluginGeneratedSerialDescriptor.k("tcf_status", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                return new kotlinx.serialization.b[]{x9.a.s(r0.f22908a)};
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public IABSettings deserialize(@NotNull y9.e decoder) {
                Object objN;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                int i10 = 1;
                w1 w1Var = null;
                if (cVarB.p()) {
                    objN = cVarB.n(descriptor2, 0, r0.f22908a, null);
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
                            objN = cVarB.n(descriptor2, 0, r0.f22908a, objN);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarB.c(descriptor2);
                return new IABSettings(i10, (Integer) objN, w1Var);
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull IABSettings value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                IABSettings.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
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

        public IABSettings() {
            this((Integer) null, 1, (kotlin.jvm.internal.i) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ IABSettings copy$default(IABSettings iABSettings, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = iABSettings.tcfStatus;
            }
            return iABSettings.copy(num);
        }

        @SerialName("tcf_status")
        public static /* synthetic */ void getTcfStatus$annotations() {
        }

        @JvmStatic
        public static final void write$Self(@NotNull IABSettings self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (!output.z(serialDesc, 0) && self.tcfStatus == null) {
                return;
            }
            output.i(serialDesc, 0, r0.f22908a, self.tcfStatus);
        }

        @Nullable
        public final Integer component1() {
            return this.tcfStatus;
        }

        @NotNull
        public final IABSettings copy(@Nullable Integer num) {
            return new IABSettings(num);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IABSettings) && p.a(this.tcfStatus, ((IABSettings) obj).tcfStatus);
        }

        @Nullable
        public final Integer getTcfStatus() {
            return this.tcfStatus;
        }

        public int hashCode() {
            Integer num = this.tcfStatus;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @NotNull
        public String toString() {
            return "IABSettings(tcfStatus=" + this.tcfStatus + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ IABSettings(int i10, @SerialName("tcf_status") Integer num, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.tcfStatus = null;
            } else {
                this.tcfStatus = num;
            }
        }

        public IABSettings(@Nullable Integer num) {
            this.tcfStatus = num;
        }

        public /* synthetic */ IABSettings(Integer num, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : num);
        }
    }

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload", aVar, 19);
            pluginGeneratedSerialDescriptor.k("reuse_assets", true);
            pluginGeneratedSerialDescriptor.k("config", true);
            pluginGeneratedSerialDescriptor.k("endpoints", true);
            pluginGeneratedSerialDescriptor.k("log_metrics", true);
            pluginGeneratedSerialDescriptor.k("placements", true);
            pluginGeneratedSerialDescriptor.k("user", true);
            pluginGeneratedSerialDescriptor.k("config_extension", true);
            pluginGeneratedSerialDescriptor.k("disable_ad_id", true);
            pluginGeneratedSerialDescriptor.k("ri_enabled", true);
            pluginGeneratedSerialDescriptor.k("session_timeout", true);
            pluginGeneratedSerialDescriptor.k("wait_for_connectivity_for_tpat", true);
            pluginGeneratedSerialDescriptor.k("sdk_session_timeout", true);
            pluginGeneratedSerialDescriptor.k("signals_disabled", true);
            pluginGeneratedSerialDescriptor.k("fpd_enabled", true);
            pluginGeneratedSerialDescriptor.k("rta_debugging", true);
            pluginGeneratedSerialDescriptor.k("config_last_validated_ts", true);
            pluginGeneratedSerialDescriptor.k("auto_redirect", true);
            pluginGeneratedSerialDescriptor.k("retry_prioritized_tpat", true);
            pluginGeneratedSerialDescriptor.k("enable_ot", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            kotlinx.serialization.b bVarS = x9.a.s(c.a.INSTANCE);
            kotlinx.serialization.b bVarS2 = x9.a.s(e.a.INSTANCE);
            kotlinx.serialization.b bVarS3 = x9.a.s(f.a.INSTANCE);
            kotlinx.serialization.b bVarS4 = x9.a.s(h.a.INSTANCE);
            kotlinx.serialization.b bVarS5 = x9.a.s(new kotlinx.serialization.internal.f(h.a.INSTANCE));
            kotlinx.serialization.b bVarS6 = x9.a.s(i.a.INSTANCE);
            kotlinx.serialization.b bVarS7 = x9.a.s(b2.f22828a);
            kotlinx.serialization.internal.i iVar = kotlinx.serialization.internal.i.f22868a;
            kotlinx.serialization.b bVarS8 = x9.a.s(iVar);
            kotlinx.serialization.b bVarS9 = x9.a.s(iVar);
            r0 r0Var = r0.f22908a;
            return new kotlinx.serialization.b[]{bVarS, bVarS2, bVarS3, bVarS4, bVarS5, bVarS6, bVarS7, bVarS8, bVarS9, x9.a.s(r0Var), x9.a.s(iVar), x9.a.s(r0Var), x9.a.s(iVar), x9.a.s(iVar), x9.a.s(iVar), x9.a.s(b1.f22826a), x9.a.s(b.a.INSTANCE), x9.a.s(iVar), x9.a.s(iVar)};
        }

        @Override // kotlinx.serialization.a
        @NotNull
        public ConfigPayload deserialize(@NotNull y9.e decoder) {
            Object objN;
            Object objN2;
            Object obj;
            Object obj2;
            Object obj3;
            Object objN3;
            Object obj4;
            Object objN4;
            Object objN5;
            Object objN6;
            Object objN7;
            int i10;
            Object obj5;
            Object obj6;
            Object objN8;
            Object objN9;
            Object objN10;
            Object objN11;
            Object objN12;
            Object objN13;
            Object obj7;
            Object obj8;
            Object obj9;
            Object obj10;
            Object obj11;
            p.e(decoder, "decoder");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            if (cVarB.p()) {
                Object objN14 = cVarB.n(descriptor2, 0, c.a.INSTANCE, null);
                objN7 = cVarB.n(descriptor2, 1, e.a.INSTANCE, null);
                objN3 = cVarB.n(descriptor2, 2, f.a.INSTANCE, null);
                Object objN15 = cVarB.n(descriptor2, 3, h.a.INSTANCE, null);
                Object objN16 = cVarB.n(descriptor2, 4, new kotlinx.serialization.internal.f(h.a.INSTANCE), null);
                objN9 = cVarB.n(descriptor2, 5, i.a.INSTANCE, null);
                objN13 = cVarB.n(descriptor2, 6, b2.f22828a, null);
                kotlinx.serialization.internal.i iVar = kotlinx.serialization.internal.i.f22868a;
                objN12 = cVarB.n(descriptor2, 7, iVar, null);
                objN11 = cVarB.n(descriptor2, 8, iVar, null);
                r0 r0Var = r0.f22908a;
                objN10 = cVarB.n(descriptor2, 9, r0Var, null);
                objN8 = cVarB.n(descriptor2, 10, iVar, null);
                Object objN17 = cVarB.n(descriptor2, 11, r0Var, null);
                Object objN18 = cVarB.n(descriptor2, 12, iVar, null);
                obj6 = objN17;
                objN6 = cVarB.n(descriptor2, 13, iVar, null);
                objN5 = cVarB.n(descriptor2, 14, iVar, null);
                objN4 = cVarB.n(descriptor2, 15, b1.f22826a, null);
                Object objN19 = cVarB.n(descriptor2, 16, b.a.INSTANCE, null);
                Object objN20 = cVarB.n(descriptor2, 17, iVar, null);
                objN2 = cVarB.n(descriptor2, 18, iVar, null);
                obj3 = objN15;
                obj = objN20;
                obj4 = objN19;
                obj2 = objN14;
                i10 = 524287;
                obj5 = objN18;
                objN = objN16;
            } else {
                boolean z10 = true;
                Object objN21 = null;
                Object objN22 = null;
                Object objN23 = null;
                Object objN24 = null;
                Object objN25 = null;
                Object objN26 = null;
                Object objN27 = null;
                Object objN28 = null;
                Object objN29 = null;
                Object objN30 = null;
                objN = null;
                Object objN31 = null;
                Object objN32 = null;
                Object objN33 = null;
                Object objN34 = null;
                Object objN35 = null;
                Object objN36 = null;
                Object objN37 = null;
                int i11 = 0;
                Object objN38 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    switch (iO) {
                        case -1:
                            obj7 = objN38;
                            obj8 = objN21;
                            obj9 = objN25;
                            z10 = false;
                            objN25 = obj9;
                            objN38 = obj7;
                            objN21 = obj8;
                        case 0:
                            obj8 = objN21;
                            obj9 = objN25;
                            obj7 = objN38;
                            objN37 = cVarB.n(descriptor2, 0, c.a.INSTANCE, objN37);
                            i11 |= 1;
                            objN25 = obj9;
                            objN38 = obj7;
                            objN21 = obj8;
                        case 1:
                            obj8 = objN21;
                            objN38 = cVarB.n(descriptor2, 1, e.a.INSTANCE, objN38);
                            i11 |= 2;
                            objN25 = objN25;
                            objN21 = obj8;
                        case 2:
                            obj10 = objN38;
                            obj11 = objN25;
                            objN24 = cVarB.n(descriptor2, 2, f.a.INSTANCE, objN24);
                            i11 |= 4;
                            objN25 = obj11;
                            objN38 = obj10;
                        case 3:
                            obj10 = objN38;
                            obj11 = objN25;
                            objN23 = cVarB.n(descriptor2, 3, h.a.INSTANCE, objN23);
                            i11 |= 8;
                            objN25 = obj11;
                            objN38 = obj10;
                        case 4:
                            obj10 = objN38;
                            obj11 = objN25;
                            objN = cVarB.n(descriptor2, 4, new kotlinx.serialization.internal.f(h.a.INSTANCE), objN);
                            i11 |= 16;
                            objN25 = obj11;
                            objN38 = obj10;
                        case 5:
                            obj10 = objN38;
                            obj11 = objN25;
                            objN21 = cVarB.n(descriptor2, 5, i.a.INSTANCE, objN21);
                            i11 |= 32;
                            objN25 = obj11;
                            objN38 = obj10;
                        case 6:
                            obj10 = objN38;
                            obj11 = objN25;
                            objN30 = cVarB.n(descriptor2, 6, b2.f22828a, objN30);
                            i11 |= 64;
                            objN25 = obj11;
                            objN38 = obj10;
                        case 7:
                            obj10 = objN38;
                            obj11 = objN25;
                            objN29 = cVarB.n(descriptor2, 7, kotlinx.serialization.internal.i.f22868a, objN29);
                            i11 |= 128;
                            objN25 = obj11;
                            objN38 = obj10;
                        case 8:
                            obj10 = objN38;
                            obj11 = objN25;
                            objN28 = cVarB.n(descriptor2, 8, kotlinx.serialization.internal.i.f22868a, objN28);
                            i11 |= 256;
                            objN25 = obj11;
                            objN38 = obj10;
                        case 9:
                            obj10 = objN38;
                            obj11 = objN25;
                            objN22 = cVarB.n(descriptor2, 9, r0.f22908a, objN22);
                            i11 |= 512;
                            objN25 = obj11;
                            objN38 = obj10;
                        case 10:
                            obj10 = objN38;
                            obj11 = objN25;
                            objN27 = cVarB.n(descriptor2, 10, kotlinx.serialization.internal.i.f22868a, objN27);
                            i11 |= 1024;
                            objN25 = obj11;
                            objN38 = obj10;
                        case 11:
                            obj10 = objN38;
                            obj11 = objN25;
                            objN26 = cVarB.n(descriptor2, 11, r0.f22908a, objN26);
                            i11 |= KEYRecord.Flags.FLAG4;
                            objN25 = obj11;
                            objN38 = obj10;
                        case 12:
                            obj10 = objN38;
                            objN31 = cVarB.n(descriptor2, 12, kotlinx.serialization.internal.i.f22868a, objN31);
                            i11 |= 4096;
                            objN25 = objN25;
                            objN32 = objN32;
                            objN38 = obj10;
                        case 13:
                            obj10 = objN38;
                            objN32 = cVarB.n(descriptor2, 13, kotlinx.serialization.internal.i.f22868a, objN32);
                            i11 |= 8192;
                            objN25 = objN25;
                            objN33 = objN33;
                            objN38 = obj10;
                        case 14:
                            obj10 = objN38;
                            objN33 = cVarB.n(descriptor2, 14, kotlinx.serialization.internal.i.f22868a, objN33);
                            i11 |= 16384;
                            objN25 = objN25;
                            objN34 = objN34;
                            objN38 = obj10;
                        case 15:
                            obj10 = objN38;
                            objN34 = cVarB.n(descriptor2, 15, b1.f22826a, objN34);
                            i11 |= 32768;
                            objN25 = objN25;
                            objN35 = objN35;
                            objN38 = obj10;
                        case 16:
                            obj10 = objN38;
                            objN35 = cVarB.n(descriptor2, 16, b.a.INSTANCE, objN35);
                            i11 |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            objN25 = objN25;
                            objN36 = objN36;
                            objN38 = obj10;
                        case 17:
                            obj10 = objN38;
                            obj11 = objN25;
                            objN36 = cVarB.n(descriptor2, 17, kotlinx.serialization.internal.i.f22868a, objN36);
                            i11 |= 131072;
                            objN25 = obj11;
                            objN38 = obj10;
                        case 18:
                            objN25 = cVarB.n(descriptor2, 18, kotlinx.serialization.internal.i.f22868a, objN25);
                            i11 |= 262144;
                            objN38 = objN38;
                        default:
                            throw new UnknownFieldException(iO);
                    }
                }
                Object obj12 = objN38;
                Object obj13 = objN21;
                objN2 = objN25;
                obj = objN36;
                obj2 = objN37;
                obj3 = objN23;
                objN3 = objN24;
                obj4 = objN35;
                objN4 = objN34;
                objN5 = objN33;
                objN6 = objN32;
                objN7 = obj12;
                i10 = i11;
                obj5 = objN31;
                obj6 = objN26;
                objN8 = objN27;
                objN9 = obj13;
                objN10 = objN22;
                objN11 = objN28;
                objN12 = objN29;
                objN13 = objN30;
            }
            cVarB.c(descriptor2);
            return new ConfigPayload(i10, (c) obj2, (e) objN7, (f) objN3, (h) obj3, (List) objN, (i) objN9, (String) objN13, (Boolean) objN12, (Boolean) objN11, (Integer) objN10, (Boolean) objN8, (Integer) obj6, (Boolean) obj5, (Boolean) objN6, (Boolean) objN5, (Long) objN4, (b) obj4, (Boolean) obj, (Boolean) objN2, (w1) null);
        }

        @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
        @NotNull
        public kotlinx.serialization.descriptors.f getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.e
        public void serialize(@NotNull y9.f encoder, @NotNull ConfigPayload value) {
            p.e(encoder, "encoder");
            p.e(value, "value");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.d dVarB = encoder.b(descriptor2);
            ConfigPayload.write$Self(value, dVarB, descriptor2);
            dVarB.c(descriptor2);
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] typeParametersSerializers() {
            return i0.a.a(this);
        }
    }

    public static final class b {

        @NotNull
        public static final C0367b Companion = new C0367b(null);

        @Nullable
        private final Long afterClickDuration;

        @Nullable
        private final Boolean allowAutoRedirect;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.AutoRedirect", aVar, 2);
                pluginGeneratedSerialDescriptor.k("allow_auto_redirect", true);
                pluginGeneratedSerialDescriptor.k("after_click_ms", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                return new kotlinx.serialization.b[]{x9.a.s(kotlinx.serialization.internal.i.f22868a), x9.a.s(b1.f22826a)};
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public b deserialize(@NotNull y9.e decoder) {
                Object objN;
                Object objN2;
                int i10;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                w1 w1Var = null;
                if (cVarB.p()) {
                    objN = cVarB.n(descriptor2, 0, kotlinx.serialization.internal.i.f22868a, null);
                    objN2 = cVarB.n(descriptor2, 1, b1.f22826a, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objN = null;
                    Object objN3 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objN = cVarB.n(descriptor2, 0, kotlinx.serialization.internal.i.f22868a, objN);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objN3 = cVarB.n(descriptor2, 1, b1.f22826a, objN3);
                            i11 |= 2;
                        }
                    }
                    objN2 = objN3;
                    i10 = i11;
                }
                cVarB.c(descriptor2);
                return new b(i10, (Boolean) objN, (Long) objN2, w1Var);
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
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

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
            }
        }

        /* renamed from: com.vungle.ads.internal.model.ConfigPayload$b$b, reason: collision with other inner class name */
        public static final class C0367b {
            public /* synthetic */ C0367b(kotlin.jvm.internal.i iVar) {
                this();
            }

            @NotNull
            public final kotlinx.serialization.b serializer() {
                return a.INSTANCE;
            }

            private C0367b() {
            }
        }

        public b() {
            this((Boolean) null, (Long) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.i) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ b copy$default(b bVar, Boolean bool, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = bVar.allowAutoRedirect;
            }
            if ((i10 & 2) != 0) {
                l10 = bVar.afterClickDuration;
            }
            return bVar.copy(bool, l10);
        }

        @SerialName("after_click_ms")
        public static /* synthetic */ void getAfterClickDuration$annotations() {
        }

        @SerialName("allow_auto_redirect")
        public static /* synthetic */ void getAllowAutoRedirect$annotations() {
        }

        @JvmStatic
        public static final void write$Self(@NotNull b self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            Long l10;
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || !p.a(self.allowAutoRedirect, Boolean.FALSE)) {
                output.i(serialDesc, 0, kotlinx.serialization.internal.i.f22868a, self.allowAutoRedirect);
            }
            if (output.z(serialDesc, 1) || (l10 = self.afterClickDuration) == null || l10.longValue() != Long.MAX_VALUE) {
                output.i(serialDesc, 1, b1.f22826a, self.afterClickDuration);
            }
        }

        @Nullable
        public final Boolean component1() {
            return this.allowAutoRedirect;
        }

        @Nullable
        public final Long component2() {
            return this.afterClickDuration;
        }

        @NotNull
        public final b copy(@Nullable Boolean bool, @Nullable Long l10) {
            return new b(bool, l10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p.a(this.allowAutoRedirect, bVar.allowAutoRedirect) && p.a(this.afterClickDuration, bVar.afterClickDuration);
        }

        @Nullable
        public final Long getAfterClickDuration() {
            return this.afterClickDuration;
        }

        @Nullable
        public final Boolean getAllowAutoRedirect() {
            return this.allowAutoRedirect;
        }

        public int hashCode() {
            Boolean bool = this.allowAutoRedirect;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l10 = this.afterClickDuration;
            return iHashCode + (l10 != null ? l10.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "AutoRedirect(allowAutoRedirect=" + this.allowAutoRedirect + ", afterClickDuration=" + this.afterClickDuration + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ b(int i10, @SerialName("allow_auto_redirect") Boolean bool, @SerialName("after_click_ms") Long l10, w1 w1Var) {
            this.allowAutoRedirect = (i10 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i10 & 2) == 0) {
                this.afterClickDuration = Long.MAX_VALUE;
            } else {
                this.afterClickDuration = l10;
            }
        }

        public b(@Nullable Boolean bool, @Nullable Long l10) {
            this.allowAutoRedirect = bool;
            this.afterClickDuration = l10;
        }

        public /* synthetic */ b(Boolean bool, Long l10, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? Long.MAX_VALUE : l10);
        }
    }

    public static final class c {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final Integer diskPercentage;

        @Nullable
        private final Long diskSize;

        @Nullable
        private final Boolean enabled;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.CleverCache", aVar, 3);
                pluginGeneratedSerialDescriptor.k("enabled", true);
                pluginGeneratedSerialDescriptor.k("disk_size", true);
                pluginGeneratedSerialDescriptor.k("disk_percentage", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                return new kotlinx.serialization.b[]{x9.a.s(kotlinx.serialization.internal.i.f22868a), x9.a.s(b1.f22826a), x9.a.s(r0.f22908a)};
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public c deserialize(@NotNull y9.e decoder) {
                int i10;
                Object objN;
                Object objN2;
                Object objN3;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                Object objN4 = null;
                if (cVarB.p()) {
                    objN = cVarB.n(descriptor2, 0, kotlinx.serialization.internal.i.f22868a, null);
                    objN2 = cVarB.n(descriptor2, 1, b1.f22826a, null);
                    objN3 = cVarB.n(descriptor2, 2, r0.f22908a, null);
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
                            objN4 = cVarB.n(descriptor2, 0, kotlinx.serialization.internal.i.f22868a, objN4);
                            i11 |= 1;
                        } else if (iO == 1) {
                            objN5 = cVarB.n(descriptor2, 1, b1.f22826a, objN5);
                            i11 |= 2;
                        } else {
                            if (iO != 2) {
                                throw new UnknownFieldException(iO);
                            }
                            objN6 = cVarB.n(descriptor2, 2, r0.f22908a, objN6);
                            i11 |= 4;
                        }
                    }
                    Object obj = objN4;
                    i10 = i11;
                    objN = obj;
                    objN2 = objN5;
                    objN3 = objN6;
                }
                cVarB.c(descriptor2);
                return new c(i10, (Boolean) objN, (Long) objN2, (Integer) objN3, (w1) null);
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
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

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
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

        public c() {
            this((Boolean) null, (Long) null, (Integer) null, 7, (kotlin.jvm.internal.i) null);
        }

        public static /* synthetic */ c copy$default(c cVar, Boolean bool, Long l10, Integer num, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = cVar.enabled;
            }
            if ((i10 & 2) != 0) {
                l10 = cVar.diskSize;
            }
            if ((i10 & 4) != 0) {
                num = cVar.diskPercentage;
            }
            return cVar.copy(bool, l10, num);
        }

        @SerialName("disk_percentage")
        public static /* synthetic */ void getDiskPercentage$annotations() {
        }

        @SerialName("disk_size")
        public static /* synthetic */ void getDiskSize$annotations() {
        }

        @SerialName("enabled")
        public static /* synthetic */ void getEnabled$annotations() {
        }

        @JvmStatic
        public static final void write$Self(@NotNull c self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            Integer num;
            Long l10;
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || !p.a(self.enabled, Boolean.FALSE)) {
                output.i(serialDesc, 0, kotlinx.serialization.internal.i.f22868a, self.enabled);
            }
            if (output.z(serialDesc, 1) || (l10 = self.diskSize) == null || l10.longValue() != 1000) {
                output.i(serialDesc, 1, b1.f22826a, self.diskSize);
            }
            if (output.z(serialDesc, 2) || (num = self.diskPercentage) == null || num.intValue() != 3) {
                output.i(serialDesc, 2, r0.f22908a, self.diskPercentage);
            }
        }

        @Nullable
        public final Boolean component1() {
            return this.enabled;
        }

        @Nullable
        public final Long component2() {
            return this.diskSize;
        }

        @Nullable
        public final Integer component3() {
            return this.diskPercentage;
        }

        @NotNull
        public final c copy(@Nullable Boolean bool, @Nullable Long l10, @Nullable Integer num) {
            return new c(bool, l10, num);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p.a(this.enabled, cVar.enabled) && p.a(this.diskSize, cVar.diskSize) && p.a(this.diskPercentage, cVar.diskPercentage);
        }

        @Nullable
        public final Integer getDiskPercentage() {
            return this.diskPercentage;
        }

        @Nullable
        public final Long getDiskSize() {
            return this.diskSize;
        }

        @Nullable
        public final Boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            Boolean bool = this.enabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Long l10 = this.diskSize;
            int iHashCode2 = (iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
            Integer num = this.diskPercentage;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "CleverCache(enabled=" + this.enabled + ", diskSize=" + this.diskSize + ", diskPercentage=" + this.diskPercentage + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ c(int i10, @SerialName("enabled") Boolean bool, @SerialName("disk_size") Long l10, @SerialName("disk_percentage") Integer num, w1 w1Var) {
            this.enabled = (i10 & 1) == 0 ? Boolean.FALSE : bool;
            if ((i10 & 2) == 0) {
                this.diskSize = 1000L;
            } else {
                this.diskSize = l10;
            }
            if ((i10 & 4) == 0) {
                this.diskPercentage = 3;
            } else {
                this.diskPercentage = num;
            }
        }

        public c(@Nullable Boolean bool, @Nullable Long l10, @Nullable Integer num) {
            this.enabled = bool;
            this.diskSize = l10;
            this.diskPercentage = num;
        }

        public /* synthetic */ c(Boolean bool, Long l10, Integer num, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? Boolean.FALSE : bool, (i10 & 2) != 0 ? 1000L : l10, (i10 & 4) != 0 ? 3 : num);
        }
    }

    public static final class d {
        public /* synthetic */ d(kotlin.jvm.internal.i iVar) {
            this();
        }

        @NotNull
        public final kotlinx.serialization.b serializer() {
            return a.INSTANCE;
        }

        private d() {
        }
    }

    public static final class e {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final Long refreshTime;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.ConfigSettings", aVar, 1);
                pluginGeneratedSerialDescriptor.k("refresh_interval", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                return new kotlinx.serialization.b[]{x9.a.s(b1.f22826a)};
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public e deserialize(@NotNull y9.e decoder) {
                Object objN;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                int i10 = 1;
                w1 w1Var = null;
                if (cVarB.p()) {
                    objN = cVarB.n(descriptor2, 0, b1.f22826a, null);
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
                            objN = cVarB.n(descriptor2, 0, b1.f22826a, objN);
                            i11 = 1;
                        }
                    }
                    i10 = i11;
                }
                cVarB.c(descriptor2);
                return new e(i10, (Long) objN, w1Var);
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.e
            public void serialize(@NotNull y9.f encoder, @NotNull e value) {
                p.e(encoder, "encoder");
                p.e(value, "value");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.d dVarB = encoder.b(descriptor2);
                e.write$Self(value, dVarB, descriptor2);
                dVarB.c(descriptor2);
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
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

        public e() {
            this((Long) null, 1, (kotlin.jvm.internal.i) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ e copy$default(e eVar, Long l10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                l10 = eVar.refreshTime;
            }
            return eVar.copy(l10);
        }

        @SerialName("refresh_interval")
        public static /* synthetic */ void getRefreshTime$annotations() {
        }

        @JvmStatic
        public static final void write$Self(@NotNull e self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (!output.z(serialDesc, 0) && self.refreshTime == null) {
                return;
            }
            output.i(serialDesc, 0, b1.f22826a, self.refreshTime);
        }

        @Nullable
        public final Long component1() {
            return this.refreshTime;
        }

        @NotNull
        public final e copy(@Nullable Long l10) {
            return new e(l10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && p.a(this.refreshTime, ((e) obj).refreshTime);
        }

        @Nullable
        public final Long getRefreshTime() {
            return this.refreshTime;
        }

        public int hashCode() {
            Long l10 = this.refreshTime;
            if (l10 == null) {
                return 0;
            }
            return l10.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConfigSettings(refreshTime=" + this.refreshTime + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ e(int i10, @SerialName("refresh_interval") Long l10, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.refreshTime = null;
            } else {
                this.refreshTime = l10;
            }
        }

        public e(@Nullable Long l10) {
            this.refreshTime = l10;
        }

        public /* synthetic */ e(Long l10, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : l10);
        }
    }

    public static final class f {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final String adsEndpoint;

        @Nullable
        private final String errorLogsEndpoint;

        @Nullable
        private final String metricsEndpoint;

        @Nullable
        private final String riEndpoint;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.Endpoints", aVar, 4);
                pluginGeneratedSerialDescriptor.k(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, true);
                pluginGeneratedSerialDescriptor.k("ri", true);
                pluginGeneratedSerialDescriptor.k("error_logs", true);
                pluginGeneratedSerialDescriptor.k("metrics", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                b2 b2Var = b2.f22828a;
                return new kotlinx.serialization.b[]{x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(b2Var)};
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public f deserialize(@NotNull y9.e decoder) {
                Object objN;
                int i10;
                Object objN2;
                Object objN3;
                Object objN4;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                Object objN5 = null;
                if (cVarB.p()) {
                    b2 b2Var = b2.f22828a;
                    objN2 = cVarB.n(descriptor2, 0, b2Var, null);
                    objN3 = cVarB.n(descriptor2, 1, b2Var, null);
                    Object objN6 = cVarB.n(descriptor2, 2, b2Var, null);
                    objN4 = cVarB.n(descriptor2, 3, b2Var, null);
                    objN = objN6;
                    i10 = 15;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    Object objN7 = null;
                    objN = null;
                    Object objN8 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objN5 = cVarB.n(descriptor2, 0, b2.f22828a, objN5);
                            i11 |= 1;
                        } else if (iO == 1) {
                            objN7 = cVarB.n(descriptor2, 1, b2.f22828a, objN7);
                            i11 |= 2;
                        } else if (iO == 2) {
                            objN = cVarB.n(descriptor2, 2, b2.f22828a, objN);
                            i11 |= 4;
                        } else {
                            if (iO != 3) {
                                throw new UnknownFieldException(iO);
                            }
                            objN8 = cVarB.n(descriptor2, 3, b2.f22828a, objN8);
                            i11 |= 8;
                        }
                    }
                    i10 = i11;
                    objN2 = objN5;
                    objN3 = objN7;
                    objN4 = objN8;
                }
                cVarB.c(descriptor2);
                return new f(i10, (String) objN2, (String) objN3, (String) objN, (String) objN4, (w1) null);
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
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

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
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

        public f() {
            this((String) null, (String) null, (String) null, (String) null, 15, (kotlin.jvm.internal.i) null);
        }

        public static /* synthetic */ f copy$default(f fVar, String str, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = fVar.adsEndpoint;
            }
            if ((i10 & 2) != 0) {
                str2 = fVar.riEndpoint;
            }
            if ((i10 & 4) != 0) {
                str3 = fVar.errorLogsEndpoint;
            }
            if ((i10 & 8) != 0) {
                str4 = fVar.metricsEndpoint;
            }
            return fVar.copy(str, str2, str3, str4);
        }

        @SerialName(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)
        public static /* synthetic */ void getAdsEndpoint$annotations() {
        }

        @SerialName("error_logs")
        public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
        }

        @SerialName("metrics")
        public static /* synthetic */ void getMetricsEndpoint$annotations() {
        }

        @SerialName("ri")
        public static /* synthetic */ void getRiEndpoint$annotations() {
        }

        @JvmStatic
        public static final void write$Self(@NotNull f self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.adsEndpoint != null) {
                output.i(serialDesc, 0, b2.f22828a, self.adsEndpoint);
            }
            if (output.z(serialDesc, 1) || self.riEndpoint != null) {
                output.i(serialDesc, 1, b2.f22828a, self.riEndpoint);
            }
            if (output.z(serialDesc, 2) || self.errorLogsEndpoint != null) {
                output.i(serialDesc, 2, b2.f22828a, self.errorLogsEndpoint);
            }
            if (!output.z(serialDesc, 3) && self.metricsEndpoint == null) {
                return;
            }
            output.i(serialDesc, 3, b2.f22828a, self.metricsEndpoint);
        }

        @Nullable
        public final String component1() {
            return this.adsEndpoint;
        }

        @Nullable
        public final String component2() {
            return this.riEndpoint;
        }

        @Nullable
        public final String component3() {
            return this.errorLogsEndpoint;
        }

        @Nullable
        public final String component4() {
            return this.metricsEndpoint;
        }

        @NotNull
        public final f copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            return new f(str, str2, str3, str4);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return p.a(this.adsEndpoint, fVar.adsEndpoint) && p.a(this.riEndpoint, fVar.riEndpoint) && p.a(this.errorLogsEndpoint, fVar.errorLogsEndpoint) && p.a(this.metricsEndpoint, fVar.metricsEndpoint);
        }

        @Nullable
        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        @Nullable
        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        @Nullable
        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        @Nullable
        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        public int hashCode() {
            String str = this.adsEndpoint;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.riEndpoint;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorLogsEndpoint;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.metricsEndpoint;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Endpoints(adsEndpoint=" + this.adsEndpoint + ", riEndpoint=" + this.riEndpoint + ", errorLogsEndpoint=" + this.errorLogsEndpoint + ", metricsEndpoint=" + this.metricsEndpoint + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ f(int i10, @SerialName(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS) String str, @SerialName("ri") String str2, @SerialName("error_logs") String str3, @SerialName("metrics") String str4, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.adsEndpoint = null;
            } else {
                this.adsEndpoint = str;
            }
            if ((i10 & 2) == 0) {
                this.riEndpoint = null;
            } else {
                this.riEndpoint = str2;
            }
            if ((i10 & 4) == 0) {
                this.errorLogsEndpoint = null;
            } else {
                this.errorLogsEndpoint = str3;
            }
            if ((i10 & 8) == 0) {
                this.metricsEndpoint = null;
            } else {
                this.metricsEndpoint = str4;
            }
        }

        public f(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.adsEndpoint = str;
            this.riEndpoint = str2;
            this.errorLogsEndpoint = str3;
            this.metricsEndpoint = str4;
        }

        public /* synthetic */ f(String str, String str2, String str3, String str4, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
        }
    }

    public static final class g {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final String buttonAccept;

        @Nullable
        private final String buttonDeny;

        @Nullable
        private final String consentMessage;

        @Nullable
        private final String consentMessageVersion;

        @Nullable
        private final String consentTitle;

        @Nullable
        private final Boolean isCountryDataProtected;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", aVar, 6);
                pluginGeneratedSerialDescriptor.k("is_country_data_protected", true);
                pluginGeneratedSerialDescriptor.k("consent_title", true);
                pluginGeneratedSerialDescriptor.k("consent_message", true);
                pluginGeneratedSerialDescriptor.k("consent_message_version", true);
                pluginGeneratedSerialDescriptor.k("button_accept", true);
                pluginGeneratedSerialDescriptor.k("button_deny", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                kotlinx.serialization.b bVarS = x9.a.s(kotlinx.serialization.internal.i.f22868a);
                b2 b2Var = b2.f22828a;
                return new kotlinx.serialization.b[]{bVarS, x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(b2Var)};
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public g deserialize(@NotNull y9.e decoder) {
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
                    objN = cVarB.n(descriptor2, 0, kotlinx.serialization.internal.i.f22868a, null);
                    b2 b2Var = b2.f22828a;
                    objN2 = cVarB.n(descriptor2, 1, b2Var, null);
                    objN3 = cVarB.n(descriptor2, 2, b2Var, null);
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
                                objN7 = cVarB.n(descriptor2, 0, kotlinx.serialization.internal.i.f22868a, objN7);
                                i12 |= 1;
                                i11 = 5;
                            case 1:
                                objN8 = cVarB.n(descriptor2, 1, b2.f22828a, objN8);
                                i12 |= 2;
                            case 2:
                                objN9 = cVarB.n(descriptor2, 2, b2.f22828a, objN9);
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
                return new g(i10, (Boolean) objN, (String) objN2, (String) objN3, (String) objN4, (String) objN5, (String) objN6, (w1) null);
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
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

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
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

        public g() {
            this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (kotlin.jvm.internal.i) null);
        }

        public static /* synthetic */ g copy$default(g gVar, Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = gVar.isCountryDataProtected;
            }
            if ((i10 & 2) != 0) {
                str = gVar.consentTitle;
            }
            if ((i10 & 4) != 0) {
                str2 = gVar.consentMessage;
            }
            if ((i10 & 8) != 0) {
                str3 = gVar.consentMessageVersion;
            }
            if ((i10 & 16) != 0) {
                str4 = gVar.buttonAccept;
            }
            if ((i10 & 32) != 0) {
                str5 = gVar.buttonDeny;
            }
            String str6 = str4;
            String str7 = str5;
            return gVar.copy(bool, str, str2, str3, str6, str7);
        }

        @SerialName("button_accept")
        public static /* synthetic */ void getButtonAccept$annotations() {
        }

        @SerialName("button_deny")
        public static /* synthetic */ void getButtonDeny$annotations() {
        }

        @SerialName("consent_message")
        public static /* synthetic */ void getConsentMessage$annotations() {
        }

        @SerialName("consent_message_version")
        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        @SerialName("consent_title")
        public static /* synthetic */ void getConsentTitle$annotations() {
        }

        @SerialName("is_country_data_protected")
        public static /* synthetic */ void isCountryDataProtected$annotations() {
        }

        @JvmStatic
        public static final void write$Self(@NotNull g self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.isCountryDataProtected != null) {
                output.i(serialDesc, 0, kotlinx.serialization.internal.i.f22868a, self.isCountryDataProtected);
            }
            if (output.z(serialDesc, 1) || self.consentTitle != null) {
                output.i(serialDesc, 1, b2.f22828a, self.consentTitle);
            }
            if (output.z(serialDesc, 2) || self.consentMessage != null) {
                output.i(serialDesc, 2, b2.f22828a, self.consentMessage);
            }
            if (output.z(serialDesc, 3) || self.consentMessageVersion != null) {
                output.i(serialDesc, 3, b2.f22828a, self.consentMessageVersion);
            }
            if (output.z(serialDesc, 4) || self.buttonAccept != null) {
                output.i(serialDesc, 4, b2.f22828a, self.buttonAccept);
            }
            if (!output.z(serialDesc, 5) && self.buttonDeny == null) {
                return;
            }
            output.i(serialDesc, 5, b2.f22828a, self.buttonDeny);
        }

        @Nullable
        public final Boolean component1() {
            return this.isCountryDataProtected;
        }

        @Nullable
        public final String component2() {
            return this.consentTitle;
        }

        @Nullable
        public final String component3() {
            return this.consentMessage;
        }

        @Nullable
        public final String component4() {
            return this.consentMessageVersion;
        }

        @Nullable
        public final String component5() {
            return this.buttonAccept;
        }

        @Nullable
        public final String component6() {
            return this.buttonDeny;
        }

        @NotNull
        public final g copy(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            return new g(bool, str, str2, str3, str4, str5);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return p.a(this.isCountryDataProtected, gVar.isCountryDataProtected) && p.a(this.consentTitle, gVar.consentTitle) && p.a(this.consentMessage, gVar.consentMessage) && p.a(this.consentMessageVersion, gVar.consentMessageVersion) && p.a(this.buttonAccept, gVar.buttonAccept) && p.a(this.buttonDeny, gVar.buttonDeny);
        }

        @Nullable
        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        @Nullable
        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        @Nullable
        public final String getConsentMessage() {
            return this.consentMessage;
        }

        @Nullable
        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        @Nullable
        public final String getConsentTitle() {
            return this.consentTitle;
        }

        public int hashCode() {
            Boolean bool = this.isCountryDataProtected;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.consentTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.consentMessage;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.consentMessageVersion;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.buttonAccept;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.buttonDeny;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        @Nullable
        public final Boolean isCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        @NotNull
        public String toString() {
            return "GDPRSettings(isCountryDataProtected=" + this.isCountryDataProtected + ", consentTitle=" + this.consentTitle + ", consentMessage=" + this.consentMessage + ", consentMessageVersion=" + this.consentMessageVersion + ", buttonAccept=" + this.buttonAccept + ", buttonDeny=" + this.buttonDeny + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ g(int i10, @SerialName("is_country_data_protected") Boolean bool, @SerialName("consent_title") String str, @SerialName("consent_message") String str2, @SerialName("consent_message_version") String str3, @SerialName("button_accept") String str4, @SerialName("button_deny") String str5, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.isCountryDataProtected = null;
            } else {
                this.isCountryDataProtected = bool;
            }
            if ((i10 & 2) == 0) {
                this.consentTitle = null;
            } else {
                this.consentTitle = str;
            }
            if ((i10 & 4) == 0) {
                this.consentMessage = null;
            } else {
                this.consentMessage = str2;
            }
            if ((i10 & 8) == 0) {
                this.consentMessageVersion = null;
            } else {
                this.consentMessageVersion = str3;
            }
            if ((i10 & 16) == 0) {
                this.buttonAccept = null;
            } else {
                this.buttonAccept = str4;
            }
            if ((i10 & 32) == 0) {
                this.buttonDeny = null;
            } else {
                this.buttonDeny = str5;
            }
        }

        public g(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
            this.isCountryDataProtected = bool;
            this.consentTitle = str;
            this.consentMessage = str2;
            this.consentMessageVersion = str3;
            this.buttonAccept = str4;
            this.buttonDeny = str5;
        }

        public /* synthetic */ g(Boolean bool, String str, String str2, String str3, String str4, String str5, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5);
        }
    }

    public static final class h {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final Integer errorLogLevel;

        @Nullable
        private final Boolean metricsEnabled;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.LogMetricsSettings", aVar, 2);
                pluginGeneratedSerialDescriptor.k("error_log_level", true);
                pluginGeneratedSerialDescriptor.k("metrics_is_enabled", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                return new kotlinx.serialization.b[]{x9.a.s(r0.f22908a), x9.a.s(kotlinx.serialization.internal.i.f22868a)};
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public h deserialize(@NotNull y9.e decoder) {
                Object objN;
                Object objN2;
                int i10;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                w1 w1Var = null;
                if (cVarB.p()) {
                    objN = cVarB.n(descriptor2, 0, r0.f22908a, null);
                    objN2 = cVarB.n(descriptor2, 1, kotlinx.serialization.internal.i.f22868a, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objN = null;
                    Object objN3 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objN = cVarB.n(descriptor2, 0, r0.f22908a, objN);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objN3 = cVarB.n(descriptor2, 1, kotlinx.serialization.internal.i.f22868a, objN3);
                            i11 |= 2;
                        }
                    }
                    objN2 = objN3;
                    i10 = i11;
                }
                cVarB.c(descriptor2);
                return new h(i10, (Integer) objN, (Boolean) objN2, w1Var);
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
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

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
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
            this((Integer) null, (Boolean) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.i) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ h copy$default(h hVar, Integer num, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = hVar.errorLogLevel;
            }
            if ((i10 & 2) != 0) {
                bool = hVar.metricsEnabled;
            }
            return hVar.copy(num, bool);
        }

        @SerialName("error_log_level")
        public static /* synthetic */ void getErrorLogLevel$annotations() {
        }

        @SerialName("metrics_is_enabled")
        public static /* synthetic */ void getMetricsEnabled$annotations() {
        }

        @JvmStatic
        public static final void write$Self(@NotNull h self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.errorLogLevel != null) {
                output.i(serialDesc, 0, r0.f22908a, self.errorLogLevel);
            }
            if (!output.z(serialDesc, 1) && self.metricsEnabled == null) {
                return;
            }
            output.i(serialDesc, 1, kotlinx.serialization.internal.i.f22868a, self.metricsEnabled);
        }

        @Nullable
        public final Integer component1() {
            return this.errorLogLevel;
        }

        @Nullable
        public final Boolean component2() {
            return this.metricsEnabled;
        }

        @NotNull
        public final h copy(@Nullable Integer num, @Nullable Boolean bool) {
            return new h(num, bool);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return p.a(this.errorLogLevel, hVar.errorLogLevel) && p.a(this.metricsEnabled, hVar.metricsEnabled);
        }

        @Nullable
        public final Integer getErrorLogLevel() {
            return this.errorLogLevel;
        }

        @Nullable
        public final Boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        public int hashCode() {
            Integer num = this.errorLogLevel;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.metricsEnabled;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LogMetricsSettings(errorLogLevel=" + this.errorLogLevel + ", metricsEnabled=" + this.metricsEnabled + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ h(int i10, @SerialName("error_log_level") Integer num, @SerialName("metrics_is_enabled") Boolean bool, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.errorLogLevel = null;
            } else {
                this.errorLogLevel = num;
            }
            if ((i10 & 2) == 0) {
                this.metricsEnabled = null;
            } else {
                this.metricsEnabled = bool;
            }
        }

        public h(@Nullable Integer num, @Nullable Boolean bool) {
            this.errorLogLevel = num;
            this.metricsEnabled = bool;
        }

        public /* synthetic */ h(Integer num, Boolean bool, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : bool);
        }
    }

    public static final class i {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private final g gdpr;

        @Nullable
        private final IABSettings iab;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.ConfigPayload.UserPrivacy", aVar, 2);
                pluginGeneratedSerialDescriptor.k("gdpr", true);
                pluginGeneratedSerialDescriptor.k("iab", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                return new kotlinx.serialization.b[]{x9.a.s(g.a.INSTANCE), x9.a.s(IABSettings.a.INSTANCE)};
            }

            @Override // kotlinx.serialization.a
            @NotNull
            public i deserialize(@NotNull y9.e decoder) {
                Object objN;
                Object objN2;
                int i10;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                w1 w1Var = null;
                if (cVarB.p()) {
                    objN = cVarB.n(descriptor2, 0, g.a.INSTANCE, null);
                    objN2 = cVarB.n(descriptor2, 1, IABSettings.a.INSTANCE, null);
                    i10 = 3;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    objN = null;
                    Object objN3 = null;
                    while (z10) {
                        int iO = cVarB.o(descriptor2);
                        if (iO == -1) {
                            z10 = false;
                        } else if (iO == 0) {
                            objN = cVarB.n(descriptor2, 0, g.a.INSTANCE, objN);
                            i11 |= 1;
                        } else {
                            if (iO != 1) {
                                throw new UnknownFieldException(iO);
                            }
                            objN3 = cVarB.n(descriptor2, 1, IABSettings.a.INSTANCE, objN3);
                            i11 |= 2;
                        }
                    }
                    objN2 = objN3;
                    i10 = i11;
                }
                cVarB.c(descriptor2);
                return new i(i10, (g) objN, (IABSettings) objN2, w1Var);
            }

            @Override // kotlinx.serialization.b, kotlinx.serialization.e, kotlinx.serialization.a
            @NotNull
            public kotlinx.serialization.descriptors.f getDescriptor() {
                return descriptor;
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

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] typeParametersSerializers() {
                return i0.a.a(this);
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
            this((g) null, (IABSettings) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.i) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ i copy$default(i iVar, g gVar, IABSettings iABSettings, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                gVar = iVar.gdpr;
            }
            if ((i10 & 2) != 0) {
                iABSettings = iVar.iab;
            }
            return iVar.copy(gVar, iABSettings);
        }

        @SerialName("gdpr")
        public static /* synthetic */ void getGdpr$annotations() {
        }

        @SerialName("iab")
        public static /* synthetic */ void getIab$annotations() {
        }

        @JvmStatic
        public static final void write$Self(@NotNull i self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.gdpr != null) {
                output.i(serialDesc, 0, g.a.INSTANCE, self.gdpr);
            }
            if (!output.z(serialDesc, 1) && self.iab == null) {
                return;
            }
            output.i(serialDesc, 1, IABSettings.a.INSTANCE, self.iab);
        }

        @Nullable
        public final g component1() {
            return this.gdpr;
        }

        @Nullable
        public final IABSettings component2() {
            return this.iab;
        }

        @NotNull
        public final i copy(@Nullable g gVar, @Nullable IABSettings iABSettings) {
            return new i(gVar, iABSettings);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return p.a(this.gdpr, iVar.gdpr) && p.a(this.iab, iVar.iab);
        }

        @Nullable
        public final g getGdpr() {
            return this.gdpr;
        }

        @Nullable
        public final IABSettings getIab() {
            return this.iab;
        }

        public int hashCode() {
            g gVar = this.gdpr;
            int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            IABSettings iABSettings = this.iab;
            return iHashCode + (iABSettings != null ? iABSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "UserPrivacy(gdpr=" + this.gdpr + ", iab=" + this.iab + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ i(int i10, @SerialName("gdpr") g gVar, @SerialName("iab") IABSettings iABSettings, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gVar;
            }
            if ((i10 & 2) == 0) {
                this.iab = null;
            } else {
                this.iab = iABSettings;
            }
        }

        public i(@Nullable g gVar, @Nullable IABSettings iABSettings) {
            this.gdpr = gVar;
            this.iab = iABSettings;
        }

        public /* synthetic */ i(g gVar, IABSettings iABSettings, int i10, kotlin.jvm.internal.i iVar) {
            this((i10 & 1) != 0 ? null : gVar, (i10 & 2) != 0 ? null : iABSettings);
        }
    }

    public ConfigPayload() {
        this((c) null, (e) null, (f) null, (h) null, (List) null, (i) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (b) null, (Boolean) null, (Boolean) null, 524287, (kotlin.jvm.internal.i) null);
    }

    public static /* synthetic */ ConfigPayload copy$default(ConfigPayload configPayload, c cVar, e eVar, f fVar, h hVar, List list, i iVar, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, b bVar, Boolean bool7, Boolean bool8, int i10, Object obj) {
        Boolean bool9;
        Boolean bool10;
        c cVar2 = (i10 & 1) != 0 ? configPayload.cleverCache : cVar;
        e eVar2 = (i10 & 2) != 0 ? configPayload.configSettings : eVar;
        f fVar2 = (i10 & 4) != 0 ? configPayload.endpoints : fVar;
        h hVar2 = (i10 & 8) != 0 ? configPayload.logMetricsSettings : hVar;
        List list2 = (i10 & 16) != 0 ? configPayload.placements : list;
        i iVar2 = (i10 & 32) != 0 ? configPayload.userPrivacy : iVar;
        String str2 = (i10 & 64) != 0 ? configPayload.configExtension : str;
        Boolean bool11 = (i10 & 128) != 0 ? configPayload.disableAdId : bool;
        Boolean bool12 = (i10 & 256) != 0 ? configPayload.isReportIncentivizedEnabled : bool2;
        Integer num3 = (i10 & 512) != 0 ? configPayload.sessionTimeout : num;
        Boolean bool13 = (i10 & 1024) != 0 ? configPayload.waitForConnectivityForTPAT : bool3;
        Integer num4 = (i10 & KEYRecord.Flags.FLAG4) != 0 ? configPayload.signalSessionTimeout : num2;
        Boolean bool14 = (i10 & 4096) != 0 ? configPayload.signalsDisabled : bool4;
        Boolean bool15 = (i10 & 8192) != 0 ? configPayload.fpdEnabled : bool5;
        c cVar3 = cVar2;
        Boolean bool16 = (i10 & 16384) != 0 ? configPayload.rtaDebugging : bool6;
        Long l11 = (i10 & 32768) != 0 ? configPayload.configLastValidatedTimestamp : l10;
        b bVar2 = (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? configPayload.autoRedirect : bVar;
        Boolean bool17 = (i10 & 131072) != 0 ? configPayload.retryPriorityTPATs : bool7;
        if ((i10 & 262144) != 0) {
            bool10 = bool17;
            bool9 = configPayload.enableOT;
        } else {
            bool9 = bool8;
            bool10 = bool17;
        }
        return configPayload.copy(cVar3, eVar2, fVar2, hVar2, list2, iVar2, str2, bool11, bool12, num3, bool13, num4, bool14, bool15, bool16, l11, bVar2, bool10, bool9);
    }

    @SerialName("auto_redirect")
    public static /* synthetic */ void getAutoRedirect$annotations() {
    }

    @SerialName("reuse_assets")
    public static /* synthetic */ void getCleverCache$annotations() {
    }

    @SerialName("config_extension")
    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    @SerialName("config_last_validated_ts")
    public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
    }

    @SerialName("config")
    public static /* synthetic */ void getConfigSettings$annotations() {
    }

    @SerialName("disable_ad_id")
    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    @SerialName("enable_ot")
    public static /* synthetic */ void getEnableOT$annotations() {
    }

    @SerialName("endpoints")
    public static /* synthetic */ void getEndpoints$annotations() {
    }

    @SerialName("fpd_enabled")
    public static /* synthetic */ void getFpdEnabled$annotations() {
    }

    @SerialName("log_metrics")
    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    @SerialName("placements")
    public static /* synthetic */ void getPlacements$annotations() {
    }

    @SerialName("retry_prioritized_tpat")
    public static /* synthetic */ void getRetryPriorityTPATs$annotations() {
    }

    @SerialName("rta_debugging")
    public static /* synthetic */ void getRtaDebugging$annotations() {
    }

    @SerialName("session_timeout")
    public static /* synthetic */ void getSessionTimeout$annotations() {
    }

    @SerialName("sdk_session_timeout")
    public static /* synthetic */ void getSignalSessionTimeout$annotations() {
    }

    @SerialName("signals_disabled")
    public static /* synthetic */ void getSignalsDisabled$annotations() {
    }

    @SerialName("user")
    public static /* synthetic */ void getUserPrivacy$annotations() {
    }

    @SerialName("wait_for_connectivity_for_tpat")
    public static /* synthetic */ void getWaitForConnectivityForTPAT$annotations() {
    }

    @SerialName("ri_enabled")
    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }

    @JvmStatic
    public static final void write$Self(@NotNull ConfigPayload self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        if (output.z(serialDesc, 0) || self.cleverCache != null) {
            output.i(serialDesc, 0, c.a.INSTANCE, self.cleverCache);
        }
        if (output.z(serialDesc, 1) || self.configSettings != null) {
            output.i(serialDesc, 1, e.a.INSTANCE, self.configSettings);
        }
        if (output.z(serialDesc, 2) || self.endpoints != null) {
            output.i(serialDesc, 2, f.a.INSTANCE, self.endpoints);
        }
        if (output.z(serialDesc, 3) || self.logMetricsSettings != null) {
            output.i(serialDesc, 3, h.a.INSTANCE, self.logMetricsSettings);
        }
        if (output.z(serialDesc, 4) || self.placements != null) {
            output.i(serialDesc, 4, new kotlinx.serialization.internal.f(h.a.INSTANCE), self.placements);
        }
        if (output.z(serialDesc, 5) || self.userPrivacy != null) {
            output.i(serialDesc, 5, i.a.INSTANCE, self.userPrivacy);
        }
        if (output.z(serialDesc, 6) || self.configExtension != null) {
            output.i(serialDesc, 6, b2.f22828a, self.configExtension);
        }
        if (output.z(serialDesc, 7) || !p.a(self.disableAdId, Boolean.TRUE)) {
            output.i(serialDesc, 7, kotlinx.serialization.internal.i.f22868a, self.disableAdId);
        }
        if (output.z(serialDesc, 8) || self.isReportIncentivizedEnabled != null) {
            output.i(serialDesc, 8, kotlinx.serialization.internal.i.f22868a, self.isReportIncentivizedEnabled);
        }
        if (output.z(serialDesc, 9) || self.sessionTimeout != null) {
            output.i(serialDesc, 9, r0.f22908a, self.sessionTimeout);
        }
        if (output.z(serialDesc, 10) || self.waitForConnectivityForTPAT != null) {
            output.i(serialDesc, 10, kotlinx.serialization.internal.i.f22868a, self.waitForConnectivityForTPAT);
        }
        if (output.z(serialDesc, 11) || self.signalSessionTimeout != null) {
            output.i(serialDesc, 11, r0.f22908a, self.signalSessionTimeout);
        }
        if (output.z(serialDesc, 12) || self.signalsDisabled != null) {
            output.i(serialDesc, 12, kotlinx.serialization.internal.i.f22868a, self.signalsDisabled);
        }
        if (output.z(serialDesc, 13) || self.fpdEnabled != null) {
            output.i(serialDesc, 13, kotlinx.serialization.internal.i.f22868a, self.fpdEnabled);
        }
        if (output.z(serialDesc, 14) || self.rtaDebugging != null) {
            output.i(serialDesc, 14, kotlinx.serialization.internal.i.f22868a, self.rtaDebugging);
        }
        if (output.z(serialDesc, 15) || self.configLastValidatedTimestamp != null) {
            output.i(serialDesc, 15, b1.f22826a, self.configLastValidatedTimestamp);
        }
        if (output.z(serialDesc, 16) || self.autoRedirect != null) {
            output.i(serialDesc, 16, b.a.INSTANCE, self.autoRedirect);
        }
        if (output.z(serialDesc, 17) || self.retryPriorityTPATs != null) {
            output.i(serialDesc, 17, kotlinx.serialization.internal.i.f22868a, self.retryPriorityTPATs);
        }
        if (!output.z(serialDesc, 18) && self.enableOT == null) {
            return;
        }
        output.i(serialDesc, 18, kotlinx.serialization.internal.i.f22868a, self.enableOT);
    }

    @Nullable
    public final c component1() {
        return this.cleverCache;
    }

    @Nullable
    public final Integer component10() {
        return this.sessionTimeout;
    }

    @Nullable
    public final Boolean component11() {
        return this.waitForConnectivityForTPAT;
    }

    @Nullable
    public final Integer component12() {
        return this.signalSessionTimeout;
    }

    @Nullable
    public final Boolean component13() {
        return this.signalsDisabled;
    }

    @Nullable
    public final Boolean component14() {
        return this.fpdEnabled;
    }

    @Nullable
    public final Boolean component15() {
        return this.rtaDebugging;
    }

    @Nullable
    public final Long component16() {
        return this.configLastValidatedTimestamp;
    }

    @Nullable
    public final b component17() {
        return this.autoRedirect;
    }

    @Nullable
    public final Boolean component18() {
        return this.retryPriorityTPATs;
    }

    @Nullable
    public final Boolean component19() {
        return this.enableOT;
    }

    @Nullable
    public final e component2() {
        return this.configSettings;
    }

    @Nullable
    public final f component3() {
        return this.endpoints;
    }

    @Nullable
    public final h component4() {
        return this.logMetricsSettings;
    }

    @Nullable
    public final List<q7.h> component5() {
        return this.placements;
    }

    @Nullable
    public final i component6() {
        return this.userPrivacy;
    }

    @Nullable
    public final String component7() {
        return this.configExtension;
    }

    @Nullable
    public final Boolean component8() {
        return this.disableAdId;
    }

    @Nullable
    public final Boolean component9() {
        return this.isReportIncentivizedEnabled;
    }

    @NotNull
    public final ConfigPayload copy(@Nullable c cVar, @Nullable e eVar, @Nullable f fVar, @Nullable h hVar, @Nullable List<q7.h> list, @Nullable i iVar, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Boolean bool3, @Nullable Integer num2, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Long l10, @Nullable b bVar, @Nullable Boolean bool7, @Nullable Boolean bool8) {
        return new ConfigPayload(cVar, eVar, fVar, hVar, list, iVar, str, bool, bool2, num, bool3, num2, bool4, bool5, bool6, l10, bVar, bool7, bool8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigPayload)) {
            return false;
        }
        ConfigPayload configPayload = (ConfigPayload) obj;
        return p.a(this.cleverCache, configPayload.cleverCache) && p.a(this.configSettings, configPayload.configSettings) && p.a(this.endpoints, configPayload.endpoints) && p.a(this.logMetricsSettings, configPayload.logMetricsSettings) && p.a(this.placements, configPayload.placements) && p.a(this.userPrivacy, configPayload.userPrivacy) && p.a(this.configExtension, configPayload.configExtension) && p.a(this.disableAdId, configPayload.disableAdId) && p.a(this.isReportIncentivizedEnabled, configPayload.isReportIncentivizedEnabled) && p.a(this.sessionTimeout, configPayload.sessionTimeout) && p.a(this.waitForConnectivityForTPAT, configPayload.waitForConnectivityForTPAT) && p.a(this.signalSessionTimeout, configPayload.signalSessionTimeout) && p.a(this.signalsDisabled, configPayload.signalsDisabled) && p.a(this.fpdEnabled, configPayload.fpdEnabled) && p.a(this.rtaDebugging, configPayload.rtaDebugging) && p.a(this.configLastValidatedTimestamp, configPayload.configLastValidatedTimestamp) && p.a(this.autoRedirect, configPayload.autoRedirect) && p.a(this.retryPriorityTPATs, configPayload.retryPriorityTPATs) && p.a(this.enableOT, configPayload.enableOT);
    }

    @Nullable
    public final b getAutoRedirect() {
        return this.autoRedirect;
    }

    @Nullable
    public final c getCleverCache() {
        return this.cleverCache;
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
    public final e getConfigSettings() {
        return this.configSettings;
    }

    @Nullable
    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    @Nullable
    public final Boolean getEnableOT() {
        return this.enableOT;
    }

    @Nullable
    public final f getEndpoints() {
        return this.endpoints;
    }

    @Nullable
    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    @Nullable
    public final h getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    @Nullable
    public final List<q7.h> getPlacements() {
        return this.placements;
    }

    @Nullable
    public final Boolean getRetryPriorityTPATs() {
        return this.retryPriorityTPATs;
    }

    @Nullable
    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    @Nullable
    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    @Nullable
    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    @Nullable
    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    @Nullable
    public final i getUserPrivacy() {
        return this.userPrivacy;
    }

    @Nullable
    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    public int hashCode() {
        c cVar = this.cleverCache;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        e eVar = this.configSettings;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        f fVar = this.endpoints;
        int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        h hVar = this.logMetricsSettings;
        int iHashCode4 = (iHashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        List<q7.h> list = this.placements;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        i iVar = this.userPrivacy;
        int iHashCode6 = (iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str = this.configExtension;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disableAdId;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReportIncentivizedEnabled;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.sessionTimeout;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.waitForConnectivityForTPAT;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.signalSessionTimeout;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.signalsDisabled;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.fpdEnabled;
        int iHashCode14 = (iHashCode13 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.rtaDebugging;
        int iHashCode15 = (iHashCode14 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Long l10 = this.configLastValidatedTimestamp;
        int iHashCode16 = (iHashCode15 + (l10 == null ? 0 : l10.hashCode())) * 31;
        b bVar = this.autoRedirect;
        int iHashCode17 = (iHashCode16 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool7 = this.retryPriorityTPATs;
        int iHashCode18 = (iHashCode17 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.enableOT;
        return iHashCode18 + (bool8 != null ? bool8.hashCode() : 0);
    }

    @Nullable
    public final Boolean isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final void setAutoRedirect(@Nullable b bVar) {
        this.autoRedirect = bVar;
    }

    public final void setConfigLastValidatedTimestamp(@Nullable Long l10) {
        this.configLastValidatedTimestamp = l10;
    }

    public final void setEnableOT(@Nullable Boolean bool) {
        this.enableOT = bool;
    }

    public final void setRetryPriorityTPATs(@Nullable Boolean bool) {
        this.retryPriorityTPATs = bool;
    }

    @NotNull
    public String toString() {
        return "ConfigPayload(cleverCache=" + this.cleverCache + ", configSettings=" + this.configSettings + ", endpoints=" + this.endpoints + ", logMetricsSettings=" + this.logMetricsSettings + ", placements=" + this.placements + ", userPrivacy=" + this.userPrivacy + ", configExtension=" + this.configExtension + ", disableAdId=" + this.disableAdId + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", sessionTimeout=" + this.sessionTimeout + ", waitForConnectivityForTPAT=" + this.waitForConnectivityForTPAT + ", signalSessionTimeout=" + this.signalSessionTimeout + ", signalsDisabled=" + this.signalsDisabled + ", fpdEnabled=" + this.fpdEnabled + ", rtaDebugging=" + this.rtaDebugging + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ", autoRedirect=" + this.autoRedirect + ", retryPriorityTPATs=" + this.retryPriorityTPATs + ", enableOT=" + this.enableOT + ')';
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ConfigPayload(int i10, @SerialName("reuse_assets") c cVar, @SerialName("config") e eVar, @SerialName("endpoints") f fVar, @SerialName("log_metrics") h hVar, @SerialName("placements") List list, @SerialName("user") i iVar, @SerialName("config_extension") String str, @SerialName("disable_ad_id") Boolean bool, @SerialName("ri_enabled") Boolean bool2, @SerialName("session_timeout") Integer num, @SerialName("wait_for_connectivity_for_tpat") Boolean bool3, @SerialName("sdk_session_timeout") Integer num2, @SerialName("signals_disabled") Boolean bool4, @SerialName("fpd_enabled") Boolean bool5, @SerialName("rta_debugging") Boolean bool6, @SerialName("config_last_validated_ts") Long l10, @SerialName("auto_redirect") b bVar, @SerialName("retry_prioritized_tpat") Boolean bool7, @SerialName("enable_ot") Boolean bool8, w1 w1Var) {
        if ((i10 & 1) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = cVar;
        }
        if ((i10 & 2) == 0) {
            this.configSettings = null;
        } else {
            this.configSettings = eVar;
        }
        if ((i10 & 4) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = fVar;
        }
        if ((i10 & 8) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = hVar;
        }
        if ((i10 & 16) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i10 & 32) == 0) {
            this.userPrivacy = null;
        } else {
            this.userPrivacy = iVar;
        }
        if ((i10 & 64) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        if ((i10 & 128) == 0) {
            this.disableAdId = Boolean.TRUE;
        } else {
            this.disableAdId = bool;
        }
        if ((i10 & 256) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = bool2;
        }
        if ((i10 & 512) == 0) {
            this.sessionTimeout = null;
        } else {
            this.sessionTimeout = num;
        }
        if ((i10 & 1024) == 0) {
            this.waitForConnectivityForTPAT = null;
        } else {
            this.waitForConnectivityForTPAT = bool3;
        }
        if ((i10 & KEYRecord.Flags.FLAG4) == 0) {
            this.signalSessionTimeout = null;
        } else {
            this.signalSessionTimeout = num2;
        }
        if ((i10 & 4096) == 0) {
            this.signalsDisabled = null;
        } else {
            this.signalsDisabled = bool4;
        }
        if ((i10 & 8192) == 0) {
            this.fpdEnabled = null;
        } else {
            this.fpdEnabled = bool5;
        }
        if ((i10 & 16384) == 0) {
            this.rtaDebugging = null;
        } else {
            this.rtaDebugging = bool6;
        }
        if ((32768 & i10) == 0) {
            this.configLastValidatedTimestamp = null;
        } else {
            this.configLastValidatedTimestamp = l10;
        }
        if ((65536 & i10) == 0) {
            this.autoRedirect = null;
        } else {
            this.autoRedirect = bVar;
        }
        if ((131072 & i10) == 0) {
            this.retryPriorityTPATs = null;
        } else {
            this.retryPriorityTPATs = bool7;
        }
        if ((i10 & 262144) == 0) {
            this.enableOT = null;
        } else {
            this.enableOT = bool8;
        }
    }

    public ConfigPayload(@Nullable c cVar, @Nullable e eVar, @Nullable f fVar, @Nullable h hVar, @Nullable List<q7.h> list, @Nullable i iVar, @Nullable String str, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Integer num, @Nullable Boolean bool3, @Nullable Integer num2, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6, @Nullable Long l10, @Nullable b bVar, @Nullable Boolean bool7, @Nullable Boolean bool8) {
        this.cleverCache = cVar;
        this.configSettings = eVar;
        this.endpoints = fVar;
        this.logMetricsSettings = hVar;
        this.placements = list;
        this.userPrivacy = iVar;
        this.configExtension = str;
        this.disableAdId = bool;
        this.isReportIncentivizedEnabled = bool2;
        this.sessionTimeout = num;
        this.waitForConnectivityForTPAT = bool3;
        this.signalSessionTimeout = num2;
        this.signalsDisabled = bool4;
        this.fpdEnabled = bool5;
        this.rtaDebugging = bool6;
        this.configLastValidatedTimestamp = l10;
        this.autoRedirect = bVar;
        this.retryPriorityTPATs = bool7;
        this.enableOT = bool8;
    }

    public /* synthetic */ ConfigPayload(c cVar, e eVar, f fVar, h hVar, List list, i iVar, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Long l10, b bVar, Boolean bool7, Boolean bool8, int i10, kotlin.jvm.internal.i iVar2) {
        this((i10 & 1) != 0 ? null : cVar, (i10 & 2) != 0 ? null : eVar, (i10 & 4) != 0 ? null : fVar, (i10 & 8) != 0 ? null : hVar, (i10 & 16) != 0 ? null : list, (i10 & 32) != 0 ? null : iVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? Boolean.TRUE : bool, (i10 & 256) != 0 ? null : bool2, (i10 & 512) != 0 ? null : num, (i10 & 1024) != 0 ? null : bool3, (i10 & KEYRecord.Flags.FLAG4) != 0 ? null : num2, (i10 & 4096) != 0 ? null : bool4, (i10 & 8192) != 0 ? null : bool5, (i10 & 16384) != 0 ? null : bool6, (i10 & 32768) != 0 ? null : l10, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : bVar, (i10 & 131072) != 0 ? null : bool7, (i10 & 262144) != 0 ? null : bool8);
    }
}
