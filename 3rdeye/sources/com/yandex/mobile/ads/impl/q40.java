package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.yandex.mobile.ads.impl.av;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class q40 {

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f32016h = {0, 7, 8, 15};
    private static final byte[] i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f32017j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f32018a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f32019b;

    /* renamed from: c, reason: collision with root package name */
    private final Canvas f32020c;

    /* renamed from: d, reason: collision with root package name */
    private final b f32021d;

    /* renamed from: e, reason: collision with root package name */
    private final a f32022e;

    /* renamed from: f, reason: collision with root package name */
    private final h f32023f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f32024g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f32025a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f32026b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f32027c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f32028d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f32025a = i;
            this.f32026b = iArr;
            this.f32027c = iArr2;
            this.f32028d = iArr3;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f32029a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32030b;

        /* renamed from: c, reason: collision with root package name */
        public final int f32031c;

        /* renamed from: d, reason: collision with root package name */
        public final int f32032d;

        /* renamed from: e, reason: collision with root package name */
        public final int f32033e;

        /* renamed from: f, reason: collision with root package name */
        public final int f32034f;

        public b(int i, int i10, int i11, int i12, int i13, int i14) {
            this.f32029a = i;
            this.f32030b = i10;
            this.f32031c = i11;
            this.f32032d = i12;
            this.f32033e = i13;
            this.f32034f = i14;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f32035a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f32036b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f32037c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f32038d;

        public c(int i, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f32035a = i;
            this.f32036b = z10;
            this.f32037c = bArr;
            this.f32038d = bArr2;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f32039a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32040b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<e> f32041c;

        public d(int i, int i10, SparseArray sparseArray) {
            this.f32039a = i;
            this.f32040b = i10;
            this.f32041c = sparseArray;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f32042a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32043b;

        public e(int i, int i10) {
            this.f32042a = i;
            this.f32043b = i10;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f32044a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f32045b;

        /* renamed from: c, reason: collision with root package name */
        public final int f32046c;

        /* renamed from: d, reason: collision with root package name */
        public final int f32047d;

        /* renamed from: e, reason: collision with root package name */
        public final int f32048e;

        /* renamed from: f, reason: collision with root package name */
        public final int f32049f;

        /* renamed from: g, reason: collision with root package name */
        public final int f32050g;

        /* renamed from: h, reason: collision with root package name */
        public final int f32051h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public final SparseArray<g> f32052j;

        public f(int i, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, SparseArray sparseArray) {
            this.f32044a = i;
            this.f32045b = z10;
            this.f32046c = i10;
            this.f32047d = i11;
            this.f32048e = i12;
            this.f32049f = i13;
            this.f32050g = i14;
            this.f32051h = i15;
            this.i = i16;
            this.f32052j = sparseArray;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f32053a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32054b;

        public g(int i, int i10) {
            this.f32053a = i;
            this.f32054b = i10;
        }
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f32055a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32056b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f32057c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f32058d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f32059e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray<a> f32060f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f32061g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        public b f32062h;
        public d i;

        public h(int i, int i10) {
            this.f32055a = i;
            this.f32056b = i10;
        }
    }

    public q40(int i10, int i11) {
        Paint paint = new Paint();
        this.f32018a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f32019b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f32020c = new Canvas();
        this.f32021d = new b(719, 575, 0, 719, 0, 575);
        this.f32022e = new a(0, a(), b(), c());
        this.f32023f = new h(i10, i11);
    }

    private static int a(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = a(KotlinVersion.MAX_COMPONENT_VALUE, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = a(KotlinVersion.MAX_COMPONENT_VALUE, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = a(63, i12, i13, i11);
            } else {
                int i14 = i10 & 136;
                if (i14 == 0) {
                    iArr[i10] = a(KotlinVersion.MAX_COMPONENT_VALUE, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i14 == 8) {
                    iArr[i10] = a(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i14 == 128) {
                    iArr[i10] = a(KotlinVersion.MAX_COMPONENT_VALUE, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i14 == 136) {
                    iArr[i10] = a(KotlinVersion.MAX_COMPONENT_VALUE, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public final void d() {
        h hVar = this.f32023f;
        hVar.f32057c.clear();
        hVar.f32058d.clear();
        hVar.f32059e.clear();
        hVar.f32060f.clear();
        hVar.f32061g.clear();
        hVar.f32062h = null;
        hVar.i = null;
    }

    private static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x021b A[LOOP:3: B:93:0x0181->B:125:0x021b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte[] r22, int[] r23, int r24, int r25, int r26, android.graphics.Paint r27, android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.q40.a(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    private static a a(tf1 tf1Var, int i10) {
        int iB;
        int i11;
        int iB2;
        int iB3;
        int iB4;
        int i12 = 8;
        int iB5 = tf1Var.b(8);
        tf1Var.d(8);
        int i13 = 2;
        int i14 = i10 - 2;
        int[] iArrA = a();
        int[] iArrB = b();
        int[] iArrC = c();
        while (i14 > 0) {
            int iB6 = tf1Var.b(i12);
            int iB7 = tf1Var.b(i12);
            int[] iArr = (iB7 & 128) != 0 ? iArrA : (iB7 & 64) != 0 ? iArrB : iArrC;
            if ((iB7 & 1) != 0) {
                iB3 = tf1Var.b(i12);
                iB4 = tf1Var.b(i12);
                iB = tf1Var.b(i12);
                iB2 = tf1Var.b(i12);
                i11 = i14 - 6;
            } else {
                int iB8 = tf1Var.b(6) << i13;
                int iB9 = tf1Var.b(4) << 4;
                iB = tf1Var.b(4) << 4;
                i11 = i14 - 4;
                iB2 = tf1Var.b(i13) << 6;
                iB3 = iB8;
                iB4 = iB9;
            }
            if (iB3 == 0) {
                iB2 = 255;
                iB4 = 0;
                iB = 0;
            }
            byte b10 = (byte) (255 - (iB2 & KotlinVersion.MAX_COMPONENT_VALUE));
            double d10 = iB3;
            int i15 = iB5;
            double d11 = iB4 - 128;
            int i16 = (int) ((1.402d * d11) + d10);
            double d12 = iB - 128;
            int i17 = (int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d));
            int i18 = (int) ((d12 * 1.772d) + d10);
            int i19 = s82.f32899a;
            iArr[iB6] = a(b10, Math.max(0, Math.min(i16, KotlinVersion.MAX_COMPONENT_VALUE)), Math.max(0, Math.min(i17, KotlinVersion.MAX_COMPONENT_VALUE)), Math.max(0, Math.min(i18, KotlinVersion.MAX_COMPONENT_VALUE)));
            i14 = i11;
            iB5 = i15;
            i12 = 8;
            i13 = 2;
        }
        return new a(iB5, iArrA, iArrB, iArrC);
    }

    private static c a(tf1 tf1Var) {
        byte[] bArr;
        int iB = tf1Var.b(16);
        tf1Var.d(4);
        int iB2 = tf1Var.b(2);
        boolean zF = tf1Var.f();
        tf1Var.d(1);
        byte[] bArr2 = s82.f32904f;
        if (iB2 == 1) {
            tf1Var.d(tf1Var.b(8) * 16);
        } else {
            if (iB2 == 0) {
                int iB3 = tf1Var.b(16);
                int iB4 = tf1Var.b(16);
                if (iB3 > 0) {
                    bArr2 = new byte[iB3];
                    tf1Var.b(bArr2, iB3);
                }
                if (iB4 > 0) {
                    bArr = new byte[iB4];
                    tf1Var.b(bArr, iB4);
                }
            }
            return new c(iB, zF, bArr2, bArr);
        }
        bArr = bArr2;
        return new c(iB, zF, bArr2, bArr);
    }

    public final List a(int i10, byte[] bArr) {
        boolean z10;
        char c10;
        int i11;
        int[] iArr;
        f fVar;
        int iB;
        int iB2;
        int i12;
        int iB3;
        tf1 tf1Var = new tf1(i10, bArr);
        while (true) {
            z10 = true;
            if (tf1Var.b() >= 48 && tf1Var.b(8) == 15) {
                h hVar = this.f32023f;
                int iB4 = tf1Var.b(8);
                int iB5 = tf1Var.b(16);
                int iB6 = tf1Var.b(16);
                int iD = tf1Var.d() + iB6;
                if (iB6 * 8 > tf1Var.b()) {
                    rs0.d("DvbParser", "Data field length exceeds limit");
                    tf1Var.d(tf1Var.b());
                } else {
                    switch (iB4) {
                        case 16:
                            if (iB5 == hVar.f32055a) {
                                d dVar = hVar.i;
                                tf1Var.b(8);
                                int iB7 = tf1Var.b(4);
                                int iB8 = tf1Var.b(2);
                                tf1Var.d(2);
                                int i13 = iB6 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i13 > 0) {
                                    int iB9 = tf1Var.b(8);
                                    tf1Var.d(8);
                                    i13 -= 6;
                                    sparseArray.put(iB9, new e(tf1Var.b(16), tf1Var.b(16)));
                                }
                                d dVar2 = new d(iB7, iB8, sparseArray);
                                if (iB8 != 0) {
                                    hVar.i = dVar2;
                                    hVar.f32057c.clear();
                                    hVar.f32058d.clear();
                                    hVar.f32059e.clear();
                                    break;
                                } else if (dVar != null && dVar.f32039a != iB7) {
                                    hVar.i = dVar2;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            d dVar3 = hVar.i;
                            if (iB5 == hVar.f32055a && dVar3 != null) {
                                int iB10 = tf1Var.b(8);
                                tf1Var.d(4);
                                boolean zF = tf1Var.f();
                                tf1Var.d(3);
                                int iB11 = tf1Var.b(16);
                                int iB12 = tf1Var.b(16);
                                tf1Var.b(3);
                                int iB13 = tf1Var.b(3);
                                tf1Var.d(2);
                                int iB14 = tf1Var.b(8);
                                int iB15 = tf1Var.b(8);
                                int iB16 = tf1Var.b(4);
                                int iB17 = tf1Var.b(2);
                                tf1Var.d(2);
                                int i14 = iB6 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i14 > 0) {
                                    int iB18 = tf1Var.b(16);
                                    int iB19 = tf1Var.b(2);
                                    tf1Var.b(2);
                                    int iB20 = tf1Var.b(12);
                                    tf1Var.d(4);
                                    int iB21 = tf1Var.b(12);
                                    int i15 = i14 - 6;
                                    if (iB19 == 1 || iB19 == 2) {
                                        tf1Var.b(8);
                                        tf1Var.b(8);
                                        i14 -= 8;
                                    } else {
                                        i14 = i15;
                                    }
                                    sparseArray2.put(iB18, new g(iB20, iB21));
                                }
                                f fVar2 = new f(iB10, zF, iB11, iB12, iB13, iB14, iB15, iB16, iB17, sparseArray2);
                                if (dVar3.f32040b == 0 && (fVar = hVar.f32057c.get(iB10)) != null) {
                                    SparseArray<g> sparseArray3 = fVar.f32052j;
                                    for (int i16 = 0; i16 < sparseArray3.size(); i16++) {
                                        fVar2.f32052j.put(sparseArray3.keyAt(i16), sparseArray3.valueAt(i16));
                                    }
                                }
                                hVar.f32057c.put(fVar2.f32044a, fVar2);
                                break;
                            }
                            break;
                        case 18:
                            if (iB5 == hVar.f32055a) {
                                a aVarA = a(tf1Var, iB6);
                                hVar.f32058d.put(aVarA.f32025a, aVarA);
                                break;
                            } else if (iB5 == hVar.f32056b) {
                                a aVarA2 = a(tf1Var, iB6);
                                hVar.f32060f.put(aVarA2.f32025a, aVarA2);
                                break;
                            }
                            break;
                        case 19:
                            if (iB5 == hVar.f32055a) {
                                c cVarA = a(tf1Var);
                                hVar.f32059e.put(cVarA.f32035a, cVarA);
                                break;
                            } else if (iB5 == hVar.f32056b) {
                                c cVarA2 = a(tf1Var);
                                hVar.f32061g.put(cVarA2.f32035a, cVarA2);
                                break;
                            }
                            break;
                        case 20:
                            if (iB5 == hVar.f32055a) {
                                tf1Var.d(4);
                                boolean zF2 = tf1Var.f();
                                tf1Var.d(3);
                                int iB22 = tf1Var.b(16);
                                int iB23 = tf1Var.b(16);
                                if (zF2) {
                                    int iB24 = tf1Var.b(16);
                                    iB = tf1Var.b(16);
                                    iB3 = tf1Var.b(16);
                                    iB2 = tf1Var.b(16);
                                    i12 = iB24;
                                } else {
                                    iB = iB22;
                                    iB2 = iB23;
                                    i12 = 0;
                                    iB3 = 0;
                                }
                                hVar.f32062h = new b(iB22, iB23, i12, iB, iB3, iB2);
                                break;
                            }
                            break;
                    }
                    tf1Var.e(iD - tf1Var.d());
                }
            }
        }
        h hVar2 = this.f32023f;
        d dVar4 = hVar2.i;
        if (dVar4 == null) {
            return Collections.EMPTY_LIST;
        }
        b bVar = hVar2.f32062h;
        if (bVar == null) {
            bVar = this.f32021d;
        }
        Bitmap bitmap = this.f32024g;
        if (bitmap == null || bVar.f32029a + 1 != bitmap.getWidth() || bVar.f32030b + 1 != this.f32024g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.f32029a + 1, bVar.f32030b + 1, Bitmap.Config.ARGB_8888);
            this.f32024g = bitmapCreateBitmap;
            this.f32020c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray4 = dVar4.f32041c;
        int i17 = 0;
        while (i17 < sparseArray4.size()) {
            this.f32020c.save();
            e eVarValueAt = sparseArray4.valueAt(i17);
            f fVar3 = this.f32023f.f32057c.get(sparseArray4.keyAt(i17));
            int i18 = eVarValueAt.f32042a + bVar.f32031c;
            int i19 = eVarValueAt.f32043b + bVar.f32033e;
            this.f32020c.clipRect(i18, i19, Math.min(fVar3.f32046c + i18, bVar.f32032d), Math.min(fVar3.f32047d + i19, bVar.f32034f));
            a aVar = this.f32023f.f32058d.get(fVar3.f32049f);
            if (aVar == null && (aVar = this.f32023f.f32060f.get(fVar3.f32049f)) == null) {
                aVar = this.f32022e;
            }
            SparseArray<g> sparseArray5 = fVar3.f32052j;
            int i20 = 0;
            while (i20 < sparseArray5.size()) {
                int iKeyAt = sparseArray5.keyAt(i20);
                g gVarValueAt = sparseArray5.valueAt(i20);
                boolean z11 = z10;
                c cVar = this.f32023f.f32059e.get(iKeyAt);
                if (cVar == null) {
                    cVar = this.f32023f.f32061g.get(iKeyAt);
                }
                if (cVar != null) {
                    Paint paint = cVar.f32036b ? null : this.f32018a;
                    int i21 = fVar3.f32048e;
                    int i22 = i18 + gVarValueAt.f32053a;
                    int i23 = i19 + gVarValueAt.f32054b;
                    Canvas canvas = this.f32020c;
                    if (i21 == 3) {
                        iArr = aVar.f32028d;
                    } else if (i21 == 2) {
                        iArr = aVar.f32027c;
                    } else {
                        iArr = aVar.f32026b;
                    }
                    int[] iArr2 = iArr;
                    a(cVar.f32037c, iArr2, i21, i22, i23, paint, canvas);
                    a(cVar.f32038d, iArr2, i21, i22, i23 + 1, paint, canvas);
                }
                i20++;
                z10 = z11;
            }
            boolean z12 = z10;
            if (fVar3.f32045b) {
                int i24 = fVar3.f32048e;
                if (i24 == 3) {
                    i11 = aVar.f32028d[fVar3.f32050g];
                    c10 = 2;
                } else {
                    c10 = 2;
                    if (i24 == 2) {
                        i11 = aVar.f32027c[fVar3.f32051h];
                    } else {
                        i11 = aVar.f32026b[fVar3.i];
                    }
                }
                this.f32019b.setColor(i11);
                this.f32020c.drawRect(i18, i19, fVar3.f32046c + i18, fVar3.f32047d + i19, this.f32019b);
            } else {
                c10 = 2;
            }
            arrayList.add(new av.a().a(Bitmap.createBitmap(this.f32024g, i18, i19, fVar3.f32046c, fVar3.f32047d)).b(i18 / bVar.f32029a).b(0).a(0, i19 / bVar.f32030b).a(0).d(fVar3.f32046c / bVar.f32029a).a(fVar3.f32047d / bVar.f32030b).a());
            this.f32020c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f32020c.restore();
            i17++;
            z10 = z12;
        }
        return Collections.unmodifiableList(arrayList);
    }
}
