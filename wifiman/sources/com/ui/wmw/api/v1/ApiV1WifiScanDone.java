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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;", "", "", "scanDoneId", "<init>", "(Ljava/lang/Integer;)V", "copy", "(Ljava/lang/Integer;)Lcom/ui/wmw/api/v1/ApiV1WifiScanDone;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Lcom/ui/wmw/api/v1/ApiV1WifiScanDone$a;", SnmpConfigurator.O_BIND_ADDRESS, "()Lcom/ui/wmw/api/v1/ApiV1WifiScanDone$a;", "state", "wifiman-wizard_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Y6.i(generateAdapter = true)
/* loaded from: classes4.dex */
public final /* data */ class ApiV1WifiScanDone {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer scanDoneId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C1671a Companion;
        public static final a DONE = new a("DONE", 0, 1);
        public static final a NOTHING_FOUND = new a("NOTHING_FOUND", 1, 0);
        private static final Map<Integer, a> values;

        /* renamed from: id, reason: collision with root package name */
        private final int f45393id;

        /* renamed from: com.ui.wmw.api.v1.ApiV1WifiScanDone$a$a, reason: collision with other inner class name */
        public static final class C1671a {
            public /* synthetic */ C1671a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Map a() {
                return a.values;
            }

            private C1671a() {
            }
        }

        private static final /* synthetic */ a[] $values() {
            return new a[]{DONE, NOTHING_FOUND};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = AbstractC5827b.a(aVarArr$values);
            Companion = new C1671a(null);
            a[] aVarArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(aVarArrValues.length), 16));
            for (a aVar : aVarArrValues) {
                linkedHashMap.put(Integer.valueOf(aVar.f45393id), aVar);
            }
            values = linkedHashMap;
        }

        private a(String str, int i10, int i11) {
            this.f45393id = i11;
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

        public final int getId() {
            return this.f45393id;
        }
    }

    public ApiV1WifiScanDone(@Y6.g(name = "scan_done") Integer num) {
        this.scanDoneId = num;
    }

    /* renamed from: a, reason: from getter */
    public final Integer getScanDoneId() {
        return this.scanDoneId;
    }

    public final a b() {
        return (a) a.Companion.a().get(this.scanDoneId);
    }

    public final ApiV1WifiScanDone copy(@Y6.g(name = "scan_done") Integer scanDoneId) {
        return new ApiV1WifiScanDone(scanDoneId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ApiV1WifiScanDone) && AbstractC6492s.d(this.scanDoneId, ((ApiV1WifiScanDone) other).scanDoneId);
    }

    public int hashCode() {
        Integer num = this.scanDoneId;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "ApiV1WifiScanDone(scanDoneId=" + this.scanDoneId + ")";
    }
}
