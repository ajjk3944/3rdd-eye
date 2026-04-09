package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ap extends jo {
    public int m;

    public ap(m81 m81Var) {
        super(m81Var);
        if (m81Var instanceof z00) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.jo
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ho hoVar = (ho) obj;
            hoVar.a(hoVar);
        }
    }
}
