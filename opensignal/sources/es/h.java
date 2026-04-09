package es;

import java.util.List;
import rr.p0;

/* loaded from: classes.dex */
public final class h extends ht.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8306c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final gt.i f8307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ur.b f8308e;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(j jVar) {
        this.f8308e = jVar;
        cj.a aVar = jVar.F;
        super(((ds.a) aVar.f3974d).f7446a);
        gt.o oVar = ((ds.a) aVar.f3974d).f7446a;
        g gVar = new g(jVar, 0);
        gt.l lVar = (gt.l) oVar;
        lVar.getClass();
        this.f8307d = new gt.i(lVar, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020b  */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Collection] */
    @Override // ht.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection b() {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: es.h.b():java.util.Collection");
    }

    @Override // ht.h
    public final p0 d() {
        switch (this.f8306c) {
            case 0:
                return ((ds.a) ((j) this.f8308e).F.f3974d).f7456m;
            default:
                return p0.f21711g;
        }
    }

    @Override // ht.b
    /* renamed from: i */
    public final rr.f p() {
        switch (this.f8306c) {
            case 0:
                return (j) this.f8308e;
            default:
                return (ft.i) this.f8308e;
        }
    }

    @Override // ht.m0
    public final List o() {
        switch (this.f8306c) {
        }
        return (List) this.f8307d.c();
    }

    @Override // ht.b, ht.m0
    public final rr.i p() {
        switch (this.f8306c) {
            case 0:
                return (j) this.f8308e;
            default:
                return (ft.i) this.f8308e;
        }
    }

    @Override // ht.m0
    public final boolean r() {
        switch (this.f8306c) {
        }
        return true;
    }

    public final String toString() {
        switch (this.f8306c) {
            case 0:
                String strB = ((j) this.f8308e).getName().b();
                br.l.d(strB, "name.asString()");
                return strB;
            default:
                String str = ((ft.i) this.f8308e).getName().f21035a;
                br.l.d(str, "name.toString()");
                return str;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(ft.i iVar) {
        this.f8308e = iVar;
        al.b bVar = iVar.H;
        super(((dt.k) bVar.f810b).f7493a);
        gt.l lVar = ((dt.k) bVar.f810b).f7493a;
        ft.h hVar = new ft.h(iVar, 0);
        lVar.getClass();
        this.f8307d = new gt.i(lVar, hVar);
    }
}
