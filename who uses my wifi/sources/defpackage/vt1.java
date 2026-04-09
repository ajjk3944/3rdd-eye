package defpackage;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vt1 extends hu1 {
    public final /* synthetic */ int h = 3;
    public final Object i;

    public vt1(jt1 jt1Var, fr1 fr1Var, int i, View view) {
        super(jt1Var, "UGogIgDf9q+IGA3QKHqW/91b9ZzRTVJqtfmUoLBkD310fwrDg1hJZvDQk8/WK1MH", "sEqRe1gPhw/PwjhUj/qVAEUjKSVJDrXHsmrE44pcjTE=", fr1Var, i, 57);
        this.i = view;
    }

    @Override // defpackage.hu1
    public final void a() {
        switch (this.h) {
            case 0:
                Method method = this.e;
                xe1 xe1Var = (xe1) this.i;
                long[] jArr = (long[]) method.invoke(null, Long.valueOf(xe1Var.c), Long.valueOf(xe1Var.d), Long.valueOf(xe1Var.e), Long.valueOf(xe1Var.f));
                fr1 fr1Var = this.d;
                synchronized (fr1Var) {
                    long j = jArr[0];
                    fr1Var.b();
                    ((qr1) fr1Var.g).j0(j);
                    long j2 = jArr[1];
                    fr1Var.b();
                    ((qr1) fr1Var.g).k0(j2);
                }
                return;
            case 1:
                Method method2 = this.e;
                dm1 dm1Var = (dm1) this.i;
                List list = dm1Var.a;
                dm1Var.a = Collections.EMPTY_LIST;
                int iIntValue = ((Integer) method2.invoke(null, list)).intValue();
                fr1 fr1Var2 = this.d;
                synchronized (fr1Var2) {
                    int iB = um.B(iIntValue);
                    fr1Var2.b();
                    ((qr1) fr1Var2.g).u0(iB);
                }
                return;
            case 2:
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.i;
                if (stackTraceElementArr != null) {
                    ys1 ys1Var = new ys1((String) this.e.invoke(null, stackTraceElementArr));
                    fr1 fr1Var3 = this.d;
                    synchronized (fr1Var3) {
                        try {
                            long jLongValue = ys1Var.u.longValue();
                            fr1Var3.b();
                            ((qr1) fr1Var3.g).N(jLongValue);
                            if (((Boolean) ys1Var.v).booleanValue()) {
                                int i = true != ((Boolean) ys1Var.w).booleanValue() ? 2 : 1;
                                fr1Var3.b();
                                ((qr1) fr1Var3.g).r0(i);
                            } else {
                                fr1Var3.b();
                                ((qr1) fr1Var3.g).r0(3);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                View view = (View) this.i;
                if (view != null) {
                    iz1 iz1Var = mz1.L3;
                    tw1 tw1Var = tw1.e;
                    Boolean bool = (Boolean) tw1Var.c.a(iz1Var);
                    Boolean bool2 = (Boolean) tw1Var.c.a(mz1.Lb);
                    String str = (String) this.e.invoke(null, view, this.a.a.getResources().getDisplayMetrics(), bool, bool2);
                    mt1 mt1Var = new mt1(18);
                    HashMap mapT = a30.t(str);
                    if (mapT != null) {
                        mt1Var.t = (Long) mapT.get(0);
                        mt1Var.u = (Long) mapT.get(1);
                        mt1Var.v = (Long) mapT.get(2);
                        mt1Var.w = (Long) mapT.get(3);
                        mt1Var.x = (Long) mapT.get(4);
                    }
                    or1 or1VarA = pr1.A();
                    long jLongValue2 = mt1Var.t.longValue();
                    or1VarA.b();
                    ((pr1) or1VarA.g).C(jLongValue2);
                    long jLongValue3 = mt1Var.u.longValue();
                    or1VarA.b();
                    ((pr1) or1VarA.g).D(jLongValue3);
                    long jLongValue4 = mt1Var.v.longValue();
                    or1VarA.b();
                    ((pr1) or1VarA.g).E(jLongValue4);
                    if (bool2.booleanValue()) {
                        long jLongValue5 = mt1Var.x.longValue();
                        or1VarA.b();
                        ((pr1) or1VarA.g).B(jLongValue5);
                    }
                    if (bool.booleanValue()) {
                        long jLongValue6 = mt1Var.w.longValue();
                        or1VarA.b();
                        ((pr1) or1VarA.g).F(jLongValue6);
                    }
                    fr1 fr1Var4 = this.d;
                    pr1 pr1Var = (pr1) or1VarA.d();
                    fr1Var4.b();
                    ((qr1) fr1Var4.g).W(pr1Var);
                    return;
                }
                return;
        }
    }

    public vt1(jt1 jt1Var, fr1 fr1Var, int i, xe1 xe1Var) {
        super(jt1Var, "OKoG374XK3cB1cjYFPuO/Bg6vy6AufzuCyu4QCURxkWhJwL4+NqQjs8XziSHB+CQ", "PjHrXBXcXoGkJe75zH8RZ0khapXmOV4o2gX+YgkGdus=", fr1Var, i, 85);
        this.i = xe1Var;
    }

    public vt1(jt1 jt1Var, fr1 fr1Var, int i, dm1 dm1Var) {
        super(jt1Var, "sl6J6ogR1CQFBNHXqYqYlsoHhQEQ3GzqykotbgjuxxtAslvwVDD28XhO/FGDcWNY", "etPaLFHhmzrmC9guV7/txSJ19uqkwWx/gSnrE4vBCvs=", fr1Var, i, 94);
        this.i = dm1Var;
    }

    public vt1(jt1 jt1Var, fr1 fr1Var, int i, StackTraceElement[] stackTraceElementArr) {
        super(jt1Var, "ffEAQyBH71yR4B2obQT/Qgb3Fo0ajWwFYmmZt2nfIS2fjNh6ir76IWAmhSUkzxpD", "s+erUKEK0AKg0XrZCH85OEIt0v0u2CGPZAaj/S6Q0Yk=", fr1Var, i, 45);
        this.i = stackTraceElementArr;
    }
}
