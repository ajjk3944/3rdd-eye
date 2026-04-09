package D3;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: D3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2575p extends AbstractC2567h {

    /* renamed from: g, reason: collision with root package name */
    static final AbstractC2567h f2874g = new C2575p(null, new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    private final transient Object f2875d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f2876e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f2877f;

    private C2575p(Object obj, Object[] objArr, int i10) {
        this.f2875d = obj;
        this.f2876e = objArr;
        this.f2877f = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    static C2575p p(int i10, Object[] objArr, AbstractC2566g abstractC2566g) {
        int iHighestOneBit;
        short[] sArr;
        char c10;
        Object[] objArr2;
        int i11 = i10;
        if (i11 == 0) {
            return (C2575p) f2874g;
        }
        Object obj = null;
        if (i11 == 1) {
            Object obj2 = objArr[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArr[1];
            Objects.requireNonNull(obj3);
            T.a(obj2, obj3);
            return new C2575p(null, objArr, 1);
        }
        P.b(i11, objArr.length >> 1, "index");
        int iMax = Math.max(i11, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (iHighestOneBit * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i11 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArr[1];
            Objects.requireNonNull(obj5);
            T.a(obj4, obj5);
            i11 = 1;
            c10 = 2;
        } else {
            int i12 = iHighestOneBit - 1;
            char c11 = 65535;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i13 = 0;
                for (int i14 = 0; i14 < i11; i14++) {
                    int i15 = i13 + i13;
                    int i16 = i14 + i14;
                    Object obj6 = objArr[i16];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArr[i16 ^ 1];
                    Objects.requireNonNull(obj7);
                    T.a(obj6, obj7);
                    int iA = V.a(obj6.hashCode());
                    while (true) {
                        int i17 = iA & i12;
                        int i18 = bArr[i17] & 255;
                        if (i18 == 255) {
                            bArr[i17] = (byte) i15;
                            if (i13 < i14) {
                                objArr[i15] = obj6;
                                objArr[i15 ^ 1] = obj7;
                            }
                            i13++;
                        } else {
                            if (obj6.equals(objArr[i18])) {
                                int i19 = i18 ^ 1;
                                Object obj8 = objArr[i19];
                                Objects.requireNonNull(obj8);
                                C2565f c2565f = new C2565f(obj6, obj7, obj8);
                                objArr[i19] = obj7;
                                obj = c2565f;
                                break;
                            }
                            iA = i17 + 1;
                        }
                    }
                }
                if (i13 == i11) {
                    obj = bArr;
                    c10 = 2;
                } else {
                    c10 = 2;
                    obj = new Object[]{bArr, Integer.valueOf(i13), obj};
                }
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                Arrays.fill(sArr, (short) -1);
                int i20 = 0;
                for (int i21 = 0; i21 < i11; i21++) {
                    int i22 = i20 + i20;
                    int i23 = i21 + i21;
                    Object obj9 = objArr[i23];
                    Objects.requireNonNull(obj9);
                    Object obj10 = objArr[i23 ^ 1];
                    Objects.requireNonNull(obj10);
                    T.a(obj9, obj10);
                    int iA2 = V.a(obj9.hashCode());
                    while (true) {
                        int i24 = iA2 & i12;
                        char c12 = (char) sArr[i24];
                        if (c12 == 65535) {
                            sArr[i24] = (short) i22;
                            if (i20 < i21) {
                                objArr[i22] = obj9;
                                objArr[i22 ^ 1] = obj10;
                            }
                            i20++;
                        } else {
                            if (obj9.equals(objArr[c12])) {
                                int i25 = c12 ^ 1;
                                Object obj11 = objArr[i25];
                                Objects.requireNonNull(obj11);
                                C2565f c2565f2 = new C2565f(obj9, obj10, obj11);
                                objArr[i25] = obj10;
                                obj = c2565f2;
                                break;
                            }
                            iA2 = i24 + 1;
                        }
                    }
                }
                if (i20 != i11) {
                    c10 = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i20), obj};
                    obj = objArr2;
                }
                obj = sArr;
                c10 = 2;
            } else {
                sArr = new int[iHighestOneBit];
                Arrays.fill((int[]) sArr, -1);
                int i26 = 0;
                int i27 = 0;
                while (i26 < i11) {
                    int i28 = i27 + i27;
                    int i29 = i26 + i26;
                    Object obj12 = objArr[i29];
                    Objects.requireNonNull(obj12);
                    Object obj13 = objArr[i29 ^ 1];
                    Objects.requireNonNull(obj13);
                    T.a(obj12, obj13);
                    int iA3 = V.a(obj12.hashCode());
                    while (true) {
                        int i30 = iA3 & i12;
                        ?? r15 = sArr[i30];
                        if (r15 == c11) {
                            sArr[i30] = i28;
                            if (i27 < i26) {
                                objArr[i28] = obj12;
                                objArr[i28 ^ 1] = obj13;
                            }
                            i27++;
                        } else {
                            if (obj12.equals(objArr[r15])) {
                                int i31 = r15 ^ 1;
                                Object obj14 = objArr[i31];
                                Objects.requireNonNull(obj14);
                                C2565f c2565f3 = new C2565f(obj12, obj13, obj14);
                                objArr[i31] = obj13;
                                obj = c2565f3;
                                break;
                            }
                            iA3 = i30 + 1;
                            c11 = 65535;
                        }
                    }
                    i26++;
                    c11 = 65535;
                }
                if (i27 != i11) {
                    c10 = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i27), obj};
                    obj = objArr2;
                }
                obj = sArr;
                c10 = 2;
            }
        }
        if (obj instanceof Object[]) {
            throw ((C2565f) ((Object[]) obj)[c10]).a();
        }
        return new C2575p(obj, objArr, i11);
    }

    @Override // D3.AbstractC2567h
    final AbstractC2561b d() {
        return new C2574o(this.f2876e, 1, this.f2877f);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // D3.AbstractC2567h, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.f2877f
            java.lang.Object[] r2 = r9.f2876e
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.f2875d
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = D3.V.a(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = D3.V.a(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = D3.V.a(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.C2575p.get(java.lang.Object):java.lang.Object");
    }

    @Override // D3.AbstractC2567h
    final AbstractC2568i j() {
        return new C2572m(this, this.f2876e, 0, this.f2877f);
    }

    @Override // D3.AbstractC2567h
    final AbstractC2568i l() {
        return new C2573n(this, new C2574o(this.f2876e, 0, this.f2877f));
    }

    @Override // java.util.Map
    public final int size() {
        return this.f2877f;
    }
}
