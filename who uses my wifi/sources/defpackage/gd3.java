package defpackage;

import android.content.Context;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class gd3 {
    public static volatile int e = 1;
    public final Context a;
    public final Executor b;
    public final gi4 c;
    public final boolean d;

    public gd3(Context context, Executor executor, gi4 gi4Var, boolean z) {
        this.a = context;
        this.b = executor;
        this.c = gi4Var;
        this.d = z;
    }

    public static gd3 a(Context context, Executor executor, boolean z) {
        k01 k01Var = new k01();
        if (z) {
            executor.execute(new sz2(context, k01Var, 14));
        } else {
            executor.execute(new bs2(28, k01Var));
        }
        return new gd3(context, executor, k01Var.a, z);
    }

    public void b(int i, long j) {
        e(i, j, null, null, null);
    }

    public void c(int i, long j, Exception exc) {
        e(i, j, exc, null, null);
    }

    public void d(String str, int i) {
        e(i, 0L, null, null, str);
    }

    public final gi4 e(int i, long j, Exception exc, String str, String str2) {
        int i2 = 0;
        if (!this.d) {
            gi4 gi4Var = this.c;
            Executor executor = this.b;
            su2 su2Var = su2.l;
            gi4Var.getClass();
            gi4 gi4Var2 = new gi4();
            gi4Var.b.c(new mn2(executor, su2Var, gi4Var2, i2));
            gi4Var.h();
            return gi4Var2;
        }
        Context context = this.a;
        uq1 uq1VarA = xq1.A();
        String packageName = context.getPackageName();
        uq1VarA.b();
        ((xq1) uq1VarA.g).B(packageName);
        uq1VarA.b();
        ((xq1) uq1VarA.g).C(j);
        int i3 = e;
        uq1VarA.b();
        ((xq1) uq1VarA.g).H(i3);
        if (exc != null) {
            Object obj = pl3.a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String string = stringWriter.toString();
            uq1VarA.b();
            ((xq1) uq1VarA.g).D(string);
            String name = exc.getClass().getName();
            uq1VarA.b();
            ((xq1) uq1VarA.g).E(name);
        }
        if (str2 != null) {
            uq1VarA.b();
            ((xq1) uq1VarA.g).F(str2);
        }
        if (str != null) {
            uq1VarA.b();
            ((xq1) uq1VarA.g).G(str);
        }
        gi4 gi4Var3 = this.c;
        Executor executor2 = this.b;
        t3 t3Var = new t3(uq1VarA, i, 15);
        gi4Var3.getClass();
        gi4 gi4Var4 = new gi4();
        gi4Var3.b.c(new mn2(executor2, t3Var, gi4Var4, i2));
        gi4Var3.h();
        return gi4Var4;
    }
}
