package a3;

import java.util.Iterator;

/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: m, reason: collision with root package name */
    public int f61m;

    public h(t tVar) {
        super(tVar);
        if (tVar instanceof m) {
            this.f55e = f.HORIZONTAL_DIMENSION;
        } else {
            this.f55e = f.VERTICAL_DIMENSION;
        }
    }

    @Override // a3.g
    public final void d(int i10) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f57g = i10;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
