package bf;

import java.util.Set;

/* loaded from: classes.dex */
public interface d {
    default Object a(Class cls) {
        return i(u.a(cls));
    }

    s d(u uVar);

    eg.b e(u uVar);

    default eg.b g(Class cls) {
        return k(u.a(cls));
    }

    default Object i(u uVar) {
        eg.b bVarK = k(uVar);
        if (bVarK == null) {
            return null;
        }
        return bVarK.get();
    }

    eg.b k(u uVar);

    default Set m(u uVar) {
        return (Set) e(uVar).get();
    }

    default s r(Class cls) {
        return d(u.a(cls));
    }
}
