package com.google.android.gms.internal.ads;

import M2.InterfaceC0163c;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;
import android.os.SystemClock;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import j$.util.Optional;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2911G;

/* loaded from: classes.dex */
public final class Nx implements InterfaceC0163c, InterfaceC1918th, InterfaceC0674Pf, InterfaceC0691Qf, KD, BD, InterfaceC1223gl, p2.g, InterfaceC1872sp, InterfaceC0595Kl, Dr, At {

    /* renamed from: c, reason: collision with root package name */
    public static Nx f10107c;

    /* renamed from: d, reason: collision with root package name */
    public static final ZJ f10108d = new ZJ(8, (byte) 0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10109a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10110b;

    public /* synthetic */ Nx(int i, Object obj) {
        this.f10109a = i;
        this.f10110b = obj;
    }

    private final void E(Object obj) {
        Xt xt = (Xt) obj;
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.W6)).booleanValue()) {
            C1118ep c1118ep = (C1118ep) this.f10110b;
            St st = (St) xt.f12510b.f15174c;
            c1118ep.f13983e.c(st.f11273f);
            C0514Fp c0514Fp = c1118ep.f13983e;
            long j6 = st.f11274g;
            synchronized (c0514Fp.f8197h) {
                c0514Fp.f8192c = j6;
            }
        }
    }

    private final /* synthetic */ void F(AbstractC1812rj abstractC1812rj) {
        BinderC2252zr binderC2252zr = (BinderC2252zr) this.f10110b;
        C0493El c0493El = (C0493El) abstractC1812rj;
        synchronized (binderC2252zr) {
            binderC2252zr.f17985j = c0493El;
            c0493El.a();
        }
    }

    public static final Nx f(Context context) {
        Nx nx;
        synchronized (Nx.class) {
            try {
                if (f10107c == null) {
                    f10107c = new Nx(context);
                }
                nx = f10107c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nx;
    }

    private final void z() {
        BinderC2252zr binderC2252zr = (BinderC2252zr) this.f10110b;
        synchronized (binderC2252zr) {
            binderC2252zr.f17985j = null;
        }
    }

    public C1835s5 A() {
        return (C1835s5) Optional.ofNullable((C1835s5) ((ArrayDeque) this.f10110b).peek()).orElseThrow(C1781r5.f16463b);
    }

    public void B(RemoteException remoteException) {
        ((C1431kf) this.f10110b).A();
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.rf)).booleanValue()) {
            p2.j.f22785C.f22795h.f("Preconnect Remote", remoteException);
        }
    }

    public void D(boolean z6) {
        synchronized (Nx.class) {
            try {
                Vu vu = (Vu) this.f10110b;
                vu.C(Boolean.valueOf(z6), "paidv2_publisher_option");
                if (!z6) {
                    vu.I("paidv2_creation_time");
                    vu.I("paidv2_id");
                    vu.I("vendor_scoped_gpid_v2_id");
                    vu.I("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean H() {
        boolean z6;
        synchronized (Nx.class) {
            z6 = ((SharedPreferences) ((Vu) this.f10110b).f12106b).getBoolean("paidv2_publisher_option", true);
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.KD
    /* renamed from: a */
    public /* synthetic */ XD mo10a() {
        AtomicInteger atomicInteger = C0641Ng.f10012I;
        return new C1142fC((byte[]) this.f10110b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0691Qf, com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public void mo4b(Object obj) {
        switch (this.f10109a) {
            case 9:
                ((C0657Of) this.f10110b).b((InterfaceC2075wc) obj);
                break;
            case 13:
                InterfaceC1813rk interfaceC1813rk = (InterfaceC1813rk) obj;
                String message = ((C0578Jl) this.f10110b).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                interfaceC1813rk.f(AbstractC1984ut.A(12, message, null));
                break;
            case 14:
                ((InterfaceC0577Jk) obj).a((q2.e1) this.f10110b);
                break;
            default:
                Ju ju = (Ju) this.f10110b;
                ((Nu) obj).y((Ku) ju.f9392a, ju.f9393b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    public Qt c() {
        return (Qt) this.f10110b;
    }

    @Override // com.google.android.gms.internal.ads.BD
    /* renamed from: d */
    public void mo11d(Object obj) {
        switch (this.f10109a) {
            case 12:
                ((C0440Bj) this.f10110b).f7399f.A(true);
                return;
            case 16:
                try {
                    InterfaceC0828Yg interfaceC0828Yg = (InterfaceC0828Yg) ((List) obj).get(0);
                    if (interfaceC0828Yg != null) {
                        C0545Hm c0545Hm = (C0545Hm) this.f10110b;
                        c0545Hm.getClass();
                        c0545Hm.f8997c.execute(new RunnableC1219gh(interfaceC0828Yg, 5));
                        return;
                    }
                    return;
                } catch (ClassCastException | IndexOutOfBoundsException e6) {
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.i6)).booleanValue()) {
                        p2.j.f22785C.f22795h.f("omid native display exp", e6);
                        return;
                    }
                    return;
                }
            case 18:
                String str = (String) obj;
                synchronized (this) {
                    C2087wo c2087wo = (C2087wo) this.f10110b;
                    c2087wo.f17475c = true;
                    p2.j.f22785C.f22797k.getClass();
                    c2087wo.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2087wo.f17476d), "", true);
                    c2087wo.i.execute(new CD(this, 26, str));
                }
                return;
            case 19:
                E(obj);
                return;
            default:
                try {
                    ((Eu) this.f10110b).b((SQLiteDatabase) obj);
                    return;
                } catch (Exception e7) {
                    u2.k.e("Error executing function on offline buffered ping database: ".concat(String.valueOf(e7.getMessage())));
                    return;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1872sp
    public InterfaceFutureC2326a e(C1807re c1807re) {
        C1549mp c1549mp = (C1549mp) this.f10110b;
        synchronized (c1549mp.f15280b) {
            try {
                int i = c1549mp.f15673h;
                if (i != 1 && i != 2) {
                    return AbstractC1984ut.w(new C1765qp(2));
                }
                if (c1549mp.f15281c) {
                    return c1549mp.f15279a;
                }
                c1549mp.f15673h = 2;
                c1549mp.f15281c = true;
                c1549mp.f15283e = c1807re;
                c1549mp.f15284f.n();
                C0657Of c0657Of = c1549mp.f15279a;
                c0657Of.f10212a.a(new RunnableC1495lp(c1549mp, 1), AbstractC0640Nf.f10011g);
                return c0657Of;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // M2.InterfaceC0163c
    public void k0(J2.b bVar) {
        C1677p8 c1677p8 = (C1677p8) this.f10110b;
        synchronized (c1677p8.f16139c) {
            try {
                c1677p8.f16142f = null;
                if (((C1838s8) c1677p8.f16140d) != null) {
                    c1677p8.f16140d = null;
                }
                c1677p8.f16139c.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.At
    public /* synthetic */ C0744Th s(InterfaceC2254zt interfaceC2254zt) {
        return ((Lt) this.f10110b).b(interfaceC2254zt);
    }

    @Override // com.google.android.gms.internal.ads.BD
    public void u(Throwable th) throws NumberFormatException {
        switch (this.f10109a) {
            case 12:
                ((C0440Bj) this.f10110b).f7399f.A(false);
                return;
            case 16:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.i6)).booleanValue()) {
                    p2.j.f22785C.f22795h.f("omid native display exp", th);
                    return;
                }
                return;
            case 18:
                synchronized (this) {
                    C2087wo c2087wo = (C2087wo) this.f10110b;
                    c2087wo.f17475c = true;
                    p2.j.f22785C.f22797k.getClass();
                    c2087wo.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - c2087wo.f17476d), "Internal Error.", false);
                    c2087wo.f17477e.c(new Exception());
                }
                return;
            case 19:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.W6)).booleanValue()) {
                    Matcher matcher = C1118ep.f13978h.matcher(th.getMessage());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        C1118ep c1118ep = (C1118ep) this.f10110b;
                        c1118ep.f13983e.c(Integer.parseInt(strGroup));
                        return;
                    }
                    return;
                }
                return;
            default:
                u2.k.e("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.Dr
    public void v(AbstractC1812rj abstractC1812rj) {
        switch (this.f10109a) {
            case 25:
                F(abstractC1812rj);
                return;
            default:
                C0762Ui c0762Ui = (C0762Ui) abstractC1812rj;
                BinderC1607nt binderC1607nt = (BinderC1607nt) this.f10110b;
                synchronized (binderC1607nt) {
                    try {
                        C0762Ui c0762Ui2 = binderC1607nt.f15841k;
                        if (c0762Ui2 != null) {
                            c0762Ui2.d();
                        }
                        binderC1607nt.f15841k = c0762Ui;
                        InterfaceC0828Yg interfaceC0828Yg = c0762Ui.f11758l;
                        if (interfaceC0828Yg != null) {
                            interfaceC0828Yg.S0(binderC1607nt);
                        }
                        binderC1607nt.f15837f.b(new BinderC0779Vi(c0762Ui, binderC1607nt, binderC1607nt.f15837f, binderC1607nt.f15839h));
                        c0762Ui.a();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // p2.g
    public void w() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        C0679Pk c0679Pk = ((C0427An) this.f10110b).f7040g;
        synchronized (c0679Pk) {
            try {
                if (c0679Pk.f10492j) {
                    if (c0679Pk.f10491h > 0 && (scheduledFuture2 = c0679Pk.f10493k) != null && scheduledFuture2.isCancelled()) {
                        c0679Pk.J1(c0679Pk.f10491h);
                    }
                    if (c0679Pk.i > 0 && (scheduledFuture = c0679Pk.f10494l) != null && scheduledFuture.isCancelled()) {
                        c0679Pk.L1(c0679Pk.i);
                    }
                    c0679Pk.f10492j = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p2.g
    public void x() {
        C0679Pk c0679Pk = ((C0427An) this.f10110b).f7040g;
        synchronized (c0679Pk) {
            try {
                if (c0679Pk.f10492j) {
                    return;
                }
                ScheduledFuture scheduledFuture = c0679Pk.f10493k;
                if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                    c0679Pk.f10491h = -1L;
                } else {
                    c0679Pk.f10493k.cancel(false);
                    long j6 = c0679Pk.f10489f;
                    c0679Pk.f10487d.getClass();
                    c0679Pk.f10491h = j6 - SystemClock.elapsedRealtime();
                }
                ScheduledFuture scheduledFuture2 = c0679Pk.f10494l;
                if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                    c0679Pk.i = -1L;
                } else {
                    c0679Pk.f10494l.cancel(false);
                    long j7 = c0679Pk.f10490g;
                    c0679Pk.f10487d.getClass();
                    c0679Pk.i = j7 - SystemClock.elapsedRealtime();
                }
                c0679Pk.f10492j = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y(long j6, long j7, long j8) throws C1889t5 {
        int[] iArr = {1857962504, 67802545, 822753858, 1178641841, 1658857550, -1514359837, 393474692, 1520223205, 452867621};
        int i = iArr[0];
        int i3 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        int i8 = iArr[4];
        int i9 = iArr[5];
        int i10 = iArr[6];
        int i11 = iArr[7];
        C1835s5 c1835s5 = new C1835s5(j6, j7, j8);
        ArrayDeque arrayDeque = (ArrayDeque) this.f10110b;
        if (arrayDeque.size() >= (A.f.d((i3 & (~i)) | i6, (i & i7) | i8, i9, i10) ^ (i11 % 452867621))) {
            throw new C1889t5();
        }
        arrayDeque.push(c1835s5);
    }

    public Nx(C0710Rh c0710Rh) {
        this.f10109a = 11;
        this.f10110b = new C1381jj(c0710Rh.f10995g, c0710Rh.f10977T, new C0733Sn(c0710Rh.f10978U, 25), c0710Rh.f10979V, c0710Rh.f11020t);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1918th, com.google.android.gms.internal.ads.InterfaceC0674Pf, com.google.android.gms.internal.ads.InterfaceC0482Ea, com.google.android.gms.internal.ads.Dr
    /* renamed from: a */
    public void mo6a() {
        switch (this.f10109a) {
            case 7:
                C1913tc c1913tc = (C1913tc) this.f10110b;
                p2.j.f22785C.f22797k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j6 = c1913tc.f16933a;
                ArrayList arrayList = (ArrayList) c1913tc.f16935c;
                arrayList.add(Long.valueOf(jCurrentTimeMillis - j6));
                String strValueOf = String.valueOf(arrayList.get(0));
                StringBuilder sb = new StringBuilder(strValueOf.length() + 52);
                sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                sb.append(strValueOf);
                sb.append(" ms.");
                AbstractC2907C.m(sb.toString());
                C2911G.f23576l.postDelayed(new RunnableC1805rc((C0895ak) c1913tc.f16934b, (C2021vc) c1913tc.f16936d, (C1536mc) c1913tc.f16937e, arrayList, j6, 1), ((Integer) C2841s.f23267e.f23270c.a(H9.f8726d)).intValue());
                return;
            case 8:
                ((C1967uc) this.f10110b).f17128d.E();
                return;
            case 21:
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.qf)).booleanValue()) {
                    C0697Ql c0697QlA = ((C0784Vn) ((C1431kf) this.f10110b).f15176e).a();
                    c0697QlA.r("action", "ptard");
                    c0697QlA.r("ptard", "r");
                    c0697QlA.s();
                    return;
                }
                return;
            case 25:
                z();
                return;
            default:
                BinderC1607nt binderC1607nt = (BinderC1607nt) this.f10110b;
                synchronized (binderC1607nt) {
                    binderC1607nt.f15841k = null;
                }
                return;
        }
    }

    public /* synthetic */ Nx(Object obj, int i, Object obj2) {
        this.f10109a = i;
        this.f10110b = obj2;
    }

    public Nx(int i) {
        this.f10109a = i;
        switch (i) {
            case 4:
                this.f10110b = new ArrayDeque();
                break;
            case 23:
                break;
            default:
                int i3 = JK.f9277a;
                C2255zu c2255zu = new C2255zu(8, new InterfaceC2121xL[]{C1994v2.i, f10108d});
                Charset charset = AbstractC1528mL.f15610a;
                this.f10110b = c2255zu;
                break;
        }
    }

    public Nx(Context context) {
        this.f10109a = 0;
        if (Vu.f12104c == null) {
            Vu.f12104c = new Vu(context, 2);
        }
        this.f10110b = Vu.f12104c;
    }

    public Nx(Context context, Executor executor) {
        this.f10109a = 5;
        this.f10110b = AbstractC1984ut.z(new J6(0, context), executor);
    }

    public Nx(C1967uc c1967uc) {
        this.f10109a = 8;
        Objects.requireNonNull(c1967uc);
        this.f10110b = c1967uc;
    }

    public Nx(C2087wo c2087wo) {
        this.f10109a = 18;
        Objects.requireNonNull(c2087wo);
        this.f10110b = c2087wo;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    public void p(boolean z6, Context context, C1760qk c1760qk) {
    }
}
