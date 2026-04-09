package x;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d0 implements ok.e, Set, ok.a {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f36868a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f36869b;

    public d0(b0 b0Var) {
        nk.k.e(b0Var, "parent");
        this.f36868a = b0Var;
        this.f36869b = b0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f36869b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        nk.k.e(collection, "elements");
        b0 b0Var = this.f36869b;
        b0Var.getClass();
        int i4 = b0Var.g;
        for (Object obj : collection) {
            int iD = b0Var.d(obj);
            b0Var.f36850b[iD] = obj;
            long[] jArr = b0Var.f36851c;
            int i10 = b0Var.f36852d;
            jArr[iD] = (i10 & 2147483647L) | 4611686016279904256L;
            if (i10 != Integer.MAX_VALUE) {
                jArr[i10] = ((2147483647L & iD) << 31) | (jArr[i10] & (-4611686016279904257L));
            }
            b0Var.f36852d = iD;
            if (b0Var.f36853e == Integer.MAX_VALUE) {
                b0Var.f36853e = iD;
            }
        }
        return i4 != b0Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f36869b.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f36868a.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        nk.k.e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f36868a.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        return nk.k.a(this.f36868a, ((d0) obj).f36868a);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f36868a.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f36868a.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new a1.d(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f36869b.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean removeAll(java.util.Collection r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "elements"
            nk.k.e(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r20
            x.b0 r2 = r1.f36869b
            r2.getClass()
            int r3 = r2.g
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto La4
            java.lang.Object r4 = r0.next()
            if (r4 == 0) goto L29
            int r7 = r4.hashCode()
            goto L2a
        L29:
            r7 = r6
        L2a:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r2.f36854f
            int r7 = r7 >>> 7
            r7 = r7 & r9
        L38:
            long[] r10 = r2.f36849a
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r5
            r15 = r10[r11]
            int r10 = 64 - r12
            long r10 = r15 << r10
            r21 = r5
            r15 = r6
            long r5 = (long) r12
            long r5 = -r5
            r12 = 63
            long r5 = r5 >> r12
            long r5 = r5 & r10
            long r5 = r5 | r13
            long r10 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r5
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L66:
            r16 = 0
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 == 0) goto L89
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r9
            r18 = r12
            java.lang.Object[] r12 = r2.f36850b
            r12 = r12[r14]
            boolean r12 = nk.k.a(r12, r4)
            if (r12 == 0) goto L81
            goto L96
        L81:
            r12 = 1
            long r12 = r10 - r12
            long r10 = r10 & r12
            r12 = r18
            goto L66
        L89:
            r18 = r12
            long r10 = ~r5
            r12 = 6
            long r10 = r10 << r12
            long r5 = r5 & r10
            long r5 = r5 & r18
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L9d
            r14 = -1
        L96:
            if (r14 < 0) goto L16
            r2.h(r14)
            goto L16
        L9d:
            int r6 = r15 + 8
            int r7 = r7 + r6
            r7 = r7 & r9
            r5 = r21
            goto L38
        La4:
            r21 = r5
            int r0 = r2.g
            if (r3 == r0) goto Lab
            return r21
        Lab:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x.d0.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        nk.k.e(collection, "elements");
        return this.f36869b.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f36868a.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return nk.j.a(this);
    }

    public final String toString() {
        return this.f36868a.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        nk.k.e(objArr, "array");
        return nk.j.b(this, objArr);
    }
}
