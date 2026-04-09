package kb;

import Zi.R0;
import java.lang.annotation.Annotation;
import kb.RequestHeader;
import kb.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import kotlin.text.C6510d;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;
import ub.C8156c;

@Vi.n
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"Lkb/f;", "", "<init>", "()V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Lkb/f;LYi/d;LXi/f;)V", "", "d", "()[B", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "Lkb/d;", "Lkb/n;", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final Yg.m f51357a = Yg.n.a(Yg.q.PUBLICATION, new InterfaceC6824a() { // from class: kb.e
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return f.b();
        }
    });

    /* renamed from: kb.f$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ Vi.b a() {
            return (Vi.b) f.f51357a.getValue();
        }

        public final Vi.b serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Vi.b b() {
        return new Vi.k("com.ui.unifi.core.base.net.message.Header", O.b(f.class), new th.d[]{O.b(d.class), O.b(RequestHeader.class)}, new Vi.b[]{d.a.f51356a, RequestHeader.a.f51383a}, new Annotation[0]);
    }

    public static final /* synthetic */ void e(f self, Yi.d output, Xi.f serialDesc) {
    }

    public final byte[] d() {
        String strC;
        if (this instanceof RequestHeader) {
            C8156c c8156c = C8156c.f62925a;
            strC = c8156c.d().c(RequestHeader.INSTANCE.serializer(), this);
        } else {
            if (!(this instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            C8156c c8156c2 = C8156c.f62925a;
            strC = c8156c2.d().c(d.Companion.serializer(), this);
        }
        byte[] bytes = strC.getBytes(C6510d.f52215b);
        AbstractC6492s.h(bytes, "getBytes(...)");
        return bytes;
    }

    private f() {
    }

    public /* synthetic */ f(int i10, R0 r02) {
    }
}
