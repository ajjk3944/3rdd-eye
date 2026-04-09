package rs;

import java.io.Serializable;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class p extends b implements Serializable {
    public static o g(b bVar, b bVar2, int i10, j0 j0Var, Class cls) {
        return new o(bVar, Collections.EMPTY_LIST, bVar2, new n(i10, j0Var, true), cls);
    }

    public static o h(b bVar, Object obj, b bVar2, int i10, j0 j0Var, Class cls) {
        return new o(bVar, obj, bVar2, new n(i10, j0Var, false), cls);
    }
}
