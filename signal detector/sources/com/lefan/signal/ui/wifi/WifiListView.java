package com.lefan.signal.ui.wifi;

import Y4.T;
import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.apm.insight.R;
import com.bumptech.glide.e;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import q5.i;

/* loaded from: classes.dex */
public final class WifiListView extends View {

    /* renamed from: C, reason: collision with root package name */
    public final Paint f19446C;

    /* renamed from: D, reason: collision with root package name */
    public final Paint f19447D;

    /* renamed from: E, reason: collision with root package name */
    public final Paint f19448E;

    /* renamed from: F, reason: collision with root package name */
    public final Paint f19449F;

    /* renamed from: G, reason: collision with root package name */
    public final ArrayList f19450G;

    /* renamed from: H, reason: collision with root package name */
    public final TreeSet f19451H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f19452I;

    /* renamed from: J, reason: collision with root package name */
    public final Path f19453J;

    /* renamed from: K, reason: collision with root package name */
    public final Path f19454K;

    /* renamed from: a, reason: collision with root package name */
    public final int f19455a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19456b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19457c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19458d;

    /* renamed from: e, reason: collision with root package name */
    public float f19459e;

    /* renamed from: f, reason: collision with root package name */
    public float f19460f;

    /* renamed from: g, reason: collision with root package name */
    public float f19461g;

    /* renamed from: h, reason: collision with root package name */
    public final float f19462h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f19463j;

    /* renamed from: k, reason: collision with root package name */
    public final float f19464k;

    /* renamed from: l, reason: collision with root package name */
    public final int f19465l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f19466m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f19467n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WifiListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        this.f19455a = 149;
        this.f19456b = 165;
        this.i = -100.0f;
        this.f19463j = 100.0f;
        this.f19464k = 20.0f;
        Paint paint = new Paint();
        this.f19466m = paint;
        Paint paint2 = new Paint();
        this.f19467n = paint2;
        Paint paint3 = new Paint();
        this.f19446C = paint3;
        Paint paint4 = new Paint();
        this.f19447D = paint4;
        Paint paint5 = new Paint();
        this.f19448E = paint5;
        Paint paint6 = new Paint();
        this.f19449F = paint6;
        this.f19450G = new ArrayList();
        this.f19451H = new TreeSet();
        this.f19452I = new ArrayList();
        paint.setStrokeWidth(3.0f);
        paint.setAntiAlias(true);
        paint.setColor(-3355444);
        paint2.setColor(-7829368);
        paint2.setStrokeWidth(2.0f);
        paint2.setPathEffect(new DashPathEffect(new float[]{8.0f, 10.0f}, 0.0f));
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTextSize(e.i(getContext(), 8));
        paint3.setFakeBoldText(true);
        paint3.setColor(getContext().getColor(R.color.text_color));
        paint4.setStrokeWidth(3.0f);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setAntiAlias(true);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        paint5.setStrokeWidth(1.0f);
        paint5.setAntiAlias(true);
        paint5.setTextSize(e.i(getContext(), 8));
        paint6.setAntiAlias(true);
        paint6.setStrokeWidth(2.0f);
        float fI = e.i(getContext(), 20);
        this.f19462h = fI;
        this.f19457c = e.l("0000", paint3) + 20.0f;
        this.f19458d = 350.0f + fI;
        this.f19459e = e.i(getContext(), 30);
        this.f19465l = e.i(getContext(), 3);
        this.f19453J = new Path();
        this.f19454K = new Path();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0135  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lefan.signal.ui.wifi.WifiListView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        setMeasuredDimension(i, (int) (this.f19458d + this.f19462h + 10.0f));
    }

    public final void setList(List<T> list) {
        i.e(list, "wifiListBeans");
        ArrayList arrayList = this.f19450G;
        arrayList.clear();
        arrayList.addAll(list);
        invalidate();
    }
}
