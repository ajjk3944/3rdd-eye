package rb;

import Vi.n;
import Zi.C0;
import Zi.C3704f;
import Zi.H0;
import Zi.M;
import Zi.R0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;
import rb.BodyMeta;

@n
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\u001e\u0013B5\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lrb/g;", "", "", "seen0", "", "Lrb/f;", "traces", "Lrb/a;", "meta", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lrb/a;LZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_BIND_ADDRESS, "(Lrb/g;LYi/d;LXi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/util/List;", "getTraces", "()Ljava/util/List;", "Lrb/a;", "getMeta", "()Lrb/a;", "Companion", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rb.g, reason: from toString */
/* loaded from: classes3.dex */
public final /* data */ class TracesBody {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Vi.b[] f60221c = {new C3704f(f.INSTANCE.serializer()), null};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List traces;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BodyMeta meta;

    /* renamed from: rb.g$a */
    public /* synthetic */ class a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60224a;
        private static final Xi.f descriptor;

        static {
            a aVar = new a();
            f60224a = aVar;
            H0 h02 = new H0("com.ui.unifi.core.base.net.traces.model.TracesBody", aVar, 2);
            h02.p("traces", false);
            h02.p("meta", true);
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
            return new Vi.b[]{TracesBody.f60221c[0], BodyMeta.C2096a.f60205a};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final TracesBody c(Yi.e decoder) {
            List list;
            BodyMeta c7582a;
            int i10;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            Vi.b[] bVarArr = TracesBody.f60221c;
            R0 r02 = null;
            if (cVarC.B()) {
                list = (List) cVarC.p(fVar, 0, bVarArr[0], null);
                c7582a = (BodyMeta) cVarC.p(fVar, 1, BodyMeta.C2096a.f60205a, null);
                i10 = 3;
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list2 = null;
                BodyMeta c7582a2 = null;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else if (iK == 0) {
                        list2 = (List) cVarC.p(fVar, 0, bVarArr[0], list2);
                        i11 |= 1;
                    } else {
                        if (iK != 1) {
                            throw new UnknownFieldException(iK);
                        }
                        c7582a2 = (BodyMeta) cVarC.p(fVar, 1, BodyMeta.C2096a.f60205a, c7582a2);
                        i11 |= 2;
                    }
                }
                list = list2;
                c7582a = c7582a2;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new TracesBody(i10, list, c7582a, r02);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, TracesBody value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            TracesBody.b(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: rb.g$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return a.f60224a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TracesBody(int i10, List list, BodyMeta c7582a, R0 r02) {
        int i11 = 1;
        if (1 != (i10 & 1)) {
            C0.a(i10, 1, a.f60224a.a());
        }
        this.traces = list;
        if ((i10 & 2) == 0) {
            this.meta = new BodyMeta(0L, i11, (DefaultConstructorMarker) null);
        } else {
            this.meta = c7582a;
        }
    }

    public static final /* synthetic */ void b(TracesBody self, Yi.d output, Xi.f serialDesc) {
        output.q(serialDesc, 0, f60221c[0], self.traces);
        int i10 = 1;
        if (!output.o(serialDesc, 1) && AbstractC6492s.d(self.meta, new BodyMeta(0L, i10, (DefaultConstructorMarker) null))) {
            return;
        }
        output.q(serialDesc, 1, BodyMeta.C2096a.f60205a, self.meta);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TracesBody)) {
            return false;
        }
        TracesBody tracesBody = (TracesBody) other;
        return AbstractC6492s.d(this.traces, tracesBody.traces) && AbstractC6492s.d(this.meta, tracesBody.meta);
    }

    public int hashCode() {
        return (this.traces.hashCode() * 31) + this.meta.hashCode();
    }

    public String toString() {
        return "TracesBody(traces=" + this.traces + ", meta=" + this.meta + ")";
    }
}
