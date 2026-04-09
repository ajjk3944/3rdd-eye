package ck;

import java.io.Serializable;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i implements h, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2898a = new i();

    @Override // ck.h
    public final h L(g gVar) {
        k.e(gVar, "key");
        return this;
    }

    @Override // ck.h
    public final f O(g gVar) {
        k.e(gVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // ck.h
    public final h y(h hVar) {
        k.e(hVar, "context");
        return hVar;
    }

    @Override // ck.h
    public final Object G(Object obj, mk.e eVar) {
        return obj;
    }
}
