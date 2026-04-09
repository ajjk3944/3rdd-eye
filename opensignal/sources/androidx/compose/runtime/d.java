package androidx.compose.runtime;

import br.l;
import n0.b0;
import n0.b2;
import n0.c2;
import n0.h0;
import n0.i1;
import n0.i2;
import n0.j2;
import n0.s0;
import n0.t0;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f1118a;

    public d(ar.a aVar) {
        this.f1118a = new s0(aVar);
    }

    public abstract i1 a(Object obj);

    public j2 b() {
        return this.f1118a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j2 c(i1 i1Var, j2 j2Var) {
        h0 h0Var = null;
        if (j2Var instanceof h0) {
            if (i1Var.f17184b) {
                h0Var = (h0) j2Var;
                ((b2) h0Var.f17176a).setValue(i1Var.c());
            }
        } else if (j2Var instanceof i2) {
            if ((i1Var.f17183a || i1Var.f17188f != null) && !i1Var.f17184b) {
                i2 i2Var = (i2) j2Var;
                if (l.a(i1Var.c(), i2Var.f17189a)) {
                    h0Var = i2Var;
                }
            }
        } else if (j2Var instanceof b0) {
            i1Var.getClass();
        }
        if (h0Var != null) {
            return h0Var;
        }
        if (!i1Var.f17184b) {
            return new i2(i1Var.c());
        }
        Object obj = i1Var.f17188f;
        c2 c2Var = (c2) i1Var.f17187e;
        if (c2Var == null) {
            c2Var = t0.f17321y;
        }
        return new h0(new ParcelableSnapshotMutableState(obj, c2Var));
    }
}
