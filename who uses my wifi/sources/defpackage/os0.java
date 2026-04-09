package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class os0 implements Iterable {
    public ls0 f;
    public ls0 g;
    public final WeakHashMap h = new WeakHashMap();
    public int i = 0;

    public ls0 a(Object obj) {
        ls0 ls0Var = this.f;
        while (ls0Var != null && !ls0Var.f.equals(obj)) {
            ls0Var = ls0Var.h;
        }
        return ls0Var;
    }

    public Object b(Object obj) {
        ls0 ls0VarA = a(obj);
        if (ls0VarA == null) {
            return null;
        }
        this.i--;
        WeakHashMap weakHashMap = this.h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((ns0) it.next()).a(ls0VarA);
            }
        }
        ls0 ls0Var = ls0VarA.i;
        if (ls0Var != null) {
            ls0Var.h = ls0VarA.h;
        } else {
            this.f = ls0VarA.h;
        }
        ls0 ls0Var2 = ls0VarA.h;
        if (ls0Var2 != null) {
            ls0Var2.i = ls0Var;
        } else {
            this.g = ls0Var;
        }
        ls0VarA.h = null;
        ls0VarA.i = null;
        return ls0VarA.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((defpackage.ks0) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.os0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            os0 r7 = (defpackage.os0) r7
            int r1 = r6.i
            int r3 = r7.i
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            ks0 r3 = (defpackage.ks0) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            ks0 r4 = (defpackage.ks0) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            ks0 r7 = (defpackage.ks0) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            ks0 ks0Var = (ks0) it;
            if (!ks0Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) ks0Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ks0 ks0Var = new ks0(this.f, this.g, 0);
        this.h.put(ks0Var, Boolean.FALSE);
        return ks0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            ks0 ks0Var = (ks0) it;
            if (!ks0Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) ks0Var.next()).toString());
            if (ks0Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
