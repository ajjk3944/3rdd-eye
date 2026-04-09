package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class S4 implements Xa, Nl, Za {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40087a;

    /* renamed from: b, reason: collision with root package name */
    public final C4759l5 f40088b;

    /* renamed from: c, reason: collision with root package name */
    public final C5108ym f40089c;

    /* renamed from: d, reason: collision with root package name */
    public final Kh f40090d;

    /* renamed from: e, reason: collision with root package name */
    public final Z4 f40091e;

    /* renamed from: f, reason: collision with root package name */
    public final C4648gn f40092f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f40093g;

    /* renamed from: h, reason: collision with root package name */
    public final C4785m5 f40094h;
    public final C5052wg i;

    /* renamed from: j, reason: collision with root package name */
    public final C4862p4 f40095j;

    /* renamed from: k, reason: collision with root package name */
    public final Bg f40096k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f40097l;

    public S4(Context context, El el, C4759l5 c4759l5, K4 k42, C5052wg c5052wg) {
        this(context, el, c4759l5, k42, new Kh(k42.f39709b), c5052wg, new C4785m5(), new U4(), new Bg());
    }

    public static void b(K4 k42) {
        Ga.f39501F.b().b(!Boolean.FALSE.equals(k42.f39709b.f39681n));
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(J4 j4) {
        Kh kh = this.f40090d;
        kh.f39721a = kh.f39721a.mergeFrom(j4);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.COMMUTATION;
    }

    public final J4 d() {
        return this.f40090d.f39721a;
    }

    public final C5052wg e() {
        return this.i;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final Context getContext() {
        return this.f40087a;
    }

    public S4(Context context, El el, C4759l5 c4759l5, K4 k42, Kh kh, C5052wg c5052wg, C4785m5 c4785m5, U4 u42, Bg bg) {
        this.f40093g = new ArrayList();
        this.f40097l = new Object();
        Context applicationContext = context.getApplicationContext();
        this.f40087a = applicationContext;
        this.f40088b = c4759l5;
        this.f40090d = kh;
        this.f40094h = c4785m5;
        this.f40091e = U4.a(this);
        b(k42);
        C5108ym c5108ymA = el.a(applicationContext, c4759l5, k42.f39708a);
        this.f40089c = c5108ymA;
        this.f40095j = AbstractC4888q4.a(c5108ymA, Ga.j().b());
        this.f40092f = u42.a(this, c5108ymA);
        this.i = c5052wg;
        this.f40096k = bg;
        el.a(c4759l5, this);
    }

    public final synchronized void a(P4 p42) {
        this.f40094h.f41239a.add(p42);
        T6.a(p42.f39955c, this.f40095j.a(Dm.a(this.f40089c.e().f40650l)));
    }

    public final synchronized void b(P4 p42) {
        this.f40094h.f41239a.remove(p42);
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final C4759l5 b() {
        return this.f40088b;
    }

    public final void a(C4683i6 c4683i6, P4 p42) {
        Z4 z42 = this.f40091e;
        z42.getClass();
        z42.a(c4683i6, new Y4(p42));
    }

    @Override // io.appmetrica.analytics.impl.Nl
    public final void a(Gl gl, C4544cm c4544cm) {
        synchronized (this.f40097l) {
            try {
                Iterator it = this.f40093g.iterator();
                while (it.hasNext()) {
                    C4895qb c4895qb = (C4895qb) it.next();
                    T6.a(c4895qb.f41472a, gl, this.f40095j.a(c4895qb.f41474c));
                }
                this.f40093g.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Nl
    public final void a(C4544cm c4544cm) {
        synchronized (this.f40097l) {
            try {
                Iterator it = this.f40094h.f41239a.iterator();
                while (it.hasNext()) {
                    P4 p42 = (P4) it.next();
                    T6.a(p42.f39955c, this.f40095j.a(Dm.a(c4544cm.f40650l)));
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f40093g.iterator();
                while (it2.hasNext()) {
                    C4895qb c4895qb = (C4895qb) it2.next();
                    if (Zl.a(c4544cm, c4895qb.f41473b, c4895qb.f41474c, new C4843ob())) {
                        T6.a(c4895qb.f41472a, this.f40095j.a(c4895qb.f41474c));
                    } else {
                        arrayList.add(c4895qb);
                    }
                }
                this.f40093g = new ArrayList(arrayList);
                if (!arrayList.isEmpty()) {
                    this.f40092f.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(C4895qb c4895qb) {
        ResultReceiver resultReceiver;
        HashMap map;
        List<String> list;
        HashMap map2 = new HashMap();
        if (c4895qb != null) {
            list = c4895qb.f41473b;
            resultReceiver = c4895qb.f41472a;
            map = c4895qb.f41474c;
        } else {
            resultReceiver = null;
            map = map2;
            list = null;
        }
        boolean zA = this.f40089c.a(list, map);
        if (!zA) {
            T6.a(resultReceiver, this.f40095j.a(map));
        }
        if (!this.f40089c.g()) {
            if (zA) {
                T6.a(resultReceiver, this.f40095j.a(map));
                return;
            }
            return;
        }
        synchronized (this.f40097l) {
            if (zA && c4895qb != null) {
                try {
                    this.f40093g.add(c4895qb);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f40092f.c();
    }

    public final void a(ResultReceiver resultReceiver) {
        this.f40096k.a(new R4(resultReceiver));
    }

    public final C4862p4 a() {
        return this.f40095j;
    }

    @Override // io.appmetrica.analytics.impl.Za
    public final void a(K4 k42) {
        this.f40089c.a(k42.f39708a);
        a(k42.f39709b);
    }
}
