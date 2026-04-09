package kotlin.sequences;

import java.util.Iterator;
import y8.s;

/* loaded from: classes4.dex */
public abstract class i {
    public abstract Object a(Object obj, c9.c cVar);

    public abstract Object c(Iterator it, c9.c cVar);

    public final Object f(g gVar, c9.c cVar) {
        Object objC = c(gVar.iterator(), cVar);
        return objC == kotlin.coroutines.intrinsics.a.f() ? objC : s.f25199a;
    }
}
