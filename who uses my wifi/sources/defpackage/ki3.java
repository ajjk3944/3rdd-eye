package defpackage;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ki3 implements si3 {
    public final Map a;
    public final fr1 b;
    public final fk3 c;
    public final long d;

    public ki3(fr1 fr1Var, Map map, vf3 vf3Var, gk3 gk3Var) {
        this.a = map;
        this.b = fr1Var;
        this.c = gk3Var.a(112);
        this.d = vf3Var.L();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        qr1 qr1Var;
        try {
            try {
                this.c.a();
                n70 n70Var = (n70) this.a.get("gs");
                if (n70Var != null && (qr1Var = (qr1) n70Var.get(this.d, TimeUnit.MILLISECONDS)) != null) {
                    fr1 fr1Var = this.b;
                    synchronized (fr1Var) {
                        zr1 zr1VarA0 = qr1Var.A0();
                        fr1Var.b();
                        ((qr1) fr1Var.g).o0(zr1VarA0);
                        long jX0 = qr1Var.x0();
                        fr1Var.b();
                        ((qr1) fr1Var.g).X(jX0);
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException e) {
                this.c.b(e);
            }
            this.c.c();
            return null;
        } catch (Throwable th) {
            this.c.c();
            throw th;
        }
    }
}
