package Eb;

import Eb.AllowCredentials;
import Zi.C0;
import Zi.C3704f;
import Zi.C3709h0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 72\u00020\u0001:\u0002)\u0018B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b#\u0010 J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010*\u001a\u0004\b,\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"LEb/d;", "Landroid/os/Parcelable;", "", "challenge", "rpId", "", "timeout", "userVerification", "", "LEb/a;", "allowCredentials", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(LEb/d;LYi/d;LXi/f;)V", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "getChallenge", "getRpId", SnmpConfigurator.O_COMMUNITY, "J", "getTimeout", "()J", "d", "getUserVerification", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/util/List;", "getAllowCredentials", "()Ljava/util/List;", "Companion", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.d, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class CredentialRequestOptions implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String challenge;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rpId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timeout;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String userVerification;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List allowCredentials;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<CredentialRequestOptions> CREATOR = new c();

    /* renamed from: f, reason: collision with root package name */
    private static final Vi.b[] f4447f = {null, null, null, null, new C3704f(AllowCredentials.C0186a.f4425a)};

    /* renamed from: Eb.d$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4453a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f4453a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.sso.models.CredentialRequestOptions", aVar, 5);
            h02.p("challenge", false);
            h02.p("rpId", false);
            h02.p("timeout", false);
            h02.p("userVerification", false);
            h02.p("allowCredentials", false);
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
            Vi.b bVar = CredentialRequestOptions.f4447f[4];
            W0 w02 = W0.f25599a;
            return new Vi.b[]{w02, w02, C3709h0.f25636a, w02, bVar};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final CredentialRequestOptions c(Yi.e decoder) {
            int i10;
            String str;
            String str2;
            String str3;
            List list;
            long j10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = CredentialRequestOptions.f4447f;
            String strW = null;
            if (cVarC.B()) {
                String strW2 = cVarC.w(fVar, 0);
                String strW3 = cVarC.w(fVar, 1);
                long jQ = cVarC.q(fVar, 2);
                String strW4 = cVarC.w(fVar, 3);
                list = (List) cVarC.p(fVar, 4, bVarArr[4], null);
                str = strW2;
                str3 = strW4;
                i10 = 31;
                str2 = strW3;
                j10 = jQ;
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list2 = null;
                long jQ2 = 0;
                String strW5 = null;
                String strW6 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        strW = cVarC.w(fVar, 0);
                        i11 |= 1;
                    } else if (iK == 1) {
                        strW5 = cVarC.w(fVar, 1);
                        i11 |= 2;
                    } else if (iK == 2) {
                        jQ2 = cVarC.q(fVar, 2);
                        i11 |= 4;
                    } else if (iK == 3) {
                        strW6 = cVarC.w(fVar, 3);
                        i11 |= 8;
                    } else {
                        if (iK != 4) {
                            throw new UnknownFieldException(iK);
                        }
                        list2 = (List) cVarC.p(fVar, 4, bVarArr[4], list2);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                str = strW;
                str2 = strW5;
                str3 = strW6;
                list = list2;
                j10 = jQ2;
            }
            cVarC.b(fVar);
            return new CredentialRequestOptions(i10, str, str2, j10, str3, list, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, CredentialRequestOptions value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            CredentialRequestOptions.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Eb.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f4453a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: Eb.d$c */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CredentialRequestOptions createFromParcel(Parcel parcel) {
            AbstractC6492s.i(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            long j10 = parcel.readLong();
            String string3 = parcel.readString();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(AllowCredentials.CREATOR.createFromParcel(parcel));
            }
            return new CredentialRequestOptions(string, string2, j10, string3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CredentialRequestOptions[] newArray(int i10) {
            return new CredentialRequestOptions[i10];
        }
    }

    public /* synthetic */ CredentialRequestOptions(int i10, String str, String str2, long j10, String str3, List list, R0 r02) {
        if (31 != (i10 & 31)) {
            C0.a(i10, 31, a.f4453a.a());
        }
        this.challenge = str;
        this.rpId = str2;
        this.timeout = j10;
        this.userVerification = str3;
        this.allowCredentials = list;
    }

    public static final /* synthetic */ void b(CredentialRequestOptions self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f4447f;
        output.y(serialDesc, 0, self.challenge);
        output.y(serialDesc, 1, self.rpId);
        output.p(serialDesc, 2, self.timeout);
        output.y(serialDesc, 3, self.userVerification);
        output.q(serialDesc, 4, bVarArr[4], self.allowCredentials);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CredentialRequestOptions)) {
            return false;
        }
        CredentialRequestOptions credentialRequestOptions = (CredentialRequestOptions) other;
        return AbstractC6492s.d(this.challenge, credentialRequestOptions.challenge) && AbstractC6492s.d(this.rpId, credentialRequestOptions.rpId) && this.timeout == credentialRequestOptions.timeout && AbstractC6492s.d(this.userVerification, credentialRequestOptions.userVerification) && AbstractC6492s.d(this.allowCredentials, credentialRequestOptions.allowCredentials);
    }

    public int hashCode() {
        return (((((((this.challenge.hashCode() * 31) + this.rpId.hashCode()) * 31) + Long.hashCode(this.timeout)) * 31) + this.userVerification.hashCode()) * 31) + this.allowCredentials.hashCode();
    }

    public String toString() {
        return "CredentialRequestOptions(challenge=" + this.challenge + ", rpId=" + this.rpId + ", timeout=" + this.timeout + ", userVerification=" + this.userVerification + ", allowCredentials=" + this.allowCredentials + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        AbstractC6492s.i(dest, "dest");
        dest.writeString(this.challenge);
        dest.writeString(this.rpId);
        dest.writeLong(this.timeout);
        dest.writeString(this.userVerification);
        List list = this.allowCredentials;
        dest.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AllowCredentials) it.next()).writeToParcel(dest, flags);
        }
    }

    public CredentialRequestOptions(String challenge, String rpId, long j10, String userVerification, List allowCredentials) {
        AbstractC6492s.i(challenge, "challenge");
        AbstractC6492s.i(rpId, "rpId");
        AbstractC6492s.i(userVerification, "userVerification");
        AbstractC6492s.i(allowCredentials, "allowCredentials");
        this.challenge = challenge;
        this.rpId = rpId;
        this.timeout = j10;
        this.userVerification = userVerification;
        this.allowCredentials = allowCredentials;
    }
}
