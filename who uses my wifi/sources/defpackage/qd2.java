package defpackage;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class qd2 implements of1, iq3, dp2 {
    public final /* synthetic */ int f;
    public static final /* synthetic */ qd2 g = new qd2(3);
    public static final /* synthetic */ qd2 h = new qd2(6);
    public static final /* synthetic */ qd2 i = new qd2(7);
    public static final /* synthetic */ qd2 j = new qd2(8);
    public static final /* synthetic */ qd2 k = new qd2(9);
    public static final /* synthetic */ qd2 l = new qd2(10);
    public static final /* synthetic */ qd2 m = new qd2(11);
    public static final /* synthetic */ qd2 n = new qd2(12);
    public static final /* synthetic */ qd2 o = new qd2(13);
    public static final /* synthetic */ qd2 p = new qd2(14);
    public static final /* synthetic */ qd2 q = new qd2(15);
    public static final /* synthetic */ qd2 r = new qd2(16);
    public static final /* synthetic */ qd2 s = new qd2(17);
    public static final /* synthetic */ qd2 t = new qd2(18);
    public static final /* synthetic */ qd2 u = new qd2(19);
    public static final /* synthetic */ qd2 v = new qd2(20);
    public static final /* synthetic */ qd2 w = new qd2(21);
    public static final /* synthetic */ qd2 x = new qd2(22);
    public static final /* synthetic */ qd2 y = new qd2(23);
    public static final /* synthetic */ qd2 z = new qd2(24);
    public static final /* synthetic */ qd2 A = new qd2(25);
    public static final /* synthetic */ qd2 B = new qd2(26);
    public static final /* synthetic */ qd2 C = new qd2(27);
    public static final /* synthetic */ qd2 D = new qd2(28);
    public static final /* synthetic */ qd2 E = new qd2(29);

    public /* synthetic */ qd2(int i2) {
        this.f = i2;
    }

    @Override // defpackage.of1
    public lf1[] a() {
        AtomicInteger atomicInteger = sf2.z;
        return new lf1[]{new nj1(), new oi1(), new jj1(jk1.e, 32, sn3.j)};
    }

    @Override // defpackage.dp2
    /* renamed from: c */
    public void mo14c(Object obj) {
        int i2;
        switch (this.f) {
            case 6:
                ((xm2) obj).b();
                return;
            case 7:
                ((dn2) obj).D0();
                return;
            case 8:
                ((um2) obj).r();
                return;
            case 9:
                ((um2) obj).c();
                return;
            case 10:
                ((rn2) obj).e();
                return;
            case 11:
                ((wn2) obj).i();
                return;
            case 12:
                ((ye4) obj).Y();
                return;
            case 13:
                ((ye4) obj).M1();
                return;
            case 14:
                ((ye4) obj).U();
                return;
            case 15:
                ((ye4) obj).m2();
                return;
            case 16:
                ((ye4) obj).f();
                return;
            case 17:
                q23 q23Var = (q23) ((eo2) obj);
                synchronized (q23Var) {
                    z63 z63Var = q23Var.g;
                    if (z63Var.d()) {
                        z63Var.c();
                        return;
                    }
                    wo2 wo2Var = z63Var.j;
                    go2 go2Var = z63Var.h;
                    synchronized (wo2Var) {
                        i2 = wo2Var.g;
                    }
                    go2Var.V1(i2);
                    return;
                }
            case 18:
                ((ro2) obj).a();
                return;
            case 19:
                ((to2) obj).p();
                return;
            case 20:
                ((cp2) obj).a();
                return;
            case zy1.zzm /* 21 */:
                ((lp2) obj).b();
                return;
            case 22:
                ((op2) obj).e();
                return;
            case 23:
                ((qp2) obj).y();
                return;
            case 24:
                ((tp2) obj).j();
                return;
            case 25:
                ((xp2) obj).s0();
                return;
            case 26:
                ((l42) obj).r();
                return;
            case 27:
                py2 py2VarR = ((gu2) obj).a.r();
                wy2 wy2VarP = null;
                if (py2VarR != null) {
                    try {
                        wy2VarP = py2VarR.p();
                    } catch (RemoteException unused) {
                    }
                }
                if (wy2VarP == null) {
                    return;
                }
                try {
                    wy2VarP.f();
                    return;
                } catch (RemoteException unused2) {
                    gi2.q0(5);
                    return;
                }
            case 28:
                ((gu2) obj).getClass();
                return;
            default:
                py2 py2VarR2 = ((gu2) obj).a.r();
                wy2 wy2VarP2 = null;
                if (py2VarR2 != null) {
                    try {
                        wy2VarP2 = py2VarR2.p();
                    } catch (RemoteException unused3) {
                    }
                }
                if (wy2VarP2 == null) {
                    return;
                }
                try {
                    wy2VarP2.e();
                    return;
                } catch (RemoteException unused4) {
                    gi2.q0(5);
                    return;
                }
        }
    }

    @Override // defpackage.iq3
    public /* synthetic */ void p(Object obj) {
        ((el2) obj).n();
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
    }
}
