package R0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import l0.C6533i;
import sh.AbstractC7978m;

/* renamed from: R0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3451d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final android.view.inputmethod.CursorAnchorInfo.Builder a(android.view.inputmethod.CursorAnchorInfo.Builder r17, int r18, int r19, R0.H r20, L0.M r21, l0.C6533i r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = r18
            r3 = r22
            int r4 = r1.b(r2)
            int r5 = r1.b(r0)
            int r6 = r5 - r4
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            L0.k r7 = r21.w()
            long r8 = L0.T.b(r4, r5)
            r5 = 0
            r7.a(r8, r6, r5)
        L22:
            if (r2 >= r0) goto L8e
            int r5 = r1.b(r2)
            int r7 = r5 - r4
            int r7 = r7 * 4
            l0.i r8 = new l0.i
            r9 = r6[r7]
            int r10 = r7 + 1
            r10 = r6[r10]
            int r11 = r7 + 2
            r11 = r6[r11]
            int r7 = r7 + 3
            r7 = r6[r7]
            r8.<init>(r9, r10, r11, r7)
            boolean r7 = r3.v(r8)
            float r9 = r8.k()
            float r10 = r8.n()
            boolean r9 = c(r3, r9, r10)
            if (r9 == 0) goto L63
            float r9 = r8.l()
            float r10 = r8.e()
            boolean r9 = c(r3, r9, r10)
            if (r9 != 0) goto L60
            goto L63
        L60:
            r9 = r21
            goto L66
        L63:
            r7 = r7 | 2
            goto L60
        L66:
            W0.i r5 = r9.c(r5)
            W0.i r10 = W0.i.Rtl
            if (r5 != r10) goto L73
            r5 = r7 | 4
            r16 = r5
            goto L75
        L73:
            r16 = r7
        L75:
            float r12 = r8.k()
            float r13 = r8.n()
            float r14 = r8.l()
            float r15 = r8.e()
            r10 = r17
            r11 = r2
            r10.addCharacterBounds(r11, r12, r13, r14, r15, r16)
            int r2 = r2 + 1
            goto L22
        L8e:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.AbstractC3451d.a(android.view.inputmethod.CursorAnchorInfo$Builder, int, int, R0.H, L0.M, l0.i):android.view.inputmethod.CursorAnchorInfo$Builder");
    }

    public static final CursorAnchorInfo b(CursorAnchorInfo.Builder builder, Q q10, H h10, L0.M m10, Matrix matrix, C6533i c6533i, C6533i c6533i2, boolean z10, boolean z11, boolean z12, boolean z13) {
        builder.reset();
        builder.setMatrix(matrix);
        int iL = L0.S.l(q10.h());
        builder.setSelectionRange(iL, L0.S.k(q10.h()));
        if (z10) {
            d(builder, iL, h10, m10, c6533i);
        }
        if (z11) {
            L0.S sG = q10.g();
            int iL2 = sG != null ? L0.S.l(sG.r()) : -1;
            L0.S sG2 = q10.g();
            int iK = sG2 != null ? L0.S.k(sG2.r()) : -1;
            if (iL2 >= 0 && iL2 < iK) {
                builder.setComposingText(iL2, q10.i().subSequence(iL2, iK));
                a(builder, iL2, iK, h10, m10, c6533i);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && z12) {
            C3449b.a(builder, c6533i2);
        }
        if (i10 >= 34 && z13) {
            C3450c.a(builder, m10, c6533i);
        }
        return builder.build();
    }

    private static final boolean c(C6533i c6533i, float f10, float f11) {
        float fK = c6533i.k();
        if (f10 <= c6533i.l() && fK <= f10) {
            float fN = c6533i.n();
            if (f11 <= c6533i.e() && fN <= f11) {
                return true;
            }
        }
        return false;
    }

    private static final CursorAnchorInfo.Builder d(CursorAnchorInfo.Builder builder, int i10, H h10, L0.M m10, C6533i c6533i) {
        if (i10 < 0) {
            return builder;
        }
        int iB = h10.b(i10);
        C6533i c6533iE = m10.e(iB);
        float fJ = AbstractC7978m.j(c6533iE.k(), 0.0f, Y0.r.g(m10.B()));
        boolean zC = c(c6533i, fJ, c6533iE.n());
        boolean zC2 = c(c6533i, fJ, c6533iE.e());
        boolean z10 = m10.c(iB) == W0.i.Rtl;
        int i11 = (zC || zC2) ? 1 : 0;
        if (!zC || !zC2) {
            i11 |= 2;
        }
        builder.setInsertionMarkerLocation(fJ, c6533iE.n(), c6533iE.e(), c6533iE.e(), z10 ? i11 | 4 : i11);
        return builder;
    }
}
