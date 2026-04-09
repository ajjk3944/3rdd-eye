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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002%(B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b)\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b%\u0010\u001e¨\u0006+"}, d2 = {"Lmb/p;", "Landroid/os/Parcelable;", "", "shortname", "subtype", "name", "firmwareVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "d", "(Lmb/p;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, SnmpConfigurator.O_BIND_ADDRESS, "getSubtype", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.p, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class Hardware implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shortname;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String subtype;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firmwareVersion;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<Hardware> CREATOR = new c();

    /* renamed from: mb.p$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53858a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53858a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.Hardware", aVar, 4);
            h02.p("shortname", true);
            h02.p("subtype", true);
            h02.p("name", true);
            h02.p("firmwareVersion", true);
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
            W0 w02 = W0.f25599a;
            return new Vi.b[]{Wi.a.u(w02), Wi.a.u(w02), Wi.a.u(w02), Wi.a.u(w02)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Hardware c(Yi.e decoder) {
            int i10;
            String str;
            String str2;
            String str3;
            String str4;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            String str5 = null;
            if (cVarC.B()) {
                W0 w02 = W0.f25599a;
                String str6 = (String) cVarC.h(fVar, 0, w02, null);
                String str7 = (String) cVarC.h(fVar, 1, w02, null);
                String str8 = (String) cVarC.h(fVar, 2, w02, null);
                str4 = (String) cVarC.h(fVar, 3, w02, null);
                i10 = 15;
                str3 = str8;
                str2 = str7;
                str = str6;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        str5 = (String) cVarC.h(fVar, 0, W0.f25599a, str5);
                        i11 |= 1;
                    } else if (iK == 1) {
                        str9 = (String) cVarC.h(fVar, 1, W0.f25599a, str9);
                        i11 |= 2;
                    } else if (iK == 2) {
                        str10 = (String) cVarC.h(fVar, 2, W0.f25599a, str10);
                        i11 |= 4;
                    } else {
                        if (iK != 3) {
                            throw new UnknownFieldException(iK);
                        }
                        str11 = (String) cVarC.h(fVar, 3, W0.f25599a, str11);
                        i11 |= 8;
                    }
                }
                i10 = i11;
                str = str5;
                str2 = str9;
                str3 = str10;
                str4 = str11;
            }
            cVarC.b(fVar);
            return new Hardware(i10, str, str2, str3, str4, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, Hardware value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            Hardware.d(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.p$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53858a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mb.p$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Hardware createFromParcel(Parcel parcel) {
            AbstractC6492s.i(parcel, "parcel");
            return new Hardware(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Hardware[] newArray(int i10) {
            return new Hardware[i10];
        }
    }

    public /* synthetic */ Hardware(int i10, String str, String str2, String str3, String str4, R0 r02) {
        if ((i10 & 1) == 0) {
            this.shortname = null;
        } else {
            this.shortname = str;
        }
        if ((i10 & 2) == 0) {
            this.subtype = null;
        } else {
            this.subtype = str2;
        }
        if ((i10 & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i10 & 8) == 0) {
            this.firmwareVersion = null;
        } else {
            this.firmwareVersion = str4;
        }
    }

    public static final /* synthetic */ void d(Hardware self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || self.shortname != null) {
            output.t(serialDesc, 0, W0.f25599a, self.shortname);
        }
        if (output.o(serialDesc, 1) || self.subtype != null) {
            output.t(serialDesc, 1, W0.f25599a, self.subtype);
        }
        if (output.o(serialDesc, 2) || self.name != null) {
            output.t(serialDesc, 2, W0.f25599a, self.name);
        }
        if (!output.o(serialDesc, 3) && self.firmwareVersion == null) {
            return;
        }
        output.t(serialDesc, 3, W0.f25599a, self.firmwareVersion);
    }

    /* renamed from: a, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: c, reason: from getter */
    public final String getShortname() {
        return this.shortname;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Hardware)) {
            return false;
        }
        Hardware hardware = (Hardware) other;
        return AbstractC6492s.d(this.shortname, hardware.shortname) && AbstractC6492s.d(this.subtype, hardware.subtype) && AbstractC6492s.d(this.name, hardware.name) && AbstractC6492s.d(this.firmwareVersion, hardware.firmwareVersion);
    }

    public int hashCode() {
        String str = this.shortname;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtype;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firmwareVersion;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Hardware(shortname=" + this.shortname + ", subtype=" + this.subtype + ", name=" + this.name + ", firmwareVersion=" + this.firmwareVersion + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC6492s.i(dest, "dest");
        dest.writeString(this.shortname);
        dest.writeString(this.subtype);
        dest.writeString(this.name);
        dest.writeString(this.firmwareVersion);
    }

    public Hardware(String str, String str2, String str3, String str4) {
        this.shortname = str;
        this.subtype = str2;
        this.name = str3;
        this.firmwareVersion = str4;
    }
}
