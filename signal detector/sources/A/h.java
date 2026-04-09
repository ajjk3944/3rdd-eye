package A;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: m, reason: collision with root package name */
    public int f30m;

    public h(p pVar) {
        super(pVar);
        if (pVar instanceof l) {
            this.f23e = 2;
        } else {
            this.f23e = 3;
        }
    }

    @Override // A.g
    public final void d(int i) {
        if (this.f27j) {
            return;
        }
        this.f27j = true;
        this.f25g = i;
        ArrayList arrayList = this.f28k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            d dVar = (d) obj;
            dVar.a(dVar);
        }
    }
}
