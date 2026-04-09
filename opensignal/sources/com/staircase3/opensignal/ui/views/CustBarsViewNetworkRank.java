package com.staircase3.opensignal.ui.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.staircase3.opensignal.utils.u;
import java.util.ArrayList;
import qk.d;
import qk.f;
import qk.n;

/* loaded from: classes.dex */
public class CustBarsViewNetworkRank extends View {
    public static Paint M;
    public static Paint N;
    public static Bitmap O;
    public static Bitmap P;
    public static int Q;
    public static int R;
    public static int S;
    public static int T;
    public static final ArrayList U = new ArrayList();
    public static final ArrayList V = new ArrayList();
    public Boolean B;
    public Boolean D;
    public RectF[] E;
    public float F;
    public float G;
    public final boolean H;
    public final boolean I;
    public boolean J;
    public final int K;
    public final int L;

    /* renamed from: a, reason: collision with root package name */
    public int f6144a;

    /* renamed from: d, reason: collision with root package name */
    public int f6145d;

    /* renamed from: g, reason: collision with root package name */
    public float f6146g;

    /* renamed from: r, reason: collision with root package name */
    public float f6147r;

    /* renamed from: x, reason: collision with root package name */
    public int f6148x;

    /* renamed from: y, reason: collision with root package name */
    public int f6149y;

    public CustBarsViewNetworkRank(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6144a = 170;
        this.f6145d = 170;
        this.f6148x = -1;
        this.f6149y = -1;
        this.B = null;
        this.D = Boolean.FALSE;
        this.H = true;
        this.I = true;
        this.J = false;
        this.K = u.b(context, d.network_rank_bars);
        this.L = u.b(context, d.network_rank_bars_background);
        this.B = Boolean.valueOf(getContext().obtainStyledAttributes(attributeSet, n.CustomBarsView).getBoolean(n.CustomBarsView_cellsNotWifi, false));
        this.H = false;
        for (int i10 = 0; i10 < 6; i10++) {
            U.add(null);
        }
        for (int i11 = 0; i11 < 5; i11++) {
            V.add(null);
        }
    }

    public Bitmap getBitmap() {
        int i10 = this.B.booleanValue() ? this.f6148x : this.f6149y;
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 > 5) {
            i10 = 5;
        }
        boolean zBooleanValue = this.B.booleanValue();
        ArrayList arrayList = V;
        ArrayList arrayList2 = U;
        if (((Bitmap) (zBooleanValue ? arrayList2.get(i10) : arrayList.get(i10))) == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.round(this.f6145d), Math.round(this.f6144a), Bitmap.Config.ARGB_8888);
            draw(new Canvas(bitmapCreateBitmap));
            if (this.B.booleanValue()) {
                arrayList2.set(i10, bitmapCreateBitmap);
            } else {
                arrayList.set(i10, bitmapCreateBitmap);
            }
        }
        return (Bitmap) (this.B.booleanValue() ? arrayList2.get(i10) : arrayList.get(i10));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        if (this.J) {
            int i11 = 0;
            if (this.B.booleanValue()) {
                canvas.translate(-((int) (this.f6145d / 30.0f)), 0.0f);
                float f10 = this.f6144a / 6.5f;
                canvas.translate((int) ((this.f6145d * 30.0f) / 170.0f), -((int) ((r1 * 4.0f) / 170.0f)));
                for (int i12 = this.H ? 0 : this.f6148x; i12 < 5; i12++) {
                    float f11 = (i12 * this.f6146g) + 0.0f;
                    canvas.drawLine(f11, ((5 - i12) * f10) + 2.0f, f11, this.f6144a - 2, N);
                }
                this.f6148x = Math.min(this.f6148x, 5);
                boolean z10 = this.H;
                if (z10) {
                    throw null;
                }
                if (!z10) {
                    while (true) {
                        i10 = this.f6148x;
                        if (i11 >= i10) {
                            break;
                        }
                        float f12 = (i11 * this.f6146g) + 0.0f;
                        canvas.drawLine(f12, ((5 - i11) * f10) + 2.0f, f12, this.f6144a - 2, M);
                        i11++;
                    }
                    if (i10 == 0) {
                        canvas.drawBitmap(P, (this.f6146g * 2.0f) - (R / 2.0f), this.f6144a / 1.8f, (Paint) null);
                    }
                }
            } else {
                canvas.translate(0.0f, 0.0f);
                int iMin = Math.min(4, this.f6149y);
                this.f6149y = iMin;
                boolean z11 = this.I;
                if (z11) {
                    throw null;
                }
                if (!z11 && iMin > 0) {
                    while (i11 < this.f6149y) {
                        canvas.drawArc(this.E[i11], this.G, this.F, false, M);
                        i11++;
                    }
                }
            }
            if (this.D.booleanValue()) {
                canvas.drawBitmap(O, this.f6145d - S, this.f6144a - Q, (Paint) null);
            }
            super.onDraw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        ArrayList arrayList = U;
        arrayList.clear();
        ArrayList arrayList2 = V;
        arrayList2.clear();
        for (int i12 = 0; i12 < 6; i12++) {
            arrayList.add(null);
        }
        for (int i13 = 0; i13 < 5; i13++) {
            arrayList2.add(null);
        }
        this.f6144a = size2;
        this.f6145d = Math.max(size, 10);
        this.f6147r = Math.min(size, this.f6144a) / 4.0f;
        float f10 = this.f6145d;
        this.f6146g = f10 / 6.0f;
        T = (int) (f10 / 8.5f);
        if (M == null) {
            Paint paint = new Paint(1);
            M = paint;
            paint.setStyle(Paint.Style.STROKE);
            M.setStrokeWidth(T);
            M.setColor(this.K);
            Paint paint2 = new Paint(M);
            N = paint2;
            paint2.setColor(this.L);
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), f.red_cross);
        P = bitmapDecodeResource;
        R = bitmapDecodeResource.getWidth();
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(getResources(), f.ic_lock_lock);
        int iMin = Math.min(Math.max(this.f6145d / 3, 18), 38);
        Q = (int) (iMin * 1.2f);
        Bitmap bitmap = O;
        if (bitmap != null) {
            bitmap.recycle();
            O = null;
        }
        O = Bitmap.createScaledBitmap(bitmapDecodeResource2, iMin, Q, true);
        bitmapDecodeResource2.recycle();
        if (this.f6145d > iMin * 4) {
            iMin *= 2;
        }
        S = iMin;
        float f11 = this.f6147r;
        float fAtan = (float) (((Math.atan((this.f6144a * 2) / r0) * 2.0d) * 180.0d) / 3.141592653589793d);
        this.F = fAtan;
        this.G = 270.0f - (fAtan / 2.0f);
        float fMax = Math.max(this.f6144a, this.f6145d);
        this.E = new RectF[4];
        for (int i14 = 0; i14 < 4; i14++) {
            float f12 = i14 * f11;
            float f13 = f12 + 0.0f;
            float f14 = (fMax - f12) - 0.0f;
            this.E[3 - i14] = new RectF(f13, f13, f14, f14);
        }
        this.J = true;
        super.onMeasure(i10, i11);
    }

    public void setCellsNotWifi(boolean z10) {
        this.B = Boolean.valueOf(z10);
    }

    public void setNrCellSignalBars(int i10) {
        this.f6148x = i10;
        invalidate();
    }

    public void setNrWifiSignalBars(int i10) {
        this.f6149y = i10;
        invalidate();
    }

    public void setSecured(boolean z10) {
        this.D = Boolean.valueOf(z10);
    }

    public void setTrans(boolean z10) {
        invalidate();
    }
}
