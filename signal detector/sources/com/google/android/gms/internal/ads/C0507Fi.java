package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.C2841s;
import q2.C2852x0;
import q2.InterfaceC2806a;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Fi, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0507Fi implements InterfaceC1382jk, InterfaceC0441Bk, InterfaceC1921tk, InterfaceC2806a, InterfaceC1813rk, InterfaceC1868sl, InterfaceC0628Mk {

    /* renamed from: C, reason: collision with root package name */
    public final C0712Rj f8159C;

    /* renamed from: D, reason: collision with root package name */
    public final Set f8160D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8161E;

    /* renamed from: F, reason: collision with root package name */
    public final AtomicBoolean f8162F = new AtomicBoolean();

    /* renamed from: G, reason: collision with root package name */
    public T2.d f8163G = null;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8164a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f8165b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f8166c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f8167d;

    /* renamed from: e, reason: collision with root package name */
    public final Xt f8168e;

    /* renamed from: f, reason: collision with root package name */
    public final Qt f8169f;

    /* renamed from: g, reason: collision with root package name */
    public final C2148xv f8170g;

    /* renamed from: h, reason: collision with root package name */
    public final C1178fu f8171h;
    public final H6 i;

    /* renamed from: j, reason: collision with root package name */
    public final U9 f8172j;

    /* renamed from: k, reason: collision with root package name */
    public final WeakReference f8173k;

    /* renamed from: l, reason: collision with root package name */
    public final WeakReference f8174l;

    /* renamed from: m, reason: collision with root package name */
    public final C1338iu f8175m;

    /* renamed from: n, reason: collision with root package name */
    public final C0560Ik f8176n;

    public C0507Fi(Context context, C0623Mf c0623Mf, Executor executor, ScheduledExecutorService scheduledExecutorService, Xt xt, Qt qt, C2148xv c2148xv, C1178fu c1178fu, View view, InterfaceC0828Yg interfaceC0828Yg, H6 h6, U9 u9, C1338iu c1338iu, C0560Ik c0560Ik, C0712Rj c0712Rj, Set set) {
        this.f8164a = context;
        this.f8165b = c0623Mf;
        this.f8166c = executor;
        this.f8167d = scheduledExecutorService;
        this.f8168e = xt;
        this.f8169f = qt;
        this.f8170g = c2148xv;
        this.f8171h = c1178fu;
        this.i = h6;
        this.f8173k = new WeakReference(view);
        this.f8174l = new WeakReference(interfaceC0828Yg);
        this.f8172j = u9;
        this.f8175m = c1338iu;
        this.f8176n = c0560Ik;
        this.f8159C = c0712Rj;
        this.f8160D = set;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void F(BinderC2185ye binderC2185ye, String str, String str2) {
        Yt yt;
        Qt qt = this.f8169f;
        List list = qt.f10770h;
        C2148xv c2148xv = this.f8170g;
        c2148xv.getClass();
        ArrayList arrayList = new ArrayList();
        c2148xv.f17649h.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String str3 = binderC2185ye.f17728a;
            String string = Integer.toString(binderC2185ye.f17729b);
            boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.f8774k4)).booleanValue();
            QA ua = LA.f9634a;
            if (zBooleanValue) {
                Zt zt = c2148xv.f17648g;
                if (zt != null && (yt = zt.f12980a) != null) {
                    ua = new UA(yt);
                }
            } else {
                Yt yt2 = c2148xv.f17647f;
                if (yt2 != null) {
                    ua = new UA(yt2);
                }
            }
            String str4 = (String) ua.b(C1563n2.f15726s).a();
            String str5 = (String) ua.b(C1563n2.f15725r).a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC0933bL.b(C2148xv.c(C2148xv.c(C2148xv.c(C2148xv.c(C2148xv.c(C2148xv.c((String) it.next(), "@gw_rwd_userid@", Uri.encode(str4)), "@gw_rwd_custom_data@", Uri.encode(str5)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(str3)), "@gw_rwd_amt@", string), "@gw_sdkver@", c2148xv.f17643b), c2148xv.f17646e, qt.f10753W, qt.f10799w0));
            }
        } catch (RemoteException e6) {
            u2.k.f("Unable to determine award type and amount.", e6);
        }
        this.f8171h.a(arrayList, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void I() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void N() {
    }

    public final List a() {
        boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.Ec)).booleanValue();
        Qt qt = this.f8169f;
        if (zBooleanValue) {
            C2911G c2911g = p2.j.f22785C.f22790c;
            Context context = this.f8164a;
            if (C2911G.e(context)) {
                Object systemService = context.getSystemService("display");
                Integer numValueOf = systemService instanceof DisplayManager ? Integer.valueOf(((DisplayManager) systemService).getDisplays().length) : null;
                if (numValueOf != null) {
                    int iMin = Math.min(numValueOf.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = qt.f10762d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return qt.f10762d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void b() {
        Qt qt = this.f8169f;
        this.f8171h.a(this.f8170g.a(this.f8168e, qt, qt.f10768g), null);
    }

    public final void c(int i, int i3) {
        View view;
        if (i <= 0 || !((view = (View) this.f8173k.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            p();
        } else {
            this.f8167d.schedule(new RunnableC0490Ei(this, i, i3, 0), i3, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void d() {
        Qt qt = this.f8169f;
        this.f8171h.a(this.f8170g.a(this.f8168e, qt, qt.i), null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    public final synchronized void e() {
        C1338iu c1338iu;
        try {
            if (this.f8161E) {
                ArrayList arrayList = new ArrayList(a());
                Qt qt = this.f8169f;
                arrayList.addAll(qt.f10766f);
                this.f8171h.a(this.f8170g.b(this.f8168e, qt, true, null, null, arrayList, null, null), null);
            } else {
                C1178fu c1178fu = this.f8171h;
                C2148xv c2148xv = this.f8170g;
                Xt xt = this.f8168e;
                Qt qt2 = this.f8169f;
                c1178fu.a(c2148xv.a(xt, qt2, qt2.f10779m), null);
                if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8801o4)).booleanValue() && (c1338iu = this.f8175m) != null) {
                    List list = ((Qt) c1338iu.f14823c).f10779m;
                    String strF = ((C0702Qq) c1338iu.f14824d).f();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C2148xv.c((String) it.next(), "@gw_adnetstatus@", strF));
                    }
                    long jG = ((C0702Qq) c1338iu.f14824d).g();
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        arrayList3.add(C2148xv.c((String) obj, "@gw_ttr@", Long.toString(jG, 10)));
                    }
                    c1178fu.a(c2148xv.a((Xt) c1338iu.f14822b, (Qt) c1338iu.f14823c, arrayList3), null);
                }
                c1178fu.a(c2148xv.a(xt, qt2, qt2.f10766f), null);
            }
            this.f8161E = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1813rk
    public final void f(C2852x0 c2852x0) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8667S1)).booleanValue()) {
            int i = c2852x0.f23273a;
            ArrayList arrayList = new ArrayList();
            Qt qt = this.f8169f;
            for (String str : qt.f10783o) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(C2148xv.c(str, "@gw_mpe@", sb.toString()));
            }
            this.f8171h.a(this.f8170g.a(this.f8168e, qt, arrayList), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1868sl
    public final void j() {
        Qt qt = this.f8169f;
        this.f8171h.a(this.f8170g.a(this.f8168e, qt, qt.f10796u0), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.AbstractCollection, java.util.List] */
    @Override // com.google.android.gms.internal.ads.InterfaceC0628Mk
    public final void k() {
        Qt qt = this.f8169f;
        if (qt.f10764e == 4) {
            this.f8171h.a(this.f8170g.a(this.f8168e, qt, qt.f10725A0), null);
        }
    }

    @Override // q2.InterfaceC2806a
    public final void onAdClicked() {
        boolean zBooleanValue = ((Boolean) C2841s.f23267e.f23270c.a(H9.f8655Q0)).booleanValue();
        Xt xt = this.f8168e;
        if ((zBooleanValue && ((St) xt.f12510b.f15174c).f11275h) || !((Boolean) AbstractC1320ia.f14726d.v()).booleanValue()) {
            Qt qt = this.f8169f;
            this.f8171h.b(true == p2.j.f22785C.f22795h.k(this.f8164a) ? 2 : 1, this.f8170g.a(xt, qt, qt.f10760c));
        } else {
            U9 u9 = this.f8172j;
            u9.getClass();
            PC pcC = AbstractC1984ut.C(AbstractC2221zD.r((AbstractC2221zD) AbstractC1984ut.E(AbstractC2221zD.r(ED.f7928b), ((Long) AbstractC1320ia.f14725c.v()).longValue(), TimeUnit.MILLISECONDS, u9.f11616c)), Throwable.class, C1563n2.f15713e, AbstractC0640Nf.f10011g);
            pcC.a(new CD(pcC, 0, new Rx(13, this)), this.f8165b);
        }
    }

    public final void p() {
        int i;
        T2.d dVar;
        Qt qt = this.f8169f;
        List list = qt.f10762d;
        if (list == null || list.isEmpty()) {
            return;
        }
        E9 e9 = H9.Xe;
        C2841s c2841s = C2841s.f23267e;
        if (((Boolean) c2841s.f23270c.a(e9)).booleanValue() && this.f8163G == null) {
            C0572Jf c0572Jf = p2.j.f22785C.f22795h.f8970c;
            Set set = this.f8160D;
            String str = ((C0960bu) this.f8168e.f12509a.f10110b).f13485g;
            C0555If c0555If = c0572Jf.f9322d;
            synchronized (c0555If.f9113g) {
                try {
                    int i3 = c0555If.f9118m;
                    c0555If.f9118m = i3 + 1;
                    if (set.isEmpty()) {
                        dVar = new T2.d(i3, -1, -1, false);
                    } else {
                        TreeSet treeSet = new TreeSet(set);
                        StringBuilder sb = new StringBuilder();
                        Iterator it = treeSet.iterator();
                        if (it.hasNext()) {
                            CharSequence charSequence = (CharSequence) it.next();
                            while (true) {
                                sb.append(charSequence);
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((CharSequence) ",");
                                charSequence = (CharSequence) it.next();
                            }
                        }
                        String string = sb.toString();
                        HashMap map = c0555If.f9119n;
                        Integer num = (Integer) map.get(string);
                        int iIntValue = 0;
                        int iIntValue2 = num == null ? 0 : num.intValue();
                        map.put(string, Integer.valueOf(iIntValue2 + 1));
                        if (str == null) {
                            dVar = new T2.d(i3, iIntValue2, -1, false);
                        } else {
                            StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(string).length());
                            sb2.append(str);
                            sb2.append("|");
                            sb2.append(string);
                            String string2 = sb2.toString();
                            HashMap map2 = c0555If.f9120o;
                            Integer num2 = (Integer) map2.get(string2);
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            }
                            map2.put(string2, Integer.valueOf(iIntValue + 1));
                            dVar = new T2.d(i3, iIntValue2, iIntValue, false);
                        }
                    }
                } finally {
                }
            }
            this.f8163G = dVar;
        }
        String strI = ((Boolean) c2841s.f23270c.a(H9.f8767j4)).booleanValue() ? this.i.f8555b.i(this.f8164a, (View) this.f8173k.get(), null) : null;
        if ((((Boolean) c2841s.f23270c.a(H9.f8655Q0)).booleanValue() && ((St) this.f8168e.f12510b.f15174c).f11275h) || !((Boolean) AbstractC1320ia.f14730h.v()).booleanValue()) {
            this.f8171h.a(this.f8170g.b(this.f8168e, qt, false, strI, null, a(), this.f8159C, this.f8163G), this.f8176n);
            return;
        }
        if (((Boolean) AbstractC1320ia.f14729g.v()).booleanValue() && ((i = qt.f10759b) == 1 || i == 2 || i == 5)) {
        }
        AbstractC2221zD abstractC2221zD = (AbstractC2221zD) AbstractC1984ut.E(AbstractC2221zD.r(ED.f7928b), ((Long) c2841s.f23270c.a(H9.f8830t1)).longValue(), TimeUnit.MILLISECONDS, this.f8167d);
        abstractC2221zD.a(new CD(abstractC2221zD, 0, new C0889ae((Object) this, (Object) strI, 15, false)), this.f8165b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void v() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
    public final void z() {
        if (this.f8162F.compareAndSet(false, true)) {
            E9 e9 = H9.f8827s4;
            C2841s c2841s = C2841s.f23267e;
            G9 g9 = c2841s.f23270c;
            G9 g92 = c2841s.f23270c;
            int iIntValue = ((Integer) g9.a(e9)).intValue();
            if (iIntValue > 0) {
                c(iIntValue, ((Integer) g92.a(H9.f8833t4)).intValue());
            } else if (!((Boolean) g92.a(H9.f8820r4)).booleanValue()) {
                p();
            } else {
                this.f8166c.execute(new RunnableC0473Di(this, 0));
            }
        }
    }
}
