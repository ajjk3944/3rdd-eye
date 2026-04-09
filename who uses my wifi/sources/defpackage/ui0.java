package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final /* synthetic */ class ui0 implements dy {
    public final /* synthetic */ int f;
    public final /* synthetic */ aj0 g;

    public /* synthetic */ ui0(aj0 aj0Var, int i) {
        this.f = i;
        this.g = aj0Var;
    }

    @Override // defpackage.dy
    public final Object g(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        f9 f9Var = (f9) obj;
        switch (this.f) {
            case 0:
                i30.m(f9Var, "backEvent");
                aj0 aj0Var = this.g;
                l8 l8Var = aj0Var.b;
                ListIterator listIterator = l8Var.listIterator(l8Var.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((qw) objPrevious).a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                qw qwVar = (qw) objPrevious;
                if (aj0Var.c != null) {
                    aj0Var.b();
                }
                aj0Var.c = qwVar;
                break;
            default:
                i30.m(f9Var, "backEvent");
                aj0 aj0Var2 = this.g;
                if (aj0Var2.c == null) {
                    l8 l8Var2 = aj0Var2.b;
                    ListIterator listIterator2 = l8Var2.listIterator(l8Var2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((qw) objPrevious2).a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                }
                break;
        }
        return z31.a;
    }
}
