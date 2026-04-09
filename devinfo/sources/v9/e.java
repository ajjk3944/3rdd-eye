package v9;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.DisplayMetrics;
import androidx.datastore.preferences.protobuf.k;
import com.github.mikephil.charting.charts.LineChart;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends b {
    public k g;

    /* renamed from: h, reason: collision with root package name */
    public Path f35995h;

    /* renamed from: i, reason: collision with root package name */
    public LineChart f35996i;
    public Paint j;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f35997k;

    /* renamed from: l, reason: collision with root package name */
    public Canvas f35998l;

    /* renamed from: m, reason: collision with root package name */
    public Bitmap.Config f35999m;

    /* renamed from: n, reason: collision with root package name */
    public Path f36000n;

    /* renamed from: o, reason: collision with root package name */
    public Path f36001o;

    /* renamed from: p, reason: collision with root package name */
    public float[] f36002p;

    /* renamed from: q, reason: collision with root package name */
    public Path f36003q;

    /* renamed from: r, reason: collision with root package name */
    public HashMap f36004r;

    /* renamed from: s, reason: collision with root package name */
    public float[] f36005s;

    /* JADX WARN: Removed duplicated region for block: B:98:0x0264  */
    @Override // v9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(android.graphics.Canvas r34) {
        /*
            Method dump skipped, instructions count: 1308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.e.D(android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    @Override // v9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.e.E(android.graphics.Canvas):void");
    }

    @Override // v9.b
    public final void F(Canvas canvas, q9.b[] bVarArr) {
        LineChart lineChart = this.f35996i;
        o9.e lineData = lineChart.getLineData();
        for (q9.b bVar : bVarArr) {
            o9.f fVar = (o9.f) lineData.d(bVar.f32231e);
            if (fVar != null) {
                List list = fVar.j;
                o9.d dVarE = fVar.e(3, bVar.f32227a, bVar.f32228b);
                if (dVarE != null) {
                    float fIndexOf = list.indexOf(dVarE);
                    float size = list.size();
                    this.f35983c.getClass();
                    if (fIndexOf < size * 1.0f) {
                        pe.c cVarI = lineChart.i(fVar.f30444d);
                        float fA = dVarE.a();
                        float f10 = dVarE.f30453a * 1.0f;
                        float[] fArr = (float[]) cVarI.g;
                        fArr[0] = fA;
                        fArr[1] = f10;
                        cVarI.f(fArr);
                        double d10 = fArr[0];
                        double d11 = fArr[1];
                        w9.c cVar = (w9.c) w9.c.f36542d.b();
                        cVar.f36543b = d10;
                        cVar.f36544c = d11;
                        float f11 = (float) d10;
                        float f12 = (float) d11;
                        w9.h hVar = (w9.h) this.f218b;
                        Path path = this.f35995h;
                        int i4 = fVar.f30456o;
                        Paint paint = this.f35985e;
                        paint.setColor(i4);
                        paint.setStrokeWidth(fVar.f30459r);
                        paint.setPathEffect(null);
                        if (fVar.f30457p) {
                            path.reset();
                            path.moveTo(f11, hVar.f36564b.top);
                            path.lineTo(f11, hVar.f36564b.bottom);
                            canvas.drawPath(path, paint);
                        }
                        if (fVar.f30458q) {
                            path.reset();
                            path.moveTo(hVar.f36564b.left, f12);
                            path.lineTo(hVar.f36564b.right, f12);
                            canvas.drawPath(path, paint);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x014e  */
    @Override // v9.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.e.G(android.graphics.Canvas):void");
    }

    public final void H(Canvas canvas, o9.f fVar, Path path, pe.c cVar, k kVar) {
        ja.c cVar2 = fVar.D;
        LineChart lineChart = this.f35996i;
        cVar2.getClass();
        float fU = ja.c.u(fVar, lineChart);
        path.lineTo(fVar.d(kVar.f1000a + kVar.f1002c).a(), fU);
        path.lineTo(fVar.d(kVar.f1000a).a(), fU);
        path.close();
        cVar.d(path);
        GradientDrawable gradientDrawable = fVar.f30461t;
        if (gradientDrawable != null) {
            I(canvas, path, gradientDrawable);
            return;
        }
        int i4 = (fVar.f30462u << 24) | (fVar.f30460s & 16777215);
        DisplayMetrics displayMetrics = w9.g.f36555a;
        int iSave = canvas.save();
        canvas.clipPath(path);
        canvas.drawColor(i4);
        canvas.restoreToCount(iSave);
    }

    public final void I(Canvas canvas, Path path, Drawable drawable) {
        DisplayMetrics displayMetrics = w9.g.f36555a;
        int iSave = canvas.save();
        canvas.clipPath(path);
        RectF rectF = ((w9.h) this.f218b).f36564b;
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
