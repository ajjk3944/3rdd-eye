package rb;

import Vi.n;
import Zi.C3709h0;
import Zi.H0;
import Zi.M;
import Zi.R0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.UnknownFieldException;
import org.snmp4j.util.SnmpConfigurator;

@n
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0011 B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lrb/a;", "", "", "timestamp", "<init>", "(J)V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(IJLZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lrb/a;LYi/d;LXi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getTimestamp", "()J", "Companion", SnmpConfigurator.O_BIND_ADDRESS, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rb.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes3.dex */
public final /* data */ class BodyMeta {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* renamed from: rb.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2096a implements M {

        /* renamed from: a, reason: collision with root package name */
        public static final C2096a f60205a;
        private static final Xi.f descriptor;

        static {
            C2096a c2096a = new C2096a();
            f60205a = c2096a;
            H0 h02 = new H0("com.ui.unifi.core.base.net.traces.model.BodyMeta", c2096a, 1);
            h02.p("timestamp", true);
            descriptor = h02;
        }

        private C2096a() {
        }

        @Override // Vi.b, Vi.o, Vi.InterfaceC3627a
        public final Xi.f a() {
            return descriptor;
        }

        @Override // Zi.M
        public final Vi.b[] d() {
            return new Vi.b[]{C3709h0.f25636a};
        }

        @Override // Vi.InterfaceC3627a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final BodyMeta c(Yi.e decoder) {
            long jQ;
            AbstractC6492s.i(decoder, "decoder");
            Xi.f fVar = descriptor;
            Yi.c cVarC = decoder.c(fVar);
            int i10 = 1;
            if (cVarC.B()) {
                jQ = cVarC.q(fVar, 0);
            } else {
                long jQ2 = 0;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int iK = cVarC.k(fVar);
                    if (iK == -1) {
                        z10 = false;
                    } else {
                        if (iK != 0) {
                            throw new UnknownFieldException(iK);
                        }
                        jQ2 = cVarC.q(fVar, 0);
                        i11 = 1;
                    }
                }
                jQ = jQ2;
                i10 = i11;
            }
            cVarC.b(fVar);
            return new BodyMeta(i10, jQ, (R0) null);
        }

        @Override // Vi.o
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final void e(Yi.f encoder, BodyMeta value) {
            AbstractC6492s.i(encoder, "encoder");
            AbstractC6492s.i(value, "value");
            Xi.f fVar = descriptor;
            Yi.d dVarC = encoder.c(fVar);
            BodyMeta.a(value, dVarC, fVar);
            dVarC.b(fVar);
        }
    }

    /* renamed from: rb.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final Vi.b serializer() {
            return C2096a.f60205a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BodyMeta(int i10, long j10, R0 r02) {
        if ((i10 & 1) == 0) {
            this.timestamp = System.currentTimeMillis();
        } else {
            this.timestamp = j10;
        }
    }

    public static final /* synthetic */ void a(BodyMeta self, Yi.d output, Xi.f serialDesc) {
        if (!output.o(serialDesc, 0) && self.timestamp == System.currentTimeMillis()) {
            return;
        }
        output.p(serialDesc, 0, self.timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BodyMeta) && this.timestamp == ((BodyMeta) other).timestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "BodyMeta(timestamp=" + this.timestamp + ")";
    }

    public BodyMeta(long j10) {
        this.timestamp = j10;
    }

    public /* synthetic */ BodyMeta(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? System.currentTimeMillis() : j10);
    }
}
