package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public interface p61 {
    default m61 b(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default m61 h(Class cls, mf0 mf0Var) {
        return b(cls);
    }

    default m61 l(hf hfVar, mf0 mf0Var) {
        return h(m54.h(hfVar), mf0Var);
    }
}
