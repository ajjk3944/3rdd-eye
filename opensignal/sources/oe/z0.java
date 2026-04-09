package oe;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class z0 implements Map, Serializable {
    public static final z0 B = new z0(0, null, new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public transient w0 f19406a;

    /* renamed from: d, reason: collision with root package name */
    public transient x0 f19407d;

    /* renamed from: g, reason: collision with root package name */
    public transient y0 f19408g;

    /* renamed from: r, reason: collision with root package name */
    public final transient Object f19409r;

    /* renamed from: x, reason: collision with root package name */
    public final transient Object[] f19410x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f19411y;

    public z0(int i10, Object obj, Object[] objArr) {
        this.f19409r = obj;
        this.f19410x = objArr;
        this.f19411y = i10;
    }

    public static z0 a(Map map) {
        if ((map instanceof z0) && !(map instanceof SortedMap)) {
            return (z0) map;
        }
        Set setEntrySet = map.entrySet();
        bc.f0 f0Var = new bc.f0(setEntrySet instanceof Collection ? setEntrySet.size() : 4, 8);
        f0Var.s(setEntrySet);
        return f0Var.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0199  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static oe.z0 b(int r19, java.lang.Object[] r20, bc.f0 r21) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.z0.b(int, java.lang.Object[], bc.f0):oe.z0");
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final k0 entrySet() {
        w0 w0Var = this.f19406a;
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0(this, this.f19410x, this.f19411y);
        this.f19406a = w0Var2;
        return w0Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final k0 keySet() {
        x0 x0Var = this.f19407d;
        if (x0Var != null) {
            return x0Var;
        }
        x0 x0Var2 = new x0(this, new y0(this.f19410x, 0, this.f19411y));
        this.f19407d = x0Var2;
        return x0Var2;
    }

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final c0 values() {
        y0 y0Var = this.f19408g;
        if (y0Var != null) {
            return y0Var;
        }
        y0 y0Var2 = new y0(this.f19410x, 1, this.f19411y);
        this.f19408g = y0Var2;
        return y0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return s.e(this, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0037->B:22:0x004d], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0062->B:32:0x0079], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0088->B:43:0x00a0]] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L6
        L3:
            r9 = r0
            goto L9c
        L6:
            java.lang.Object[] r1 = r8.f19410x
            int r2 = r8.f19411y
            r3 = 1
            if (r2 != r3) goto L20
            r2 = 0
            r2 = r1[r2]
            java.util.Objects.requireNonNull(r2)
            boolean r9 = r2.equals(r9)
            if (r9 == 0) goto L3
            r9 = r1[r3]
            java.util.Objects.requireNonNull(r9)
            goto L9c
        L20:
            java.lang.Object r2 = r8.f19409r
            if (r2 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L50
            r4 = r2
            byte[] r4 = (byte[]) r4
            int r2 = r4.length
            int r5 = r2 + (-1)
            int r2 = r9.hashCode()
            int r2 = oe.s.r(r2)
        L37:
            r2 = r2 & r5
            r6 = r4[r2]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L40
            goto L3
        L40:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4d
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L4d:
            int r2 = r2 + 1
            goto L37
        L50:
            boolean r4 = r2 instanceof short[]
            if (r4 == 0) goto L7c
            r4 = r2
            short[] r4 = (short[]) r4
            int r2 = r4.length
            int r5 = r2 + (-1)
            int r2 = r9.hashCode()
            int r2 = oe.s.r(r2)
        L62:
            r2 = r2 & r5
            short r6 = r4[r2]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6c
            goto L3
        L6c:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L79
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9c
        L79:
            int r2 = r2 + 1
            goto L62
        L7c:
            int[] r2 = (int[]) r2
            int r4 = r2.length
            int r4 = r4 - r3
            int r5 = r9.hashCode()
            int r5 = oe.s.r(r5)
        L88:
            r5 = r5 & r4
            r6 = r2[r5]
            r7 = -1
            if (r6 != r7) goto L90
            goto L3
        L90:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto La0
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9c:
            if (r9 != 0) goto L9f
            return r0
        L9f:
            return r9
        La0:
            int r5 = r5 + 1
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.z0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return s.k(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19411y;
    }

    public final String toString() {
        int i10 = this.f19411y;
        s.c(i10, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
        sb2.append('{');
        h1 h1VarJ = ((w0) entrySet()).iterator();
        boolean z10 = true;
        while (true) {
            f0 f0Var = (f0) h1VarJ;
            if (!f0Var.hasNext()) {
                sb2.append('}');
                return sb2.toString();
            }
            Map.Entry entry = (Map.Entry) f0Var.next();
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z10 = false;
        }
    }
}
