package Eb;

import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import Zi.W;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001a\u000fB#\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001f"}, d2 = {"LEb/n;", "", "", "seen0", "limitInSeconds", "LZi/R0;", "serializationConstructorMarker", "<init>", "(IILZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(LEb/n;LYi/d;LXi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "I", "getLimitInSeconds$annotations", "()V", "Companion", "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.n, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class ResendVerificationEmailError {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int limitInSeconds;

    /* renamed from: Eb.n$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4484a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f4484a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.sso.models.ResendVerificationEmailError", aVar, 1);
            h02.p("limit_in_seconds", false);
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
            return new Vi.b[]{W.f25597a};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final ResendVerificationEmailError c(Yi.e decoder) {
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            int i11 = 1;
            if (cVarC.B()) {
                i10 = cVarC.i(fVar, 0);
            } else {
                boolean z10 = true;
                i10 = 0;
                int i12 = 0;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else {
                        if (iK != 0) {
                            throw new UnknownFieldException(iK);
                        }
                        i10 = cVarC.i(fVar, 0);
                        i12 = 1;
                    }
                }
                i11 = i12;
            }
            cVarC.b(fVar);
            return new ResendVerificationEmailError(i11, i10, null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, ResendVerificationEmailError value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            ResendVerificationEmailError.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Eb.n$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f4484a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ResendVerificationEmailError(int i10, int i11, R0 r02) {
        if (1 != (i10 & 1)) {
            C0.a(i10, 1, a.f4484a.a());
        }
        this.limitInSeconds = i11;
    }

    public static final /* synthetic */ void b(ResendVerificationEmailError self, Yi.d output, Xi.f serialDesc) {
        output.C(serialDesc, 0, self.limitInSeconds);
    }

    /* renamed from: a, reason: from getter */
    public final int getLimitInSeconds() {
        return this.limitInSeconds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ResendVerificationEmailError) && this.limitInSeconds == ((ResendVerificationEmailError) other).limitInSeconds;
    }

    public int hashCode() {
        return Integer.hashCode(this.limitInSeconds);
    }

    public String toString() {
        return "ResendVerificationEmailError(limitInSeconds=" + this.limitInSeconds + ")";
    }
}
