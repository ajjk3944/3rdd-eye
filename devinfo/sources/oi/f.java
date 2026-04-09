package oi;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.f1;
import androidx.lifecycle.i1;
import androidx.recyclerview.widget.m;
import b5.d1;
import b7.l;
import b7.r;
import cl.u;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.ads.xz;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.play_billing.m1;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import h3.k;
import j1.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;
import km.o;
import me.t1;
import sh.m0;
import sh.n0;
import t6.i0;
import t6.v;
import u6.a0;
import u6.c0;
import w4.j;
import w4.n;
import xk.a1;
import xk.g0;
import xk.x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30567c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30568d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i4) {
        this.f30565a = i4;
        this.f30566b = obj;
        this.f30567c = obj2;
        this.f30568d = obj3;
    }

    private final void a() {
        o oVar = (o) this.f30566b;
        u6.h hVar = (u6.h) this.f30567c;
        i0.f fVar = (i0.f) this.f30568d;
        u6.c cVar = (u6.c) oVar.f28445a;
        cVar.getClass();
        l lVar = hVar.f35152a;
        String str = lVar.f2007a;
        ArrayList arrayList = new ArrayList();
        r rVar = (r) cVar.f35127e.n(new ee.f(cVar, arrayList, str, 1));
        if (rVar == null) {
            v.e().h(u6.c.f35122l, "Didn't find WorkSpec for id " + lVar);
            cVar.h(lVar);
            return;
        }
        synchronized (cVar.f35131k) {
            try {
                if (cVar.f(str)) {
                    Set set = (Set) cVar.f35129h.get(str);
                    if (((u6.h) set.iterator().next()).f35152a.f2008b == lVar.f2008b) {
                        set.add(hVar);
                        v.e().a(u6.c.f35122l, "Work " + lVar + " is already enqueued for processing");
                    } else {
                        cVar.h(lVar);
                    }
                    return;
                }
                if (rVar.f2047t != lVar.f2008b) {
                    cVar.h(lVar);
                    return;
                }
                xz xzVar = new xz(cVar.f35124b, cVar.f35125c, cVar.f35126d, cVar, cVar.f35127e, rVar, arrayList);
                if (fVar != null) {
                    xzVar.f18590h = fVar;
                }
                c0 c0Var = new c0(xzVar);
                xk.r rVar2 = (xk.r) c0Var.f35136e.f145b;
                a1 a1VarC = x.c();
                rVar2.getClass();
                k kVarV = t1.v(wd.b.O(rVar2, a1VarC), new a0(c0Var, null, 1));
                kVarV.f24839b.a(new f(cVar, kVarV, c0Var, 9), (d7.b) cVar.f35126d.f147d);
                cVar.g.put(str, c0Var);
                HashSet hashSet = new HashSet();
                hashSet.add(hVar);
                cVar.f35129h.put(str, hashSet);
                v.e().a(u6.c.f35122l, u6.c.class.getSimpleName() + ": processing " + lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        d8.h hVar = (d8.h) this.f30566b;
        m1 m1Var = (m1) this.f30567c;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f30568d;
        try {
            w4.o oVarD = d5.d(hVar.f22020b);
            if (oVarD == null) {
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            }
            n nVar = (n) ((w4.h) oVarD.f34288b);
            synchronized (nVar.f36448d) {
                nVar.f36450f = threadPoolExecutor;
            }
            ((w4.h) oVarD.f34288b).b(new j(m1Var, threadPoolExecutor));
        } catch (Throwable th2) {
            m1Var.y(th2);
            threadPoolExecutor.shutdown();
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws PackageManager.NameNotFoundException {
        androidx.lifecycle.v vVar;
        ck.c cVar;
        boolean zBooleanValue = true;
        int i4 = 0;
        byte b10 = 0;
        byte b11 = 0;
        switch (this.f30565a) {
            case 0:
                bi.d.b(new c((View) this.f30568d, t1.h((Context) this.f30566b, (int) ((vg.c) this.f30567c).f36225e, 6.0f), 1));
                return;
            case 1:
                pa.i iVar = (pa.i) this.f30566b;
                pi.g gVar = (pi.g) this.f30567c;
                pi.a aVar = (pi.a) this.f30568d;
                if (iVar.getParent() != null) {
                    gVar.y();
                    if (ci.b.j != null) {
                        j6.i.q(aVar);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((si.e) this.f30566b).a(new o(b10 == true ? 1 : 0, (f1) this.f30567c, ((ri.f) this.f30568d).f32973a));
                return;
            case 3:
                String str = (String) this.f30566b;
                f1 f1Var = (f1) this.f30567c;
                yb.e eVar = (yb.e) this.f30568d;
                u uVar = new u(4);
                uVar.f2942b = str;
                ((t7.a) f1Var.f1134b).b(uVar, new lf.e(10, eVar));
                return;
            case 4:
                f1 f1Var2 = (f1) this.f30566b;
                t7.c cVar2 = (t7.c) this.f30567c;
                List list = (List) this.f30568d;
                Iterator it = ((CopyOnWriteArrayList) f1Var2.f1138f).iterator();
                while (it.hasNext()) {
                    ((t7.h) it.next()).a(cVar2, list);
                }
                return;
            case 5:
                si.a aVar2 = (si.a) this.f30566b;
                String str2 = (String) this.f30567c;
                Purchase purchase = (Purchase) this.f30568d;
                nk.k.b(str2);
                String strB = purchase.b();
                nk.k.d(strB, "getPurchaseToken(...)");
                aVar2.g(new si.c(str2, strB, purchase.f3001c.optBoolean("autoRenewing")));
                return;
            case 6:
                fb.r rVar = (fb.r) this.f30566b;
                qg.d dVar = (qg.d) this.f30567c;
                q qVar = (q) this.f30568d;
                sh.a0 a0Var = (sh.a0) rVar.f23968c;
                if (a0Var.c0()) {
                    return;
                }
                a0Var.f33630m0.setVisibility(0);
                a0Var.f33630m0.addView((LinearLayout) dVar.f32338h);
                a0Var.f33628k0 = qVar;
                qVar.a(a0Var.f33629l0);
                ((TextView) ((qg.d) a0Var.f33628k0.f27058a).f32343n).setText(a0Var.f33631n0);
                return;
            case 7:
                n0 n0Var = (n0) this.f30566b;
                TextView textView = (TextView) this.f30567c;
                List list2 = (List) this.f30568d;
                if (n0Var.c0()) {
                    return;
                }
                n0Var.Z.findViewById(R.id.progress).setVisibility(8);
                textView.setText(list2.size() + " " + DeviceInfoApp.f21145f.getString(R.string.sensors_are_available));
                n0Var.f33739a0.setAdapter(new m0(n0Var, list2));
                return;
            case 8:
                d2.b bVar = (d2.b) this.f30566b;
                ti.l lVar = (ti.l) this.f30567c;
                long[] jArr = (long[]) this.f30568d;
                bVar.getClass();
                lVar.a(jArr[0], ((ti.k) bVar.f21940c).f34684e.f23043d);
                return;
            case 9:
                u6.c cVar3 = (u6.c) this.f30566b;
                k kVar = (k) this.f30567c;
                c0 c0Var = (c0) this.f30568d;
                cVar3.getClass();
                try {
                    zBooleanValue = ((Boolean) kVar.f24839b.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (cVar3.f35131k) {
                    try {
                        l lVarH = d5.h(c0Var.f35132a);
                        String str3 = lVarH.f2007a;
                        if (cVar3.d(str3) == c0Var) {
                            cVar3.b(str3);
                        }
                        v.e().a(u6.c.f35122l, u6.c.class.getSimpleName() + " " + str3 + " executed; reschedule = " + zBooleanValue);
                        ArrayList arrayList = cVar3.j;
                        int size = arrayList.size();
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            i4++;
                            ((u6.a) obj).e(lVarH, zBooleanValue);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 10:
                a();
                return;
            case 11:
                b();
                return;
            case 12:
                se.b bVar2 = (se.b) this.f30566b;
                i.e eVar2 = (i.e) this.f30567c;
                View view = (View) this.f30568d;
                Context context = (Context) bVar2.f33556a;
                LinkedList linkedList = new LinkedList();
                for (String str4 : (List) bVar2.f33557b) {
                    if (((context instanceof Activity) && i0.l((Activity) context)) || !eVar2.isShowing()) {
                        return;
                    }
                    wj.b bVarA = wj.b.a(context, str4);
                    if (bVarA != null) {
                        linkedList.add(bVarA);
                    }
                }
                Collections.sort(linkedList, new m(21));
                new Handler(Looper.getMainLooper()).post(new f(bVar2, linkedList, view, 13));
                return;
            case 13:
                se.b bVar3 = (se.b) this.f30566b;
                LinkedList linkedList2 = (LinkedList) this.f30567c;
                View view2 = (View) this.f30568d;
                ArrayList arrayList2 = (ArrayList) bVar3.f33558c;
                arrayList2.clear();
                arrayList2.addAll(linkedList2);
                ((ej.e) bVar3.f33559d).notifyDataSetChanged();
                view2.setVisibility(8);
                return;
            default:
                xg.g gVar2 = (xg.g) this.f30566b;
                View view3 = (View) this.f30568d;
                mk.a aVar3 = (mk.a) this.f30567c;
                gVar2.f37105t0 = true;
                if (view3.isPressed()) {
                    d1 d1VarV = gVar2.v();
                    d1VarV.d();
                    androidx.lifecycle.c0 c0Var2 = d1VarV.f1774e;
                    nk.k.e(c0Var2, "<this>");
                    i1 i1Var = c0Var2.f1186a;
                    while (true) {
                        vVar = (androidx.lifecycle.v) ((AtomicReference) i1Var.f1151a).get();
                        cVar = null;
                        if (vVar == null) {
                            xk.m1 m1VarD = x.d();
                            el.e eVar3 = g0.f37189a;
                            vVar = new androidx.lifecycle.v(c0Var2, wd.b.O(m1VarD, cl.o.f2935a.f37658f));
                            AtomicReference atomicReference = (AtomicReference) i1Var.f1151a;
                            while (!atomicReference.compareAndSet(null, vVar)) {
                                if (atomicReference.get() != null) {
                                    break;
                                }
                            }
                            el.e eVar4 = g0.f37189a;
                            x.v(vVar, cl.o.f2935a.f37658f, null, new androidx.lifecycle.u(vVar, cVar, b11 == true ? 1 : 0), 2);
                        }
                    }
                    gVar2.f37103r0 = x.v(vVar, null, null, new pf.n(view3, aVar3, cVar, 12), 3);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.f30565a = i4;
        this.f30566b = obj;
        this.f30567c = obj2;
        this.f30568d = obj3;
    }

    public /* synthetic */ f(xg.g gVar, View view, mk.a aVar) {
        this.f30565a = 14;
        this.f30566b = gVar;
        this.f30568d = view;
        this.f30567c = aVar;
    }
}
