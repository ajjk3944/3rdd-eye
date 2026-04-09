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
import mb.UiDbImages;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002\u0014'B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lmb/C;", "Landroid/os/Parcelable;", "", "id", "guid", "Lmb/D;", "images", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmb/D;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lmb/D;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lmb/C;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", SnmpConfigurator.O_BIND_ADDRESS, "getGuid", SnmpConfigurator.O_COMMUNITY, "Lmb/D;", "getImages", "()Lmb/D;", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.C, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class UiDb implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String guid;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final UiDbImages images;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<UiDb> CREATOR = new c();

    /* renamed from: mb.C$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53700a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53700a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.UiDb", aVar, 3);
            h02.p("id", true);
            h02.p("guid", true);
            h02.p("images", true);
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
            return new Vi.b[]{Wi.a.u(w02), Wi.a.u(w02), Wi.a.u(UiDbImages.a.f53704a)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final UiDb c(Yi.e decoder) {
            int i10;
            String str;
            String str2;
            UiDbImages uiDbImages;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            String str3 = null;
            if (cVarC.B()) {
                W0 w02 = W0.f25599a;
                String str4 = (String) cVarC.h(fVar, 0, w02, null);
                str2 = (String) cVarC.h(fVar, 1, w02, null);
                uiDbImages = (UiDbImages) cVarC.h(fVar, 2, UiDbImages.a.f53704a, null);
                i10 = 7;
                str = str4;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str5 = null;
                UiDbImages uiDbImages2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        str3 = (String) cVarC.h(fVar, 0, W0.f25599a, str3);
                        i11 |= 1;
                    } else if (iK == 1) {
                        str5 = (String) cVarC.h(fVar, 1, W0.f25599a, str5);
                        i11 |= 2;
                    } else {
                        if (iK != 2) {
                            throw new UnknownFieldException(iK);
                        }
                        uiDbImages2 = (UiDbImages) cVarC.h(fVar, 2, UiDbImages.a.f53704a, uiDbImages2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                str = str3;
                str2 = str5;
                uiDbImages = uiDbImages2;
            }
            cVarC.b(fVar);
            return new UiDb(i10, str, str2, uiDbImages, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, UiDb value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            UiDb.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.C$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53700a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mb.C$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UiDb createFromParcel(Parcel parcel) {
            AbstractC6492s.i(parcel, "parcel");
            return new UiDb(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : UiDbImages.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UiDb[] newArray(int i10) {
            return new UiDb[i10];
        }
    }

    public /* synthetic */ UiDb(int i10, String str, String str2, UiDbImages uiDbImages, R0 r02) {
        if ((i10 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i10 & 2) == 0) {
            this.guid = null;
        } else {
            this.guid = str2;
        }
        if ((i10 & 4) == 0) {
            this.images = null;
        } else {
            this.images = uiDbImages;
        }
    }

    public static final /* synthetic */ void a(UiDb self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || self.id != null) {
            output.t(serialDesc, 0, W0.f25599a, self.id);
        }
        if (output.o(serialDesc, 1) || self.guid != null) {
            output.t(serialDesc, 1, W0.f25599a, self.guid);
        }
        if (!output.o(serialDesc, 2) && self.images == null) {
            return;
        }
        output.t(serialDesc, 2, UiDbImages.a.f53704a, self.images);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiDb)) {
            return false;
        }
        UiDb uiDb = (UiDb) other;
        return AbstractC6492s.d(this.id, uiDb.id) && AbstractC6492s.d(this.guid, uiDb.guid) && AbstractC6492s.d(this.images, uiDb.images);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.guid;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiDbImages uiDbImages = this.images;
        return iHashCode2 + (uiDbImages != null ? uiDbImages.hashCode() : 0);
    }

    public String toString() {
        return "UiDb(id=" + this.id + ", guid=" + this.guid + ", images=" + this.images + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC6492s.i(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.guid);
        UiDbImages uiDbImages = this.images;
        if (uiDbImages == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            uiDbImages.writeToParcel(dest, flags);
        }
    }

    public UiDb(String str, String str2, UiDbImages uiDbImages) {
        this.id = str;
        this.guid = str2;
        this.images = uiDbImages;
    }
}
