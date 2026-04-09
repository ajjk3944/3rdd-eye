package Yd;

import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0018Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010\u0010¨\u0006-"}, d2 = {"LYd/e;", "", "", "ispName", "publicIp", "", "downloadRateBytes", "uploadRateBytes", "type", "serverName", "downloadSpeedBytes", "uploadSpeedBytes", "mac", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getIspName", SnmpConfigurator.O_BIND_ADDRESS, "getPublicIp", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/Long;", "getDownloadRateBytes", "()Ljava/lang/Long;", "d", "getUploadRateBytes", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getType", "f", "getServerName", "g", "getDownloadSpeedBytes", "h", "getUploadSpeedBytes", "i", "getMac", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Yd.e, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class ApiUispSpeedtestReportParams {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("ispName")
    private final String ispName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("publicIp")
    private final String publicIp;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("downloadRateBytes")
    private final Long downloadRateBytes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("uploadRateBytes")
    private final Long uploadRateBytes;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("type")
    private final String type;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("serverName")
    private final String serverName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("downloadSpeedBytes")
    private final Long downloadSpeedBytes;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("uploadSpeedBytes")
    private final Long uploadSpeedBytes;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("endpoint")
    private final String mac;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Yd.e$a */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a INTERNET = new a("INTERNET", 0, "INTERNET");
        public static final a LOCAL_DEVICE = new a("LOCAL_DEVICE", 1, "LOCAL_DEVICE");
        private final String apiId;

        private static final /* synthetic */ a[] $values() {
            return new a[]{INTERNET, LOCAL_DEVICE};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, String str2) {
            this.apiId = str2;
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

        public final String getApiId() {
            return this.apiId;
        }
    }

    public ApiUispSpeedtestReportParams(String str, String str2, Long l10, Long l11, String str3, String str4, Long l12, Long l13, String str5) {
        this.ispName = str;
        this.publicIp = str2;
        this.downloadRateBytes = l10;
        this.uploadRateBytes = l11;
        this.type = str3;
        this.serverName = str4;
        this.downloadSpeedBytes = l12;
        this.uploadSpeedBytes = l13;
        this.mac = str5;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiUispSpeedtestReportParams)) {
            return false;
        }
        ApiUispSpeedtestReportParams apiUispSpeedtestReportParams = (ApiUispSpeedtestReportParams) other;
        return AbstractC6492s.d(this.ispName, apiUispSpeedtestReportParams.ispName) && AbstractC6492s.d(this.publicIp, apiUispSpeedtestReportParams.publicIp) && AbstractC6492s.d(this.downloadRateBytes, apiUispSpeedtestReportParams.downloadRateBytes) && AbstractC6492s.d(this.uploadRateBytes, apiUispSpeedtestReportParams.uploadRateBytes) && AbstractC6492s.d(this.type, apiUispSpeedtestReportParams.type) && AbstractC6492s.d(this.serverName, apiUispSpeedtestReportParams.serverName) && AbstractC6492s.d(this.downloadSpeedBytes, apiUispSpeedtestReportParams.downloadSpeedBytes) && AbstractC6492s.d(this.uploadSpeedBytes, apiUispSpeedtestReportParams.uploadSpeedBytes) && AbstractC6492s.d(this.mac, apiUispSpeedtestReportParams.mac);
    }

    public int hashCode() {
        String str = this.ispName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.publicIp;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.downloadRateBytes;
        int iHashCode3 = (iHashCode2 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.uploadRateBytes;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.serverName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l12 = this.downloadSpeedBytes;
        int iHashCode7 = (iHashCode6 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.uploadSpeedBytes;
        int iHashCode8 = (iHashCode7 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str5 = this.mac;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "ApiUispSpeedtestReportParams(ispName=" + this.ispName + ", publicIp=" + this.publicIp + ", downloadRateBytes=" + this.downloadRateBytes + ", uploadRateBytes=" + this.uploadRateBytes + ", type=" + this.type + ", serverName=" + this.serverName + ", downloadSpeedBytes=" + this.downloadSpeedBytes + ", uploadSpeedBytes=" + this.uploadSpeedBytes + ", mac=" + this.mac + ")";
    }
}
