package Yi;

import Vi.InterfaceC3627a;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public interface e {
    byte D();

    short F();

    float G();

    double I();

    c c(Xi.f fVar);

    int e(Xi.f fVar);

    boolean f();

    char g();

    e l(Xi.f fVar);

    int n();

    Void r();

    String s();

    default Object t(InterfaceC3627a deserializer) {
        AbstractC6492s.i(deserializer, "deserializer");
        return deserializer.c(this);
    }

    long v();

    boolean y();
}
