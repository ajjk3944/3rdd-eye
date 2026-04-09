package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Supplier;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class es0 extends tn0 {
    public static final bs0 n;
    public int k;
    public gg0 l;
    public final TreeMap m = new TreeMap();

    static {
        bs0 bs0Var = new bs0(0);
        n = bs0Var;
        bs0Var.h(0, "mandatory", new wr0(0));
        bs0Var.h(1, "alpn", new wr0(1));
        bs0Var.h(2, "no-default-alpn", new wr0(2));
        bs0Var.h(3, "port", new wr0(3));
        bs0Var.h(4, "ipv4hint", new wr0(4));
        bs0Var.h(5, "ech", new wr0(5));
        bs0Var.h(6, "ipv6hint", new wr0(6));
        bs0Var.c("echconfig", 5);
    }

    @Override // defpackage.tn0
    public final void k(cm cmVar) throws t91 {
        int i;
        yr0 yr0Var;
        int iF = cmVar.f();
        ByteBuffer byteBuffer = (ByteBuffer) cmVar.j;
        this.k = iF;
        this.l = new gg0(cmVar);
        TreeMap treeMap = this.m;
        treeMap.clear();
        while (true) {
            i = 0;
            if (byteBuffer.remaining() < 4) {
                break;
            }
            int iF2 = cmVar.f();
            byte[] bArrC = cmVar.c(cmVar.f());
            Supplier supplier = (Supplier) n.m.get(Integer.valueOf(iF2));
            if (supplier != null) {
                yr0Var = (yr0) supplier.get();
            } else {
                zr0 zr0Var = new zr0(1);
                zr0Var.g = new byte[0];
                yr0Var = zr0Var;
            }
            yr0Var.a(bArrC);
            treeMap.put(Integer.valueOf(iF2), yr0Var);
        }
        if (byteBuffer.remaining() > 0) {
            throw new t91("Record had unexpected number of bytes");
        }
        as0 as0Var = (as0) ((yr0) treeMap.get(0));
        if (as0Var != null) {
            ArrayList arrayList = as0Var.f;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Integer num = (Integer) obj;
                num.getClass();
                if (((yr0) treeMap.get(num)) == null) {
                    throw new t91("Not all mandatory SvcParams are specified");
                }
            }
        }
    }

    @Override // defpackage.tn0
    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.k);
        sb.append(" ");
        sb.append(this.l);
        for (Map.Entry entry : this.m.entrySet()) {
            sb.append(" ");
            sb.append(n.e(((Integer) entry.getKey()).intValue()));
            String string = ((yr0) entry.getValue()).toString();
            if (string != null && !string.isEmpty()) {
                sb.append("=");
                sb.append(string);
            }
        }
        return sb.toString();
    }

    @Override // defpackage.tn0
    public final void m(t3 t3Var, jh jhVar, boolean z) {
        t3Var.m(this.k);
        this.l.r(t3Var, null, z);
        for (Map.Entry entry : this.m.entrySet()) {
            t3Var.m(((Integer) entry.getKey()).intValue());
            byte[] bArrB = ((yr0) entry.getValue()).b();
            t3Var.m(bArrB.length);
            t3Var.k(bArrB, 0, bArrB.length);
        }
    }
}
