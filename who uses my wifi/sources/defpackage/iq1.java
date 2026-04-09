package defpackage;

import java.util.ArrayDeque;
import java.util.Optional;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class iq1 {
    public final t3 a;
    public final z71 b = new z71(13);
    public final r2 c;

    public iq1(t3 t3Var, r2 r2Var) {
        this.a = t3Var;
        this.c = r2Var;
    }

    public final Optional a() {
        ip1 ip1Var;
        try {
            ArrayDeque arrayDeque = (ArrayDeque) this.b.g;
            if (arrayDeque.isEmpty()) {
                throw new dq1();
            }
            bq1 bq1Var = (bq1) arrayDeque.pop();
            long j = bq1Var.a;
            long j2 = bq1Var.b;
            long j3 = bq1Var.c;
            t3 t3Var = this.a;
            if (t3Var.g < j2) {
                return Optional.of(ip1.M);
            }
            this.c.e(j);
            if (j3 == 0) {
                while (t3Var.g > j2) {
                    t3Var.B();
                }
            }
            return Optional.empty();
        } catch (dq1 unused) {
            ip1Var = ip1.C;
            return Optional.of(ip1Var);
        } catch (eq1 unused2) {
            ip1Var = ip1.M;
            return Optional.of(ip1Var);
        } catch (yp1 e) {
            e = e;
            throw new AssertionError(up1.a("CEiv6BFfPnitUE+D"), e);
        } catch (zp1 e2) {
            e = e2;
            throw new AssertionError(up1.a("CEiv6BFfPnitUE+D"), e);
        }
    }
}
