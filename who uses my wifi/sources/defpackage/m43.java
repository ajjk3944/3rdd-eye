package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class m43 extends td {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public m43(int i, long j) {
        super(i, 1);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final p43 i(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            p43 p43Var = (p43) arrayList.get(i2);
            if (p43Var.b == i) {
                return p43Var;
            }
        }
        return null;
    }

    public final m43 j(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            m43 m43Var = (m43) arrayList.get(i2);
            if (m43Var.b == i) {
                return m43Var;
            }
        }
        return null;
    }

    @Override // defpackage.td
    public final String toString() {
        String strG = td.g(this.b);
        String string = Arrays.toString(this.d.toArray());
        String string2 = Arrays.toString(this.e.toArray());
        int length = strG.length();
        StringBuilder sb = new StringBuilder(length + 9 + String.valueOf(string).length() + 13 + String.valueOf(string2).length());
        ex0.q(sb, strG, " leaves: ", string, " containers: ");
        sb.append(string2);
        return sb.toString();
    }
}
