package I;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import l0.C6533i;
import sh.AbstractC7978m;

/* loaded from: classes.dex */
public abstract class E {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder a(android.view.inputmethod.CursorAnchorInfo.Builder r14, int r15, int r16, L0.M r17, l0.C6533i r18) {
        /*
            r0 = r16
            r1 = r18
            int r2 = r0 - r15
            int r2 = r2 * 4
            float[] r2 = new float[r2]
            L0.k r3 = r17.w()
            long r4 = L0.T.b(r15, r16)
            r6 = 0
            r3.a(r4, r2, r6)
            r3 = r15
        L17:
            if (r3 >= r0) goto L7a
            int r4 = r3 - r15
            int r4 = r4 * 4
            l0.i r5 = new l0.i
            r6 = r2[r4]
            int r7 = r4 + 1
            r7 = r2[r7]
            int r8 = r4 + 2
            r8 = r2[r8]
            int r4 = r4 + 3
            r4 = r2[r4]
            r5.<init>(r6, r7, r8, r4)
            boolean r4 = r1.v(r5)
            float r6 = r5.k()
            float r7 = r5.n()
            boolean r6 = I.L0.c(r1, r6, r7)
            if (r6 == 0) goto L54
            float r6 = r5.l()
            float r7 = r5.e()
            boolean r6 = I.L0.c(r1, r6, r7)
            if (r6 != 0) goto L51
            goto L54
        L51:
            r6 = r17
            goto L57
        L54:
            r4 = r4 | 2
            goto L51
        L57:
            W0.i r7 = r6.c(r3)
            W0.i r8 = W0.i.Rtl
            if (r7 != r8) goto L61
            r4 = r4 | 4
        L61:
            r13 = r4
            float r9 = r5.k()
            float r10 = r5.n()
            float r11 = r5.l()
            float r12 = r5.e()
            r7 = r14
            r8 = r3
            r7.addCharacterBounds(r8, r9, r10, r11, r12, r13)
            int r3 = r3 + 1
            goto L17
        L7a:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: I.E.a(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, L0.M, l0.i):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, CharSequence charSequence, long j10, L0.S s10, L0.M m10, Matrix matrix, C6533i c6533i, C6533i c6533i2, boolean z10, boolean z11, boolean z12, boolean z13) {
        builder.reset();
        builder.setMatrix(matrix);
        int iL = L0.S.l(j10);
        builder.setSelectionRange(iL, L0.S.k(j10));
        if (z10) {
            c(builder, iL, m10, c6533i);
        }
        if (z11) {
            int iL2 = s10 != null ? L0.S.l(s10.r()) : -1;
            int iK = s10 != null ? L0.S.k(s10.r()) : -1;
            if (iL2 >= 0 && iL2 < iK) {
                builder.setComposingText(iL2, charSequence.subSequence(iL2, iK));
                a(builder, iL2, iK, m10, c6533i);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && z12) {
            B.a(builder, c6533i2);
        }
        if (i10 >= 34 && z13) {
            D.a(builder, m10, c6533i);
        }
        return builder.build();
    }

    private static final CursorAnchorInfo.Builder c(CursorAnchorInfo.Builder builder, int i10, L0.M m10, C6533i c6533i) {
        if (i10 < 0) {
            return builder;
        }
        C6533i c6533iE = m10.e(i10);
        float fJ = AbstractC7978m.j(c6533iE.k(), 0.0f, Y0.r.g(m10.B()));
        boolean zC = L0.c(c6533i, fJ, c6533iE.n());
        boolean zC2 = L0.c(c6533i, fJ, c6533iE.e());
        boolean z10 = m10.c(i10) == W0.i.Rtl;
        int i11 = (zC || zC2) ? 1 : 0;
        if (!zC || !zC2) {
            i11 |= 2;
        }
        builder.setInsertionMarkerLocation(fJ, c6533iE.n(), c6533iE.e(), c6533iE.e(), z10 ? i11 | 4 : i11);
        return builder;
    }
}
