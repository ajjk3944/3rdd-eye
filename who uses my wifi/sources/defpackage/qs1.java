package defpackage;

import android.os.ConditionVariable;
import android.os.RemoteException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qs1 {
    public static final ConditionVariable c = new ConditionVariable();
    public static volatile he3 d = null;
    public static volatile Random e = null;
    public final jt1 a;
    public volatile Boolean b;

    public qs1(jt1 jt1Var) {
        this.a = jt1Var;
        jt1Var.b.execute(new a9(27, this));
    }

    public final void a(int i, int i2, long j, String str, Exception exc) {
        try {
            c.block();
            if (!this.b.booleanValue() || d == null) {
                return;
            }
            uq1 uq1VarA = xq1.A();
            String packageName = this.a.a.getPackageName();
            uq1VarA.b();
            ((xq1) uq1VarA.g).B(packageName);
            uq1VarA.b();
            ((xq1) uq1VarA.g).C(j);
            if (str != null) {
                uq1VarA.b();
                ((xq1) uq1VarA.g).F(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                String string = stringWriter.toString();
                uq1VarA.b();
                ((xq1) uq1VarA.g).D(string);
                String name = exc.getClass().getName();
                uq1VarA.b();
                ((xq1) uq1VarA.g).E(name);
            }
            he3 he3Var = d;
            byte[] bArrB = ((xq1) uq1VarA.d()).b();
            he3Var.getClass();
            if (i2 == -1) {
                i2 = 0;
            }
            if (he3Var.b) {
                je3 je3Var = he3Var.a;
                je3Var.t0(bArrB);
                je3Var.z(i2);
                je3Var.B(i);
                je3Var.G2();
                je3Var.b();
            }
        } catch (RemoteException | Exception unused) {
        }
    }
}
