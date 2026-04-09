package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.os.RemoteException;
import android.os.StrictMode;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sd2 implements rd2, of1, dp2, iq3 {
    public final /* synthetic */ int f;
    public static final /* synthetic */ sd2 g = new sd2(2);
    public static final /* synthetic */ sd2 h = new sd2(5);
    public static final /* synthetic */ sd2 i = new sd2(6);
    public static final /* synthetic */ sd2 j = new sd2(7);
    public static final /* synthetic */ sd2 k = new sd2(8);
    public static final /* synthetic */ sd2 l = new sd2(9);
    public static final /* synthetic */ sd2 m = new sd2(10);
    public static final /* synthetic */ sd2 n = new sd2(11);
    public static final /* synthetic */ sd2 o = new sd2(12);
    public static final /* synthetic */ sd2 p = new sd2(13);
    public static final /* synthetic */ sd2 q = new sd2(14);
    public static final /* synthetic */ sd2 r = new sd2(15);
    public static final /* synthetic */ sd2 s = new sd2(16);
    public static final /* synthetic */ sd2 t = new sd2(17);
    public static final /* synthetic */ sd2 u = new sd2(18);
    public static final /* synthetic */ sd2 v = new sd2(19);
    public static final /* synthetic */ sd2 w = new sd2(21);
    public static final /* synthetic */ sd2 x = new sd2(22);
    public static final /* synthetic */ sd2 y = new sd2(23);
    public static final /* synthetic */ sd2 z = new sd2(24);
    public static final /* synthetic */ sd2 A = new sd2(25);
    public static final /* synthetic */ sd2 B = new sd2(26);
    public static final /* synthetic */ sd2 C = new sd2(27);
    public static final /* synthetic */ sd2 D = new sd2(28);

    public /* synthetic */ sd2(int i2) {
        this.f = i2;
    }

    public static final ag2 b(final Context context, final zq zqVar, final String str, final boolean z2, final boolean z3, final vs1 vs1Var, final f02 f02Var, final e51 e51Var, final kf3 kf3Var, final l92 l92Var, final cx1 cx1Var, final a83 a83Var, final c83 c83Var, final pz2 pz2Var, final m83 m83Var, final mv2 mv2Var) throws hg2 {
        mz1.a(context);
        try {
            ll3 ll3Var = new ll3() { // from class: gg2
                @Override // defpackage.ll3
                public final Object a() {
                    zq zqVar2 = zqVar;
                    String str2 = str;
                    boolean z4 = z2;
                    boolean z5 = z3;
                    pz2 pz2Var2 = pz2Var;
                    mv2 mv2Var2 = mv2Var;
                    gd4 gd4Var = kf3Var;
                    l92 l92Var2 = l92Var;
                    cx1 cx1Var2 = cx1Var;
                    a83 a83Var2 = a83Var;
                    c83 c83Var2 = c83Var;
                    m83 m83Var2 = m83Var;
                    vs1 vs1Var2 = vs1Var;
                    f02 f02Var2 = f02Var;
                    e51 e51Var2 = e51Var;
                    Context context2 = context;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i2 = og2.h0;
                        yg2 yg2Var = new yg2(context2);
                        yg2Var.setBaseContext(context2);
                        jg2 jg2Var = new jg2(new og2(yg2Var, zqVar2, str2, z4, vs1Var2, f02Var2, e51Var2, gd4Var, l92Var2, cx1Var2, a83Var2, c83Var2, m83Var2), mv2Var2);
                        hg4.C.f.getClass();
                        jg2Var.setWebViewClient(new sg2(jg2Var, cx1Var2, z5, pz2Var2));
                        jg2Var.setWebChromeClient(new zf2(jg2Var));
                        return jg2Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                Object objA = ll3Var.a();
                StrictMode.setThreadPolicy(threadPolicy);
                return (ag2) objA;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        } catch (Throwable th2) {
            throw new hg2("Webview initialization failed.", th2);
        }
    }

    @Override // defpackage.rd2, defpackage.y23
    /* renamed from: a */
    public void mo8a() {
    }

    @Override // defpackage.dp2
    /* renamed from: c */
    public void mo14c(Object obj) {
        int i2;
        switch (this.f) {
            case 5:
                ((fd1) obj).C();
                return;
            case 6:
                ((bn2) obj).s(zt0.Q(11, null, null));
                return;
            case 7:
                ((um2) obj).a();
                return;
            case 8:
                ((um2) obj).b();
                return;
            case 9:
                ((um2) obj).T();
                return;
            case 10:
                ((si0) obj).l();
                return;
            case 11:
                ((ye4) obj).f3();
                return;
            case 12:
                ((ye4) obj).E1();
                return;
            case 13:
                ((ye4) obj).R2();
                return;
            case 14:
                ((ye4) obj).B1();
                return;
            case 15:
                ((ye4) obj).h3();
                return;
            case 16:
                ((do2) obj).k();
                return;
            case 17:
                q23 q23Var = (q23) ((eo2) obj);
                synchronized (q23Var) {
                    try {
                        if (!q23Var.g.d()) {
                            z63 z63Var = q23Var.g;
                            wo2 wo2Var = z63Var.j;
                            go2 go2Var = z63Var.h;
                            synchronized (wo2Var) {
                                i2 = wo2Var.f;
                            }
                            go2Var.U1(i2);
                            return;
                        }
                        k83 k83Var = q23Var.k;
                        xe4 xe4VarN = k83Var.b;
                        ik2 ik2Var = q23Var.n;
                        if (ik2Var != null && k83Var.q) {
                            xe4VarN = a30.n(q23Var.f, Collections.singletonList(ik2Var.o));
                        }
                        synchronized (q23Var) {
                            k83 k83Var2 = q23Var.k;
                            k83Var2.b = xe4VarN;
                            k83Var2.q = q23Var.j.s;
                            k83Var.p = true;
                            try {
                                q23Var.B3(k83Var.a);
                            } catch (RemoteException unused) {
                                gi2.i0("Failed to refresh the banner ad.");
                            }
                            q23Var.k.p = false;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                    throw th;
                }
            case 18:
                ((to2) obj).w();
                return;
            case 19:
                ((ap2) obj).p();
                return;
            case 20:
                ((lp2) obj).J("MalformedJson");
                return;
            case zy1.zzm /* 21 */:
                ((lp2) obj).c();
                return;
            case 22:
                ((op2) obj).f();
                return;
            case 23:
                ((qp2) obj).a();
                return;
            case 24:
                ((xp2) obj).U0();
                return;
            case 25:
                zp2 zp2Var = (zp2) obj;
                if (zp2Var.d) {
                    return;
                }
                zp2Var.b.a(zp2Var.a, zp2Var.c);
                zp2Var.d = true;
                return;
            case 26:
                ((l42) obj).a();
                return;
            case 27:
                py2 py2VarR = ((gu2) obj).a.r();
                wy2 wy2VarP = null;
                if (py2VarR != null) {
                    try {
                        wy2VarP = py2VarR.p();
                    } catch (RemoteException unused2) {
                    }
                }
                if (wy2VarP == null) {
                    return;
                }
                try {
                    wy2VarP.b();
                    return;
                } catch (RemoteException unused3) {
                    gi2.q0(5);
                    return;
                }
            default:
                py2 py2VarR2 = ((gu2) obj).a.r();
                wy2 wy2VarP2 = null;
                if (py2VarR2 != null) {
                    try {
                        wy2VarP2 = py2VarR2.p();
                    } catch (RemoteException unused4) {
                    }
                }
                if (wy2VarP2 == null) {
                    return;
                }
                try {
                    wy2VarP2.b();
                    return;
                } catch (RemoteException unused5) {
                    gi2.q0(5);
                    return;
                }
        }
    }

    @Override // defpackage.iq3
    public /* synthetic */ void p(Object obj) {
        ((ag2) obj).destroy();
    }

    @Override // defpackage.of1
    public /* synthetic */ lf1[] a() {
        AtomicInteger atomicInteger = sf2.z;
        return new lf1[]{new nj1(), new oi1()};
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
    }
}
