package gb;

import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W0;
import gb.C5890f;
import gb.Version;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mb.Hardware;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u0000 ,2\u00020\u0001:\u0002\u0019\u001eBM\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0019\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b!\u0010\u001d\u001a\u0004\b\u001e\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u0012\u0004\b$\u0010\u001d\u001a\u0004\b#\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010%\u0012\u0004\b(\u0010\u001d\u001a\u0004\b&\u0010'R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010)\u0012\u0004\b+\u0010\u001d\u001a\u0004\b\"\u0010*¨\u0006-"}, d2 = {"Lgb/e;", "", "", "seen0", "", "deviceId", "Lmb/p;", "hardware", "mac", "Lgb/f;", "owner", "Lgb/p;", "latestUpdate", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lmb/p;Ljava/lang/String;Lgb/f;Lgb/p;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "f", "(Lgb/e;LYi/d;LXi/f;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", "()Ljava/lang/String;", "getDeviceId$annotations", "()V", SnmpConfigurator.O_BIND_ADDRESS, "Lmb/p;", "()Lmb/p;", "getHardware$annotations", SnmpConfigurator.O_COMMUNITY, "d", "getMac$annotations", "Lgb/f;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Lgb/f;", "getOwner$annotations", "Lgb/p;", "()Lgb/p;", "getLatestUpdate$annotations", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5889e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String deviceId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Hardware hardware;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String mac;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C5890f owner;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Version latestUpdate;

    /* renamed from: gb.e$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47774a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f47774a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.client.http.models.Info", aVar, 5);
            h02.p("deviceId", true);
            h02.p("hardware", true);
            h02.p("mac", true);
            h02.p("owner", true);
            h02.p("latestUpdate", true);
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
            return new Vi.b[]{Wi.a.u(w02), Wi.a.u(Hardware.a.f53858a), Wi.a.u(w02), Wi.a.u(C5890f.a.f47777a), Wi.a.u(Version.a.f47831a)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C5889e c(Yi.e decoder) {
            int i10;
            String str;
            Hardware hardware;
            String str2;
            C5890f c5890f;
            Version version;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            String str3 = null;
            if (cVarC.B()) {
                W0 w02 = W0.f25599a;
                String str4 = (String) cVarC.h(fVar, 0, w02, null);
                Hardware hardware2 = (Hardware) cVarC.h(fVar, 1, Hardware.a.f53858a, null);
                str2 = (String) cVarC.h(fVar, 2, w02, null);
                c5890f = (C5890f) cVarC.h(fVar, 3, C5890f.a.f47777a, null);
                version = (Version) cVarC.h(fVar, 4, Version.a.f47831a, null);
                i10 = 31;
                hardware = hardware2;
                str = str4;
            } else {
                boolean z10 = true;
                int i11 = 0;
                Hardware hardware3 = null;
                String str5 = null;
                C5890f c5890f2 = null;
                Version version2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        str3 = (String) cVarC.h(fVar, 0, W0.f25599a, str3);
                        i11 |= 1;
                    } else if (iK == 1) {
                        hardware3 = (Hardware) cVarC.h(fVar, 1, Hardware.a.f53858a, hardware3);
                        i11 |= 2;
                    } else if (iK == 2) {
                        str5 = (String) cVarC.h(fVar, 2, W0.f25599a, str5);
                        i11 |= 4;
                    } else if (iK == 3) {
                        c5890f2 = (C5890f) cVarC.h(fVar, 3, C5890f.a.f47777a, c5890f2);
                        i11 |= 8;
                    } else {
                        if (iK != 4) {
                            throw new UnknownFieldException(iK);
                        }
                        version2 = (Version) cVarC.h(fVar, 4, Version.a.f47831a, version2);
                        i11 |= 16;
                    }
                }
                i10 = i11;
                str = str3;
                hardware = hardware3;
                str2 = str5;
                c5890f = c5890f2;
                version = version2;
            }
            cVarC.b(fVar);
            return new C5889e(i10, str, hardware, str2, c5890f, version, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, C5889e value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            C5889e.f(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: gb.e$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f47774a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C5889e(int i10, String str, Hardware hardware, String str2, C5890f c5890f, Version version, R0 r02) {
        if ((i10 & 1) == 0) {
            this.deviceId = null;
        } else {
            this.deviceId = str;
        }
        if ((i10 & 2) == 0) {
            this.hardware = null;
        } else {
            this.hardware = hardware;
        }
        if ((i10 & 4) == 0) {
            this.mac = null;
        } else {
            this.mac = str2;
        }
        if ((i10 & 8) == 0) {
            this.owner = null;
        } else {
            this.owner = c5890f;
        }
        if ((i10 & 16) == 0) {
            this.latestUpdate = null;
        } else {
            this.latestUpdate = version;
        }
    }

    public static final /* synthetic */ void f(C5889e self, Yi.d output, Xi.f serialDesc) {
        if (output.o(serialDesc, 0) || self.deviceId != null) {
            output.t(serialDesc, 0, W0.f25599a, self.deviceId);
        }
        if (output.o(serialDesc, 1) || self.hardware != null) {
            output.t(serialDesc, 1, Hardware.a.f53858a, self.hardware);
        }
        if (output.o(serialDesc, 2) || self.mac != null) {
            output.t(serialDesc, 2, W0.f25599a, self.mac);
        }
        if (output.o(serialDesc, 3) || self.owner != null) {
            output.t(serialDesc, 3, C5890f.a.f47777a, self.owner);
        }
        if (!output.o(serialDesc, 4) && self.latestUpdate == null) {
            return;
        }
        output.t(serialDesc, 4, Version.a.f47831a, self.latestUpdate);
    }

    /* renamed from: a, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: b, reason: from getter */
    public final Hardware getHardware() {
        return this.hardware;
    }

    /* renamed from: c, reason: from getter */
    public final Version getLatestUpdate() {
        return this.latestUpdate;
    }

    /* renamed from: d, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* renamed from: e, reason: from getter */
    public final C5890f getOwner() {
        return this.owner;
    }
}
