package w1;

import n.AbstractC5340b;

/* compiled from: EntityDeletionOrUpdateAdapter.android.kt */
/* loaded from: classes.dex */
public abstract class d extends AbstractC5340b {
    public abstract void i(F1.f fVar, Object obj);

    public void j(Object obj) {
        F1.f fVarC = c();
        try {
            i(fVarC, obj);
            fVarC.I0();
        } finally {
            h(fVarC);
        }
    }
}
