package com.ubnt.usurvey.speedtest.model;

import Y6.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\"\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b'\u0010\u0014R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b%\u0010)R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b\u001f\u0010+¨\u0006,"}, d2 = {"Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnv;", "", "", "appName", "appVersion", "deviceModel", "deviceManufacturer", "os", "osVersion", "util", "utilArch", "utilVersion", "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;", "unifiInfo", "", "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvConnection;", "connection", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "d", "f", "g", "i", "h", "j", "k", "Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;", "()Lcom/ubnt/usurvey/speedtest/model/SpeedTestReportEnvUnifi;", "Ljava/util/List;", "()Ljava/util/List;", "speedtest-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes3.dex */
public final /* data */ class SpeedTestReportEnv {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String appVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceModel;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceManufacturer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String os;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String osVersion;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String util;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String utilArch;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String utilVersion;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final SpeedTestReportEnvUnifi unifiInfo;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final List connection;

    public SpeedTestReportEnv(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SpeedTestReportEnvUnifi speedTestReportEnvUnifi, List list) {
        this.appName = str;
        this.appVersion = str2;
        this.deviceModel = str3;
        this.deviceManufacturer = str4;
        this.os = str5;
        this.osVersion = str6;
        this.util = str7;
        this.utilArch = str8;
        this.utilVersion = str9;
        this.unifiInfo = speedTestReportEnvUnifi;
        this.connection = list;
    }

    /* renamed from: a, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: b, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: c, reason: from getter */
    public final List getConnection() {
        return this.connection;
    }

    /* renamed from: d, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    /* renamed from: e, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeedTestReportEnv)) {
            return false;
        }
        SpeedTestReportEnv speedTestReportEnv = (SpeedTestReportEnv) other;
        return AbstractC6492s.d(this.appName, speedTestReportEnv.appName) && AbstractC6492s.d(this.appVersion, speedTestReportEnv.appVersion) && AbstractC6492s.d(this.deviceModel, speedTestReportEnv.deviceModel) && AbstractC6492s.d(this.deviceManufacturer, speedTestReportEnv.deviceManufacturer) && AbstractC6492s.d(this.os, speedTestReportEnv.os) && AbstractC6492s.d(this.osVersion, speedTestReportEnv.osVersion) && AbstractC6492s.d(this.util, speedTestReportEnv.util) && AbstractC6492s.d(this.utilArch, speedTestReportEnv.utilArch) && AbstractC6492s.d(this.utilVersion, speedTestReportEnv.utilVersion) && AbstractC6492s.d(this.unifiInfo, speedTestReportEnv.unifiInfo) && AbstractC6492s.d(this.connection, speedTestReportEnv.connection);
    }

    /* renamed from: f, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* renamed from: g, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: h, reason: from getter */
    public final SpeedTestReportEnvUnifi getUnifiInfo() {
        return this.unifiInfo;
    }

    public int hashCode() {
        String str = this.appName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceModel;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceManufacturer;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.os;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.osVersion;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.util;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.utilArch;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.utilVersion;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        SpeedTestReportEnvUnifi speedTestReportEnvUnifi = this.unifiInfo;
        int iHashCode10 = (iHashCode9 + (speedTestReportEnvUnifi == null ? 0 : speedTestReportEnvUnifi.hashCode())) * 31;
        List list = this.connection;
        return iHashCode10 + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getUtil() {
        return this.util;
    }

    /* renamed from: j, reason: from getter */
    public final String getUtilArch() {
        return this.utilArch;
    }

    /* renamed from: k, reason: from getter */
    public final String getUtilVersion() {
        return this.utilVersion;
    }

    public String toString() {
        return "SpeedTestReportEnv(appName=" + this.appName + ", appVersion=" + this.appVersion + ", deviceModel=" + this.deviceModel + ", deviceManufacturer=" + this.deviceManufacturer + ", os=" + this.os + ", osVersion=" + this.osVersion + ", util=" + this.util + ", utilArch=" + this.utilArch + ", utilVersion=" + this.utilVersion + ", unifiInfo=" + this.unifiInfo + ", connection=" + this.connection + ")";
    }
}
