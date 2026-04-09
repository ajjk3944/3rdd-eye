package kotlinx.serialization.internal;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class a implements kotlinx.serialization.b {
    public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
        this();
    }

    public static /* synthetic */ void i(a aVar, y9.c cVar, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        aVar.h(cVar, i10, obj, z10);
    }

    public abstract Object a();

    public abstract int b(Object obj);

    public abstract void c(Object obj, int i10);

    public abstract Iterator d(Object obj);

    @Override // kotlinx.serialization.a
    public Object deserialize(y9.e decoder) {
        kotlin.jvm.internal.p.e(decoder, "decoder");
        return f(decoder, null);
    }

    public abstract int e(Object obj);

    public final Object f(y9.e decoder, Object obj) {
        Object objA;
        kotlin.jvm.internal.p.e(decoder, "decoder");
        if (obj == null || (objA = k(obj)) == null) {
            objA = a();
        }
        Object obj2 = objA;
        int iB = b(obj2);
        y9.c cVarB = decoder.b(getDescriptor());
        if (!cVarB.p()) {
            while (true) {
                int iO = cVarB.o(getDescriptor());
                if (iO == -1) {
                    break;
                }
                i(this, cVarB, iB + iO, obj2, false, 8, null);
            }
        } else {
            g(cVarB, obj2, iB, j(cVarB, obj2));
        }
        cVarB.c(getDescriptor());
        return l(obj2);
    }

    public abstract void g(y9.c cVar, Object obj, int i10, int i11);

    public abstract void h(y9.c cVar, int i10, Object obj, boolean z10);

    public final int j(y9.c cVar, Object obj) {
        int iK = cVar.k(getDescriptor());
        c(obj, iK);
        return iK;
    }

    public abstract Object k(Object obj);

    public abstract Object l(Object obj);

    public a() {
    }
}
