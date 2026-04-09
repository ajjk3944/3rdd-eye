package com.ui.wmw.api.v1;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J|\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b!\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001a\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\u001e\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b&\u0010)¨\u0006*"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1Firmware;", "", "", "hwRevisionNumber", "", "firmwareVersion", "firmwareId", "buildId", "channelId", "", "isFwUpgradeInProcess", "updateStateId", "progressPercent", "", "remainingTimeSeconds", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/ui/wmw/api/v1/ApiV1Firmware;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Integer;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Ljava/lang/Integer;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/String;", "d", SnmpConfigurator.O_COMMUNITY, "f", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "g", "h", "Ljava/lang/Long;", "()Ljava/lang/Long;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Y6.i(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ApiV1Firmware {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer hwRevisionNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firmwareVersion;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firmwareId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String buildId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String channelId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isFwUpgradeInProcess;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updateStateId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer progressPercent;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long remainingTimeSeconds;

    public ApiV1Firmware(@Y6.g(name = "hwv") Integer num, @Y6.g(name = "fwv") String str, @Y6.g(name = "fwId") String str2, @Y6.g(name = "buildId") String str3, @Y6.g(name = "ch") String str4, @Y6.g(name = "isUpdating") Boolean bool, @Y6.g(name = "status") String str5, @Y6.g(name = "progressPercent") Integer num2, @Y6.g(name = "remainingTime") Long l10) {
        this.hwRevisionNumber = num;
        this.firmwareVersion = str;
        this.firmwareId = str2;
        this.buildId = str3;
        this.channelId = str4;
        this.isFwUpgradeInProcess = bool;
        this.updateStateId = str5;
        this.progressPercent = num2;
        this.remainingTimeSeconds = l10;
    }

    /* renamed from: a, reason: from getter */
    public final String getBuildId() {
        return this.buildId;
    }

    /* renamed from: b, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    /* renamed from: c, reason: from getter */
    public final String getFirmwareId() {
        return this.firmwareId;
    }

    public final ApiV1Firmware copy(@Y6.g(name = "hwv") Integer hwRevisionNumber, @Y6.g(name = "fwv") String firmwareVersion, @Y6.g(name = "fwId") String firmwareId, @Y6.g(name = "buildId") String buildId, @Y6.g(name = "ch") String channelId, @Y6.g(name = "isUpdating") Boolean isFwUpgradeInProcess, @Y6.g(name = "status") String updateStateId, @Y6.g(name = "progressPercent") Integer progressPercent, @Y6.g(name = "remainingTime") Long remainingTimeSeconds) {
        return new ApiV1Firmware(hwRevisionNumber, firmwareVersion, firmwareId, buildId, channelId, isFwUpgradeInProcess, updateStateId, progressPercent, remainingTimeSeconds);
    }

    /* renamed from: d, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getHwRevisionNumber() {
        return this.hwRevisionNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiV1Firmware)) {
            return false;
        }
        ApiV1Firmware apiV1Firmware = (ApiV1Firmware) other;
        return AbstractC6492s.d(this.hwRevisionNumber, apiV1Firmware.hwRevisionNumber) && AbstractC6492s.d(this.firmwareVersion, apiV1Firmware.firmwareVersion) && AbstractC6492s.d(this.firmwareId, apiV1Firmware.firmwareId) && AbstractC6492s.d(this.buildId, apiV1Firmware.buildId) && AbstractC6492s.d(this.channelId, apiV1Firmware.channelId) && AbstractC6492s.d(this.isFwUpgradeInProcess, apiV1Firmware.isFwUpgradeInProcess) && AbstractC6492s.d(this.updateStateId, apiV1Firmware.updateStateId) && AbstractC6492s.d(this.progressPercent, apiV1Firmware.progressPercent) && AbstractC6492s.d(this.remainingTimeSeconds, apiV1Firmware.remainingTimeSeconds);
    }

    /* renamed from: f, reason: from getter */
    public final Integer getProgressPercent() {
        return this.progressPercent;
    }

    /* renamed from: g, reason: from getter */
    public final Long getRemainingTimeSeconds() {
        return this.remainingTimeSeconds;
    }

    /* renamed from: h, reason: from getter */
    public final String getUpdateStateId() {
        return this.updateStateId;
    }

    public int hashCode() {
        Integer num = this.hwRevisionNumber;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.firmwareVersion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firmwareId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buildId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.channelId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isFwUpgradeInProcess;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.updateStateId;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.progressPercent;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.remainingTimeSeconds;
        return iHashCode8 + (l10 != null ? l10.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final Boolean getIsFwUpgradeInProcess() {
        return this.isFwUpgradeInProcess;
    }

    public String toString() {
        return "ApiV1Firmware(hwRevisionNumber=" + this.hwRevisionNumber + ", firmwareVersion=" + this.firmwareVersion + ", firmwareId=" + this.firmwareId + ", buildId=" + this.buildId + ", channelId=" + this.channelId + ", isFwUpgradeInProcess=" + this.isFwUpgradeInProcess + ", updateStateId=" + this.updateStateId + ", progressPercent=" + this.progressPercent + ", remainingTimeSeconds=" + this.remainingTimeSeconds + ")";
    }
}
