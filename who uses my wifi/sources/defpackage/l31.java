package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class l31 implements Serializable {
    public final TreeSet f = new TreeSet();

    public l31(cm cmVar) throws t91 {
        while (true) {
            ByteBuffer byteBuffer = (ByteBuffer) cmVar.j;
            if (byteBuffer.remaining() <= 0) {
                return;
            }
            if (byteBuffer.remaining() < 2) {
                throw new t91("invalid bitmap descriptor");
            }
            int i = cmVar.i();
            if (i < -1) {
                throw new t91("invalid ordering");
            }
            int i2 = cmVar.i();
            if (i2 > byteBuffer.remaining()) {
                throw new t91("invalid bitmap");
            }
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = cmVar.i();
                for (int i5 = 0; i5 < 8 && i4 > 0; i5++) {
                    if (((1 << (7 - i5)) & i4) != 0) {
                        this.f.add(Integer.valueOf((i3 * 8) + (i * 256) + i5));
                    }
                }
            }
        }
    }

    public static void a(t3 t3Var, TreeSet treeSet, int i) {
        int iIntValue = ((((Integer) treeSet.last()).intValue() & 255) / 8) + 1;
        int[] iArr = new int[iIntValue];
        t3Var.q(i);
        t3Var.q(iIntValue);
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Integer) it.next()).intValue();
            int i2 = (iIntValue2 & 255) / 8;
            iArr[i2] = (1 << (7 - (iIntValue2 % 8))) | iArr[i2];
        }
        for (int i3 = 0; i3 < iIntValue; i3++) {
            t3Var.q(iArr[i3]);
        }
    }

    public final void b(t3 t3Var) {
        TreeSet treeSet = this.f;
        if (treeSet.isEmpty()) {
            return;
        }
        TreeSet treeSet2 = new TreeSet();
        Iterator it = treeSet.iterator();
        int i = -1;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int iIntValue = num.intValue() >> 8;
            if (iIntValue != i) {
                if (!treeSet2.isEmpty()) {
                    a(t3Var, treeSet2, i);
                    treeSet2.clear();
                }
                i = iIntValue;
            }
            treeSet2.add(num);
        }
        a(t3Var, treeSet2, i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            sb.append(k31.a.e(((Integer) it.next()).intValue()));
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
