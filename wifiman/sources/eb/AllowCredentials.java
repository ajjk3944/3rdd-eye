package Eb;

import Zg.AbstractC3689v;
import Zi.C0;
import Zi.C3704f;
import Zi.H0;
import Zi.M;
import Zi.R0;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002%\u0014B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b(\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"LEb/a;", "Landroid/os/Parcelable;", "", "id", "type", "", "transports", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(LEb/a;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getId", "getType", SnmpConfigurator.O_COMMUNITY, "Ljava/util/List;", "getTransports", "()Ljava/util/List;", "Companion", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class AllowCredentials implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List transports;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AllowCredentials> CREATOR = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final Vi.b[] f4421d = {null, null, new C3704f(W0.f25599a)};

    /* renamed from: Eb.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0186a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final C0186a f4425a;
        private static final Xi.f descriptor;

        static {
            C0186a c0186a = new C0186a();
            f4425a = c0186a;
            H0 h02 = new H0("com.ui.unifi.core.sso.models.AllowCredentials", c0186a, 3);
            h02.p("id", false);
            h02.p("type", false);
            h02.p("transports", true);
            descriptor = h02;
        }

        private C0186a() {
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public final Xi.f a() {
            return descriptor;
        }

        @Override // Zi.M
        public final Vi.b[] d() {
            Vi.b bVar = AllowCredentials.f4421d[2];
            W0 w02 = W0.f25599a;
            return new Vi.b[]{w02, w02, bVar};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final AllowCredentials c(Yi.e decoder) {
            int i10;
            String str;
            String str2;
            List list;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = AllowCredentials.f4421d;
            String strW = null;
            if (cVarC.B()) {
                String strW2 = cVarC.w(fVar, 0);
                String strW3 = cVarC.w(fVar, 1);
                list = (List) cVarC.p(fVar, 2, bVarArr[2], null);
                str = strW2;
                i10 = 7;
                str2 = strW3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String strW4 = null;
                List list2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        strW = cVarC.w(fVar, 0);
                        i11 |= 1;
                    } else if (iK == 1) {
                        strW4 = cVarC.w(fVar, 1);
                        i11 |= 2;
                    } else {
                        if (iK != 2) {
                            throw new UnknownFieldException(iK);
                        }
                        list2 = (List) cVarC.p(fVar, 2, bVarArr[2], list2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                str = strW;
                str2 = strW4;
                list = list2;
            }
            cVarC.b(fVar);
            return new AllowCredentials(i10, str, str2, list, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, AllowCredentials value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            AllowCredentials.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Eb.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return C0186a.f4425a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: Eb.a$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AllowCredentials createFromParcel(Parcel parcel) {
            AbstractC6492s.i(parcel, "parcel");
            return new AllowCredentials(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AllowCredentials[] newArray(int i10) {
            return new AllowCredentials[i10];
        }
    }

    public /* synthetic */ AllowCredentials(int i10, String str, String str2, List list, R0 r02) {
        if (3 != (i10 & 3)) {
            C0.a(i10, 3, C0186a.f4425a.a());
        }
        this.id = str;
        this.type = str2;
        if ((i10 & 4) == 0) {
            this.transports = AbstractC3689v.l();
        } else {
            this.transports = list;
        }
    }

    public static final /* synthetic */ void b(AllowCredentials self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f4421d;
        output.y(serialDesc, 0, self.id);
        output.y(serialDesc, 1, self.type);
        if (!output.o(serialDesc, 2) && AbstractC6492s.d(self.transports, AbstractC3689v.l())) {
            return;
        }
        output.q(serialDesc, 2, bVarArr[2], self.transports);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllowCredentials)) {
            return false;
        }
        AllowCredentials allowCredentials = (AllowCredentials) other;
        return AbstractC6492s.d(this.id, allowCredentials.id) && AbstractC6492s.d(this.type, allowCredentials.type) && AbstractC6492s.d(this.transports, allowCredentials.transports);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.transports.hashCode();
    }

    public String toString() {
        return "AllowCredentials(id=" + this.id + ", type=" + this.type + ", transports=" + this.transports + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC6492s.i(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.type);
        dest.writeStringList(this.transports);
    }

    public AllowCredentials(String id2, String type, List transports) {
        AbstractC6492s.i(id2, "id");
        AbstractC6492s.i(type, "type");
        AbstractC6492s.i(transports, "transports");
        this.id = id2;
        this.type = type;
        this.transports = transports;
    }
}
