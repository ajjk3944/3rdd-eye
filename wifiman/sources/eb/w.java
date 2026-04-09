package Eb;

import Eb.w;
import Vi.InterfaceC3627a;
import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W;
import Zi.W0;
import android.os.Parcel;
import android.os.Parcelable;
import cj.C4270b;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlinx.serialization.UnknownFieldException;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00192\u00020\u0001:\t\u001a\u001b\u0016\u001c\u000f\u001d\u001e\u001f\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0007 !\"#$%&¨\u0006'"}, d2 = {"LEb/w;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "i", "(LEb/w;LYi/d;LXi/f;)V", "", "f", "()Ljava/lang/String;", "id", "LEb/w$f;", "g", "()LEb/w$f;", "status", "Companion", SnmpConfigurator.O_COMMUNITY, SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "d", SnmpConfigurator.O_AUTH_PROTOCOL, "h", SnmpConfigurator.O_BIND_ADDRESS, "LEb/w$a;", "LEb/w$c;", "LEb/w$d;", "LEb/w$e;", "LEb/w$g;", "LEb/w$h;", "LEb/w$i;", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class w implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final cj.e f4515a;

    /* renamed from: b, reason: collision with root package name */
    private static final Yg.m f4516b;

    @Vi.n
    @Vi.m("backup_code")
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000223B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u001c¨\u00064"}, d2 = {"LEb/w$a;", "LEb/w;", "", "id", "LEb/w$f;", "status", "", "codesLeft", "<init>", "(Ljava/lang/String;LEb/w$f;I)V", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;LEb/w$f;ILZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "j", "(LEb/w$a;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "f", "d", "LEb/w$f;", "g", "()LEb/w$f;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "I", "getCodesLeft", "getCodesLeft$annotations", "()V", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eb.w$a, reason: from toString */
    public static final /* data */ class Backup extends w {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final f status;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final int codesLeft;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Backup> CREATOR = new c();

        /* renamed from: Eb.w$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0188a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final C0188a f4520a;
            private static final Xi.f descriptor;

            static {
                C0188a c0188a = new C0188a();
                f4520a = c0188a;
                H0 h02 = new H0("backup_code", c0188a, 3);
                h02.p("id", false);
                h02.p("status", false);
                h02.p("codes_left", false);
                descriptor = h02;
            }

            private C0188a() {
            }

            @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
            public final Xi.f a() {
                return descriptor;
            }

            @Override // Zi.M
            public final Vi.b[] d() {
                return new Vi.b[]{W0.f25599a, f.b.f4533f, W.f25597a};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Backup c(Yi.e decoder) {
                int i10;
                int i11;
                String str;
                f fVar;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVar2 = descriptor;
                Yi.c cVarC = decoder.c(fVar2);
                if (cVarC.B()) {
                    String strW = cVarC.w(fVar2, 0);
                    f fVar3 = (f) cVarC.p(fVar2, 1, f.b.f4533f, null);
                    str = strW;
                    i10 = cVarC.i(fVar2, 2);
                    fVar = fVar3;
                    i11 = 7;
                } else {
                    boolean z10 = true;
                    int i12 = 0;
                    String strW2 = null;
                    f fVar4 = null;
                    int i13 = 0;
                    while (z10) {
                        int iK = cVarC.k(fVar2);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            strW2 = cVarC.w(fVar2, 0);
                            i13 |= 1;
                        } else if (iK == 1) {
                            fVar4 = (f) cVarC.p(fVar2, 1, f.b.f4533f, fVar4);
                            i13 |= 2;
                        } else {
                            if (iK != 2) {
                                throw new UnknownFieldException(iK);
                            }
                            i12 = cVarC.i(fVar2, 2);
                            i13 |= 4;
                        }
                    }
                    i10 = i12;
                    i11 = i13;
                    str = strW2;
                    fVar = fVar4;
                }
                cVarC.b(fVar2);
                return new Backup(i11, str, fVar, i10, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void e(Yi.f encoder, Backup value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVar = descriptor;
                Yi.d dVarC = encoder.c(fVar);
                Backup.j(value, dVarC, fVar);
                dVarC.b(fVar);
            }
        }

        /* renamed from: Eb.w$a$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final Vi.b serializer() {
                return C0188a.f4520a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: Eb.w$a$c */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Backup createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new Backup(parcel.readString(), f.valueOf(parcel.readString()), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Backup[] newArray(int i10) {
                return new Backup[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Backup(int i10, String str, f fVar, int i11, R0 r02) {
            super(i10, r02);
            if (7 != (i10 & 7)) {
                C0.a(i10, 7, C0188a.f4520a.a());
            }
            this.id = str;
            this.status = fVar;
            this.codesLeft = i11;
        }

        public static final /* synthetic */ void j(Backup self, Yi.d output, Xi.f serialDesc) {
            w.i(self, output, serialDesc);
            output.y(serialDesc, 0, self.getId());
            output.q(serialDesc, 1, f.b.f4533f, self.getStatus());
            output.C(serialDesc, 2, self.codesLeft);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Backup)) {
                return false;
            }
            Backup backup = (Backup) other;
            return AbstractC6492s.d(this.id, backup.id) && this.status == backup.status && this.codesLeft == backup.codesLeft;
        }

        @Override // Eb.w
        /* renamed from: f, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // Eb.w
        /* renamed from: g, reason: from getter */
        public f getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.status.hashCode()) * 31) + Integer.hashCode(this.codesLeft);
        }

        public String toString() {
            return "Backup(id=" + this.id + ", status=" + this.status + ", codesLeft=" + this.codesLeft + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.status.name());
            dest.writeInt(this.codesLeft);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Backup(String id2, f status, int i10) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(status, "status");
            this.id = id2;
            this.status = status;
            this.codesLeft = i10;
        }
    }

    /* renamed from: Eb.w$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Vi.b a() {
            return (Vi.b) w.f4516b.getValue();
        }

        public final cj.e b() {
            return w.f4515a;
        }

        public final Vi.b serializer() {
            return a();
        }

        private Companion() {
        }
    }

    @Vi.n
    @Vi.m("email")
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"LEb/w$c;", "LEb/w;", "", "id", "LEb/w$f;", "status", "email", "<init>", "(Ljava/lang/String;LEb/w$f;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;LEb/w$f;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "k", "(LEb/w$c;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "f", "d", "LEb/w$f;", "g", "()LEb/w$f;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "j", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eb.w$c, reason: from toString */
    public static final /* data */ class Email extends w {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final f status;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Email> CREATOR = new C0189c();

        /* renamed from: Eb.w$c$a */
        public /* synthetic */ class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4524a;
            private static final Xi.f descriptor;

            static {
                a aVar = new a();
                f4524a = aVar;
                H0 h02 = new H0("email", aVar, 3);
                h02.p("id", false);
                h02.p("status", false);
                h02.p("email", false);
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
                return new Vi.b[]{w02, f.b.f4533f, w02};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Email c(Yi.e decoder) {
                int i10;
                String str;
                f fVar;
                String strW;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVar2 = descriptor;
                Yi.c cVarC = decoder.c(fVar2);
                String strW2 = null;
                if (cVarC.B()) {
                    String strW3 = cVarC.w(fVar2, 0);
                    f fVar3 = (f) cVarC.p(fVar2, 1, f.b.f4533f, null);
                    str = strW3;
                    strW = cVarC.w(fVar2, 2);
                    fVar = fVar3;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    f fVar4 = null;
                    String strW4 = null;
                    while (z10) {
                        int iK = cVarC.k(fVar2);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            strW2 = cVarC.w(fVar2, 0);
                            i11 |= 1;
                        } else if (iK == 1) {
                            fVar4 = (f) cVarC.p(fVar2, 1, f.b.f4533f, fVar4);
                            i11 |= 2;
                        } else {
                            if (iK != 2) {
                                throw new UnknownFieldException(iK);
                            }
                            strW4 = cVarC.w(fVar2, 2);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    str = strW2;
                    fVar = fVar4;
                    strW = strW4;
                }
                cVarC.b(fVar2);
                return new Email(i10, str, fVar, strW, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void e(Yi.f encoder, Email value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVar = descriptor;
                Yi.d dVarC = encoder.c(fVar);
                Email.k(value, dVarC, fVar);
                dVarC.b(fVar);
            }
        }

        /* renamed from: Eb.w$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final Vi.b serializer() {
                return a.f4524a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: Eb.w$c$c, reason: collision with other inner class name */
        public static final class C0189c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Email createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new Email(parcel.readString(), f.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Email[] newArray(int i10) {
                return new Email[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Email(int i10, String str, f fVar, String str2, R0 r02) {
            super(i10, r02);
            if (7 != (i10 & 7)) {
                C0.a(i10, 7, a.f4524a.a());
            }
            this.id = str;
            this.status = fVar;
            this.email = str2;
        }

        public static final /* synthetic */ void k(Email self, Yi.d output, Xi.f serialDesc) {
            w.i(self, output, serialDesc);
            output.y(serialDesc, 0, self.getId());
            output.q(serialDesc, 1, f.b.f4533f, self.getStatus());
            output.y(serialDesc, 2, self.email);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Email)) {
                return false;
            }
            Email email = (Email) other;
            return AbstractC6492s.d(this.id, email.id) && this.status == email.status && AbstractC6492s.d(this.email, email.email);
        }

        @Override // Eb.w
        /* renamed from: f, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // Eb.w
        /* renamed from: g, reason: from getter */
        public f getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.status.hashCode()) * 31) + this.email.hashCode();
        }

        /* renamed from: j, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        public String toString() {
            return "Email(id=" + this.id + ", status=" + this.status + ", email=" + this.email + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.status.name());
            dest.writeString(this.email);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Email(String id2, f status, String email) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(status, "status");
            AbstractC6492s.i(email, "email");
            this.id = id2;
            this.status = status;
            this.email = email;
        }
    }

    @Vi.n
    @Vi.m("push")
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"LEb/w$d;", "LEb/w;", "", "id", "LEb/w$f;", "status", "name", "<init>", "(Ljava/lang/String;LEb/w$f;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;LEb/w$f;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "k", "(LEb/w$d;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "f", "d", "LEb/w$f;", "g", "()LEb/w$f;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "j", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eb.w$d, reason: from toString */
    public static final /* data */ class Push extends w {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final f status;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Push> CREATOR = new c();

        /* renamed from: Eb.w$d$a */
        public /* synthetic */ class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4528a;
            private static final Xi.f descriptor;

            static {
                a aVar = new a();
                f4528a = aVar;
                H0 h02 = new H0("push", aVar, 3);
                h02.p("id", false);
                h02.p("status", false);
                h02.p("name", false);
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
                return new Vi.b[]{w02, f.b.f4533f, w02};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Push c(Yi.e decoder) {
                int i10;
                String str;
                f fVar;
                String strW;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVar2 = descriptor;
                Yi.c cVarC = decoder.c(fVar2);
                String strW2 = null;
                if (cVarC.B()) {
                    String strW3 = cVarC.w(fVar2, 0);
                    f fVar3 = (f) cVarC.p(fVar2, 1, f.b.f4533f, null);
                    str = strW3;
                    strW = cVarC.w(fVar2, 2);
                    fVar = fVar3;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    f fVar4 = null;
                    String strW4 = null;
                    while (z10) {
                        int iK = cVarC.k(fVar2);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            strW2 = cVarC.w(fVar2, 0);
                            i11 |= 1;
                        } else if (iK == 1) {
                            fVar4 = (f) cVarC.p(fVar2, 1, f.b.f4533f, fVar4);
                            i11 |= 2;
                        } else {
                            if (iK != 2) {
                                throw new UnknownFieldException(iK);
                            }
                            strW4 = cVarC.w(fVar2, 2);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    str = strW2;
                    fVar = fVar4;
                    strW = strW4;
                }
                cVarC.b(fVar2);
                return new Push(i10, str, fVar, strW, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void e(Yi.f encoder, Push value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVar = descriptor;
                Yi.d dVarC = encoder.c(fVar);
                Push.k(value, dVarC, fVar);
                dVarC.b(fVar);
            }
        }

        /* renamed from: Eb.w$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final Vi.b serializer() {
                return a.f4528a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: Eb.w$d$c */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Push createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new Push(parcel.readString(), f.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Push[] newArray(int i10) {
                return new Push[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Push(int i10, String str, f fVar, String str2, R0 r02) {
            super(i10, r02);
            if (7 != (i10 & 7)) {
                C0.a(i10, 7, a.f4528a.a());
            }
            this.id = str;
            this.status = fVar;
            this.name = str2;
        }

        public static final /* synthetic */ void k(Push self, Yi.d output, Xi.f serialDesc) {
            w.i(self, output, serialDesc);
            output.y(serialDesc, 0, self.getId());
            output.q(serialDesc, 1, f.b.f4533f, self.getStatus());
            output.y(serialDesc, 2, self.name);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Push)) {
                return false;
            }
            Push push = (Push) other;
            return AbstractC6492s.d(this.id, push.id) && this.status == push.status && AbstractC6492s.d(this.name, push.name);
        }

        @Override // Eb.w
        /* renamed from: f, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // Eb.w
        /* renamed from: g, reason: from getter */
        public f getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.status.hashCode()) * 31) + this.name.hashCode();
        }

        /* renamed from: j, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public String toString() {
            return "Push(id=" + this.id + ", status=" + this.status + ", name=" + this.name + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.status.name());
            dest.writeString(this.name);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Push(String id2, f status, String name) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(status, "status");
            AbstractC6492s.i(name, "name");
            this.id = id2;
            this.status = status;
            this.name = name;
        }
    }

    @Vi.n
    @Vi.m("sms")
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010&\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001e¨\u00063"}, d2 = {"LEb/w$e;", "LEb/w;", "", "id", "LEb/w$f;", "status", "phoneNumber", "<init>", "(Ljava/lang/String;LEb/w$f;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;LEb/w$f;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "k", "(LEb/w$e;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "f", "d", "LEb/w$f;", "g", "()LEb/w$f;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "j", "getPhoneNumber$annotations", "()V", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eb.w$e, reason: from toString */
    public static final /* data */ class Sms extends w {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final f status;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String phoneNumber;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Sms> CREATOR = new c();

        /* renamed from: Eb.w$e$a */
        public /* synthetic */ class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4532a;
            private static final Xi.f descriptor;

            static {
                a aVar = new a();
                f4532a = aVar;
                H0 h02 = new H0("sms", aVar, 3);
                h02.p("id", false);
                h02.p("status", false);
                h02.p("phone_number", false);
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
                return new Vi.b[]{w02, f.b.f4533f, w02};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Sms c(Yi.e decoder) {
                int i10;
                String str;
                f fVar;
                String strW;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVar2 = descriptor;
                Yi.c cVarC = decoder.c(fVar2);
                String strW2 = null;
                if (cVarC.B()) {
                    String strW3 = cVarC.w(fVar2, 0);
                    f fVar3 = (f) cVarC.p(fVar2, 1, f.b.f4533f, null);
                    str = strW3;
                    strW = cVarC.w(fVar2, 2);
                    fVar = fVar3;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    f fVar4 = null;
                    String strW4 = null;
                    while (z10) {
                        int iK = cVarC.k(fVar2);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            strW2 = cVarC.w(fVar2, 0);
                            i11 |= 1;
                        } else if (iK == 1) {
                            fVar4 = (f) cVarC.p(fVar2, 1, f.b.f4533f, fVar4);
                            i11 |= 2;
                        } else {
                            if (iK != 2) {
                                throw new UnknownFieldException(iK);
                            }
                            strW4 = cVarC.w(fVar2, 2);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    str = strW2;
                    fVar = fVar4;
                    strW = strW4;
                }
                cVarC.b(fVar2);
                return new Sms(i10, str, fVar, strW, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void e(Yi.f encoder, Sms value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVar = descriptor;
                Yi.d dVarC = encoder.c(fVar);
                Sms.k(value, dVarC, fVar);
                dVarC.b(fVar);
            }
        }

        /* renamed from: Eb.w$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final Vi.b serializer() {
                return a.f4532a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: Eb.w$e$c */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Sms createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new Sms(parcel.readString(), f.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Sms[] newArray(int i10) {
                return new Sms[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Sms(int i10, String str, f fVar, String str2, R0 r02) {
            super(i10, r02);
            if (7 != (i10 & 7)) {
                C0.a(i10, 7, a.f4532a.a());
            }
            this.id = str;
            this.status = fVar;
            this.phoneNumber = str2;
        }

        public static final /* synthetic */ void k(Sms self, Yi.d output, Xi.f serialDesc) {
            w.i(self, output, serialDesc);
            output.y(serialDesc, 0, self.getId());
            output.q(serialDesc, 1, f.b.f4533f, self.getStatus());
            output.y(serialDesc, 2, self.phoneNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Sms)) {
                return false;
            }
            Sms sms = (Sms) other;
            return AbstractC6492s.d(this.id, sms.id) && this.status == sms.status && AbstractC6492s.d(this.phoneNumber, sms.phoneNumber);
        }

        @Override // Eb.w
        /* renamed from: f, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // Eb.w
        /* renamed from: g, reason: from getter */
        public f getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.status.hashCode()) * 31) + this.phoneNumber.hashCode();
        }

        /* renamed from: j, reason: from getter */
        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String toString() {
            return "Sms(id=" + this.id + ", status=" + this.status + ", phoneNumber=" + this.phoneNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.status.name());
            dest.writeString(this.phoneNumber);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sms(String id2, f status, String phoneNumber) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(status, "status");
            AbstractC6492s.i(phoneNumber, "phoneNumber");
            this.id = id2;
            this.status = status;
            this.phoneNumber = phoneNumber;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Vi.n(with = b.class)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"LEb/w$f;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", SnmpConfigurator.O_BIND_ADDRESS, SnmpConfigurator.O_AUTH_PROTOCOL, "Active", "Backup", "Unknown", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ f[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @Vi.m("active")
        public static final f Active = new f("Active", 0);

        @Vi.m("backup")
        public static final f Backup = new f("Backup", 1);

        @Vi.m("unknown")
        public static final f Unknown = new f("Unknown", 2);

        /* renamed from: Eb.w$f$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final Vi.b serializer() {
                return b.f4533f;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static final class b extends Jb.a {

            /* renamed from: f, reason: collision with root package name */
            public static final b f4533f = new b();

            private b() {
                super(O.b(f.class), new InterfaceC6824a() { // from class: Eb.x
                    @Override // mh.InterfaceC6824a
                    public final Object invoke() {
                        return w.f.b.k();
                    }
                }, f.Unknown);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final f[] k() {
                return (f[]) f.getEntries().toArray(new f[0]);
            }
        }

        private static final /* synthetic */ f[] $values() {
            return new f[]{Active, Backup, Unknown};
        }

        static {
            f[] fVarArr$values = $values();
            $VALUES = fVarArr$values;
            $ENTRIES = AbstractC5827b.a(fVarArr$values);
            INSTANCE = new Companion(null);
        }

        private f(String str, int i10) {
        }

        public static InterfaceC5826a getEntries() {
            return $ENTRIES;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) $VALUES.clone();
        }
    }

    @Vi.n
    @Vi.m("totp")
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"LEb/w$g;", "LEb/w;", "", "id", "LEb/w$f;", "status", "name", "<init>", "(Ljava/lang/String;LEb/w$f;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;LEb/w$f;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "j", "(LEb/w$g;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "f", "d", "LEb/w$f;", "g", "()LEb/w$f;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getName", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eb.w$g, reason: from toString */
    public static final /* data */ class Totp extends w {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final f status;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Totp> CREATOR = new c();

        /* renamed from: Eb.w$g$a */
        public /* synthetic */ class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4537a;
            private static final Xi.f descriptor;

            static {
                a aVar = new a();
                f4537a = aVar;
                H0 h02 = new H0("totp", aVar, 3);
                h02.p("id", false);
                h02.p("status", false);
                h02.p("name", false);
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
                return new Vi.b[]{w02, f.b.f4533f, w02};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Totp c(Yi.e decoder) {
                int i10;
                String str;
                f fVar;
                String strW;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVar2 = descriptor;
                Yi.c cVarC = decoder.c(fVar2);
                String strW2 = null;
                if (cVarC.B()) {
                    String strW3 = cVarC.w(fVar2, 0);
                    f fVar3 = (f) cVarC.p(fVar2, 1, f.b.f4533f, null);
                    str = strW3;
                    strW = cVarC.w(fVar2, 2);
                    fVar = fVar3;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    f fVar4 = null;
                    String strW4 = null;
                    while (z10) {
                        int iK = cVarC.k(fVar2);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            strW2 = cVarC.w(fVar2, 0);
                            i11 |= 1;
                        } else if (iK == 1) {
                            fVar4 = (f) cVarC.p(fVar2, 1, f.b.f4533f, fVar4);
                            i11 |= 2;
                        } else {
                            if (iK != 2) {
                                throw new UnknownFieldException(iK);
                            }
                            strW4 = cVarC.w(fVar2, 2);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    str = strW2;
                    fVar = fVar4;
                    strW = strW4;
                }
                cVarC.b(fVar2);
                return new Totp(i10, str, fVar, strW, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void e(Yi.f encoder, Totp value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVar = descriptor;
                Yi.d dVarC = encoder.c(fVar);
                Totp.j(value, dVarC, fVar);
                dVarC.b(fVar);
            }
        }

        /* renamed from: Eb.w$g$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final Vi.b serializer() {
                return a.f4537a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: Eb.w$g$c */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Totp createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new Totp(parcel.readString(), f.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Totp[] newArray(int i10) {
                return new Totp[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Totp(int i10, String str, f fVar, String str2, R0 r02) {
            super(i10, r02);
            if (7 != (i10 & 7)) {
                C0.a(i10, 7, a.f4537a.a());
            }
            this.id = str;
            this.status = fVar;
            this.name = str2;
        }

        public static final /* synthetic */ void j(Totp self, Yi.d output, Xi.f serialDesc) {
            w.i(self, output, serialDesc);
            output.y(serialDesc, 0, self.getId());
            output.q(serialDesc, 1, f.b.f4533f, self.getStatus());
            output.y(serialDesc, 2, self.name);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Totp)) {
                return false;
            }
            Totp totp = (Totp) other;
            return AbstractC6492s.d(this.id, totp.id) && this.status == totp.status && AbstractC6492s.d(this.name, totp.name);
        }

        @Override // Eb.w
        /* renamed from: f, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // Eb.w
        /* renamed from: g, reason: from getter */
        public f getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.status.hashCode()) * 31) + this.name.hashCode();
        }

        public String toString() {
            return "Totp(id=" + this.id + ", status=" + this.status + ", name=" + this.name + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.status.name());
            dest.writeString(this.name);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Totp(String id2, f status, String name) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(status, "status");
            AbstractC6492s.i(name, "name");
            this.id = id2;
            this.status = status;
            this.name = name;
        }
    }

    @Vi.n
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"LEb/w$h;", "LEb/w;", "", "id", "LEb/w$f;", "status", "type", "<init>", "(Ljava/lang/String;LEb/w$f;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;LEb/w$f;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "j", "(LEb/w$h;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "f", "d", "LEb/w$f;", "g", "()LEb/w$f;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getType", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eb.w$h, reason: from toString */
    public static final /* data */ class Unknown extends w {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final f status;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Unknown> CREATOR = new c();

        /* renamed from: Eb.w$h$a */
        public /* synthetic */ class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4541a;
            private static final Xi.f descriptor;

            static {
                a aVar = new a();
                f4541a = aVar;
                H0 h02 = new H0("com.ui.unifi.core.sso.models.TwoFaAuthenticator.Unknown", aVar, 3);
                h02.p("id", false);
                h02.p("status", false);
                h02.p("type", false);
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
                return new Vi.b[]{w02, f.b.f4533f, w02};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Unknown c(Yi.e decoder) {
                int i10;
                String str;
                f fVar;
                String strW;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVar2 = descriptor;
                Yi.c cVarC = decoder.c(fVar2);
                String strW2 = null;
                if (cVarC.B()) {
                    String strW3 = cVarC.w(fVar2, 0);
                    f fVar3 = (f) cVarC.p(fVar2, 1, f.b.f4533f, null);
                    str = strW3;
                    strW = cVarC.w(fVar2, 2);
                    fVar = fVar3;
                    i10 = 7;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    f fVar4 = null;
                    String strW4 = null;
                    while (z10) {
                        int iK = cVarC.k(fVar2);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            strW2 = cVarC.w(fVar2, 0);
                            i11 |= 1;
                        } else if (iK == 1) {
                            fVar4 = (f) cVarC.p(fVar2, 1, f.b.f4533f, fVar4);
                            i11 |= 2;
                        } else {
                            if (iK != 2) {
                                throw new UnknownFieldException(iK);
                            }
                            strW4 = cVarC.w(fVar2, 2);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    str = strW2;
                    fVar = fVar4;
                    strW = strW4;
                }
                cVarC.b(fVar2);
                return new Unknown(i10, str, fVar, strW, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void e(Yi.f encoder, Unknown value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVar = descriptor;
                Yi.d dVarC = encoder.c(fVar);
                Unknown.j(value, dVarC, fVar);
                dVarC.b(fVar);
            }
        }

        /* renamed from: Eb.w$h$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final Vi.b serializer() {
                return a.f4541a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: Eb.w$h$c */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Unknown createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new Unknown(parcel.readString(), f.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Unknown[] newArray(int i10) {
                return new Unknown[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Unknown(int i10, String str, f fVar, String str2, R0 r02) {
            super(i10, r02);
            if (7 != (i10 & 7)) {
                C0.a(i10, 7, a.f4541a.a());
            }
            this.id = str;
            this.status = fVar;
            this.type = str2;
        }

        public static final /* synthetic */ void j(Unknown self, Yi.d output, Xi.f serialDesc) {
            w.i(self, output, serialDesc);
            output.y(serialDesc, 0, self.getId());
            output.q(serialDesc, 1, f.b.f4533f, self.getStatus());
            output.y(serialDesc, 2, self.type);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) other;
            return AbstractC6492s.d(this.id, unknown.id) && this.status == unknown.status && AbstractC6492s.d(this.type, unknown.type);
        }

        @Override // Eb.w
        /* renamed from: f, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // Eb.w
        /* renamed from: g, reason: from getter */
        public f getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.status.hashCode()) * 31) + this.type.hashCode();
        }

        public String toString() {
            return "Unknown(id=" + this.id + ", status=" + this.status + ", type=" + this.type + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.status.name());
            dest.writeString(this.type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String id2, f status, String type) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(status, "status");
            AbstractC6492s.i(type, "type");
            this.id = id2;
            this.status = status;
            this.type = type;
        }
    }

    @Vi.n
    @Vi.m("webauthn")
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000234B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\u001fR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010'\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001f¨\u00065"}, d2 = {"LEb/w$i;", "LEb/w;", "", "id", "LEb/w$f;", "status", "name", "providerFriendlyName", "<init>", "(Ljava/lang/String;LEb/w$f;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;LEb/w$f;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "j", "(LEb/w$i;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/String;", "f", "d", "LEb/w$f;", "g", "()LEb/w$f;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "getName", "getProviderFriendlyName", "getProviderFriendlyName$annotations", "()V", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, SnmpConfigurator.O_BIND_ADDRESS, "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eb.w$i, reason: from toString */
    public static final /* data */ class WebAuthn extends w {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final f status;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String providerFriendlyName;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<WebAuthn> CREATOR = new c();

        /* renamed from: Eb.w$i$a */
        public /* synthetic */ class a implements M {

            /* renamed from: a, reason: collision with root package name */
            public static final a f4546a;
            private static final Xi.f descriptor;

            static {
                a aVar = new a();
                f4546a = aVar;
                H0 h02 = new H0("webauthn", aVar, 4);
                h02.p("id", false);
                h02.p("status", false);
                h02.p("name", false);
                h02.p("provider_friendly_name", false);
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
                return new Vi.b[]{w02, f.b.f4533f, w02, w02};
            }

            @Override // Vi.InterfaceC3627a
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final WebAuthn c(Yi.e decoder) {
                int i10;
                String str;
                f fVar;
                String str2;
                String strW;
                AbstractC6492s.i(decoder, "decoder");
                Xi.f fVar2 = descriptor;
                Yi.c cVarC = decoder.c(fVar2);
                String strW2 = null;
                if (cVarC.B()) {
                    String strW3 = cVarC.w(fVar2, 0);
                    f fVar3 = (f) cVarC.p(fVar2, 1, f.b.f4533f, null);
                    String strW4 = cVarC.w(fVar2, 2);
                    str = strW3;
                    strW = cVarC.w(fVar2, 3);
                    str2 = strW4;
                    fVar = fVar3;
                    i10 = 15;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    f fVar4 = null;
                    String strW5 = null;
                    String strW6 = null;
                    while (z10) {
                        int iK = cVarC.k(fVar2);
                        if (iK == -1) {
                            z10 = false;
                        } else if (iK == 0) {
                            strW2 = cVarC.w(fVar2, 0);
                            i11 |= 1;
                        } else if (iK == 1) {
                            fVar4 = (f) cVarC.p(fVar2, 1, f.b.f4533f, fVar4);
                            i11 |= 2;
                        } else if (iK == 2) {
                            strW5 = cVarC.w(fVar2, 2);
                            i11 |= 4;
                        } else {
                            if (iK != 3) {
                                throw new UnknownFieldException(iK);
                            }
                            strW6 = cVarC.w(fVar2, 3);
                            i11 |= 8;
                        }
                    }
                    i10 = i11;
                    str = strW2;
                    fVar = fVar4;
                    str2 = strW5;
                    strW = strW6;
                }
                cVarC.b(fVar2);
                return new WebAuthn(i10, str, fVar, str2, strW, null);
            }

            @Override // Vi.o
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public final void e(Yi.f encoder, WebAuthn value) {
                AbstractC6492s.i(encoder, "encoder");
                AbstractC6492s.i(value, "value");
                Xi.f fVar = descriptor;
                Yi.d dVarC = encoder.c(fVar);
                WebAuthn.j(value, dVarC, fVar);
                dVarC.b(fVar);
            }
        }

        /* renamed from: Eb.w$i$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public final Vi.b serializer() {
                return a.f4546a;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: Eb.w$i$c */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final WebAuthn createFromParcel(Parcel parcel) {
                AbstractC6492s.i(parcel, "parcel");
                return new WebAuthn(parcel.readString(), f.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final WebAuthn[] newArray(int i10) {
                return new WebAuthn[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ WebAuthn(int i10, String str, f fVar, String str2, String str3, R0 r02) {
            super(i10, r02);
            if (15 != (i10 & 15)) {
                C0.a(i10, 15, a.f4546a.a());
            }
            this.id = str;
            this.status = fVar;
            this.name = str2;
            this.providerFriendlyName = str3;
        }

        public static final /* synthetic */ void j(WebAuthn self, Yi.d output, Xi.f serialDesc) {
            w.i(self, output, serialDesc);
            output.y(serialDesc, 0, self.getId());
            output.q(serialDesc, 1, f.b.f4533f, self.getStatus());
            output.y(serialDesc, 2, self.name);
            output.y(serialDesc, 3, self.providerFriendlyName);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebAuthn)) {
                return false;
            }
            WebAuthn webAuthn = (WebAuthn) other;
            return AbstractC6492s.d(this.id, webAuthn.id) && this.status == webAuthn.status && AbstractC6492s.d(this.name, webAuthn.name) && AbstractC6492s.d(this.providerFriendlyName, webAuthn.providerFriendlyName);
        }

        @Override // Eb.w
        /* renamed from: f, reason: from getter */
        public String getId() {
            return this.id;
        }

        @Override // Eb.w
        /* renamed from: g, reason: from getter */
        public f getStatus() {
            return this.status;
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + this.status.hashCode()) * 31) + this.name.hashCode()) * 31) + this.providerFriendlyName.hashCode();
        }

        public String toString() {
            return "WebAuthn(id=" + this.id + ", status=" + this.status + ", name=" + this.name + ", providerFriendlyName=" + this.providerFriendlyName + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            AbstractC6492s.i(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.status.name());
            dest.writeString(this.name);
            dest.writeString(this.providerFriendlyName);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebAuthn(String id2, f status, String name, String providerFriendlyName) {
            super(null);
            AbstractC6492s.i(id2, "id");
            AbstractC6492s.i(status, "status");
            AbstractC6492s.i(name, "name");
            AbstractC6492s.i(providerFriendlyName, "providerFriendlyName");
            this.id = id2;
            this.status = status;
            this.name = name;
            this.providerFriendlyName = providerFriendlyName;
        }
    }

    static {
        cj.f fVar = new cj.f();
        C4270b c4270b = new C4270b(O.b(w.class), null);
        c4270b.b(new InterfaceC6835l() { // from class: Eb.u
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return w.h((String) obj);
            }
        });
        c4270b.a(fVar);
        f4515a = fVar.h();
        f4516b = Yg.n.a(Yg.q.PUBLICATION, new InterfaceC6824a() { // from class: Eb.v
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return w.c();
            }
        });
    }

    public /* synthetic */ w(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Vi.b c() {
        return new Vi.k("com.ui.unifi.core.sso.models.TwoFaAuthenticator", O.b(w.class), new th.d[]{O.b(Backup.class), O.b(Email.class), O.b(Push.class), O.b(Sms.class), O.b(Totp.class), O.b(Unknown.class), O.b(WebAuthn.class)}, new Vi.b[]{Backup.C0188a.f4520a, Email.a.f4524a, Push.a.f4528a, Sms.a.f4532a, Totp.a.f4537a, Unknown.a.f4541a, WebAuthn.a.f4546a}, new Annotation[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3627a h(String str) {
        return Unknown.INSTANCE.serializer();
    }

    public static final /* synthetic */ void i(w self, Yi.d output, Xi.f serialDesc) {
    }

    /* renamed from: f */
    public abstract String getId();

    /* renamed from: g */
    public abstract f getStatus();

    private w() {
    }

    public /* synthetic */ w(int i10, R0 r02) {
    }
}
