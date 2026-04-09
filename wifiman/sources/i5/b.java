package I5;

import gg.i;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class b {
    public static final i a(i receiver, Object obj) {
        AbstractC6492s.j(receiver, "$receiver");
        i iVarX = receiver.x(obj != null ? a.e(obj) : a.f());
        AbstractC6492s.e(iVarX, "compose(\n      if (defau…ngShare.instance<T>()\n  )");
        return iVarX;
    }

    public static /* bridge */ /* synthetic */ i b(i iVar, Object obj, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replayingShare");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return a(iVar, obj);
    }
}
