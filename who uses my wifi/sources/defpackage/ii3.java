package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ii3 extends ti3 {
    public final /* synthetic */ int f = 3;
    public final Object g;
    public final Object h;

    public ii3(fr1 fr1Var, gi3 gi3Var, DisplayMetrics displayMetrics, View view, gk3 gk3Var) {
        super("P6F0ZRwWAQfQFwxv0Pq3Kr7GsgVJK2iuMjcPK+Aq3kgEIqqz95IgzklzBsNVE1/z", "noWWhxc3WlXlb4cqOg7NtD3uZWHj+L+uVXJvY7XilyA=", fr1Var, gi3Var, gk3Var.a(124));
        this.g = displayMetrics;
        this.h = view;
    }

    @Override // defpackage.ti3
    public final void a(Method method, fr1 fr1Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        switch (this.f) {
            case 0:
                Object[] objArr = (Object[]) method.invoke("", (View) this.h, (Activity) this.g);
                objArr.getClass();
                synchronized (fr1Var) {
                    long jLongValue = ((Long) objArr[0]).longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).d0(jLongValue);
                    long jLongValue2 = ((Long) objArr[1]).longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).e0(jLongValue2);
                    String str = (String) objArr[2];
                    fr1Var.b();
                    ((qr1) fr1Var.g).f0(str);
                }
                return;
            case 1:
                Long lValueOf = -1L;
                try {
                    if (Build.VERSION.SDK_INT >= 30) {
                        Long l = (Long) method.invoke("", (Context) this.g);
                        if (l == null) {
                            throw null;
                        }
                        lValueOf = l;
                    } else {
                        n70 n70Var = (n70) ((Map) this.h).get("gs");
                        if (n70Var != null && n70Var.isDone()) {
                            lValueOf = Long.valueOf(((qr1) n70Var.get()).y0());
                        }
                    }
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (fr1Var) {
                    long jLongValue3 = lValueOf.longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).c0(jLongValue3);
                }
                return;
            case 2:
                Long[] lArr = new Long[9];
                Arrays.fill((Object[]) lArr, (Object) (-1L));
                Map map = (Map) this.g;
                Long l2 = (Long) map.get("tcq");
                if (l2 == null) {
                    l2 = -1L;
                }
                lArr[0] = l2;
                Long l3 = (Long) map.get("tpq");
                if (l3 == null) {
                    l3 = -1L;
                }
                lArr[1] = l3;
                Long l4 = (Long) map.get("tcv");
                if (l4 == null) {
                    l4 = -1L;
                }
                lArr[2] = l4;
                Long l5 = (Long) map.get("tpv");
                if (l5 == null) {
                    l5 = -1L;
                }
                lArr[3] = l5;
                Long l6 = (Long) map.get("tchv");
                if (l6 == null) {
                    l6 = -1L;
                }
                lArr[4] = l6;
                Long l7 = (Long) map.get("tphv");
                if (l7 == null) {
                    l7 = -1L;
                }
                lArr[5] = l7;
                Long l8 = (Long) map.get("tcc");
                if (l8 == null) {
                    l8 = -1L;
                }
                lArr[6] = l8;
                Long l9 = (Long) map.get("tpc");
                if (l9 == null) {
                    l9 = -1L;
                }
                lArr[7] = l9;
                Long l10 = (Long) map.get("tst");
                if (l10 == null) {
                    l10 = -1L;
                }
                lArr[8] = l10;
                for (int i = 0; i < 9; i++) {
                    if (lArr[i] == null) {
                        lArr[i] = -1L;
                    }
                }
                Long[] lArr2 = (Long[]) method.invoke("", lArr, Integer.valueOf(((eg3) this.h).ordinal()));
                lArr2.getClass();
                synchronized (fr1Var) {
                    long jLongValue4 = lArr2[0].longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).n0(jLongValue4);
                    long jLongValue5 = lArr2[1].longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).D(jLongValue5);
                    long jLongValue6 = lArr2[2].longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).R0(jLongValue6);
                    long jLongValue7 = lArr2[3].longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).O0(jLongValue7);
                    long jLongValue8 = lArr2[4].longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).j0(jLongValue8);
                    long jLongValue9 = lArr2[5].longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).k0(jLongValue9);
                    long jLongValue10 = lArr2[6].longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).Q(jLongValue10);
                    long jLongValue11 = lArr2[7].longValue();
                    fr1Var.b();
                    ((qr1) fr1Var.g).R(jLongValue11);
                }
                return;
            default:
                View view = (View) this.h;
                if (view == null) {
                    return;
                }
                Object objInvoke = method.invoke("", (DisplayMetrics) this.g, view);
                objInvoke.getClass();
                Long[] lArr3 = (Long[]) objInvoke;
                or1 or1VarA = pr1.A();
                long jLongValue12 = lArr3[2].longValue();
                or1VarA.b();
                ((pr1) or1VarA.g).C(jLongValue12);
                long jLongValue13 = lArr3[1].longValue();
                or1VarA.b();
                ((pr1) or1VarA.g).D(jLongValue13);
                long jLongValue14 = lArr3[0].longValue();
                or1VarA.b();
                ((pr1) or1VarA.g).E(jLongValue14);
                long jLongValue15 = lArr3[3].longValue();
                or1VarA.b();
                ((pr1) or1VarA.g).B(jLongValue15);
                long jLongValue16 = lArr3[4].longValue();
                or1VarA.b();
                ((pr1) or1VarA.g).F(jLongValue16);
                pr1 pr1Var = (pr1) or1VarA.d();
                fr1Var.b();
                ((qr1) fr1Var.g).W(pr1Var);
                return;
        }
    }

    public ii3(fr1 fr1Var, gi3 gi3Var, View view, Activity activity, gk3 gk3Var) {
        super("71irZxeyztMVPxtkZNjCXCWzc9uBzzqfxPgw1LkoaIGD1YWtoRaLj8ZtqyMHro2I", "sazFFsabItlse3qDY43b32ZnLCjQJ0+CJQYLaEeKmSw=", fr1Var, gi3Var, gk3Var.a(111));
        this.h = view;
        this.g = activity;
    }

    public ii3(fr1 fr1Var, gi3 gi3Var, Map map, Context context, gk3 gk3Var) {
        super("yl2V2fIFd/+gtM2i3wtw7rRydnC7INCVtpRFdnYEC9BkEYS1KI4o6evRDqm9gjRN", "/ngo8an629JW3IpM1KyGjEthGKpic0JTOThCbrYq6ZE=", fr1Var, gi3Var, gk3Var.a(120));
        this.g = context;
        this.h = map;
    }

    public ii3(fr1 fr1Var, gi3 gi3Var, eg3 eg3Var, Map map, gk3 gk3Var) {
        super("lJ67yAwBUtoZhasVqN11g6g6opAmTxjVxzUKxhl0fOhTr4nQH4cVWV7NJy0RD49z", "0isRm8IoYsyXMQyBCJPbREn4r5FwCMP2Q3k9zoXRqyk=", fr1Var, gi3Var, gk3Var.a(122));
        this.g = map;
        this.h = eg3Var;
    }
}
