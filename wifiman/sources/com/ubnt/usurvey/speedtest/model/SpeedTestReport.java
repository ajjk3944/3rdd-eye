package com.ubnt.usurvey.speedtest.model;

import Y6.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0010R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001d\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u0018\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b#\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006&"}, d2 = {"Lcom/ubnt/usurvey/speedtest/model/SpeedTestReport;", "", "", "source", "platform", "", "servers", "", "latency", "download", "upload", "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;", "env", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "f", SnmpConfigurator.O_BIND_ADDRESS, "d", SnmpConfigurator.O_COMMUNITY, "Ljava/util/List;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Ljava/util/List;", "Ljava/lang/Long;", "()Ljava/lang/Long;", "g", "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;", "()Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;", "speedtest-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class SpeedTestReport {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String source;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String platform;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List servers;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long latency;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long download;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long upload;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final SpeedTestReportEnv env;

    public SpeedTestReport(String str, String str2, List list, Long l10, Long l11, Long l12, SpeedTestReportEnv speedTestReportEnv) {
        this.source = str;
        this.platform = str2;
        this.servers = list;
        this.latency = l10;
        this.download = l11;
        this.upload = l12;
        this.env = speedTestReportEnv;
    }

    /* renamed from: a, reason: from getter */
    public final Long getDownload() {
        return this.download;
    }

    /* renamed from: b, reason: from getter */
    public final SpeedTestReportEnv getEnv() {
        return this.env;
    }

    /* renamed from: c, reason: from getter */
    public final Long getLatency() {
        return this.latency;
    }

    /* renamed from: d, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* renamed from: e, reason: from getter */
    public final List getServers() {
        return this.servers;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeedTestReport)) {
            return false;
        }
        SpeedTestReport speedTestReport = (SpeedTestReport) other;
        return AbstractC6492s.d(this.source, speedTestReport.source) && AbstractC6492s.d(this.platform, speedTestReport.platform) && AbstractC6492s.d(this.servers, speedTestReport.servers) && AbstractC6492s.d(this.latency, speedTestReport.latency) && AbstractC6492s.d(this.download, speedTestReport.download) && AbstractC6492s.d(this.upload, speedTestReport.upload) && AbstractC6492s.d(this.env, speedTestReport.env);
    }

    /* renamed from: f, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: g, reason: from getter */
    public final Long getUpload() {
        return this.upload;
    }

    public int hashCode() {
        String str = this.source;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platform;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.servers;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Long l10 = this.latency;
        int iHashCode4 = (iHashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.download;
        int iHashCode5 = (iHashCode4 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.upload;
        int iHashCode6 = (iHashCode5 + (l12 == null ? 0 : l12.hashCode())) * 31;
        SpeedTestReportEnv speedTestReportEnv = this.env;
        return iHashCode6 + (speedTestReportEnv != null ? speedTestReportEnv.hashCode() : 0);
    }

    public String toString() {
        return "SpeedTestReport(source=" + this.source + ", platform=" + this.platform + ", servers=" + this.servers + ", latency=" + this.latency + ", download=" + this.download + ", upload=" + this.upload + ", env=" + this.env + ")";
    }
}
