package gb;

import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import gb.C5889e;
import gb.DirectRemoteConnectionState;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mb.m;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 #2\u00020\u0001:\u0002\u0016\u001cB9\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010 \u0012\u0004\b\"\u0010\u001b\u001a\u0004\b\u0016\u0010!¨\u0006$"}, d2 = {"Lgb/h;", "", "", "seen0", "Lgb/e;", "info", "Lgb/d;", "directRemoteConnectionState", "Lmb/m;", "deviceState", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILgb/e;Lgb/d;Lmb/m;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "d", "(Lgb/h;LYi/d;LXi/f;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lgb/e;", SnmpConfigurator.O_COMMUNITY, "()Lgb/e;", "getInfo$annotations", "()V", SnmpConfigurator.O_BIND_ADDRESS, "Lgb/d;", "()Lgb/d;", "getDirectRemoteConnectionState$annotations", "Lmb/m;", "()Lmb/m;", "getDeviceState$annotations", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gb.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5892h {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C5889e info;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final DirectRemoteConnectionState directRemoteConnectionState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mb.m deviceState;

    /* renamed from: gb.h$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f47785a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f47785a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.client.http.models.System", aVar, 3);
            h02.p("info", false);
            h02.p("directRemoteConnectionState", true);
            h02.p("deviceState", true);
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
            return new Vi.b[]{C5889e.a.f47774a, Wi.a.u(DirectRemoteConnectionState.a.f47768a), Wi.a.u(m.b.f53836f)};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C5892h c(Yi.e decoder) {
            int i10;
            C5889e c5889e;
            DirectRemoteConnectionState directRemoteConnectionState;
            mb.m mVar;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            C5889e c5889e2 = null;
            if (cVarC.B()) {
                C5889e c5889e3 = (C5889e) cVarC.p(fVar, 0, C5889e.a.f47774a, null);
                DirectRemoteConnectionState directRemoteConnectionState2 = (DirectRemoteConnectionState) cVarC.h(fVar, 1, DirectRemoteConnectionState.a.f47768a, null);
                c5889e = c5889e3;
                mVar = (mb.m) cVarC.h(fVar, 2, m.b.f53836f, null);
                directRemoteConnectionState = directRemoteConnectionState2;
                i10 = 7;
            } else {
                boolean z10 = true;
                int i11 = 0;
                DirectRemoteConnectionState directRemoteConnectionState3 = null;
                mb.m mVar2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        c5889e2 = (C5889e) cVarC.p(fVar, 0, C5889e.a.f47774a, c5889e2);
                        i11 |= 1;
                    } else if (iK == 1) {
                        directRemoteConnectionState3 = (DirectRemoteConnectionState) cVarC.h(fVar, 1, DirectRemoteConnectionState.a.f47768a, directRemoteConnectionState3);
                        i11 |= 2;
                    } else {
                        if (iK != 2) {
                            throw new UnknownFieldException(iK);
                        }
                        mVar2 = (mb.m) cVarC.h(fVar, 2, m.b.f53836f, mVar2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                c5889e = c5889e2;
                directRemoteConnectionState = directRemoteConnectionState3;
                mVar = mVar2;
            }
            cVarC.b(fVar);
            return new C5892h(i10, c5889e, directRemoteConnectionState, mVar, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, C5892h value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            C5892h.d(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: gb.h$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f47785a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C5892h(int i10, C5889e c5889e, DirectRemoteConnectionState directRemoteConnectionState, mb.m mVar, R0 r02) {
        if (1 != (i10 & 1)) {
            C0.a(i10, 1, a.f47785a.a());
        }
        this.info = c5889e;
        if ((i10 & 2) == 0) {
            this.directRemoteConnectionState = null;
        } else {
            this.directRemoteConnectionState = directRemoteConnectionState;
        }
        if ((i10 & 4) == 0) {
            this.deviceState = null;
        } else {
            this.deviceState = mVar;
        }
    }

    public static final /* synthetic */ void d(C5892h self, Yi.d output, Xi.f serialDesc) {
        output.q(serialDesc, 0, C5889e.a.f47774a, self.info);
        if (output.o(serialDesc, 1) || self.directRemoteConnectionState != null) {
            output.t(serialDesc, 1, DirectRemoteConnectionState.a.f47768a, self.directRemoteConnectionState);
        }
        if (!output.o(serialDesc, 2) && self.deviceState == null) {
            return;
        }
        output.t(serialDesc, 2, m.b.f53836f, self.deviceState);
    }

    /* renamed from: a, reason: from getter */
    public final mb.m getDeviceState() {
        return this.deviceState;
    }

    /* renamed from: b, reason: from getter */
    public final DirectRemoteConnectionState getDirectRemoteConnectionState() {
        return this.directRemoteConnectionState;
    }

    /* renamed from: c, reason: from getter */
    public final C5889e getInfo() {
        return this.info;
    }
}
