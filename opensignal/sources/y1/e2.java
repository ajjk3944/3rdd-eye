package y1;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e2 implements androidx.lifecycle.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bu.c f25671a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.b1 f25672d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.o1 f25673g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ br.w f25674r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ View f25675x;

    public e2(bu.c cVar, n0.b1 b1Var, n0.o1 o1Var, br.w wVar, View view) {
        this.f25671a = cVar;
        this.f25672d = b1Var;
        this.f25673g = o1Var;
        this.f25674r = wVar;
        this.f25675x = view;
    }

    @Override // androidx.lifecycle.t
    public final void b(androidx.lifecycle.v vVar, androidx.lifecycle.m mVar) {
        boolean z10;
        wt.f fVarS = null;
        switch (d2.f25667a[mVar.ordinal()]) {
            case 1:
                wt.w.s(this.f25671a, null, wt.v.UNDISPATCHED, new d4.f(this.f25674r, this.f25673g, vVar, this, this.f25675x, null), 1);
                return;
            case 2:
                n0.b1 b1Var = this.f25672d;
                if (b1Var != null) {
                    d8.a aVar = (d8.a) b1Var.f17136g;
                    synchronized (aVar.f7149c) {
                        try {
                            synchronized (aVar.f7149c) {
                                z10 = aVar.f7148b;
                            }
                            if (!z10) {
                                ArrayList arrayList = (ArrayList) aVar.f7147a;
                                aVar.f7147a = (ArrayList) aVar.f7150d;
                                aVar.f7150d = arrayList;
                                aVar.f7148b = true;
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    ((pq.c) arrayList.get(i10)).g(lq.b0.f15562a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                n0.o1 o1Var = this.f25673g;
                synchronized (o1Var.f17234b) {
                    if (o1Var.f17249s) {
                        o1Var.f17249s = false;
                        fVarS = o1Var.s();
                    }
                }
                if (fVarS != null) {
                    ((wt.g) fVarS).g(lq.b0.f15562a);
                    return;
                }
                return;
            case 3:
                n0.o1 o1Var2 = this.f25673g;
                synchronized (o1Var2.f17234b) {
                    o1Var2.f17249s = true;
                }
                return;
            case 4:
                this.f25673g.r();
                return;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return;
            default:
                throw new bf.n();
        }
    }
}
