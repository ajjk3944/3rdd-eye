package ce;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0002\u0016\u0013B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lce/f;", "", "", "ispName", "publicIP", "", "Lce/f$b;", "tests", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getIspName", SnmpConfigurator.O_BIND_ADDRESS, "getPublicIP", SnmpConfigurator.O_COMMUNITY, "Ljava/util/List;", "getTests", "()Ljava/util/List;", "d", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ce.f, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class ApiNetworkWifimanSpeedtestReport {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("isp_name")
    private final String ispName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("public_ip")
    private final String publicIP;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("speed_tests")
    private final List<Speedtest> tests;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\f¨\u0006!"}, d2 = {"Lce/f$b;", "", "", "downloadBytes", "uploadBytes", "", "type", "serverName", "endpoint", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Long;", "getDownloadBytes", "()Ljava/lang/Long;", SnmpConfigurator.O_BIND_ADDRESS, "getUploadBytes", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "getType", "d", "getServerName", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getEndpoint", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ce.f$b, reason: from toString */
    public static final /* data */ class Speedtest {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c("download_speed_bytes")
        private final Long downloadBytes;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c("upload_speed_bytes")
        private final Long uploadBytes;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c("type")
        private final String type;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c("test_server_name")
        private final String serverName;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        @s5.c("endpoint")
        private final String endpoint;

        public Speedtest(Long l10, Long l11, String str, String str2, String str3) {
            this.downloadBytes = l10;
            this.uploadBytes = l11;
            this.type = str;
            this.serverName = str2;
            this.endpoint = str3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Speedtest)) {
                return false;
            }
            Speedtest speedtest2 = (Speedtest) other;
            return AbstractC6492s.d(this.downloadBytes, speedtest2.downloadBytes) && AbstractC6492s.d(this.uploadBytes, speedtest2.uploadBytes) && AbstractC6492s.d(this.type, speedtest2.type) && AbstractC6492s.d(this.serverName, speedtest2.serverName) && AbstractC6492s.d(this.endpoint, speedtest2.endpoint);
        }

        public int hashCode() {
            Long l10 = this.downloadBytes;
            int iHashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
            Long l11 = this.uploadBytes;
            int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str = this.type;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.serverName;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.endpoint;
            return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Speedtest(downloadBytes=" + this.downloadBytes + ", uploadBytes=" + this.uploadBytes + ", type=" + this.type + ", serverName=" + this.serverName + ", endpoint=" + this.endpoint + ")";
        }
    }

    public ApiNetworkWifimanSpeedtestReport(String str, String str2, List tests) {
        AbstractC6492s.i(tests, "tests");
        this.ispName = str;
        this.publicIP = str2;
        this.tests = tests;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiNetworkWifimanSpeedtestReport)) {
            return false;
        }
        ApiNetworkWifimanSpeedtestReport apiNetworkWifimanSpeedtestReport = (ApiNetworkWifimanSpeedtestReport) other;
        return AbstractC6492s.d(this.ispName, apiNetworkWifimanSpeedtestReport.ispName) && AbstractC6492s.d(this.publicIP, apiNetworkWifimanSpeedtestReport.publicIP) && AbstractC6492s.d(this.tests, apiNetworkWifimanSpeedtestReport.tests);
    }

    public int hashCode() {
        String str = this.ispName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.publicIP;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.tests.hashCode();
    }

    public String toString() {
        return "ApiNetworkWifimanSpeedtestReport(ispName=" + this.ispName + ", publicIP=" + this.publicIP + ", tests=" + this.tests + ")";
    }
}
