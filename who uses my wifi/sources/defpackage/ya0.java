package defpackage;

import com.phuongpn.whousemywifi.networkscanner.MainActivity;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ya0 extends mz0 implements hy {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ bp0 l;
    public final /* synthetic */ bp0 m;
    public final /* synthetic */ bp0 n;
    public final /* synthetic */ bp0 o;
    public final /* synthetic */ MainActivity p;
    public final /* synthetic */ so1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya0(bp0 bp0Var, bp0 bp0Var2, bp0 bp0Var3, bp0 bp0Var4, MainActivity mainActivity, so1 so1Var, oj ojVar) {
        super(2, ojVar);
        this.l = bp0Var;
        this.m = bp0Var2;
        this.n = bp0Var3;
        this.o = bp0Var4;
        this.p = mainActivity;
        this.q = so1Var;
    }

    @Override // defpackage.hy
    public final Object f(Object obj, Object obj2) {
        return ((ya0) h((oj) obj2, (hy) obj)).m(z31.a);
    }

    @Override // defpackage.s9
    public final oj h(oj ojVar, Object obj) {
        ya0 ya0Var = new ya0(this.l, this.m, this.n, this.o, this.p, this.q, ojVar);
        ya0Var.k = obj;
        return ya0Var;
    }

    @Override // defpackage.s9
    public final Object m(Object obj) throws Throwable {
        hy hyVar = (hy) this.k;
        int i = this.j;
        int i2 = 1;
        if (i == 0) {
            bd2.x(obj);
            int i3 = fu0.a;
            eu0 eu0Var = new eu0(12);
            cp0 cp0Var = new cp0();
            ArrayList arrayList = new ArrayList();
            cp0Var.f = arrayList;
            bp0 bp0Var = this.l;
            long j = bp0Var.f;
            bp0 bp0Var2 = this.m;
            long j2 = bp0Var2.f;
            bp0 bp0Var3 = this.n;
            if (j > j2 || j2 > bp0Var3.f) {
                long j3 = bp0Var3.f;
                if (j <= j3) {
                    while (true) {
                        ((ArrayList) cp0Var.f).add(new Long(j));
                        if (j == j3) {
                            break;
                        }
                        j++;
                    }
                }
            } else {
                arrayList.add(new Long(j));
                long j4 = bp0Var2.f;
                long j5 = j4 + 1;
                long j6 = this.o.f - 1;
                long j7 = 0;
                while (j7 < j6) {
                    int i4 = i2;
                    long j8 = j6;
                    if (j4 <= bp0Var.f) {
                        MainActivity.e0 = 2;
                    } else if (j5 > bp0Var3.f) {
                        MainActivity.e0 = i4;
                    }
                    int i5 = MainActivity.e0;
                    if (i5 == i4) {
                        ((ArrayList) cp0Var.f).add(new Long(j4));
                        j4--;
                        MainActivity.e0 = 2;
                    } else if (i5 == 2) {
                        ((ArrayList) cp0Var.f).add(new Long(j5));
                        j5++;
                        MainActivity.e0 = 1;
                    }
                    j7++;
                    j6 = j8;
                    i2 = 1;
                }
            }
            xa0 xa0Var = new xa0(cp0Var, eu0Var, this.p, hyVar, this.q, null);
            this.k = null;
            this.j = 1;
            ht0 ht0Var = new ht0(getContext(), this);
            Object objR = yb.r(ht0Var, ht0Var, xa0Var);
            rk rkVar = rk.f;
            if (objR == rkVar) {
                return rkVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bd2.x(obj);
        }
        return z31.a;
    }
}
