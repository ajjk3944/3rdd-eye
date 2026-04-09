package com.squareup.picasso;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5932a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f5933b;

    /* renamed from: c, reason: collision with root package name */
    public final q f5934c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f5935d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f5936e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f5937f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f5938g;

    /* renamed from: h, reason: collision with root package name */
    public final l f5939h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f5940i;
    public final s j;
    public final n0 k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f5941l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f5942m;

    public n(Context context, i0 i0Var, Handler handler, q qVar, s sVar, n0 n0Var) {
        m mVar = new m("Picasso-Dispatcher", 10);
        mVar.start();
        yh.a aVar = new yh.a(mVar.getLooper(), 3, false);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
        this.f5932a = context;
        this.f5933b = i0Var;
        this.f5935d = new LinkedHashMap();
        this.f5936e = new WeakHashMap();
        this.f5937f = new WeakHashMap();
        this.f5938g = new HashSet();
        this.f5939h = new l(0, mVar.getLooper(), this);
        this.f5934c = qVar;
        this.f5940i = handler;
        this.j = sVar;
        this.k = n0Var;
        this.f5941l = new ArrayList(4);
        try {
            Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException unused) {
        }
        this.f5942m = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        a5.s sVar2 = new a5.s(this, 2, false);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        n nVar = (n) sVar2.f149b;
        if (nVar.f5942m) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        nVar.f5932a.registerReceiver(sVar2, intentFilter);
    }

    public final void a(f fVar) {
        Future future = fVar.I;
        if (future == null || !future.isCancelled()) {
            this.f5941l.add(fVar);
            l lVar = this.f5939h;
            if (lVar.hasMessages(7)) {
                return;
            }
            lVar.sendEmptyMessageDelayed(7, 200L);
        }
    }

    public final void b(f fVar) {
        l lVar = this.f5939h;
        lVar.sendMessage(lVar.obtainMessage(4, fVar));
    }

    public final void c(f fVar) {
        Object objD;
        b bVar = fVar.F;
        WeakHashMap weakHashMap = this.f5936e;
        if (bVar != null && (objD = bVar.d()) != null) {
            bVar.f5875g = true;
            weakHashMap.put(objD, bVar);
        }
        ArrayList arrayList = fVar.G;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar2 = (b) arrayList.get(i10);
                Object objD2 = bVar2.d();
                if (objD2 != null) {
                    bVar2.f5875g = true;
                    weakHashMap.put(objD2, bVar2);
                }
            }
        }
    }

    public final void d(f fVar, boolean z10) {
        fVar.f5883d.getClass();
        this.f5935d.remove(fVar.f5887y);
        a(fVar);
    }

    public final void e(b bVar, boolean z10) {
        b bVar2;
        f fVar;
        n nVar;
        b bVar3 = bVar.f5874f;
        k0 k0Var = bVar.f5870b;
        String str = bVar.f5873e;
        if (this.f5938g.contains(bVar3)) {
            this.f5937f.put(bVar.d(), bVar);
            return;
        }
        LinkedHashMap linkedHashMap = this.f5935d;
        f fVar2 = (f) linkedHashMap.get(str);
        if (fVar2 != null) {
            fVar2.f5883d.getClass();
            if (fVar2.F == null) {
                fVar2.F = bVar;
                return;
            }
            if (fVar2.G == null) {
                fVar2.G = new ArrayList(3);
            }
            fVar2.G.add(bVar);
            d0 d0Var = k0Var.f5923g;
            if (d0Var.ordinal() > fVar2.N.ordinal()) {
                fVar2.N = d0Var;
                return;
            }
            return;
        }
        ExecutorService executorService = this.f5933b;
        if (executorService.isShutdown()) {
            return;
        }
        f0 f0Var = bVar.f5869a;
        Object obj = f.O;
        List list = f0Var.f5889b;
        int size = list.size();
        int i10 = 0;
        while (true) {
            s sVar = this.j;
            n0 n0Var = this.k;
            if (i10 >= size) {
                bVar2 = bVar;
                nVar = this;
                fVar = new f(f0Var, nVar, sVar, n0Var, bVar2, f.R);
                break;
            } else {
                m0 m0Var = (m0) list.get(i10);
                if (m0Var.b(k0Var)) {
                    nVar = this;
                    bVar2 = bVar;
                    fVar = new f(f0Var, nVar, sVar, n0Var, bVar2, m0Var);
                    break;
                }
                i10++;
            }
        }
        fVar.I = executorService.submit(fVar);
        linkedHashMap.put(str, fVar);
        if (z10) {
            nVar.f5936e.remove(bVar2.d());
        }
    }
}
