package com.ubnt.usurvey.wifi;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

/* loaded from: classes3.dex */
public final class WifiMcs {

    /* renamed from: d, reason: collision with root package name */
    public static final b f41046d = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final c f41047a;

    /* renamed from: b, reason: collision with root package name */
    private final a f41048b;

    /* renamed from: c, reason: collision with root package name */
    private final int f41049c;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/ubnt/usurvey/wifi/WifiMcs$InvalidWifiMcs;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "Lcom/ubnt/usurvey/wifi/WifiMcs$c;", "modulation", "Lcom/ubnt/usurvey/wifi/WifiMcs$a;", "coding", "<init>", "(Lcom/ubnt/usurvey/wifi/WifiMcs$c;Lcom/ubnt/usurvey/wifi/WifiMcs$a;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lcom/ubnt/usurvey/wifi/WifiMcs$c;", SnmpConfigurator.O_BIND_ADDRESS, "Lcom/ubnt/usurvey/wifi/WifiMcs$a;", "", "getMessage", "()Ljava/lang/String;", "message", "common-domain_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidWifiMcs extends IllegalArgumentException {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final c modulation;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final a coding;

        public InvalidWifiMcs(c modulation, a coding) {
            AbstractC6492s.i(modulation, "modulation");
            AbstractC6492s.i(coding, "coding");
            this.modulation = modulation;
            this.coding = coding;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return "Invalid MCS " + this.modulation + " with " + this.coding + " combination";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a _1_2 = new a("_1_2", 0, 0.5f);
        public static final a _2_3 = new a("_2_3", 1, 0.6666667f);
        public static final a _3_4 = new a("_3_4", 2, 0.75f);
        public static final a _5_6 = new a("_5_6", 3, 0.8333333f);

        /* renamed from: r, reason: collision with root package name */
        private final float f41052r;

        private static final /* synthetic */ a[] $values() {
            return new a[]{_1_2, _2_3, _3_4, _5_6};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, float f10) {
            this.f41052r = f10;
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

        public final float getR() {
            return this.f41052r;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(c cVar, a aVar) {
            if (cVar == c.BPSK && aVar != a._1_2) {
                throw new InvalidWifiMcs(cVar, aVar);
            }
            if (cVar == c.QPSK && aVar != a._1_2 && aVar != a._3_4) {
                throw new InvalidWifiMcs(cVar, aVar);
            }
            if (cVar == c.QAM_16 && aVar != a._1_2 && aVar != a._3_4) {
                throw new InvalidWifiMcs(cVar, aVar);
            }
            if (cVar == c.QAM_64 && aVar != a._2_3 && aVar != a._3_4 && aVar != a._5_6) {
                throw new InvalidWifiMcs(cVar, aVar);
            }
            if (cVar == c.QAM_256 && aVar != a._3_4 && aVar != a._5_6) {
                throw new InvalidWifiMcs(cVar, aVar);
            }
            if (cVar == c.QAM_1024 && aVar != a._3_4 && aVar != a._5_6) {
                throw new InvalidWifiMcs(cVar, aVar);
            }
            if (cVar == c.QAM_4096 && aVar != a._3_4 && aVar != a._5_6) {
                throw new InvalidWifiMcs(cVar, aVar);
            }
        }

        public final WifiMcs b(c modulation, a coding, int i10) {
            AbstractC6492s.i(modulation, "modulation");
            AbstractC6492s.i(coding, "coding");
            a(modulation, coding);
            return new WifiMcs(modulation, coding, i10);
        }

        private b() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        private final int ncb;
        public static final c BPSK = new c("BPSK", 0, 1);
        public static final c QPSK = new c("QPSK", 1, 2);
        public static final c QAM_16 = new c("QAM_16", 2, 4);
        public static final c QAM_64 = new c("QAM_64", 3, 6);
        public static final c QAM_256 = new c("QAM_256", 4, 8);
        public static final c QAM_1024 = new c("QAM_1024", 5, 10);
        public static final c QAM_4096 = new c("QAM_4096", 6, 12);

        private static final /* synthetic */ c[] $values() {
            return new c[]{BPSK, QPSK, QAM_16, QAM_64, QAM_256, QAM_1024, QAM_4096};
        }

        static {
            c[] cVarArr$values = $values();
            $VALUES = cVarArr$values;
            $ENTRIES = AbstractC5827b.a(cVarArr$values);
        }

        private c(String str, int i10, int i11) {
            this.ncb = i11;
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final int getNcb() {
            return this.ncb;
        }
    }

    public WifiMcs(c modulation, a coding, int i10) {
        AbstractC6492s.i(modulation, "modulation");
        AbstractC6492s.i(coding, "coding");
        this.f41047a = modulation;
        this.f41048b = coding;
        this.f41049c = i10;
    }

    public final a a() {
        return this.f41048b;
    }

    public final c b() {
        return this.f41047a;
    }

    public final int c() {
        return this.f41049c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WifiMcs)) {
            return false;
        }
        WifiMcs wifiMcs = (WifiMcs) obj;
        return this.f41047a == wifiMcs.f41047a && this.f41048b == wifiMcs.f41048b && this.f41049c == wifiMcs.f41049c;
    }

    public int hashCode() {
        return (((this.f41047a.hashCode() * 31) + this.f41048b.hashCode()) * 31) + Integer.hashCode(this.f41049c);
    }

    public String toString() {
        return "WifiMcs(modulation=" + this.f41047a + ", coding=" + this.f41048b + ", spatialStreams=" + this.f41049c + ")";
    }
}
