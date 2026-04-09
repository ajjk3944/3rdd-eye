package com.ui.wmw.api.v1;

import Zg.U;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;
import sh.AbstractC7978m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aBg\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Jp\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001b\u001a\u0004\b'\u0010\u001cR\u0013\u0010.\u001a\u0004\u0018\u00010,8F¢\u0006\u0006\u001a\u0004\b\"\u0010-¨\u0006/"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;", "", "", "batteryPercent", "", "batteryVoltage", "", "changingStateId", "powerSourceId", "", "isLowBattery", "", "uptime", "signalPercent", "signalDbm", "<init>", "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)V", "copy", "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Float;", "()Ljava/lang/Float;", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "d", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "f", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "g", "Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;", "()Lcom/ui/wmw/api/v1/ApiV1DeviceStatistics$a;", "powerSource", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Y6.i(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ApiV1DeviceStatistics {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer batteryPercent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Float batteryVoltage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String changingStateId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String powerSourceId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isLowBattery;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long uptime;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer signalPercent;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer signalDbm;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C1670a Companion;
        private static final Map<String, a> values;

        /* renamed from: id, reason: collision with root package name */
        private final String f45339id;
        public static final a BATTERY = new a("BATTERY", 0, "battery");
        public static final a PLUGGED = new a("PLUGGED", 1, "pluggedIn");

        /* renamed from: com.ui.wmw.api.v1.ApiV1DeviceStatistics$a$a, reason: collision with other inner class name */
        public static final class C1670a {
            public /* synthetic */ C1670a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Map a() {
                return a.values;
            }

            private C1670a() {
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{BATTERY, PLUGGED};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
            Companion = new C1670a(null);
            a[] aVarArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(aVarArrValues.length), 16));
            for (a aVar : aVarArrValues) {
                linkedHashMap.put(aVar.f45339id, aVar);
            }
            values = linkedHashMap;
        }

        private a(String str, int i10, String str2) {
            this.f45339id = str2;
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

        public final String getId() {
            return this.f45339id;
        }
    }

    public ApiV1DeviceStatistics(@Y6.g(name = "battery") Integer num, @Y6.g(name = "batteryV") Float f10, @Y6.g(name = "chargingState") String str, @Y6.g(name = "powerSource") String str2, @Y6.g(name = "isLowBattery") Boolean bool, @Y6.g(name = "uptime") Long l10, @Y6.g(name = "signalQuality") Integer num2, @Y6.g(name = "signalDbm") Integer num3) {
        this.batteryPercent = num;
        this.batteryVoltage = f10;
        this.changingStateId = str;
        this.powerSourceId = str2;
        this.isLowBattery = bool;
        this.uptime = l10;
        this.signalPercent = num2;
        this.signalDbm = num3;
    }

    /* renamed from: a, reason: from getter */
    public final Integer getBatteryPercent() {
        return this.batteryPercent;
    }

    /* renamed from: b, reason: from getter */
    public final Float getBatteryVoltage() {
        return this.batteryVoltage;
    }

    /* renamed from: c, reason: from getter */
    public final String getChangingStateId() {
        return this.changingStateId;
    }

    public final ApiV1DeviceStatistics copy(@Y6.g(name = "battery") Integer batteryPercent, @Y6.g(name = "batteryV") Float batteryVoltage, @Y6.g(name = "chargingState") String changingStateId, @Y6.g(name = "powerSource") String powerSourceId, @Y6.g(name = "isLowBattery") Boolean isLowBattery, @Y6.g(name = "uptime") Long uptime, @Y6.g(name = "signalQuality") Integer signalPercent, @Y6.g(name = "signalDbm") Integer signalDbm) {
        return new ApiV1DeviceStatistics(batteryPercent, batteryVoltage, changingStateId, powerSourceId, isLowBattery, uptime, signalPercent, signalDbm);
    }

    public final a d() {
        return (a) a.Companion.a().get(this.powerSourceId);
    }

    /* renamed from: e, reason: from getter */
    public final String getPowerSourceId() {
        return this.powerSourceId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiV1DeviceStatistics)) {
            return false;
        }
        ApiV1DeviceStatistics apiV1DeviceStatistics = (ApiV1DeviceStatistics) other;
        return AbstractC6492s.d(this.batteryPercent, apiV1DeviceStatistics.batteryPercent) && AbstractC6492s.d(this.batteryVoltage, apiV1DeviceStatistics.batteryVoltage) && AbstractC6492s.d(this.changingStateId, apiV1DeviceStatistics.changingStateId) && AbstractC6492s.d(this.powerSourceId, apiV1DeviceStatistics.powerSourceId) && AbstractC6492s.d(this.isLowBattery, apiV1DeviceStatistics.isLowBattery) && AbstractC6492s.d(this.uptime, apiV1DeviceStatistics.uptime) && AbstractC6492s.d(this.signalPercent, apiV1DeviceStatistics.signalPercent) && AbstractC6492s.d(this.signalDbm, apiV1DeviceStatistics.signalDbm);
    }

    /* renamed from: f, reason: from getter */
    public final Integer getSignalDbm() {
        return this.signalDbm;
    }

    /* renamed from: g, reason: from getter */
    public final Integer getSignalPercent() {
        return this.signalPercent;
    }

    /* renamed from: h, reason: from getter */
    public final Long getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        Integer num = this.batteryPercent;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f10 = this.batteryVoltage;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str = this.changingStateId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.powerSourceId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isLowBattery;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l10 = this.uptime;
        int iHashCode6 = (iHashCode5 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Integer num2 = this.signalPercent;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.signalDbm;
        return iHashCode7 + (num3 != null ? num3.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final Boolean getIsLowBattery() {
        return this.isLowBattery;
    }

    public String toString() {
        return "ApiV1DeviceStatistics(batteryPercent=" + this.batteryPercent + ", batteryVoltage=" + this.batteryVoltage + ", changingStateId=" + this.changingStateId + ", powerSourceId=" + this.powerSourceId + ", isLowBattery=" + this.isLowBattery + ", uptime=" + this.uptime + ", signalPercent=" + this.signalPercent + ", signalDbm=" + this.signalDbm + ")";
    }
}
