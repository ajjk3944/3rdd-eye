package F6;

import K6.C0713c;
import N7.C1126cb;
import N7.C1292o3;
import N7.C1362t4;
import N7.H9;
import N7.Xa;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.Layout;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.RecyclerView;
import c9.C2091l;
import kotlin.jvm.internal.l;

/* compiled from: CloudTextRangeBackgroundRenderer.kt */
/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1663a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.d f1664b;

    /* renamed from: c, reason: collision with root package name */
    public final Path f1665c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f1666d;

    public b(Context context, A7.d expressionResolver) {
        l.f(expressionResolver, "expressionResolver");
        this.f1663a = context;
        this.f1664b = expressionResolver;
        this.f1665c = new Path();
        this.f1666d = new Paint();
    }

    public static void d(int i, int[] iArr) {
        v9.e eVar;
        boolean z10;
        int i10 = 0;
        do {
            if (i10 % 2 == 0) {
                eVar = new v9.g(0, iArr.length - 1, 1);
            } else {
                v9.g gVar = new v9.g(0, iArr.length - 1, 1);
                eVar = new v9.e(gVar.f47097c, 0, -gVar.f47098d);
            }
            int i11 = eVar.f47096b;
            int i12 = eVar.f47097c;
            int i13 = eVar.f47098d;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                z10 = false;
                while (true) {
                    int i14 = i11 == 0 ? 0 : iArr[i11 - 1] - iArr[i11];
                    int i15 = i11 == iArr.length - 1 ? 0 : iArr[i11 + 1] - iArr[i11];
                    if ((i14 <= 0 || i14 >= i) && (i15 <= 0 || i15 >= i)) {
                        if (i11 != 0 && i14 < 0 && Math.abs(i14) < i) {
                            iArr[i11 - 1] = iArr[i11];
                            z10 = true;
                        }
                        if (i11 != iArr.length - 1 && i15 < 0 && Math.abs(i15) < i) {
                            iArr[i11 + 1] = iArr[i11];
                            z10 = true;
                        }
                    }
                    if (i11 == i12) {
                        break;
                    } else {
                        i11 += i13;
                    }
                }
            } else {
                z10 = false;
            }
            i10++;
        } while (z10);
    }

    @Override // F6.e
    public final void a(Canvas canvas, Layout layout, int i, int i10, int i11, int i12, C1126cb c1126cb, Xa xa) {
        H9 h9A;
        Rect[] rectArr;
        int i13;
        int i14;
        A7.b<Long> bVar;
        A7.b<Long> bVar2;
        A7.b<Long> bVar3;
        A7.b<Long> bVar4;
        A7.b<H9> bVar5;
        Object objA = xa != null ? xa.a() : null;
        C1292o3 c1292o3 = objA instanceof C1292o3 ? (C1292o3) objA : null;
        if (c1292o3 == null) {
            return;
        }
        DisplayMetrics displayMetrics = this.f1663a.getResources().getDisplayMetrics();
        l.e(displayMetrics, "context.resources.displayMetrics");
        A7.b<Integer> bVar6 = c1292o3.f8850a;
        A7.d dVar = this.f1664b;
        int iIntValue = bVar6.a(dVar).intValue();
        int iB = C0713c.B(c1292o3.f8851b.a(dVar), displayMetrics);
        C1362t4 c1362t4 = c1292o3.f8852c;
        if (c1362t4 == null || (bVar5 = c1362t4.f9222g) == null || (h9A = bVar5.a(dVar)) == null) {
            h9A = H9.DP;
        }
        Rect rect = new Rect((c1362t4 == null || (bVar4 = c1362t4.f9218c) == null) ? 0 : C0713c.n0(Long.valueOf(bVar4.a(dVar).longValue()), displayMetrics, h9A), (c1362t4 == null || (bVar3 = c1362t4.f9221f) == null) ? 0 : C0713c.n0(Long.valueOf(bVar3.a(dVar).longValue()), displayMetrics, h9A), (c1362t4 == null || (bVar2 = c1362t4.f9219d) == null) ? 0 : C0713c.n0(Long.valueOf(bVar2.a(dVar).longValue()), displayMetrics, h9A), (c1362t4 == null || (bVar = c1362t4.f9216a) == null) ? 0 : C0713c.n0(Long.valueOf(bVar.a(dVar).longValue()), displayMetrics, h9A));
        int i15 = i10 - i;
        int i16 = i15 + 1;
        if (i16 == 0) {
            rectArr = new Rect[0];
        } else {
            Rect[] rectArr2 = new Rect[i16];
            int i17 = 0;
            while (i17 < i16) {
                int i18 = i + i17;
                rectArr2[i17] = new Rect((i17 == 0 ? i11 : com.google.gson.internal.c.y(layout.getLineLeft(i + i17))) - rect.left, layout.getLineTop(i18) - rect.top, (i17 == i15 ? i12 : com.google.gson.internal.c.y(layout.getLineRight(i18))) + rect.right, layout.getLineBottom(i18) + rect.bottom);
                i17++;
            }
            int i19 = ((Rect) C2091l.m(rectArr2)).left;
            int i20 = ((Rect) C2091l.m(rectArr2)).top;
            int i21 = 0;
            while (i21 < i16) {
                Rect rect2 = rectArr2[i21];
                int i22 = rect2.bottom - i20;
                i21++;
                for (int i23 = i21; i23 < i16; i23++) {
                    Rect rect3 = rectArr2[i23];
                    int i24 = rect3.top;
                    int i25 = rect2.bottom;
                    if (i24 >= i25) {
                        break;
                    }
                    i14 = rect3.left;
                    if (i14 <= rect2.left) {
                        i22 -= i25 - i24;
                        break;
                    }
                }
                i14 = RecyclerView.UNDEFINED_DURATION;
                if (i22 <= 0) {
                    rect2.left = Math.max(i19, i14);
                    i22 = 0;
                } else {
                    i19 = rect2.left;
                }
                i20 += i22;
            }
            int i26 = ((Rect) C2091l.m(rectArr2)).right;
            int i27 = ((Rect) C2091l.m(rectArr2)).top;
            int i28 = 0;
            while (i28 < i16) {
                Rect rect4 = rectArr2[i28];
                int i29 = rect4.bottom - i27;
                i28++;
                for (int i30 = i28; i30 < i16; i30++) {
                    Rect rect5 = rectArr2[i30];
                    int i31 = rect5.top;
                    int i32 = rect4.bottom;
                    if (i31 >= i32) {
                        break;
                    }
                    i13 = rect5.right;
                    if (i13 >= rect4.right) {
                        i29 -= i32 - i31;
                        break;
                    }
                }
                i13 = Integer.MAX_VALUE;
                if (i29 <= 0) {
                    rect4.right = Math.min(i26, i13);
                    i29 = 0;
                } else {
                    i26 = rect4.right;
                }
                i27 += i29;
            }
            int[] iArr = new int[i16];
            int[] iArr2 = new int[i16];
            for (int i33 = 0; i33 < i16; i33++) {
                Rect rect6 = rectArr2[i33];
                iArr[i33] = -rect6.left;
                iArr2[i33] = rect6.right;
            }
            int i34 = iB * 2;
            d(i34, iArr);
            d(i34, iArr2);
            for (int i35 = 0; i35 < i16; i35++) {
                Rect rect7 = rectArr2[i35];
                rect7.left = -iArr[i35];
                rect7.right = iArr2[i35];
            }
            rectArr = rectArr2;
        }
        if (rectArr.length < 2) {
            e(canvas, rectArr, 0, rectArr.length, iB, iIntValue);
            return;
        }
        Rect[] rectArr3 = rectArr;
        int length = rectArr3.length - 1;
        int i36 = 1;
        int i37 = 0;
        int i38 = 0;
        while (i37 < length) {
            int i39 = rectArr3[i37].left;
            i37++;
            if (i39 > rectArr3[i37].right) {
                e(canvas, rectArr3, i38, i36, iB, iIntValue);
                i38 = i37;
                i36 = 0;
            }
            i36++;
        }
        e(canvas, rectArr3, i38, i36, iB, iIntValue);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        r7 = r20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.graphics.Canvas r23, android.graphics.Rect[] r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.b.e(android.graphics.Canvas, android.graphics.Rect[], int, int, int, int):void");
    }
}
