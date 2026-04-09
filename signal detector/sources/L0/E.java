package L0;

import com.google.android.gms.internal.ads.AbstractC0582Jp;
import com.google.android.gms.internal.ads.C1154fO;
import com.google.android.gms.internal.ads.C1184g;
import com.google.android.gms.internal.ads.C1879sw;
import com.google.android.gms.internal.ads.C2070wO;
import com.google.android.gms.internal.ads.Es;
import com.google.android.gms.internal.ads.InterfaceC1020d;
import com.google.android.gms.internal.ads.MQ;
import com.google.android.gms.internal.ads.PP;
import com.google.android.gms.internal.ads.Q;
import com.google.android.gms.internal.ads.TP;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public int f2412a;

    /* renamed from: b, reason: collision with root package name */
    public int f2413b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2414c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2415d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2416e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2417f;

    public static boolean l(PP pp) {
        return pp.f10409h != 0;
    }

    public static final void n(PP pp) {
        int i = pp.f10409h;
        if (i == 2) {
            AbstractC0582Jp.h0(i == 2);
            pp.f10409h = 1;
            pp.f();
        }
    }

    public boolean A(C1154fO c1154fO) {
        return h(c1154fO, (PP) this.f2416e) && h(c1154fO, (PP) this.f2417f);
    }

    public void B(long j6, long j7) {
        PP pp = (PP) this.f2416e;
        if (l(pp)) {
            pp.s(j6, j7);
        }
        PP pp2 = (PP) this.f2417f;
        if (pp2 == null || pp2.f10409h == 0) {
            return;
        }
        pp2.s(j6, j7);
    }

    public boolean C(C1154fO c1154fO) {
        PP ppM = m(c1154fO);
        return ppM == null || ppM.l0() || ppM.t() || ppM.u();
    }

    public void D() {
        int i;
        PP pp = (PP) this.f2416e;
        int i3 = pp.f10409h;
        if (i3 == 1 && this.f2413b != 4) {
            AbstractC0582Jp.h0(i3 == 1);
            pp.f10409h = 2;
            pp.d();
            return;
        }
        PP pp2 = (PP) this.f2417f;
        if (pp2 == null || (i = pp2.f10409h) != 1 || this.f2413b == 3) {
            return;
        }
        AbstractC0582Jp.h0(i == 1);
        pp2.f10409h = 2;
        pp2.d();
    }

    public void a() {
        int i = this.f2413b;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.f2413b = 0;
                return;
            }
            return;
        }
        boolean z6 = i == 4;
        PP pp = (PP) this.f2416e;
        PP pp2 = (PP) this.f2417f;
        if (z6) {
            pp2.getClass();
            pp2.c(17, pp);
        } else {
            pp2.getClass();
            pp.c(17, pp2);
        }
        this.f2413b = this.f2413b != 4 ? 1 : 0;
    }

    public void b() {
        if (!l((PP) this.f2416e)) {
            j(true);
        }
        PP pp = (PP) this.f2417f;
        if (pp == null || pp.f10409h != 0) {
            return;
        }
        j(false);
    }

    public int c(C1154fO c1154fO, C1184g c1184g, Es es) {
        int iK = k((PP) this.f2416e, c1154fO, c1184g, es);
        return iK == 1 ? k((PP) this.f2417f, c1154fO, c1184g, es) : iK;
    }

    public void d() {
        PP pp = (PP) this.f2416e;
        AbstractC0582Jp.h0(pp.f10409h == 0);
        pp.k();
        this.f2414c = false;
        PP pp2 = (PP) this.f2417f;
        if (pp2 != null) {
            AbstractC0582Jp.h0(pp2.f10409h == 0);
            pp2.k();
            this.f2415d = false;
        }
    }

    public void e(Object obj) {
        PP pp = (PP) this.f2416e;
        if (pp.f10398b != 2) {
            return;
        }
        int i = this.f2413b;
        if (i != 4 && i != 1) {
            pp.c(1, obj);
            return;
        }
        PP pp2 = (PP) this.f2417f;
        pp2.getClass();
        pp2.c(1, obj);
    }

    public void f(Q q3) {
        PP pp = (PP) this.f2416e;
        if (pp.f10398b == 2) {
            pp.c(7, q3);
            PP pp2 = (PP) this.f2417f;
            if (pp2 != null) {
                pp2.c(7, q3);
            }
        }
    }

    public boolean g() {
        int i = this.f2413b;
        if (i == 0 || i == 2 || i == 4) {
            return l((PP) this.f2416e);
        }
        PP pp = (PP) this.f2417f;
        pp.getClass();
        return pp.f10409h != 0;
    }

    public boolean h(C1154fO c1154fO, PP pp) {
        if (pp == null) {
            return true;
        }
        MQ[] mqArr = c1154fO.f14067c;
        int i = this.f2412a;
        MQ mq = mqArr[i];
        MQ mq2 = pp.i;
        if (mq2 == null) {
            return true;
        }
        if (mq2 == mq && (mq == null || pp.l0())) {
            return true;
        }
        C1154fO c1154fO2 = c1154fO.f14076m;
        return c1154fO2 != null && c1154fO2.f14067c[i] == pp.i;
    }

    public void i(PP pp, Es es) {
        AbstractC0582Jp.h0(((PP) this.f2416e) == pp || ((PP) this.f2417f) == pp);
        if (l(pp)) {
            if (pp == ((PP) es.f8019e)) {
                es.f8020f = null;
                es.f8019e = null;
                es.f8015a = true;
            }
            n(pp);
            AbstractC0582Jp.h0(pp.f10409h == 1);
            C1879sw c1879sw = pp.f10399c;
            c1879sw.f16823b = null;
            c1879sw.f16824c = null;
            pp.f10409h = 0;
            pp.i = null;
            pp.f10412j = null;
            pp.f10420n = false;
            pp.i();
            pp.f10365E = null;
        }
    }

    public void j(boolean z6) {
        if (z6) {
            if (this.f2414c) {
                PP pp = (PP) this.f2416e;
                AbstractC0582Jp.h0(pp.f10409h == 0);
                C1879sw c1879sw = pp.f10399c;
                c1879sw.f16823b = null;
                c1879sw.f16824c = null;
                pp.j();
                this.f2414c = false;
                return;
            }
            return;
        }
        if (this.f2415d) {
            PP pp2 = (PP) this.f2417f;
            pp2.getClass();
            AbstractC0582Jp.h0(pp2.f10409h == 0);
            C1879sw c1879sw2 = pp2.f10399c;
            c1879sw2.f16823b = null;
            c1879sw2.f16824c = null;
            pp2.j();
            this.f2415d = false;
        }
    }

    public int k(PP pp, C1154fO c1154fO, C1184g c1184g, Es es) {
        int i;
        if (pp != null && pp.f10409h != 0) {
            PP pp2 = (PP) this.f2416e;
            boolean z6 = pp != pp2;
            if (pp == pp2 && ((i = this.f2413b) == 2 || i == 4)) {
                return 1;
            }
            if (pp == ((PP) this.f2417f) && this.f2413b == 3) {
                return 1;
            }
            MQ mq = pp.i;
            MQ[] mqArr = c1154fO.f14067c;
            int i3 = this.f2412a;
            MQ mq2 = mqArr[i3];
            boolean zC = c1184g.c(i3);
            if (!zC || mq != mq2) {
                if (!pp.f10420n) {
                    InterfaceC1020d interfaceC1020d = ((InterfaceC1020d[]) c1184g.f14181c)[i3];
                    int iB = interfaceC1020d != null ? interfaceC1020d.b() : 0;
                    TP[] tpArr = new TP[iB];
                    for (int i6 = 0; i6 < iB; i6++) {
                        interfaceC1020d.getClass();
                        tpArr[i6] = interfaceC1020d.h(i6);
                    }
                    MQ mq3 = mqArr[i3];
                    mq3.getClass();
                    pp.k0(tpArr, mq3, c1154fO.a(), c1154fO.f14079p, c1154fO.f14071g.f14261a);
                    return 3;
                }
                if (!pp.u()) {
                    return 0;
                }
                i(pp, es);
                if (!zC || q()) {
                    j(!z6);
                    return 1;
                }
            }
        }
        return 1;
    }

    public PP m(C1154fO c1154fO) {
        if (c1154fO != null) {
            MQ mq = c1154fO.f14067c[this.f2412a];
            if (mq != null) {
                PP pp = (PP) this.f2416e;
                if (pp.i == mq) {
                    return pp;
                }
                PP pp2 = (PP) this.f2417f;
                if (pp2 != null && pp2.i == mq) {
                    return pp2;
                }
            }
        }
        return null;
    }

    public boolean o() {
        return ((PP) this.f2417f) != null;
    }

    public void p() {
        int i;
        AbstractC0582Jp.h0(!q());
        if (l((PP) this.f2416e)) {
            i = 3;
        } else {
            PP pp = (PP) this.f2417f;
            i = (pp == null || pp.f10409h == 0) ? 2 : 4;
        }
        this.f2413b = i;
    }

    public boolean q() {
        int i = this.f2413b;
        return i == 2 || i == 4 || i == 3;
    }

    public int r() {
        PP pp = (PP) this.f2417f;
        boolean zL = l((PP) this.f2416e);
        int i = 0;
        if (pp != null && pp.f10409h != 0) {
            i = 1;
        }
        return (zL ? 1 : 0) + i;
    }

    public void s() {
        int i = ((PP) this.f2416e).f10398b;
    }

    public boolean t(C1154fO c1154fO) {
        PP ppM = m(c1154fO);
        ppM.getClass();
        return ppM.l0();
    }

    public void u(C1154fO c1154fO) {
        PP ppM = m(c1154fO);
        ppM.getClass();
        ppM.f10420n = true;
    }

    public void v(C1184g c1184g, C1184g c1184g2) {
        int i;
        PP pp = (PP) this.f2416e;
        int i3 = this.f2412a;
        boolean zC = c1184g.c(i3);
        boolean zC2 = c1184g2.c(i3);
        PP pp2 = (PP) this.f2417f;
        if (pp2 == null || (i = this.f2413b) == 3 || (i == 0 && l(pp))) {
            pp2 = pp;
        }
        if (!zC || pp2.f10420n) {
            return;
        }
        int i6 = pp.f10398b;
        C2070wO c2070wO = ((C2070wO[]) c1184g.f14180b)[i3];
        C2070wO c2070wO2 = ((C2070wO[]) c1184g2.f14180b)[i3];
        if (zC2 && Objects.equals(c2070wO2, c2070wO) && !q()) {
            return;
        }
        pp2.f10420n = true;
    }

    public void w() {
        int i;
        PP pp = (PP) this.f2416e;
        if (l(pp) && (i = this.f2413b) != 4 && i != 2) {
            pp.f10420n = true;
        }
        PP pp2 = (PP) this.f2417f;
        if (pp2 == null || pp2.f10409h == 0 || this.f2413b == 3) {
            return;
        }
        pp2.f10420n = true;
    }

    public void x() {
        PP pp = (PP) this.f2416e;
        if (l(pp)) {
            pp.r();
            return;
        }
        PP pp2 = (PP) this.f2417f;
        if (pp2 == null || pp2.f10409h == 0) {
            return;
        }
        pp2.r();
    }

    public boolean y() {
        PP pp = (PP) this.f2416e;
        boolean zU = l(pp) ? pp.u() : true;
        PP pp2 = (PP) this.f2417f;
        return (pp2 == null || pp2.f10409h == 0) ? zU : zU & pp2.u();
    }

    public boolean z(C1154fO c1154fO) {
        int i = this.f2413b;
        return ((i == 2 || i == 4) && m(c1154fO) == ((PP) this.f2416e)) || (this.f2413b == 3 && m(c1154fO) == ((PP) this.f2417f));
    }
}
