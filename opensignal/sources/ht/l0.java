package ht;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10921a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10922b;

    /* renamed from: c, reason: collision with root package name */
    public final jt.b f10923c;

    /* renamed from: d, reason: collision with root package name */
    public final jt.e f10924d;

    /* renamed from: e, reason: collision with root package name */
    public final jt.f f10925e;

    /* renamed from: f, reason: collision with root package name */
    public int f10926f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayDeque f10927g;

    /* renamed from: h, reason: collision with root package name */
    public rt.h f10928h;

    public l0(boolean z10, boolean z11, jt.b bVar, jt.e eVar, jt.f fVar) {
        br.l.e(bVar, "typeSystemContext");
        br.l.e(eVar, "kotlinTypePreparator");
        br.l.e(fVar, "kotlinTypeRefiner");
        this.f10921a = z10;
        this.f10922b = z11;
        this.f10923c = bVar;
        this.f10924d = eVar;
        this.f10925e = fVar;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f10927g;
        br.l.b(arrayDeque);
        arrayDeque.clear();
        rt.h hVar = this.f10928h;
        br.l.b(hVar);
        hVar.clear();
    }

    public final void b() {
        if (this.f10927g == null) {
            this.f10927g = new ArrayDeque(4);
        }
        if (this.f10928h == null) {
            this.f10928h = new rt.h();
        }
    }

    public final c1 c(lt.d dVar) {
        br.l.e(dVar, "type");
        return this.f10924d.z(dVar);
    }

    public final x d(lt.d dVar) {
        br.l.e(dVar, "type");
        this.f10925e.getClass();
        return (x) dVar;
    }
}
