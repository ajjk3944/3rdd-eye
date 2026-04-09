package bs;

import br.l;
import br.n;
import ht.x;
import rr.a0;
import ur.q0;

/* loaded from: classes.dex */
public final class e extends n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public static final e f2933d = new e(1);

    @Override // ar.k
    public final Object a(Object obj) {
        a0 a0Var = (a0) obj;
        l.e(a0Var, "module");
        q0 q0VarW = kc.f.w(d.f2930b, a0Var.n().i(or.n.f19706t));
        x type = q0VarW != null ? q0VarW.getType() : null;
        return type == null ? kt.k.c(kt.j.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }
}
