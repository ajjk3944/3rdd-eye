package com.ui.wifiman.db;

import android.content.Context;
import bc.AbstractC4082a;
import cc.InterfaceC4238b;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u0000 I2\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H&¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H&¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H&¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H&¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H&¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H&¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H&¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H&¢\u0006\u0004\b8\u00109J\u000f\u0010;\u001a\u00020:H&¢\u0006\u0004\b;\u0010<J\u000f\u0010>\u001a\u00020=H&¢\u0006\u0004\b>\u0010?J\u000f\u0010A\u001a\u00020@H&¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH&¢\u0006\u0004\bD\u0010EJ\u000f\u0010G\u001a\u00020FH&¢\u0006\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/ui/wifiman/db/WifimanDB;", "Lm2/q;", "<init>", "()V", "LVb/a;", SnmpConfigurator.O_CONTEXT_ENGINE_ID, "()LVb/a;", "LUb/a;", "D", "()LUb/a;", "Lbc/a;", "F", "()Lbc/a;", "LMb/a;", "C", "()LMb/a;", "LOb/a;", "H", "()LOb/a;", "LTb/b;", "X", "()LTb/b;", "LSb/b;", "W", "()LSb/b;", "LWb/j;", "P", "()LWb/j;", "LWb/h;", "O", "()LWb/h;", "LWb/a;", "N", "()LWb/a;", "LZb/a;", "R", "()LZb/a;", "LXb/e;", "S", "()LXb/e;", "LYb/b;", "Q", "()LYb/b;", "Lcc/b;", SnmpConfigurator.O_PRIV_PASSPHRASE, "()Lcc/b;", "LLb/b;", "T", "()LLb/b;", "LNb/e;", "G", "()LNb/e;", "Lac/c;", "U", "()Lac/c;", "Lac/e;", "V", "()Lac/e;", "LPb/c;", "K", "()LPb/c;", "LPb/e;", "L", "()LPb/e;", "LPb/a;", "J", "()LPb/a;", "LRb/a;", "M", "()LRb/a;", "LNb/a;", "I", "()LNb/a;", "p", SnmpConfigurator.O_AUTH_PROTOCOL, "app-db_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class WifimanDB extends m2.q {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: com.ui.wifiman.db.WifimanDB$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WifimanDB a(Context context) {
            AbstractC6492s.i(context, "context");
            return (WifimanDB) m2.p.a(context, WifimanDB.class, "usurvey_db").a(B.m(), B.x(), B.I(), B.T(), B.e0(), B.o0(), B.p0(), B.q0(), B.r0(), B.c(), B.d(), B.e(), B.f(), B.g(), B.h(), B.i(), B.j(), B.k(), B.l(), B.n(), B.o(), B.p(), B.q(), B.r(), B.s(), B.t(), B.u(), B.v(), B.w(), B.y(), B.z(), B.A(), B.B(), B.C(), B.D(), B.E(), B.F(), B.G(), B.H(), B.J(), B.K(), B.L(), B.M(), B.N(), B.O(), B.P(), B.Q(), B.R(), B.S(), B.U(), B.V(), B.W(), B.X(), B.Y(), B.Z(), B.a0(), B.b0(), B.c0(), B.d0(), B.f0(), B.g0(), B.h0(), B.i0(), B.j0(), B.k0(), B.l0(), B.m0(), B.n0()).b();
        }

        private Companion() {
        }
    }

    public abstract Mb.a C();

    public abstract Ub.a D();

    public abstract Vb.a E();

    public abstract AbstractC4082a F();

    public abstract Nb.e G();

    public abstract Ob.a H();

    public abstract Nb.a I();

    public abstract Pb.a J();

    public abstract Pb.c K();

    public abstract Pb.e L();

    public abstract Rb.a M();

    public abstract Wb.a N();

    public abstract Wb.h O();

    public abstract Wb.j P();

    public abstract Yb.b Q();

    public abstract Zb.a R();

    public abstract Xb.e S();

    public abstract Lb.b T();

    public abstract ac.c U();

    public abstract ac.e V();

    public abstract Sb.b W();

    public abstract Tb.b X();

    public abstract InterfaceC4238b Y();
}
