package Vd;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f23367a;

    /* renamed from: b, reason: collision with root package name */
    private final a f23368b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f23369c;

    /* renamed from: d, reason: collision with root package name */
    private final Long f23370d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f23371e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f23372a;

        /* renamed from: b, reason: collision with root package name */
        private final String f23373b;

        /* renamed from: c, reason: collision with root package name */
        private final String f23374c;

        /* renamed from: d, reason: collision with root package name */
        private final String f23375d;

        public a(String str, String str2, String str3, String str4) {
            this.f23372a = str;
            this.f23373b = str2;
            this.f23374c = str3;
            this.f23375d = str4;
        }

        public final String a() {
            return this.f23373b;
        }

        public final String b() {
            return this.f23372a;
        }

        public final String c() {
            return this.f23374c;
        }

        public final String d() {
            return this.f23375d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6492s.d(this.f23372a, aVar.f23372a) && AbstractC6492s.d(this.f23373b, aVar.f23373b) && AbstractC6492s.d(this.f23374c, aVar.f23374c) && AbstractC6492s.d(this.f23375d, aVar.f23375d);
        }

        public int hashCode() {
            String str = this.f23372a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f23373b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f23374c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f23375d;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Server(countryCode=" + this.f23372a + ", city=" + this.f23373b + ", provider=" + this.f23374c + ", providerUrl=" + this.f23375d + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b LATENCY_CHECK = new b("LATENCY_CHECK", 0);
        public static final b DOWNLOAD = new b("DOWNLOAD", 1);
        public static final b UPLOAD = new b("UPLOAD", 2);
        public static final b FINISHED = new b("FINISHED", 3);

        private static final /* synthetic */ b[] $values() {
            return new b[]{LATENCY_CHECK, DOWNLOAD, UPLOAD, FINISHED};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public c(b status, a aVar, Integer num, Long l10, Long l11) {
        AbstractC6492s.i(status, "status");
        this.f23367a = status;
        this.f23368b = aVar;
        this.f23369c = num;
        this.f23370d = l10;
        this.f23371e = l11;
    }

    public final Long a() {
        return this.f23370d;
    }

    public final Integer b() {
        return this.f23369c;
    }

    public final a c() {
        return this.f23368b;
    }

    public final b d() {
        return this.f23367a;
    }

    public final Long e() {
        return this.f23371e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f23367a == cVar.f23367a && AbstractC6492s.d(this.f23368b, cVar.f23368b) && AbstractC6492s.d(this.f23369c, cVar.f23369c) && AbstractC6492s.d(this.f23370d, cVar.f23370d) && AbstractC6492s.d(this.f23371e, cVar.f23371e);
    }

    public int hashCode() {
        int iHashCode = this.f23367a.hashCode() * 31;
        a aVar = this.f23368b;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.f23369c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l10 = this.f23370d;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f23371e;
        return iHashCode4 + (l11 != null ? l11.hashCode() : 0);
    }

    public String toString() {
        return "UnifiConsoleSpeedtestState(status=" + this.f23367a + ", server=" + this.f23368b + ", latency=" + this.f23369c + ", downloadBps=" + this.f23370d + ", uploadBps=" + this.f23371e + ")";
    }
}
