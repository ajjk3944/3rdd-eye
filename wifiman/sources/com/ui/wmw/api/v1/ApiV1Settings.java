package com.ui.wmw.api.v1;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1Settings;", "", "", "name", "", "isHwResetButtonBlocked", "", "autoSleepTimeMillis", "<init>", "(Ljava/lang/String;ZJ)V", "copy", "(Ljava/lang/String;ZJ)Lcom/ui/wmw/api/v1/ApiV1Settings;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "Z", SnmpConfigurator.O_COMMUNITY, "()Z", "J", "()J", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Y6.i(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ApiV1Settings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isHwResetButtonBlocked;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long autoSleepTimeMillis;

    public ApiV1Settings(@Y6.g(name = "name") String str, @Y6.g(name = "hwResetBlocked") boolean z10, @Y6.g(name = "autoSleepTime") long j10) {
        this.name = str;
        this.isHwResetButtonBlocked = z10;
        this.autoSleepTimeMillis = j10;
    }

    /* renamed from: a, reason: from getter */
    public final long getAutoSleepTimeMillis() {
        return this.autoSleepTimeMillis;
    }

    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsHwResetButtonBlocked() {
        return this.isHwResetButtonBlocked;
    }

    public final ApiV1Settings copy(@Y6.g(name = "name") String name, @Y6.g(name = "hwResetBlocked") boolean isHwResetButtonBlocked, @Y6.g(name = "autoSleepTime") long autoSleepTimeMillis) {
        return new ApiV1Settings(name, isHwResetButtonBlocked, autoSleepTimeMillis);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiV1Settings)) {
            return false;
        }
        ApiV1Settings apiV1Settings = (ApiV1Settings) other;
        return AbstractC6492s.d(this.name, apiV1Settings.name) && this.isHwResetButtonBlocked == apiV1Settings.isHwResetButtonBlocked && this.autoSleepTimeMillis == apiV1Settings.autoSleepTimeMillis;
    }

    public int hashCode() {
        String str = this.name;
        return ((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isHwResetButtonBlocked)) * 31) + Long.hashCode(this.autoSleepTimeMillis);
    }

    public String toString() {
        return "ApiV1Settings(name=" + this.name + ", isHwResetButtonBlocked=" + this.isHwResetButtonBlocked + ", autoSleepTimeMillis=" + this.autoSleepTimeMillis + ")";
    }

    public /* synthetic */ ApiV1Settings(String str, boolean z10, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? 0L : j10);
    }
}
