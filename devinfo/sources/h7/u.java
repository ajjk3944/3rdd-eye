package h7;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u implements d, i7.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25010a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f25011b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f25012c;

    /* renamed from: d, reason: collision with root package name */
    public final i7.i f25013d;

    /* renamed from: e, reason: collision with root package name */
    public final i7.i f25014e;

    /* renamed from: f, reason: collision with root package name */
    public final i7.i f25015f;

    public u(n7.a aVar, m7.p pVar) {
        this.f25010a = pVar.f28952e;
        this.f25012c = pVar.f28948a;
        i7.i iVarG = pVar.f28949b.g();
        this.f25013d = iVarG;
        i7.i iVarG2 = pVar.f28950c.g();
        this.f25014e = iVarG2;
        i7.i iVarG3 = pVar.f28951d.g();
        this.f25015f = iVarG3;
        aVar.e(iVarG);
        aVar.e(iVarG2);
        aVar.e(iVarG3);
        iVarG.a(this);
        iVarG2.a(this);
        iVarG3.a(this);
    }

    @Override // i7.a
    public final void a() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f25011b;
            if (i4 >= arrayList.size()) {
                return;
            }
            ((i7.a) arrayList.get(i4)).a();
            i4++;
        }
    }

    public final void e(i7.a aVar) {
        this.f25011b.add(aVar);
    }

    @Override // h7.d
    public final void c(List list, List list2) {
    }
}
