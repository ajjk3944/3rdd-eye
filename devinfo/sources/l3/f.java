package l3;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class f extends e {

    /* renamed from: m, reason: collision with root package name */
    public int f28567m;

    public f(n nVar) {
        super(nVar);
        if (nVar instanceof j) {
            this.f28561e = 2;
        } else {
            this.f28561e = 3;
        }
    }

    @Override // l3.e
    public final void d(int i4) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i4;
        ArrayList arrayList = this.f28565k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}
