package mb;

import Zi.C3704f;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W;
import Zi.W0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002),Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBg\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\"R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b,\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b-\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010\"R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lmb/k;", "Landroid/os/Parcelable;", "", "baseUrl", "apiPrefix", "entrypoint", "icon", "", "swaiVersion", "publicPath", "", "cdnPublicPaths", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_COMMUNITY, "(Lmb/k;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getBaseUrl", SnmpConfigurator.O_BIND_ADDRESS, "getEntrypoint", "d", "getIcon", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/lang/Integer;", "getSwaiVersion", "()Ljava/lang/Integer;", "f", "getPublicPath", "g", "Ljava/util/List;", "getCdnPublicPaths", "()Ljava/util/List;", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.k, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class ControllerUi implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String baseUrl;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apiPrefix;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String entrypoint;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String icon;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer swaiVersion;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String publicPath;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List cdnPublicPaths;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ControllerUi> CREATOR = new c();

    /* renamed from: h, reason: collision with root package name */
    private static final Vi.b[] f53801h = {null, null, null, null, null, null, new C3704f(W0.f25599a)};

    /* renamed from: mb.k$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53809a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53809a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.ControllerUi", aVar, 7);
            h02.p("baseUrl", true);
            h02.p("apiPrefix", true);
            h02.p("entrypoint", true);
            h02.p("icon", true);
            h02.p("swaiVersion", true);
            h02.p("publicPath", true);
            h02.p("cdnPublicPaths", true);
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
            Vi.b[] bVarArr = ControllerUi.f53801h;
            W0 w02 = W0.f25599a;
            return new Vi.b[]{Wi.a.u(w02), Wi.a.u(w02), Wi.a.u(w02), Wi.a.u(w02), Wi.a.u(W.f25597a), Wi.a.u(w02), Wi.a.u(bVarArr[6])};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final ControllerUi c(Yi.e decoder) {
            int i10;
            List list;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            Integer num;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = ControllerUi.f53801h;
            int i11 = 5;
            String str6 = null;
            if (cVarC.B()) {
                W0 w02 = W0.f25599a;
                String str7 = (String) cVarC.h(fVar, 0, w02, null);
                String str8 = (String) cVarC.h(fVar, 1, w02, null);
                String str9 = (String) cVarC.h(fVar, 2, w02, null);
                String str10 = (String) cVarC.h(fVar, 3, w02, null);
                Integer num2 = (Integer) cVarC.h(fVar, 4, W.f25597a, null);
                String str11 = (String) cVarC.h(fVar, 5, w02, null);
                list = (List) cVarC.h(fVar, 6, bVarArr[6], null);
                str = str11;
                i10 = 127;
                str5 = str10;
                num = num2;
                str4 = str9;
                str3 = str8;
                str2 = str7;
            } else {
                boolean z10 = true;
                int i12 = 0;
                List list2 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                Integer num3 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    switch (iK) {
                        case -1:
                            z10 = false;
                            i11 = 5;
                        case 0:
                            str6 = (String) cVarC.h(fVar, 0, W0.f25599a, str6);
                            i12 |= 1;
                            i11 = 5;
                        case 1:
                            str13 = (String) cVarC.h(fVar, 1, W0.f25599a, str13);
                            i12 |= 2;
                            i11 = 5;
                        case 2:
                            str14 = (String) cVarC.h(fVar, 2, W0.f25599a, str14);
                            i12 |= 4;
                            i11 = 5;
                        case 3:
                            str15 = (String) cVarC.h(fVar, 3, W0.f25599a, str15);
                            i12 |= 8;
                        case 4:
                            num3 = (Integer) cVarC.h(fVar, 4, W.f25597a, num3);
                            i12 |= 16;
                        case 5:
                            str12 = (String) cVarC.h(fVar, i11, W0.f25599a, str12);
                            i12 |= 32;
                        case 6:
                            list2 = (List) cVarC.h(fVar, 6, bVarArr[6], list2);
                            i12 |= 64;
                        default:
                            throw new UnknownFieldException(iK);
                    }
                }
                i10 = i12;
                list = list2;
                str = str12;
                str2 = str6;
                str3 = str13;
                str4 = str14;
                str5 = str15;
                num = num3;
            }
            cVarC.b(fVar);
            return new ControllerUi(i10, str2, str3, str4, str5, num, str, list, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, ControllerUi value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            ControllerUi.c(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.k$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53809a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mb.k$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ControllerUi createFromParcel(Parcel parcel) {
            AbstractC6492s.i(parcel, "parcel");
            return new ControllerUi(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ControllerUi[] newArray(int i10) {
            return new ControllerUi[i10];
        }
    }

    public /* synthetic */ ControllerUi(int i10, String str, String str2, String str3, String str4, Integer num, String str5, List list, R0 r02) {
        if ((i10 & 1) == 0) {
            this.baseUrl = null;
        } else {
            this.baseUrl = str;
        }
        if ((i10 & 2) == 0) {
            this.apiPrefix = null;
        } else {
            this.apiPrefix = str2;
        }
        if ((i10 & 4) == 0) {
            this.entrypoint = null;
        } else {
            this.entrypoint = str3;
        }
        if ((i10 & 8) == 0) {
            this.icon = null;
        } else {
            this.icon = str4;
        }
        if ((i10 & 16) == 0) {
            this.swaiVersion = null;
        } else {
            this.swaiVersion = num;
        }
        if ((i10 & 32) == 0) {
            this.publicPath = null;
        } else {
            this.publicPath = str5;
        }
        if ((i10 & 64) == 0) {
            this.cdnPublicPaths = null;
        } else {
            this.cdnPublicPaths = list;
        }
    }

    public static final /* synthetic */ void c(ControllerUi self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f53801h;
        if (output.o(serialDesc, 0) || self.baseUrl != null) {
            output.t(serialDesc, 0, W0.f25599a, self.baseUrl);
        }
        if (output.o(serialDesc, 1) || self.apiPrefix != null) {
            output.t(serialDesc, 1, W0.f25599a, self.apiPrefix);
        }
        if (output.o(serialDesc, 2) || self.entrypoint != null) {
            output.t(serialDesc, 2, W0.f25599a, self.entrypoint);
        }
        if (output.o(serialDesc, 3) || self.icon != null) {
            output.t(serialDesc, 3, W0.f25599a, self.icon);
        }
        if (output.o(serialDesc, 4) || self.swaiVersion != null) {
            output.t(serialDesc, 4, W.f25597a, self.swaiVersion);
        }
        if (output.o(serialDesc, 5) || self.publicPath != null) {
            output.t(serialDesc, 5, W0.f25599a, self.publicPath);
        }
        if (!output.o(serialDesc, 6) && self.cdnPublicPaths == null) {
            return;
        }
        output.t(serialDesc, 6, bVarArr[6], self.cdnPublicPaths);
    }

    /* renamed from: b, reason: from getter */
    public final String getApiPrefix() {
        return this.apiPrefix;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControllerUi)) {
            return false;
        }
        ControllerUi controllerUi = (ControllerUi) other;
        return AbstractC6492s.d(this.baseUrl, controllerUi.baseUrl) && AbstractC6492s.d(this.apiPrefix, controllerUi.apiPrefix) && AbstractC6492s.d(this.entrypoint, controllerUi.entrypoint) && AbstractC6492s.d(this.icon, controllerUi.icon) && AbstractC6492s.d(this.swaiVersion, controllerUi.swaiVersion) && AbstractC6492s.d(this.publicPath, controllerUi.publicPath) && AbstractC6492s.d(this.cdnPublicPaths, controllerUi.cdnPublicPaths);
    }

    public int hashCode() {
        String str = this.baseUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.apiPrefix;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entrypoint;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.icon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.swaiVersion;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.publicPath;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.cdnPublicPaths;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "ControllerUi(baseUrl=" + this.baseUrl + ", apiPrefix=" + this.apiPrefix + ", entrypoint=" + this.entrypoint + ", icon=" + this.icon + ", swaiVersion=" + this.swaiVersion + ", publicPath=" + this.publicPath + ", cdnPublicPaths=" + this.cdnPublicPaths + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        AbstractC6492s.i(dest, "dest");
        dest.writeString(this.baseUrl);
        dest.writeString(this.apiPrefix);
        dest.writeString(this.entrypoint);
        dest.writeString(this.icon);
        Integer num = this.swaiVersion;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.publicPath);
        dest.writeStringList(this.cdnPublicPaths);
    }

    public ControllerUi(String str, String str2, String str3, String str4, Integer num, String str5, List list) {
        this.baseUrl = str;
        this.apiPrefix = str2;
        this.entrypoint = str3;
        this.icon = str4;
        this.swaiVersion = num;
        this.publicPath = str5;
        this.cdnPublicPaths = list;
    }
}
