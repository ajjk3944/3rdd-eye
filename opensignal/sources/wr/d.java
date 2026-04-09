package wr;

import br.l;
import dt.m;
import java.util.ArrayList;
import xr.s;

/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: b, reason: collision with root package name */
    public static final d f24591b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final d f24592c = new d();

    public f a(hs.c cVar) {
        l.e(cVar, "javaElement");
        return new f((s) cVar);
    }

    @Override // dt.m
    public void b(rr.f fVar, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + fVar.getName() + ", unresolved classes " + arrayList);
    }

    @Override // dt.m
    public void c(rr.d dVar) {
        l.e(dVar, "descriptor");
        throw new IllegalStateException("Cannot infer visibility for " + dVar);
    }
}
