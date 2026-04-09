package gb;

import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u0014\u0016B9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u001e"}, d2 = {"Lgb/g;", "", "", "seen0", "", "name", "timeZone", "anonymousDeviceId", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "d", "(Lgb/g;LYi/d;LXi/f;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_BIND_ADDRESS, "()Ljava/lang/String;", "getName$annotations", "()V", SnmpConfigurator.O_COMMUNITY, "getTimeZone$annotations", "getAnonymousDeviceId$annotations", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5891g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String timeZone;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String anonymousDeviceId;

    /* renamed from: gb.g$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47781a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f47781a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.client.http.models.Settings", aVar, 3);
            h02.p("name", true);
            h02.p("timezone", true);
            h02.p("anonymous_device_id", true);
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
        public final C5891g c(Yi.e decoder) {
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
            return new C5891g(i10, str, str2, str3, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, C5891g value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            C5891g.d(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: gb.g$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f47781a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C5891g(int i10, String str, String str2, String str3, R0 r02) {
        if ((i10 & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i10 & 2) == 0) {
            this.timeZone = null;
        } else {
            this.timeZone = str2;
        }
        if ((i10 & 4) == 0) {
            this.anonymousDeviceId = null;
        } else {
            this.anonymousDeviceId = str3;
        }
    }

    public static final /* synthetic */ void d(C5891g self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || self.name != null) {
            output.t(serialDesc, 0, W0.f25599a, self.name);
        }
        if (output.o(serialDesc, 1) || self.timeZone != null) {
            output.t(serialDesc, 1, W0.f25599a, self.timeZone);
        }
        if (!output.o(serialDesc, 2) && self.anonymousDeviceId == null) {
            return;
        }
        output.t(serialDesc, 2, W0.f25599a, self.anonymousDeviceId);
    }

    /* renamed from: a, reason: from getter */
    public final String getAnonymousDeviceId() {
        return this.anonymousDeviceId;
    }

    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: c, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }
}
