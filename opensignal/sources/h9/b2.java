package h9;

/* loaded from: classes.dex */
public abstract class b2 extends l1 {
    @Override // h9.l1, h9.m1
    public final void m(q1 q1Var) throws s2 {
        if (q1Var instanceof a2) {
            this.f10401i.add(q1Var);
            return;
        }
        throw new s2("Text content elements cannot contain " + q1Var + " elements.");
    }
}
