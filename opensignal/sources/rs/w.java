package rs;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

/* loaded from: classes.dex */
public class w extends e {

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f21779d;

    /* renamed from: g, reason: collision with root package name */
    public int f21780g = 0;

    public w(byte[] bArr) {
        this.f21779d = bArr;
    }

    @Override // rs.e
    public void d(int i10, int i11, int i12, byte[] bArr) {
        System.arraycopy(this.f21779d, i10, bArr, i11, i12);
    }

    @Override // rs.e
    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e) || size() != ((e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof w) {
            return s((w) obj, 0, size());
        }
        if (obj instanceof a0) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(w.g.j(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    @Override // rs.e
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        int iL = this.f21780g;
        if (iL == 0) {
            int size = size();
            iL = l(size, 0, size);
            if (iL == 0) {
                iL = 1;
            }
            this.f21780g = iL;
        }
        return iL;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.d(this);
    }

    @Override // rs.e
    public final boolean j() {
        byte[] bArr = this.f21779d;
        return e0.c(bArr, 0, bArr.length) == 0;
    }

    @Override // rs.e
    public final int l(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f21779d[i13];
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0[r9] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r0[r8] > (-65)) goto L59;
     */
    @Override // rs.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m(int r8, int r9, int r10) {
        /*
            r7 = this;
            int r10 = r10 + r9
            byte[] r0 = r7.f21779d
            if (r8 == 0) goto L95
            if (r9 < r10) goto L8
            return r8
        L8:
            byte r1 = (byte) r8
            r2 = -32
            r3 = -1
            r4 = -65
            if (r1 >= r2) goto L1f
            r8 = -62
            if (r1 < r8) goto L94
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r4) goto L1c
            goto L94
        L1c:
            r9 = r8
            goto L95
        L1f:
            r5 = -16
            if (r1 >= r5) goto L4c
            int r8 = r8 >> 8
            int r8 = ~r8
            byte r8 = (byte) r8
            if (r8 != 0) goto L37
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r8 < r10) goto L34
            int r8 = rs.e0.a(r1, r9)
            return r8
        L34:
            r6 = r9
            r9 = r8
            r8 = r6
        L37:
            if (r8 > r4) goto L94
            r5 = -96
            if (r1 != r2) goto L3f
            if (r8 < r5) goto L94
        L3f:
            r2 = -19
            if (r1 != r2) goto L45
            if (r8 >= r5) goto L94
        L45:
            int r8 = r9 + 1
            r9 = r0[r9]
            if (r9 <= r4) goto L1c
            goto L94
        L4c:
            int r2 = r8 >> 8
            int r2 = ~r2
            byte r2 = (byte) r2
            if (r2 != 0) goto L5f
            int r8 = r9 + 1
            r2 = r0[r9]
            if (r8 < r10) goto L5d
            int r8 = rs.e0.a(r1, r2)
            return r8
        L5d:
            r9 = 0
            goto L65
        L5f:
            int r8 = r8 >> 16
            byte r8 = (byte) r8
            r6 = r9
            r9 = r8
            r8 = r6
        L65:
            if (r9 != 0) goto L81
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r9 < r10) goto L7e
            r9 = -12
            if (r1 > r9) goto L7d
            if (r2 > r4) goto L7d
            if (r8 <= r4) goto L76
            goto L7d
        L76:
            int r9 = r2 << 8
            r9 = r9 ^ r1
            int r8 = r8 << 16
            r8 = r8 ^ r9
            return r8
        L7d:
            return r3
        L7e:
            r6 = r9
            r9 = r8
            r8 = r6
        L81:
            if (r2 > r4) goto L94
            int r1 = r1 << 28
            int r2 = r2 + 112
            int r2 = r2 + r1
            int r1 = r2 >> 30
            if (r1 != 0) goto L94
            if (r9 > r4) goto L94
            int r9 = r8 + 1
            r8 = r0[r8]
            if (r8 <= r4) goto L95
        L94:
            return r3
        L95:
            int r8 = rs.e0.c(r0, r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rs.w.m(int, int, int):int");
    }

    @Override // rs.e
    public final int n() {
        return this.f21780g;
    }

    @Override // rs.e
    public final String o() {
        byte[] bArr = this.f21779d;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // rs.e
    public final void r(OutputStream outputStream, int i10, int i11) throws IOException {
        outputStream.write(this.f21779d, i10, i11);
    }

    public final boolean s(w wVar, int i10, int i11) {
        byte[] bArr = wVar.f21779d;
        int length = bArr.length;
        byte[] bArr2 = this.f21779d;
        if (i11 > length) {
            int length2 = bArr2.length;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(length2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 + i11 <= bArr.length) {
            int i12 = 0;
            while (i12 < i11) {
                if (bArr2[i12] != bArr[i10]) {
                    return false;
                }
                i12++;
                i10++;
            }
            return true;
        }
        int length3 = wVar.f21779d.length;
        StringBuilder sb3 = new StringBuilder(59);
        sb3.append("Ran off end of other: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new IllegalArgumentException(c7.a.l(length3, ", ", sb3));
    }

    @Override // rs.e
    public int size() {
        return this.f21779d.length;
    }
}
