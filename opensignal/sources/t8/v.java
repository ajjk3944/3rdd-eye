package t8;

import java.util.ArrayList;
import java.util.List;
import z8.w;

/* loaded from: classes.dex */
public final class v implements c, u8.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22659a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22660b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final w f22661c;

    /* renamed from: d, reason: collision with root package name */
    public final u8.h f22662d;

    /* renamed from: e, reason: collision with root package name */
    public final u8.h f22663e;

    /* renamed from: f, reason: collision with root package name */
    public final u8.h f22664f;

    public v(a9.b bVar, z8.n nVar) {
        this.f22659a = nVar.f26753d;
        this.f22661c = (w) nVar.f26751b;
        u8.h hVarE0 = nVar.f26752c.E0();
        this.f22662d = hVarE0;
        u8.h hVarE02 = ((y8.b) nVar.f26754e).E0();
        this.f22663e = hVarE02;
        u8.h hVarE03 = ((y8.b) nVar.f26755f).E0();
        this.f22664f = hVarE03;
        bVar.e(hVarE0);
        bVar.e(hVarE02);
        bVar.e(hVarE03);
        hVarE0.a(this);
        hVarE02.a(this);
        hVarE03.a(this);
    }

    @Override // u8.a
    public final void a() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f22660b;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((u8.a) arrayList.get(i10)).a();
            i10++;
        }
    }

    public final void c(u8.a aVar) {
        this.f22660b.add(aVar);
    }

    @Override // t8.c
    public final void b(List list, List list2) {
    }
}
