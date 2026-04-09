package mb;

import Zi.C3710i;
import Zi.H0;
import Zi.M;
import Zi.R0;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mb.v;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002$'B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006+"}, d2 = {"Lmb/f;", "Landroid/os/Parcelable;", "", "teleport", "Lmb/v;", "teleportState", "<init>", "(Ljava/lang/Boolean;Lmb/v;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lmb/v;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_COMMUNITY, "(Lmb/f;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", SnmpConfigurator.O_BIND_ADDRESS, "Lmb/v;", "()Lmb/v;", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.f, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class ControllerFeatures implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean teleport;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final v teleportState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ControllerFeatures> CREATOR = new c();

    /* renamed from: mb.f$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53789a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53789a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.ControllerFeatures", aVar, 2);
            h02.p("teleport", true);
            h02.p("teleportState", true);
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
            return new Vi.b[]{Wi.a.u(C3710i.f25639a), Wi.a.u(v.b.f53931f)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final ControllerFeatures c(Yi.e decoder) {
            Boolean bool;
            v vVar;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            R0 r02 = null;
            if (cVarC.B()) {
                bool = (Boolean) cVarC.h(fVar, 0, C3710i.f25639a, null);
                vVar = (v) cVarC.h(fVar, 1, v.b.f53931f, null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                bool = null;
                v vVar2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        bool = (Boolean) cVarC.h(fVar, 0, C3710i.f25639a, bool);
                        i11 |= 1;
                    } else {
                        if (iK != 1) {
                            throw new UnknownFieldException(iK);
                        }
                        vVar2 = (v) cVarC.h(fVar, 1, v.b.f53931f, vVar2);
                        i11 |= 2;
                    }
                }
                vVar = vVar2;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new ControllerFeatures(i10, bool, vVar, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, ControllerFeatures value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            ControllerFeatures.c(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.f$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53789a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mb.f$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ControllerFeatures createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            AbstractC6492s.i(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ControllerFeatures(boolValueOf, parcel.readInt() != 0 ? v.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ControllerFeatures[] newArray(int i10) {
            return new ControllerFeatures[i10];
        }
    }

    public /* synthetic */ ControllerFeatures(int i10, Boolean bool, v vVar, R0 r02) {
        if ((i10 & 1) == 0) {
            this.teleport = null;
        } else {
            this.teleport = bool;
        }
        if ((i10 & 2) == 0) {
            this.teleportState = null;
        } else {
            this.teleportState = vVar;
        }
    }

    public static final /* synthetic */ void c(ControllerFeatures self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || self.teleport != null) {
            output.t(serialDesc, 0, C3710i.f25639a, self.teleport);
        }
        if (!output.o(serialDesc, 1) && self.teleportState == null) {
            return;
        }
        output.t(serialDesc, 1, v.b.f53931f, self.teleportState);
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getTeleport() {
        return this.teleport;
    }

    /* renamed from: b, reason: from getter */
    public final v getTeleportState() {
        return this.teleportState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ControllerFeatures)) {
            return false;
        }
        ControllerFeatures controllerFeatures = (ControllerFeatures) other;
        return AbstractC6492s.d(this.teleport, controllerFeatures.teleport) && this.teleportState == controllerFeatures.teleportState;
    }

    public int hashCode() {
        Boolean bool = this.teleport;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        v vVar = this.teleportState;
        return iHashCode + (vVar != null ? vVar.hashCode() : 0);
    }

    public String toString() {
        return "ControllerFeatures(teleport=" + this.teleport + ", teleportState=" + this.teleportState + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC6492s.i(dest, "dest");
        Boolean bool = this.teleport;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        v vVar = this.teleportState;
        if (vVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(vVar.name());
        }
    }

    public ControllerFeatures(Boolean bool, v vVar) {
        this.teleport = bool;
        this.teleportState = vVar;
    }
}
