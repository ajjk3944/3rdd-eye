package androidx.lifecycle;

/* loaded from: classes.dex */
public interface t0 {
    default s0 j(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default s0 o(ir.d dVar, v4.c cVar) {
        br.l.e(dVar, "modelClass");
        return y(ir.f0.D(dVar), cVar);
    }

    default s0 y(Class cls, v4.c cVar) {
        return j(cls);
    }
}
