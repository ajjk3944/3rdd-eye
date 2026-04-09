package C1;

import java.util.Set;
import kotlin.jvm.internal.l;
import w1.C5716b;

/* compiled from: MigrationUtil.kt */
/* loaded from: classes.dex */
public final class e {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090 A[EDGE_INSN: B:45:0x0090->B:41:0x0090 BREAK  A[LOOP:0: B:11:0x0016->B:49:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<A1.a> a(w1.k.d r9, int r10, int r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l.f(r9, r0)
            if (r10 != r11) goto La
            c9.t r9 = c9.C2099t.f18581b
            return r9
        La:
            r0 = 1
            r1 = 0
            if (r11 <= r10) goto L10
            r2 = r0
            goto L11
        L10:
            r2 = r1
        L11:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L16:
            if (r2 == 0) goto L1b
            if (r10 >= r11) goto L91
            goto L1d
        L1b:
            if (r10 <= r11) goto L91
        L1d:
            java.util.LinkedHashMap r4 = r9.f47259a
            r5 = 0
            if (r2 == 0) goto L3a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L30
        L2e:
            r7 = r5
            goto L50
        L30:
            java.util.NavigableSet r6 = r4.descendingKeySet()
            b9.l r7 = new b9.l
            r7.<init>(r4, r6)
            goto L50
        L3a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r6)
            java.util.TreeMap r4 = (java.util.TreeMap) r4
            if (r4 != 0) goto L47
            goto L2e
        L47:
            java.util.Set r6 = r4.keySet()
            b9.l r7 = new b9.l
            r7.<init>(r4, r6)
        L50:
            if (r7 != 0) goto L53
            goto L90
        L53:
            A r4 = r7.f18083b
            java.util.Map r4 = (java.util.Map) r4
            B r6 = r7.f18084c
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8d
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L78
            int r8 = r10 + 1
            if (r8 > r7) goto L5f
            if (r7 > r11) goto L5f
            goto L7c
        L78:
            if (r11 > r7) goto L5f
            if (r7 >= r10) goto L5f
        L7c:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r4.get(r10)
            kotlin.jvm.internal.l.c(r10)
            r3.add(r10)
            r4 = r0
            r10 = r7
            goto L8e
        L8d:
            r4 = r1
        L8e:
            if (r4 != 0) goto L16
        L90:
            return r5
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.e.a(w1.k$d, int, int):java.util.List");
    }

    public static final boolean b(C5716b c5716b, int i, int i10) {
        Set<Integer> set;
        l.f(c5716b, "<this>");
        return (i <= i10 || !c5716b.f47208l) && c5716b.f47207k && ((set = c5716b.f47209m) == null || !set.contains(Integer.valueOf(i)));
    }
}
