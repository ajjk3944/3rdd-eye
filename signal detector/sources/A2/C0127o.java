package A2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.AbstractC0640Nf;
import com.google.android.gms.internal.ads.C0489Eh;
import com.google.android.gms.internal.ads.C0540Hh;
import com.google.android.gms.internal.ads.C0623Mf;
import com.google.android.gms.internal.ads.C0642Nh;
import com.google.android.gms.internal.ads.C0702Qq;
import com.google.android.gms.internal.ads.C0710Rh;
import com.google.android.gms.internal.ads.C0733Sn;
import com.google.android.gms.internal.ads.C0745Ti;
import com.google.android.gms.internal.ads.C0750Tn;
import com.google.android.gms.internal.ads.C0753Tq;
import com.google.android.gms.internal.ads.C0831Yj;
import com.google.android.gms.internal.ads.C0852Zn;
import com.google.android.gms.internal.ads.C1060dl;
import com.google.android.gms.internal.ads.C1068du;
import com.google.android.gms.internal.ads.C1113ek;
import com.google.android.gms.internal.ads.C1228gq;
import com.google.android.gms.internal.ads.C1446ku;
import com.google.android.gms.internal.ads.C1490lk;
import com.google.android.gms.internal.ads.C1799rN;
import com.google.android.gms.internal.ads.C1907tN;
import com.google.android.gms.internal.ads.C2148xv;
import com.google.android.gms.internal.ads.C2202yv;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.E9;
import com.google.android.gms.internal.ads.H6;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.InterfaceC1853sN;
import com.google.android.gms.internal.ads.InterfaceC1920tj;
import com.google.android.gms.internal.ads.InterfaceC2069wN;
import com.google.android.gms.internal.ads.Mu;
import com.google.android.gms.internal.ads.T9;
import com.google.android.gms.internal.ads.Xu;
import java.util.concurrent.ScheduledExecutorService;
import q2.C2841s;
import u2.C2951a;

/* renamed from: A2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127o implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2069wN f302b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2069wN f303c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f304d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2069wN f305e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2069wN f306f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2069wN f307g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC2069wN f308h;
    public final InterfaceC2069wN i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2069wN f309j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC2069wN f310k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1853sN f311l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC2069wN f312m;

    public C0127o(C1907tN c1907tN, C0540Hh c0540Hh, C1799rN c1799rN, C1799rN c1799rN2, C1799rN c1799rN3, C1799rN c1799rN4, C1799rN c1799rN5, C0642Nh c0642Nh, T9 t9, C1799rN c1799rN6, C1799rN c1799rN7, C1799rN c1799rN8) {
        this.f309j = c1907tN;
        this.f310k = c0540Hh;
        this.f302b = c1799rN;
        this.f303c = c1799rN2;
        this.f304d = c1799rN3;
        this.f305e = c1799rN4;
        this.f306f = c1799rN5;
        this.f311l = c0642Nh;
        this.f312m = t9;
        this.f307g = c1799rN6;
        this.f308h = c1799rN7;
        this.i = c1799rN8;
    }

    public C0831Yj a() {
        Mu mu = (Mu) this.f302b.c();
        C2951a c2951aA = ((C0642Nh) this.f303c).a();
        ApplicationInfo applicationInfo = (ApplicationInfo) this.f304d.c();
        String packageName = ((C0540Hh) ((C0733Sn) this.f309j).f11246b).a().getPackageName();
        Cr.v(packageName);
        E9 e9 = H9.f8707a;
        return new C0831Yj(mu, c2951aA, applicationInfo, packageName, C2841s.f23267e.f23268a.C(), (PackageInfo) this.f305e.c(), C1799rN.b(this.f306f), ((C0489Eh) this.f307g).c(), (String) this.f308h.c(), ((C0745Ti) this.f310k).b(), ((C1113ek) this.f311l).a(), (C1060dl) this.i.c(), ((Integer) this.f312m.c()).intValue());
    }

    public C0753Tq b() {
        Context contextA = ((C0540Hh) this.f302b).a();
        Mu mu = (Mu) this.f303c.c();
        C0702Qq c0702Qq = (C0702Qq) this.f304d.c();
        C1490lk c1490lk = (C1490lk) this.f305e.c();
        C2148xv c2148xv = (C2148xv) this.f306f.c();
        C2202yv c2202yv = (C2202yv) this.f307g.c();
        InterfaceC1920tj interfaceC1920tj = (InterfaceC1920tj) this.f308h.c();
        C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
        Cr.v(c0623Mf);
        return new C0753Tq(contextA, mu, c0702Qq, c1490lk, c2148xv, c2202yv, interfaceC1920tj, c0623Mf, (ScheduledExecutorService) this.i.c(), (C1228gq) this.f309j.c(), (Xu) this.f310k.c(), ((T9) this.f311l).a(), (C0750Tn) this.f312m.c());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    public final Object c() {
        switch (this.f301a) {
            case 0:
                C0710Rh c0710Rh = (C0710Rh) ((C1907tN) this.f309j).f16902a;
                Context contextA = ((C0540Hh) this.f310k).a();
                H6 h6 = (H6) this.f302b.c();
                C1446ku c1446ku = (C1446ku) this.f303c.c();
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                Cr.v(c0623Mf);
                return new BinderC0126n(c0710Rh, contextA, h6, c1446ku, c0623Mf, (ScheduledExecutorService) this.f304d.c(), (C0852Zn) this.f305e.c(), (C2202yv) this.f306f.c(), ((C0642Nh) this.f311l).a(), ((T9) this.f312m).b(), (C1068du) this.f307g.c(), (L) this.f308h.c(), (G) this.i.c());
            case 1:
                return a();
            default:
                return b();
        }
    }

    public C0127o(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, C0733Sn c0733Sn, InterfaceC2069wN interfaceC2069wN4, InterfaceC2069wN interfaceC2069wN5, InterfaceC2069wN interfaceC2069wN6, InterfaceC2069wN interfaceC2069wN7, C0745Ti c0745Ti, C1113ek c1113ek, InterfaceC2069wN interfaceC2069wN8, InterfaceC2069wN interfaceC2069wN9) {
        this.f302b = interfaceC2069wN;
        this.f303c = interfaceC2069wN2;
        this.f304d = interfaceC2069wN3;
        this.f309j = c0733Sn;
        this.f305e = interfaceC2069wN4;
        this.f306f = interfaceC2069wN5;
        this.f307g = interfaceC2069wN6;
        this.f308h = interfaceC2069wN7;
        this.f310k = c0745Ti;
        this.f311l = c1113ek;
        this.i = interfaceC2069wN8;
        this.f312m = interfaceC2069wN9;
    }

    public C0127o(InterfaceC2069wN interfaceC2069wN, InterfaceC2069wN interfaceC2069wN2, InterfaceC2069wN interfaceC2069wN3, InterfaceC2069wN interfaceC2069wN4, InterfaceC2069wN interfaceC2069wN5, InterfaceC2069wN interfaceC2069wN6, InterfaceC2069wN interfaceC2069wN7, InterfaceC2069wN interfaceC2069wN8, InterfaceC2069wN interfaceC2069wN9, InterfaceC2069wN interfaceC2069wN10, T9 t9, InterfaceC2069wN interfaceC2069wN11) {
        this.f302b = interfaceC2069wN;
        this.f303c = interfaceC2069wN2;
        this.f304d = interfaceC2069wN3;
        this.f305e = interfaceC2069wN4;
        this.f306f = interfaceC2069wN5;
        this.f307g = interfaceC2069wN6;
        this.f308h = interfaceC2069wN7;
        this.i = interfaceC2069wN8;
        this.f309j = interfaceC2069wN9;
        this.f310k = interfaceC2069wN10;
        this.f311l = t9;
        this.f312m = interfaceC2069wN11;
    }
}
