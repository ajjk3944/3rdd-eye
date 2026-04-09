package gb;

import Zi.C3704f;
import Zi.R0;
import Zi.W0;
import gb.UnadoptedOsDevice;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002\u001e\u0014B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lgb/n;", "", "", "model", "", "Lgb/m;", "devices", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Lgb/n;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getModel", "getModel$annotations", "()V", "Ljava/util/List;", "getDevices", "()Ljava/util/List;", "getDevices$annotations", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gb.n, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class UnadoptedOsDevices {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Vi.b[] f47816c = {null, new C3704f(UnadoptedOsDevice.a.f47815a)};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String model;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List devices;

    /* renamed from: gb.n$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f47819a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UnadoptedOsDevices(int i10, String str, List list, R0 r02) {
        if ((i10 & 1) == 0) {
            this.model = null;
        } else {
            this.model = str;
        }
        if ((i10 & 2) == 0) {
            this.devices = null;
        } else {
            this.devices = list;
        }
    }

    public static final /* synthetic */ void b(UnadoptedOsDevices self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f47816c;
        if (output.o(serialDesc, 0) || self.model != null) {
            output.t(serialDesc, 0, W0.f25599a, self.model);
        }
        if (!output.o(serialDesc, 1) && self.devices == null) {
            return;
        }
        output.t(serialDesc, 1, bVarArr[1], self.devices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnadoptedOsDevices)) {
            return false;
        }
        UnadoptedOsDevices unadoptedOsDevices = (UnadoptedOsDevices) other;
        return AbstractC6492s.d(this.model, unadoptedOsDevices.model) && AbstractC6492s.d(this.devices, unadoptedOsDevices.devices);
    }

    public int hashCode() {
        String str = this.model;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.devices;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "UnadoptedOsDevices(model=" + this.model + ", devices=" + this.devices + ")";
    }

    public UnadoptedOsDevices(String str, List list) {
        this.model = str;
        this.devices = list;
    }
}
