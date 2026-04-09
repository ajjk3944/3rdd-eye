package mb;

import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002&*B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b&\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b+\u0010\u001f¨\u0006."}, d2 = {"Lmb/h;", "Landroid/os/Parcelable;", "", "radius", "lat", "long", "", "text", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "d", "(Lmb/h;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Double;", "getRadius", "()Ljava/lang/Double;", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.h, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class ControllerLocation implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double radius;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double lat;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Double long;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ControllerLocation> CREATOR = new c();

    /* renamed from: mb.h$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53796a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53796a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.ControllerLocation", aVar, 4);
            h02.p("radius", true);
            h02.p("lat", true);
            h02.p("long", true);
            h02.p("text", true);
            descriptor = h02;
        }

        private a() {
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public final Xi.f a() {
            return descriptor;
        }

        @Override // Zi.M
        public final Vi.b[] d() {
            Zi.C c10 = Zi.C.f25533a;
            return new Vi.b[]{Wi.a.u(c10), Wi.a.u(c10), Wi.a.u(c10), Wi.a.u(W0.f25599a)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final ControllerLocation c(Yi.e decoder) {
            int i10;
            Double d10;
            Double d11;
            Double d12;
            String str;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Double d13 = null;
            if (cVarC.B()) {
                Zi.C c10 = Zi.C.f25533a;
                Double d14 = (Double) cVarC.h(fVar, 0, c10, null);
                Double d15 = (Double) cVarC.h(fVar, 1, c10, null);
                d12 = (Double) cVarC.h(fVar, 2, c10, null);
                str = (String) cVarC.h(fVar, 3, W0.f25599a, null);
                i10 = 15;
                d11 = d15;
                d10 = d14;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Double d16 = null;
                Double d17 = null;
                String str2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        d13 = (Double) cVarC.h(fVar, 0, Zi.C.f25533a, d13);
                        i11 |= 1;
                    } else if (iK == 1) {
                        d16 = (Double) cVarC.h(fVar, 1, Zi.C.f25533a, d16);
                        i11 |= 2;
                    } else if (iK == 2) {
                        d17 = (Double) cVarC.h(fVar, 2, Zi.C.f25533a, d17);
                        i11 |= 4;
                    } else {
                        if (iK != 3) {
                            throw new UnknownFieldException(iK);
                        }
                        str2 = (String) cVarC.h(fVar, 3, W0.f25599a, str2);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                d10 = d13;
                d11 = d16;
                d12 = d17;
                str = str2;
            }
            cVarC.b(fVar);
            return new ControllerLocation(i10, d10, d11, d12, str, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, ControllerLocation value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            ControllerLocation.d(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.h$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53796a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mb.h$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ControllerLocation createFromParcel(Parcel parcel) {
            AbstractC6492s.i(parcel, "parcel");
            return new ControllerLocation(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ControllerLocation[] newArray(int i10) {
            return new ControllerLocation[i10];
        }
    }

    public /* synthetic */ ControllerLocation(int i10, Double d10, Double d11, Double d12, String str, R0 r02) {
        if ((i10 & 1) == 0) {
            this.radius = null;
        } else {
            this.radius = d10;
        }
        if ((i10 & 2) == 0) {
            this.lat = null;
        } else {
            this.lat = d11;
        }
        if ((i10 & 4) == 0) {
            this.long = null;
        } else {
            this.long = d12;
        }
        if ((i10 & 8) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
    }

    public static final /* synthetic */ void d(ControllerLocation self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || self.radius != null) {
            output.t(serialDesc, 0, Zi.C.f25533a, self.radius);
        }
        if (output.o(serialDesc, 1) || self.lat != null) {
            output.t(serialDesc, 1, Zi.C.f25533a, self.lat);
        }
        if (output.o(serialDesc, 2) || self.long != null) {
            output.t(serialDesc, 2, Zi.C.f25533a, self.long);
        }
        if (!output.o(serialDesc, 3) && self.text == null) {
            return;
        }
        output.t(serialDesc, 3, W0.f25599a, self.text);
    }

    /* renamed from: a, reason: from getter */
    public final Double getLat() {
        return this.lat;
    }

    /* renamed from: b, reason: from getter */
    public final Double getLong() {
        return this.long;
    }

    /* renamed from: c, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControllerLocation)) {
            return false;
        }
        ControllerLocation controllerLocation = (ControllerLocation) other;
        return AbstractC6492s.d(this.radius, controllerLocation.radius) && AbstractC6492s.d(this.lat, controllerLocation.lat) && AbstractC6492s.d(this.long, controllerLocation.long) && AbstractC6492s.d(this.text, controllerLocation.text);
    }

    public int hashCode() {
        Double d10 = this.radius;
        int iHashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.lat;
        int iHashCode2 = (iHashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.long;
        int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str = this.text;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ControllerLocation(radius=" + this.radius + ", lat=" + this.lat + ", long=" + this.long + ", text=" + this.text + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC6492s.i(dest, "dest");
        Double d10 = this.radius;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        Double d11 = this.lat;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        Double d12 = this.long;
        if (d12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d12.doubleValue());
        }
        dest.writeString(this.text);
    }

    public ControllerLocation(Double d10, Double d11, Double d12, String str) {
        this.radius = d10;
        this.lat = d11;
        this.long = d12;
        this.text = str;
    }
}
