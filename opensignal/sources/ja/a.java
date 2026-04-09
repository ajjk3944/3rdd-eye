package ja;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a extends c5.a {

    /* renamed from: g, reason: collision with root package name */
    public final long f13430g;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f13431r;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f13432x;

    public a(int i10, long j) {
        super(i10, 1);
        this.f13430g = j;
        this.f13431r = new ArrayList();
        this.f13432x = new ArrayList();
    }

    public final a p(int i10) {
        ArrayList arrayList = this.f13432x;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar.f3295d == i10) {
                return aVar;
            }
        }
        return null;
    }

    public final b q(int i10) {
        ArrayList arrayList = this.f13431r;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            if (bVar.f3295d == i10) {
                return bVar;
            }
        }
        return null;
    }

    @Override // c5.a
    public final String toString() {
        String strC = c5.a.c(this.f3295d);
        String string = Arrays.toString(this.f13431r.toArray());
        String string2 = Arrays.toString(this.f13432x.toArray());
        StringBuilder sbS = c7.a.s(c7.a.d(c7.a.d(c7.a.d(22, strC), string), string2), strC, " leaves: ", string, " containers: ");
        sbS.append(string2);
        return sbS.toString();
    }
}
