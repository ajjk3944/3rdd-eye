package h9;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f0 extends o1 implements m1 {

    /* renamed from: h, reason: collision with root package name */
    public List f10335h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public Boolean f10336i;
    public Matrix j;
    public g0 k;

    /* renamed from: l, reason: collision with root package name */
    public String f10337l;

    @Override // h9.m1
    public final List f() {
        return this.f10335h;
    }

    @Override // h9.m1
    public final void m(q1 q1Var) throws s2 {
        if (q1Var instanceof y0) {
            this.f10335h.add(q1Var);
            return;
        }
        throw new s2("Gradient elements cannot contain " + q1Var + " elements.");
    }
}
