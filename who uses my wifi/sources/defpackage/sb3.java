package defpackage;

import java.util.Comparator;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class sb3 implements Comparator {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ sb3(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                rb3 rb3Var = (rb3) obj;
                rb3 rb3Var2 = (rb3) obj2;
                jb3 jb3Var = (jb3) obj3;
                tx2 tx2VarG = jb3Var.g(rb3Var2.a);
                double d = !(tx2VarG instanceof rm2) ? 0.0d : ((rm2) tx2VarG).o;
                tx2 tx2VarG2 = jb3Var.g(rb3Var.a);
                int iCompare = Double.compare(d, tx2VarG2 instanceof rm2 ? ((rm2) tx2VarG2).o : 0.0d);
                return iCompare == 0 ? Long.compare(rb3Var.b, rb3Var2.b) : iCompare;
            default:
                HashMap map = og4.a;
                ng4 ng4Var = (ng4) obj3;
                return ng4Var.c(obj2) - ng4Var.c(obj);
        }
    }
}
