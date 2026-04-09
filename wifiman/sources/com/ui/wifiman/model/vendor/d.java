package com.ui.wifiman.model.vendor;

import Zg.AbstractC3682n;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import gg.z;
import h9.C5969a;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public abstract class d implements Serializable {

    public interface a {
        d a(C5969a c5969a);
    }

    public interface b {
        z a();

        d b(String str);
    }

    public static final class c extends d {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC1510d f43980a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC1510d record) {
            super(null);
            AbstractC6492s.i(record, "record");
            this.f43980a = record;
        }

        public String a() {
            return this.f43980a.getHomepageUrl();
        }

        public final EnumC1510d c() {
            return this.f43980a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f43980a == ((c) obj).f43980a;
        }

        @Override // com.ui.wifiman.model.vendor.d
        public String getName() {
            return this.f43980a.getDisplayName();
        }

        public int hashCode() {
            return this.f43980a.hashCode();
        }

        public String toString() {
            return "Recognized(record=" + this.f43980a + ")";
        }
    }

    public static final class e extends d {

        /* renamed from: a, reason: collision with root package name */
        private final String f43981a;

        /* renamed from: b, reason: collision with root package name */
        private final String f43982b;

        public /* synthetic */ e(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC6492s.d(this.f43981a, eVar.f43981a) && AbstractC6492s.d(this.f43982b, eVar.f43982b);
        }

        @Override // com.ui.wifiman.model.vendor.d
        public String getName() {
            return this.f43981a;
        }

        public int hashCode() {
            int iHashCode = this.f43981a.hashCode() * 31;
            String str = this.f43982b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Unknown(name=" + this.f43981a + ", homepageUrl=" + this.f43982b + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String name, String str) {
            super(null);
            AbstractC6492s.i(name, "name");
            this.f43981a = name;
            this.f43982b = str;
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getName();

    private d() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.ui.wifiman.model.vendor.d$d, reason: collision with other inner class name */
    public static final class EnumC1510d {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC1510d[] $VALUES;
        public static final EnumC1510d APPLE;
        public static final EnumC1510d ARUBA;
        public static final EnumC1510d ASUS;
        public static final EnumC1510d BENQ;
        public static final EnumC1510d BLACKBERRY;
        public static final EnumC1510d BOSCH;
        public static final EnumC1510d CANON;
        public static final EnumC1510d DLINK;
        public static final EnumC1510d EPSON;
        public static final EnumC1510d GE;
        public static final EnumC1510d GOOGLE;
        public static final EnumC1510d GOPRO;
        public static final EnumC1510d HONEYWELL;
        public static final EnumC1510d HTC;
        public static final EnumC1510d HUAWEI;
        public static final EnumC1510d LENOVO;
        public static final EnumC1510d LG;
        public static final EnumC1510d MICROSOFT;
        public static final EnumC1510d MIKROTIK;
        public static final EnumC1510d MOTOROLA;
        public static final EnumC1510d NOKIA;
        public static final EnumC1510d ONEPLUS;
        public static final EnumC1510d OPPO;
        public static final EnumC1510d PANASONIC;
        public static final EnumC1510d PHILIPS;
        public static final EnumC1510d RASPBERRY_PI;
        public static final EnumC1510d SAMSUNG;
        public static final EnumC1510d SONOS;
        public static final EnumC1510d SONY;
        public static final EnumC1510d TESLA;
        public static final EnumC1510d TPLINK;
        public static final EnumC1510d VIVO;
        public static final EnumC1510d VODAFONE;
        public static final EnumC1510d XIAOMI;
        private final String homepageUrl;
        private final String[] names;
        public static final EnumC1510d UBIQUITI = new EnumC1510d("UBIQUITI", 0, new String[]{"Ubiquiti", "Ubiquiti Networks", "UBNT"}, "https://www.ui.com");
        public static final EnumC1510d ACER = new EnumC1510d("ACER", 1, new String[]{"Acer"}, null, 2, null);
        public static final EnumC1510d AMAZON = new EnumC1510d("AMAZON", 2, new String[]{"Amazon"}, null, 2, null);

        private static final /* synthetic */ EnumC1510d[] $values() {
            return new EnumC1510d[]{UBIQUITI, ACER, AMAZON, APPLE, ARUBA, ASUS, BENQ, BLACKBERRY, BOSCH, CANON, DLINK, EPSON, GE, GOOGLE, GOPRO, HONEYWELL, HTC, HUAWEI, LENOVO, LG, MICROSOFT, MOTOROLA, MIKROTIK, NOKIA, ONEPLUS, OPPO, PANASONIC, PHILIPS, RASPBERRY_PI, SAMSUNG, SONY, TESLA, TPLINK, SONOS, VIVO, VODAFONE, XIAOMI};
        }

        static {
            int i10 = 2;
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str = null;
            APPLE = new EnumC1510d("APPLE", 3, new String[]{"Apple", "Apple, Inc", "Apple, Inc."}, str, i10, defaultConstructorMarker);
            int i11 = 2;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            String str2 = null;
            ARUBA = new EnumC1510d("ARUBA", 4, new String[]{"Aruba"}, str2, i11, defaultConstructorMarker2);
            ASUS = new EnumC1510d("ASUS", 5, new String[]{"Asus"}, str, i10, defaultConstructorMarker);
            BENQ = new EnumC1510d("BENQ", 6, new String[]{"Benq"}, str2, i11, defaultConstructorMarker2);
            BLACKBERRY = new EnumC1510d("BLACKBERRY", 7, new String[]{"BlackBerry RTS"}, str, i10, defaultConstructorMarker);
            BOSCH = new EnumC1510d("BOSCH", 8, new String[]{"Bosch Innovations", "Bosch Security Systems", "Bosch Access Systems"}, str2, i11, defaultConstructorMarker2);
            CANON = new EnumC1510d("CANON", 9, new String[]{"Canon"}, str, i10, defaultConstructorMarker);
            DLINK = new EnumC1510d("DLINK", 10, new String[]{"D-Link"}, str2, i11, defaultConstructorMarker2);
            EPSON = new EnumC1510d("EPSON", 11, new String[]{"Seiko Epson"}, str, i10, defaultConstructorMarker);
            GE = new EnumC1510d("GE", 12, new String[]{"General Electric"}, str2, i11, defaultConstructorMarker2);
            GOOGLE = new EnumC1510d("GOOGLE", 13, new String[]{"Google", "Google Inc."}, str, i10, defaultConstructorMarker);
            GOPRO = new EnumC1510d("GOPRO", 14, new String[]{"GoPro"}, str2, i11, defaultConstructorMarker2);
            HONEYWELL = new EnumC1510d("HONEYWELL", 15, new String[]{"HONEYWELL"}, str, i10, defaultConstructorMarker);
            HTC = new EnumC1510d("HTC", 16, new String[]{"HTC"}, str2, i11, defaultConstructorMarker2);
            HUAWEI = new EnumC1510d("HUAWEI", 17, new String[]{"Huawei"}, str, i10, defaultConstructorMarker);
            LENOVO = new EnumC1510d("LENOVO", 18, new String[]{"Lenovo", "Lenovo Mobile"}, str2, i11, defaultConstructorMarker2);
            LG = new EnumC1510d("LG", 19, new String[]{"LG", "LGE"}, str, i10, defaultConstructorMarker);
            MICROSOFT = new EnumC1510d("MICROSOFT", 20, new String[]{"Microsoft"}, str2, i11, defaultConstructorMarker2);
            MOTOROLA = new EnumC1510d("MOTOROLA", 21, new String[]{"Motorola", "Motorola Mobility"}, str, i10, defaultConstructorMarker);
            MIKROTIK = new EnumC1510d("MIKROTIK", 22, new String[]{"MikroTik"}, str2, i11, defaultConstructorMarker2);
            NOKIA = new EnumC1510d("NOKIA", 23, new String[]{"Nokia"}, str, i10, defaultConstructorMarker);
            ONEPLUS = new EnumC1510d("ONEPLUS", 24, new String[]{"OnePlus"}, str2, i11, defaultConstructorMarker2);
            OPPO = new EnumC1510d("OPPO", 25, new String[]{"Guangdong Oppo Mobile Telecom"}, str, i10, defaultConstructorMarker);
            PANASONIC = new EnumC1510d("PANASONIC", 26, new String[]{"Panasonic", "Panasonic Mobile"}, str2, i11, defaultConstructorMarker2);
            PHILIPS = new EnumC1510d("PHILIPS", 27, new String[]{"Philips", "Philips Lighting", "Philips Broadband Networks"}, str, i10, defaultConstructorMarker);
            RASPBERRY_PI = new EnumC1510d("RASPBERRY_PI", 28, new String[]{"Raspberry Pi Foundation", "Raspberry Pi Trading Ltd", "Raspberry Pi (Trading) Ltd"}, str2, i11, defaultConstructorMarker2);
            SAMSUNG = new EnumC1510d("SAMSUNG", 29, new String[]{"Samsung", "Samsung Electronics Co. Ltd.", "Samsung Electronics Co.,LTD"}, str, i10, defaultConstructorMarker);
            SONY = new EnumC1510d("SONY", 30, new String[]{"Sony", "Sony Mobile", "Sony Interactive"}, str2, i11, defaultConstructorMarker2);
            TESLA = new EnumC1510d("TESLA", 31, new String[]{"Tesla Motors"}, str, i10, defaultConstructorMarker);
            TPLINK = new EnumC1510d("TPLINK", 32, new String[]{"TP-Link"}, str2, i11, defaultConstructorMarker2);
            SONOS = new EnumC1510d("SONOS", 33, new String[]{"Sonos, Inc."}, str, i10, defaultConstructorMarker);
            VIVO = new EnumC1510d("VIVO", 34, new String[]{"VIVO", "vivo Mobile"}, str2, i11, defaultConstructorMarker2);
            VODAFONE = new EnumC1510d("VODAFONE", 35, new String[]{"Vodafone", "Vodafone UK", "Vodafone Italia S.p.A", "Vodafone Omnitel N.V", "Vodafone Automotive S.p.A"}, null, i10, defaultConstructorMarker);
            XIAOMI = new EnumC1510d("XIAOMI", 36, new String[]{"Xiaomi"}, str2, i11, defaultConstructorMarker2);
            EnumC1510d[] enumC1510dArr$values = $values();
            $VALUES = enumC1510dArr$values;
            $ENTRIES = AbstractC5827b.a(enumC1510dArr$values);
        }

        private EnumC1510d(String str, int i10, String[] strArr, String str2) {
            this.names = strArr;
            this.homepageUrl = str2;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static EnumC1510d valueOf(String str) {
            return (EnumC1510d) Enum.valueOf(EnumC1510d.class, str);
        }

        public static EnumC1510d[] values() {
            return (EnumC1510d[]) $VALUES.clone();
        }

        public final c asVendor() {
            return new c(this);
        }

        public final String getDisplayName() {
            return (String) AbstractC3682n.Z(this.names);
        }

        public final String getHomepageUrl() {
            return this.homepageUrl;
        }

        public final String[] getNames() {
            return this.names;
        }

        /* synthetic */ EnumC1510d(String str, int i10, String[] strArr, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, strArr, (i11 & 2) != 0 ? null : str2);
        }
    }
}
