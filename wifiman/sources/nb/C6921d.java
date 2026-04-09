package nb;

import Vi.n;
import Zi.C0;
import Zi.C3704f;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@n
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0016\u0014B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006 "}, d2 = {"Lnb/d;", "", "", "", "urls", "username", "credential", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Lnb/d;LYi/d;LXi/f;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", "getUrls", "()Ljava/util/List;", "Ljava/lang/String;", "getUsername", "()Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, "getCredential", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6921d {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Vi.b[] f54527d = {new C3704f(W0.f25599a), null, null};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List urls;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String username;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String credential;

    /* renamed from: nb.d$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f54531a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f54531a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.mqtt.IceServers", aVar, 3);
            h02.p("urls", false);
            h02.p("username", true);
            h02.p("credential", true);
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
            Vi.b bVar = C6921d.f54527d[0];
            W0 w02 = W0.f25599a;
            return new Vi.b[]{bVar, Wi.a.u(w02), Wi.a.u(w02)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C6921d c(Yi.e decoder) {
            int i10;
            List list;
            String str;
            String str2;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = C6921d.f54527d;
            List list2 = null;
            if (cVarC.B()) {
                List list3 = (List) cVarC.p(fVar, 0, bVarArr[0], null);
                W0 w02 = W0.f25599a;
                String str3 = (String) cVarC.h(fVar, 1, w02, null);
                list = list3;
                str2 = (String) cVarC.h(fVar, 2, w02, null);
                i10 = 7;
                str = str3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                String str4 = null;
                String str5 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        list2 = (List) cVarC.p(fVar, 0, bVarArr[0], list2);
                        i11 |= 1;
                    } else if (iK == 1) {
                        str4 = (String) cVarC.h(fVar, 1, W0.f25599a, str4);
                        i11 |= 2;
                    } else {
                        if (iK != 2) {
                            throw new UnknownFieldException(iK);
                        }
                        str5 = (String) cVarC.h(fVar, 2, W0.f25599a, str5);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                list = list2;
                str = str4;
                str2 = str5;
            }
            cVarC.b(fVar);
            return new C6921d(i10, list, str, str2, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, C6921d value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            C6921d.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: nb.d$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f54531a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C6921d(int i10, List list, String str, String str2, R0 r02) {
        if (1 != (i10 & 1)) {
            C0.a(i10, 1, a.f54531a.a());
        }
        this.urls = list;
        if ((i10 & 2) == 0) {
            this.username = null;
        } else {
            this.username = str;
        }
        if ((i10 & 4) == 0) {
            this.credential = null;
        } else {
            this.credential = str2;
        }
    }

    public static final /* synthetic */ void b(C6921d self, Yi.d output, Xi.f serialDesc) {
        output.q(serialDesc, 0, f54527d[0], self.urls);
        if (output.o(serialDesc, 1) || self.username != null) {
            output.t(serialDesc, 1, W0.f25599a, self.username);
        }
        if (!output.o(serialDesc, 2) && self.credential == null) {
            return;
        }
        output.t(serialDesc, 2, W0.f25599a, self.credential);
    }

    public C6921d(List urls, String str, String str2) {
        AbstractC6492s.i(urls, "urls");
        this.urls = urls;
        this.username = str;
        this.credential = str2;
    }
}
