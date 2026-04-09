package a7;

import Y6.h;
import Y6.k;
import Y6.o;
import com.squareup.moshi.JsonDataException;

/* renamed from: a7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3768a extends h {

    /* renamed from: a, reason: collision with root package name */
    private final h f25733a;

    public C3768a(h hVar) {
        this.f25733a = hVar;
    }

    @Override // Y6.h
    public Object b(k kVar) {
        if (kVar.d0() != k.c.NULL) {
            return this.f25733a.b(kVar);
        }
        throw new JsonDataException("Unexpected null at " + kVar.getPath());
    }

    @Override // Y6.h
    public void j(o oVar, Object obj) {
        if (obj != null) {
            this.f25733a.j(oVar, obj);
            return;
        }
        throw new JsonDataException("Unexpected null at " + oVar.getPath());
    }

    public String toString() {
        return this.f25733a + ".nonNull()";
    }
}
