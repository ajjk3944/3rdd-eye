package ej;

import android.util.Log;
import androidx.lifecycle.e1;
import androidx.lifecycle.l0;
import androidx.lifecycle.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m extends e1 {

    /* renamed from: b, reason: collision with root package name */
    public final jj.f f23519b = new jj.f(y0.g(this));

    /* renamed from: c, reason: collision with root package name */
    public final jj.d f23520c = new jj.d(y0.g(this));

    /* renamed from: d, reason: collision with root package name */
    public final jj.d f23521d = new jj.d(y0.g(this));

    /* renamed from: e, reason: collision with root package name */
    public final jj.d f23522e = new jj.d(y0.g(this));

    /* renamed from: f, reason: collision with root package name */
    public final l0 f23523f;
    public final l0 g;

    /* renamed from: h, reason: collision with root package name */
    public final wi.e f23524h;

    /* renamed from: i, reason: collision with root package name */
    public final wi.e f23525i;
    public final wi.e j;

    /* renamed from: k, reason: collision with root package name */
    public final wi.e f23526k;

    /* renamed from: l, reason: collision with root package name */
    public final l0 f23527l;

    /* renamed from: m, reason: collision with root package name */
    public final l0 f23528m;

    /* renamed from: n, reason: collision with root package name */
    public final lj.e f23529n;

    /* renamed from: o, reason: collision with root package name */
    public final j f23530o;

    /* JADX WARN: Type inference failed for: r1v4, types: [ej.j] */
    public m(String str) {
        l0 l0Var = new l0();
        this.f23523f = l0Var;
        this.g = l0Var;
        wi.e eVar = new wi.e();
        this.f23524h = eVar;
        this.f23525i = eVar;
        wi.e eVar2 = new wi.e();
        this.j = eVar2;
        this.f23526k = eVar2;
        l0 l0Var2 = new l0();
        this.f23527l = l0Var2;
        this.f23528m = l0Var2;
        ((p6.i) jm.a.f27720a.f1137e).getClass();
        lj.e eVar3 = new lj.e();
        this.f23529n = eVar3;
        this.f23530o = new aj.a() { // from class: ej.j
            @Override // aj.a
            public final void a(long j, boolean z3, aj.b bVar) {
                this.f23515a.j.h(u.f37649a);
            }
        };
        eVar3.g = new ca.b(8, this);
        if (eVar3.f28836d == null) {
            eVar3.f28836d = new kj.b(str);
        }
        StringBuilder sbA = d.h.A("startAnalyze: ", str, ", status is ");
        sbA.append(eVar3.j);
        Log.d("AbsAnalyzerTask", sbA.toString());
        int i4 = eVar3.j;
        if (i4 == 3 && eVar3.f28841k != null) {
            Log.d("AbsAnalyzerTask", "startAnalyze: finished, use result direct");
            eVar3.f28839h.post(new lj.a(eVar3, 0));
        } else if (i4 == 1) {
            Log.d("AbsAnalyzerTask", "startAnalyze: running, skip");
        } else {
            Log.d("AbsAnalyzerTask", "startAnalyze: start new task");
            new Thread(new k1.b(6, eVar3, str)).start();
        }
    }

    @Override // androidx.lifecycle.e1
    public final void d() {
        lj.e eVar = this.f23529n;
        eVar.f28840i = true;
        eVar.j = 2;
        aj.g gVar = eVar.f28843m;
        if (gVar != null) {
            gVar.f421b = true;
        }
        kj.f fVar = (kj.f) this.f23523f.d();
        if (fVar != null) {
            fVar.f28361a.e(this.f23530o);
            kj.e eVar2 = fVar.f28365e;
            if (eVar2 != null) {
                eVar2.g = true;
                synchronized (kj.e.class) {
                    try {
                        Iterator it = eVar2.f28354b.entrySet().iterator();
                        while (it.hasNext()) {
                            Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
                            while (it2.hasNext()) {
                                ((aj.b) it2.next()).e(eVar2);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                eVar2.f28354b.clear();
                eVar2.f28355c.clear();
                eVar2.f28356d.clear();
                eVar2.f28353a.clear();
            }
            kj.a aVar = fVar.f28364d;
            if (aVar != null) {
                ArrayList arrayList = aVar.f28342c;
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((aj.b) obj).e(aVar);
                }
                arrayList.clear();
            }
        }
    }
}
