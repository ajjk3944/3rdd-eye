package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pq0 implements p6, c9, pb.b, bb.e, bb.n, bb.s, bb.v, c80, lr0, f90, fp0 {

    /* renamed from: e, reason: collision with root package name */
    public static pq0 f15070e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f15071f;
    public static final o g;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15072a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15073b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15074c;

    /* renamed from: d, reason: collision with root package name */
    public Object f15075d;

    static {
        long j = -9223372036854775807L;
        f15071f = new o(2, j);
        g = new o(3, j);
    }

    public /* synthetic */ pq0(int i4, Object obj, Object obj2) {
        this.f15072a = i4;
        this.f15073b = obj;
        this.f15074c = obj2;
    }

    public static pq0 o(Context context) {
        synchronized (pq0.class) {
            try {
                pq0 pq0Var = f15070e;
                if (pq0Var != null) {
                    return pq0Var;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) vl.f17643b.u()).longValue();
                va.d1 d1VarAsInterface = null;
                if (jLongValue > 0 && jLongValue <= 254715000) {
                    try {
                        d1VarAsInterface = va.c1.asInterface((IBinder) applicationContext.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(applicationContext));
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                        za.i.f("Failed to retrieve lite SDK info.", e2);
                    }
                }
                pq0 pq0Var2 = new pq0(applicationContext, d1VarAsInterface);
                f15070e = pq0Var2;
                return pq0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ArrayList A() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f15074c;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            String str = (String) va.s.f36163e.f36166c.a((pk) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ls.u(arrayList3, new oa("gad:dynamite_module:experiment_id", "", 4));
        ls.u(arrayList3, a80.f9254d);
        ls.u(arrayList3, a80.f9255e);
        ls.u(arrayList3, a80.f9256f);
        ls.u(arrayList3, a80.g);
        ls.u(arrayList3, a80.f9257h);
        ls.u(arrayList3, a80.f9272x);
        ls.u(arrayList3, a80.f9258i);
        ls.u(arrayList3, a80.f9264p);
        ls.u(arrayList3, a80.f9265q);
        ls.u(arrayList3, a80.f9266r);
        ls.u(arrayList3, a80.f9267s);
        ls.u(arrayList3, a80.f9268t);
        ls.u(arrayList3, a80.f9269u);
        ls.u(arrayList3, a80.f9270v);
        ls.u(arrayList3, a80.f9271w);
        ls.u(arrayList3, a80.j);
        ls.u(arrayList3, a80.f9259k);
        ls.u(arrayList3, a80.f9260l);
        ls.u(arrayList3, a80.f9261m);
        ls.u(arrayList3, a80.f9262n);
        ls.u(arrayList3, a80.f9263o);
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public ArrayList B() {
        ArrayList arrayListA = A();
        ArrayList arrayList = (ArrayList) this.f15075d;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            String str = (String) va.s.f36163e.f36166c.a((pk) obj);
            if (!TextUtils.isEmpty(str)) {
                arrayListA.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ls.u(arrayList2, ls.f13594l);
        arrayListA.addAll(arrayList2);
        return arrayListA;
    }

    public void C() {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16075c7)).booleanValue()) {
            StringBuilder sb2 = new StringBuilder();
            zq0 zq0Var = (zq0) this.f15074c;
            sb2.append(zq0Var.f19145c);
            sb2.append(" PoolCollection");
            xq0 xq0Var = (xq0) this.f15075d;
            sb2.append("\n\tPool does not exist: " + xq0Var.f18447d + "\n\tNew pools created: " + xq0Var.f18445b + "\n\tPools removed: " + xq0Var.f18446c + "\n\tEntries added: " + xq0Var.f18449f + "\n\tNo entries retrieved: " + xq0Var.f18448e + "\n");
            int i4 = 0;
            for (Map.Entry entry : ((ConcurrentHashMap) this.f15073b).entrySet()) {
                i4++;
                sb2.append(i4);
                sb2.append(". ");
                sb2.append(entry.getValue());
                sb2.append("#");
                sb2.append(((br0) entry.getKey()).hashCode());
                sb2.append("    ");
                int i10 = 0;
                while (true) {
                    uq0 uq0Var = (uq0) entry.getValue();
                    uq0Var.a();
                    if (i10 >= uq0Var.f17291a.size()) {
                        break;
                    }
                    sb2.append("[O]");
                    i10++;
                }
                uq0 uq0Var2 = (uq0) entry.getValue();
                uq0Var2.a();
                for (int size = uq0Var2.f17291a.size(); size < zq0Var.f19147e; size++) {
                    sb2.append("[ ]");
                }
                sb2.append("\n");
                ir0 ir0Var = ((uq0) entry.getValue()).f17294d;
                sb2.append("Created: " + ir0Var.f12421a + " Last accessed: " + ir0Var.f12423c + " Accesses: " + ir0Var.f12424d + "\nEntries retrieved: Valid: " + ir0Var.f12425e + " Stale: " + ir0Var.f12426f);
                sb2.append("\n");
            }
            while (i4 < zq0Var.f19146d) {
                i4++;
                sb2.append(i4);
                sb2.append(".\n");
            }
            za.i.c(sb2.toString());
        }
    }

    public n81 D(iu iuVar, qg0 qg0Var, qg0 qg0Var2, e81 e81Var) {
        w81 w81Var = (w81) this.f15073b;
        String str = iuVar.f12476d;
        ya.f0 f0Var = ua.j.C.f35261c;
        return yo0.D(yo0.F(yo0.F(n81.s(ya.f0.f(str) ? yo0.w(new og0(1)) : yo0.D(qg0Var.j(iuVar), ExecutionException.class, k20.g, w81Var)), k20.f12992e, w81Var), e81Var, w81Var), og0.class, new qq(this, qg0Var2, iuVar, e81Var, 3), w81Var);
    }

    @Override // com.google.android.gms.internal.ads.p6
    public long L1(int i4) {
        mq0.m(i4 >= 0);
        long[] jArr = (long[]) this.f15075d;
        mq0.m(i4 < jArr.length);
        return jArr[i4];
    }

    @Override // pb.b
    public void T() {
        b5.i0 i0Var = (b5.i0) this.f15075d;
        synchronized (i0Var.f1823d) {
            try {
                if (i0Var.f1820a) {
                    return;
                }
                i0Var.f1820a = true;
                di diVar = (di) i0Var.f1821b;
                if (diVar == null) {
                    return;
                }
                ex exVar = fx.f11274a;
                ei eiVar = (ei) this.f15073b;
                gi giVar = (gi) this.f15074c;
                giVar.f11625a.a(new q81(giVar, false, exVar.c(new xt1(this, diVar, eiVar, giVar, 2)), 5), fx.g);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.f90
    public wp0 a() {
        switch (this.f15072a) {
        }
        return (wp0) this.f15074c;
    }

    @Override // com.google.android.gms.internal.ads.p6
    public int b() {
        return ((long[]) this.f15075d).length;
    }

    @Override // com.google.android.gms.internal.ads.lr0
    /* renamed from: c */
    public Object mo170c(Object obj) {
        switch (this.f15072a) {
            case 19:
                return s((yg0) obj);
            default:
                lh0 lh0Var = (lh0) this.f15073b;
                za.l lVar = (za.l) this.f15074c;
                String str = (String) this.f15075d;
                lh0Var.getClass();
                lh0Var.f13493b.execute(new d1((SQLiteDatabase) obj, str, lVar, 7));
                return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.c9
    public void d(zo0 zo0Var, z1 z1Var, h9 h9Var) {
        this.f15074c = zo0Var;
        h9Var.a();
        h9Var.b();
        u2 u2VarM = z1Var.m(h9Var.f11776d, 5);
        this.f15075d = u2VarM;
        u2VarM.f((mx1) this.f15073b);
    }

    @Override // com.google.android.gms.internal.ads.f90
    public void e(boolean z3, Context context, m60 m60Var) throws e90 {
        kq0 kq0Var;
        switch (this.f15072a) {
            case 22:
                try {
                    ja.c cVar = ua.j.C.f35260b;
                    ja.c.E(context, (AdOverlayInfoParcel) ((gx) this.f15073b).f11625a.get(), true, (qd0) ((ui0) this.f15075d).f17212f);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    qq0 qq0Var = (qq0) ((ci0) this.f15073b).f10135b;
                    qq0Var.b(z3);
                    cr crVar = qq0Var.f15399a;
                    if (((za.a) ((si0) this.f15075d).f16021d).f38131c < ((Integer) va.s.f36163e.f36166c.a(sk.f16117f1)).intValue()) {
                        try {
                            crVar.z1();
                            return;
                        } finally {
                        }
                    } else {
                        try {
                            crVar.f4(new vb.b(context));
                            return;
                        } finally {
                        }
                    }
                } catch (kq0 e2) {
                    za.i.g("Cannot show interstitial.");
                    throw new e90(e2.getCause());
                }
                za.i.g("Cannot show interstitial.");
                throw new e90(e2.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.fp0
    public /* bridge */ /* synthetic */ Object f() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.p6
    public ArrayList g(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i4 = 0;
        while (true) {
            List list = (List) this.f15073b;
            if (i4 >= list.size()) {
                break;
            }
            long[] jArr = (long[]) this.f15074c;
            int i10 = i4 + i4;
            if (jArr[i10] <= j && j < jArr[i10 + 1]) {
                w7 w7Var = (w7) list.get(i4);
                w40 w40Var = w7Var.f17922a;
                if (w40Var.f17877e == -3.4028235E38f) {
                    arrayList2.add(w7Var);
                } else {
                    arrayList.add(w40Var);
                }
            }
            i4++;
        }
        Collections.sort(arrayList2, v.f17397e);
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            w40 w40Var2 = ((w7) arrayList2.get(i11)).f17922a;
            arrayList.add(new w40(w40Var2.f17873a, w40Var2.f17874b, w40Var2.f17875c, w40Var2.f17876d, (-1) - i11, 1, w40Var2.g, w40Var2.f17879h, w40Var2.f17880i, w40Var2.f17882l, w40Var2.f17883m, w40Var2.j, w40Var2.f17881k, w40Var2.f17884n, w40Var2.f17885o, w40Var2.f17886p));
        }
        return arrayList;
    }

    public void h() {
        pb.y.d("#008 Must be called on the main UI thread.");
        StringBuilder sb2 = new StringBuilder(String.valueOf(0).length() + 44);
        sb2.append("Adapter called onAdFailedToLoad with error 0.");
        za.i.c(sb2.toString());
        try {
            ((fr) this.f15073b).P1(0);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // bb.e
    public void i(pa.a aVar) {
        switch (this.f15072a) {
            case 7:
                try {
                    String canonicalName = ((bb.a) this.f15074c).getClass().getCanonicalName();
                    int i4 = aVar.f31511a;
                    int i10 = aVar.f31511a;
                    String str = aVar.f31512b;
                    String str2 = aVar.f31513c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 41 + String.valueOf(i4).length() + 17 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
                    sb2.append(canonicalName);
                    sb2.append("failed to load mediation ad: ErrorCode = ");
                    sb2.append(i4);
                    sb2.append(". ErrorMessage = ");
                    sb2.append(str);
                    sb2.append(". ErrorDomain = ");
                    sb2.append(str2);
                    za.i.c(sb2.toString());
                    fr frVar = (fr) this.f15073b;
                    frVar.I3(aVar.a());
                    frVar.a4(i10, str);
                    frVar.P1(i10);
                    break;
                } catch (RemoteException e2) {
                    za.i.f("", e2);
                }
            case 8:
            default:
                try {
                    ((gs) this.f15073b).b(aVar.a());
                    break;
                } catch (RemoteException e10) {
                    za.i.f("", e10);
                    return;
                }
            case 9:
                try {
                    ((cs) this.f15073b).b(aVar.a());
                    break;
                } catch (RemoteException e11) {
                    za.i.f("", e11);
                    return;
                }
            case 10:
                try {
                    ((yr) this.f15073b).b(aVar.a());
                    break;
                } catch (RemoteException e12) {
                    za.i.f("", e12);
                    return;
                }
        }
    }

    public void j(pa.a aVar) {
        pb.y.d("#008 Must be called on the main UI thread.");
        int i4 = aVar.f31511a;
        String str = aVar.f31512b;
        String str2 = aVar.f31513c;
        int length = String.valueOf(i4).length();
        StringBuilder sb2 = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(i4);
        sb2.append(". ErrorMessage: ");
        sb2.append(str);
        sb2.append(". ErrorDomain: ");
        sb2.append(str2);
        za.i.c(sb2.toString());
        try {
            ((fr) this.f15073b).I3(aVar.a());
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.fp0
    public /* bridge */ /* synthetic */ vd.b k(ce1 ce1Var, ep0 ep0Var) {
        return p(null);
    }

    @Override // com.google.android.gms.internal.ads.c9
    public void l(sk0 sk0Var) {
        long jA;
        ((zo0) this.f15074c).getClass();
        String str = bq0.f9768a;
        zo0 zo0Var = (zo0) this.f15074c;
        synchronized (zo0Var) {
            try {
                long j = zo0Var.f19134c;
                jA = j != -9223372036854775807L ? j + zo0Var.f19133b : zo0Var.a();
            } finally {
            }
        }
        long jB = ((zo0) this.f15074c).b();
        if (jA == -9223372036854775807L || jB == -9223372036854775807L) {
            return;
        }
        mx1 mx1Var = (mx1) this.f15073b;
        if (jB != mx1Var.f14057r) {
            lw1 lw1Var = new lw1(mx1Var);
            lw1Var.f13666q = jB;
            mx1 mx1Var2 = new mx1(lw1Var);
            this.f15073b = mx1Var2;
            ((u2) this.f15075d).f(mx1Var2);
        }
        int iB = sk0Var.B();
        ((u2) this.f15075d).b(iB, sk0Var);
        ((u2) this.f15075d).d(jA, 1, iB, 0, null);
    }

    public void m(pa.a aVar) {
        pb.y.d("#008 Must be called on the main UI thread.");
        int i4 = aVar.f31511a;
        String str = aVar.f31512b;
        String str2 = aVar.f31513c;
        int length = String.valueOf(i4).length();
        StringBuilder sb2 = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(i4);
        sb2.append(". ErrorMessage: ");
        sb2.append(str);
        sb2.append(". ErrorDomain: ");
        sb2.append(str2);
        za.i.c(sb2.toString());
        try {
            ((fr) this.f15073b).I3(aVar.a());
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    public void n(pa.a aVar) {
        pb.y.d("#008 Must be called on the main UI thread.");
        int i4 = aVar.f31511a;
        String str = aVar.f31512b;
        String str2 = aVar.f31513c;
        int length = String.valueOf(i4).length();
        StringBuilder sb2 = new StringBuilder(length + 71 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb2.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb2.append(i4);
        sb2.append(". ErrorMessage: ");
        sb2.append(str);
        sb2.append(". ErrorDomain: ");
        sb2.append(str2);
        za.i.c(sb2.toString());
        try {
            ((fr) this.f15073b).I3(aVar.a());
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // bb.e
    public /* synthetic */ Object onSuccess(Object obj) {
        switch (this.f15072a) {
            case 7:
                fr frVar = (fr) this.f15073b;
                if (obj != null) {
                    throw new ClassCastException();
                }
                try {
                    ((sr) this.f15075d).getClass();
                    frVar.A1();
                } catch (RemoteException e2) {
                    za.i.f("", e2);
                }
                return new nr(frVar);
            case 8:
            default:
                gs gsVar = (gs) this.f15073b;
                bb.w wVar = (bb.w) obj;
                if (wVar != null) {
                    try {
                        ((ms) this.f15075d).f14002c = wVar;
                        gsVar.c();
                    } catch (RemoteException e10) {
                        za.i.f("", e10);
                    }
                    return new ns((fr) this.f15074c);
                }
                za.i.h("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                try {
                    gsVar.g("Adapter returned null.");
                    return null;
                } catch (RemoteException e11) {
                    za.i.f("", e11);
                    return null;
                }
            case 9:
                cs csVar = (cs) this.f15073b;
                bb.p pVar = (bb.p) obj;
                if (pVar != null) {
                    try {
                        ((ms) this.f15075d).f14001b = pVar;
                        csVar.c();
                    } catch (RemoteException e12) {
                        za.i.f("", e12);
                    }
                    return new ns((fr) this.f15074c);
                }
                za.i.h("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                try {
                    csVar.g("Adapter returned null.");
                    return null;
                } catch (RemoteException e13) {
                    za.i.f("", e13);
                    return null;
                }
            case 10:
                yr yrVar = (yr) this.f15073b;
                bb.h hVar = (bb.h) obj;
                if (hVar != null) {
                    try {
                        ((ms) this.f15075d).f14003d = hVar;
                        yrVar.c();
                    } catch (RemoteException e14) {
                        za.i.f("", e14);
                    }
                    return new ns((fr) this.f15074c);
                }
                za.i.h("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
                try {
                    yrVar.g("Adapter returned null.");
                    return null;
                } catch (RemoteException e15) {
                    za.i.f("", e15);
                    return null;
                }
        }
    }

    public n81 p(x50 x50Var) {
        vd.b bVarE;
        vd.b bVarC;
        pq0 pq0Var = (pq0) this.f15073b;
        Executor executor = (Executor) this.f15074c;
        aw awVar = new aw(pq0Var, x50Var, executor);
        bp0 bp0Var = (bp0) awVar.f9454e;
        if (bp0Var == null) {
            if (((Boolean) bm.f9713a.u()).booleanValue()) {
                y40 y40VarB = x50Var.b();
                zq0 zq0Var = (zq0) pq0Var.f15074c;
                pr0 pr0VarT = y40VarB.f18629c.a(qr0.GET_CACHE_KEY, y40VarB.f18634i.b()).i(new sq(3, y40VarB, zq0Var)).t();
                ix0 ix0Var = new ix0(16, y40VarB);
                pr0VarT.a(new q81(0, pr0VarT, ix0Var), y40VarB.j);
                bVarC = yo0.C(yo0.G(n81.s(pr0VarT), new ap0(awVar, 1), executor), og0.class, new ap0(awVar, 0), executor);
            } else {
                bp0 bp0Var2 = new bp0(null, awVar.w());
                awVar.f9454e = bp0Var2;
                bVarC = yo0.e(bp0Var2);
            }
            bVarE = yo0.G(bVarC, o5.f14554q, executor);
        } else {
            bVarE = yo0.e(bp0Var);
        }
        return yo0.C(yo0.F(n81.s(bVarE), new sq(13, this, x50Var), executor), Exception.class, new o5(16), executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void q(com.google.android.gms.internal.ads.yp0 r3, com.google.android.gms.internal.ads.wp0 r4, int r5, com.google.android.gms.internal.ads.di0 r6, long r7) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f15075d
            com.google.android.gms.internal.ads.qd0 r0 = (com.google.android.gms.internal.ads.qd0) r0
            com.google.android.gms.internal.ads.rt r0 = r0.a()
            java.lang.String r1 = "gqi"
            java.lang.String r3 = r3.f18820b
            r0.u(r1, r3)
            r0.q(r4)
            java.lang.String r3 = "action"
            java.lang.String r1 = "adapter_status"
            r0.u(r3, r1)
            java.lang.String r3 = "adapter_l"
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.u(r3, r7)
            java.lang.String r3 = "sc"
            java.lang.String r5 = java.lang.Integer.toString(r5)
            r0.u(r3, r5)
            r3 = 0
            if (r6 == 0) goto L61
            va.w1 r5 = r6.f10486b
            int r5 = r5.f36177a
            java.lang.String r5 = java.lang.Integer.toString(r5)
            java.lang.String r7 = "arec"
            r0.u(r7, r5)
            java.lang.Object r5 = r2.f15073b
            com.google.android.gms.internal.ads.oq0 r5 = (com.google.android.gms.internal.ads.oq0) r5
            java.lang.String r6 = r6.getMessage()
            java.util.regex.Pattern r5 = r5.f14770a
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
            r0.u(r6, r5)
        L61:
            java.lang.Object r5 = r2.f15074c
            com.google.android.gms.internal.ads.dd0 r5 = (com.google.android.gms.internal.ads.dd0) r5
            java.util.List r4 = r4.f18108t
            java.util.Iterator r4 = r4.iterator()
        L6b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.gms.internal.ads.cd0 r6 = r5.b(r6)
            if (r6 == 0) goto L6b
            r3 = r6
        L7e:
            if (r3 == 0) goto La1
            java.lang.String r4 = "ancn"
            java.lang.String r5 = r3.f10083a
            r0.u(r4, r5)
            com.google.android.gms.internal.ads.os r4 = r3.f10084b
            if (r4 == 0) goto L94
            java.lang.String r5 = "adapter_v"
            java.lang.String r4 = r4.toString()
            r0.u(r5, r4)
        L94:
            com.google.android.gms.internal.ads.os r3 = r3.f10085c
            if (r3 == 0) goto La1
            java.lang.String r4 = "adapter_sv"
            java.lang.String r3 = r3.toString()
            r0.u(r4, r3)
        La1:
            r0.v()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pq0.q(com.google.android.gms.internal.ads.yp0, com.google.android.gms.internal.ads.wp0, int, com.google.android.gms.internal.ads.di0, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean r() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.Object r0 = r1.f15073b     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.ai r0 = (com.google.android.gms.internal.ads.ai) r0     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r0.f9335f     // Catch: java.lang.Throwable -> L16
            com.google.android.gms.internal.ads.u40 r0 = (com.google.android.gms.internal.ads.u40) r0     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L11
            boolean r0 = r0.f17085c     // Catch: java.lang.Throwable -> L16
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pq0.r():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0292, code lost:
    
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r2.append("Received error HTTP response code: ");
        r2.append(r0);
        za.i.h(r2.toString());
        r3 = new java.lang.StringBuilder(java.lang.String.valueOf(r0).length() + 35);
        r3.append("Received error HTTP response code: ");
        r3.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02cd, code lost:
    
        throw new com.google.android.gms.internal.ads.uf0(1, r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02f0, code lost:
    
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020b, code lost:
    
        r13.disconnect();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zg0 s(com.google.android.gms.internal.ads.yg0 r22) throws com.google.android.gms.internal.ads.uf0, java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pq0.s(com.google.android.gms.internal.ads.yg0):com.google.android.gms.internal.ads.zg0");
    }

    public synchronized void t(br0 br0Var, ar0 ar0Var) {
        try {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f15073b;
            uq0 uq0Var = (uq0) concurrentHashMap.get(br0Var);
            ua.j.C.f35267k.getClass();
            ar0Var.f9393d = System.currentTimeMillis();
            if (uq0Var == null) {
                zq0 zq0Var = (zq0) this.f15074c;
                uq0 uq0Var2 = new uq0(zq0Var.f19147e, zq0Var.f19148f * 1000);
                if (concurrentHashMap.size() == zq0Var.f19146d) {
                    int i4 = zq0Var.j;
                    int i10 = i4 - 1;
                    br0 br0Var2 = null;
                    if (i4 == 0) {
                        throw null;
                    }
                    long j = Long.MAX_VALUE;
                    if (i10 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((uq0) entry.getValue()).f17294d.f12421a < j) {
                                j = ((uq0) entry.getValue()).f17294d.f12421a;
                                br0Var2 = (br0) entry.getKey();
                            }
                        }
                        if (br0Var2 != null) {
                            concurrentHashMap.remove(br0Var2);
                        }
                    } else if (i10 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((uq0) entry2.getValue()).f17294d.f12423c < j) {
                                j = ((uq0) entry2.getValue()).f17294d.f12423c;
                                br0Var2 = (br0) entry2.getKey();
                            }
                        }
                        if (br0Var2 != null) {
                            concurrentHashMap.remove(br0Var2);
                        }
                    } else if (i10 == 2) {
                        int i11 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((uq0) entry3.getValue()).f17294d.f12424d < i11) {
                                i11 = ((uq0) entry3.getValue()).f17294d.f12424d;
                                br0Var2 = (br0) entry3.getKey();
                            }
                        }
                        if (br0Var2 != null) {
                            concurrentHashMap.remove(br0Var2);
                        }
                    }
                    xq0 xq0Var = (xq0) this.f15075d;
                    xq0Var.f18446c++;
                    xq0Var.f18444a.f18147b = true;
                }
                concurrentHashMap.put(br0Var, uq0Var2);
                xq0 xq0Var2 = (xq0) this.f15075d;
                xq0Var2.f18445b++;
                xq0Var2.f18444a.f18146a = true;
                uq0Var = uq0Var2;
            }
            ir0 ir0Var = uq0Var.f17294d;
            ir0Var.getClass();
            ua.j.C.f35267k.getClass();
            ir0Var.f12423c = System.currentTimeMillis();
            ir0Var.f12424d++;
            uq0Var.a();
            LinkedList linkedList = uq0Var.f17291a;
            if (linkedList.size() != uq0Var.f17292b) {
                linkedList.add(ar0Var);
            }
            xq0 xq0Var3 = (xq0) this.f15075d;
            xq0Var3.f18449f++;
            wq0 wq0Var = xq0Var3.f18444a;
            wq0 wq0VarClone = wq0Var.clone();
            wq0Var.f18146a = false;
            wq0Var.f18147b = false;
            hr0 hr0Var = uq0Var.f17294d.f12422b;
            hr0 hr0VarClone = hr0Var.clone();
            hr0Var.f11962a = false;
            hr0Var.f11963b = 0;
            kj kjVarA = pj.A();
            ij ijVarB = jj.B();
            ijVarB.b();
            ((jj) ijVarB.f14755b).C();
            nj njVarB = oj.B();
            boolean z3 = wq0VarClone.f18146a;
            njVarB.b();
            ((oj) njVarB.f14755b).C(z3);
            boolean z10 = wq0VarClone.f18147b;
            njVarB.b();
            ((oj) njVarB.f14755b).D(z10);
            int i12 = hr0VarClone.f11963b;
            njVarB.b();
            ((oj) njVarB.f14755b).A(i12);
            ijVarB.b();
            ((jj) ijVarB.f14755b).A((oj) njVarB.e());
            kjVarA.b();
            ((pj) kjVarA.f14755b).B((jj) ijVarB.e());
            ar0Var.f9390a.b().f18632f.r((pj) kjVarA.e());
            C();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void u(va.z2 z2Var, int i4) {
        this.f15075d = null;
        cl0 cl0Var = new cl0(i4);
        ne0 ne0Var = new ne0(this);
        ((ai) this.f15073b).e(z2Var, (String) this.f15074c, cl0Var, ne0Var);
    }

    public yp0 v() {
        return (yp0) ((dq0) this.f15073b).f10544b.f9452c;
    }

    public synchronized String w() {
        c60 c60Var;
        try {
            c60Var = (c60) this.f15075d;
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
            return null;
        }
        return c60Var != null ? c60Var.f9997a : null;
    }

    public void x(ar arVar) {
        ar adapterCreator;
        AtomicReference atomicReference = (AtomicReference) this.f15075d;
        if (!((Boolean) vl.f17642a.u()).booleanValue()) {
            while (!atomicReference.compareAndSet(null, arVar) && atomicReference.get() == null) {
            }
            return;
        }
        va.d1 d1Var = (va.d1) this.f15074c;
        if (d1Var == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = d1Var.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        if (adapterCreator == null) {
            adapterCreator = arVar;
        }
        while (!atomicReference.compareAndSet(null, adapterCreator) && atomicReference.get() == null) {
        }
    }

    public synchronized boolean y(br0 br0Var) {
        uq0 uq0Var = (uq0) ((ConcurrentHashMap) this.f15073b).get(br0Var);
        if (uq0Var == null) {
            return true;
        }
        zq0 zq0Var = (zq0) this.f15074c;
        uq0Var.a();
        return uq0Var.f17291a.size() < zq0Var.f19147e;
    }

    public synchronized String z() {
        c60 c60Var;
        try {
            c60Var = (c60) this.f15075d;
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
            return null;
        }
        return c60Var != null ? c60Var.f9997a : null;
    }

    public pq0(Context context, za.a aVar, li liVar, l90 l90Var) {
        this.f15072a = 20;
        this.f15073b = context;
        this.f15075d = aVar;
        this.f15074c = liVar;
    }

    public pq0(fr frVar) {
        this.f15072a = 8;
        this.f15073b = frVar;
    }

    public pq0(jr jrVar, ir irVar, lr lrVar) {
        this.f15072a = 15;
        this.f15074c = jrVar;
        this.f15075d = irVar;
        this.f15073b = lrVar;
    }

    @Override // com.google.android.gms.internal.ads.c80
    /* renamed from: c */
    public /* synthetic */ void mo162c(Object obj) {
        ((g60) obj).q((pu) this.f15073b, (String) this.f15074c, (String) this.f15075d);
    }

    public pq0(k10 k10Var, Context context, ex exVar) {
        this.f15072a = 18;
        this.f15074c = k10Var;
        this.f15073b = context;
        this.f15075d = exVar;
    }

    public pq0(dq0 dq0Var, wp0 wp0Var, String str) {
        this.f15072a = 12;
        this.f15073b = dq0Var;
        this.f15074c = wp0Var;
        this.f15075d = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public /* synthetic */ pq0(Object obj, Object obj2, Object obj3, int i4) {
        this.f15072a = i4;
        this.f15073b = obj2;
        this.f15074c = obj3;
        this.f15075d = obj;
    }

    public /* synthetic */ pq0(Object obj, Object obj2, Object obj3, boolean z3, int i4) {
        this.f15072a = i4;
        this.f15073b = obj;
        this.f15074c = obj2;
        this.f15075d = obj3;
    }

    public pq0(int i4) {
        this.f15072a = i4;
        switch (i4) {
            case 5:
                this.f15073b = new ArrayList();
                this.f15074c = new ArrayList();
                this.f15075d = new ArrayList();
                break;
            default:
                String str = bq0.f9768a;
                this.f15073b = new w(0, Executors.newSingleThreadExecutor(new cw("ExoPlayer:Loader:ProgressiveMediaPeriod")));
                break;
        }
    }

    public pq0(Context context, va.d1 d1Var) {
        this.f15072a = 0;
        this.f15075d = new AtomicReference();
        this.f15073b = context;
        this.f15074c = d1Var;
    }

    public pq0(ka0 ka0Var, qd0 qd0Var) {
        this.f15072a = 26;
        this.f15073b = ka0Var;
        uk0 uk0Var = new uk0(qd0Var);
        this.f15074c = uk0Var;
        this.f15075d = new zk0(uk0Var, ka0Var.f13095e);
    }

    public pq0(pq0 pq0Var, ex exVar) {
        this.f15072a = 27;
        this.f15075d = new tk0((byte) 0, 10);
        this.f15073b = pq0Var;
        this.f15074c = exVar;
    }

    public pq0(zq0 zq0Var) {
        this.f15072a = 28;
        this.f15073b = new ConcurrentHashMap(zq0Var.f19147e);
        this.f15074c = zq0Var;
        this.f15075d = new xq0();
    }

    public pq0(String str) {
        this.f15072a = 3;
        lw1 lw1Var = new lw1();
        lw1Var.d("video/mp2t");
        lw1Var.e(str);
        this.f15073b = new mx1(lw1Var);
    }

    public pq0(ArrayList arrayList) {
        this.f15072a = 2;
        this.f15073b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        int size = arrayList.size();
        this.f15074c = new long[size + size];
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            w7 w7Var = (w7) arrayList.get(i4);
            long[] jArr = (long[]) this.f15074c;
            int i10 = i4 + i4;
            jArr[i10] = w7Var.f17923b;
            jArr[i10 + 1] = w7Var.f17924c;
        }
        long[] jArr2 = (long[]) this.f15074c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f15075d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // pb.b
    public void S(int i4) {
    }
}
