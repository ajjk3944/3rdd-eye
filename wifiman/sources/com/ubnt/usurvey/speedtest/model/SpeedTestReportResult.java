package com.ubnt.usurvey.speedtest.model;

import Y6.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0010\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportResult;", "", "", "result", "", "id", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Boolean;", SnmpConfigurator.O_BIND_ADDRESS, "()Ljava/lang/Boolean;", "Ljava/lang/String;", "speedtest-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class SpeedTestReportResult {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean result;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    public SpeedTestReportResult(Boolean bool, String str) {
        this.result = bool;
        this.id = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: b, reason: from getter */
    public final Boolean getResult() {
        return this.result;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeedTestReportResult)) {
            return false;
        }
        SpeedTestReportResult speedTestReportResult = (SpeedTestReportResult) other;
        return AbstractC6492s.d(this.result, speedTestReportResult.result) && AbstractC6492s.d(this.id, speedTestReportResult.id);
    }

    public int hashCode() {
        Boolean bool = this.result;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.id;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SpeedTestReportResult(result=" + this.result + ", id=" + this.id + ")";
    }
}
