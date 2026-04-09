package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wn1 {
    public final en1[] a;

    public wn1(en1... en1VarArr) {
        this.a = en1VarArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.sn3 a(java.lang.Class r10, defpackage.cl3 r11) {
        /*
            r9 = this;
            vm3 r0 = defpackage.xm3.g
            java.lang.String r0 = "initialCapacity"
            r1 = 4
            defpackage.ob1.z(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            en1[] r1 = r9.a
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lf:
            if (r3 >= r2) goto L41
            r5 = r1[r3]
            java.lang.Class r6 = r5.getClass()
            boolean r6 = r10.isAssignableFrom(r6)
            if (r6 == 0) goto L2a
            java.lang.Object r5 = r10.cast(r5)
            en1 r5 = (defpackage.en1) r5
            boolean r6 = r11.c(r5)
            if (r6 == 0) goto L2a
            goto L2b
        L2a:
            r5 = 0
        L2b:
            if (r5 == 0) goto L3e
            int r6 = r0.length
            int r7 = r4 + 1
            int r8 = defpackage.rm3.d(r6, r7)
            if (r8 > r6) goto L37
            goto L3b
        L37:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
        L3b:
            r0[r4] = r5
            r4 = r7
        L3e:
            int r3 = r3 + 1
            goto Lf
        L41:
            sn3 r10 = defpackage.xm3.o(r0, r4)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn1.a(java.lang.Class, cl3):sn3");
    }

    public final wn1 b(wn1 wn1Var) {
        return wn1Var == null ? this : c(wn1Var.a);
    }

    public final wn1 c(en1... en1VarArr) {
        int length = en1VarArr.length;
        if (length == 0) {
            return this;
        }
        String str = v23.a;
        en1[] en1VarArr2 = this.a;
        int length2 = en1VarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(en1VarArr2, length2 + length);
        System.arraycopy(en1VarArr, 0, objArrCopyOf, length2, length);
        return new wn1((en1[]) objArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && wn1.class == obj.getClass() && Arrays.equals(this.a, ((wn1) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(-9223372036854775807L) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        return ex0.l(new StringBuilder(String.valueOf(string).length() + 8), "entries=", string, "");
    }

    public wn1(List list) {
        this.a = (en1[]) list.toArray(new en1[0]);
    }
}
