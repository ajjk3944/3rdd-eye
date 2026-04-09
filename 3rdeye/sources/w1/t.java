package w1;

import c9.C2079C;
import d9.C4289g;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class t implements p9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47282b;

    @Override // p9.l
    public final Object invoke(Object obj) {
        switch (this.f47282b) {
            case 0:
                E1.c statement = (E1.c) obj;
                kotlin.jvm.internal.l.f(statement, "statement");
                C4289g c4289g = new C4289g();
                while (statement.x()) {
                    c4289g.add(Integer.valueOf((int) statement.getLong(0)));
                }
                return C2079C.a(c4289g);
            default:
                x9.g it = (x9.g) obj;
                kotlin.jvm.internal.l.f(it, "it");
                return it.iterator();
        }
    }
}
