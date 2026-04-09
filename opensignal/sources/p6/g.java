package p6;

import a5.d0;
import a5.u;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import gb.i;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f20305h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f20306i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f20307a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f20308b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f20309c;

    /* renamed from: d, reason: collision with root package name */
    public final gb.c f20310d;

    /* renamed from: e, reason: collision with root package name */
    public final b f20311e;

    /* renamed from: f, reason: collision with root package name */
    public final i f20312f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f20313g;

    public g(int i10, int i11) {
        Paint paint = new Paint();
        this.f20307a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f20308b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f20309c = new Canvas();
        this.f20310d = new gb.c(719, 575, 0, 719, 0, 575);
        this.f20311e = new b(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f20312f = new i(i10, i11, 1);
    }

    public static byte[] a(int i10, int i11, u uVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) uVar.i(i11);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & 136;
                if (i11 == 0) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = d(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = d(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0205 A[LOOP:3: B:87:0x0158->B:119:0x0205, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0201 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.g.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static b f(u uVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = uVar.i(8);
        uVar.s(8);
        int i18 = 2;
        int i19 = i10 - 2;
        int i20 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrB = b();
        int[] iArrC = c();
        while (i19 > 0) {
            int i21 = uVar.i(i16);
            int i22 = uVar.i(i16);
            int[] iArr2 = (i22 & 128) != 0 ? iArr : (i22 & 64) != 0 ? iArrB : iArrC;
            if ((i22 & 1) != 0) {
                i14 = uVar.i(i16);
                i15 = uVar.i(i16);
                i11 = uVar.i(i16);
                i13 = uVar.i(i16);
                i12 = i19 - 6;
            } else {
                int i23 = uVar.i(6) << i18;
                int i24 = uVar.i(4) << 4;
                i11 = uVar.i(4) << 4;
                i12 = i19 - 4;
                i13 = uVar.i(i18) << 6;
                i14 = i23;
                i15 = i24;
            }
            if (i14 == 0) {
                i15 = i20;
                i11 = i15;
                i13 = 255;
            }
            double d6 = i14;
            double d10 = i15 - 128;
            double d11 = i11 - 128;
            iArr2[i21] = d((byte) (255 - (i13 & 255)), d0.h((int) ((1.402d * d10) + d6), 0, 255), d0.h((int) ((d6 - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), d0.h((int) ((d11 * 1.772d) + d6), 0, 255));
            i19 = i12;
            i20 = 0;
            i17 = i17;
            iArrC = iArrC;
            i16 = 8;
            i18 = 2;
        }
        return new b(i17, iArr, iArrB, iArrC);
    }

    public static c g(u uVar) {
        byte[] bArr;
        int i10 = uVar.i(16);
        uVar.s(4);
        int i11 = uVar.i(2);
        boolean zH = uVar.h();
        uVar.s(1);
        byte[] bArr2 = d0.f109e;
        if (i11 != 1) {
            if (i11 == 0) {
                int i12 = uVar.i(16);
                int i13 = uVar.i(16);
                if (i12 > 0) {
                    bArr2 = new byte[i12];
                    uVar.k(i12, bArr2);
                }
                if (i13 > 0) {
                    bArr = new byte[i13];
                    uVar.k(i13, bArr);
                }
            }
            return new c(i10, zH, bArr2, bArr);
        }
        uVar.s(uVar.i(8) * 16);
        bArr = bArr2;
        return new c(i10, zH, bArr2, bArr);
    }
}
