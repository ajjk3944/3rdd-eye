package a7;

import Y6.h;
import Y6.k;
import Y6.o;

/* renamed from: a7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3769b extends h {

    /* renamed from: a, reason: collision with root package name */
    private final h f25734a;

    public C3769b(h hVar) {
        this.f25734a = hVar;
    }

    @Override // Y6.h
    public Object b(k kVar) {
        return kVar.d0() == k.c.NULL ? kVar.T() : this.f25734a.b(kVar);
    }

    @Override // Y6.h
    public void j(o oVar, Object obj) {
        if (obj == null) {
            oVar.P();
        } else {
            this.f25734a.j(oVar, obj);
        }
    }

    public String toString() {
        return this.f25734a + ".nullSafe()";
    }
}
