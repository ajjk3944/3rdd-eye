package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.os.Handler;
import android.os.RemoteException;
import android.util.SparseArray;
import android.webkit.WebView;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class uk1 implements kk1, ws2 {
    public static final byte[] m = {0, 7, 8, 15};
    public static final byte[] n = {0, 119, -120, -1};
    public static final byte[] o = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public /* synthetic */ uk1(boolean z) {
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
    }

    public static nk1 k(lg1 lg1Var, int i) {
        int iR;
        int iR2;
        int iR3;
        int iR4;
        int i2 = 8;
        int iR5 = lg1Var.r(8);
        lg1Var.o(8);
        int i3 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrM = m();
        int[] iArrP = p();
        int i4 = i - 2;
        while (i4 > 0) {
            int iR6 = lg1Var.r(i2);
            int iR7 = lg1Var.r(i2);
            int[] iArr2 = (iR7 & 128) != 0 ? iArr : (iR7 & 64) != 0 ? iArrM : iArrP;
            if ((iR7 & 1) != 0) {
                iR3 = lg1Var.r(i2);
                iR4 = lg1Var.r(i2);
                iR = lg1Var.r(i2);
                iR2 = lg1Var.r(i2);
                i4 -= 6;
            } else {
                int iR8 = lg1Var.r(6) << 2;
                int iR9 = lg1Var.r(4) << 4;
                i4 -= 4;
                iR = lg1Var.r(4) << 4;
                iR2 = lg1Var.r(2) << 6;
                iR3 = iR8;
                iR4 = iR9;
            }
            if (iR3 == 0) {
                iR2 = 255;
            }
            if (iR3 == 0) {
                iR = i3;
            }
            if (iR3 == 0) {
                iR4 = i3;
            }
            double d = iR3;
            String str = v23.a;
            double d2 = iR4 - 128;
            double d3 = iR - 128;
            iArr2[iR6] = q((byte) (255 - (iR2 & 255)), Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255)));
            i3 = 0;
            iR5 = iR5;
            iArrP = iArrP;
            i2 = 8;
        }
        return new nk1(iR5, iArr, iArrM, iArrP);
    }

    public static pk1 l(lg1 lg1Var) {
        byte[] bArr;
        int iR = lg1Var.r(16);
        lg1Var.o(4);
        int iR2 = lg1Var.r(2);
        boolean zQ = lg1Var.q();
        lg1Var.o(1);
        byte[] bArr2 = v23.b;
        if (iR2 != 1) {
            if (iR2 == 0) {
                int iR3 = lg1Var.r(16);
                int iR4 = lg1Var.r(16);
                if (iR3 > 0) {
                    bArr2 = new byte[iR3];
                    zt0.b0(lg1Var.c == 0);
                    System.arraycopy(lg1Var.a, lg1Var.b, bArr2, 0, iR3);
                    lg1Var.b += iR3;
                    lg1Var.y();
                }
                if (iR4 > 0) {
                    bArr = new byte[iR4];
                    zt0.b0(lg1Var.c == 0);
                    System.arraycopy(lg1Var.a, lg1Var.b, bArr, 0, iR4);
                    lg1Var.b += iR4;
                    lg1Var.y();
                }
            }
            return new pk1(iR, zQ, bArr2, bArr);
        }
        lg1Var.o(lg1Var.r(8) * 16);
        bArr = bArr2;
        return new pk1(iR, zQ, bArr2, bArr);
    }

    public static int[] m() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = q(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                iArr[i] = q(255, 1 != i4 ? 0 : 127, i3 != 0 ? 127 : 0, i2 == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] p() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = q(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = q(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = q(127, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = q(255, (1 != (i & 1) ? 0 : 43) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = q(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int q(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201 A[LOOP:3: B:89:0x0163->B:122:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void r(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uk1.r(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static byte[] s(int i, int i2, lg1 lg1Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) lg1Var.r(i2);
        }
        return bArr;
    }

    public void b(float f, float f2, z90 z90Var) {
        float[] fArr = (float[]) this.k;
        fArr[0] = f;
        fArr[1] = f2;
        d(fArr);
        z90Var.g = fArr[0];
        z90Var.h = fArr[1];
    }

    public void c(Path path) {
        path.transform((Matrix) this.f);
        path.transform(((u61) this.h).a);
        path.transform((Matrix) this.g);
    }

    public void d(float[] fArr) {
        Matrix matrix = (Matrix) this.j;
        matrix.reset();
        ((Matrix) this.g).invert(matrix);
        matrix.mapPoints(fArr);
        ((u61) this.h).a.invert(matrix);
        matrix.mapPoints(fArr);
        ((Matrix) this.f).invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void e(float[] fArr) {
        ((Matrix) this.f).mapPoints(fArr);
        ((u61) this.h).a.mapPoints(fArr);
        ((Matrix) this.g).mapPoints(fArr);
    }

    public void f() {
        u61 u61Var = (u61) this.h;
        Matrix matrix = (Matrix) this.g;
        matrix.reset();
        RectF rectF = u61Var.b;
        float f = rectF.left;
        float f2 = u61Var.d;
        matrix.postTranslate(f, f2 - (f2 - rectF.bottom));
    }

    @Override // defpackage.kk1
    public void g(byte[] bArr, int i, int i2, lk1 lk1Var) {
        boolean z;
        gk1 gk1Var;
        char c;
        char c2;
        char c3;
        int i3;
        int i4;
        int i5;
        tk1 tk1Var;
        rk1 rk1Var;
        SparseArray sparseArray;
        ok1 ok1Var;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList;
        int i9;
        rk1 rk1Var2;
        int iR;
        int iR2;
        int i10;
        int iR3;
        Canvas canvas = (Canvas) this.h;
        tk1 tk1Var2 = (tk1) this.k;
        lg1 lg1Var = new lg1(i + i2, bArr);
        lg1Var.l(i);
        while (true) {
            z = true;
            if (lg1Var.f() >= 48 && lg1Var.r(8) == 15) {
                int iR4 = lg1Var.r(8);
                int i11 = 16;
                int iR5 = lg1Var.r(16);
                int iR6 = lg1Var.r(16);
                int i12 = lg1Var.i() + iR6;
                if (iR6 * 8 > lg1Var.f()) {
                    a30.x("Data field length exceeds limit");
                    lg1Var.o(lg1Var.f());
                } else {
                    switch (iR4) {
                        case 16:
                            if (iR5 == tk1Var2.a) {
                                pi1 pi1Var = tk1Var2.i;
                                lg1Var.r(8);
                                int iR7 = lg1Var.r(4);
                                int iR8 = lg1Var.r(2);
                                lg1Var.o(2);
                                SparseArray sparseArray2 = new SparseArray();
                                for (int i13 = iR6 - 2; i13 > 0; i13 -= 6) {
                                    int iR9 = lg1Var.r(8);
                                    lg1Var.o(8);
                                    sparseArray2.put(iR9, new qk1(lg1Var.r(16), lg1Var.r(16)));
                                }
                                pi1 pi1Var2 = new pi1(iR7, sparseArray2, iR8);
                                if (iR8 != 0) {
                                    tk1Var2.i = pi1Var2;
                                    tk1Var2.c.clear();
                                    tk1Var2.d.clear();
                                    tk1Var2.e.clear();
                                    break;
                                } else if (pi1Var != null && pi1Var.f != iR7) {
                                    tk1Var2.i = pi1Var2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            pi1 pi1Var3 = tk1Var2.i;
                            SparseArray sparseArray3 = tk1Var2.c;
                            if (iR5 == tk1Var2.a && pi1Var3 != null) {
                                int iR10 = lg1Var.r(8);
                                lg1Var.o(4);
                                boolean zQ = lg1Var.q();
                                lg1Var.o(3);
                                int iR11 = lg1Var.r(16);
                                int iR12 = lg1Var.r(16);
                                lg1Var.r(3);
                                int iR13 = lg1Var.r(3);
                                lg1Var.o(2);
                                int iR14 = lg1Var.r(8);
                                int iR15 = lg1Var.r(8);
                                int iR16 = lg1Var.r(4);
                                int iR17 = lg1Var.r(2);
                                lg1Var.o(2);
                                int i14 = iR6 - 10;
                                SparseArray sparseArray4 = new SparseArray();
                                while (i14 > 0) {
                                    int iR18 = lg1Var.r(i11);
                                    int iR19 = lg1Var.r(2);
                                    lg1Var.r(2);
                                    int iR20 = lg1Var.r(12);
                                    lg1Var.o(4);
                                    int iR21 = lg1Var.r(12);
                                    int i15 = i14 - 6;
                                    if (iR19 == 1 || iR19 == 2) {
                                        lg1Var.r(8);
                                        lg1Var.r(8);
                                        i14 -= 8;
                                    } else {
                                        i14 = i15;
                                    }
                                    sparseArray4.put(iR18, new sk1(iR20, iR21));
                                    i11 = 16;
                                }
                                rk1 rk1Var3 = new rk1(iR10, zQ, iR11, iR12, iR13, iR14, iR15, iR16, iR17, sparseArray4);
                                if (pi1Var3.g == 0 && (rk1Var2 = (rk1) sparseArray3.get(iR10)) != null) {
                                    int i16 = 0;
                                    while (true) {
                                        SparseArray sparseArray5 = rk1Var2.j;
                                        if (i16 < sparseArray5.size()) {
                                            rk1Var3.j.put(sparseArray5.keyAt(i16), (sk1) sparseArray5.valueAt(i16));
                                            i16++;
                                        }
                                    }
                                }
                                sparseArray3.put(rk1Var3.a, rk1Var3);
                                break;
                            }
                            break;
                        case 18:
                            if (iR5 == tk1Var2.a) {
                                nk1 nk1VarK = k(lg1Var, iR6);
                                tk1Var2.d.put(nk1VarK.a, nk1VarK);
                                break;
                            } else if (iR5 == tk1Var2.b) {
                                nk1 nk1VarK2 = k(lg1Var, iR6);
                                tk1Var2.f.put(nk1VarK2.a, nk1VarK2);
                                break;
                            }
                            break;
                        case 19:
                            if (iR5 == tk1Var2.a) {
                                pk1 pk1VarL = l(lg1Var);
                                tk1Var2.e.put(pk1VarL.a, pk1VarL);
                                break;
                            } else if (iR5 == tk1Var2.b) {
                                pk1 pk1VarL2 = l(lg1Var);
                                tk1Var2.g.put(pk1VarL2.a, pk1VarL2);
                                break;
                            }
                            break;
                        case 20:
                            if (iR5 == tk1Var2.a) {
                                lg1Var.o(4);
                                boolean zQ2 = lg1Var.q();
                                lg1Var.o(3);
                                int iR22 = lg1Var.r(16);
                                int iR23 = lg1Var.r(16);
                                if (zQ2) {
                                    int iR24 = lg1Var.r(16);
                                    iR = lg1Var.r(16);
                                    iR3 = lg1Var.r(16);
                                    iR2 = lg1Var.r(16);
                                    i10 = iR24;
                                } else {
                                    iR = iR22;
                                    iR2 = iR23;
                                    i10 = 0;
                                    iR3 = 0;
                                }
                                tk1Var2.h = new ok1(iR22, iR23, i10, iR, iR3, iR2);
                                break;
                            }
                            break;
                    }
                    lg1Var.x(i12 - lg1Var.i());
                }
            }
        }
        pi1 pi1Var4 = tk1Var2.i;
        if (pi1Var4 == null) {
            vm3 vm3Var = xm3.g;
            gk1Var = new gk1(sn3.j, -9223372036854775807L, -9223372036854775807L);
        } else {
            ok1 ok1Var2 = tk1Var2.h;
            if (ok1Var2 == null) {
                ok1Var2 = (ok1) this.i;
            }
            ok1 ok1Var3 = ok1Var2;
            Bitmap bitmap = (Bitmap) this.l;
            if (bitmap == null || ok1Var3.a + 1 != bitmap.getWidth() || ok1Var3.b + 1 != ((Bitmap) this.l).getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ok1Var3.a + 1, ok1Var3.b + 1, Bitmap.Config.ARGB_8888);
                this.l = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray6 = (SparseArray) pi1Var4.h;
            int i17 = 0;
            while (i17 < sparseArray6.size()) {
                canvas.save();
                qk1 qk1Var = (qk1) sparseArray6.valueAt(i17);
                rk1 rk1Var4 = (rk1) tk1Var2.c.get(sparseArray6.keyAt(i17));
                int i18 = qk1Var.a + ok1Var3.c;
                int i19 = qk1Var.b + ok1Var3.e;
                int i20 = rk1Var4.c;
                int i21 = i18 + i20;
                int iMin = Math.min(i21, ok1Var3.d);
                boolean z2 = z;
                int i22 = rk1Var4.d;
                int i23 = i19 + i22;
                canvas.clipRect(i18, i19, iMin, Math.min(i23, ok1Var3.f));
                int i24 = rk1Var4.f;
                nk1 nk1Var = (nk1) tk1Var2.d.get(i24);
                if (nk1Var == null && (nk1Var = (nk1) tk1Var2.f.get(i24)) == null) {
                    nk1Var = (nk1) this.j;
                }
                SparseArray sparseArray7 = rk1Var4.j;
                SparseArray sparseArray8 = sparseArray6;
                int i25 = i19;
                int i26 = 0;
                while (i26 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i26);
                    int i27 = i26;
                    sk1 sk1Var = (sk1) sparseArray7.valueAt(i26);
                    int i28 = i18;
                    pk1 pk1Var = (pk1) tk1Var2.e.get(iKeyAt);
                    if (pk1Var == null) {
                        pk1Var = (pk1) tk1Var2.g.get(iKeyAt);
                    }
                    pk1 pk1Var2 = pk1Var;
                    if (pk1Var2 != null) {
                        Paint paint = pk1Var2.b ? null : (Paint) this.f;
                        tk1Var = tk1Var2;
                        int i29 = rk1Var4.e;
                        rk1 rk1Var5 = rk1Var4;
                        int i30 = i28 + sk1Var.a;
                        int i31 = i25 + sk1Var.b;
                        int[] iArr = i29 == 3 ? nk1Var.d : i29 == 2 ? nk1Var.c : nk1Var.b;
                        rk1Var = rk1Var5;
                        ok1Var = ok1Var3;
                        i8 = i21;
                        sparseArray = sparseArray7;
                        Paint paint2 = paint;
                        i7 = i28;
                        arrayList = arrayList2;
                        i9 = i20;
                        i6 = i22;
                        int i32 = i25;
                        i4 = i17;
                        i5 = i32;
                        r(pk1Var2.c, iArr, i29, i30, i31, paint2, canvas);
                        r(pk1Var2.d, iArr, i29, i30, i31 + 1, paint2, canvas);
                    } else {
                        int i33 = i25;
                        i4 = i17;
                        i5 = i33;
                        tk1Var = tk1Var2;
                        rk1Var = rk1Var4;
                        sparseArray = sparseArray7;
                        ok1Var = ok1Var3;
                        i6 = i22;
                        i7 = i28;
                        i8 = i21;
                        arrayList = arrayList2;
                        i9 = i20;
                    }
                    int i34 = i4;
                    i25 = i5;
                    i17 = i34;
                    rk1Var4 = rk1Var;
                    i18 = i7;
                    i26 = i27 + 1;
                    i21 = i8;
                    i20 = i9;
                    arrayList2 = arrayList;
                    tk1Var2 = tk1Var;
                    ok1Var3 = ok1Var;
                    sparseArray7 = sparseArray;
                    i22 = i6;
                }
                int i35 = i25;
                int i36 = i17;
                tk1 tk1Var3 = tk1Var2;
                rk1 rk1Var6 = rk1Var4;
                int i37 = i18;
                ok1 ok1Var4 = ok1Var3;
                int i38 = i22;
                ArrayList arrayList3 = arrayList2;
                int i39 = i20;
                int i40 = i21;
                float f = i35;
                float f2 = i37;
                if (rk1Var6.b) {
                    int i41 = rk1Var6.e;
                    c2 = 3;
                    if (i41 == 3) {
                        i3 = nk1Var.d[rk1Var6.g];
                        c3 = 2;
                    } else {
                        c3 = 2;
                        i3 = i41 == 2 ? nk1Var.c[rk1Var6.h] : nk1Var.b[rk1Var6.i];
                    }
                    Paint paint3 = (Paint) this.g;
                    paint3.setColor(i3);
                    c = c3;
                    canvas.drawRect(f2, f, i40, i23, paint3);
                } else {
                    c = 2;
                    c2 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) this.l, i37, i35, i39, i38);
                float f3 = ok1Var4.a;
                float f4 = f2 / f3;
                float f5 = ok1Var4.b;
                fi2 fi2Var = new fi2(null, null, null, bitmapCreateBitmap2, f / f5, 0, 0, f4, 0, Integer.MIN_VALUE, -3.4028235E38f, i39 / f3, i38 / f5, Integer.MIN_VALUE, 0.0f, 0);
                arrayList2 = arrayList3;
                arrayList2.add(fi2Var);
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i17 = i36 + 1;
                ok1Var3 = ok1Var4;
                sparseArray6 = sparseArray8;
                tk1Var2 = tk1Var3;
                z = z2;
            }
            gk1Var = new gk1(arrayList2, -9223372036854775807L, -9223372036854775807L);
        }
        lk1Var.mo6c(gk1Var);
    }

    public void h(float f, float f2, float f3, float f4) {
        Matrix matrix = (Matrix) this.f;
        u61 u61Var = (u61) this.h;
        float fWidth = u61Var.b.width() / f2;
        float fHeight = u61Var.b.height() / f3;
        if (Float.isInfinite(fWidth)) {
            fWidth = 0.0f;
        }
        if (Float.isInfinite(fHeight)) {
            fHeight = 0.0f;
        }
        matrix.reset();
        matrix.postTranslate(-f, -f4);
        matrix.postScale(fWidth, -fHeight);
    }

    public void i() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            xe4 xe4VarB = xe4.b();
            bu1 bu1Var = sv1.f.b;
            Context context = (Context) this.g;
            String str = (String) this.h;
            s62 s62Var = (s62) this.k;
            bu1Var.getClass();
            ba2 ba2Var = (ba2) new xl1(bu1Var, context, xe4VarB, str, s62Var).d(context, false);
            this.f = ba2Var;
            if (ba2Var != null) {
                e13 e13Var = (e13) this.i;
                e13Var.m = jCurrentTimeMillis;
                ba2Var.K2(new gw1((bx2) this.j, str));
                ba2 ba2Var2 = (ba2) this.f;
                ((fr) this.l).getClass();
                ba2Var2.Z(fr.o(context, e13Var));
            }
        } catch (RemoteException e) {
            gi2.p0("#007 Could not call remote method.", e);
        }
    }

    @Override // defpackage.eu2
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public gi1 mo18a() {
        Application application = (Application) ((ax0) this.f).f;
        Handler handler = ok2.a;
        pu1.s(handler);
        dk2 dk2Var = ok2.b;
        pu1.s(dk2Var);
        return new gi1(application, handler, dk2Var, (mo1) ((ls2) this.h).mo18a(), (z42) ((ls2) this.i).mo18a(), ((lv2) this.j).h(), ((xb4) this.k).mo18a(), (lx2) ((ls2) this.l).mo18a());
    }

    public d24 n() throws GeneralSecurityException {
        x34 x34Var;
        x34 x34Var2;
        e24 e24Var = (e24) this.f;
        if (e24Var == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        x34 x34Var3 = (x34) this.h;
        if (x34Var3 == null || (x34Var = (x34) this.i) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        x34 x34Var4 = (x34) this.g;
        if (x34Var4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        x34 x34Var5 = (x34) this.j;
        if (x34Var5 == null || (x34Var2 = (x34) this.k) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        x34 x34Var6 = (x34) this.l;
        if (x34Var6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = e24Var.j.b;
        BigInteger bigInteger2 = e24Var.k;
        BigInteger bigInteger3 = (BigInteger) x34Var3.f;
        BigInteger bigInteger4 = (BigInteger) x34Var.f;
        BigInteger bigInteger5 = (BigInteger) x34Var4.f;
        BigInteger bigInteger6 = (BigInteger) x34Var5.f;
        BigInteger bigInteger7 = (BigInteger) x34Var2.f;
        BigInteger bigInteger8 = (BigInteger) x34Var6.f;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigInteger4.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new d24((e24) this.f, (x34) this.h, (x34) this.i, (x34) this.g, (x34) this.j, (x34) this.k, (x34) this.l);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public k24 o() throws GeneralSecurityException {
        x34 x34Var;
        x34 x34Var2;
        l24 l24Var = (l24) this.f;
        if (l24Var == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        x34 x34Var3 = (x34) this.h;
        if (x34Var3 == null || (x34Var = (x34) this.i) == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        x34 x34Var4 = (x34) this.g;
        if (x34Var4 == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        x34 x34Var5 = (x34) this.j;
        if (x34Var5 == null || (x34Var2 = (x34) this.k) == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        x34 x34Var6 = (x34) this.l;
        if (x34Var6 == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger bigInteger = l24Var.j.b;
        BigInteger bigInteger2 = l24Var.k;
        BigInteger bigInteger3 = (BigInteger) x34Var3.f;
        BigInteger bigInteger4 = (BigInteger) x34Var.f;
        BigInteger bigInteger5 = (BigInteger) x34Var4.f;
        BigInteger bigInteger6 = (BigInteger) x34Var5.f;
        BigInteger bigInteger7 = (BigInteger) x34Var2.f;
        BigInteger bigInteger8 = (BigInteger) x34Var6.f;
        if (!bigInteger3.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!bigInteger4.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!bigInteger3.multiply(bigInteger4).equals(bigInteger2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger9 = BigInteger.ONE;
        BigInteger bigIntegerSubtract = bigInteger3.subtract(bigInteger9);
        BigInteger bigIntegerSubtract2 = bigInteger4.subtract(bigInteger9);
        if (!bigInteger.multiply(bigInteger5).mod(bigIntegerSubtract.divide(bigIntegerSubtract.gcd(bigIntegerSubtract2)).multiply(bigIntegerSubtract2)).equals(bigInteger9)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!bigInteger.multiply(bigInteger6).mod(bigIntegerSubtract).equals(bigInteger9)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!bigInteger.multiply(bigInteger7).mod(bigIntegerSubtract2).equals(bigInteger9)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (bigInteger4.multiply(bigInteger8).mod(bigInteger3).equals(bigInteger9)) {
            return new k24((l24) this.f, (x34) this.h, (x34) this.i, (x34) this.g, (x34) this.j, (x34) this.k, (x34) this.l);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public uk1() {
        this.k = new bw0(0);
        this.l = new bw0(0);
    }

    public uk1(of0 of0Var, WebView webView, String str, String str2, wb3 wb3Var) {
        this.h = new ArrayList();
        this.i = new HashMap();
        this.f = of0Var;
        this.g = webView;
        this.l = wb3Var;
        this.k = str;
        this.j = str2;
    }

    public uk1(Context context, String str, e13 e13Var, bx2 bx2Var) {
        this.k = new s62();
        this.g = context;
        this.h = str;
        this.i = e13Var;
        this.j = bx2Var;
        this.l = fr.s;
    }

    public uk1(u61 u61Var) {
        this.f = new Matrix();
        this.g = new Matrix();
        this.i = new float[1];
        this.j = new Matrix();
        this.k = new float[2];
        this.l = new Matrix();
        new Matrix();
        this.h = u61Var;
    }
}
