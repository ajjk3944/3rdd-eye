package com.google.android.gms.internal.ads;

import M2.InterfaceC0162b;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import f4.InterfaceFutureC2326a;
import j$.util.concurrent.ConcurrentHashMap;
import j2.C2545a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import q2.AbstractBinderC2813d0;
import q2.C2841s;
import q2.InterfaceC2815e0;
import t2.C2911G;
import u2.C2951a;
import w2.InterfaceC2973e;

/* renamed from: com.google.android.gms.internal.ads.iu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1338iu implements P2, InterfaceC0916b4, InterfaceC0162b, w2.l, w2.p, w2.s, InterfaceC2973e, InterfaceC1223gl, Eu, InterfaceC0595Kl, Bt {

    /* renamed from: e, reason: collision with root package name */
    public static C1338iu f14818e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1668p f14819f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1668p f14820g;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14821a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14822b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14823c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14824d;

    static {
        long j6 = -9223372036854775807L;
        f14819f = new C1668p(2, j6);
        f14820g = new C1668p(3, j6);
    }

    public C1338iu(Context context, C2951a c2951a, A8 a8, C0697Ql c0697Ql) {
        this.f14821a = 20;
        this.f14822b = context;
        this.f14824d = c2951a;
        this.f14823c = a8;
    }

    public static String B(Context context) throws IOException {
        File file = new File(context.getPackageResourcePath());
        if (!file.exists() || !file.canRead()) {
            return "";
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[16384];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
                for (int i = fileInputStream.read(bArr); i != -1; i = fileInputStream.read(bArr)) {
                    messageDigest.update(bArr, 0, i);
                }
                C2166yC c2166yCF = C2166yC.f17693f.f();
                byte[] bArrDigest = messageDigest.digest();
                String strG = c2166yCF.g(bArrDigest.length, bArrDigest);
                fileInputStream.close();
                return strG;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | UnsupportedOperationException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static C1338iu o(Context context) {
        synchronized (C1338iu.class) {
            try {
                C1338iu c1338iu = f14818e;
                if (c1338iu != null) {
                    return c1338iu;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) AbstractC1426ka.f15167b.v()).longValue();
                InterfaceC2815e0 interfaceC2815e0AsInterface = null;
                if (jLongValue > 0 && jLongValue <= 254715000) {
                    try {
                        interfaceC2815e0AsInterface = AbstractBinderC2813d0.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
                        u2.k.f("Failed to retrieve lite SDK info.", e6);
                    }
                }
                C1338iu c1338iu2 = new C1338iu(applicationContext, interfaceC2815e0AsInterface);
                f14818e = c1338iu2;
                return c1338iu2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized String A() {
        BinderC1168fk binderC1168fk;
        try {
            binderC1168fk = (BinderC1168fk) this.f14824d;
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
            return null;
        }
        return binderC1168fk != null ? binderC1168fk.f14124a : null;
    }

    public ArrayList C() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f14823c;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            String str = (String) C2841s.f23267e.f23270c.a((E9) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        AbstractC0709Rg.o(arrayList3, new J4(4, "", "gad:dynamite_module:experiment_id"));
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13947d);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13948e);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13949f);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13950g);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13951h);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13966x);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.i);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13958p);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13959q);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13960r);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13961s);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13962t);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13963u);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13964v);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13965w);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13952j);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13953k);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13954l);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13955m);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13956n);
        AbstractC0709Rg.o(arrayList3, AbstractC1114el.f13957o);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public ArrayList D() {
        ArrayList arrayListC = C();
        ArrayList arrayList = (ArrayList) this.f14824d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) C2841s.f23267e.f23270c.a((E9) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayListC.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        AbstractC0709Rg.o(arrayList2, AbstractC2022vd.f17296l);
        arrayListC.addAll(arrayList2);
        return arrayListC;
    }

    public void E() {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.c7)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            C1823ru c1823ru = (C1823ru) this.f14823c;
            sb.append(c1823ru.f16638c);
            sb.append(" PoolCollection");
            C1716pu c1716pu = (C1716pu) this.f14824d;
            sb.append("\n\tPool does not exist: " + c1716pu.f16253d + "\n\tNew pools created: " + c1716pu.f16251b + "\n\tPools removed: " + c1716pu.f16252c + "\n\tEntries added: " + c1716pu.f16255f + "\n\tNo entries retrieved: " + c1716pu.f16254e + "\n");
            int i = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.f14822b).entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((InterfaceC1931tu) entry.getKey()).hashCode());
                sb.append("    ");
                int i3 = 0;
                while (true) {
                    C1608nu c1608nu = (C1608nu) entry.getValue();
                    c1608nu.a();
                    if (i3 >= c1608nu.f15842a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i3++;
                }
                C1608nu c1608nu2 = (C1608nu) entry.getValue();
                c1608nu2.a();
                for (int size = c1608nu2.f15842a.size(); size < c1823ru.f16640e; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                Bu bu = ((C1608nu) entry.getValue()).f15845d;
                sb.append("Created: " + bu.f7459a + " Last accessed: " + bu.f7461c + " Accesses: " + bu.f7462d + "\nEntries retrieved: Valid: " + bu.f7463e + " Stale: " + bu.f7464f);
                sb.append("\n");
            }
            while (i < c1823ru.f16639d) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            u2.k.c(sb.toString());
        }
    }

    public AbstractC2221zD F(C1807re c1807re, InterfaceC1872sp interfaceC1872sp, InterfaceC1872sp interfaceC1872sp2, InterfaceC1736qD interfaceC1736qD) {
        ID id = (ID) this.f14822b;
        String str = c1807re.f16579d;
        C2911G c2911g = p2.j.f22785C.f22790c;
        return AbstractC1984ut.D(AbstractC1984ut.F(AbstractC1984ut.F(AbstractC2221zD.r(C2911G.f(str) ? AbstractC1984ut.w(new C1765qp(1)) : AbstractC1984ut.D(interfaceC1872sp.e(c1807re), ExecutionException.class, C1704pi.f16206g, id)), C1704pi.f16204e, id), interfaceC1736qD, id), C1765qp.class, new C0450Cc(this, interfaceC1872sp2, c1807re, interfaceC1736qD, 3), id);
    }

    @Override // com.google.android.gms.internal.ads.P2
    public int a() {
        return ((long[]) this.f14824d).length;
    }

    @Override // com.google.android.gms.internal.ads.Eu
    public Object b(Object obj) {
        switch (this.f14821a) {
            case 19:
                return t((C2250zp) obj);
            default:
                C0633Mp c0633Mp = (C0633Mp) this.f14822b;
                u2.n nVar = (u2.n) this.f14823c;
                String str = (String) this.f14824d;
                c0633Mp.getClass();
                c0633Mp.f9910b.execute(new RunnableC0912b0((SQLiteDatabase) obj, str, nVar, 7));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    public Qt c() {
        switch (this.f14821a) {
        }
        return (Qt) this.f14823c;
    }

    public void d() {
        M2.u.c("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(String.valueOf(0).length() + 44);
        sb.append("Adapter called onAdFailedToLoad with error 0.");
        u2.k.c(sb.toString());
        try {
            ((InterfaceC0688Qc) this.f14822b).o0(0);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0916b4
    public void e(C2038vt c2038vt, InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        this.f14823c = c2038vt;
        c1189g4.a();
        c1189g4.b();
        T0 t0X = interfaceC2100x0.x(c1189g4.f14197d, 5);
        this.f14824d = t0X;
        t0X.e((TP) this.f14822b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0916b4
    public void f(C2036vr c2036vr) {
        long jA;
        ((C2038vt) this.f14823c).getClass();
        String str = Vt.f12096a;
        C2038vt c2038vt = (C2038vt) this.f14823c;
        synchronized (c2038vt) {
            try {
                long j6 = c2038vt.f17361c;
                jA = j6 != -9223372036854775807L ? j6 + c2038vt.f17360b : c2038vt.a();
            } finally {
            }
        }
        long jB = ((C2038vt) this.f14823c).b();
        if (jA == -9223372036854775807L || jB == -9223372036854775807L) {
            return;
        }
        TP tp = (TP) this.f14822b;
        if (jB != tp.f11402r) {
            C1855sP c1855sP = new C1855sP(tp);
            c1855sP.f16737q = jB;
            TP tp2 = new TP(c1855sP);
            this.f14822b = tp2;
            ((T0) this.f14824d).e(tp2);
        }
        int iB = c2036vr.B();
        ((T0) this.f14824d).a(iB, c2036vr);
        ((T0) this.f14824d).c(jA, 1, iB, 0, null);
    }

    public void g(C2545a c2545a) {
        M2.u.c("#008 Must be called on the main UI thread.");
        int i = c2545a.f21321b;
        String str = (String) c2545a.f21322c;
        String str2 = (String) c2545a.f21323d;
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        u2.k.c(sb.toString());
        try {
            ((InterfaceC0688Qc) this.f14822b).d3(c2545a.b());
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.P2
    public long h(int i) {
        AbstractC0582Jp.m(i >= 0);
        long[] jArr = (long[]) this.f14824d;
        AbstractC0582Jp.m(i < jArr.length);
        return jArr[i];
    }

    @Override // M2.InterfaceC0162b
    public void h0() {
        A1.s sVar = (A1.s) this.f14824d;
        synchronized (sVar.f125d) {
            try {
                if (sVar.f122a) {
                    return;
                }
                sVar.f122a = true;
                C1838s8 c1838s8 = (C1838s8) sVar.f123b;
                if (c1838s8 == null) {
                    return;
                }
                C0623Mf c0623Mf = AbstractC0640Nf.f10005a;
                C1892t8 c1892t8 = (C1892t8) this.f14822b;
                C2000v8 c2000v8 = (C2000v8) this.f14823c;
                c2000v8.f10212a.a(new CD(c2000v8, c0623Mf.a(new RunnableC1369jO(this, c1838s8, c1892t8, c2000v8, 2)), 5, false), AbstractC0640Nf.f10011g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.P2
    public ArrayList i(long j6) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.f14822b;
            if (i >= list.size()) {
                break;
            }
            long[] jArr = (long[]) this.f14823c;
            int i3 = i + i;
            if (jArr[i3] <= j6 && j6 < jArr[i3 + 1]) {
                C1995v3 c1995v3 = (C1995v3) list.get(i);
                C2244zj c2244zj = c1995v3.f17218a;
                if (c2244zj.f17927e == -3.4028235E38f) {
                    arrayList2.add(c1995v3);
                } else {
                    arrayList.add(c2244zj);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, C2045w.f17382e);
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            C2244zj c2244zj2 = ((C1995v3) arrayList2.get(i6)).f17218a;
            arrayList.add(new C2244zj(c2244zj2.f17923a, c2244zj2.f17924b, c2244zj2.f17925c, c2244zj2.f17926d, (-1) - i6, 1, c2244zj2.f17929g, c2244zj2.f17930h, c2244zj2.i, c2244zj2.f17933l, c2244zj2.f17934m, c2244zj2.f17931j, c2244zj2.f17932k, c2244zj2.f17935n, c2244zj2.f17936o, c2244zj2.f17937p));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public /* bridge */ /* synthetic */ InterfaceFutureC2326a j(C0697Ql c0697Ql, At at) {
        return q(null);
    }

    @Override // w2.InterfaceC2973e
    public void k(C2545a c2545a) {
        switch (this.f14821a) {
            case 9:
                try {
                    ((InterfaceC1537md) this.f14822b).a(c2545a.b());
                    break;
                } catch (RemoteException e6) {
                    u2.k.f("", e6);
                    return;
                }
            case 10:
                try {
                    ((InterfaceC1323id) this.f14822b).a(c2545a.b());
                    break;
                } catch (RemoteException e7) {
                    u2.k.f("", e7);
                    return;
                }
            default:
                try {
                    ((InterfaceC1753qd) this.f14822b).a(c2545a.b());
                    break;
                } catch (RemoteException e8) {
                    u2.k.f("", e8);
                }
        }
    }

    public void l(C2545a c2545a) {
        M2.u.c("#008 Must be called on the main UI thread.");
        int i = c2545a.f21321b;
        String str = (String) c2545a.f21322c;
        String str2 = (String) c2545a.f21323d;
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        u2.k.c(sb.toString());
        try {
            ((InterfaceC0688Qc) this.f14822b).d3(c2545a.b());
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.Bt
    public /* bridge */ /* synthetic */ Object m() {
        return null;
    }

    public void n(C2545a c2545a) {
        M2.u.c("#008 Must be called on the main UI thread.");
        int i = c2545a.f21321b;
        String str = (String) c2545a.f21322c;
        String str2 = (String) c2545a.f21323d;
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        u2.k.c(sb.toString());
        try {
            ((InterfaceC0688Qc) this.f14822b).d3(c2545a.b());
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // w2.InterfaceC2973e
    public /* synthetic */ Object onSuccess(Object obj) {
        switch (this.f14821a) {
            case 9:
                InterfaceC1537md interfaceC1537md = (InterfaceC1537md) this.f14822b;
                try {
                    ((BinderC2076wd) this.f14824d).f17452b = (i2.h) obj;
                    interfaceC1537md.b();
                } catch (RemoteException e6) {
                    u2.k.f("", e6);
                }
                break;
            case 10:
                InterfaceC1323id interfaceC1323id = (InterfaceC1323id) this.f14822b;
                try {
                    ((BinderC2076wd) this.f14824d).f17454d = (i2.c) obj;
                    interfaceC1323id.b();
                } catch (RemoteException e7) {
                    u2.k.f("", e7);
                }
                break;
            default:
                InterfaceC1753qd interfaceC1753qd = (InterfaceC1753qd) this.f14822b;
                try {
                    ((BinderC2076wd) this.f14824d).f17453c = (i2.m) obj;
                    interfaceC1753qd.b();
                } catch (RemoteException e8) {
                    u2.k.f("", e8);
                }
                break;
        }
        return new C2130xd((InterfaceC0688Qc) this.f14823c);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    public void p(boolean z6, Context context, C1760qk c1760qk) throws C0578Jl {
        C1123eu c1123eu;
        switch (this.f14821a) {
            case 22:
                try {
                    p1.e eVar = p2.j.f22785C.f22789b;
                    p1.e.i(context, (AdOverlayInfoParcel) ((C0657Of) this.f14822b).f10212a.get(), true, (C0784Vn) ((C2143xq) this.f14824d).f17635f);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    C1392ju c1392ju = (C1392ju) ((C1119eq) this.f14822b).f13987b;
                    c1392ju.b(z6);
                    InterfaceC0637Nc interfaceC0637Nc = c1392ju.f15016a;
                    if (((C2951a) ((C2035vq) this.f14824d).f17348d).f23786c < ((Integer) C2841s.f23267e.f23270c.a(H9.f8742f1)).intValue()) {
                        try {
                            interfaceC0637Nc.g();
                            return;
                        } finally {
                        }
                    } else {
                        try {
                            interfaceC0637Nc.h3(new S2.b(context));
                            return;
                        } finally {
                        }
                    }
                } catch (C1123eu e6) {
                    u2.k.g("Cannot show interstitial.");
                    throw new C0578Jl(e6.getCause());
                }
                u2.k.g("Cannot show interstitial.");
                throw new C0578Jl(e6.getCause());
        }
    }

    public AbstractC2221zD q(InterfaceC0848Zj interfaceC0848Zj) {
        InterfaceFutureC2326a interfaceFutureC2326aE;
        InterfaceFutureC2326a interfaceFutureC2326aC;
        C1338iu c1338iu = (C1338iu) this.f14822b;
        Executor executor = (Executor) this.f14823c;
        C1431kf c1431kf = new C1431kf(c1338iu, interfaceC0848Zj, executor);
        C2146xt c2146xt = (C2146xt) c1431kf.f15176e;
        if (c2146xt == null) {
            if (((Boolean) AbstractC1750qa.f16379a.v()).booleanValue()) {
                C0440Bj c0440BjA = interfaceC0848Zj.a();
                C1823ru c1823ru = (C1823ru) c1338iu.f14823c;
                C0831Yj c0831Yj = c0440BjA.i;
                Ju juU = c0440BjA.f7396c.a(c0831Yj.b(), Ku.GET_CACHE_KEY).i(new C0467Dc(c0440BjA, 3, c1823ru)).u();
                C1283hr c1283hr = new C1283hr(12, c0440BjA);
                juU.a(new CD(juU, 0, c1283hr), c0440BjA.f7402j);
                interfaceFutureC2326aC = AbstractC1984ut.C(AbstractC1984ut.G(AbstractC2221zD.r(juU), new C2092wt(c1431kf, 1), executor), C1765qp.class, new C2092wt(c1431kf, 0), executor);
            } else {
                C2146xt c2146xt2 = new C2146xt(null, c1431kf.x());
                c1431kf.f15176e = c2146xt2;
                interfaceFutureC2326aC = AbstractC1984ut.e(c2146xt2);
            }
            interfaceFutureC2326aE = AbstractC1984ut.G(interfaceFutureC2326aC, C1563n2.f15724q, executor);
        } else {
            interfaceFutureC2326aE = AbstractC1984ut.e(c2146xt);
        }
        return AbstractC1984ut.C(AbstractC1984ut.F(AbstractC2221zD.r(interfaceFutureC2326aE), new C0467Dc(this, 13, interfaceC0848Zj), executor), Exception.class, new C1563n2(16), executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void r(com.google.android.gms.internal.ads.St r3, com.google.android.gms.internal.ads.Qt r4, int r5, com.google.android.gms.internal.ads.C1174fq r6, long r7) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f14824d
            com.google.android.gms.internal.ads.Vn r0 = (com.google.android.gms.internal.ads.C0784Vn) r0
            com.google.android.gms.internal.ads.Ql r0 = r0.a()
            java.lang.String r1 = "gqi"
            java.lang.String r3 = r3.f11269b
            r0.r(r1, r3)
            r0.o(r4)
            java.lang.String r3 = "action"
            java.lang.String r1 = "adapter_status"
            r0.r(r3, r1)
            java.lang.String r3 = "adapter_l"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.r(r3, r7)
            java.lang.String r3 = "sc"
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r0.r(r3, r5)
            r3 = 0
            if (r6 == 0) goto L61
            q2.x0 r5 = r6.f14157b
            int r5 = r5.f23273a
            java.lang.String r5 = java.lang.Integer.toString(r5)
            java.lang.String r7 = "arec"
            r0.r(r7, r5)
            java.lang.Object r5 = r2.f14822b
            com.google.android.gms.internal.ads.hu r5 = (com.google.android.gms.internal.ads.C1286hu) r5
            java.lang.String r6 = r6.getMessage()
            java.util.regex.Pattern r5 = r5.f14617a
            if (r5 == 0) goto L59
            if (r6 != 0) goto L4a
            goto L59
        L4a:
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L59
            java.lang.String r5 = r5.group()
            goto L5a
        L59:
            r5 = r3
        L5a:
            if (r5 == 0) goto L61
            java.lang.String r6 = "areec"
            r0.r(r6, r5)
        L61:
            java.lang.Object r5 = r2.f14823c
            com.google.android.gms.internal.ads.Hn r5 = (com.google.android.gms.internal.ads.C0546Hn) r5
            java.util.List r4 = r4.f10793t
            java.util.Iterator r4 = r4.iterator()
        L6b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.gms.internal.ads.Gn r6 = r5.b(r6)
            if (r6 == 0) goto L6b
            r3 = r6
        L7e:
            if (r3 == 0) goto La1
            java.lang.String r4 = "ancn"
            java.lang.String r5 = r3.f8438a
            r0.r(r4, r5)
            com.google.android.gms.internal.ads.yd r4 = r3.f8439b
            if (r4 == 0) goto L94
            java.lang.String r5 = "adapter_v"
            java.lang.String r4 = r4.toString()
            r0.r(r5, r4)
        L94:
            com.google.android.gms.internal.ads.yd r3 = r3.f8440c
            if (r3 == 0) goto La1
            java.lang.String r4 = "adapter_sv"
            java.lang.String r3 = r3.toString()
            r0.r(r4, r3)
        La1:
            r0.s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1338iu.r(com.google.android.gms.internal.ads.St, com.google.android.gms.internal.ads.Qt, int, com.google.android.gms.internal.ads.fq, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean s() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.f14822b     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.p8 r0 = (com.google.android.gms.internal.ads.C1677p8) r0     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r0.f16142f     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.xj r0 = (com.google.android.gms.internal.ads.C2136xj) r0     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L11
            boolean r0 = r0.f17623c     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            monitor-exit(r1)
            return r0
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L16
            throw r0
        L16:
            r0 = move-exception
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1338iu.s():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0290, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r2.append("Received error HTTP response code: ");
        r2.append(r0);
        u2.k.h(r2.toString());
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r3.append("Received error HTTP response code: ");
        r3.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02cb, code lost:
    
        throw new com.google.android.gms.internal.ads.C0836Yo(1, r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02ee, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0209, code lost:
    
        r13.disconnect();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.C0429Ap t(com.google.android.gms.internal.ads.C2250zp r22) throws java.net.ProtocolException, com.google.android.gms.internal.ads.C0836Yo {
        /*
            Method dump skipped, instructions count: 779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1338iu.t(com.google.android.gms.internal.ads.zp):com.google.android.gms.internal.ads.Ap");
    }

    public synchronized void u(InterfaceC1931tu interfaceC1931tu, C1877su c1877su) {
        try {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f14822b;
            C1608nu c1608nu = (C1608nu) concurrentHashMap.get(interfaceC1931tu);
            p2.j.f22785C.f22797k.getClass();
            c1877su.f16821d = System.currentTimeMillis();
            if (c1608nu == null) {
                C1823ru c1823ru = (C1823ru) this.f14823c;
                C1608nu c1608nu2 = new C1608nu(c1823ru.f16640e, c1823ru.f16641f * TTAdConstant.STYLE_SIZE_RADIO_1_1);
                if (concurrentHashMap.size() == c1823ru.f16639d) {
                    int i = c1823ru.f16644j;
                    int i3 = i - 1;
                    InterfaceC1931tu interfaceC1931tu2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j6 = Long.MAX_VALUE;
                    if (i3 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((C1608nu) entry.getValue()).f15845d.f7459a < j6) {
                                j6 = ((C1608nu) entry.getValue()).f15845d.f7459a;
                                interfaceC1931tu2 = (InterfaceC1931tu) entry.getKey();
                            }
                        }
                        if (interfaceC1931tu2 != null) {
                            concurrentHashMap.remove(interfaceC1931tu2);
                        }
                    } else if (i3 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((C1608nu) entry2.getValue()).f15845d.f7461c < j6) {
                                j6 = ((C1608nu) entry2.getValue()).f15845d.f7461c;
                                interfaceC1931tu2 = (InterfaceC1931tu) entry2.getKey();
                            }
                        }
                        if (interfaceC1931tu2 != null) {
                            concurrentHashMap.remove(interfaceC1931tu2);
                        }
                    } else if (i3 == 2) {
                        int i6 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((C1608nu) entry3.getValue()).f15845d.f7462d < i6) {
                                i6 = ((C1608nu) entry3.getValue()).f15845d.f7462d;
                                interfaceC1931tu2 = (InterfaceC1931tu) entry3.getKey();
                            }
                        }
                        if (interfaceC1931tu2 != null) {
                            concurrentHashMap.remove(interfaceC1931tu2);
                        }
                    }
                    C1716pu c1716pu = (C1716pu) this.f14824d;
                    c1716pu.f16252c++;
                    c1716pu.f16250a.f16078b = true;
                }
                concurrentHashMap.put(interfaceC1931tu, c1608nu2);
                C1716pu c1716pu2 = (C1716pu) this.f14824d;
                c1716pu2.f16251b++;
                c1716pu2.f16250a.f16077a = true;
                c1608nu = c1608nu2;
            }
            Bu bu = c1608nu.f15845d;
            bu.getClass();
            p2.j.f22785C.f22797k.getClass();
            bu.f7461c = System.currentTimeMillis();
            bu.f7462d++;
            c1608nu.a();
            LinkedList linkedList = c1608nu.f15842a;
            if (linkedList.size() != c1608nu.f15843b) {
                linkedList.add(c1877su);
            }
            C1716pu c1716pu3 = (C1716pu) this.f14824d;
            c1716pu3.f16255f++;
            C1662ou c1662ou = c1716pu3.f16250a;
            C1662ou c1662ouClone = c1662ou.clone();
            c1662ou.f16077a = false;
            c1662ou.f16078b = false;
            Au au = c1608nu.f15845d.f7460b;
            Au auClone = au.clone();
            au.f7064a = false;
            au.f7065b = 0;
            Z8 z8A = C1084e9.A();
            X8 x8B = Y8.B();
            x8B.b();
            ((Y8) x8B.f13551b).C();
            C0975c9 c0975c9B = C1030d9.B();
            boolean z6 = c1662ouClone.f16077a;
            c0975c9B.b();
            ((C1030d9) c0975c9B.f13551b).C(z6);
            boolean z7 = c1662ouClone.f16078b;
            c0975c9B.b();
            ((C1030d9) c0975c9B.f13551b).D(z7);
            int i7 = auClone.f7065b;
            c0975c9B.b();
            ((C1030d9) c0975c9B.f13551b).A(i7);
            x8B.b();
            ((Y8) x8B.f13551b).A((C1030d9) c0975c9B.d());
            z8A.b();
            ((C1084e9) z8A.f13551b).B((Y8) x8B.d());
            c1877su.f16818a.a().f7399f.B((C1084e9) z8A.d());
            E();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void v(q2.a1 a1Var, int i) {
        this.f14824d = null;
        Er er = new Er(i);
        Rx rx = new Rx(this);
        ((C1677p8) this.f14822b).e(a1Var, (String) this.f14823c, er, rx);
    }

    public St w() {
        return (St) ((Xt) this.f14822b).f12510b.f15174c;
    }

    public synchronized String x() {
        BinderC1168fk binderC1168fk;
        try {
            binderC1168fk = (BinderC1168fk) this.f14824d;
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
            return null;
        }
        return binderC1168fk != null ? binderC1168fk.f14124a : null;
    }

    public void y(InterfaceC0603Lc interfaceC0603Lc) {
        InterfaceC0603Lc adapterCreator;
        AtomicReference atomicReference = (AtomicReference) this.f14824d;
        if (!((Boolean) AbstractC1426ka.f15166a.v()).booleanValue()) {
            while (!atomicReference.compareAndSet(null, interfaceC0603Lc) && atomicReference.get() == null) {
            }
            return;
        }
        InterfaceC2815e0 interfaceC2815e0 = (InterfaceC2815e0) this.f14823c;
        if (interfaceC2815e0 == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = interfaceC2815e0.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        if (adapterCreator == null) {
            adapterCreator = interfaceC0603Lc;
        }
        while (!atomicReference.compareAndSet(null, adapterCreator) && atomicReference.get() == null) {
        }
    }

    public synchronized boolean z(InterfaceC1931tu interfaceC1931tu) {
        C1608nu c1608nu = (C1608nu) ((ConcurrentHashMap) this.f14822b).get(interfaceC1931tu);
        if (c1608nu == null) {
            return true;
        }
        C1823ru c1823ru = (C1823ru) this.f14823c;
        c1608nu.a();
        return c1608nu.f15842a.size() < c1823ru.f16640e;
    }

    public C1338iu(InterfaceC0688Qc interfaceC0688Qc) {
        this.f14821a = 8;
        this.f14822b = interfaceC0688Qc;
    }

    public C1338iu(C0756Uc c0756Uc, C0739Tc c0739Tc, InterfaceC0790Wc interfaceC0790Wc) {
        this.f14821a = 15;
        this.f14823c = c0756Uc;
        this.f14824d = c0739Tc;
        this.f14822b = interfaceC0790Wc;
    }

    public C1338iu(C0710Rh c0710Rh, Context context, C0623Mf c0623Mf) {
        this.f14821a = 18;
        this.f14823c = c0710Rh;
        this.f14822b = context;
        this.f14824d = c0623Mf;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1223gl, com.google.android.gms.internal.ads.InterfaceC0801Wn
    /* renamed from: b */
    public /* synthetic */ void mo4b(Object obj) {
        ((InterfaceC1382jk) obj).F((BinderC2185ye) this.f14822b, (String) this.f14823c, (String) this.f14824d);
    }

    public C1338iu(Xt xt, Qt qt, String str) {
        this.f14821a = 12;
        this.f14822b = xt;
        this.f14823c = qt;
        this.f14824d = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public /* synthetic */ C1338iu(Object obj, int i, Object obj2) {
        this.f14821a = i;
        this.f14822b = obj;
        this.f14823c = obj2;
    }

    public /* synthetic */ C1338iu(Object obj, Object obj2, Object obj3, int i) {
        this.f14821a = i;
        this.f14822b = obj2;
        this.f14823c = obj3;
        this.f14824d = obj;
    }

    public /* synthetic */ C1338iu(Object obj, Object obj2, Object obj3, int i, boolean z6) {
        this.f14821a = i;
        this.f14822b = obj;
        this.f14823c = obj2;
        this.f14824d = obj3;
    }

    public C1338iu(int i) {
        this.f14821a = i;
        switch (i) {
            case 6:
                this.f14822b = new ArrayList();
                this.f14823c = new ArrayList();
                this.f14824d = new ArrayList();
                break;
            default:
                String str = Vt.f12096a;
                this.f14822b = new ExecutorC2099x(0, Executors.newSingleThreadExecutor(new ThreadFactoryC1539mf("ExoPlayer:Loader:ProgressiveMediaPeriod")));
                break;
        }
    }

    public C1338iu(Context context, Executor executor, O5 o5, Nx nx) {
        this.f14821a = 4;
        this.f14823c = nx;
        this.f14824d = o5;
        this.f14822b = AbstractC1984ut.z(new CallableC1890t6(this, 0, context), executor);
    }

    public C1338iu(Context context, InterfaceC2815e0 interfaceC2815e0) {
        this.f14821a = 0;
        this.f14824d = new AtomicReference();
        this.f14822b = context;
        this.f14823c = interfaceC2815e0;
    }

    public C1338iu(C1708pm c1708pm, C0784Vn c0784Vn) {
        this.f14821a = 26;
        this.f14822b = c1708pm;
        C2090wr c2090wr = new C2090wr(c0784Vn);
        this.f14823c = c2090wr;
        this.f14824d = new Br(c2090wr, c1708pm.f16220e);
    }

    public C1338iu(C1338iu c1338iu, C0623Mf c0623Mf) {
        this.f14821a = 27;
        this.f14824d = new C1285ht(3, (byte) 0);
        this.f14822b = c1338iu;
        this.f14823c = c0623Mf;
    }

    public C1338iu(C1823ru c1823ru) {
        this.f14821a = 28;
        this.f14822b = new ConcurrentHashMap(c1823ru.f16640e);
        this.f14823c = c1823ru;
        this.f14824d = new C1716pu();
    }

    public C1338iu(String str) {
        this.f14821a = 3;
        C1855sP c1855sP = new C1855sP();
        c1855sP.d("video/mp2t");
        c1855sP.e(str);
        this.f14822b = new TP(c1855sP);
    }

    @Override // M2.InterfaceC0162b
    public void g0(int i) {
    }

    public C1338iu(ArrayList arrayList) {
        this.f14821a = 2;
        this.f14822b = Collections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.f14823c = new long[size + size];
        for (int i = 0; i < arrayList.size(); i++) {
            C1995v3 c1995v3 = (C1995v3) arrayList.get(i);
            long[] jArr = (long[]) this.f14823c;
            int i3 = i + i;
            jArr[i3] = c1995v3.f17219b;
            jArr[i3 + 1] = c1995v3.f17220c;
        }
        long[] jArr2 = (long[]) this.f14823c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f14824d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }
}
