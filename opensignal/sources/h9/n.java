package h9;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10414a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10415b;

    public n(boolean z10, String str) {
        this.f10414a = z10;
        this.f10415b = str;
    }

    @Override // h9.h
    public final boolean a(o1 o1Var) {
        int i10;
        boolean z10 = this.f10414a;
        String strO = this.f10415b;
        if (z10 && strO == null) {
            strO = o1Var.o();
        }
        m1 m1Var = o1Var.f10462b;
        if (m1Var != null) {
            Iterator it = m1Var.f().iterator();
            i10 = 0;
            while (it.hasNext()) {
                o1 o1Var2 = (o1) ((q1) it.next());
                if (strO == null || o1Var2.o().equals(strO)) {
                    i10++;
                }
            }
        } else {
            i10 = 1;
        }
        return i10 == 1;
    }

    public final String toString() {
        return this.f10414a ? h0.b.o("only-of-type <", this.f10415b, ">") : "only-child";
    }
}
