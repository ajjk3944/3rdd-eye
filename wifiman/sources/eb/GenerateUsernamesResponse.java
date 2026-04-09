package Eb;

import Zi.C3704f;
import Zi.R0;
import Zi.W0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\u001c\u001eB5\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\"\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"LEb/j;", "", "", "seen0", "", "", "usernames", "emailErrorMessage", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_COMMUNITY, "(LEb/j;LYi/d;LXi/f;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", SnmpConfigurator.O_BIND_ADDRESS, "()Ljava/util/List;", "getUsernames$annotations", "()V", "Ljava/lang/String;", "getEmailErrorMessage", "getEmailErrorMessage$annotations", "Companion", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.j, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class GenerateUsernamesResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Vi.b[] f4466c = {new C3704f(W0.f25599a), null};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List usernames;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String emailErrorMessage;

    /* renamed from: Eb.j$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f4469a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ GenerateUsernamesResponse(int i10, List list, String str, R0 r02) {
        if ((i10 & 1) == 0) {
            this.usernames = null;
        } else {
            this.usernames = list;
        }
        if ((i10 & 2) == 0) {
            this.emailErrorMessage = null;
        } else {
            this.emailErrorMessage = str;
        }
    }

    public static final /* synthetic */ void c(GenerateUsernamesResponse self, Yi.d output, Xi.f serialDesc) {
        Vi.b[] bVarArr = f4466c;
        if (output.o(serialDesc, 0) || self.usernames != null) {
            output.t(serialDesc, 0, bVarArr[0], self.usernames);
        }
        if (!output.o(serialDesc, 1) && self.emailErrorMessage == null) {
            return;
        }
        output.t(serialDesc, 1, W0.f25599a, self.emailErrorMessage);
    }

    /* renamed from: b, reason: from getter */
    public final List getUsernames() {
        return this.usernames;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenerateUsernamesResponse)) {
            return false;
        }
        GenerateUsernamesResponse generateUsernamesResponse = (GenerateUsernamesResponse) other;
        return AbstractC6492s.d(this.usernames, generateUsernamesResponse.usernames) && AbstractC6492s.d(this.emailErrorMessage, generateUsernamesResponse.emailErrorMessage);
    }

    public int hashCode() {
        List list = this.usernames;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.emailErrorMessage;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "GenerateUsernamesResponse(usernames=" + this.usernames + ", emailErrorMessage=" + this.emailErrorMessage + ")";
    }
}
