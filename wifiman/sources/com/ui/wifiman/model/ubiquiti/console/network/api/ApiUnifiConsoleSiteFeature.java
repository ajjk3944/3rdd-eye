package com.ui.wifiman.model.ubiquiti.console.network.api;

import Y6.g;
import Y6.i;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSiteFeature;", "", "", "supported", "", "name", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;)V", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;)Lcom/ui/wifiman/model/ubiquiti/console/network/api/ApiUnifiConsoleSiteFeature;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Boolean;", SnmpConfigurator.O_BIND_ADDRESS, "()Ljava/lang/Boolean;", "Ljava/lang/String;", "app-model_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@i(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ApiUnifiConsoleSiteFeature {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean supported;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a SPEED_TEST = new a("SPEED_TEST", 0, "SPEED_TEST");

        /* renamed from: id, reason: collision with root package name */
        private final String f43772id;

        private static final /* synthetic */ a[] $values() {
            return new a[]{SPEED_TEST};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
        }

        private a(String str, int i10, String str2) {
            this.f43772id = str2;
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
            return this.f43772id;
        }
    }

    public ApiUnifiConsoleSiteFeature(@g(name = "feature_exists") Boolean bool, @g(name = "name") String str) {
        this.supported = bool;
        this.name = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: b, reason: from getter */
    public final Boolean getSupported() {
        return this.supported;
    }

    public final ApiUnifiConsoleSiteFeature copy(@g(name = "feature_exists") Boolean supported, @g(name = "name") String name) {
        return new ApiUnifiConsoleSiteFeature(supported, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiUnifiConsoleSiteFeature)) {
            return false;
        }
        ApiUnifiConsoleSiteFeature apiUnifiConsoleSiteFeature = (ApiUnifiConsoleSiteFeature) other;
        return AbstractC6492s.d(this.supported, apiUnifiConsoleSiteFeature.supported) && AbstractC6492s.d(this.name, apiUnifiConsoleSiteFeature.name);
    }

    public int hashCode() {
        Boolean bool = this.supported;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.name;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ApiUnifiConsoleSiteFeature(supported=" + this.supported + ", name=" + this.name + ")";
    }
}
