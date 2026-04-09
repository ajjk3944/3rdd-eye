package androidx.compose.runtime;

import n0.c2;
import n0.d2;
import n0.n;
import n0.t0;
import n0.x0;
import n0.x1;
import p0.e;

/* loaded from: classes.dex */
public abstract class c {
    public static final e a() {
        qm.c cVar = d2.f17152b;
        e eVar = (e) cVar.get();
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(new n[0]);
        cVar.P(eVar2);
        return eVar2;
    }

    public static final x1 b(float f10) {
        return new ParcelableSnapshotMutableFloatState(f10);
    }

    public static final x1 c() {
        return new ParcelableSnapshotMutableIntState(0);
    }

    public static final x1 d() {
        return new ParcelableSnapshotMutableLongState(0L);
    }

    public static final x0 e(Object obj, c2 c2Var) {
        return new ParcelableSnapshotMutableState(obj, c2Var);
    }

    public static x0 f(Object obj) {
        return new ParcelableSnapshotMutableState(obj, t0.f17321y);
    }
}
