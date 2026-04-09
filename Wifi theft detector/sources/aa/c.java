package aa;

import java.util.List;
import kotlin.jvm.internal.i;
import z8.r;

/* loaded from: classes4.dex */
public abstract class c {
    public /* synthetic */ c(i iVar) {
        this();
    }

    public static /* synthetic */ kotlinx.serialization.b c(c cVar, r9.c cVar2, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i10 & 2) != 0) {
            list = r.j();
        }
        return cVar.b(cVar2, list);
    }

    public abstract void a(e eVar);

    public abstract kotlinx.serialization.b b(r9.c cVar, List list);

    public abstract kotlinx.serialization.a d(r9.c cVar, String str);

    public abstract kotlinx.serialization.e e(r9.c cVar, Object obj);

    public c() {
    }
}
