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

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016BM\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJV\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006!"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;", "", "", "modeId", "", "intervalMin", "intervalMax", "timeout", "latency", "", "enableLatency", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/ui/wmw/api/v1/ApiV1BluetoothSettings;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, SnmpConfigurator.O_BIND_ADDRESS, "Ljava/lang/Integer;", SnmpConfigurator.O_COMMUNITY, "()Ljava/lang/Integer;", "d", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Y6.i(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ApiV1BluetoothSettings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String modeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer intervalMin;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer intervalMax;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer timeout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer latency;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean enableLatency;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C1669a Companion;
        private static final Map<String, a> values;

        /* renamed from: id, reason: collision with root package name */
        private final String f45313id;
        public static final a FAST = new a("FAST", 0, "fast");
        public static final a MAX = new a("MAX", 1, "max");
        public static final a SLOW = new a("SLOW", 2, "slow");
        public static final a CUSTOM = new a("CUSTOM", 3, "custom");

        /* renamed from: com.ui.wmw.api.v1.ApiV1BluetoothSettings$a$a, reason: collision with other inner class name */
        public static final class C1669a {
            public /* synthetic */ C1669a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1669a() {
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{FAST, MAX, SLOW, CUSTOM};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
            Companion = new C1669a(null);
            a[] aVarArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(aVarArrValues.length), 16));
            for (a aVar : aVarArrValues) {
                linkedHashMap.put(aVar.f45313id, aVar);
            }
            values = linkedHashMap;
        }

        private a(String str, int i10, String str2) {
            this.f45313id = str2;
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
            return this.f45313id;
        }
    }

    public ApiV1BluetoothSettings(@Y6.g(name = "btMode") String modeId, @Y6.g(name = "intervalMin") Integer num, @Y6.g(name = "intervalMax") Integer num2, @Y6.g(name = "timeout") Integer num3, @Y6.g(name = "latency") Integer num4, @Y6.g(name = "enableLatency") Boolean bool) {
        AbstractC6492s.i(modeId, "modeId");
        this.modeId = modeId;
        this.intervalMin = num;
        this.intervalMax = num2;
        this.timeout = num3;
        this.latency = num4;
        this.enableLatency = bool;
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getEnableLatency() {
        return this.enableLatency;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getIntervalMax() {
        return this.intervalMax;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getIntervalMin() {
        return this.intervalMin;
    }

    public final ApiV1BluetoothSettings copy(@Y6.g(name = "btMode") String modeId, @Y6.g(name = "intervalMin") Integer intervalMin, @Y6.g(name = "intervalMax") Integer intervalMax, @Y6.g(name = "timeout") Integer timeout, @Y6.g(name = "latency") Integer latency, @Y6.g(name = "enableLatency") Boolean enableLatency) {
        AbstractC6492s.i(modeId, "modeId");
        return new ApiV1BluetoothSettings(modeId, intervalMin, intervalMax, timeout, latency, enableLatency);
    }

    /* renamed from: d, reason: from getter */
    public final Integer getLatency() {
        return this.latency;
    }

    /* renamed from: e, reason: from getter */
    public final String getModeId() {
        return this.modeId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiV1BluetoothSettings)) {
            return false;
        }
        ApiV1BluetoothSettings apiV1BluetoothSettings = (ApiV1BluetoothSettings) other;
        return AbstractC6492s.d(this.modeId, apiV1BluetoothSettings.modeId) && AbstractC6492s.d(this.intervalMin, apiV1BluetoothSettings.intervalMin) && AbstractC6492s.d(this.intervalMax, apiV1BluetoothSettings.intervalMax) && AbstractC6492s.d(this.timeout, apiV1BluetoothSettings.timeout) && AbstractC6492s.d(this.latency, apiV1BluetoothSettings.latency) && AbstractC6492s.d(this.enableLatency, apiV1BluetoothSettings.enableLatency);
    }

    /* renamed from: f, reason: from getter */
    public final Integer getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        int iHashCode = this.modeId.hashCode() * 31;
        Integer num = this.intervalMin;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.intervalMax;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.timeout;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.latency;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Boolean bool = this.enableLatency;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "ApiV1BluetoothSettings(modeId=" + this.modeId + ", intervalMin=" + this.intervalMin + ", intervalMax=" + this.intervalMax + ", timeout=" + this.timeout + ", latency=" + this.latency + ", enableLatency=" + this.enableLatency + ")";
    }

    public /* synthetic */ ApiV1BluetoothSettings(String str, Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : num3, (i10 & 16) != 0 ? null : num4, (i10 & 32) == 0 ? bool : null);
    }
}
