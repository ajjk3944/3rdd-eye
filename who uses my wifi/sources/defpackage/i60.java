package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.github.mikephil.charting.charts.LineChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class i60 extends om {
    public o9 m;
    public Path n;
    public LineChart o;
    public Paint p;
    public WeakReference q;
    public Canvas r;
    public Bitmap.Config s;
    public Path t;
    public Path u;
    public float[] v;
    public Path w;
    public HashMap x;
    public float[] y;

    @Override // defpackage.om
    public final void U1(Canvas canvas) {
        ke keVar;
        o9 o9Var;
        n41 n41Var;
        ke keVar2;
        o9 o9Var2;
        ke keVar3 = this.i;
        Paint paint = this.l;
        o9 o9Var3 = this.m;
        LineChart lineChart = this.o;
        float fE = lineChart.getData().e();
        float maxVisibleCount = lineChart.getMaxVisibleCount();
        u61 u61Var = (u61) this.g;
        if (fE < maxVisibleCount * u61Var.i) {
            ArrayList arrayList = lineChart.getLineData().i;
            int i = 0;
            while (i < arrayList.size()) {
                l60 l60Var = (l60) arrayList.get(i);
                if (!l60Var.n || (!(l60Var.j || l60Var.k) || l60Var.o.size() < 1)) {
                    keVar = keVar3;
                    o9Var = o9Var3;
                } else {
                    paint.setTypeface(null);
                    paint.setTextSize(l60Var.m);
                    uk1 uk1VarF = lineChart.f(l60Var.d);
                    int i2 = (int) (l60Var.E * 1.75f);
                    if (!l60Var.J) {
                        i2 /= 2;
                    }
                    o9Var3.c(lineChart, l60Var);
                    keVar3.getClass();
                    int i3 = o9Var3.a;
                    float f = 1.0f;
                    int i4 = (((int) ((o9Var3.b - i3) * 1.0f)) + 1) * 2;
                    if (((float[]) uk1VarF.i).length != i4) {
                        uk1VarF.i = new float[i4];
                    }
                    float[] fArr = (float[]) uk1VarF.i;
                    int i5 = 0;
                    while (i5 < i4) {
                        float f2 = f;
                        xs xsVarB = l60Var.b((i5 / 2) + i3);
                        if (xsVarB != null) {
                            fArr[i5] = xsVarB.h;
                            fArr[i5 + 1] = xsVarB.f * f2;
                        } else {
                            fArr[i5] = 0.0f;
                            fArr[i5 + 1] = 0.0f;
                        }
                        i5 += 2;
                        f = f2;
                    }
                    Matrix matrix = (Matrix) uk1VarF.l;
                    matrix.set((Matrix) uk1VarF.f);
                    matrix.postConcat(((u61) uk1VarF.h).a);
                    matrix.postConcat((Matrix) uk1VarF.g);
                    matrix.mapPoints(fArr);
                    n41 n41Var2 = l60Var.f;
                    if (n41Var2 == null) {
                        n41Var2 = k41.g;
                    }
                    aa0 aa0Var = l60Var.l;
                    aa0 aa0Var2 = (aa0) aa0.i.b();
                    float f3 = aa0Var.g;
                    aa0Var2.g = f3;
                    aa0Var2.h = aa0Var.h;
                    aa0Var2.g = k41.c(f3);
                    aa0Var2.h = k41.c(aa0Var2.h);
                    int i6 = 0;
                    while (i6 < fArr.length) {
                        float f4 = fArr[i6];
                        float f5 = fArr[i6 + 1];
                        if (!u61Var.c(f4)) {
                            break;
                        }
                        if (u61Var.b(f4)) {
                            RectF rectF = u61Var.b;
                            keVar2 = keVar3;
                            if (rectF.top <= f5) {
                                if (rectF.bottom >= ((int) (f5 * 100.0f)) / 100.0f) {
                                    int i7 = i6 / 2;
                                    xs xsVarB2 = l60Var.b(o9Var3.a + i7);
                                    if (l60Var.j) {
                                        n41Var2.getClass();
                                        n41Var = n41Var2;
                                        ArrayList arrayList2 = l60Var.b;
                                        o9Var2 = o9Var3;
                                        paint.setColor(((Integer) arrayList2.get(i7 % arrayList2.size())).intValue());
                                        canvas.drawText(n41Var2.a(xsVarB2.f), f4, f5 - i2, paint);
                                    } else {
                                        n41Var = n41Var2;
                                        o9Var2 = o9Var3;
                                    }
                                    xsVarB2.getClass();
                                    i6 += 2;
                                    keVar3 = keVar2;
                                    n41Var2 = n41Var;
                                    o9Var3 = o9Var2;
                                }
                            }
                            n41Var = n41Var2;
                        } else {
                            n41Var = n41Var2;
                            keVar2 = keVar3;
                        }
                        o9Var2 = o9Var3;
                        i6 += 2;
                        keVar3 = keVar2;
                        n41Var2 = n41Var;
                        o9Var3 = o9Var2;
                    }
                    keVar = keVar3;
                    o9Var = o9Var3;
                    aa0.i.c(aa0Var2);
                }
                i++;
                keVar3 = keVar;
                o9Var3 = o9Var;
            }
        }
    }

    public final void V1(Canvas canvas, l60 l60Var, Path path, uk1 uk1Var, o9 o9Var) {
        pz pzVar = l60Var.I;
        LineChart lineChart = this.o;
        pzVar.getClass();
        float fJ = pz.j(l60Var, lineChart);
        path.lineTo(l60Var.b(o9Var.a + o9Var.c).h, fJ);
        path.lineTo(l60Var.b(o9Var.a).h, fJ);
        path.close();
        uk1Var.c(path);
        int i = (l60Var.y << 24) | (l60Var.x & 16777215);
        DisplayMetrics displayMetrics = k41.a;
        int iSave = canvas.save();
        canvas.clipPath(path);
        canvas.drawColor(i);
        canvas.restoreToCount(iSave);
    }
}
