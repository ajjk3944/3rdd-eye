package a6;

import M9.n;
import N7.B8;
import Q9.C0;
import Q9.C1532h;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.G;
import Q9.G0;
import Q9.H;
import Q9.Q;
import Q9.x0;
import com.google.android.gms.ads.AdRequest;
import com.singular.sdk.internal.Constants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* compiled from: DeviceNode.kt */
@M9.h
/* renamed from: a6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1659h {
    public static final b Companion = new b(null);
    private final String carrier;
    private c ext;

    /* renamed from: h, reason: collision with root package name */
    private final int f14164h;
    private String ifa;
    private Integer lmt;
    private final String make;
    private final String model;
    private final String os;
    private final String osv;

    /* renamed from: ua, reason: collision with root package name */
    private String f14165ua;

    /* renamed from: w, reason: collision with root package name */
    private final int f14166w;

    /* compiled from: DeviceNode.kt */
    /* renamed from: a6.h$a */
    public static final class a implements H<C1659h> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.DeviceNode", aVar, 11);
            c1547o0.k("make", false);
            c1547o0.k(CommonUrlParts.MODEL, false);
            c1547o0.k("osv", false);
            c1547o0.k("carrier", true);
            c1547o0.k("os", false);
            c1547o0.k("w", false);
            c1547o0.k("h", false);
            c1547o0.k("ua", true);
            c1547o0.k("ifa", true);
            c1547o0.k("lmt", true);
            c1547o0.k("ext", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            C0 c02 = C0.f11399a;
            M9.b<?> bVarB = N9.a.b(c02);
            Q q10 = Q.f11448a;
            return new M9.b[]{c02, c02, c02, bVarB, c02, q10, q10, N9.a.b(c02), N9.a.b(c02), N9.a.b(q10), N9.a.b(c.a.INSTANCE)};
        }

        @Override // M9.b
        public C1659h deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Object objG = null;
            Object objG2 = null;
            Object objG3 = null;
            String strN = null;
            String strN2 = null;
            String strN3 = null;
            Object objG4 = null;
            String strN4 = null;
            Object objG5 = null;
            boolean z10 = true;
            int i = 0;
            int i10 = 0;
            int i11 = 0;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                switch (iX) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        strN = bVarD.n(descriptor2, 0);
                        i |= 1;
                        break;
                    case 1:
                        strN2 = bVarD.n(descriptor2, 1);
                        i |= 2;
                        break;
                    case 2:
                        strN3 = bVarD.n(descriptor2, 2);
                        i |= 4;
                        break;
                    case 3:
                        objG = bVarD.G(descriptor2, 3, C0.f11399a, objG);
                        i |= 8;
                        break;
                    case 4:
                        strN4 = bVarD.n(descriptor2, 4);
                        i |= 16;
                        break;
                    case 5:
                        i10 = bVarD.i(descriptor2, 5);
                        i |= 32;
                        break;
                    case 6:
                        i11 = bVarD.i(descriptor2, 6);
                        i |= 64;
                        break;
                    case 7:
                        objG2 = bVarD.G(descriptor2, 7, C0.f11399a, objG2);
                        i |= 128;
                        break;
                    case 8:
                        objG3 = bVarD.G(descriptor2, 8, C0.f11399a, objG3);
                        i |= 256;
                        break;
                    case 9:
                        objG4 = bVarD.G(descriptor2, 9, Q.f11448a, objG4);
                        i |= AdRequest.MAX_CONTENT_URL_LENGTH;
                        break;
                    case 10:
                        objG5 = bVarD.G(descriptor2, 10, c.a.INSTANCE, objG5);
                        i |= 1024;
                        break;
                    default:
                        throw new n(iX);
                }
            }
            bVarD.b(descriptor2);
            return new C1659h(i, strN, strN2, strN3, (String) objG, strN4, i10, i11, (String) objG2, (String) objG3, (Integer) objG4, (c) objG5, (x0) null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, C1659h value) {
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            C1659h.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: DeviceNode.kt */
    /* renamed from: a6.h$b */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<C1659h> serializer() {
            return a.INSTANCE;
        }

        private b() {
        }
    }

    /* compiled from: DeviceNode.kt */
    @M9.h
    /* renamed from: a6.h$c */
    public static final class c {
        public static final b Companion = new b(null);
        private String amazonAdvertisingId;
        private String appSetId;
        private Integer appSetIdScope;
        private float batteryLevel;
        private int batterySaverEnabled;
        private String batteryState;
        private String connectionType;
        private String connectionTypeDetail;
        private String gaid;
        private boolean isGooglePlayServicesAvailable;
        private boolean isSideloadEnabled;
        private boolean isTv;
        private String language;
        private String locale;
        private int sdCardAvailable;
        private int soundEnabled;
        private String timeZone;
        private float volumeLevel;

        /* compiled from: DeviceNode.kt */
        /* renamed from: a6.h$c$a */
        public static final class a implements H<c> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.DeviceNode.VungleExt", aVar, 18);
                c1547o0.k("is_google_play_services_available", true);
                c1547o0.k(CommonUrlParts.APP_SET_ID, true);
                c1547o0.k(CommonUrlParts.APP_SET_ID_SCOPE, true);
                c1547o0.k("battery_level", true);
                c1547o0.k("battery_state", true);
                c1547o0.k("battery_saver_enabled", true);
                c1547o0.k("connection_type", true);
                c1547o0.k("connection_type_detail", true);
                c1547o0.k(CommonUrlParts.LOCALE, true);
                c1547o0.k("language", true);
                c1547o0.k("time_zone", true);
                c1547o0.k("volume_level", true);
                c1547o0.k("sound_enabled", true);
                c1547o0.k("is_tv", true);
                c1547o0.k("sd_card_available", true);
                c1547o0.k("is_sideload_enabled", true);
                c1547o0.k("gaid", true);
                c1547o0.k("amazon_advertising_id", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                C0 c02 = C0.f11399a;
                M9.b<?> bVarB = N9.a.b(c02);
                Q q10 = Q.f11448a;
                M9.b<?> bVarB2 = N9.a.b(q10);
                M9.b<?> bVarB3 = N9.a.b(c02);
                M9.b<?> bVarB4 = N9.a.b(c02);
                M9.b<?> bVarB5 = N9.a.b(c02);
                M9.b<?> bVarB6 = N9.a.b(c02);
                M9.b<?> bVarB7 = N9.a.b(c02);
                M9.b<?> bVarB8 = N9.a.b(c02);
                M9.b<?> bVarB9 = N9.a.b(c02);
                M9.b<?> bVarB10 = N9.a.b(c02);
                C1532h c1532h = C1532h.f11487a;
                G g10 = G.f11421a;
                return new M9.b[]{c1532h, bVarB, bVarB2, g10, bVarB3, q10, bVarB4, bVarB5, bVarB6, bVarB7, bVarB8, g10, q10, c1532h, q10, c1532h, bVarB9, bVarB10};
            }

            @Override // M9.b
            public c deserialize(P9.d decoder) {
                int i;
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                Object objG = null;
                Object objG2 = null;
                Object objG3 = null;
                Object objG4 = null;
                Object objG5 = null;
                Object objG6 = null;
                Object objG7 = null;
                Object objG8 = null;
                Object objG9 = null;
                float fV = 0.0f;
                float fV2 = 0.0f;
                boolean z10 = true;
                int i10 = 0;
                boolean zI = false;
                int i11 = 0;
                int i12 = 0;
                boolean zI2 = false;
                int i13 = 0;
                boolean zI3 = false;
                Object objG10 = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    switch (iX) {
                        case -1:
                            z10 = false;
                            continue;
                        case 0:
                            zI = bVarD.I(descriptor2, 0);
                            i10 |= 1;
                            continue;
                        case 1:
                            objG = bVarD.G(descriptor2, 1, C0.f11399a, objG);
                            i10 |= 2;
                            continue;
                        case 2:
                            objG10 = bVarD.G(descriptor2, 2, Q.f11448a, objG10);
                            i10 |= 4;
                            continue;
                        case 3:
                            fV = bVarD.v(descriptor2, 3);
                            i10 |= 8;
                            continue;
                        case 4:
                            objG2 = bVarD.G(descriptor2, 4, C0.f11399a, objG2);
                            i10 |= 16;
                            continue;
                        case 5:
                            i11 = bVarD.i(descriptor2, 5);
                            i10 |= 32;
                            continue;
                        case 6:
                            objG3 = bVarD.G(descriptor2, 6, C0.f11399a, objG3);
                            i10 |= 64;
                            continue;
                        case 7:
                            objG4 = bVarD.G(descriptor2, 7, C0.f11399a, objG4);
                            i10 |= 128;
                            continue;
                        case 8:
                            objG5 = bVarD.G(descriptor2, 8, C0.f11399a, objG5);
                            i10 |= 256;
                            continue;
                        case 9:
                            objG6 = bVarD.G(descriptor2, 9, C0.f11399a, objG6);
                            i10 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                            continue;
                        case 10:
                            objG7 = bVarD.G(descriptor2, 10, C0.f11399a, objG7);
                            i10 |= 1024;
                            continue;
                        case 11:
                            fV2 = bVarD.v(descriptor2, 11);
                            i10 |= 2048;
                            continue;
                        case 12:
                            i12 = bVarD.i(descriptor2, 12);
                            i10 |= 4096;
                            continue;
                        case 13:
                            zI2 = bVarD.I(descriptor2, 13);
                            i10 |= 8192;
                            continue;
                        case 14:
                            i13 = bVarD.i(descriptor2, 14);
                            i10 |= 16384;
                            continue;
                        case 15:
                            zI3 = bVarD.I(descriptor2, 15);
                            i = Constants.QUEUE_ELEMENT_MAX_SIZE;
                            break;
                        case 16:
                            objG8 = bVarD.G(descriptor2, 16, C0.f11399a, objG8);
                            i = 65536;
                            break;
                        case 17:
                            objG9 = bVarD.G(descriptor2, 17, C0.f11399a, objG9);
                            i = 131072;
                            break;
                        default:
                            throw new n(iX);
                    }
                    i10 |= i;
                }
                bVarD.b(descriptor2);
                return new c(i10, zI, (String) objG, (Integer) objG10, fV, (String) objG2, i11, (String) objG3, (String) objG4, (String) objG5, (String) objG6, (String) objG7, fV2, i12, zI2, i13, zI3, (String) objG8, (String) objG9, (x0) null);
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

        /* compiled from: DeviceNode.kt */
        /* renamed from: a6.h$c$b */
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

        public c() {
            this(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, 262143, (kotlin.jvm.internal.g) null);
        }

        public static /* synthetic */ c copy$default(c cVar, boolean z10, String str, Integer num, float f10, String str2, int i, String str3, String str4, String str5, String str6, String str7, float f11, int i10, boolean z11, int i11, boolean z12, String str8, String str9, int i12, Object obj) {
            String str10;
            String str11;
            boolean z13 = (i12 & 1) != 0 ? cVar.isGooglePlayServicesAvailable : z10;
            String str12 = (i12 & 2) != 0 ? cVar.appSetId : str;
            Integer num2 = (i12 & 4) != 0 ? cVar.appSetIdScope : num;
            float f12 = (i12 & 8) != 0 ? cVar.batteryLevel : f10;
            String str13 = (i12 & 16) != 0 ? cVar.batteryState : str2;
            int i13 = (i12 & 32) != 0 ? cVar.batterySaverEnabled : i;
            String str14 = (i12 & 64) != 0 ? cVar.connectionType : str3;
            String str15 = (i12 & 128) != 0 ? cVar.connectionTypeDetail : str4;
            String str16 = (i12 & 256) != 0 ? cVar.locale : str5;
            String str17 = (i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? cVar.language : str6;
            String str18 = (i12 & 1024) != 0 ? cVar.timeZone : str7;
            float f13 = (i12 & 2048) != 0 ? cVar.volumeLevel : f11;
            int i14 = (i12 & 4096) != 0 ? cVar.soundEnabled : i10;
            boolean z14 = (i12 & 8192) != 0 ? cVar.isTv : z11;
            boolean z15 = z13;
            int i15 = (i12 & 16384) != 0 ? cVar.sdCardAvailable : i11;
            boolean z16 = (i12 & Constants.QUEUE_ELEMENT_MAX_SIZE) != 0 ? cVar.isSideloadEnabled : z12;
            String str19 = (i12 & 65536) != 0 ? cVar.gaid : str8;
            if ((i12 & 131072) != 0) {
                str11 = str19;
                str10 = cVar.amazonAdvertisingId;
            } else {
                str10 = str9;
                str11 = str19;
            }
            return cVar.copy(z15, str12, num2, f12, str13, i13, str14, str15, str16, str17, str18, f13, i14, z14, i15, z16, str11, str10);
        }

        public static final void write$Self(c self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || self.isGooglePlayServicesAvailable) {
                output.B(serialDesc, 0, self.isGooglePlayServicesAvailable);
            }
            if (output.F(serialDesc, 1) || self.appSetId != null) {
                output.w(serialDesc, 1, C0.f11399a, self.appSetId);
            }
            if (output.F(serialDesc, 2) || self.appSetIdScope != null) {
                output.w(serialDesc, 2, Q.f11448a, self.appSetIdScope);
            }
            if (output.F(serialDesc, 3) || !Float.valueOf(self.batteryLevel).equals(Float.valueOf(0.0f))) {
                output.s(serialDesc, 3, self.batteryLevel);
            }
            if (output.F(serialDesc, 4) || self.batteryState != null) {
                output.w(serialDesc, 4, C0.f11399a, self.batteryState);
            }
            if (output.F(serialDesc, 5) || self.batterySaverEnabled != 0) {
                output.n(5, self.batterySaverEnabled, serialDesc);
            }
            if (output.F(serialDesc, 6) || self.connectionType != null) {
                output.w(serialDesc, 6, C0.f11399a, self.connectionType);
            }
            if (output.F(serialDesc, 7) || self.connectionTypeDetail != null) {
                output.w(serialDesc, 7, C0.f11399a, self.connectionTypeDetail);
            }
            if (output.F(serialDesc, 8) || self.locale != null) {
                output.w(serialDesc, 8, C0.f11399a, self.locale);
            }
            if (output.F(serialDesc, 9) || self.language != null) {
                output.w(serialDesc, 9, C0.f11399a, self.language);
            }
            if (output.F(serialDesc, 10) || self.timeZone != null) {
                output.w(serialDesc, 10, C0.f11399a, self.timeZone);
            }
            if (output.F(serialDesc, 11) || !Float.valueOf(self.volumeLevel).equals(Float.valueOf(0.0f))) {
                output.s(serialDesc, 11, self.volumeLevel);
            }
            if (output.F(serialDesc, 12) || self.soundEnabled != 1) {
                output.n(12, self.soundEnabled, serialDesc);
            }
            if (output.F(serialDesc, 13) || self.isTv) {
                output.B(serialDesc, 13, self.isTv);
            }
            if (output.F(serialDesc, 14) || self.sdCardAvailable != 1) {
                output.n(14, self.sdCardAvailable, serialDesc);
            }
            if (output.F(serialDesc, 15) || self.isSideloadEnabled) {
                output.B(serialDesc, 15, self.isSideloadEnabled);
            }
            if (output.F(serialDesc, 16) || self.gaid != null) {
                output.w(serialDesc, 16, C0.f11399a, self.gaid);
            }
            if (!output.F(serialDesc, 17) && self.amazonAdvertisingId == null) {
                return;
            }
            output.w(serialDesc, 17, C0.f11399a, self.amazonAdvertisingId);
        }

        public final boolean component1() {
            return this.isGooglePlayServicesAvailable;
        }

        public final String component10() {
            return this.language;
        }

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

        public final String component17() {
            return this.gaid;
        }

        public final String component18() {
            return this.amazonAdvertisingId;
        }

        public final String component2() {
            return this.appSetId;
        }

        public final Integer component3() {
            return this.appSetIdScope;
        }

        public final float component4() {
            return this.batteryLevel;
        }

        public final String component5() {
            return this.batteryState;
        }

        public final int component6() {
            return this.batterySaverEnabled;
        }

        public final String component7() {
            return this.connectionType;
        }

        public final String component8() {
            return this.connectionTypeDetail;
        }

        public final String component9() {
            return this.locale;
        }

        public final c copy(boolean z10, String str, Integer num, float f10, String str2, int i, String str3, String str4, String str5, String str6, String str7, float f11, int i10, boolean z11, int i11, boolean z12, String str8, String str9) {
            return new c(z10, str, num, f10, str2, i, str3, str4, str5, str6, str7, f11, i10, z11, i11, z12, str8, str9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.isGooglePlayServicesAvailable == cVar.isGooglePlayServicesAvailable && kotlin.jvm.internal.l.b(this.appSetId, cVar.appSetId) && kotlin.jvm.internal.l.b(this.appSetIdScope, cVar.appSetIdScope) && Float.valueOf(this.batteryLevel).equals(Float.valueOf(cVar.batteryLevel)) && kotlin.jvm.internal.l.b(this.batteryState, cVar.batteryState) && this.batterySaverEnabled == cVar.batterySaverEnabled && kotlin.jvm.internal.l.b(this.connectionType, cVar.connectionType) && kotlin.jvm.internal.l.b(this.connectionTypeDetail, cVar.connectionTypeDetail) && kotlin.jvm.internal.l.b(this.locale, cVar.locale) && kotlin.jvm.internal.l.b(this.language, cVar.language) && kotlin.jvm.internal.l.b(this.timeZone, cVar.timeZone) && Float.valueOf(this.volumeLevel).equals(Float.valueOf(cVar.volumeLevel)) && this.soundEnabled == cVar.soundEnabled && this.isTv == cVar.isTv && this.sdCardAvailable == cVar.sdCardAvailable && this.isSideloadEnabled == cVar.isSideloadEnabled && kotlin.jvm.internal.l.b(this.gaid, cVar.gaid) && kotlin.jvm.internal.l.b(this.amazonAdvertisingId, cVar.amazonAdvertisingId);
        }

        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final Integer getAppSetIdScope() {
            return this.appSetIdScope;
        }

        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        public final String getBatteryState() {
            return this.batteryState;
        }

        public final String getConnectionType() {
            return this.connectionType;
        }

        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        public final String getGaid() {
            return this.gaid;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        public final String getTimeZone() {
            return this.timeZone;
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v34 */
        /* JADX WARN: Type inference failed for: r0v35 */
        /* JADX WARN: Type inference failed for: r3v28, types: [boolean] */
        public int hashCode() {
            boolean z10 = this.isGooglePlayServicesAvailable;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i = r02 * 31;
            String str = this.appSetId;
            int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.appSetIdScope;
            int iG = B8.g(this.batteryLevel, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
            String str2 = this.batteryState;
            int iHashCode2 = (((iG + (str2 == null ? 0 : str2.hashCode())) * 31) + this.batterySaverEnabled) * 31;
            String str3 = this.connectionType;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.connectionTypeDetail;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.locale;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.language;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.timeZone;
            int iG2 = (B8.g(this.volumeLevel, (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31, 31) + this.soundEnabled) * 31;
            ?? r32 = this.isTv;
            int i10 = r32;
            if (r32 != 0) {
                i10 = 1;
            }
            int i11 = (((iG2 + i10) * 31) + this.sdCardAvailable) * 31;
            boolean z11 = this.isSideloadEnabled;
            int i12 = (i11 + (z11 ? 1 : z11 ? 1 : 0)) * 31;
            String str8 = this.gaid;
            int iHashCode7 = (i12 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.amazonAdvertisingId;
            return iHashCode7 + (str9 != null ? str9.hashCode() : 0);
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

        public final void setAmazonAdvertisingId(String str) {
            this.amazonAdvertisingId = str;
        }

        public final void setAppSetId(String str) {
            this.appSetId = str;
        }

        public final void setAppSetIdScope(Integer num) {
            this.appSetIdScope = num;
        }

        public final void setBatteryLevel(float f10) {
            this.batteryLevel = f10;
        }

        public final void setBatterySaverEnabled(int i) {
            this.batterySaverEnabled = i;
        }

        public final void setBatteryState(String str) {
            this.batteryState = str;
        }

        public final void setConnectionType(String str) {
            this.connectionType = str;
        }

        public final void setConnectionTypeDetail(String str) {
            this.connectionTypeDetail = str;
        }

        public final void setGaid(String str) {
            this.gaid = str;
        }

        public final void setGooglePlayServicesAvailable(boolean z10) {
            this.isGooglePlayServicesAvailable = z10;
        }

        public final void setLanguage(String str) {
            this.language = str;
        }

        public final void setLocale(String str) {
            this.locale = str;
        }

        public final void setSdCardAvailable(int i) {
            this.sdCardAvailable = i;
        }

        public final void setSideloadEnabled(boolean z10) {
            this.isSideloadEnabled = z10;
        }

        public final void setSoundEnabled(int i) {
            this.soundEnabled = i;
        }

        public final void setTimeZone(String str) {
            this.timeZone = str;
        }

        public final void setTv(boolean z10) {
            this.isTv = z10;
        }

        public final void setVolumeLevel(float f10) {
            this.volumeLevel = f10;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("VungleExt(isGooglePlayServicesAvailable=");
            sb.append(this.isGooglePlayServicesAvailable);
            sb.append(", appSetId=");
            sb.append(this.appSetId);
            sb.append(", appSetIdScope=");
            sb.append(this.appSetIdScope);
            sb.append(", batteryLevel=");
            sb.append(this.batteryLevel);
            sb.append(", batteryState=");
            sb.append(this.batteryState);
            sb.append(", batterySaverEnabled=");
            sb.append(this.batterySaverEnabled);
            sb.append(", connectionType=");
            sb.append(this.connectionType);
            sb.append(", connectionTypeDetail=");
            sb.append(this.connectionTypeDetail);
            sb.append(", locale=");
            sb.append(this.locale);
            sb.append(", language=");
            sb.append(this.language);
            sb.append(", timeZone=");
            sb.append(this.timeZone);
            sb.append(", volumeLevel=");
            sb.append(this.volumeLevel);
            sb.append(", soundEnabled=");
            sb.append(this.soundEnabled);
            sb.append(", isTv=");
            sb.append(this.isTv);
            sb.append(", sdCardAvailable=");
            sb.append(this.sdCardAvailable);
            sb.append(", isSideloadEnabled=");
            sb.append(this.isSideloadEnabled);
            sb.append(", gaid=");
            sb.append(this.gaid);
            sb.append(", amazonAdvertisingId=");
            return B8.j(sb, this.amazonAdvertisingId, ')');
        }

        public /* synthetic */ c(int i, boolean z10, String str, Integer num, float f10, String str2, int i10, String str3, String str4, String str5, String str6, String str7, float f11, int i11, boolean z11, int i12, boolean z12, String str8, String str9, x0 x0Var) {
            if ((i & 1) == 0) {
                this.isGooglePlayServicesAvailable = false;
            } else {
                this.isGooglePlayServicesAvailable = z10;
            }
            if ((i & 2) == 0) {
                this.appSetId = null;
            } else {
                this.appSetId = str;
            }
            if ((i & 4) == 0) {
                this.appSetIdScope = null;
            } else {
                this.appSetIdScope = num;
            }
            if ((i & 8) == 0) {
                this.batteryLevel = 0.0f;
            } else {
                this.batteryLevel = f10;
            }
            if ((i & 16) == 0) {
                this.batteryState = null;
            } else {
                this.batteryState = str2;
            }
            if ((i & 32) == 0) {
                this.batterySaverEnabled = 0;
            } else {
                this.batterySaverEnabled = i10;
            }
            if ((i & 64) == 0) {
                this.connectionType = null;
            } else {
                this.connectionType = str3;
            }
            if ((i & 128) == 0) {
                this.connectionTypeDetail = null;
            } else {
                this.connectionTypeDetail = str4;
            }
            if ((i & 256) == 0) {
                this.locale = null;
            } else {
                this.locale = str5;
            }
            if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
                this.language = null;
            } else {
                this.language = str6;
            }
            if ((i & 1024) == 0) {
                this.timeZone = null;
            } else {
                this.timeZone = str7;
            }
            if ((i & 2048) == 0) {
                this.volumeLevel = 0.0f;
            } else {
                this.volumeLevel = f11;
            }
            if ((i & 4096) == 0) {
                this.soundEnabled = 1;
            } else {
                this.soundEnabled = i11;
            }
            if ((i & 8192) == 0) {
                this.isTv = false;
            } else {
                this.isTv = z11;
            }
            if ((i & 16384) == 0) {
                this.sdCardAvailable = 1;
            } else {
                this.sdCardAvailable = i12;
            }
            if ((32768 & i) == 0) {
                this.isSideloadEnabled = false;
            } else {
                this.isSideloadEnabled = z12;
            }
            if ((65536 & i) == 0) {
                this.gaid = null;
            } else {
                this.gaid = str8;
            }
            if ((i & 131072) == 0) {
                this.amazonAdvertisingId = null;
            } else {
                this.amazonAdvertisingId = str9;
            }
        }

        public c(boolean z10, String str, Integer num, float f10, String str2, int i, String str3, String str4, String str5, String str6, String str7, float f11, int i10, boolean z11, int i11, boolean z12, String str8, String str9) {
            this.isGooglePlayServicesAvailable = z10;
            this.appSetId = str;
            this.appSetIdScope = num;
            this.batteryLevel = f10;
            this.batteryState = str2;
            this.batterySaverEnabled = i;
            this.connectionType = str3;
            this.connectionTypeDetail = str4;
            this.locale = str5;
            this.language = str6;
            this.timeZone = str7;
            this.volumeLevel = f11;
            this.soundEnabled = i10;
            this.isTv = z11;
            this.sdCardAvailable = i11;
            this.isSideloadEnabled = z12;
            this.gaid = str8;
            this.amazonAdvertisingId = str9;
        }

        public static /* synthetic */ void getAmazonAdvertisingId$annotations() {
        }

        public static /* synthetic */ void getAppSetId$annotations() {
        }

        public static /* synthetic */ void getAppSetIdScope$annotations() {
        }

        public static /* synthetic */ void getBatteryLevel$annotations() {
        }

        public static /* synthetic */ void getBatterySaverEnabled$annotations() {
        }

        public static /* synthetic */ void getBatteryState$annotations() {
        }

        public static /* synthetic */ void getConnectionType$annotations() {
        }

        public static /* synthetic */ void getConnectionTypeDetail$annotations() {
        }

        public static /* synthetic */ void getGaid$annotations() {
        }

        public static /* synthetic */ void getLanguage$annotations() {
        }

        public static /* synthetic */ void getLocale$annotations() {
        }

        public static /* synthetic */ void getSdCardAvailable$annotations() {
        }

        public static /* synthetic */ void getSoundEnabled$annotations() {
        }

        public static /* synthetic */ void getTimeZone$annotations() {
        }

        public static /* synthetic */ void getVolumeLevel$annotations() {
        }

        public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
        }

        public static /* synthetic */ void isSideloadEnabled$annotations() {
        }

        public static /* synthetic */ void isTv$annotations() {
        }

        public /* synthetic */ c(boolean z10, String str, Integer num, float f10, String str2, int i, String str3, String str4, String str5, String str6, String str7, float f11, int i10, boolean z11, int i11, boolean z12, String str8, String str9, int i12, kotlin.jvm.internal.g gVar) {
            this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? 0 : i, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : str4, (i12 & 256) != 0 ? null : str5, (i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : str6, (i12 & 1024) != 0 ? null : str7, (i12 & 2048) == 0 ? f11 : 0.0f, (i12 & 4096) != 0 ? 1 : i10, (i12 & 8192) != 0 ? false : z11, (i12 & 16384) == 0 ? i11 : 1, (32768 & i12) != 0 ? false : z12, (i12 & 65536) != 0 ? null : str8, (i12 & 131072) != 0 ? null : str9);
        }
    }

    public /* synthetic */ C1659h(int i, String str, String str2, String str3, String str4, String str5, int i10, int i11, String str6, String str7, Integer num, c cVar, x0 x0Var) {
        if (119 != (i & 119)) {
            G0.a(i, 119, a.INSTANCE.getDescriptor());
            throw null;
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.f14166w = i10;
        this.f14164h = i11;
        if ((i & 128) == 0) {
            this.f14165ua = null;
        } else {
            this.f14165ua = str6;
        }
        if ((i & 256) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i & 1024) == 0) {
            this.ext = null;
        } else {
            this.ext = cVar;
        }
    }

    public static /* synthetic */ C1659h copy$default(C1659h c1659h, String str, String str2, String str3, String str4, String str5, int i, int i10, String str6, String str7, Integer num, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = c1659h.make;
        }
        if ((i11 & 2) != 0) {
            str2 = c1659h.model;
        }
        if ((i11 & 4) != 0) {
            str3 = c1659h.osv;
        }
        if ((i11 & 8) != 0) {
            str4 = c1659h.carrier;
        }
        if ((i11 & 16) != 0) {
            str5 = c1659h.os;
        }
        if ((i11 & 32) != 0) {
            i = c1659h.f14166w;
        }
        if ((i11 & 64) != 0) {
            i10 = c1659h.f14164h;
        }
        if ((i11 & 128) != 0) {
            str6 = c1659h.f14165ua;
        }
        if ((i11 & 256) != 0) {
            str7 = c1659h.ifa;
        }
        if ((i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            num = c1659h.lmt;
        }
        if ((i11 & 1024) != 0) {
            cVar = c1659h.ext;
        }
        Integer num2 = num;
        c cVar2 = cVar;
        String str8 = str6;
        String str9 = str7;
        int i12 = i;
        int i13 = i10;
        String str10 = str5;
        String str11 = str3;
        return c1659h.copy(str, str2, str11, str4, str10, i12, i13, str8, str9, num2, cVar2);
    }

    public static final void write$Self(C1659h self, P9.c output, O9.e serialDesc) {
        kotlin.jvm.internal.l.f(self, "self");
        kotlin.jvm.internal.l.f(output, "output");
        kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
        output.k(serialDesc, 0, self.make);
        output.k(serialDesc, 1, self.model);
        output.k(serialDesc, 2, self.osv);
        if (output.F(serialDesc, 3) || self.carrier != null) {
            output.w(serialDesc, 3, C0.f11399a, self.carrier);
        }
        output.k(serialDesc, 4, self.os);
        output.n(5, self.f14166w, serialDesc);
        output.n(6, self.f14164h, serialDesc);
        if (output.F(serialDesc, 7) || self.f14165ua != null) {
            output.w(serialDesc, 7, C0.f11399a, self.f14165ua);
        }
        if (output.F(serialDesc, 8) || self.ifa != null) {
            output.w(serialDesc, 8, C0.f11399a, self.ifa);
        }
        if (output.F(serialDesc, 9) || self.lmt != null) {
            output.w(serialDesc, 9, Q.f11448a, self.lmt);
        }
        if (!output.F(serialDesc, 10) && self.ext == null) {
            return;
        }
        output.w(serialDesc, 10, c.a.INSTANCE, self.ext);
    }

    public final String component1() {
        return this.make;
    }

    public final Integer component10() {
        return this.lmt;
    }

    public final c component11() {
        return this.ext;
    }

    public final String component2() {
        return this.model;
    }

    public final String component3() {
        return this.osv;
    }

    public final String component4() {
        return this.carrier;
    }

    public final String component5() {
        return this.os;
    }

    public final int component6() {
        return this.f14166w;
    }

    public final int component7() {
        return this.f14164h;
    }

    public final String component8() {
        return this.f14165ua;
    }

    public final String component9() {
        return this.ifa;
    }

    public final C1659h copy(String make, String model, String osv, String str, String os, int i, int i10, String str2, String str3, Integer num, c cVar) {
        kotlin.jvm.internal.l.f(make, "make");
        kotlin.jvm.internal.l.f(model, "model");
        kotlin.jvm.internal.l.f(osv, "osv");
        kotlin.jvm.internal.l.f(os, "os");
        return new C1659h(make, model, osv, str, os, i, i10, str2, str3, num, cVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1659h)) {
            return false;
        }
        C1659h c1659h = (C1659h) obj;
        return kotlin.jvm.internal.l.b(this.make, c1659h.make) && kotlin.jvm.internal.l.b(this.model, c1659h.model) && kotlin.jvm.internal.l.b(this.osv, c1659h.osv) && kotlin.jvm.internal.l.b(this.carrier, c1659h.carrier) && kotlin.jvm.internal.l.b(this.os, c1659h.os) && this.f14166w == c1659h.f14166w && this.f14164h == c1659h.f14164h && kotlin.jvm.internal.l.b(this.f14165ua, c1659h.f14165ua) && kotlin.jvm.internal.l.b(this.ifa, c1659h.ifa) && kotlin.jvm.internal.l.b(this.lmt, c1659h.lmt) && kotlin.jvm.internal.l.b(this.ext, c1659h.ext);
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final c getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.f14164h;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final Integer getLmt() {
        return this.lmt;
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final String getUa() {
        return this.f14165ua;
    }

    public final int getW() {
        return this.f14166w;
    }

    public int hashCode() {
        int iN = B4.g.n(B4.g.n(this.make.hashCode() * 31, 31, this.model), 31, this.osv);
        String str = this.carrier;
        int iN2 = (((B4.g.n((iN + (str == null ? 0 : str.hashCode())) * 31, 31, this.os) + this.f14166w) * 31) + this.f14164h) * 31;
        String str2 = this.f14165ua;
        int iHashCode = (iN2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ifa;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.lmt;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        c cVar = this.ext;
        return iHashCode3 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final void setExt(c cVar) {
        this.ext = cVar;
    }

    public final void setIfa(String str) {
        this.ifa = str;
    }

    public final void setLmt(Integer num) {
        this.lmt = num;
    }

    public final void setUa(String str) {
        this.f14165ua = str;
    }

    public String toString() {
        return "DeviceNode(make=" + this.make + ", model=" + this.model + ", osv=" + this.osv + ", carrier=" + this.carrier + ", os=" + this.os + ", w=" + this.f14166w + ", h=" + this.f14164h + ", ua=" + this.f14165ua + ", ifa=" + this.ifa + ", lmt=" + this.lmt + ", ext=" + this.ext + ')';
    }

    public C1659h(String make, String model, String osv, String str, String os, int i, int i10, String str2, String str3, Integer num, c cVar) {
        kotlin.jvm.internal.l.f(make, "make");
        kotlin.jvm.internal.l.f(model, "model");
        kotlin.jvm.internal.l.f(osv, "osv");
        kotlin.jvm.internal.l.f(os, "os");
        this.make = make;
        this.model = model;
        this.osv = osv;
        this.carrier = str;
        this.os = os;
        this.f14166w = i;
        this.f14164h = i10;
        this.f14165ua = str2;
        this.ifa = str3;
        this.lmt = num;
        this.ext = cVar;
    }

    public /* synthetic */ C1659h(String str, String str2, String str3, String str4, String str5, int i, int i10, String str6, String str7, Integer num, c cVar, int i11, kotlin.jvm.internal.g gVar) {
        this(str, str2, str3, (i11 & 8) != 0 ? null : str4, str5, i, i10, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : num, (i11 & 1024) != 0 ? null : cVar);
    }
}
