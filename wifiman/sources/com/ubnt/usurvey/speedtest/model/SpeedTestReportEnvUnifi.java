package com.ubnt.usurvey.speedtest.model;

import Y6.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;", "", "", "consoleAnonId", "consoleModel", "apModel", "netVersion", "uosVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "speedtest-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class SpeedTestReportEnvUnifi {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String consoleAnonId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String consoleModel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apModel;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String netVersion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uosVersion;

    public SpeedTestReportEnvUnifi(String str, String str2, String str3, String str4, String str5) {
        this.consoleAnonId = str;
        this.consoleModel = str2;
        this.apModel = str3;
        this.netVersion = str4;
        this.uosVersion = str5;
    }

    /* renamed from: a, reason: from getter */
    public final String getApModel() {
        return this.apModel;
    }

    /* renamed from: b, reason: from getter */
    public final String getConsoleAnonId() {
        return this.consoleAnonId;
    }

    /* renamed from: c, reason: from getter */
    public final String getConsoleModel() {
        return this.consoleModel;
    }

    /* renamed from: d, reason: from getter */
    public final String getNetVersion() {
        return this.netVersion;
    }

    /* renamed from: e, reason: from getter */
    public final String getUosVersion() {
        return this.uosVersion;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeedTestReportEnvUnifi)) {
            return false;
        }
        SpeedTestReportEnvUnifi speedTestReportEnvUnifi = (SpeedTestReportEnvUnifi) other;
        return AbstractC6492s.d(this.consoleAnonId, speedTestReportEnvUnifi.consoleAnonId) && AbstractC6492s.d(this.consoleModel, speedTestReportEnvUnifi.consoleModel) && AbstractC6492s.d(this.apModel, speedTestReportEnvUnifi.apModel) && AbstractC6492s.d(this.netVersion, speedTestReportEnvUnifi.netVersion) && AbstractC6492s.d(this.uosVersion, speedTestReportEnvUnifi.uosVersion);
    }

    public int hashCode() {
        String str = this.consoleAnonId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.consoleModel;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.apModel;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.netVersion;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.uosVersion;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "SpeedTestReportEnvUnifi(consoleAnonId=" + this.consoleAnonId + ", consoleModel=" + this.consoleModel + ", apModel=" + this.apModel + ", netVersion=" + this.netVersion + ", uosVersion=" + this.uosVersion + ")";
    }
}
