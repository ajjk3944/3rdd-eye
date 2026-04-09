package mb;

import Zi.R0;
import android.os.Parcelable;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import mb.C6788a;
import mb.C6789b;
import mb.C6791d;
import mb.F;
import mb.UnknownController;
import mb.n;
import mb.q;
import mb.r;
import mb.s;
import mb.t;
import mb.u;
import mh.InterfaceC6824a;
import org.snmp4j.util.SnmpConfigurator;

@Vi.n
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0001\u000b\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lmb/x;", "Landroid/os/Parcelable;", "<init>", "()V", "", "seen0", "LZi/R0;", "serializationConstructorMarker", "(ILZi/R0;)V", "self", "LYi/d;", "output", "LXi/f;", "serialDesc", "LYg/J;", "g", "(Lmb/x;LYi/d;LXi/f;)V", "Lmb/j;", "d", "()Lmb/j;", "controllerType", "", "f", "()Ljava/lang/String;", "version", "Lmb/k;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "()Lmb/k;", "ui", "Companion", SnmpConfigurator.O_AUTH_PROTOCOL, "Lmb/a;", "Lmb/b;", "Lmb/d;", "Lmb/n;", "Lmb/q;", "Lmb/r;", "Lmb/s;", "Lmb/t;", "Lmb/u;", "Lmb/E;", "Lmb/F;", "unificore_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class x implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final Yg.m f53933a = Yg.n.a(Yg.q.PUBLICATION, new InterfaceC6824a() { // from class: mb.w
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return x.b();
        }
    });

    /* renamed from: mb.x$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ Vi.b a() {
            return (Vi.b) x.f53933a.getValue();
        }

        public final Vi.b serializer() {
            return a();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ x(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Vi.b b() {
        return new Vi.k("com.ui.unifi.core.base.net.models.devices.UcoreController", O.b(x.class), new th.d[]{O.b(C6788a.class), O.b(C6789b.class), O.b(C6791d.class), O.b(n.class), O.b(q.class), O.b(r.class), O.b(s.class), O.b(t.class), O.b(u.class), O.b(UnknownController.class), O.b(F.class)}, new Vi.b[]{C6788a.C1954a.f53746a, C6789b.a.f53760a, C6791d.a.f53779a, n.a.f53851a, q.a.f53872a, r.a.f53886a, s.a.f53902a, t.a.f53916a, u.a.f53930a, UnknownController.a.f53718a, F.a.f53732a}, new Annotation[0]);
    }

    public static final /* synthetic */ void g(x self, Yi.d output, Xi.f serialDesc) {
    }

    /* renamed from: d */
    public abstract j getControllerType();

    /* renamed from: e */
    public abstract ControllerUi getUi();

    /* renamed from: f */
    public abstract String getVersion();

    private x() {
    }

    public /* synthetic */ x(int i10, R0 r02) {
    }
}
