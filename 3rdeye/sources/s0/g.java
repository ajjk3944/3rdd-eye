package s0;

import java.util.Iterator;
import s0.f;

/* compiled from: DimensionDependency.java */
/* loaded from: classes.dex */
public class g extends f {

    /* renamed from: m, reason: collision with root package name */
    public int f45931m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f45924e = f.a.HORIZONTAL_DIMENSION;
        } else {
            this.f45924e = f.a.VERTICAL_DIMENSION;
        }
    }

    @Override // s0.f
    public final void d(int i) {
        if (this.f45928j) {
            return;
        }
        this.f45928j = true;
        this.f45926g = i;
        Iterator it = this.f45929k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
