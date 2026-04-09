package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gv2 implements to2, fd1, dn2, xm2, do2 {
    public final Context f;
    public final s83 g;
    public final mv2 h;
    public final h83 i;
    public final a83 j;
    public final jz2 k;
    public final String l;
    public Boolean n;
    public long m = -1;
    public final AtomicBoolean p = new AtomicBoolean(false);
    public final AtomicBoolean q = new AtomicBoolean(false);
    public final boolean o = ((Boolean) tw1.e.c.a(mz1.g7)).booleanValue();

    public gv2(Context context, s83 s83Var, mv2 mv2Var, h83 h83Var, a83 a83Var, jz2 jz2Var, String str) {
        this.f = context;
        this.g = s83Var;
        this.h = mv2Var;
        this.i = h83Var;
        this.j = a83Var;
        this.k = jz2Var;
        this.l = str;
    }

    @Override // defpackage.fd1
    public final void C() {
        if (this.j.b()) {
            e(c("click"));
        }
    }

    @Override // defpackage.dn2
    public final void D0() {
        boolean zA = a();
        a83 a83Var = this.j;
        if (zA || a83Var.b()) {
            lv2 lv2VarC = c("impression");
            lv2VarC.k("imp_type", String.valueOf(a83Var.e));
            if (this.m > 0) {
                hg4.C.k.getClass();
                lv2VarC.k("p_imp_l", String.valueOf(System.currentTimeMillis() - this.m));
            }
            if (((Boolean) tw1.e.c.a(mz1.je)).booleanValue() && h()) {
                lf4 lf4Var = hg4.C.c;
                lv2VarC.k("foreground", true != lf4.g(this.f) ? "1" : "0");
                lv2VarC.k("fg_show", true == this.p.get() ? "1" : "0");
            }
            e(lv2VarC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    @Override // defpackage.xm2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(defpackage.nx2 r6) {
        /*
            r5 = this;
            boolean r0 = r5.o
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r0 = "ifts"
            lv2 r0 = r5.c(r0)
            java.lang.String r1 = "reason"
            java.lang.String r2 = "adapter"
            r0.k(r1, r2)
            int r1 = r6.f
            java.lang.String r2 = r6.g
            java.lang.String r3 = r6.h
            java.lang.String r4 = "com.google.android.gms.ads"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L32
            nx2 r3 = r6.i
            if (r3 == 0) goto L32
            java.lang.String r3 = r3.h
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L32
            nx2 r6 = r6.i
            int r1 = r6.f
            java.lang.String r2 = r6.g
        L32:
            if (r1 < 0) goto L3d
            java.lang.String r6 = "arec"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.k(r6, r1)
        L3d:
            s83 r6 = r5.g
            java.util.regex.Pattern r6 = r6.a
            if (r6 == 0) goto L55
            if (r2 != 0) goto L46
            goto L55
        L46:
            java.util.regex.Matcher r6 = r6.matcher(r2)
            boolean r1 = r6.find()
            if (r1 == 0) goto L55
            java.lang.String r6 = r6.group()
            goto L56
        L55:
            r6 = 0
        L56:
            if (r6 == 0) goto L5d
            java.lang.String r1 = "areec"
            r0.k(r1, r6)
        L5d:
            r0.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gv2.O(nx2):void");
    }

    @Override // defpackage.xm2
    public final void R(pq2 pq2Var) {
        if (this.o) {
            lv2 lv2VarC = c("ifts");
            lv2VarC.k("reason", "exception");
            if (!TextUtils.isEmpty(pq2Var.getMessage())) {
                lv2VarC.k("msg", pq2Var.getMessage());
            }
            lv2VarC.m();
        }
    }

    public final boolean a() {
        String strM;
        if (this.n == null) {
            synchronized (this) {
                if (this.n == null) {
                    String str = (String) tw1.e.c.a(mz1.B1);
                    lf4 lf4Var = hg4.C.c;
                    try {
                        strM = lf4.M(this.f);
                    } catch (RemoteException unused) {
                        strM = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strM != null) {
                        try {
                            zMatches = Pattern.matches(str, strM);
                        } catch (RuntimeException e) {
                            hg4.C.h.d("CsiActionsListener.isPatternMatched", e);
                        }
                    }
                    this.n = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.n.booleanValue();
    }

    @Override // defpackage.xm2
    public final void b() {
        if (this.o) {
            lv2 lv2VarC = c("ifts");
            lv2VarC.k("reason", "blocked");
            lv2VarC.m();
        }
    }

    public final lv2 c(String str) {
        h83 h83Var = this.i;
        p21 p21Var = h83Var.b;
        f20 f20Var = h83Var.a;
        lv2 lv2VarA = this.h.a();
        lv2VarA.k("gqi", ((c83) p21Var.g).b);
        a83 a83Var = this.j;
        lv2VarA.i(a83Var);
        lv2VarA.k("action", str);
        lv2VarA.k("ad_format", this.l.toUpperCase(Locale.ROOT));
        List list = a83Var.t;
        if (!list.isEmpty()) {
            lv2VarA.k("ancn", (String) list.get(0));
        }
        if (a83Var.b()) {
            hg4 hg4Var = hg4.C;
            lv2VarA.k("device_connectivity", true != hg4Var.h.i(this.f) ? "offline" : "online");
            hg4Var.k.getClass();
            lv2VarA.k("event_timestamp", String.valueOf(System.currentTimeMillis()));
            lv2VarA.k("offline_ad", "1");
        }
        if (((Boolean) tw1.e.c.a(mz1.n7)).booleanValue()) {
            boolean z = a30.D((l83) f20Var.g) != 1;
            lv2VarA.k("scar", String.valueOf(z));
            if (z) {
                pc4 pc4Var = ((l83) f20Var.g).d;
                lv2VarA.k("ragent", pc4Var.u);
                lv2VarA.k("rtype", a30.s(a30.w(pc4Var)));
            }
        }
        return lv2VarA;
    }

    public final void e(lv2 lv2Var) {
        if (!this.j.b()) {
            lv2Var.m();
            return;
        }
        pv2 pv2Var = ((mv2) lv2Var.h).a;
        String strA = pv2Var.f.a((ConcurrentHashMap) lv2Var.g);
        hg4.C.k.getClass();
        wo1 wo1Var = new wo1(System.currentTimeMillis(), ((c83) this.i.b.g).b, strA, 2);
        jz2 jz2Var = this.k;
        jz2Var.getClass();
        jz2Var.a(new mr2(jz2Var, wo1Var, 4, false));
    }

    public final boolean h() {
        int i = this.j.b;
        return i == 2 || i == 5 || i == 6 || i == 7;
    }

    @Override // defpackage.do2
    public final void k() {
        if (a()) {
            this.q.set(true);
            hg4 hg4Var = hg4.C;
            hg4Var.k.getClass();
            this.m = System.currentTimeMillis();
            lv2 lv2VarC = c("presentation");
            iz1 iz1Var = mz1.je;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && h()) {
                boolean z = !lf4.g(this.f);
                AtomicBoolean atomicBoolean = this.p;
                atomicBoolean.set(z);
                lv2VarC.k("foreground", true != atomicBoolean.get() ? "0" : "1");
            }
            if (((Boolean) tw1Var.c.a(mz1.ke)).booleanValue() && h()) {
                lv2VarC.k("fg_al", true != hg4Var.g.k() ? "0" : "1");
            }
            lv2VarC.m();
        }
    }

    @Override // defpackage.to2
    public final void p() {
        if (a()) {
            lv2 lv2VarC = c("adapter_impression");
            lv2VarC.k("imp_type", String.valueOf(this.j.e));
            if (this.q.get()) {
                lv2VarC.k("po", "1");
                hg4.C.k.getClass();
                lv2VarC.k("pil", String.valueOf(System.currentTimeMillis() - this.m));
            } else {
                lv2VarC.k("po", "0");
            }
            iz1 iz1Var = mz1.je;
            tw1 tw1Var = tw1.e;
            if (((Boolean) tw1Var.c.a(iz1Var)).booleanValue() && h()) {
                lf4 lf4Var = hg4.C.c;
                lv2VarC.k("foreground", true != lf4.g(this.f) ? "1" : "0");
                lv2VarC.k("fg_show", true != this.p.get() ? "0" : "1");
            }
            if (((Boolean) tw1Var.c.a(mz1.ke)).booleanValue() && h()) {
                lv2VarC.k("fg_al", true == hg4.C.g.k() ? "1" : "0");
            }
            lv2VarC.m();
        }
    }

    @Override // defpackage.to2
    public final void w() {
        if (a()) {
            c("adapter_shown").m();
        }
    }
}
