package a6;

import M9.n;
import N7.B8;
import Q9.C0;
import Q9.C1526e;
import Q9.C1532h;
import Q9.C1547o0;
import Q9.C1549p0;
import Q9.H;
import Q9.M;
import Q9.Q;
import Q9.U;
import Q9.x0;
import R9.A;
import R9.E;
import R9.z;
import T1.B;
import a6.C1652a;
import a6.C1658g;
import c9.C2092m;
import c9.C2095p;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.ImagesContract;
import com.singular.sdk.internal.Constants;
import com.vungle.ads.C4045c;
import com.vungle.ads.C4055m;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.x;

/* compiled from: AdPayload.kt */
@M9.h
/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1653b {
    public static final e Companion = new e(null);
    public static final String FILE_SCHEME = "file://";
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    public static final String KEY_TEMPLATE = "template";
    public static final String KEY_VM = "vmURL";
    public static final String TPAT_CLICK_COORDINATES_URLS = "video.clickCoordinates";
    private static final String UNKNOWN = "unknown";
    private C4045c adConfig;
    private final List<f> ads;
    private File assetDirectory;
    private boolean assetsFullyDownloaded;
    private final C1658g config;
    private Map<String, String> incentivizedTextSettings;
    private ConcurrentHashMap<String, String> mraidFiles;

    /* compiled from: AdPayload.kt */
    /* renamed from: a6.b$a */
    public static final class a implements H<C1653b> {
        public static final a INSTANCE;
        public static final /* synthetic */ O9.e descriptor;

        static {
            a aVar = new a();
            INSTANCE = aVar;
            C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.AdPayload", aVar, 5);
            c1547o0.k("ads", true);
            c1547o0.k("config", true);
            c1547o0.k("mraidFiles", true);
            c1547o0.k("incentivizedTextSettings", true);
            c1547o0.k("assetsFullyDownloaded", true);
            descriptor = c1547o0;
        }

        private a() {
        }

        @Override // Q9.H
        public M9.b<?>[] childSerializers() {
            M9.b<?> bVarB = N9.a.b(new C1526e(f.a.INSTANCE));
            M9.b<?> bVarB2 = N9.a.b(C1658g.a.INSTANCE);
            kotlin.jvm.internal.e eVarA = x.a(ConcurrentHashMap.class);
            C0 c02 = C0.f11399a;
            return new M9.b[]{bVarB, bVarB2, new M9.a(eVarA, new M9.b[]{c02, c02}), new U(c02, c02), C1532h.f11487a};
        }

        @Override // M9.b
        public C1653b deserialize(P9.d decoder) {
            kotlin.jvm.internal.l.f(decoder, "decoder");
            O9.e descriptor2 = getDescriptor();
            P9.b bVarD = decoder.d(descriptor2);
            Object objG = null;
            int i = 0;
            boolean zI = false;
            boolean z10 = true;
            Object objG2 = null;
            Object objH = null;
            Object objH2 = null;
            while (z10) {
                int iX = bVarD.x(descriptor2);
                if (iX == -1) {
                    z10 = false;
                } else if (iX == 0) {
                    objG = bVarD.G(descriptor2, 0, new C1526e(f.a.INSTANCE), objG);
                    i |= 1;
                } else if (iX == 1) {
                    objG2 = bVarD.G(descriptor2, 1, C1658g.a.INSTANCE, objG2);
                    i |= 2;
                } else if (iX == 2) {
                    kotlin.jvm.internal.e eVarA = x.a(ConcurrentHashMap.class);
                    C0 c02 = C0.f11399a;
                    objH = bVarD.h(descriptor2, 2, new M9.a(eVarA, new M9.b[]{c02, c02}), objH);
                    i |= 4;
                } else if (iX == 3) {
                    C0 c03 = C0.f11399a;
                    objH2 = bVarD.h(descriptor2, 3, new U(c03, c03), objH2);
                    i |= 8;
                } else {
                    if (iX != 4) {
                        throw new n(iX);
                    }
                    zI = bVarD.I(descriptor2, 4);
                    i |= 16;
                }
            }
            bVarD.b(descriptor2);
            return new C1653b(i, (List) objG, (C1658g) objG2, (ConcurrentHashMap) objH, (Map) objH2, zI, null);
        }

        @Override // M9.b
        public O9.e getDescriptor() {
            return descriptor;
        }

        @Override // M9.b
        public void serialize(P9.e encoder, C1653b value) {
            kotlin.jvm.internal.l.f(encoder, "encoder");
            kotlin.jvm.internal.l.f(value, "value");
            O9.e descriptor2 = getDescriptor();
            P9.c cVarD = encoder.d(descriptor2);
            C1653b.write$Self(value, cVarD, descriptor2);
            cVarD.b(descriptor2);
        }

        @Override // Q9.H
        public M9.b<?>[] typeParametersSerializers() {
            return C1549p0.f11523a;
        }
    }

    /* compiled from: AdPayload.kt */
    @M9.h
    /* renamed from: a6.b$b, reason: collision with other inner class name */
    public static final class C0212b {
        public static final C0213b Companion = new C0213b(null);
        private final Integer height;
        private final Integer width;

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$b$a */
        public static final class a implements H<C0212b> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.AdPayload.AdSizeInfo", aVar, 2);
                c1547o0.k("w", true);
                c1547o0.k("h", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                Q q10 = Q.f11448a;
                return new M9.b[]{N9.a.b(q10), N9.a.b(q10)};
            }

            @Override // M9.b
            public C0212b deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                x0 x0Var = null;
                boolean z10 = true;
                int i = 0;
                Object objG = null;
                Object objG2 = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        objG = bVarD.G(descriptor2, 0, Q.f11448a, objG);
                        i |= 1;
                    } else {
                        if (iX != 1) {
                            throw new n(iX);
                        }
                        objG2 = bVarD.G(descriptor2, 1, Q.f11448a, objG2);
                        i |= 2;
                    }
                }
                bVarD.b(descriptor2);
                return new C0212b(i, (Integer) objG, (Integer) objG2, x0Var);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, C0212b value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                C0212b.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$b$b, reason: collision with other inner class name */
        public static final class C0213b {
            public /* synthetic */ C0213b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<C0212b> serializer() {
                return a.INSTANCE;
            }

            private C0213b() {
            }
        }

        public C0212b() {
            this((Integer) null, (Integer) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.g) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ C0212b copy$default(C0212b c0212b, Integer num, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = c0212b.width;
            }
            if ((i & 2) != 0) {
                num2 = c0212b.height;
            }
            return c0212b.copy(num, num2);
        }

        public static final void write$Self(C0212b self, P9.c output, O9.e serialDesc) {
            Integer num;
            Integer num2;
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || (num2 = self.width) == null || num2.intValue() != 0) {
                output.w(serialDesc, 0, Q.f11448a, self.width);
            }
            if (output.F(serialDesc, 1) || (num = self.height) == null || num.intValue() != 0) {
                output.w(serialDesc, 1, Q.f11448a, self.height);
            }
        }

        public final Integer component1() {
            return this.width;
        }

        public final Integer component2() {
            return this.height;
        }

        public final C0212b copy(Integer num, Integer num2) {
            return new C0212b(num, num2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0212b)) {
                return false;
            }
            C0212b c0212b = (C0212b) obj;
            return kotlin.jvm.internal.l.b(this.width, c0212b.width) && kotlin.jvm.internal.l.b(this.height, c0212b.height);
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final Integer getWidth() {
            return this.width;
        }

        public int hashCode() {
            Integer num = this.width;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.height;
            return iHashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "AdSizeInfo(width=" + this.width + ", height=" + this.height + ')';
        }

        public /* synthetic */ C0212b(int i, Integer num, Integer num2, x0 x0Var) {
            this.width = (i & 1) == 0 ? 0 : num;
            if ((i & 2) == 0) {
                this.height = 0;
            } else {
                this.height = num2;
            }
        }

        public C0212b(Integer num, Integer num2) {
            this.width = num;
            this.height = num2;
        }

        public /* synthetic */ C0212b(Integer num, Integer num2, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2);
        }

        public static /* synthetic */ void getHeight$annotations() {
        }

        public static /* synthetic */ void getWidth$annotations() {
        }
    }

    /* compiled from: AdPayload.kt */
    @M9.h
    /* renamed from: a6.b$c */
    public static final class c {
        public static final C0214b Companion = new C0214b(null);
        private final Boolean adLoadOptimizationEnabled;
        private final String adMarketId;
        private final C0212b adSizeInfo;
        private final String adSource;
        private final String adType;
        private final String advAppId;
        private final Boolean clickCoordinatesEnabled;
        private final String creativeId;
        private final String deeplinkUrl;
        private final Integer errorCode;
        private final Integer expiry;
        private final String id;
        private final String info;
        private final List<String> loadAdUrls;
        private final List<String> notification;
        private final Integer showClose;
        private final Integer showCloseIncentivized;
        private final Integer sleep;
        private final Boolean templateHeartbeatCheck;
        private final g templateSettings;
        private final String templateType;
        private final String templateURL;
        private final Map<String, List<String>> tpat;
        private final i viewAbility;
        private final String vmURL;

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$c$a */
        public static final class a implements H<c> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.AdPayload.AdUnit", aVar, 25);
                c1547o0.k(FacebookMediationAdapter.KEY_ID, true);
                c1547o0.k(Constants.ADMON_AD_TYPE, true);
                c1547o0.k("ad_source", true);
                c1547o0.k("expiry", true);
                c1547o0.k("deeplink_url", true);
                c1547o0.k("click_coordinates_enabled", true);
                c1547o0.k("ad_load_optimization", true);
                c1547o0.k("template_heartbeat_check", true);
                c1547o0.k("info", true);
                c1547o0.k("sleep", true);
                c1547o0.k("error_code", true);
                c1547o0.k("tpat", true);
                c1547o0.k("vm_url", true);
                c1547o0.k("ad_market_id", true);
                c1547o0.k("notification", true);
                c1547o0.k("load_ad", true);
                c1547o0.k("viewability", true);
                c1547o0.k("template_url", true);
                c1547o0.k("template_type", true);
                c1547o0.k("template_settings", true);
                c1547o0.k("creative_id", true);
                c1547o0.k(CommonUrlParts.APP_ID, true);
                c1547o0.k("show_close", true);
                c1547o0.k("show_close_incentivized", true);
                c1547o0.k("ad_size", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                C0 c02 = C0.f11399a;
                M9.b<?> bVarB = N9.a.b(c02);
                M9.b<?> bVarB2 = N9.a.b(c02);
                M9.b<?> bVarB3 = N9.a.b(c02);
                Q q10 = Q.f11448a;
                M9.b<?> bVarB4 = N9.a.b(q10);
                M9.b<?> bVarB5 = N9.a.b(c02);
                C1532h c1532h = C1532h.f11487a;
                return new M9.b[]{bVarB, bVarB2, bVarB3, bVarB4, bVarB5, N9.a.b(c1532h), N9.a.b(c1532h), N9.a.b(c1532h), N9.a.b(c02), N9.a.b(q10), N9.a.b(q10), N9.a.b(h.INSTANCE), N9.a.b(c02), N9.a.b(c02), N9.a.b(new C1526e(c02)), N9.a.b(new C1526e(c02)), N9.a.b(i.a.INSTANCE), N9.a.b(c02), N9.a.b(c02), N9.a.b(g.a.INSTANCE), N9.a.b(c02), N9.a.b(c02), N9.a.b(q10), N9.a.b(q10), N9.a.b(C0212b.a.INSTANCE)};
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // M9.b
            public c deserialize(P9.d decoder) {
                Object obj;
                int i;
                Object obj2;
                Object obj3;
                String strG;
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                Object objG = null;
                Object objG2 = null;
                String str = null;
                Object objG3 = null;
                Object objG4 = null;
                Object objG5 = null;
                Object objG6 = null;
                Object objG7 = null;
                Object objG8 = null;
                Object objG9 = null;
                Object objG10 = null;
                Object objG11 = null;
                Object objG12 = null;
                String strG2 = null;
                Object objG13 = null;
                Object objG14 = null;
                Object objG15 = null;
                Object objG16 = null;
                Object objG17 = null;
                Object objG18 = null;
                Object objG19 = null;
                Object objG20 = null;
                Object objG21 = null;
                Object objG22 = null;
                Object objG23 = null;
                int i10 = 0;
                boolean z10 = true;
                while (z10) {
                    String str2 = str;
                    int iX = bVarD.x(descriptor2);
                    switch (iX) {
                        case -1:
                            obj2 = objG;
                            z10 = false;
                            str = str2;
                            strG2 = strG2;
                            objG = obj2;
                        case 0:
                            obj = objG2;
                            i10 |= 1;
                            objG13 = objG13;
                            str = str2;
                            objG = objG;
                            strG2 = bVarD.G(descriptor2, 0, C0.f11399a, strG2);
                            objG2 = obj;
                        case 1:
                            obj3 = objG2;
                            obj2 = objG;
                            objG13 = bVarD.G(descriptor2, 1, C0.f11399a, objG13);
                            i10 |= 2;
                            objG14 = objG14;
                            strG = str2;
                            objG2 = obj3;
                            str = strG;
                            objG = obj2;
                        case 2:
                            obj3 = objG2;
                            obj2 = objG;
                            objG14 = bVarD.G(descriptor2, 2, C0.f11399a, objG14);
                            i10 |= 4;
                            strG = str2;
                            objG2 = obj3;
                            str = strG;
                            objG = obj2;
                        case 3:
                            obj3 = objG2;
                            obj2 = objG;
                            objG15 = bVarD.G(descriptor2, 3, Q.f11448a, objG15);
                            i10 |= 8;
                            strG = str2;
                            objG2 = obj3;
                            str = strG;
                            objG = obj2;
                        case 4:
                            obj3 = objG2;
                            obj2 = objG;
                            objG16 = bVarD.G(descriptor2, 4, C0.f11399a, objG16);
                            i10 |= 16;
                            strG = str2;
                            objG2 = obj3;
                            str = strG;
                            objG = obj2;
                        case 5:
                            obj3 = objG2;
                            obj2 = objG;
                            objG17 = bVarD.G(descriptor2, 5, C1532h.f11487a, objG17);
                            i10 |= 32;
                            strG = str2;
                            objG2 = obj3;
                            str = strG;
                            objG = obj2;
                        case 6:
                            obj3 = objG2;
                            obj2 = objG;
                            objG18 = bVarD.G(descriptor2, 6, C1532h.f11487a, objG18);
                            i10 |= 64;
                            strG = str2;
                            objG2 = obj3;
                            str = strG;
                            objG = obj2;
                        case 7:
                            obj3 = objG2;
                            obj2 = objG;
                            objG19 = bVarD.G(descriptor2, 7, C1532h.f11487a, objG19);
                            i10 |= 128;
                            strG = str2;
                            objG2 = obj3;
                            str = strG;
                            objG = obj2;
                        case 8:
                            obj3 = objG2;
                            obj2 = objG;
                            objG20 = bVarD.G(descriptor2, 8, C0.f11399a, objG20);
                            i10 |= 256;
                            strG = str2;
                            objG2 = obj3;
                            str = strG;
                            objG = obj2;
                        case 9:
                            obj3 = objG2;
                            obj2 = objG;
                            objG21 = bVarD.G(descriptor2, 9, Q.f11448a, objG21);
                            i10 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                            strG = str2;
                            objG2 = obj3;
                            str = strG;
                            objG = obj2;
                        case 10:
                            obj3 = objG2;
                            obj2 = objG;
                            objG22 = bVarD.G(descriptor2, 10, Q.f11448a, objG22);
                            i10 |= 1024;
                            strG = str2;
                            objG2 = obj3;
                            str = strG;
                            objG = obj2;
                        case 11:
                            obj3 = objG2;
                            obj2 = objG;
                            objG23 = bVarD.G(descriptor2, 11, h.INSTANCE, objG23);
                            i10 |= 2048;
                            strG = str2;
                            objG2 = obj3;
                            str = strG;
                            objG = obj2;
                        case 12:
                            obj2 = objG;
                            obj3 = objG2;
                            i10 |= 4096;
                            strG = bVarD.G(descriptor2, 12, C0.f11399a, str2);
                            objG2 = obj3;
                            str = strG;
                            objG = obj2;
                        case 13:
                            obj2 = objG;
                            objG2 = bVarD.G(descriptor2, 13, C0.f11399a, objG2);
                            i10 |= 8192;
                            str = str2;
                            objG = obj2;
                        case 14:
                            obj = objG2;
                            objG = bVarD.G(descriptor2, 14, new C1526e(C0.f11399a), objG);
                            i10 |= 16384;
                            str = str2;
                            objG2 = obj;
                        case 15:
                            obj = objG2;
                            objG3 = bVarD.G(descriptor2, 15, new C1526e(C0.f11399a), objG3);
                            i = Constants.QUEUE_ELEMENT_MAX_SIZE;
                            i10 |= i;
                            str = str2;
                            objG2 = obj;
                        case 16:
                            obj = objG2;
                            objG4 = bVarD.G(descriptor2, 16, i.a.INSTANCE, objG4);
                            i = 65536;
                            i10 |= i;
                            str = str2;
                            objG2 = obj;
                        case 17:
                            obj = objG2;
                            objG5 = bVarD.G(descriptor2, 17, C0.f11399a, objG5);
                            i = 131072;
                            i10 |= i;
                            str = str2;
                            objG2 = obj;
                        case 18:
                            obj = objG2;
                            objG6 = bVarD.G(descriptor2, 18, C0.f11399a, objG6);
                            i = 262144;
                            i10 |= i;
                            str = str2;
                            objG2 = obj;
                        case 19:
                            obj = objG2;
                            objG7 = bVarD.G(descriptor2, 19, g.a.INSTANCE, objG7);
                            i = 524288;
                            i10 |= i;
                            str = str2;
                            objG2 = obj;
                        case 20:
                            obj = objG2;
                            objG8 = bVarD.G(descriptor2, 20, C0.f11399a, objG8);
                            i = 1048576;
                            i10 |= i;
                            str = str2;
                            objG2 = obj;
                        case 21:
                            obj = objG2;
                            objG9 = bVarD.G(descriptor2, 21, C0.f11399a, objG9);
                            i = 2097152;
                            i10 |= i;
                            str = str2;
                            objG2 = obj;
                        case 22:
                            obj = objG2;
                            objG10 = bVarD.G(descriptor2, 22, Q.f11448a, objG10);
                            i = 4194304;
                            i10 |= i;
                            str = str2;
                            objG2 = obj;
                        case 23:
                            obj = objG2;
                            objG11 = bVarD.G(descriptor2, 23, Q.f11448a, objG11);
                            i = 8388608;
                            i10 |= i;
                            str = str2;
                            objG2 = obj;
                        case 24:
                            obj = objG2;
                            objG12 = bVarD.G(descriptor2, 24, C0212b.a.INSTANCE, objG12);
                            i = 16777216;
                            i10 |= i;
                            str = str2;
                            objG2 = obj;
                        default:
                            throw new n(iX);
                    }
                }
                Object obj4 = objG;
                String str3 = strG2;
                bVarD.b(descriptor2);
                return new c(i10, str3, (String) objG13, (String) objG14, (Integer) objG15, (String) objG16, (Boolean) objG17, (Boolean) objG18, (Boolean) objG19, (String) objG20, (Integer) objG21, (Integer) objG22, (Map) objG23, str, (String) objG2, (List) obj4, (List) objG3, (i) objG4, (String) objG5, (String) objG6, (g) objG7, (String) objG8, (String) objG9, (Integer) objG10, (Integer) objG11, (C0212b) objG12, (x0) null);
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

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$c$b, reason: collision with other inner class name */
        public static final class C0214b {
            public /* synthetic */ C0214b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<c> serializer() {
                return a.INSTANCE;
            }

            private C0214b() {
            }
        }

        public c() {
            this((String) null, (String) null, (String) null, (Integer) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (Integer) null, (Integer) null, (Map) null, (String) null, (String) null, (List) null, (List) null, (i) null, (String) null, (String) null, (g) null, (String) null, (String) null, (Integer) null, (Integer) null, (C0212b) null, 33554431, (kotlin.jvm.internal.g) null);
        }

        public static /* synthetic */ c copy$default(c cVar, String str, String str2, String str3, Integer num, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, Integer num2, Integer num3, Map map, String str6, String str7, List list, List list2, i iVar, String str8, String str9, g gVar, String str10, String str11, Integer num4, Integer num5, C0212b c0212b, int i, Object obj) {
            C0212b c0212b2;
            Integer num6;
            String str12 = (i & 1) != 0 ? cVar.id : str;
            String str13 = (i & 2) != 0 ? cVar.adType : str2;
            String str14 = (i & 4) != 0 ? cVar.adSource : str3;
            Integer num7 = (i & 8) != 0 ? cVar.expiry : num;
            String str15 = (i & 16) != 0 ? cVar.deeplinkUrl : str4;
            Boolean bool4 = (i & 32) != 0 ? cVar.clickCoordinatesEnabled : bool;
            Boolean bool5 = (i & 64) != 0 ? cVar.adLoadOptimizationEnabled : bool2;
            Boolean bool6 = (i & 128) != 0 ? cVar.templateHeartbeatCheck : bool3;
            String str16 = (i & 256) != 0 ? cVar.info : str5;
            Integer num8 = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? cVar.sleep : num2;
            Integer num9 = (i & 1024) != 0 ? cVar.errorCode : num3;
            Map map2 = (i & 2048) != 0 ? cVar.tpat : map;
            String str17 = (i & 4096) != 0 ? cVar.vmURL : str6;
            String str18 = (i & 8192) != 0 ? cVar.adMarketId : str7;
            String str19 = str12;
            List list3 = (i & 16384) != 0 ? cVar.notification : list;
            List list4 = (i & Constants.QUEUE_ELEMENT_MAX_SIZE) != 0 ? cVar.loadAdUrls : list2;
            i iVar2 = (i & 65536) != 0 ? cVar.viewAbility : iVar;
            String str20 = (i & 131072) != 0 ? cVar.templateURL : str8;
            String str21 = (i & 262144) != 0 ? cVar.templateType : str9;
            g gVar2 = (i & 524288) != 0 ? cVar.templateSettings : gVar;
            String str22 = (i & 1048576) != 0 ? cVar.creativeId : str10;
            String str23 = (i & 2097152) != 0 ? cVar.advAppId : str11;
            Integer num10 = (i & 4194304) != 0 ? cVar.showClose : num4;
            Integer num11 = (i & 8388608) != 0 ? cVar.showCloseIncentivized : num5;
            if ((i & 16777216) != 0) {
                num6 = num11;
                c0212b2 = cVar.adSizeInfo;
            } else {
                c0212b2 = c0212b;
                num6 = num11;
            }
            return cVar.copy(str19, str13, str14, num7, str15, bool4, bool5, bool6, str16, num8, num9, map2, str17, str18, list3, list4, iVar2, str20, str21, gVar2, str22, str23, num10, num6, c0212b2);
        }

        public static final void write$Self(c self, P9.c output, O9.e serialDesc) {
            Integer num;
            Integer num2;
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || self.id != null) {
                output.w(serialDesc, 0, C0.f11399a, self.id);
            }
            if (output.F(serialDesc, 1) || self.adType != null) {
                output.w(serialDesc, 1, C0.f11399a, self.adType);
            }
            if (output.F(serialDesc, 2) || self.adSource != null) {
                output.w(serialDesc, 2, C0.f11399a, self.adSource);
            }
            if (output.F(serialDesc, 3) || self.expiry != null) {
                output.w(serialDesc, 3, Q.f11448a, self.expiry);
            }
            if (output.F(serialDesc, 4) || self.deeplinkUrl != null) {
                output.w(serialDesc, 4, C0.f11399a, self.deeplinkUrl);
            }
            if (output.F(serialDesc, 5) || self.clickCoordinatesEnabled != null) {
                output.w(serialDesc, 5, C1532h.f11487a, self.clickCoordinatesEnabled);
            }
            if (output.F(serialDesc, 6) || self.adLoadOptimizationEnabled != null) {
                output.w(serialDesc, 6, C1532h.f11487a, self.adLoadOptimizationEnabled);
            }
            if (output.F(serialDesc, 7) || self.templateHeartbeatCheck != null) {
                output.w(serialDesc, 7, C1532h.f11487a, self.templateHeartbeatCheck);
            }
            if (output.F(serialDesc, 8) || self.info != null) {
                output.w(serialDesc, 8, C0.f11399a, self.info);
            }
            if (output.F(serialDesc, 9) || self.sleep != null) {
                output.w(serialDesc, 9, Q.f11448a, self.sleep);
            }
            if (output.F(serialDesc, 10) || self.errorCode != null) {
                output.w(serialDesc, 10, Q.f11448a, self.errorCode);
            }
            if (output.F(serialDesc, 11) || self.tpat != null) {
                output.w(serialDesc, 11, h.INSTANCE, self.tpat);
            }
            if (output.F(serialDesc, 12) || self.vmURL != null) {
                output.w(serialDesc, 12, C0.f11399a, self.vmURL);
            }
            if (output.F(serialDesc, 13) || self.adMarketId != null) {
                output.w(serialDesc, 13, C0.f11399a, self.adMarketId);
            }
            if (output.F(serialDesc, 14) || self.notification != null) {
                output.w(serialDesc, 14, new C1526e(C0.f11399a), self.notification);
            }
            if (output.F(serialDesc, 15) || self.loadAdUrls != null) {
                output.w(serialDesc, 15, new C1526e(C0.f11399a), self.loadAdUrls);
            }
            if (output.F(serialDesc, 16) || self.viewAbility != null) {
                output.w(serialDesc, 16, i.a.INSTANCE, self.viewAbility);
            }
            if (output.F(serialDesc, 17) || self.templateURL != null) {
                output.w(serialDesc, 17, C0.f11399a, self.templateURL);
            }
            if (output.F(serialDesc, 18) || self.templateType != null) {
                output.w(serialDesc, 18, C0.f11399a, self.templateType);
            }
            if (output.F(serialDesc, 19) || self.templateSettings != null) {
                output.w(serialDesc, 19, g.a.INSTANCE, self.templateSettings);
            }
            if (output.F(serialDesc, 20) || self.creativeId != null) {
                output.w(serialDesc, 20, C0.f11399a, self.creativeId);
            }
            if (output.F(serialDesc, 21) || self.advAppId != null) {
                output.w(serialDesc, 21, C0.f11399a, self.advAppId);
            }
            if (output.F(serialDesc, 22) || (num2 = self.showClose) == null || num2.intValue() != 0) {
                output.w(serialDesc, 22, Q.f11448a, self.showClose);
            }
            if (output.F(serialDesc, 23) || (num = self.showCloseIncentivized) == null || num.intValue() != 0) {
                output.w(serialDesc, 23, Q.f11448a, self.showCloseIncentivized);
            }
            if (!output.F(serialDesc, 24) && self.adSizeInfo == null) {
                return;
            }
            output.w(serialDesc, 24, C0212b.a.INSTANCE, self.adSizeInfo);
        }

        public final String component1() {
            return this.id;
        }

        public final Integer component10() {
            return this.sleep;
        }

        public final Integer component11() {
            return this.errorCode;
        }

        public final Map<String, List<String>> component12() {
            return this.tpat;
        }

        public final String component13() {
            return this.vmURL;
        }

        public final String component14() {
            return this.adMarketId;
        }

        public final List<String> component15() {
            return this.notification;
        }

        public final List<String> component16() {
            return this.loadAdUrls;
        }

        public final i component17() {
            return this.viewAbility;
        }

        public final String component18() {
            return this.templateURL;
        }

        public final String component19() {
            return this.templateType;
        }

        public final String component2() {
            return this.adType;
        }

        public final g component20() {
            return this.templateSettings;
        }

        public final String component21() {
            return this.creativeId;
        }

        public final String component22() {
            return this.advAppId;
        }

        public final Integer component23() {
            return this.showClose;
        }

        public final Integer component24() {
            return this.showCloseIncentivized;
        }

        public final C0212b component25() {
            return this.adSizeInfo;
        }

        public final String component3() {
            return this.adSource;
        }

        public final Integer component4() {
            return this.expiry;
        }

        public final String component5() {
            return this.deeplinkUrl;
        }

        public final Boolean component6() {
            return this.clickCoordinatesEnabled;
        }

        public final Boolean component7() {
            return this.adLoadOptimizationEnabled;
        }

        public final Boolean component8() {
            return this.templateHeartbeatCheck;
        }

        public final String component9() {
            return this.info;
        }

        public final c copy(String str, String str2, String str3, Integer num, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, Integer num2, Integer num3, Map<String, ? extends List<String>> map, String str6, String str7, List<String> list, List<String> list2, i iVar, String str8, String str9, g gVar, String str10, String str11, Integer num4, Integer num5, C0212b c0212b) {
            return new c(str, str2, str3, num, str4, bool, bool2, bool3, str5, num2, num3, map, str6, str7, list, list2, iVar, str8, str9, gVar, str10, str11, num4, num5, c0212b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.l.b(this.id, cVar.id) && kotlin.jvm.internal.l.b(this.adType, cVar.adType) && kotlin.jvm.internal.l.b(this.adSource, cVar.adSource) && kotlin.jvm.internal.l.b(this.expiry, cVar.expiry) && kotlin.jvm.internal.l.b(this.deeplinkUrl, cVar.deeplinkUrl) && kotlin.jvm.internal.l.b(this.clickCoordinatesEnabled, cVar.clickCoordinatesEnabled) && kotlin.jvm.internal.l.b(this.adLoadOptimizationEnabled, cVar.adLoadOptimizationEnabled) && kotlin.jvm.internal.l.b(this.templateHeartbeatCheck, cVar.templateHeartbeatCheck) && kotlin.jvm.internal.l.b(this.info, cVar.info) && kotlin.jvm.internal.l.b(this.sleep, cVar.sleep) && kotlin.jvm.internal.l.b(this.errorCode, cVar.errorCode) && kotlin.jvm.internal.l.b(this.tpat, cVar.tpat) && kotlin.jvm.internal.l.b(this.vmURL, cVar.vmURL) && kotlin.jvm.internal.l.b(this.adMarketId, cVar.adMarketId) && kotlin.jvm.internal.l.b(this.notification, cVar.notification) && kotlin.jvm.internal.l.b(this.loadAdUrls, cVar.loadAdUrls) && kotlin.jvm.internal.l.b(this.viewAbility, cVar.viewAbility) && kotlin.jvm.internal.l.b(this.templateURL, cVar.templateURL) && kotlin.jvm.internal.l.b(this.templateType, cVar.templateType) && kotlin.jvm.internal.l.b(this.templateSettings, cVar.templateSettings) && kotlin.jvm.internal.l.b(this.creativeId, cVar.creativeId) && kotlin.jvm.internal.l.b(this.advAppId, cVar.advAppId) && kotlin.jvm.internal.l.b(this.showClose, cVar.showClose) && kotlin.jvm.internal.l.b(this.showCloseIncentivized, cVar.showCloseIncentivized) && kotlin.jvm.internal.l.b(this.adSizeInfo, cVar.adSizeInfo);
        }

        public final Boolean getAdLoadOptimizationEnabled() {
            return this.adLoadOptimizationEnabled;
        }

        public final String getAdMarketId() {
            return this.adMarketId;
        }

        public final C0212b getAdSizeInfo() {
            return this.adSizeInfo;
        }

        public final String getAdSource() {
            return this.adSource;
        }

        public final String getAdType() {
            return this.adType;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        public final String getCreativeId() {
            return this.creativeId;
        }

        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final Integer getExpiry() {
            return this.expiry;
        }

        public final String getId() {
            return this.id;
        }

        public final String getInfo() {
            return this.info;
        }

        public final List<String> getLoadAdUrls() {
            return this.loadAdUrls;
        }

        public final List<String> getNotification() {
            return this.notification;
        }

        public final Integer getShowClose() {
            return this.showClose;
        }

        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        public final Integer getSleep() {
            return this.sleep;
        }

        public final Boolean getTemplateHeartbeatCheck() {
            return this.templateHeartbeatCheck;
        }

        public final g getTemplateSettings() {
            return this.templateSettings;
        }

        public final String getTemplateType() {
            return this.templateType;
        }

        public final String getTemplateURL() {
            return this.templateURL;
        }

        public final Map<String, List<String>> getTpat() {
            return this.tpat;
        }

        public final i getViewAbility() {
            return this.viewAbility;
        }

        public final String getVmURL() {
            return this.vmURL;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.adType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adSource;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.expiry;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.deeplinkUrl;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.clickCoordinatesEnabled;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.adLoadOptimizationEnabled;
            int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.templateHeartbeatCheck;
            int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str5 = this.info;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num2 = this.sleep;
            int iHashCode10 = (iHashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.errorCode;
            int iHashCode11 = (iHashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Map<String, List<String>> map = this.tpat;
            int iHashCode12 = (iHashCode11 + (map == null ? 0 : map.hashCode())) * 31;
            String str6 = this.vmURL;
            int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.adMarketId;
            int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
            List<String> list = this.notification;
            int iHashCode15 = (iHashCode14 + (list == null ? 0 : list.hashCode())) * 31;
            List<String> list2 = this.loadAdUrls;
            int iHashCode16 = (iHashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
            i iVar = this.viewAbility;
            int iHashCode17 = (iHashCode16 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            String str8 = this.templateURL;
            int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.templateType;
            int iHashCode19 = (iHashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
            g gVar = this.templateSettings;
            int iHashCode20 = (iHashCode19 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            String str10 = this.creativeId;
            int iHashCode21 = (iHashCode20 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.advAppId;
            int iHashCode22 = (iHashCode21 + (str11 == null ? 0 : str11.hashCode())) * 31;
            Integer num4 = this.showClose;
            int iHashCode23 = (iHashCode22 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.showCloseIncentivized;
            int iHashCode24 = (iHashCode23 + (num5 == null ? 0 : num5.hashCode())) * 31;
            C0212b c0212b = this.adSizeInfo;
            return iHashCode24 + (c0212b != null ? c0212b.hashCode() : 0);
        }

        public String toString() {
            return "AdUnit(id=" + this.id + ", adType=" + this.adType + ", adSource=" + this.adSource + ", expiry=" + this.expiry + ", deeplinkUrl=" + this.deeplinkUrl + ", clickCoordinatesEnabled=" + this.clickCoordinatesEnabled + ", adLoadOptimizationEnabled=" + this.adLoadOptimizationEnabled + ", templateHeartbeatCheck=" + this.templateHeartbeatCheck + ", info=" + this.info + ", sleep=" + this.sleep + ", errorCode=" + this.errorCode + ", tpat=" + this.tpat + ", vmURL=" + this.vmURL + ", adMarketId=" + this.adMarketId + ", notification=" + this.notification + ", loadAdUrls=" + this.loadAdUrls + ", viewAbility=" + this.viewAbility + ", templateURL=" + this.templateURL + ", templateType=" + this.templateType + ", templateSettings=" + this.templateSettings + ", creativeId=" + this.creativeId + ", advAppId=" + this.advAppId + ", showClose=" + this.showClose + ", showCloseIncentivized=" + this.showCloseIncentivized + ", adSizeInfo=" + this.adSizeInfo + ')';
        }

        public /* synthetic */ c(int i, String str, String str2, String str3, Integer num, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, Integer num2, Integer num3, @M9.h(with = h.class) Map map, String str6, String str7, List list, List list2, i iVar, String str8, String str9, g gVar, String str10, String str11, Integer num4, Integer num5, C0212b c0212b, x0 x0Var) {
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.adType = null;
            } else {
                this.adType = str2;
            }
            if ((i & 4) == 0) {
                this.adSource = null;
            } else {
                this.adSource = str3;
            }
            if ((i & 8) == 0) {
                this.expiry = null;
            } else {
                this.expiry = num;
            }
            if ((i & 16) == 0) {
                this.deeplinkUrl = null;
            } else {
                this.deeplinkUrl = str4;
            }
            if ((i & 32) == 0) {
                this.clickCoordinatesEnabled = null;
            } else {
                this.clickCoordinatesEnabled = bool;
            }
            if ((i & 64) == 0) {
                this.adLoadOptimizationEnabled = null;
            } else {
                this.adLoadOptimizationEnabled = bool2;
            }
            if ((i & 128) == 0) {
                this.templateHeartbeatCheck = null;
            } else {
                this.templateHeartbeatCheck = bool3;
            }
            if ((i & 256) == 0) {
                this.info = null;
            } else {
                this.info = str5;
            }
            if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
                this.sleep = null;
            } else {
                this.sleep = num2;
            }
            if ((i & 1024) == 0) {
                this.errorCode = null;
            } else {
                this.errorCode = num3;
            }
            if ((i & 2048) == 0) {
                this.tpat = null;
            } else {
                this.tpat = map;
            }
            if ((i & 4096) == 0) {
                this.vmURL = null;
            } else {
                this.vmURL = str6;
            }
            if ((i & 8192) == 0) {
                this.adMarketId = null;
            } else {
                this.adMarketId = str7;
            }
            if ((i & 16384) == 0) {
                this.notification = null;
            } else {
                this.notification = list;
            }
            if ((32768 & i) == 0) {
                this.loadAdUrls = null;
            } else {
                this.loadAdUrls = list2;
            }
            if ((65536 & i) == 0) {
                this.viewAbility = null;
            } else {
                this.viewAbility = iVar;
            }
            if ((131072 & i) == 0) {
                this.templateURL = null;
            } else {
                this.templateURL = str8;
            }
            if ((262144 & i) == 0) {
                this.templateType = null;
            } else {
                this.templateType = str9;
            }
            if ((524288 & i) == 0) {
                this.templateSettings = null;
            } else {
                this.templateSettings = gVar;
            }
            if ((1048576 & i) == 0) {
                this.creativeId = null;
            } else {
                this.creativeId = str10;
            }
            if ((2097152 & i) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str11;
            }
            this.showClose = (4194304 & i) == 0 ? 0 : num4;
            this.showCloseIncentivized = (8388608 & i) == 0 ? 0 : num5;
            if ((i & 16777216) == 0) {
                this.adSizeInfo = null;
            } else {
                this.adSizeInfo = c0212b;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(String str, String str2, String str3, Integer num, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, Integer num2, Integer num3, Map<String, ? extends List<String>> map, String str6, String str7, List<String> list, List<String> list2, i iVar, String str8, String str9, g gVar, String str10, String str11, Integer num4, Integer num5, C0212b c0212b) {
            this.id = str;
            this.adType = str2;
            this.adSource = str3;
            this.expiry = num;
            this.deeplinkUrl = str4;
            this.clickCoordinatesEnabled = bool;
            this.adLoadOptimizationEnabled = bool2;
            this.templateHeartbeatCheck = bool3;
            this.info = str5;
            this.sleep = num2;
            this.errorCode = num3;
            this.tpat = map;
            this.vmURL = str6;
            this.adMarketId = str7;
            this.notification = list;
            this.loadAdUrls = list2;
            this.viewAbility = iVar;
            this.templateURL = str8;
            this.templateType = str9;
            this.templateSettings = gVar;
            this.creativeId = str10;
            this.advAppId = str11;
            this.showClose = num4;
            this.showCloseIncentivized = num5;
            this.adSizeInfo = c0212b;
        }

        public static /* synthetic */ void getAdLoadOptimizationEnabled$annotations() {
        }

        public static /* synthetic */ void getAdMarketId$annotations() {
        }

        public static /* synthetic */ void getAdSizeInfo$annotations() {
        }

        public static /* synthetic */ void getAdSource$annotations() {
        }

        public static /* synthetic */ void getAdType$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
        }

        public static /* synthetic */ void getCreativeId$annotations() {
        }

        public static /* synthetic */ void getDeeplinkUrl$annotations() {
        }

        public static /* synthetic */ void getErrorCode$annotations() {
        }

        public static /* synthetic */ void getExpiry$annotations() {
        }

        public static /* synthetic */ void getId$annotations() {
        }

        public static /* synthetic */ void getInfo$annotations() {
        }

        public static /* synthetic */ void getLoadAdUrls$annotations() {
        }

        public static /* synthetic */ void getNotification$annotations() {
        }

        public static /* synthetic */ void getShowClose$annotations() {
        }

        public static /* synthetic */ void getShowCloseIncentivized$annotations() {
        }

        public static /* synthetic */ void getSleep$annotations() {
        }

        public static /* synthetic */ void getTemplateHeartbeatCheck$annotations() {
        }

        public static /* synthetic */ void getTemplateSettings$annotations() {
        }

        public static /* synthetic */ void getTemplateType$annotations() {
        }

        public static /* synthetic */ void getTemplateURL$annotations() {
        }

        @M9.h(with = h.class)
        public static /* synthetic */ void getTpat$annotations() {
        }

        public static /* synthetic */ void getViewAbility$annotations() {
        }

        public static /* synthetic */ void getVmURL$annotations() {
        }

        public /* synthetic */ c(String str, String str2, String str3, Integer num, String str4, Boolean bool, Boolean bool2, Boolean bool3, String str5, Integer num2, Integer num3, Map map, String str6, String str7, List list, List list2, i iVar, String str8, String str9, g gVar, String str10, String str11, Integer num4, Integer num5, C0212b c0212b, int i, kotlin.jvm.internal.g gVar2) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2, (i & 128) != 0 ? null : bool3, (i & 256) != 0 ? null : str5, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : num2, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : map, (i & 4096) != 0 ? null : str6, (i & 8192) != 0 ? null : str7, (i & 16384) != 0 ? null : list, (i & Constants.QUEUE_ELEMENT_MAX_SIZE) != 0 ? null : list2, (i & 65536) != 0 ? null : iVar, (i & 131072) != 0 ? null : str8, (i & 262144) != 0 ? null : str9, (i & 524288) != 0 ? null : gVar, (i & 1048576) != 0 ? null : str10, (i & 2097152) != 0 ? null : str11, (i & 4194304) != 0 ? 0 : num4, (i & 8388608) != 0 ? 0 : num5, (i & 16777216) != 0 ? null : c0212b);
        }
    }

    /* compiled from: AdPayload.kt */
    @M9.h
    /* renamed from: a6.b$d */
    public static final class d {
        public static final C0215b Companion = new C0215b(null);
        private final String extension;
        private final Boolean required;
        private final String url;

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$d$a */
        public static final class a implements H<d> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.AdPayload.CacheableReplacement", aVar, 3);
                c1547o0.k(ImagesContract.URL, true);
                c1547o0.k("extension", true);
                c1547o0.k("required", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                C0 c02 = C0.f11399a;
                return new M9.b[]{N9.a.b(c02), N9.a.b(c02), N9.a.b(C1532h.f11487a)};
            }

            @Override // M9.b
            public d deserialize(P9.d decoder) {
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
                        objG3 = bVarD.G(descriptor2, 2, C1532h.f11487a, objG3);
                        i |= 4;
                    }
                }
                bVarD.b(descriptor2);
                return new d(i, (String) objG, (String) objG2, (Boolean) objG3, (x0) null);
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

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$d$b, reason: collision with other inner class name */
        public static final class C0215b {
            public /* synthetic */ C0215b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<d> serializer() {
                return a.INSTANCE;
            }

            private C0215b() {
            }
        }

        public d() {
            this((String) null, (String) null, (Boolean) null, 7, (kotlin.jvm.internal.g) null);
        }

        public static /* synthetic */ d copy$default(d dVar, String str, String str2, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.url;
            }
            if ((i & 2) != 0) {
                str2 = dVar.extension;
            }
            if ((i & 4) != 0) {
                bool = dVar.required;
            }
            return dVar.copy(str, str2, bool);
        }

        public static final void write$Self(d self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || self.url != null) {
                output.w(serialDesc, 0, C0.f11399a, self.url);
            }
            if (output.F(serialDesc, 1) || self.extension != null) {
                output.w(serialDesc, 1, C0.f11399a, self.extension);
            }
            if (!output.F(serialDesc, 2) && self.required == null) {
                return;
            }
            output.w(serialDesc, 2, C1532h.f11487a, self.required);
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.extension;
        }

        public final Boolean component3() {
            return this.required;
        }

        public final d copy(String str, String str2, Boolean bool) {
            return new d(str, str2, bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.l.b(this.url, dVar.url) && kotlin.jvm.internal.l.b(this.extension, dVar.extension) && kotlin.jvm.internal.l.b(this.required, dVar.required);
        }

        public final String getExtension() {
            return this.extension;
        }

        public final Boolean getRequired() {
            return this.required;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.extension;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.required;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", required=" + this.required + ')';
        }

        public /* synthetic */ d(int i, String str, String str2, Boolean bool, x0 x0Var) {
            if ((i & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            if ((i & 2) == 0) {
                this.extension = null;
            } else {
                this.extension = str2;
            }
            if ((i & 4) == 0) {
                this.required = null;
            } else {
                this.required = bool;
            }
        }

        public d(String str, String str2, Boolean bool) {
            this.url = str;
            this.extension = str2;
            this.required = bool;
        }

        public /* synthetic */ d(String str, String str2, Boolean bool, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
        }
    }

    /* compiled from: AdPayload.kt */
    /* renamed from: a6.b$e */
    public static final class e {
        public /* synthetic */ e(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final M9.b<C1653b> serializer() {
            return a.INSTANCE;
        }

        private e() {
        }
    }

    /* compiled from: AdPayload.kt */
    @M9.h
    /* renamed from: a6.b$f */
    public static final class f {
        public static final C0216b Companion = new C0216b(null);
        private final c adMarkup;
        private final String placementReferenceId;

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$f$a */
        public static final class a implements H<f> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.AdPayload.PlacementAdUnit", aVar, 2);
                c1547o0.k("placement_reference_id", true);
                c1547o0.k("ad_markup", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                return new M9.b[]{N9.a.b(C0.f11399a), N9.a.b(c.a.INSTANCE)};
            }

            @Override // M9.b
            public f deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                x0 x0Var = null;
                boolean z10 = true;
                int i = 0;
                Object objG = null;
                Object objG2 = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        objG = bVarD.G(descriptor2, 0, C0.f11399a, objG);
                        i |= 1;
                    } else {
                        if (iX != 1) {
                            throw new n(iX);
                        }
                        objG2 = bVarD.G(descriptor2, 1, c.a.INSTANCE, objG2);
                        i |= 2;
                    }
                }
                bVarD.b(descriptor2);
                return new f(i, (String) objG, (c) objG2, x0Var);
            }

            @Override // M9.b
            public O9.e getDescriptor() {
                return descriptor;
            }

            @Override // M9.b
            public void serialize(P9.e encoder, f value) {
                kotlin.jvm.internal.l.f(encoder, "encoder");
                kotlin.jvm.internal.l.f(value, "value");
                O9.e descriptor2 = getDescriptor();
                P9.c cVarD = encoder.d(descriptor2);
                f.write$Self(value, cVarD, descriptor2);
                cVarD.b(descriptor2);
            }

            @Override // Q9.H
            public M9.b<?>[] typeParametersSerializers() {
                return C1549p0.f11523a;
            }
        }

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$f$b, reason: collision with other inner class name */
        public static final class C0216b {
            public /* synthetic */ C0216b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<f> serializer() {
                return a.INSTANCE;
            }

            private C0216b() {
            }
        }

        public f() {
            this((String) null, (c) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.g) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ f copy$default(f fVar, String str, c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fVar.placementReferenceId;
            }
            if ((i & 2) != 0) {
                cVar = fVar.adMarkup;
            }
            return fVar.copy(str, cVar);
        }

        public static final void write$Self(f self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || self.placementReferenceId != null) {
                output.w(serialDesc, 0, C0.f11399a, self.placementReferenceId);
            }
            if (!output.F(serialDesc, 1) && self.adMarkup == null) {
                return;
            }
            output.w(serialDesc, 1, c.a.INSTANCE, self.adMarkup);
        }

        public final String component1() {
            return this.placementReferenceId;
        }

        public final c component2() {
            return this.adMarkup;
        }

        public final f copy(String str, c cVar) {
            return new f(str, cVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return kotlin.jvm.internal.l.b(this.placementReferenceId, fVar.placementReferenceId) && kotlin.jvm.internal.l.b(this.adMarkup, fVar.adMarkup);
        }

        public final c getAdMarkup() {
            return this.adMarkup;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public int hashCode() {
            String str = this.placementReferenceId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            c cVar = this.adMarkup;
            return iHashCode + (cVar != null ? cVar.hashCode() : 0);
        }

        public String toString() {
            return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ')';
        }

        public /* synthetic */ f(int i, String str, c cVar, x0 x0Var) {
            if ((i & 1) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str;
            }
            if ((i & 2) == 0) {
                this.adMarkup = null;
            } else {
                this.adMarkup = cVar;
            }
        }

        public f(String str, c cVar) {
            this.placementReferenceId = str;
            this.adMarkup = cVar;
        }

        public /* synthetic */ f(String str, c cVar, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : cVar);
        }

        public static /* synthetic */ void getAdMarkup$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }
    }

    /* compiled from: AdPayload.kt */
    @M9.h
    /* renamed from: a6.b$g */
    public static final class g {
        public static final C0217b Companion = new C0217b(null);
        private final Map<String, d> cacheableReplacements;
        private final Map<String, String> normalReplacements;

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$g$a */
        public static final class a implements H<g> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.AdPayload.TemplateSettings", aVar, 2);
                c1547o0.k("normal_replacements", true);
                c1547o0.k("cacheable_replacements", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                C0 c02 = C0.f11399a;
                return new M9.b[]{N9.a.b(new U(c02, c02)), N9.a.b(new U(c02, d.a.INSTANCE))};
            }

            @Override // M9.b
            public g deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                x0 x0Var = null;
                boolean z10 = true;
                int i = 0;
                Object objG = null;
                Object objG2 = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        C0 c02 = C0.f11399a;
                        objG = bVarD.G(descriptor2, 0, new U(c02, c02), objG);
                        i |= 1;
                    } else {
                        if (iX != 1) {
                            throw new n(iX);
                        }
                        objG2 = bVarD.G(descriptor2, 1, new U(C0.f11399a, d.a.INSTANCE), objG2);
                        i |= 2;
                    }
                }
                bVarD.b(descriptor2);
                return new g(i, (Map) objG, (Map) objG2, x0Var);
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

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$g$b, reason: collision with other inner class name */
        public static final class C0217b {
            public /* synthetic */ C0217b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<g> serializer() {
                return a.INSTANCE;
            }

            private C0217b() {
            }
        }

        public g() {
            this((Map) null, (Map) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.g) (0 == true ? 1 : 0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ g copy$default(g gVar, Map map, Map map2, int i, Object obj) {
            if ((i & 1) != 0) {
                map = gVar.normalReplacements;
            }
            if ((i & 2) != 0) {
                map2 = gVar.cacheableReplacements;
            }
            return gVar.copy(map, map2);
        }

        public static final void write$Self(g self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || self.normalReplacements != null) {
                C0 c02 = C0.f11399a;
                output.w(serialDesc, 0, new U(c02, c02), self.normalReplacements);
            }
            if (!output.F(serialDesc, 1) && self.cacheableReplacements == null) {
                return;
            }
            output.w(serialDesc, 1, new U(C0.f11399a, d.a.INSTANCE), self.cacheableReplacements);
        }

        public final Map<String, String> component1() {
            return this.normalReplacements;
        }

        public final Map<String, d> component2() {
            return this.cacheableReplacements;
        }

        public final g copy(Map<String, String> map, Map<String, d> map2) {
            return new g(map, map2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return kotlin.jvm.internal.l.b(this.normalReplacements, gVar.normalReplacements) && kotlin.jvm.internal.l.b(this.cacheableReplacements, gVar.cacheableReplacements);
        }

        public final Map<String, d> getCacheableReplacements() {
            return this.cacheableReplacements;
        }

        public final Map<String, String> getNormalReplacements() {
            return this.normalReplacements;
        }

        public int hashCode() {
            Map<String, String> map = this.normalReplacements;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, d> map2 = this.cacheableReplacements;
            return iHashCode + (map2 != null ? map2.hashCode() : 0);
        }

        public String toString() {
            return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ')';
        }

        public /* synthetic */ g(int i, Map map, Map map2, x0 x0Var) {
            if ((i & 1) == 0) {
                this.normalReplacements = null;
            } else {
                this.normalReplacements = map;
            }
            if ((i & 2) == 0) {
                this.cacheableReplacements = null;
            } else {
                this.cacheableReplacements = map2;
            }
        }

        public g(Map<String, String> map, Map<String, d> map2) {
            this.normalReplacements = map;
            this.cacheableReplacements = map2;
        }

        public /* synthetic */ g(Map map, Map map2, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2);
        }

        public static /* synthetic */ void getCacheableReplacements$annotations() {
        }

        public static /* synthetic */ void getNormalReplacements$annotations() {
        }
    }

    /* compiled from: AdPayload.kt */
    /* renamed from: a6.b$h */
    public static final class h extends E<Map<String, ? extends List<? extends String>>> {
        public static final h INSTANCE = new h();

        private h() {
            super(N9.a.a(new C1526e(C0.f11399a)));
        }

        @Override // R9.E
        public R9.i transformDeserialize(R9.i element) {
            kotlin.jvm.internal.l.f(element, "element");
            M m10 = R9.j.f11806a;
            z zVar = element instanceof z ? (z) element : null;
            if (zVar == null) {
                R9.j.c(element, "JsonObject");
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, R9.i> entry : zVar.f11826b.entrySet()) {
                if (!kotlin.jvm.internal.l.b(entry.getKey(), "moat")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new z(linkedHashMap);
        }
    }

    /* compiled from: AdPayload.kt */
    @M9.h
    /* renamed from: a6.b$i */
    public static final class i {
        public static final C0218b Companion = new C0218b(null);
        private final j om;

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$i$a */
        public static final class a implements H<i> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.AdPayload.ViewAbility", aVar, 1);
                c1547o0.k("om", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                return new M9.b[]{N9.a.b(j.a.INSTANCE)};
            }

            @Override // M9.b
            public i deserialize(P9.d decoder) {
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
                        objG = bVarD.G(descriptor2, 0, j.a.INSTANCE, objG);
                        i = 1;
                    }
                }
                bVarD.b(descriptor2);
                return new i(i, (j) objG, x0Var);
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

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$i$b, reason: collision with other inner class name */
        public static final class C0218b {
            public /* synthetic */ C0218b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<i> serializer() {
                return a.INSTANCE;
            }

            private C0218b() {
            }
        }

        public i() {
            this((j) null, 1, (kotlin.jvm.internal.g) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ i copy$default(i iVar, j jVar, int i, Object obj) {
            if ((i & 1) != 0) {
                jVar = iVar.om;
            }
            return iVar.copy(jVar);
        }

        public static final void write$Self(i self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (!output.F(serialDesc, 0) && self.om == null) {
                return;
            }
            output.w(serialDesc, 0, j.a.INSTANCE, self.om);
        }

        public final j component1() {
            return this.om;
        }

        public final i copy(j jVar) {
            return new i(jVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && kotlin.jvm.internal.l.b(this.om, ((i) obj).om);
        }

        public final j getOm() {
            return this.om;
        }

        public int hashCode() {
            j jVar = this.om;
            if (jVar == null) {
                return 0;
            }
            return jVar.hashCode();
        }

        public String toString() {
            return "ViewAbility(om=" + this.om + ')';
        }

        public /* synthetic */ i(int i, j jVar, x0 x0Var) {
            if ((i & 1) == 0) {
                this.om = null;
            } else {
                this.om = jVar;
            }
        }

        public i(j jVar) {
            this.om = jVar;
        }

        public /* synthetic */ i(j jVar, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : jVar);
        }
    }

    /* compiled from: AdPayload.kt */
    @M9.h
    /* renamed from: a6.b$j */
    public static final class j {
        public static final C0219b Companion = new C0219b(null);
        private final String extraVast;
        private final Boolean isEnabled;

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$j$a */
        public static final class a implements H<j> {
            public static final a INSTANCE;
            public static final /* synthetic */ O9.e descriptor;

            static {
                a aVar = new a();
                INSTANCE = aVar;
                C1547o0 c1547o0 = new C1547o0("com.vungle.ads.internal.model.AdPayload.ViewAbilityInfo", aVar, 2);
                c1547o0.k("is_enabled", true);
                c1547o0.k("extra_vast", true);
                descriptor = c1547o0;
            }

            private a() {
            }

            @Override // Q9.H
            public M9.b<?>[] childSerializers() {
                return new M9.b[]{N9.a.b(C1532h.f11487a), N9.a.b(C0.f11399a)};
            }

            @Override // M9.b
            public j deserialize(P9.d decoder) {
                kotlin.jvm.internal.l.f(decoder, "decoder");
                O9.e descriptor2 = getDescriptor();
                P9.b bVarD = decoder.d(descriptor2);
                x0 x0Var = null;
                boolean z10 = true;
                int i = 0;
                Object objG = null;
                Object objG2 = null;
                while (z10) {
                    int iX = bVarD.x(descriptor2);
                    if (iX == -1) {
                        z10 = false;
                    } else if (iX == 0) {
                        objG = bVarD.G(descriptor2, 0, C1532h.f11487a, objG);
                        i |= 1;
                    } else {
                        if (iX != 1) {
                            throw new n(iX);
                        }
                        objG2 = bVarD.G(descriptor2, 1, C0.f11399a, objG2);
                        i |= 2;
                    }
                }
                bVarD.b(descriptor2);
                return new j(i, (Boolean) objG, (String) objG2, x0Var);
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

        /* compiled from: AdPayload.kt */
        /* renamed from: a6.b$j$b, reason: collision with other inner class name */
        public static final class C0219b {
            public /* synthetic */ C0219b(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final M9.b<j> serializer() {
                return a.INSTANCE;
            }

            private C0219b() {
            }
        }

        public j() {
            this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.g) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ j copy$default(j jVar, Boolean bool, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = jVar.isEnabled;
            }
            if ((i & 2) != 0) {
                str = jVar.extraVast;
            }
            return jVar.copy(bool, str);
        }

        public static final void write$Self(j self, P9.c output, O9.e serialDesc) {
            kotlin.jvm.internal.l.f(self, "self");
            kotlin.jvm.internal.l.f(output, "output");
            kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
            if (output.F(serialDesc, 0) || self.isEnabled != null) {
                output.w(serialDesc, 0, C1532h.f11487a, self.isEnabled);
            }
            if (!output.F(serialDesc, 1) && self.extraVast == null) {
                return;
            }
            output.w(serialDesc, 1, C0.f11399a, self.extraVast);
        }

        public final Boolean component1() {
            return this.isEnabled;
        }

        public final String component2() {
            return this.extraVast;
        }

        public final j copy(Boolean bool, String str) {
            return new j(bool, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return kotlin.jvm.internal.l.b(this.isEnabled, jVar.isEnabled) && kotlin.jvm.internal.l.b(this.extraVast, jVar.extraVast);
        }

        public final String getExtraVast() {
            return this.extraVast;
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.extraVast;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("ViewAbilityInfo(isEnabled=");
            sb.append(this.isEnabled);
            sb.append(", extraVast=");
            return B8.j(sb, this.extraVast, ')');
        }

        public /* synthetic */ j(int i, Boolean bool, String str, x0 x0Var) {
            if ((i & 1) == 0) {
                this.isEnabled = null;
            } else {
                this.isEnabled = bool;
            }
            if ((i & 2) == 0) {
                this.extraVast = null;
            } else {
                this.extraVast = str;
            }
        }

        public j(Boolean bool, String str) {
            this.isEnabled = bool;
            this.extraVast = str;
        }

        public /* synthetic */ j(Boolean bool, String str, int i, kotlin.jvm.internal.g gVar) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
        }

        public static /* synthetic */ void getExtraVast$annotations() {
        }

        public static /* synthetic */ void isEnabled$annotations() {
        }
    }

    /* compiled from: Comparisons.kt */
    /* renamed from: a6.b$k */
    public static final class k<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return com.google.gson.internal.c.g(Boolean.valueOf(((C1652a) t11).isRequired()), Boolean.valueOf(((C1652a) t10).isRequired()));
        }
    }

    public C1653b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    private final String complexReplace(String input, String str, String str2) {
        String strQuote = Pattern.quote(str);
        kotlin.jvm.internal.l.e(strQuote, "quote(oldValue)");
        Pattern patternCompile = Pattern.compile(strQuote);
        kotlin.jvm.internal.l.e(patternCompile, "compile(...)");
        String replacement = valueOrEmpty(str2);
        kotlin.jvm.internal.l.f(input, "input");
        kotlin.jvm.internal.l.f(replacement, "replacement");
        String strReplaceAll = patternCompile.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.l.e(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    private final f getAd() {
        List<f> list = this.ads;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    private final c getAdMarkup() {
        f ad = getAd();
        if (ad != null) {
            return ad.getAdMarkup();
        }
        return null;
    }

    public static /* synthetic */ List getTpatUrls$default(C1653b c1653b, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return c1653b.getTpatUrls(str, str2, str3);
    }

    private final String valueOrEmpty(String str) {
        return str == null ? "" : str;
    }

    public static final void write$Self(C1653b self, P9.c output, O9.e serialDesc) {
        kotlin.jvm.internal.l.f(self, "self");
        kotlin.jvm.internal.l.f(output, "output");
        kotlin.jvm.internal.l.f(serialDesc, "serialDesc");
        if (output.F(serialDesc, 0) || self.ads != null) {
            output.w(serialDesc, 0, new C1526e(f.a.INSTANCE), self.ads);
        }
        if (output.F(serialDesc, 1) || self.config != null) {
            output.w(serialDesc, 1, C1658g.a.INSTANCE, self.config);
        }
        if (output.F(serialDesc, 2) || !kotlin.jvm.internal.l.b(self.mraidFiles, new ConcurrentHashMap())) {
            kotlin.jvm.internal.e eVarA = x.a(ConcurrentHashMap.class);
            C0 c02 = C0.f11399a;
            output.y(serialDesc, 2, new M9.a(eVarA, new M9.b[]{c02, c02}), self.mraidFiles);
        }
        if (output.F(serialDesc, 3) || !kotlin.jvm.internal.l.b(self.incentivizedTextSettings, new HashMap())) {
            C0 c03 = C0.f11399a;
            output.y(serialDesc, 3, new U(c03, c03), self.incentivizedTextSettings);
        }
        if (output.F(serialDesc, 4) || self.assetsFullyDownloaded) {
            output.B(serialDesc, 4, self.assetsFullyDownloaded);
        }
    }

    public final int adHeight() {
        C0212b adSizeInfo;
        Integer height;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (height = adSizeInfo.getHeight()) == null) {
            return 0;
        }
        return height.intValue();
    }

    public final boolean adLoadOptimizationEnabled() {
        Boolean adLoadOptimizationEnabled;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (adLoadOptimizationEnabled = adMarkup.getAdLoadOptimizationEnabled()) == null) {
            return true;
        }
        return adLoadOptimizationEnabled.booleanValue();
    }

    public final c adUnit() {
        return getAdMarkup();
    }

    public final int adWidth() {
        C0212b adSizeInfo;
        Integer width;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (adSizeInfo = adMarkup.getAdSizeInfo()) == null || (width = adSizeInfo.getWidth()) == null) {
            return 0;
        }
        return width.intValue();
    }

    public final String advAppId() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    public final C1658g config() {
        return this.config;
    }

    public final z createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        A a10 = new A();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
            B.u(a10, entry.getKey(), entry.getValue());
        }
        return a10.a();
    }

    public final String eventId() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    public final C4045c getAdConfig() {
        return this.adConfig;
    }

    public final File getAssetDirectory() {
        return this.assetDirectory;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    public final String getCreativeId() {
        String creativeId;
        c adMarkup = getAdMarkup();
        return (adMarkup == null || (creativeId = adMarkup.getCreativeId()) == null) ? "unknown" : creativeId;
    }

    public final List<C1652a> getDownloadableAssets(File dir) {
        g templateSettings;
        Map<String, d> cacheableReplacements;
        String templateURL;
        String vmURL;
        kotlin.jvm.internal.l.f(dir, "dir");
        this.assetDirectory = dir;
        ArrayList arrayList = new ArrayList();
        if (!isNativeTemplateType()) {
            c adMarkup = getAdMarkup();
            if (adMarkup == null || (vmURL = adMarkup.getVmURL()) == null) {
                c adMarkup2 = getAdMarkup();
                if (adMarkup2 != null && (templateURL = adMarkup2.getTemplateURL()) != null && com.vungle.ads.internal.util.f.INSTANCE.isValidUrl(templateURL)) {
                    String filePath = new File(dir, KEY_TEMPLATE).getAbsolutePath();
                    kotlin.jvm.internal.l.e(filePath, "filePath");
                    arrayList.add(new C1652a(KEY_TEMPLATE, templateURL, filePath, C1652a.EnumC0211a.ZIP, true));
                }
            } else if (com.vungle.ads.internal.util.f.INSTANCE.isValidUrl(vmURL)) {
                String filePath2 = new File(dir, com.vungle.ads.internal.g.AD_INDEX_FILE_NAME).getAbsolutePath();
                kotlin.jvm.internal.l.e(filePath2, "filePath");
                arrayList.add(new C1652a(KEY_VM, vmURL, filePath2, C1652a.EnumC0211a.ASSET, true));
            }
        }
        c adMarkup3 = getAdMarkup();
        if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, d> entry : cacheableReplacements.entrySet()) {
                d value = entry.getValue();
                if (value.getUrl() != null) {
                    com.vungle.ads.internal.util.f fVar = com.vungle.ads.internal.util.f.INSTANCE;
                    if (fVar.isValidUrl(value.getUrl())) {
                        Boolean required = value.getRequired();
                        boolean zBooleanValue = (!isNativeTemplateType() && adLoadOptimizationEnabled()) ? !com.vungle.ads.internal.f.INSTANCE.isCacheableAssetsRequired() ? false : required != null ? required.booleanValue() : false : true;
                        String filePath3 = new File(dir, fVar.guessFileName(value.getUrl(), value.getExtension())).getAbsolutePath();
                        String key = entry.getKey();
                        String url = value.getUrl();
                        kotlin.jvm.internal.l.e(filePath3, "filePath");
                        arrayList.add(new C1652a(key, url, filePath3, C1652a.EnumC0211a.ASSET, zBooleanValue));
                    }
                }
            }
        }
        if (arrayList.size() > 1) {
            C2095p.i0(arrayList, new k());
        }
        return arrayList;
    }

    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    public final Map<String, String> getMRAIDArgsInMap() {
        g templateSettings;
        Map<String, d> cacheableReplacements;
        g templateSettings2;
        Map<String, String> normalReplacements;
        c adMarkup = getAdMarkup();
        if ((adMarkup != null ? adMarkup.getTemplateSettings() : null) == null) {
            throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings2.getNormalReplacements()) != null) {
            linkedHashMap.putAll(normalReplacements);
        }
        c adMarkup3 = getAdMarkup();
        if (adMarkup3 != null && (templateSettings = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, d> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url != null) {
                    linkedHashMap.put(entry.getKey(), url);
                }
            }
        }
        if (!this.mraidFiles.isEmpty()) {
            linkedHashMap.putAll(this.mraidFiles);
        }
        if (!this.incentivizedTextSettings.isEmpty()) {
            linkedHashMap.putAll(this.incentivizedTextSettings);
        }
        return linkedHashMap;
    }

    public final int getShowCloseDelay(Boolean bool) {
        Integer showClose;
        int iIntValue;
        Integer showCloseIncentivized;
        if (kotlin.jvm.internal.l.b(bool, Boolean.TRUE)) {
            c adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            iIntValue = showCloseIncentivized.intValue();
        } else {
            c adMarkup2 = getAdMarkup();
            if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
                return 0;
            }
            iIntValue = showClose.intValue();
        }
        return iIntValue * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List<String> getTpatUrls(String event, String str, String str2) {
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        kotlin.jvm.internal.l.f(event, "event");
        c adMarkup = getAdMarkup();
        if (adMarkup != null && (tpat2 = adMarkup.getTpat()) != null && !tpat2.containsKey(event)) {
            C4055m.INSTANCE.logError$vungle_ads_release(128, "Arbitrary tpat key: ".concat(event), placementId(), getCreativeId(), eventId());
            return null;
        }
        c adMarkup2 = getAdMarkup();
        List<String> list = (adMarkup2 == null || (tpat = adMarkup2.getTpat()) == null) ? null : tpat.get(event);
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            C4055m.INSTANCE.logError$vungle_ads_release(129, "Empty tpat key: ".concat(event), placementId(), getCreativeId(), eventId());
            return null;
        }
        switch (event.hashCode()) {
            case -2125915830:
                if (event.equals(com.vungle.ads.internal.g.CHECKPOINT_0)) {
                    List<String> list3 = list;
                    ArrayList arrayList = new ArrayList(C2092m.T(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(complexReplace(complexReplace(complexReplace((String) it.next(), com.vungle.ads.internal.g.REMOTE_PLAY_KEY, String.valueOf(!this.assetsFullyDownloaded)), com.vungle.ads.internal.g.NETWORK_OPERATOR_KEY, str), com.vungle.ads.internal.g.DEVICE_VOLUME_KEY, str2));
                    }
                    return arrayList;
                }
                return list;
            case -132489083:
                if (event.equals(com.vungle.ads.internal.g.AD_LOAD_DURATION_TPAT_KEY)) {
                    List<String> list4 = list;
                    ArrayList arrayList2 = new ArrayList(C2092m.T(list4, 10));
                    Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(complexReplace((String) it2.next(), com.vungle.ads.internal.g.AD_LOAD_DURATION_KEY, str));
                    }
                    return arrayList2;
                }
                return list;
            case 1516630125:
                if (event.equals(com.vungle.ads.internal.g.AD_CLOSE_TPAT_KEY)) {
                    List<String> list5 = list;
                    ArrayList arrayList3 = new ArrayList(C2092m.T(list5, 10));
                    Iterator<T> it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(complexReplace(complexReplace((String) it3.next(), com.vungle.ads.internal.g.AD_DURATION_KEY, str), com.vungle.ads.internal.g.DEVICE_VOLUME_KEY, str2));
                    }
                    return arrayList3;
                }
                return list;
            case 1940309120:
                if (event.equals(com.vungle.ads.internal.g.DEEPLINK_CLICK)) {
                    List<String> list6 = list;
                    ArrayList arrayList4 = new ArrayList(C2092m.T(list6, 10));
                    Iterator<T> it4 = list6.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(complexReplace((String) it4.next(), com.vungle.ads.internal.g.DEEPLINK_SUCCESS_KEY, str));
                    }
                    return arrayList4;
                }
                return list;
            default:
                return list;
        }
    }

    public final List<String> getWinNotifications() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final boolean hasExpired() {
        Integer expiry;
        c adMarkup = getAdMarkup();
        return (adMarkup == null || (expiry = adMarkup.getExpiry()) == null || ((long) expiry.intValue()) >= System.currentTimeMillis() / 1000) ? false : true;
    }

    public final boolean heartbeatEnabled() {
        Boolean templateHeartbeatCheck;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (templateHeartbeatCheck = adMarkup.getTemplateHeartbeatCheck()) == null) {
            return false;
        }
        return templateHeartbeatCheck.booleanValue();
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) == null) {
            return false;
        }
        return clickCoordinatesEnabled.booleanValue();
    }

    public final boolean isCriticalAsset(String failingUrl) {
        g templateSettings;
        Map<String, d> cacheableReplacements;
        kotlin.jvm.internal.l.f(failingUrl, "failingUrl");
        if (!isNativeTemplateType()) {
            c adMarkup = getAdMarkup();
            if (kotlin.jvm.internal.l.b(adMarkup != null ? adMarkup.getTemplateURL() : null, failingUrl)) {
                return true;
            }
        }
        c adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (templateSettings = adMarkup2.getTemplateSettings()) == null || (cacheableReplacements = templateSettings.getCacheableReplacements()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, d> entry : cacheableReplacements.entrySet()) {
            if (kotlin.jvm.internal.l.b(entry.getValue().getUrl(), failingUrl)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return !linkedHashMap.isEmpty();
    }

    public final boolean isNativeTemplateType() {
        return kotlin.jvm.internal.l.b(templateType(), "native");
    }

    public final boolean omEnabled() {
        i viewAbility;
        j om;
        Boolean boolIsEnabled;
        c adMarkup = getAdMarkup();
        if (adMarkup == null || (viewAbility = adMarkup.getViewAbility()) == null || (om = viewAbility.getOm()) == null || (boolIsEnabled = om.isEnabled()) == null) {
            return false;
        }
        return boolIsEnabled.booleanValue();
    }

    public final String placementId() {
        f ad = getAd();
        if (ad != null) {
            return ad.getPlacementReferenceId();
        }
        return null;
    }

    public final void setAdConfig(C4045c c4045c) {
        this.adConfig = c4045c;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final void setAssetsFullyDownloaded(boolean z10) {
        this.assetsFullyDownloaded = z10;
    }

    public final void setIncentivizedText(String title, String body, String keepWatching, String close) {
        kotlin.jvm.internal.l.f(title, "title");
        kotlin.jvm.internal.l.f(body, "body");
        kotlin.jvm.internal.l.f(keepWatching, "keepWatching");
        kotlin.jvm.internal.l.f(close, "close");
        if (title.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, title);
        }
        if (body.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, body);
        }
        if (keepWatching.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, keepWatching);
        }
        if (close.length() > 0) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, close);
        }
    }

    public final void setIncentivizedTextSettings(Map<String, String> map) {
        kotlin.jvm.internal.l.f(map, "<set-?>");
        this.incentivizedTextSettings = map;
    }

    public final String templateType() {
        c adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public final synchronized void updateAdAssetPath(C1652a c1652a) {
        if (c1652a != null) {
            if (!KEY_TEMPLATE.equals(c1652a.getAdIdentifier())) {
                File file = new File(c1652a.getLocalPath());
                if (file.exists()) {
                    String adIdentifier = c1652a.getAdIdentifier();
                    this.mraidFiles.put(adIdentifier, FILE_SCHEME + file.getPath());
                }
            }
        }
    }

    public /* synthetic */ C1653b(int i10, List list, C1658g c1658g, ConcurrentHashMap concurrentHashMap, Map map, boolean z10, x0 x0Var) {
        if ((i10 & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i10 & 2) == 0) {
            this.config = null;
        } else {
            this.config = c1658g;
        }
        if ((i10 & 4) == 0) {
            this.mraidFiles = new ConcurrentHashMap<>();
        } else {
            this.mraidFiles = concurrentHashMap;
        }
        if ((i10 & 8) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map;
        }
        if ((i10 & 16) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z10;
        }
        this.adConfig = null;
        this.assetDirectory = null;
    }

    public C1653b(List<f> list, C1658g c1658g) {
        this.ads = list;
        this.config = c1658g;
        this.mraidFiles = new ConcurrentHashMap<>();
        this.incentivizedTextSettings = new HashMap();
    }

    public /* synthetic */ C1653b(List list, C1658g c1658g, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : c1658g);
    }

    public static /* synthetic */ void getAdConfig$annotations() {
    }

    private static /* synthetic */ void getAds$annotations() {
    }

    public static /* synthetic */ void getAssetDirectory$annotations() {
    }

    private static /* synthetic */ void getConfig$annotations() {
    }

    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    private static /* synthetic */ void getMraidFiles$annotations() {
    }
}
