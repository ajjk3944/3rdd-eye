package mb;

import Zi.C3704f;
import Zi.H0;
import Zi.M;
import Zi.R0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mb.ConsoleFeatures;
import mb.j;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 42\u00020\u0001:\u0002'\u0015B7\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b%\u0010&R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b)\u0010*R(\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010(\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010*R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010,\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lmb/c;", "Landroid/os/Parcelable;", "", "Lmb/j;", "controllers", "apps", "Lmb/e;", "features", "<init>", "(Ljava/util/List;Ljava/util/List;Lmb/e;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lmb/e;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Lmb/c;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", "getControllers", "()Ljava/util/List;", "getControllers$annotations", "()V", "getApps", "getApps$annotations", SnmpConfigurator.O_COMMUNITY, "Lmb/e;", "getFeatures", "()Lmb/e;", "getFeatures$annotations", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class AvailableControllers implements Parcelable {

    /* renamed from: d, reason: collision with root package name */
    private static final Vi.b[] f53761d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List controllers;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List apps;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ConsoleFeatures features;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AvailableControllers> CREATOR = new C1956c();

    /* renamed from: mb.c$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53765a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53765a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.AvailableControllers", aVar, 3);
            h02.p("controllers", true);
            h02.p("apps", true);
            h02.p("features", true);
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
            Vi.b[] bVarArr = AvailableControllers.f53761d;
            return new Vi.b[]{Wi.a.u(bVarArr[0]), Wi.a.u(bVarArr[1]), Wi.a.u(ConsoleFeatures.a.f53781a)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final AvailableControllers c(Yi.e decoder) {
            int i10;
            List list;
            List list2;
            ConsoleFeatures consoleFeatures;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = AvailableControllers.f53761d;
            List list3 = null;
            if (cVarC.B()) {
                List list4 = (List) cVarC.h(fVar, 0, bVarArr[0], null);
                list2 = (List) cVarC.h(fVar, 1, bVarArr[1], null);
                list = list4;
                consoleFeatures = (ConsoleFeatures) cVarC.h(fVar, 2, ConsoleFeatures.a.f53781a, null);
                i10 = 7;
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list5 = null;
                ConsoleFeatures consoleFeatures2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        list3 = (List) cVarC.h(fVar, 0, bVarArr[0], list3);
                        i11 |= 1;
                    } else if (iK == 1) {
                        list5 = (List) cVarC.h(fVar, 1, bVarArr[1], list5);
                        i11 |= 2;
                    } else {
                        if (iK != 2) {
                            throw new UnknownFieldException(iK);
                        }
                        consoleFeatures2 = (ConsoleFeatures) cVarC.h(fVar, 2, ConsoleFeatures.a.f53781a, consoleFeatures2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                list = list3;
                list2 = list5;
                consoleFeatures = consoleFeatures2;
            }
            cVarC.b(fVar);
            return new AvailableControllers(i10, list, list2, consoleFeatures, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, AvailableControllers value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            AvailableControllers.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53765a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: mb.c$c, reason: collision with other inner class name */
    public static final class C1956c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AvailableControllers createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            AbstractC6492s.i(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                arrayList = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList.add(j.valueOf(parcel.readString()));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i12 = parcel.readInt();
                arrayList2 = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList2.add(j.valueOf(parcel.readString()));
                }
            }
            return new AvailableControllers(arrayList, arrayList2, parcel.readInt() != 0 ? ConsoleFeatures.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AvailableControllers[] newArray(int i10) {
            return new AvailableControllers[i10];
        }
    }

    static {
        j.b bVar = j.b.f53799f;
        f53761d = new Vi.b[]{new C3704f(bVar), new C3704f(bVar), null};
    }

    public /* synthetic */ AvailableControllers(int i10, List list, List list2, ConsoleFeatures consoleFeatures, R0 r02) {
        if ((i10 & 1) == 0) {
            this.controllers = null;
        } else {
            this.controllers = list;
        }
        if ((i10 & 2) == 0) {
            this.apps = null;
        } else {
            this.apps = list2;
        }
        if ((i10 & 4) == 0) {
            this.features = null;
        } else {
            this.features = consoleFeatures;
        }
    }

    public static final /* synthetic */ void b(AvailableControllers self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f53761d;
        if (output.o(serialDesc, 0) || self.controllers != null) {
            output.t(serialDesc, 0, bVarArr[0], self.controllers);
        }
        if (output.o(serialDesc, 1) || self.apps != null) {
            output.t(serialDesc, 1, bVarArr[1], self.apps);
        }
        if (!output.o(serialDesc, 2) && self.features == null) {
            return;
        }
        output.t(serialDesc, 2, ConsoleFeatures.a.f53781a, self.features);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableControllers)) {
            return false;
        }
        AvailableControllers availableControllers = (AvailableControllers) other;
        return AbstractC6492s.d(this.controllers, availableControllers.controllers) && AbstractC6492s.d(this.apps, availableControllers.apps) && AbstractC6492s.d(this.features, availableControllers.features);
    }

    public int hashCode() {
        List list = this.controllers;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.apps;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        ConsoleFeatures consoleFeatures = this.features;
        return iHashCode2 + (consoleFeatures != null ? consoleFeatures.hashCode() : 0);
    }

    public String toString() {
        return "AvailableControllers(controllers=" + this.controllers + ", apps=" + this.apps + ", features=" + this.features + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC6492s.i(dest, "dest");
        List list = this.controllers;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(((j) it.next()).name());
            }
        }
        List list2 = this.apps;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeString(((j) it2.next()).name());
            }
        }
        ConsoleFeatures consoleFeatures = this.features;
        if (consoleFeatures == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            consoleFeatures.writeToParcel(dest, flags);
        }
    }

    public AvailableControllers(List list, List list2, ConsoleFeatures consoleFeatures) {
        this.controllers = list;
        this.apps = list2;
        this.features = consoleFeatures;
    }
}
