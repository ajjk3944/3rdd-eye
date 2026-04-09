package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* compiled from: Schema.java */
/* loaded from: classes.dex */
public interface f0<T> {
    void a(T t10, e0 e0Var, C1737o c1737o) throws IOException;

    int b(AbstractC1723a abstractC1723a);

    void c(AbstractC1744w abstractC1744w, AbstractC1744w abstractC1744w2);

    int d(AbstractC1744w abstractC1744w);

    void e(T t10, t0 t0Var) throws IOException;

    boolean f(AbstractC1744w abstractC1744w, AbstractC1744w abstractC1744w2);

    boolean isInitialized(T t10);

    void makeImmutable(T t10);

    T newInstance();
}
