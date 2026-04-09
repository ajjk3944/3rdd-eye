package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qt1 extends hu1 {
    public final /* synthetic */ int h = 1;
    public Object i;
    public final Object j;

    public qt1(jt1 jt1Var, fr1 fr1Var, int i, Context context) {
        super(jt1Var, "JC98YOkW1OV00In88Kxh39aoA4/Lc5LugpNahl16Tw21h78xPzCO3AkqsFSMWF+O", "uHu4aeoXgHtmEAr/p8TbphROLjKobmRTgSnNeTPf/24=", fr1Var, i, 31);
        this.i = null;
        this.j = context;
    }

    @Override // defpackage.hu1
    public final void a() {
        switch (this.h) {
            case 0:
                View view = (View) this.j;
                if (view == null) {
                    return;
                }
                Boolean bool = (Boolean) tw1.e.c.a(mz1.P2);
                boolean zBooleanValue = bool.booleanValue();
                Object[] objArr = (Object[]) this.e.invoke(null, view, (Activity) this.i, bool);
                fr1 fr1Var = this.d;
                synchronized (fr1Var) {
                    try {
                        long jLongValue = ((Long) objArr[0]).longValue();
                        fr1Var.b();
                        ((qr1) fr1Var.g).d0(jLongValue);
                        long jLongValue2 = ((Long) objArr[1]).longValue();
                        fr1Var.b();
                        ((qr1) fr1Var.g).e0(jLongValue2);
                        if (zBooleanValue) {
                            String str = (String) objArr[2];
                            fr1Var.b();
                            ((qr1) fr1Var.g).f0(str);
                        }
                    } finally {
                    }
                }
                return;
            default:
                fr1 fr1Var2 = this.d;
                fr1Var2.b();
                ((qr1) fr1Var2.g).B(-1L);
                fr1Var2.b();
                ((qr1) fr1Var2.g).C(-1L);
                Context context = (Context) this.j;
                if (context == null) {
                    context = this.a.a;
                }
                if (((List) this.i) == null) {
                    this.i = (List) this.e.invoke(null, context);
                }
                List list = (List) this.i;
                if (list == null || list.size() != 2) {
                    return;
                }
                synchronized (fr1Var2) {
                    long jLongValue3 = ((Long) ((List) this.i).get(0)).longValue();
                    fr1Var2.b();
                    ((qr1) fr1Var2.g).B(jLongValue3);
                    long jLongValue4 = ((Long) ((List) this.i).get(1)).longValue();
                    fr1Var2.b();
                    ((qr1) fr1Var2.g).C(jLongValue4);
                }
                return;
        }
    }

    public qt1(jt1 jt1Var, fr1 fr1Var, int i, View view, Activity activity) {
        super(jt1Var, "YJMz4lZ/SFOXN6kW19UKnvAqcLtndNv4f6er9d24/5MuXcrsMTIC+9Jfbhpe2HMW", "6iuDHA2XEqaGCIdpenyLvoYWzHjKpoW5EjYN40bz5Cs=", fr1Var, i, 62);
        this.j = view;
        this.i = activity;
    }
}
