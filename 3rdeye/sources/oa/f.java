package oa;

import ma.p;

/* compiled from: DateTimePrintContext.java */
/* loaded from: classes3.dex */
public final class f extends I9.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ na.b f44927b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44928c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na.g f44929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f44930e;

    public f(na.b bVar, qa.e eVar, na.g gVar, p pVar) {
        this.f44927b = bVar;
        this.f44928c = eVar;
        this.f44929d = gVar;
        this.f44930e = pVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qa.e] */
    @Override // qa.e
    public final long getLong(qa.h hVar) {
        na.b bVar = this.f44927b;
        return (bVar == null || !hVar.isDateBased()) ? this.f44928c.getLong(hVar) : bVar.getLong(hVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qa.e] */
    @Override // qa.e
    public final boolean isSupported(qa.h hVar) {
        na.b bVar = this.f44927b;
        return (bVar == null || !hVar.isDateBased()) ? this.f44928c.isSupported(hVar) : bVar.isSupported(hVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, qa.e] */
    @Override // I9.g, qa.e
    public final <R> R query(qa.j<R> jVar) {
        return jVar == qa.i.f45476b ? (R) this.f44929d : jVar == qa.i.f45475a ? (R) this.f44930e : jVar == qa.i.f45477c ? (R) this.f44928c.query(jVar) : jVar.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, qa.e] */
    @Override // I9.g, qa.e
    public final qa.m range(qa.h hVar) {
        na.b bVar = this.f44927b;
        return (bVar == null || !hVar.isDateBased()) ? this.f44928c.range(hVar) : bVar.range(hVar);
    }
}
