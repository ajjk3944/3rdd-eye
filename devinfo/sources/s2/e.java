package s2;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public final List f33364a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33365b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f33366c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f33367d;

    static {
        yb.i iVar = y.f33430a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        r1.a(r3.f33352c);
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(java.util.List r9, java.lang.String r10) {
        /*
            r8 = this;
            r8.<init>()
            r8.f33364a = r9
            r8.f33365b = r10
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
            s2.c r5 = (s2.c) r5
            java.lang.Object r6 = r5.f33350a
            boolean r7 = r6 instanceof s2.a0
            if (r7 == 0) goto L2b
            if (r3 != 0) goto L27
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L27:
            r3.add(r5)
            goto L39
        L2b:
            boolean r6 = r6 instanceof s2.p
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
            r8.f33366c = r3
            r8.f33367d = r4
            if (r4 == 0) goto L4e
            s2.d r9 = new s2.d
            r9.<init>(r10)
            java.util.List r9 = zj.n.o0(r4, r9)
            goto L4f
        L4e:
            r9 = r0
        L4f:
            if (r9 == 0) goto Lba
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L58
            goto Lba
        L58:
            java.lang.Object r10 = zj.n.c0(r9)
            s2.c r10 = (s2.c) r10
            int r10 = r10.f33352c
            x.t r1 = x.i.f36902a
            x.t r1 = new x.t
            r2 = 1
            r1.<init>(r2)
            r1.a(r10)
            int r10 = r9.size()
        L6f:
            if (r2 >= r10) goto Lba
            java.lang.Object r3 = r9.get(r2)
            s2.c r3 = (s2.c) r3
        L77:
            int r4 = r1.f36945b
            if (r4 == 0) goto Lb2
            if (r4 == 0) goto Lac
            int[] r5 = r1.f36944a
            int r6 = r4 + (-1)
            r5 = r5[r6]
            int r6 = r3.f33351b
            int r7 = r3.f33352c
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
            x2.a.a(r4)
            goto Lb2
        Lac:
            java.lang.String r9 = "IntList is empty."
            y.a.e(r9)
            throw r0
        Lb2:
            int r3 = r3.f33352c
            r1.a(r3)
            int r2 = r2 + 1
            goto L6f
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.e.<init>(java.util.List, java.lang.String):void");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.f33365b.charAt(i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return nk.k.a(this.f33365b, eVar.f33365b) && nk.k.a(this.f33364a, eVar.f33364a);
    }

    public final int hashCode() {
        int iHashCode = this.f33365b.hashCode() * 31;
        List list = this.f33364a;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f33365b.length();
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
            x2.a.a(r2)
        L21:
            java.lang.String r2 = r10.f33365b
            if (r11 != 0) goto L2c
            int r3 = r2.length()
            if (r12 != r3) goto L2c
            return r10
        L2c:
            java.lang.String r2 = r2.substring(r11, r12)
            java.lang.String r3 = "substring(...)"
            nk.k.d(r2, r3)
            int r3 = s2.f.f33374a
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
            x2.a.a(r0)
        L54:
            java.util.List r0 = r10.f33364a
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
            s2.c r5 = (s2.c) r5
            int r6 = r5.f33351b
            int r7 = r5.f33352c
            boolean r6 = s2.f.a(r11, r12, r6, r7)
            if (r6 == 0) goto L91
            s2.c r6 = new s2.c
            java.lang.Object r8 = r5.f33350a
            int r9 = r5.f33351b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.f33353d
            r6.<init>(r5, r9, r7, r8)
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
            s2.e r11 = new s2.e
            r11.<init>(r1, r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.e.subSequence(int, int):java.lang.CharSequence");
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f33365b;
    }

    public /* synthetic */ e(String str) {
        this(str, zj.s.f38317a);
    }

    public e(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
