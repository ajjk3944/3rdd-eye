package Zi;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Zi.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3694a implements Vi.b {
    public /* synthetic */ AbstractC3694a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void o(AbstractC3694a abstractC3694a, Yi.c cVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        abstractC3694a.n(cVar, i10, obj, z10);
    }

    private final int p(Yi.c cVar, Object obj) {
        int iX = cVar.x(a());
        i(obj, iX);
        return iX;
    }

    public Object c(Yi.e decoder) {
        AbstractC6492s.i(decoder, "decoder");
        return l(decoder, null);
    }

    protected abstract Object g();

    protected abstract int h(Object obj);

    protected abstract void i(Object obj, int i10);

    protected abstract Iterator j(Object obj);

    protected abstract int k(Object obj);

    public final Object l(Yi.e decoder, Object obj) {
        Object objG;
        AbstractC6492s.i(decoder, "decoder");
        if (obj == null || (objG = q(obj)) == null) {
            objG = g();
        }
        int iH = h(objG);
        Yi.c cVarC = decoder.c(a());
        if (!cVarC.B()) {
            while (true) {
                int iK = cVarC.k(a());
                if (iK == -1) {
                    break;
                }
                o(this, cVarC, iH + iK, objG, false, 8, null);
            }
        } else {
            m(cVarC, objG, iH, p(cVarC, objG));
        }
        cVarC.b(a());
        return r(objG);
    }

    protected abstract void m(Yi.c cVar, Object obj, int i10, int i11);

    protected abstract void n(Yi.c cVar, int i10, Object obj, boolean z10);

    protected abstract Object q(Object obj);

    protected abstract Object r(Object obj);

    private AbstractC3694a() {
    }
}
