package M0;

import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final Layout f12340a;

    /* renamed from: b, reason: collision with root package name */
    private final List f12341b;

    /* renamed from: c, reason: collision with root package name */
    private final List f12342c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean[] f12343d;

    /* renamed from: e, reason: collision with root package name */
    private char[] f12344e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12345f;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f12346a;

        /* renamed from: b, reason: collision with root package name */
        private final int f12347b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f12348c;

        public a(int i10, int i11, boolean z10) {
            this.f12346a = i10;
            this.f12347b = i11;
            this.f12348c = z10;
        }

        public final int a() {
            return this.f12347b;
        }

        public final int b() {
            return this.f12346a;
        }

        public final boolean c() {
            return this.f12348c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f12346a == aVar.f12346a && this.f12347b == aVar.f12347b && this.f12348c == aVar.f12348c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f12346a) * 31) + Integer.hashCode(this.f12347b)) * 31) + Boolean.hashCode(this.f12348c);
        }

        public String toString() {
            return "BidiRun(start=" + this.f12346a + ", end=" + this.f12347b + ", isRtl=" + this.f12348c + ')';
        }
    }

    public G(Layout layout) {
        this.f12340a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iJ0 = kotlin.text.t.j0(this.f12340a.getText(), '\n', length, false, 4, null);
            length = iJ0 < 0 ? this.f12340a.getText().length() : iJ0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f12340a.getText().length());
        this.f12341b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f12342c = arrayList2;
        this.f12343d = new boolean[this.f12341b.size()];
        this.f12345f = this.f12341b.size();
    }

    private final float b(int i10, boolean z10) {
        int iG = AbstractC7978m.g(i10, this.f12340a.getLineEnd(this.f12340a.getLineForOffset(i10)));
        return z10 ? this.f12340a.getPrimaryHorizontal(iG) : this.f12340a.getSecondaryHorizontal(iG);
    }

    public static /* synthetic */ int g(G g10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return g10.f(i10, z10);
    }

    private final int k(int i10, int i11) {
        while (i10 > i11 && i(this.f12340a.getText().charAt(i10 - 1))) {
            i10--;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi a(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.f12343d
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List r0 = r11.f12342c
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = r0
            goto L22
        L14:
            java.util.List r1 = r11.f12341b
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List r2 = r11.f12341b
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.f12344e
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r10 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r11.f12340a
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            boolean r9 = r11.j(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L63
        L62:
            r0 = r1
        L63:
            java.util.List r3 = r11.f12342c
            r3.set(r12, r0)
            boolean[] r3 = r11.f12343d
            r3[r12] = r2
            if (r0 == 0) goto L75
            char[] r12 = r11.f12344e
            if (r10 != r12) goto L74
            r10 = r1
            goto L75
        L74:
            r10 = r12
        L75:
            r11.f12344e = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.G.a(int):java.text.Bidi");
    }

    public final float c(int i10, boolean z10, boolean z11) {
        int iK = i10;
        if (!z11) {
            return b(i10, z10);
        }
        int iA = F.a(this.f12340a, iK, z11);
        int lineStart = this.f12340a.getLineStart(iA);
        int lineEnd = this.f12340a.getLineEnd(iA);
        if (iK != lineStart && iK != lineEnd) {
            return b(i10, z10);
        }
        if (iK == 0 || iK == this.f12340a.getText().length()) {
            return b(i10, z10);
        }
        int iF = f(iK, z11);
        boolean zJ = j(iF);
        int iK2 = k(lineEnd, lineStart);
        int iH = h(iF);
        int i11 = lineStart - iH;
        int i12 = iK2 - iH;
        Bidi bidiA = a(iF);
        Bidi bidiCreateLineBidi = bidiA != null ? bidiA.createLineBidi(i11, i12) : null;
        boolean z12 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = this.f12340a.isRtlCharAt(lineStart);
            if (z10 || zJ == zIsRtlCharAt) {
                zJ = !zJ;
            }
            if (iK == lineStart) {
                z12 = zJ;
            } else if (!zJ) {
                z12 = true;
            }
            Layout layout = this.f12340a;
            return z12 ? layout.getLineLeft(iA) : layout.getLineRight(iA);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            aVarArr[i13] = new a(bidiCreateLineBidi.getRunStart(i13) + lineStart, bidiCreateLineBidi.getRunLimit(i13) + lineStart, bidiCreateLineBidi.getRunLevel(i13) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i14 = 0; i14 < runCount2; i14++) {
            bArr[i14] = (byte) bidiCreateLineBidi.getRunLevel(i14);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i15 = -1;
        if (iK == lineStart) {
            int i16 = 0;
            while (true) {
                if (i16 >= runCount) {
                    break;
                }
                if (aVarArr[i16].b() == iK) {
                    i15 = i16;
                    break;
                }
                i16++;
            }
            a aVar = aVarArr[i15];
            if (z10 || zJ == aVar.c()) {
                zJ = !zJ;
            }
            return (i15 == 0 && zJ) ? this.f12340a.getLineLeft(iA) : (i15 != AbstractC3682n.g0(aVarArr) || zJ) ? zJ ? this.f12340a.getPrimaryHorizontal(aVarArr[i15 - 1].b()) : this.f12340a.getPrimaryHorizontal(aVarArr[i15 + 1].b()) : this.f12340a.getLineRight(iA);
        }
        if (iK > iK2) {
            iK = k(iK, lineStart);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= runCount) {
                break;
            }
            if (aVarArr[i17].a() == iK) {
                i15 = i17;
                break;
            }
            i17++;
        }
        a aVar2 = aVarArr[i15];
        if (!z10 && zJ != aVar2.c()) {
            zJ = !zJ;
        }
        return (i15 == 0 && zJ) ? this.f12340a.getLineLeft(iA) : (i15 != AbstractC3682n.g0(aVarArr) || zJ) ? zJ ? this.f12340a.getPrimaryHorizontal(aVarArr[i15 - 1].a()) : this.f12340a.getPrimaryHorizontal(aVarArr[i15 + 1].a()) : this.f12340a.getLineRight(iA);
    }

    public final a[] d(int i10) {
        Bidi bidiCreateLineBidi;
        int lineStart = this.f12340a.getLineStart(i10);
        int lineEnd = this.f12340a.getLineEnd(i10);
        int iG = g(this, lineStart, false, 2, null);
        int iH = h(iG);
        int i11 = lineStart - iH;
        int i12 = lineEnd - iH;
        Bidi bidiA = a(iG);
        if (bidiA == null || (bidiCreateLineBidi = bidiA.createLineBidi(i11, i12)) == null) {
            return new a[]{new a(lineStart, lineEnd, this.f12340a.isRtlCharAt(lineStart))};
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            int runStart = bidiCreateLineBidi.getRunStart(i13) + lineStart;
            int runLimit = bidiCreateLineBidi.getRunLimit(i13) + lineStart;
            boolean z10 = true;
            if (bidiCreateLineBidi.getRunLevel(i13) % 2 != 1) {
                z10 = false;
            }
            aVarArr[i13] = new a(runStart, runLimit, z10);
        }
        return aVarArr;
    }

    public final int e(int i10) {
        return k(this.f12340a.getLineEnd(i10), this.f12340a.getLineStart(i10));
    }

    public final int f(int i10, boolean z10) {
        int iK = AbstractC3689v.k(this.f12341b, Integer.valueOf(i10), 0, 0, 6, null);
        int i11 = iK < 0 ? -(iK + 1) : iK + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) this.f12341b.get(i12)).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public final int h(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((Number) this.f12341b.get(i10 - 1)).intValue();
    }

    public final boolean i(char c10) {
        return c10 == ' ' || c10 == '\n' || c10 == 5760 || (AbstractC6492s.k(c10, 8192) >= 0 && AbstractC6492s.k(c10, 8202) <= 0 && c10 != 8199) || c10 == 8287 || c10 == 12288;
    }

    public final boolean j(int i10) {
        return this.f12340a.getParagraphDirection(this.f12340a.getLineForOffset(h(i10))) == -1;
    }
}
