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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002\u0013&B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010$\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u001d¨\u0006-"}, d2 = {"Lmb/D;", "Landroid/os/Parcelable;", "", "default", "noPadding", "topology", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lmb/D;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDefault", SnmpConfigurator.O_BIND_ADDRESS, "getNoPadding", "getNoPadding$annotations", "()V", SnmpConfigurator.O_COMMUNITY, "getTopology", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.D, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class UiDbImages implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String default;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String noPadding;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String topology;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<UiDbImages> CREATOR = new c();

    /* renamed from: mb.D$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53704a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53704a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.UiDbImages", aVar, 3);
            h02.p("default", true);
            h02.p("nopadding", true);
            h02.p("topology", true);
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
            return new Vi.b[]{Wi.a.u(w02), Wi.a.u(w02), Wi.a.u(w02)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final UiDbImages c(Yi.e decoder) {
            int i10;
            String str;
            String str2;
            String str3;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            String str4 = null;
            if (cVarC.B()) {
                W0 w02 = W0.f25599a;
                String str5 = (String) cVarC.h(fVar, 0, w02, null);
                String str6 = (String) cVarC.h(fVar, 1, w02, null);
                str3 = (String) cVarC.h(fVar, 2, w02, null);
                i10 = 7;
                str2 = str6;
                str = str5;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str7 = null;
                String str8 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        str4 = (String) cVarC.h(fVar, 0, W0.f25599a, str4);
                        i11 |= 1;
                    } else if (iK == 1) {
                        str7 = (String) cVarC.h(fVar, 1, W0.f25599a, str7);
                        i11 |= 2;
                    } else {
                        if (iK != 2) {
                            throw new UnknownFieldException(iK);
                        }
                        str8 = (String) cVarC.h(fVar, 2, W0.f25599a, str8);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                str = str4;
                str2 = str7;
                str3 = str8;
            }
            cVarC.b(fVar);
            return new UiDbImages(i10, str, str2, str3, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, UiDbImages value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            UiDbImages.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.D$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53704a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mb.D$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UiDbImages createFromParcel(Parcel parcel) {
            AbstractC6492s.i(parcel, "parcel");
            return new UiDbImages(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UiDbImages[] newArray(int i10) {
            return new UiDbImages[i10];
        }
    }

    public /* synthetic */ UiDbImages(int i10, String str, String str2, String str3, R0 r02) {
        if ((i10 & 1) == 0) {
            this.default = null;
        } else {
            this.default = str;
        }
        if ((i10 & 2) == 0) {
            this.noPadding = null;
        } else {
            this.noPadding = str2;
        }
        if ((i10 & 4) == 0) {
            this.topology = null;
        } else {
            this.topology = str3;
        }
    }

    public static final /* synthetic */ void a(UiDbImages self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || self.default != null) {
            output.t(serialDesc, 0, W0.f25599a, self.default);
        }
        if (output.o(serialDesc, 1) || self.noPadding != null) {
            output.t(serialDesc, 1, W0.f25599a, self.noPadding);
        }
        if (!output.o(serialDesc, 2) && self.topology == null) {
            return;
        }
        output.t(serialDesc, 2, W0.f25599a, self.topology);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiDbImages)) {
            return false;
        }
        UiDbImages uiDbImages = (UiDbImages) other;
        return AbstractC6492s.d(this.default, uiDbImages.default) && AbstractC6492s.d(this.noPadding, uiDbImages.noPadding) && AbstractC6492s.d(this.topology, uiDbImages.topology);
    }

    public int hashCode() {
        String str = this.default;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.noPadding;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.topology;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "UiDbImages(default=" + this.default + ", noPadding=" + this.noPadding + ", topology=" + this.topology + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC6492s.i(dest, "dest");
        dest.writeString(this.default);
        dest.writeString(this.noPadding);
        dest.writeString(this.topology);
    }

    public UiDbImages(String str, String str2, String str3) {
        this.default = str;
        this.noPadding = str2;
        this.topology = str3;
    }
}
