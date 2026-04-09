package h2;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final List f9810a;

    /* renamed from: d, reason: collision with root package name */
    public final String f9811d;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f9812g;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f9813r;

    static {
        q3.a aVar = a0.f9759a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r1.a(r3.f9802c);
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(java.util.List r9, java.lang.String r10) {
        /*
            r8 = this;
            r8.<init>()
            r8.f9810a = r9
            r8.f9811d = r10
            r10 = 0
            r0 = 0
            if (r9 == 0) goto L3c
            int r1 = r9.size()
            r2 = r10
            r3 = r0
            r4 = r3
        L12:
            if (r2 >= r1) goto L3e
            java.lang.Object r5 = r9.get(r2)
            h2.d r5 = (h2.d) r5
            java.lang.Object r6 = r5.f9800a
            boolean r7 = r6 instanceof h2.c0
            if (r7 == 0) goto L2b
            if (r3 != 0) goto L27
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L27:
            r3.add(r5)
            goto L39
        L2b:
            boolean r6 = r6 instanceof h2.s
            if (r6 == 0) goto L39
            if (r4 != 0) goto L36
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L36:
            r4.add(r5)
        L39:
            int r2 = r2 + 1
            goto L12
        L3c:
            r3 = r0
            r4 = r3
        L3e:
            r8.f9812g = r3
            r8.f9813r = r4
            if (r4 == 0) goto L4e
            h2.e r9 = new h2.e
            r9.<init>(r10)
            java.util.List r9 = mq.o.M0(r4, r9)
            goto L4f
        L4e:
            r9 = r0
        L4f:
            if (r9 == 0) goto Lba
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L58
            goto Lba
        L58:
            java.lang.Object r10 = mq.o.r0(r9)
            h2.d r10 = (h2.d) r10
            int r10 = r10.f9802c
            int r1 = u.i.f23074a
            u.s r1 = new u.s
            r2 = 1
            r1.<init>(r2)
            r1.a(r10)
            int r10 = r9.size()
        L6f:
            if (r2 >= r10) goto Lba
            java.lang.Object r3 = r9.get(r2)
            h2.d r3 = (h2.d) r3
        L77:
            int r4 = r1.f23108b
            if (r4 == 0) goto Lb2
            if (r4 == 0) goto Lac
            int[] r5 = r1.f23107a
            int r6 = r4 + (-1)
            r5 = r5[r6]
            int r6 = r3.f9801b
            int r7 = r3.f9802c
            if (r6 < r5) goto L8f
            int r4 = r4 + (-1)
            r1.c(r4)
            goto L77
        L8f:
            if (r7 > r5) goto L92
            goto Lb2
        L92:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Paragraph overlap not allowed, end "
            r4.<init>(r6)
            r4.append(r7)
            java.lang.String r6 = " should be less than or equal to "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            m2.a.a(r4)
            goto Lb2
        Lac:
            java.lang.String r9 = "IntList is empty."
            v.a.e(r9)
            throw r0
        Lb2:
            int r3 = r3.f9802c
            r1.a(r3)
            int r2 = r2 + 1
            goto L6f
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.f.<init>(java.util.List, java.lang.String):void");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f9811d.charAt(i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return br.l.a(this.f9811d, fVar.f9811d) && br.l.a(this.f9810a, fVar.f9810a);
    }

    public final int hashCode() {
        int iHashCode = this.f9811d.hashCode() * 31;
        List list = this.f9810a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f9811d.length();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    @Override // java.lang.CharSequence
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 41
            java.lang.String r1 = "start ("
            if (r11 > r12) goto L7
            goto L21
        L7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r11)
            java.lang.String r3 = ") should be less or equal to end ("
            r2.append(r3)
            r2.append(r12)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            m2.a.a(r2)
        L21:
            java.lang.String r2 = r10.f9811d
            if (r11 != 0) goto L2c
            int r3 = r2.length()
            if (r12 != r3) goto L2c
            return r10
        L2c:
            java.lang.String r2 = r2.substring(r11, r12)
            java.lang.String r3 = "substring(...)"
            br.l.d(r2, r3)
            int r3 = h2.g.f9823a
            if (r11 > r12) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r11)
            java.lang.String r1 = ") should be less than or equal to end ("
            r3.append(r1)
            r3.append(r12)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            m2.a.a(r0)
        L54:
            java.util.List r0 = r10.f9810a
            if (r0 != 0) goto L59
            goto L9a
        L59:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r0.size()
            r1.<init>(r3)
            int r3 = r0.size()
            r4 = 0
        L67:
            if (r4 >= r3) goto L94
            java.lang.Object r5 = r0.get(r4)
            h2.d r5 = (h2.d) r5
            int r6 = r5.f9801b
            int r7 = r5.f9802c
            boolean r6 = h2.g.a(r11, r12, r6, r7)
            if (r6 == 0) goto L91
            h2.d r6 = new h2.d
            java.lang.Object r8 = r5.f9800a
            int r9 = r5.f9801b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.f9803d
            r6.<init>(r8, r9, r7, r5)
            r1.add(r6)
        L91:
            int r4 = r4 + 1
            goto L67
        L94:
            boolean r11 = r1.isEmpty()
            if (r11 == 0) goto L9b
        L9a:
            r1 = 0
        L9b:
            h2.f r11 = new h2.f
            r11.<init>(r1, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.f.subSequence(int, int):java.lang.CharSequence");
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f9811d;
    }

    public /* synthetic */ f(String str) {
        this(str, mq.w.f16945a);
    }

    public f(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
