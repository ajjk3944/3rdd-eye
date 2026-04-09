package ce;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0010B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\b¨\u0006\u0016"}, d2 = {"Lce/e;", "", "", "comment", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getComment", SnmpConfigurator.O_BIND_ADDRESS, "getReason", SnmpConfigurator.O_COMMUNITY, "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: ce.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final /* data */ class ApiNetworkWifimanSpeedtestFeedbackReport {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("comment")
    private final String comment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @s5.c("reason")
    private final String reason;

    public ApiNetworkWifimanSpeedtestFeedbackReport(String str, String str2) {
        this.comment = str;
        this.reason = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiNetworkWifimanSpeedtestFeedbackReport)) {
            return false;
        }
        ApiNetworkWifimanSpeedtestFeedbackReport apiNetworkWifimanSpeedtestFeedbackReport = (ApiNetworkWifimanSpeedtestFeedbackReport) other;
        return AbstractC6492s.d(this.comment, apiNetworkWifimanSpeedtestFeedbackReport.comment) && AbstractC6492s.d(this.reason, apiNetworkWifimanSpeedtestFeedbackReport.reason);
    }

    public int hashCode() {
        String str = this.comment;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.reason;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ApiNetworkWifimanSpeedtestFeedbackReport(comment=" + this.comment + ", reason=" + this.reason + ")";
    }
}
