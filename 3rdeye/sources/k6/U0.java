package K6;

import N7.C1139d9;
import N7.C1154e9;
import c9.C2096q;
import c9.C2097r;
import s6.i;
import x9.C5786d;

/* compiled from: DivSelectBinder.kt */
/* loaded from: classes.dex */
public final class U0 implements i.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1139d9 f3343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O6.w f3344c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q6.c f3345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ A7.d f3346e;

    public U0(C1139d9 c1139d9, O6.w wVar, Q6.c cVar, A7.d dVar) {
        this.f3343b = c1139d9;
        this.f3344c = wVar;
        this.f3345d = cVar;
        this.f3346e = dVar;
    }

    @Override // s6.i.a
    public final void b(Object obj) {
        String strA;
        String str = (String) obj;
        C2096q c2096qJ0 = C2097r.j0(this.f3343b.f8077A);
        A7.d dVar = this.f3346e;
        C5786d.a aVar = new C5786d.a(x9.l.F(c2096qJ0, new T0(dVar, str)));
        boolean zHasNext = aVar.hasNext();
        Q6.c cVar = this.f3345d;
        if (zHasNext) {
            C1139d9.a aVar2 = (C1139d9.a) aVar.next();
            if (aVar.hasNext()) {
                cVar.f11320d.add(new Throwable(C1154e9.i("Multiple options found with value = \"", str, "\", selecting first one")));
                cVar.b();
            }
            A7.b<String> bVar = aVar2.f8122a;
            if (bVar == null) {
                bVar = aVar2.f8123b;
            }
            strA = bVar.a(dVar);
        } else {
            cVar.f11320d.add(new Throwable(androidx.work.s.e("No option found with value = \"", str, '\"')));
            cVar.b();
            strA = "";
        }
        this.f3344c.setText(strA);
    }

    @Override // s6.i.a
    public final void c(i.b bVar) {
        this.f3344c.setValueUpdater(bVar);
    }
}
