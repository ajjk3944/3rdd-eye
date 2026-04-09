package Xb;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: z, reason: collision with root package name */
    public static final b f24240z = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f24241a;

    /* renamed from: b, reason: collision with root package name */
    private final long f24242b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24243c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f24244d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f24245e;

    /* renamed from: f, reason: collision with root package name */
    private final Long f24246f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f24247g;

    /* renamed from: h, reason: collision with root package name */
    private final Long f24248h;

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f24249i;

    /* renamed from: j, reason: collision with root package name */
    private final String f24250j;

    /* renamed from: k, reason: collision with root package name */
    private final String f24251k;

    /* renamed from: l, reason: collision with root package name */
    private final String f24252l;

    /* renamed from: m, reason: collision with root package name */
    private final String f24253m;

    /* renamed from: n, reason: collision with root package name */
    private final String f24254n;

    /* renamed from: o, reason: collision with root package name */
    private final String f24255o;

    /* renamed from: p, reason: collision with root package name */
    private final String f24256p;

    /* renamed from: q, reason: collision with root package name */
    private final Integer f24257q;

    /* renamed from: r, reason: collision with root package name */
    private final Integer f24258r;

    /* renamed from: s, reason: collision with root package name */
    private final String f24259s;

    /* renamed from: t, reason: collision with root package name */
    private final String f24260t;

    /* renamed from: u, reason: collision with root package name */
    private final Integer f24261u;

    /* renamed from: v, reason: collision with root package name */
    private final String f24262v;

    /* renamed from: w, reason: collision with root package name */
    private final String f24263w;

    /* renamed from: x, reason: collision with root package name */
    private final String f24264x;

    /* renamed from: y, reason: collision with root package name */
    private final String f24265y;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a PHONE_IOS = new a("PHONE_IOS", 0);
        public static final a PHONE_ANDROID = new a("PHONE_ANDROID", 1);
        public static final a TABLE_IOS = new a("TABLE_IOS", 2);
        public static final a TABLET_ANDROID = new a("TABLET_ANDROID", 3);

        private static final /* synthetic */ a[] $values() {
            return new a[]{PHONE_IOS, PHONE_ANDROID, TABLE_IOS, TABLET_ANDROID};
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

    public static final class b {

        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f24266a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f24267b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ int[] f24268c;

            static {
                int[] iArr = new int[d.values().length];
                try {
                    iArr[d.INTERNET.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d.LOCAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d.APP_TO_APP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[d.CONSOLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f24266a = iArr;
                int[] iArr2 = new int[EnumC0918c.values().length];
                try {
                    iArr2[EnumC0918c.INTERNET.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[EnumC0918c.INTERNET_ISP.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[EnumC0918c.LOCAL_SERVER.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[EnumC0918c.WIFIMAN_APP.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                f24267b = iArr2;
                int[] iArr3 = new int[a.values().length];
                try {
                    iArr3[a.PHONE_IOS.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[a.PHONE_ANDROID.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[a.TABLE_IOS.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[a.TABLET_ANDROID.ordinal()] = 4;
                } catch (NoSuchFieldError unused12) {
                }
                f24268c = iArr3;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final a g(String str) {
            switch (str.hashCode()) {
                case -1907261346:
                    if (str.equals("PHONE_ANDROID")) {
                        return a.PHONE_ANDROID;
                    }
                    break;
                case -570436234:
                    if (str.equals("TABLET_ANDROID")) {
                        return a.TABLET_ANDROID;
                    }
                    break;
                case 799344604:
                    if (str.equals("TABLE_IOS")) {
                        return a.TABLE_IOS;
                    }
                    break;
                case 1758869884:
                    if (str.equals("PHONE_IOS")) {
                        return a.PHONE_IOS;
                    }
                    break;
            }
            throw new IllegalStateException("unknown App2AppServerType type `" + str + "`");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String h(a aVar) {
            int i10 = a.f24268c[aVar.ordinal()];
            if (i10 == 1) {
                return "PHONE_IOS";
            }
            if (i10 == 2) {
                return "PHONE_ANDROID";
            }
            if (i10 == 3) {
                return "TABLE_IOS";
            }
            if (i10 == 4) {
                return "TABLET_ANDROID";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String i(EnumC0918c enumC0918c) {
            int i10 = a.f24267b[enumC0918c.ordinal()];
            if (i10 == 1) {
                return "internet";
            }
            if (i10 == 2) {
                return "internet_isp";
            }
            if (i10 == 3) {
                return "local";
            }
            if (i10 == 4) {
                return "app2app";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String j(d dVar) {
            int i10 = a.f24266a[dVar.ordinal()];
            if (i10 == 1) {
                return "internet";
            }
            if (i10 == 2) {
                return "localNetwork";
            }
            if (i10 == 3) {
                return "local";
            }
            if (i10 == 4) {
                return "console";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final EnumC0918c k(String str) {
            switch (str.hashCode()) {
                case -794970544:
                    if (str.equals("app2app")) {
                        return EnumC0918c.WIFIMAN_APP;
                    }
                    break;
                case 42272392:
                    if (str.equals("internet_isp")) {
                        return EnumC0918c.INTERNET_ISP;
                    }
                    break;
                case 103145323:
                    if (str.equals("local")) {
                        return EnumC0918c.LOCAL_SERVER;
                    }
                    break;
                case 570410817:
                    if (str.equals("internet")) {
                        return EnumC0918c.INTERNET;
                    }
                    break;
            }
            throw new IllegalStateException("unknown speedtest type `" + str + "`");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final d l(String str) {
            switch (str.hashCode()) {
                case 103145323:
                    if (str.equals("local")) {
                        return d.APP_TO_APP;
                    }
                    break;
                case 411628611:
                    if (str.equals("localNetwork")) {
                        return d.LOCAL;
                    }
                    break;
                case 570410817:
                    if (str.equals("internet")) {
                        return d.INTERNET;
                    }
                    break;
                case 951510359:
                    if (str.equals("console")) {
                        return d.CONSOLE;
                    }
                    break;
            }
            throw new IllegalStateException("unknown speedtest type `" + str + "`");
        }

        private b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Xb.c$c, reason: collision with other inner class name */
    public static final class EnumC0918c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC0918c[] $VALUES;
        public static final EnumC0918c INTERNET = new EnumC0918c("INTERNET", 0);
        public static final EnumC0918c INTERNET_ISP = new EnumC0918c("INTERNET_ISP", 1);
        public static final EnumC0918c LOCAL_SERVER = new EnumC0918c("LOCAL_SERVER", 2);
        public static final EnumC0918c WIFIMAN_APP = new EnumC0918c("WIFIMAN_APP", 3);

        private static final /* synthetic */ EnumC0918c[] $values() {
            return new EnumC0918c[]{INTERNET, INTERNET_ISP, LOCAL_SERVER, WIFIMAN_APP};
        }

        static {
            EnumC0918c[] enumC0918cArr$values = $values();
            $VALUES = enumC0918cArr$values;
            $ENTRIES = AbstractC5827b.a(enumC0918cArr$values);
        }

        private EnumC0918c(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC0918c valueOf(String str) {
            return (EnumC0918c) Enum.valueOf(EnumC0918c.class, str);
        }

        public static EnumC0918c[] values() {
            return (EnumC0918c[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d INTERNET = new d("INTERNET", 0);
        public static final d LOCAL = new d("LOCAL", 1);
        public static final d APP_TO_APP = new d("APP_TO_APP", 2);
        public static final d CONSOLE = new d("CONSOLE", 3);

        private static final /* synthetic */ d[] $values() {
            return new d[]{INTERNET, LOCAL, APP_TO_APP, CONSOLE};
        }

        static {
            d[] dVarArr$values = $values();
            $VALUES = dVarArr$values;
            $ENTRIES = AbstractC5827b.a(dVarArr$values);
        }

        private d(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    public c(long j10, long j11, String typeId, Integer num, Integer num2, Long l10, ArrayList arrayList, Long l11, ArrayList arrayList2, String endpointTypeId, String serverIP, String str, String str2, String str3, String str4, String str5, Integer num3, Integer num4, String str6, String str7, Integer num5, String str8, String str9, String str10, String str11) {
        AbstractC6492s.i(typeId, "typeId");
        AbstractC6492s.i(endpointTypeId, "endpointTypeId");
        AbstractC6492s.i(serverIP, "serverIP");
        this.f24241a = j10;
        this.f24242b = j11;
        this.f24243c = typeId;
        this.f24244d = num;
        this.f24245e = num2;
        this.f24246f = l10;
        this.f24247g = arrayList;
        this.f24248h = l11;
        this.f24249i = arrayList2;
        this.f24250j = endpointTypeId;
        this.f24251k = serverIP;
        this.f24252l = str;
        this.f24253m = str2;
        this.f24254n = str3;
        this.f24255o = str4;
        this.f24256p = str5;
        this.f24257q = num3;
        this.f24258r = num4;
        this.f24259s = str6;
        this.f24260t = str7;
        this.f24261u = num5;
        this.f24262v = str8;
        this.f24263w = str9;
        this.f24264x = str10;
        this.f24265y = str11;
    }

    public final d A() {
        return f24240z.l(this.f24243c);
    }

    public final String B() {
        return this.f24243c;
    }

    public final Long C() {
        return this.f24248h;
    }

    public final ArrayList D() {
        return this.f24249i;
    }

    public final c a(long j10, long j11, String typeId, Integer num, Integer num2, Long l10, ArrayList arrayList, Long l11, ArrayList arrayList2, String endpointTypeId, String serverIP, String str, String str2, String str3, String str4, String str5, Integer num3, Integer num4, String str6, String str7, Integer num5, String str8, String str9, String str10, String str11) {
        AbstractC6492s.i(typeId, "typeId");
        AbstractC6492s.i(endpointTypeId, "endpointTypeId");
        AbstractC6492s.i(serverIP, "serverIP");
        return new c(j10, j11, typeId, num, num2, l10, arrayList, l11, arrayList2, endpointTypeId, serverIP, str, str2, str3, str4, str5, num3, num4, str6, str7, num5, str8, str9, str10, str11);
    }

    public final a c() {
        String str = this.f24262v;
        if (str != null) {
            return f24240z.g(str);
        }
        return null;
    }

    public final Long d() {
        return this.f24246f;
    }

    public final ArrayList e() {
        return this.f24247g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f24241a == cVar.f24241a && this.f24242b == cVar.f24242b && AbstractC6492s.d(this.f24243c, cVar.f24243c) && AbstractC6492s.d(this.f24244d, cVar.f24244d) && AbstractC6492s.d(this.f24245e, cVar.f24245e) && AbstractC6492s.d(this.f24246f, cVar.f24246f) && AbstractC6492s.d(this.f24247g, cVar.f24247g) && AbstractC6492s.d(this.f24248h, cVar.f24248h) && AbstractC6492s.d(this.f24249i, cVar.f24249i) && AbstractC6492s.d(this.f24250j, cVar.f24250j) && AbstractC6492s.d(this.f24251k, cVar.f24251k) && AbstractC6492s.d(this.f24252l, cVar.f24252l) && AbstractC6492s.d(this.f24253m, cVar.f24253m) && AbstractC6492s.d(this.f24254n, cVar.f24254n) && AbstractC6492s.d(this.f24255o, cVar.f24255o) && AbstractC6492s.d(this.f24256p, cVar.f24256p) && AbstractC6492s.d(this.f24257q, cVar.f24257q) && AbstractC6492s.d(this.f24258r, cVar.f24258r) && AbstractC6492s.d(this.f24259s, cVar.f24259s) && AbstractC6492s.d(this.f24260t, cVar.f24260t) && AbstractC6492s.d(this.f24261u, cVar.f24261u) && AbstractC6492s.d(this.f24262v, cVar.f24262v) && AbstractC6492s.d(this.f24263w, cVar.f24263w) && AbstractC6492s.d(this.f24264x, cVar.f24264x) && AbstractC6492s.d(this.f24265y, cVar.f24265y);
    }

    public final EnumC0918c f() {
        return f24240z.k(this.f24250j);
    }

    public final String g() {
        return this.f24250j;
    }

    public final long h() {
        return this.f24241a;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.f24241a) * 31) + Long.hashCode(this.f24242b)) * 31) + this.f24243c.hashCode()) * 31;
        Integer num = this.f24244d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f24245e;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f24246f;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        ArrayList arrayList = this.f24247g;
        int iHashCode5 = (iHashCode4 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Long l11 = this.f24248h;
        int iHashCode6 = (iHashCode5 + (l11 == null ? 0 : l11.hashCode())) * 31;
        ArrayList arrayList2 = this.f24249i;
        int iHashCode7 = (((((iHashCode6 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31) + this.f24250j.hashCode()) * 31) + this.f24251k.hashCode()) * 31;
        String str = this.f24252l;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f24253m;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f24254n;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f24255o;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f24256p;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.f24257q;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f24258r;
        int iHashCode14 = (iHashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.f24259s;
        int iHashCode15 = (iHashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f24260t;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num5 = this.f24261u;
        int iHashCode17 = (iHashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str8 = this.f24262v;
        int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f24263w;
        int iHashCode19 = (iHashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f24264x;
        int iHashCode20 = (iHashCode19 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f24265y;
        return iHashCode20 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String i() {
        return this.f24264x;
    }

    public final String j() {
        return this.f24265y;
    }

    public final Integer k() {
        return this.f24245e;
    }

    public final Integer l() {
        return this.f24244d;
    }

    public final long m() {
        return this.f24242b;
    }

    public final String n() {
        return this.f24262v;
    }

    public final String o() {
        return this.f24251k;
    }

    public final String p() {
        return this.f24255o;
    }

    public final String q() {
        return this.f24256p;
    }

    public final String r() {
        return this.f24252l;
    }

    public final String s() {
        return this.f24260t;
    }

    public final Integer t() {
        return this.f24257q;
    }

    public String toString() {
        return "RoomSpeedtestMeasurement(id=" + this.f24241a + ", resultId=" + this.f24242b + ", typeId=" + this.f24243c + ", latency=" + this.f24244d + ", jitter=" + this.f24245e + ", downloadBits=" + this.f24246f + ", downloadChartValuesBits=" + this.f24247g + ", uploadBits=" + this.f24248h + ", uploadChartValuesBits=" + this.f24249i + ", endpointTypeId=" + this.f24250j + ", serverIP=" + this.f24251k + ", serverName=" + this.f24252l + ", serverProvider=" + this.f24253m + ", serverProviderUrl=" + this.f24254n + ", serverLocationCity=" + this.f24255o + ", serverLocationCountry=" + this.f24256p + ", serverProductId=" + this.f24257q + ", serverProductImageEngine=" + this.f24258r + ", serverProductImageUrl=" + this.f24259s + ", serverProduct=" + this.f24260t + ", serverWifiExperience=" + this.f24261u + ", serverA2ADeviceType=" + this.f24262v + ", serverProvidersSecondary=" + this.f24263w + ", internetProvider=" + this.f24264x + ", internetProviderImage=" + this.f24265y + ")";
    }

    public final Integer u() {
        return this.f24258r;
    }

    public final String v() {
        return this.f24259s;
    }

    public final String w() {
        return this.f24253m;
    }

    public final String x() {
        return this.f24254n;
    }

    public final String y() {
        return this.f24263w;
    }

    public final Integer z() {
        return this.f24261u;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Long l10, long j10, d type, Integer num, Integer num2, Long l11, ArrayList arrayList, Long l12, ArrayList arrayList2, EnumC0918c endpointType, String serverIP, String str, String str2, String str3, String str4, String str5, Integer num3, Integer num4, String str6, String str7, Integer num5, a aVar, String str8, String str9, String str10) {
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(endpointType, "endpointType");
        AbstractC6492s.i(serverIP, "serverIP");
        long jLongValue = l10 != null ? l10.longValue() : 0L;
        b bVar = f24240z;
        this(jLongValue, j10, bVar.j(type), num, num2, l11, arrayList, l12, arrayList2, bVar.i(endpointType), serverIP, str, str2, str3, str4, str5, num3, num4, str6, str7, num5, aVar != null ? bVar.h(aVar) : null, str8, str9, str10);
    }
}
