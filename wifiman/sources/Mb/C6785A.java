package mb;

import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mb.C6786B;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0002\u0012\u0010B%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lmb/A;", "", "", "seen0", "Lmb/B;", "reported", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILmb/B;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Lmb/A;LYi/d;LXi/f;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lmb/B;", "()Lmb/B;", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mb.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6785A {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6786B reported;

    /* renamed from: mb.A$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f53675a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f53675a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.models.devices.UcoreShadowState", aVar, 1);
            h02.p("reported", false);
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
            return new Vi.b[]{C6786B.a.f53696a};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final C6785A c(Yi.e decoder) {
            C6786B c6786b;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            int i10 = 1;
            R0 r02 = null;
            if (cVarC.B()) {
                c6786b = (C6786B) cVarC.p(fVar, 0, C6786B.a.f53696a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                c6786b = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else {
                        if (iK != 0) {
                            throw new UnknownFieldException(iK);
                        }
                        c6786b = (C6786B) cVarC.p(fVar, 0, C6786B.a.f53696a, c6786b);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarC.b(fVar);
            return new C6785A(i10, c6786b, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, C6785A value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            C6785A.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: mb.A$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f53675a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ C6785A(int i10, C6786B c6786b, R0 r02) {
        if (1 != (i10 & 1)) {
            C0.a(i10, 1, a.f53675a.a());
        }
        this.reported = c6786b;
    }

    public static final /* synthetic */ void b(C6785A self, Yi.d output, Xi.f serialDesc) {
        output.q(serialDesc, 0, C6786B.a.f53696a, self.reported);
    }

    /* renamed from: a, reason: from getter */
    public final C6786B getReported() {
        return this.reported;
    }
}
