package rb;

import Vi.n;
import Yg.m;
import Yg.q;
import Zi.R0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;

@n
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lrb/f;", "", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "<init>", "(ILZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "d", "(Lrb/f;LYi/d;LXi/f;)V", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final m f60220a = Yg.n.a(q.PUBLICATION, new InterfaceC6824a() { // from class: rb.e
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return f.b();
        }
    });

    /* renamed from: rb.f$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ Vi.b a() {
            return (Vi.b) f.f60220a.getValue();
        }

        public final Vi.b serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ f(int i10, R0 r02) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Vi.b b() {
        return new Vi.f(O.b(f.class), new Annotation[0]);
    }

    public static final /* synthetic */ void d(f self, Yi.d output, Xi.f serialDesc) {
    }
}
