package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class js0 extends e50 implements hy {
    public final /* synthetic */ gs0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(gs0 gs0Var) {
        super(2);
        this.g = gs0Var;
    }

    @Override // defpackage.hy
    public final Object f(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        fk fkVar = (fk) obj2;
        gk key = fkVar.getKey();
        fk fkVarH = this.g.j.h(key);
        if (key != fr.j) {
            return Integer.valueOf(fkVar != fkVarH ? Integer.MIN_VALUE : iIntValue + 1);
        }
        w30 w30Var = (w30) fkVarH;
        w30 parent = (w30) fkVar;
        while (true) {
            if (parent != null) {
                if (parent == w30Var || !(parent instanceof ht0)) {
                    break;
                }
                se seVar = (se) g40.g.get((g40) parent);
                parent = seVar != null ? seVar.getParent() : null;
            } else {
                parent = null;
                break;
            }
        }
        if (parent == w30Var) {
            if (w30Var != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + w30Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
