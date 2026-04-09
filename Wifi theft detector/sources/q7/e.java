package q7;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
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
import kotlinx.serialization.internal.h0;
import kotlinx.serialization.internal.i0;
import kotlinx.serialization.internal.m1;
import kotlinx.serialization.internal.r0;
import kotlinx.serialization.internal.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xbill.DNS.KEYRecord;

/* loaded from: classes3.dex */
public final class e {

    @NotNull
    public static final b Companion = new b(null);

    @Nullable
    private final String carrier;

    @Nullable
    private c ext;

    /* renamed from: h, reason: collision with root package name */
    private int f24082h;

    @Nullable
    private String ifa;

    @Nullable
    private Integer lmt;

    @NotNull
    private final String make;

    @NotNull
    private final String model;

    @NotNull
    private final String os;

    @NotNull
    private final String osv;

    @Nullable
    private String ua;

    /* renamed from: w, reason: collision with root package name */
    private int f24083w;

    public static final class a implements i0 {

        @NotNull
        public static final a INSTANCE;
        public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode", aVar, 11);
            pluginGeneratedSerialDescriptor.k("make", false);
            pluginGeneratedSerialDescriptor.k("model", false);
            pluginGeneratedSerialDescriptor.k("osv", false);
            pluginGeneratedSerialDescriptor.k("carrier", true);
            pluginGeneratedSerialDescriptor.k("os", false);
            pluginGeneratedSerialDescriptor.k("w", false);
            pluginGeneratedSerialDescriptor.k("h", false);
            pluginGeneratedSerialDescriptor.k("ua", true);
            pluginGeneratedSerialDescriptor.k("ifa", true);
            pluginGeneratedSerialDescriptor.k("lmt", true);
            pluginGeneratedSerialDescriptor.k("ext", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.internal.i0
        @NotNull
        public kotlinx.serialization.b[] childSerializers() {
            b2 b2Var = b2.f22828a;
            kotlinx.serialization.b bVarS = x9.a.s(b2Var);
            r0 r0Var = r0.f22908a;
            return new kotlinx.serialization.b[]{b2Var, b2Var, b2Var, bVarS, b2Var, r0Var, r0Var, x9.a.s(b2Var), x9.a.s(b2Var), x9.a.s(r0Var), x9.a.s(c.a.INSTANCE)};
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
        public e deserialize(@NotNull y9.e decoder) {
            int i10;
            Object objN;
            Object objN2;
            Object objN3;
            Object objN4;
            Object objN5;
            int i11;
            int i12;
            String str;
            String str2;
            String str3;
            String str4;
            p.e(decoder, "decoder");
            kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
            y9.c cVarB = decoder.b(descriptor2);
            int i13 = 10;
            int i14 = 9;
            if (cVarB.p()) {
                String strM = cVarB.m(descriptor2, 0);
                String strM2 = cVarB.m(descriptor2, 1);
                String strM3 = cVarB.m(descriptor2, 2);
                b2 b2Var = b2.f22828a;
                objN5 = cVarB.n(descriptor2, 3, b2Var, null);
                String strM4 = cVarB.m(descriptor2, 4);
                int i15 = cVarB.i(descriptor2, 5);
                int i16 = cVarB.i(descriptor2, 6);
                objN4 = cVarB.n(descriptor2, 7, b2Var, null);
                objN3 = cVarB.n(descriptor2, 8, b2Var, null);
                objN = cVarB.n(descriptor2, 9, r0.f22908a, null);
                objN2 = cVarB.n(descriptor2, 10, c.a.INSTANCE, null);
                str = strM;
                i10 = i16;
                i11 = i15;
                str4 = strM4;
                str3 = strM3;
                str2 = strM2;
                i12 = 2047;
            } else {
                boolean z10 = true;
                int i17 = 0;
                int i18 = 0;
                Object objN6 = null;
                Object objN7 = null;
                Object objN8 = null;
                Object objN9 = null;
                String strM5 = null;
                String strM6 = null;
                String strM7 = null;
                String strM8 = null;
                int i19 = 0;
                Object objN10 = null;
                while (z10) {
                    int iO = cVarB.o(descriptor2);
                    switch (iO) {
                        case -1:
                            z10 = false;
                            i13 = 10;
                        case 0:
                            strM5 = cVarB.m(descriptor2, 0);
                            i18 |= 1;
                            i13 = 10;
                            i14 = 9;
                        case 1:
                            strM6 = cVarB.m(descriptor2, 1);
                            i18 |= 2;
                            i13 = 10;
                            i14 = 9;
                        case 2:
                            strM7 = cVarB.m(descriptor2, 2);
                            i18 |= 4;
                            i13 = 10;
                            i14 = 9;
                        case 3:
                            objN10 = cVarB.n(descriptor2, 3, b2.f22828a, objN10);
                            i18 |= 8;
                            i13 = 10;
                            i14 = 9;
                        case 4:
                            strM8 = cVarB.m(descriptor2, 4);
                            i18 |= 16;
                            i13 = 10;
                        case 5:
                            i19 = cVarB.i(descriptor2, 5);
                            i18 |= 32;
                        case 6:
                            i17 = cVarB.i(descriptor2, 6);
                            i18 |= 64;
                        case 7:
                            objN9 = cVarB.n(descriptor2, 7, b2.f22828a, objN9);
                            i18 |= 128;
                        case 8:
                            objN8 = cVarB.n(descriptor2, 8, b2.f22828a, objN8);
                            i18 |= 256;
                        case 9:
                            objN6 = cVarB.n(descriptor2, i14, r0.f22908a, objN6);
                            i18 |= 512;
                        case 10:
                            objN7 = cVarB.n(descriptor2, i13, c.a.INSTANCE, objN7);
                            i18 |= 1024;
                        default:
                            throw new UnknownFieldException(iO);
                    }
                }
                i10 = i17;
                objN = objN6;
                objN2 = objN7;
                objN3 = objN8;
                objN4 = objN9;
                objN5 = objN10;
                i11 = i19;
                i12 = i18;
                str = strM5;
                str2 = strM6;
                str3 = strM7;
                str4 = strM8;
            }
            cVarB.c(descriptor2);
            return new e(i12, str, str2, str3, (String) objN5, str4, i11, i10, (String) objN4, (String) objN3, (Integer) objN, (c) objN2, (w1) null);
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

    public static final class c {

        @NotNull
        public static final b Companion = new b(null);

        @Nullable
        private String amazonAdvertisingId;

        @Nullable
        private String appSetId;

        @Nullable
        private Integer appSetIdScope;
        private float batteryLevel;
        private int batterySaverEnabled;

        @Nullable
        private String batteryState;

        @Nullable
        private String connectionType;

        @Nullable
        private String connectionTypeDetail;

        @Nullable
        private String gaid;

        @Nullable
        private String gpVersion;
        private boolean isGooglePlayServicesAvailable;
        private boolean isSideloadEnabled;
        private boolean isTv;

        @Nullable
        private String language;

        @Nullable
        private String locale;

        @Nullable
        private Long obt;

        @Nullable
        private Long oit;

        @Nullable
        private Long ort;
        private int sdCardAvailable;

        @Nullable
        private Long sit;
        private int soundEnabled;

        @Nullable
        private String timeZone;
        private float volumeLevel;

        public static final class a implements i0 {

            @NotNull
            public static final a INSTANCE;
            public static final /* synthetic */ kotlinx.serialization.descriptors.f descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.vungle.ads.internal.model.DeviceNode.VungleExt", aVar, 23);
                pluginGeneratedSerialDescriptor.k("is_google_play_services_available", true);
                pluginGeneratedSerialDescriptor.k("app_set_id", true);
                pluginGeneratedSerialDescriptor.k("app_set_id_scope", true);
                pluginGeneratedSerialDescriptor.k("battery_level", true);
                pluginGeneratedSerialDescriptor.k("battery_state", true);
                pluginGeneratedSerialDescriptor.k("battery_saver_enabled", true);
                pluginGeneratedSerialDescriptor.k("connection_type", true);
                pluginGeneratedSerialDescriptor.k("connection_type_detail", true);
                pluginGeneratedSerialDescriptor.k("locale", true);
                pluginGeneratedSerialDescriptor.k("language", true);
                pluginGeneratedSerialDescriptor.k("time_zone", true);
                pluginGeneratedSerialDescriptor.k("volume_level", true);
                pluginGeneratedSerialDescriptor.k("sound_enabled", true);
                pluginGeneratedSerialDescriptor.k("is_tv", true);
                pluginGeneratedSerialDescriptor.k("sd_card_available", true);
                pluginGeneratedSerialDescriptor.k("is_sideload_enabled", true);
                pluginGeneratedSerialDescriptor.k("gaid", true);
                pluginGeneratedSerialDescriptor.k("amazon_advertising_id", true);
                pluginGeneratedSerialDescriptor.k("sit", true);
                pluginGeneratedSerialDescriptor.k("oit", true);
                pluginGeneratedSerialDescriptor.k("ort", true);
                pluginGeneratedSerialDescriptor.k("obt", true);
                pluginGeneratedSerialDescriptor.k("gp_version", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.internal.i0
            @NotNull
            public kotlinx.serialization.b[] childSerializers() {
                b2 b2Var = b2.f22828a;
                kotlinx.serialization.b bVarS = x9.a.s(b2Var);
                r0 r0Var = r0.f22908a;
                kotlinx.serialization.b bVarS2 = x9.a.s(r0Var);
                kotlinx.serialization.b bVarS3 = x9.a.s(b2Var);
                kotlinx.serialization.b bVarS4 = x9.a.s(b2Var);
                kotlinx.serialization.b bVarS5 = x9.a.s(b2Var);
                kotlinx.serialization.b bVarS6 = x9.a.s(b2Var);
                kotlinx.serialization.b bVarS7 = x9.a.s(b2Var);
                kotlinx.serialization.b bVarS8 = x9.a.s(b2Var);
                kotlinx.serialization.b bVarS9 = x9.a.s(b2Var);
                kotlinx.serialization.b bVarS10 = x9.a.s(b2Var);
                b1 b1Var = b1.f22826a;
                kotlinx.serialization.b bVarS11 = x9.a.s(b1Var);
                kotlinx.serialization.b bVarS12 = x9.a.s(b1Var);
                kotlinx.serialization.b bVarS13 = x9.a.s(b1Var);
                kotlinx.serialization.b bVarS14 = x9.a.s(b1Var);
                kotlinx.serialization.b bVarS15 = x9.a.s(b2Var);
                kotlinx.serialization.internal.i iVar = kotlinx.serialization.internal.i.f22868a;
                h0 h0Var = h0.f22862a;
                return new kotlinx.serialization.b[]{iVar, bVarS, bVarS2, h0Var, bVarS3, r0Var, bVarS4, bVarS5, bVarS6, bVarS7, bVarS8, h0Var, r0Var, iVar, r0Var, iVar, bVarS9, bVarS10, bVarS11, bVarS12, bVarS13, bVarS14, bVarS15};
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
                Object objN;
                Object objN2;
                Object objN3;
                Object obj;
                Object obj2;
                int i10;
                Object obj3;
                Object objN4;
                Object objN5;
                Object objN6;
                Object objN7;
                boolean z10;
                float f10;
                Object objN8;
                Object objN9;
                int i11;
                boolean z11;
                boolean z12;
                int i12;
                int i13;
                float f11;
                Object objN10;
                Object objN11;
                Object objN12;
                Object obj4;
                int i14;
                Object obj5;
                Object obj6;
                Object obj7;
                Object obj8;
                Object obj9;
                Object obj10;
                Object obj11;
                p.e(decoder, "decoder");
                kotlinx.serialization.descriptors.f descriptor2 = getDescriptor();
                y9.c cVarB = decoder.b(descriptor2);
                int i15 = 0;
                if (cVarB.p()) {
                    boolean zC = cVarB.C(descriptor2, 0);
                    b2 b2Var = b2.f22828a;
                    Object objN13 = cVarB.n(descriptor2, 1, b2Var, null);
                    objN12 = cVarB.n(descriptor2, 2, r0.f22908a, null);
                    float fU = cVarB.u(descriptor2, 3);
                    objN8 = cVarB.n(descriptor2, 4, b2Var, null);
                    int i16 = cVarB.i(descriptor2, 5);
                    objN10 = cVarB.n(descriptor2, 6, b2Var, null);
                    objN9 = cVarB.n(descriptor2, 7, b2Var, null);
                    objN7 = cVarB.n(descriptor2, 8, b2Var, null);
                    objN6 = cVarB.n(descriptor2, 9, b2Var, null);
                    objN5 = cVarB.n(descriptor2, 10, b2Var, null);
                    float fU2 = cVarB.u(descriptor2, 11);
                    int i17 = cVarB.i(descriptor2, 12);
                    boolean zC2 = cVarB.C(descriptor2, 13);
                    int i18 = cVarB.i(descriptor2, 14);
                    boolean zC3 = cVarB.C(descriptor2, 15);
                    obj = objN13;
                    Object objN14 = cVarB.n(descriptor2, 16, b2Var, null);
                    objN4 = cVarB.n(descriptor2, 17, b2Var, null);
                    b1 b1Var = b1.f22826a;
                    Object objN15 = cVarB.n(descriptor2, 18, b1Var, null);
                    Object objN16 = cVarB.n(descriptor2, 19, b1Var, null);
                    objN11 = cVarB.n(descriptor2, 20, b1Var, null);
                    Object objN17 = cVarB.n(descriptor2, 21, b1Var, null);
                    objN3 = cVarB.n(descriptor2, 22, b2Var, null);
                    i10 = 8388607;
                    i11 = i17;
                    i13 = i16;
                    f11 = fU2;
                    obj3 = objN15;
                    z10 = zC3;
                    i12 = i18;
                    z12 = zC2;
                    z11 = zC;
                    f10 = fU;
                    objN = objN16;
                    objN2 = objN17;
                    obj2 = objN14;
                } else {
                    objN = null;
                    boolean z13 = true;
                    Object objN18 = null;
                    Object objN19 = null;
                    Object objN20 = null;
                    Object objN21 = null;
                    Object objN22 = null;
                    objN2 = null;
                    Object objN23 = null;
                    Object objN24 = null;
                    Object objN25 = null;
                    Object objN26 = null;
                    Object objN27 = null;
                    Object objN28 = null;
                    Object objN29 = null;
                    boolean zC4 = false;
                    int i19 = 0;
                    boolean zC5 = false;
                    boolean zC6 = false;
                    int i20 = 0;
                    int i21 = 0;
                    float fU3 = 0.0f;
                    float fU4 = 0.0f;
                    Object objN30 = null;
                    while (z13) {
                        Object obj12 = objN22;
                        int iO = cVarB.o(descriptor2);
                        switch (iO) {
                            case -1:
                                obj5 = objN18;
                                obj6 = objN19;
                                obj7 = objN28;
                                obj8 = obj12;
                                z13 = false;
                                objN18 = obj5;
                                objN28 = obj7;
                                objN19 = obj6;
                                objN22 = obj8;
                            case 0:
                                obj5 = objN18;
                                obj6 = objN19;
                                obj7 = objN28;
                                obj8 = obj12;
                                zC5 = cVarB.C(descriptor2, 0);
                                i15 |= 1;
                                objN20 = objN20;
                                objN18 = obj5;
                                objN28 = obj7;
                                objN19 = obj6;
                                objN22 = obj8;
                            case 1:
                                obj9 = objN18;
                                i15 |= 2;
                                objN19 = objN19;
                                objN29 = objN29;
                                objN22 = obj12;
                                objN20 = objN20;
                                objN28 = cVarB.n(descriptor2, 1, b2.f22828a, objN28);
                                objN18 = obj9;
                            case 2:
                                obj9 = objN18;
                                obj10 = objN20;
                                objN29 = cVarB.n(descriptor2, 2, r0.f22908a, objN29);
                                i15 |= 4;
                                objN19 = objN19;
                                objN22 = obj12;
                                objN20 = obj10;
                                objN18 = obj9;
                            case 3:
                                obj9 = objN18;
                                obj10 = objN20;
                                fU3 = cVarB.u(descriptor2, 3);
                                i15 |= 8;
                                objN22 = obj12;
                                objN19 = objN19;
                                objN20 = obj10;
                                objN18 = obj9;
                            case 4:
                                obj9 = objN18;
                                i15 |= 16;
                                objN19 = objN19;
                                objN20 = objN20;
                                objN22 = cVarB.n(descriptor2, 4, b2.f22828a, obj12);
                                objN18 = obj9;
                            case 5:
                                obj11 = objN18;
                                i21 = cVarB.i(descriptor2, 5);
                                i15 |= 32;
                                objN19 = objN19;
                                objN18 = obj11;
                                objN22 = obj12;
                            case 6:
                                obj11 = objN18;
                                objN19 = cVarB.n(descriptor2, 6, b2.f22828a, objN19);
                                i15 |= 64;
                                objN18 = obj11;
                                objN22 = obj12;
                            case 7:
                                obj4 = objN19;
                                objN20 = cVarB.n(descriptor2, 7, b2.f22828a, objN20);
                                i15 |= 128;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 8:
                                obj4 = objN19;
                                objN27 = cVarB.n(descriptor2, 8, b2.f22828a, objN27);
                                i15 |= 256;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 9:
                                obj4 = objN19;
                                objN26 = cVarB.n(descriptor2, 9, b2.f22828a, objN26);
                                i15 |= 512;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 10:
                                obj4 = objN19;
                                objN25 = cVarB.n(descriptor2, 10, b2.f22828a, objN25);
                                i15 |= 1024;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 11:
                                obj4 = objN19;
                                fU4 = cVarB.u(descriptor2, 11);
                                i15 |= KEYRecord.Flags.FLAG4;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 12:
                                obj4 = objN19;
                                i19 = cVarB.i(descriptor2, 12);
                                i15 |= 4096;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 13:
                                obj4 = objN19;
                                zC6 = cVarB.C(descriptor2, 13);
                                i15 |= 8192;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 14:
                                obj4 = objN19;
                                i20 = cVarB.i(descriptor2, 14);
                                i15 |= 16384;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 15:
                                obj4 = objN19;
                                zC4 = cVarB.C(descriptor2, 15);
                                i15 |= 32768;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 16:
                                obj4 = objN19;
                                objN21 = cVarB.n(descriptor2, 16, b2.f22828a, objN21);
                                i14 = C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                i15 |= i14;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 17:
                                obj4 = objN19;
                                objN24 = cVarB.n(descriptor2, 17, b2.f22828a, objN24);
                                i14 = 131072;
                                i15 |= i14;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 18:
                                obj4 = objN19;
                                objN23 = cVarB.n(descriptor2, 18, b1.f22826a, objN23);
                                i14 = 262144;
                                i15 |= i14;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 19:
                                obj4 = objN19;
                                objN = cVarB.n(descriptor2, 19, b1.f22826a, objN);
                                i14 = 524288;
                                i15 |= i14;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 20:
                                obj4 = objN19;
                                objN30 = cVarB.n(descriptor2, 20, b1.f22826a, objN30);
                                i14 = ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                                i15 |= i14;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 21:
                                obj4 = objN19;
                                objN2 = cVarB.n(descriptor2, 21, b1.f22826a, objN2);
                                i14 = 2097152;
                                i15 |= i14;
                                objN22 = obj12;
                                objN19 = obj4;
                            case 22:
                                obj4 = objN19;
                                objN18 = cVarB.n(descriptor2, 22, b2.f22828a, objN18);
                                i14 = 4194304;
                                i15 |= i14;
                                objN22 = obj12;
                                objN19 = obj4;
                            default:
                                throw new UnknownFieldException(iO);
                        }
                    }
                    objN3 = objN18;
                    Object obj13 = objN20;
                    Object obj14 = objN22;
                    Object obj15 = objN19;
                    obj = objN28;
                    obj2 = objN21;
                    i10 = i15;
                    obj3 = objN23;
                    objN4 = objN24;
                    objN5 = objN25;
                    objN6 = objN26;
                    objN7 = objN27;
                    z10 = zC4;
                    f10 = fU3;
                    objN8 = obj14;
                    objN9 = obj13;
                    i11 = i19;
                    z11 = zC5;
                    z12 = zC6;
                    i12 = i20;
                    i13 = i21;
                    f11 = fU4;
                    objN10 = obj15;
                    objN11 = objN30;
                    objN12 = objN29;
                }
                cVarB.c(descriptor2);
                return new c(i10, z11, (String) obj, (Integer) objN12, f10, (String) objN8, i13, (String) objN10, (String) objN9, (String) objN7, (String) objN6, (String) objN5, f11, i11, z12, i12, z10, (String) obj2, (String) objN4, (Long) obj3, (Long) objN, (Long) objN11, (Long) objN2, (String) objN3, (w1) null);
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

        public c() {
            this(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, 8388607, (kotlin.jvm.internal.i) null);
        }

        public static /* synthetic */ c copy$default(c cVar, boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10, int i13, Object obj) {
            String str11;
            Long l14;
            boolean z13 = (i13 & 1) != 0 ? cVar.isGooglePlayServicesAvailable : z10;
            String str12 = (i13 & 2) != 0 ? cVar.appSetId : str;
            Integer num2 = (i13 & 4) != 0 ? cVar.appSetIdScope : num;
            float f12 = (i13 & 8) != 0 ? cVar.batteryLevel : f10;
            String str13 = (i13 & 16) != 0 ? cVar.batteryState : str2;
            int i14 = (i13 & 32) != 0 ? cVar.batterySaverEnabled : i10;
            String str14 = (i13 & 64) != 0 ? cVar.connectionType : str3;
            String str15 = (i13 & 128) != 0 ? cVar.connectionTypeDetail : str4;
            String str16 = (i13 & 256) != 0 ? cVar.locale : str5;
            String str17 = (i13 & 512) != 0 ? cVar.language : str6;
            String str18 = (i13 & 1024) != 0 ? cVar.timeZone : str7;
            float f13 = (i13 & KEYRecord.Flags.FLAG4) != 0 ? cVar.volumeLevel : f11;
            int i15 = (i13 & 4096) != 0 ? cVar.soundEnabled : i11;
            boolean z14 = (i13 & 8192) != 0 ? cVar.isTv : z11;
            boolean z15 = z13;
            int i16 = (i13 & 16384) != 0 ? cVar.sdCardAvailable : i12;
            boolean z16 = (i13 & 32768) != 0 ? cVar.isSideloadEnabled : z12;
            String str19 = (i13 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? cVar.gaid : str8;
            String str20 = (i13 & 131072) != 0 ? cVar.amazonAdvertisingId : str9;
            Long l15 = (i13 & 262144) != 0 ? cVar.sit : l10;
            Long l16 = (i13 & 524288) != 0 ? cVar.oit : l11;
            Long l17 = (i13 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? cVar.ort : l12;
            Long l18 = (i13 & 2097152) != 0 ? cVar.obt : l13;
            if ((i13 & 4194304) != 0) {
                l14 = l18;
                str11 = cVar.gpVersion;
            } else {
                str11 = str10;
                l14 = l18;
            }
            return cVar.copy(z15, str12, num2, f12, str13, i14, str14, str15, str16, str17, str18, f13, i15, z14, i16, z16, str19, str20, l15, l16, l17, l14, str11);
        }

        @JvmStatic
        public static final void write$Self(@NotNull c self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
            Float fValueOf = Float.valueOf(0.0f);
            p.e(self, "self");
            p.e(output, "output");
            p.e(serialDesc, "serialDesc");
            if (output.z(serialDesc, 0) || self.isGooglePlayServicesAvailable) {
                output.x(serialDesc, 0, self.isGooglePlayServicesAvailable);
            }
            if (output.z(serialDesc, 1) || self.appSetId != null) {
                output.i(serialDesc, 1, b2.f22828a, self.appSetId);
            }
            if (output.z(serialDesc, 2) || self.appSetIdScope != null) {
                output.i(serialDesc, 2, r0.f22908a, self.appSetIdScope);
            }
            if (output.z(serialDesc, 3) || !p.a(Float.valueOf(self.batteryLevel), fValueOf)) {
                output.s(serialDesc, 3, self.batteryLevel);
            }
            if (output.z(serialDesc, 4) || self.batteryState != null) {
                output.i(serialDesc, 4, b2.f22828a, self.batteryState);
            }
            if (output.z(serialDesc, 5) || self.batterySaverEnabled != 0) {
                output.w(serialDesc, 5, self.batterySaverEnabled);
            }
            if (output.z(serialDesc, 6) || self.connectionType != null) {
                output.i(serialDesc, 6, b2.f22828a, self.connectionType);
            }
            if (output.z(serialDesc, 7) || self.connectionTypeDetail != null) {
                output.i(serialDesc, 7, b2.f22828a, self.connectionTypeDetail);
            }
            if (output.z(serialDesc, 8) || self.locale != null) {
                output.i(serialDesc, 8, b2.f22828a, self.locale);
            }
            if (output.z(serialDesc, 9) || self.language != null) {
                output.i(serialDesc, 9, b2.f22828a, self.language);
            }
            if (output.z(serialDesc, 10) || self.timeZone != null) {
                output.i(serialDesc, 10, b2.f22828a, self.timeZone);
            }
            if (output.z(serialDesc, 11) || !p.a(Float.valueOf(self.volumeLevel), fValueOf)) {
                output.s(serialDesc, 11, self.volumeLevel);
            }
            if (output.z(serialDesc, 12) || self.soundEnabled != 1) {
                output.w(serialDesc, 12, self.soundEnabled);
            }
            if (output.z(serialDesc, 13) || self.isTv) {
                output.x(serialDesc, 13, self.isTv);
            }
            if (output.z(serialDesc, 14) || self.sdCardAvailable != 1) {
                output.w(serialDesc, 14, self.sdCardAvailable);
            }
            if (output.z(serialDesc, 15) || self.isSideloadEnabled) {
                output.x(serialDesc, 15, self.isSideloadEnabled);
            }
            if (output.z(serialDesc, 16) || self.gaid != null) {
                output.i(serialDesc, 16, b2.f22828a, self.gaid);
            }
            if (output.z(serialDesc, 17) || self.amazonAdvertisingId != null) {
                output.i(serialDesc, 17, b2.f22828a, self.amazonAdvertisingId);
            }
            if (output.z(serialDesc, 18) || self.sit != null) {
                output.i(serialDesc, 18, b1.f22826a, self.sit);
            }
            if (output.z(serialDesc, 19) || self.oit != null) {
                output.i(serialDesc, 19, b1.f22826a, self.oit);
            }
            if (output.z(serialDesc, 20) || self.ort != null) {
                output.i(serialDesc, 20, b1.f22826a, self.ort);
            }
            if (output.z(serialDesc, 21) || self.obt != null) {
                output.i(serialDesc, 21, b1.f22826a, self.obt);
            }
            if (!output.z(serialDesc, 22) && self.gpVersion == null) {
                return;
            }
            output.i(serialDesc, 22, b2.f22828a, self.gpVersion);
        }

        public final boolean component1() {
            return this.isGooglePlayServicesAvailable;
        }

        @Nullable
        public final String component10() {
            return this.language;
        }

        @Nullable
        public final String component11() {
            return this.timeZone;
        }

        public final float component12() {
            return this.volumeLevel;
        }

        public final int component13() {
            return this.soundEnabled;
        }

        public final boolean component14() {
            return this.isTv;
        }

        public final int component15() {
            return this.sdCardAvailable;
        }

        public final boolean component16() {
            return this.isSideloadEnabled;
        }

        @Nullable
        public final String component17() {
            return this.gaid;
        }

        @Nullable
        public final String component18() {
            return this.amazonAdvertisingId;
        }

        @Nullable
        public final Long component19() {
            return this.sit;
        }

        @Nullable
        public final String component2() {
            return this.appSetId;
        }

        @Nullable
        public final Long component20() {
            return this.oit;
        }

        @Nullable
        public final Long component21() {
            return this.ort;
        }

        @Nullable
        public final Long component22() {
            return this.obt;
        }

        @Nullable
        public final String component23() {
            return this.gpVersion;
        }

        @Nullable
        public final Integer component3() {
            return this.appSetIdScope;
        }

        public final float component4() {
            return this.batteryLevel;
        }

        @Nullable
        public final String component5() {
            return this.batteryState;
        }

        public final int component6() {
            return this.batterySaverEnabled;
        }

        @Nullable
        public final String component7() {
            return this.connectionType;
        }

        @Nullable
        public final String component8() {
            return this.connectionTypeDetail;
        }

        @Nullable
        public final String component9() {
            return this.locale;
        }

        @NotNull
        public final c copy(boolean z10, @Nullable String str, @Nullable Integer num, float f10, @Nullable String str2, int i10, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, float f11, int i11, boolean z11, int i12, boolean z12, @Nullable String str8, @Nullable String str9, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable String str10) {
            return new c(z10, str, num, f10, str2, i10, str3, str4, str5, str6, str7, f11, i11, z11, i12, z12, str8, str9, l10, l11, l12, l13, str10);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.isGooglePlayServicesAvailable == cVar.isGooglePlayServicesAvailable && p.a(this.appSetId, cVar.appSetId) && p.a(this.appSetIdScope, cVar.appSetIdScope) && p.a(Float.valueOf(this.batteryLevel), Float.valueOf(cVar.batteryLevel)) && p.a(this.batteryState, cVar.batteryState) && this.batterySaverEnabled == cVar.batterySaverEnabled && p.a(this.connectionType, cVar.connectionType) && p.a(this.connectionTypeDetail, cVar.connectionTypeDetail) && p.a(this.locale, cVar.locale) && p.a(this.language, cVar.language) && p.a(this.timeZone, cVar.timeZone) && p.a(Float.valueOf(this.volumeLevel), Float.valueOf(cVar.volumeLevel)) && this.soundEnabled == cVar.soundEnabled && this.isTv == cVar.isTv && this.sdCardAvailable == cVar.sdCardAvailable && this.isSideloadEnabled == cVar.isSideloadEnabled && p.a(this.gaid, cVar.gaid) && p.a(this.amazonAdvertisingId, cVar.amazonAdvertisingId) && p.a(this.sit, cVar.sit) && p.a(this.oit, cVar.oit) && p.a(this.ort, cVar.ort) && p.a(this.obt, cVar.obt) && p.a(this.gpVersion, cVar.gpVersion);
        }

        @Nullable
        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        @Nullable
        public final String getAppSetId() {
            return this.appSetId;
        }

        @Nullable
        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        @Nullable
        public final String getBatteryState() {
            return this.batteryState;
        }

        @Nullable
        public final String getConnectionType() {
            return this.connectionType;
        }

        @Nullable
        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        @Nullable
        public final String getGaid() {
            return this.gaid;
        }

        @Nullable
        public final String getGpVersion() {
            return this.gpVersion;
        }

        @Nullable
        public final String getLanguage() {
            return this.language;
        }

        @Nullable
        public final String getLocale() {
            return this.locale;
        }

        @Nullable
        public final Long getObt() {
            return this.obt;
        }

        @Nullable
        public final Long getOit() {
            return this.oit;
        }

        @Nullable
        public final Long getOrt() {
            return this.ort;
        }

        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        @Nullable
        public final Long getSit() {
            return this.sit;
        }

        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        @Nullable
        public final String getTimeZone() {
            return this.timeZone;
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v46 */
        /* JADX WARN: Type inference failed for: r0v47 */
        /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
        public int hashCode() {
            boolean z10 = this.isGooglePlayServicesAvailable;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            String str = this.appSetId;
            int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.appSetIdScope;
            int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Float.floatToIntBits(this.batteryLevel)) * 31;
            String str2 = this.batteryState;
            int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.batterySaverEnabled) * 31;
            String str3 = this.connectionType;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.connectionTypeDetail;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locale;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.language;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.timeZone;
            int iHashCode8 = (((((iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + Float.floatToIntBits(this.volumeLevel)) * 31) + this.soundEnabled) * 31;
            ?? r22 = this.isTv;
            int i11 = r22;
            if (r22 != 0) {
                i11 = 1;
            }
            int i12 = (((iHashCode8 + i11) * 31) + this.sdCardAvailable) * 31;
            boolean z11 = this.isSideloadEnabled;
            int i13 = (i12 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
            String str8 = this.gaid;
            int iHashCode9 = (i13 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.amazonAdvertisingId;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            Long l10 = this.sit;
            int iHashCode11 = (iHashCode10 + (l10 == null ? 0 : l10.hashCode())) * 31;
            Long l11 = this.oit;
            int iHashCode12 = (iHashCode11 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.ort;
            int iHashCode13 = (iHashCode12 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.obt;
            int iHashCode14 = (iHashCode13 + (l13 == null ? 0 : l13.hashCode())) * 31;
            String str10 = this.gpVersion;
            return iHashCode14 + (str10 != null ? str10.hashCode() : 0);
        }

        public final boolean isGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        public final boolean isSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        public final boolean isTv() {
            return this.isTv;
        }

        public final void setAmazonAdvertisingId(@Nullable String str) {
            this.amazonAdvertisingId = str;
        }

        public final void setAppSetId(@Nullable String str) {
            this.appSetId = str;
        }

        public final void setAppSetIdScope(@Nullable Integer num) {
            this.appSetIdScope = num;
        }

        public final void setBatteryLevel(float f10) {
            this.batteryLevel = f10;
        }

        public final void setBatterySaverEnabled(int i10) {
            this.batterySaverEnabled = i10;
        }

        public final void setBatteryState(@Nullable String str) {
            this.batteryState = str;
        }

        public final void setConnectionType(@Nullable String str) {
            this.connectionType = str;
        }

        public final void setConnectionTypeDetail(@Nullable String str) {
            this.connectionTypeDetail = str;
        }

        public final void setGaid(@Nullable String str) {
            this.gaid = str;
        }

        public final void setGooglePlayServicesAvailable(boolean z10) {
            this.isGooglePlayServicesAvailable = z10;
        }

        public final void setGpVersion(@Nullable String str) {
            this.gpVersion = str;
        }

        public final void setLanguage(@Nullable String str) {
            this.language = str;
        }

        public final void setLocale(@Nullable String str) {
            this.locale = str;
        }

        public final void setObt(@Nullable Long l10) {
            this.obt = l10;
        }

        public final void setOit(@Nullable Long l10) {
            this.oit = l10;
        }

        public final void setOrt(@Nullable Long l10) {
            this.ort = l10;
        }

        public final void setSdCardAvailable(int i10) {
            this.sdCardAvailable = i10;
        }

        public final void setSideloadEnabled(boolean z10) {
            this.isSideloadEnabled = z10;
        }

        public final void setSit(@Nullable Long l10) {
            this.sit = l10;
        }

        public final void setSoundEnabled(int i10) {
            this.soundEnabled = i10;
        }

        public final void setTimeZone(@Nullable String str) {
            this.timeZone = str;
        }

        public final void setTv(boolean z10) {
            this.isTv = z10;
        }

        public final void setVolumeLevel(float f10) {
            this.volumeLevel = f10;
        }

        @NotNull
        public String toString() {
            return "VungleExt(isGooglePlayServicesAvailable=" + this.isGooglePlayServicesAvailable + ", appSetId=" + this.appSetId + ", appSetIdScope=" + this.appSetIdScope + ", batteryLevel=" + this.batteryLevel + ", batteryState=" + this.batteryState + ", batterySaverEnabled=" + this.batterySaverEnabled + ", connectionType=" + this.connectionType + ", connectionTypeDetail=" + this.connectionTypeDetail + ", locale=" + this.locale + ", language=" + this.language + ", timeZone=" + this.timeZone + ", volumeLevel=" + this.volumeLevel + ", soundEnabled=" + this.soundEnabled + ", isTv=" + this.isTv + ", sdCardAvailable=" + this.sdCardAvailable + ", isSideloadEnabled=" + this.isSideloadEnabled + ", gaid=" + this.gaid + ", amazonAdvertisingId=" + this.amazonAdvertisingId + ", sit=" + this.sit + ", oit=" + this.oit + ", ort=" + this.ort + ", obt=" + this.obt + ", gpVersion=" + this.gpVersion + ')';
        }

        @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ c(int i10, @SerialName("is_google_play_services_available") boolean z10, @SerialName("app_set_id") String str, @SerialName("app_set_id_scope") Integer num, @SerialName("battery_level") float f10, @SerialName("battery_state") String str2, @SerialName("battery_saver_enabled") int i11, @SerialName("connection_type") String str3, @SerialName("connection_type_detail") String str4, @SerialName("locale") String str5, @SerialName("language") String str6, @SerialName("time_zone") String str7, @SerialName("volume_level") float f11, @SerialName("sound_enabled") int i12, @SerialName("is_tv") boolean z11, @SerialName("sd_card_available") int i13, @SerialName("is_sideload_enabled") boolean z12, @SerialName("gaid") String str8, @SerialName("amazon_advertising_id") String str9, @SerialName("sit") Long l10, @SerialName("oit") Long l11, @SerialName("ort") Long l12, @SerialName("obt") Long l13, @SerialName("gp_version") String str10, w1 w1Var) {
            if ((i10 & 1) == 0) {
                this.isGooglePlayServicesAvailable = false;
            } else {
                this.isGooglePlayServicesAvailable = z10;
            }
            if ((i10 & 2) == 0) {
                this.appSetId = null;
            } else {
                this.appSetId = str;
            }
            if ((i10 & 4) == 0) {
                this.appSetIdScope = null;
            } else {
                this.appSetIdScope = num;
            }
            if ((i10 & 8) == 0) {
                this.batteryLevel = 0.0f;
            } else {
                this.batteryLevel = f10;
            }
            if ((i10 & 16) == 0) {
                this.batteryState = null;
            } else {
                this.batteryState = str2;
            }
            if ((i10 & 32) == 0) {
                this.batterySaverEnabled = 0;
            } else {
                this.batterySaverEnabled = i11;
            }
            if ((i10 & 64) == 0) {
                this.connectionType = null;
            } else {
                this.connectionType = str3;
            }
            if ((i10 & 128) == 0) {
                this.connectionTypeDetail = null;
            } else {
                this.connectionTypeDetail = str4;
            }
            if ((i10 & 256) == 0) {
                this.locale = null;
            } else {
                this.locale = str5;
            }
            if ((i10 & 512) == 0) {
                this.language = null;
            } else {
                this.language = str6;
            }
            if ((i10 & 1024) == 0) {
                this.timeZone = null;
            } else {
                this.timeZone = str7;
            }
            if ((i10 & KEYRecord.Flags.FLAG4) == 0) {
                this.volumeLevel = 0.0f;
            } else {
                this.volumeLevel = f11;
            }
            if ((i10 & 4096) == 0) {
                this.soundEnabled = 1;
            } else {
                this.soundEnabled = i12;
            }
            if ((i10 & 8192) == 0) {
                this.isTv = false;
            } else {
                this.isTv = z11;
            }
            if ((i10 & 16384) == 0) {
                this.sdCardAvailable = 1;
            } else {
                this.sdCardAvailable = i13;
            }
            if ((32768 & i10) == 0) {
                this.isSideloadEnabled = false;
            } else {
                this.isSideloadEnabled = z12;
            }
            if ((65536 & i10) == 0) {
                this.gaid = null;
            } else {
                this.gaid = str8;
            }
            if ((131072 & i10) == 0) {
                this.amazonAdvertisingId = null;
            } else {
                this.amazonAdvertisingId = str9;
            }
            if ((262144 & i10) == 0) {
                this.sit = null;
            } else {
                this.sit = l10;
            }
            if ((524288 & i10) == 0) {
                this.oit = null;
            } else {
                this.oit = l11;
            }
            if ((1048576 & i10) == 0) {
                this.ort = null;
            } else {
                this.ort = l12;
            }
            if ((2097152 & i10) == 0) {
                this.obt = null;
            } else {
                this.obt = l13;
            }
            if ((i10 & 4194304) == 0) {
                this.gpVersion = null;
            } else {
                this.gpVersion = str10;
            }
        }

        public c(boolean z10, @Nullable String str, @Nullable Integer num, float f10, @Nullable String str2, int i10, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, float f11, int i11, boolean z11, int i12, boolean z12, @Nullable String str8, @Nullable String str9, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable String str10) {
            this.isGooglePlayServicesAvailable = z10;
            this.appSetId = str;
            this.appSetIdScope = num;
            this.batteryLevel = f10;
            this.batteryState = str2;
            this.batterySaverEnabled = i10;
            this.connectionType = str3;
            this.connectionTypeDetail = str4;
            this.locale = str5;
            this.language = str6;
            this.timeZone = str7;
            this.volumeLevel = f11;
            this.soundEnabled = i11;
            this.isTv = z11;
            this.sdCardAvailable = i12;
            this.isSideloadEnabled = z12;
            this.gaid = str8;
            this.amazonAdvertisingId = str9;
            this.sit = l10;
            this.oit = l11;
            this.ort = l12;
            this.obt = l13;
            this.gpVersion = str10;
        }

        @SerialName("amazon_advertising_id")
        public static /* synthetic */ void getAmazonAdvertisingId$annotations() {
        }

        @SerialName("app_set_id")
        public static /* synthetic */ void getAppSetId$annotations() {
        }

        @SerialName("app_set_id_scope")
        public static /* synthetic */ void getAppSetIdScope$annotations() {
        }

        @SerialName("battery_level")
        public static /* synthetic */ void getBatteryLevel$annotations() {
        }

        @SerialName("battery_saver_enabled")
        public static /* synthetic */ void getBatterySaverEnabled$annotations() {
        }

        @SerialName("battery_state")
        public static /* synthetic */ void getBatteryState$annotations() {
        }

        @SerialName("connection_type")
        public static /* synthetic */ void getConnectionType$annotations() {
        }

        @SerialName("connection_type_detail")
        public static /* synthetic */ void getConnectionTypeDetail$annotations() {
        }

        @SerialName("gaid")
        public static /* synthetic */ void getGaid$annotations() {
        }

        @SerialName("gp_version")
        public static /* synthetic */ void getGpVersion$annotations() {
        }

        @SerialName("language")
        public static /* synthetic */ void getLanguage$annotations() {
        }

        @SerialName("locale")
        public static /* synthetic */ void getLocale$annotations() {
        }

        @SerialName("obt")
        public static /* synthetic */ void getObt$annotations() {
        }

        @SerialName("oit")
        public static /* synthetic */ void getOit$annotations() {
        }

        @SerialName("ort")
        public static /* synthetic */ void getOrt$annotations() {
        }

        @SerialName("sd_card_available")
        public static /* synthetic */ void getSdCardAvailable$annotations() {
        }

        @SerialName("sit")
        public static /* synthetic */ void getSit$annotations() {
        }

        @SerialName("sound_enabled")
        public static /* synthetic */ void getSoundEnabled$annotations() {
        }

        @SerialName("time_zone")
        public static /* synthetic */ void getTimeZone$annotations() {
        }

        @SerialName("volume_level")
        public static /* synthetic */ void getVolumeLevel$annotations() {
        }

        @SerialName("is_google_play_services_available")
        public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
        }

        @SerialName("is_sideload_enabled")
        public static /* synthetic */ void isSideloadEnabled$annotations() {
        }

        @SerialName("is_tv")
        public static /* synthetic */ void isTv$annotations() {
        }

        public /* synthetic */ c(boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, Long l10, Long l11, Long l12, Long l13, String str10, int i13, kotlin.jvm.internal.i iVar) {
            this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : num, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? 0 : i10, (i13 & 64) != 0 ? null : str3, (i13 & 128) != 0 ? null : str4, (i13 & 256) != 0 ? null : str5, (i13 & 512) != 0 ? null : str6, (i13 & 1024) != 0 ? null : str7, (i13 & KEYRecord.Flags.FLAG4) == 0 ? f11 : 0.0f, (i13 & 4096) != 0 ? 1 : i11, (i13 & 8192) != 0 ? false : z11, (i13 & 16384) == 0 ? i12 : 1, (32768 & i13) != 0 ? false : z12, (i13 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : str8, (i13 & 131072) != 0 ? null : str9, (i13 & 262144) != 0 ? null : l10, (i13 & 524288) != 0 ? null : l11, (i13 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : l12, (i13 & 2097152) != 0 ? null : l13, (i13 & 4194304) != 0 ? null : str10);
        }
    }

    @Deprecated(level = DeprecationLevel.f21904c, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ e(int i10, String str, String str2, String str3, String str4, String str5, int i11, int i12, String str6, String str7, Integer num, c cVar, w1 w1Var) {
        if (119 != (i10 & 119)) {
            m1.a(i10, 119, a.INSTANCE.getDescriptor());
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i10 & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.f24083w = i11;
        this.f24082h = i12;
        if ((i10 & 128) == 0) {
            this.ua = null;
        } else {
            this.ua = str6;
        }
        if ((i10 & 256) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i10 & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i10 & 1024) == 0) {
            this.ext = null;
        } else {
            this.ext = cVar;
        }
    }

    public static /* synthetic */ e copy$default(e eVar, String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, c cVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = eVar.make;
        }
        if ((i12 & 2) != 0) {
            str2 = eVar.model;
        }
        if ((i12 & 4) != 0) {
            str3 = eVar.osv;
        }
        if ((i12 & 8) != 0) {
            str4 = eVar.carrier;
        }
        if ((i12 & 16) != 0) {
            str5 = eVar.os;
        }
        if ((i12 & 32) != 0) {
            i10 = eVar.f24083w;
        }
        if ((i12 & 64) != 0) {
            i11 = eVar.f24082h;
        }
        if ((i12 & 128) != 0) {
            str6 = eVar.ua;
        }
        if ((i12 & 256) != 0) {
            str7 = eVar.ifa;
        }
        if ((i12 & 512) != 0) {
            num = eVar.lmt;
        }
        if ((i12 & 1024) != 0) {
            cVar = eVar.ext;
        }
        Integer num2 = num;
        c cVar2 = cVar;
        String str8 = str6;
        String str9 = str7;
        int i13 = i10;
        int i14 = i11;
        String str10 = str5;
        String str11 = str3;
        return eVar.copy(str, str2, str11, str4, str10, i13, i14, str8, str9, num2, cVar2);
    }

    @JvmStatic
    public static final void write$Self(@NotNull e self, @NotNull y9.d output, @NotNull kotlinx.serialization.descriptors.f serialDesc) {
        p.e(self, "self");
        p.e(output, "output");
        p.e(serialDesc, "serialDesc");
        output.y(serialDesc, 0, self.make);
        output.y(serialDesc, 1, self.model);
        output.y(serialDesc, 2, self.osv);
        if (output.z(serialDesc, 3) || self.carrier != null) {
            output.i(serialDesc, 3, b2.f22828a, self.carrier);
        }
        output.y(serialDesc, 4, self.os);
        output.w(serialDesc, 5, self.f24083w);
        output.w(serialDesc, 6, self.f24082h);
        if (output.z(serialDesc, 7) || self.ua != null) {
            output.i(serialDesc, 7, b2.f22828a, self.ua);
        }
        if (output.z(serialDesc, 8) || self.ifa != null) {
            output.i(serialDesc, 8, b2.f22828a, self.ifa);
        }
        if (output.z(serialDesc, 9) || self.lmt != null) {
            output.i(serialDesc, 9, r0.f22908a, self.lmt);
        }
        if (!output.z(serialDesc, 10) && self.ext == null) {
            return;
        }
        output.i(serialDesc, 10, c.a.INSTANCE, self.ext);
    }

    @NotNull
    public final String component1() {
        return this.make;
    }

    @Nullable
    public final Integer component10() {
        return this.lmt;
    }

    @Nullable
    public final c component11() {
        return this.ext;
    }

    @NotNull
    public final String component2() {
        return this.model;
    }

    @NotNull
    public final String component3() {
        return this.osv;
    }

    @Nullable
    public final String component4() {
        return this.carrier;
    }

    @NotNull
    public final String component5() {
        return this.os;
    }

    public final int component6() {
        return this.f24083w;
    }

    public final int component7() {
        return this.f24082h;
    }

    @Nullable
    public final String component8() {
        return this.ua;
    }

    @Nullable
    public final String component9() {
        return this.ifa;
    }

    @NotNull
    public final e copy(@NotNull String make, @NotNull String model, @NotNull String osv, @Nullable String str, @NotNull String os, int i10, int i11, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable c cVar) {
        p.e(make, "make");
        p.e(model, "model");
        p.e(osv, "osv");
        p.e(os, "os");
        return new e(make, model, osv, str, os, i10, i11, str2, str3, num, cVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p.a(this.make, eVar.make) && p.a(this.model, eVar.model) && p.a(this.osv, eVar.osv) && p.a(this.carrier, eVar.carrier) && p.a(this.os, eVar.os) && this.f24083w == eVar.f24083w && this.f24082h == eVar.f24082h && p.a(this.ua, eVar.ua) && p.a(this.ifa, eVar.ifa) && p.a(this.lmt, eVar.lmt) && p.a(this.ext, eVar.ext);
    }

    @Nullable
    public final String getCarrier() {
        return this.carrier;
    }

    @Nullable
    public final c getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.f24082h;
    }

    @Nullable
    public final String getIfa() {
        return this.ifa;
    }

    @Nullable
    public final Integer getLmt() {
        return this.lmt;
    }

    @NotNull
    public final String getMake() {
        return this.make;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final String getOsv() {
        return this.osv;
    }

    @Nullable
    public final String getUa() {
        return this.ua;
    }

    public final int getW() {
        return this.f24083w;
    }

    public int hashCode() {
        int iHashCode = ((((this.make.hashCode() * 31) + this.model.hashCode()) * 31) + this.osv.hashCode()) * 31;
        String str = this.carrier;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.os.hashCode()) * 31) + this.f24083w) * 31) + this.f24082h) * 31;
        String str2 = this.ua;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ifa;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lmt;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        c cVar = this.ext;
        return iHashCode5 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final void setExt(@Nullable c cVar) {
        this.ext = cVar;
    }

    public final void setH(int i10) {
        this.f24082h = i10;
    }

    public final void setIfa(@Nullable String str) {
        this.ifa = str;
    }

    public final void setLmt(@Nullable Integer num) {
        this.lmt = num;
    }

    public final void setUa(@Nullable String str) {
        this.ua = str;
    }

    public final void setW(int i10) {
        this.f24083w = i10;
    }

    @NotNull
    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.f24083w + ", h=" + this.f24082h + ", ua=" + this.ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    public e(@NotNull String make, @NotNull String model, @NotNull String osv, @Nullable String str, @NotNull String os, int i10, int i11, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable c cVar) {
        p.e(make, "make");
        p.e(model, "model");
        p.e(osv, "osv");
        p.e(os, "os");
        this.make = make;
        this.model = model;
        this.osv = osv;
        this.carrier = str;
        this.os = os;
        this.f24083w = i10;
        this.f24082h = i11;
        this.ua = str2;
        this.ifa = str3;
        this.lmt = num;
        this.ext = cVar;
    }

    public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, c cVar, int i12, kotlin.jvm.internal.i iVar) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4, str5, i10, i11, (i12 & 128) != 0 ? null : str6, (i12 & 256) != 0 ? null : str7, (i12 & 512) != 0 ? null : num, (i12 & 1024) != 0 ? null : cVar);
    }
}
