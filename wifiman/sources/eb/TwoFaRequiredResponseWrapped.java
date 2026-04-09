package Eb;

import Eb.TwoFaRequiredResponse;
import Yg.J;
import Zi.C0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import aj.AbstractC3868b;
import aj.C3871e;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import mh.InterfaceC6835l;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001bB%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"LEb/B;", "", "", "seen0", "LEb/z;", "data", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILEb/z;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(LEb/B;LYi/d;LXi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "LEb/z;", SnmpConfigurator.O_COMMUNITY, "()LEb/z;", "Companion", SnmpConfigurator.O_BIND_ADDRESS, "SSO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eb.B, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class TwoFaRequiredResponseWrapped {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC3868b f4416b = aj.w.b(null, new InterfaceC6835l() { // from class: Eb.A
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return TwoFaRequiredResponseWrapped.d((C3871e) obj);
        }
    }, 1, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TwoFaRequiredResponse data;

    /* renamed from: Eb.B$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4418a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f4418a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.sso.models.TwoFaRequiredResponseWrapped", aVar, 1);
            h02.p("data", false);
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
            return new Vi.b[]{TwoFaRequiredResponse.a.f4553a};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final TwoFaRequiredResponseWrapped c(Yi.e decoder) {
            TwoFaRequiredResponse twoFaRequiredResponse;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            int i10 = 1;
            R0 r02 = null;
            if (cVarC.B()) {
                twoFaRequiredResponse = (TwoFaRequiredResponse) cVarC.p(fVar, 0, TwoFaRequiredResponse.a.f4553a, null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                twoFaRequiredResponse = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else {
                        if (iK != 0) {
                            throw new UnknownFieldException(iK);
                        }
                        twoFaRequiredResponse = (TwoFaRequiredResponse) cVarC.p(fVar, 0, TwoFaRequiredResponse.a.f4553a, twoFaRequiredResponse);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            cVarC.b(fVar);
            return new TwoFaRequiredResponseWrapped(i10, twoFaRequiredResponse, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, TwoFaRequiredResponseWrapped value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            TwoFaRequiredResponseWrapped.e(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: Eb.B$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TwoFaRequiredResponseWrapped a(String response) {
            AbstractC6492s.i(response, "response");
            AbstractC3868b abstractC3868b = TwoFaRequiredResponseWrapped.f4416b;
            abstractC3868b.a();
            return (TwoFaRequiredResponseWrapped) abstractC3868b.b(TwoFaRequiredResponseWrapped.INSTANCE.serializer(), response);
        }

        public final Vi.b serializer() {
            return a.f4418a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TwoFaRequiredResponseWrapped(int i10, TwoFaRequiredResponse twoFaRequiredResponse, R0 r02) {
        if (1 != (i10 & 1)) {
            C0.a(i10, 1, a.f4418a.a());
        }
        this.data = twoFaRequiredResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final J d(C3871e Json) {
        AbstractC6492s.i(Json, "$this$Json");
        Json.f(true);
        cj.f fVar = new cj.f();
        fVar.i(w.INSTANCE.b());
        Json.h(fVar.h());
        return J.f24997a;
    }

    public static final /* synthetic */ void e(TwoFaRequiredResponseWrapped self, Yi.d output, Xi.f serialDesc) {
        output.q(serialDesc, 0, TwoFaRequiredResponse.a.f4553a, self.data);
    }

    /* renamed from: c, reason: from getter */
    public final TwoFaRequiredResponse getData() {
        return this.data;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TwoFaRequiredResponseWrapped) && AbstractC6492s.d(this.data, ((TwoFaRequiredResponseWrapped) other).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "TwoFaRequiredResponseWrapped(data=" + this.data + ")";
    }
}
