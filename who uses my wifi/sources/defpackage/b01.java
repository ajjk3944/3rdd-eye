package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class b01 extends tn0 {
    public ArrayList k;

    @Override // defpackage.tn0
    public final void k(cm cmVar) {
        this.k = new ArrayList(2);
        while (((ByteBuffer) cmVar.j).remaining() > 0) {
            this.k.add(cmVar.e());
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        if (this.k.isEmpty()) {
            return "\"\"";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            sb.append(tn0.a((byte[]) it.next(), true));
            if (it.hasNext()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t3Var.l((byte[]) obj);
        }
    }
}
