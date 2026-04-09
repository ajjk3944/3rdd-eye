package bj;

import aj.AbstractC3868b;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes4.dex */
public abstract class x {
    public static final void a(AbstractC3868b json, o writer, Vi.o serializer, Object obj) {
        AbstractC6492s.i(json, "json");
        AbstractC6492s.i(writer, "writer");
        AbstractC6492s.i(serializer, "serializer");
        new F(writer, json, M.OBJ, new aj.t[M.getEntries().size()]).z(serializer, obj);
    }
}
