package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class b {
    public static final float[][] G = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] H = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: r, reason: collision with root package name */
    public float f2014r;

    /* renamed from: s, reason: collision with root package name */
    public float f2015s;

    /* renamed from: t, reason: collision with root package name */
    public final MotionLayout f2016t;

    /* renamed from: a, reason: collision with root package name */
    public int f1997a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1998b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1999c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2000d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f2001e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f2002f = -1;

    /* renamed from: g, reason: collision with root package name */
    public float f2003g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public float f2004h = 0.5f;

    /* renamed from: i, reason: collision with root package name */
    public float f2005i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    public float f2006j = 0.5f;

    /* renamed from: k, reason: collision with root package name */
    public int f2007k = -1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2008l = false;

    /* renamed from: m, reason: collision with root package name */
    public float f2009m = 0.0f;

    /* renamed from: n, reason: collision with root package name */
    public float f2010n = 1.0f;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2011o = false;

    /* renamed from: p, reason: collision with root package name */
    public float[] f2012p = new float[2];

    /* renamed from: q, reason: collision with root package name */
    public int[] f2013q = new int[2];

    /* renamed from: u, reason: collision with root package name */
    public float f2017u = 4.0f;

    /* renamed from: v, reason: collision with root package name */
    public float f2018v = 1.2f;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2019w = true;

    /* renamed from: x, reason: collision with root package name */
    public float f2020x = 1.0f;

    /* renamed from: y, reason: collision with root package name */
    public int f2021y = 0;

    /* renamed from: z, reason: collision with root package name */
    public float f2022z = 10.0f;
    public float A = 10.0f;
    public float B = 1.0f;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public int E = 0;
    public int F = 0;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.b$b, reason: collision with other inner class name */
    public class C0012b implements NestedScrollView.d {
        public C0012b() {
        }

        @Override // androidx.core.widget.NestedScrollView.d
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
        }
    }

    public b(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f2016t = motionLayout;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    public float a(float f10, float f11) {
        return (f10 * this.f2009m) + (f11 * this.f2010n);
    }

    public final void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index == b0.d.OnSwipe_touchAnchorId) {
                this.f2000d = typedArray.getResourceId(index, this.f2000d);
            } else if (index == b0.d.OnSwipe_touchAnchorSide) {
                int i11 = typedArray.getInt(index, this.f1997a);
                this.f1997a = i11;
                float[] fArr = G[i11];
                this.f2004h = fArr[0];
                this.f2003g = fArr[1];
            } else if (index == b0.d.OnSwipe_dragDirection) {
                int i12 = typedArray.getInt(index, this.f1998b);
                this.f1998b = i12;
                float[][] fArr2 = H;
                if (i12 < fArr2.length) {
                    float[] fArr3 = fArr2[i12];
                    this.f2009m = fArr3[0];
                    this.f2010n = fArr3[1];
                } else {
                    this.f2010n = Float.NaN;
                    this.f2009m = Float.NaN;
                    this.f2008l = true;
                }
            } else if (index == b0.d.OnSwipe_maxVelocity) {
                this.f2017u = typedArray.getFloat(index, this.f2017u);
            } else if (index == b0.d.OnSwipe_maxAcceleration) {
                this.f2018v = typedArray.getFloat(index, this.f2018v);
            } else if (index == b0.d.OnSwipe_moveWhenScrollAtTop) {
                this.f2019w = typedArray.getBoolean(index, this.f2019w);
            } else if (index == b0.d.OnSwipe_dragScale) {
                this.f2020x = typedArray.getFloat(index, this.f2020x);
            } else if (index == b0.d.OnSwipe_dragThreshold) {
                this.f2022z = typedArray.getFloat(index, this.f2022z);
            } else if (index == b0.d.OnSwipe_touchRegionId) {
                this.f2001e = typedArray.getResourceId(index, this.f2001e);
            } else if (index == b0.d.OnSwipe_onTouchUp) {
                this.f1999c = typedArray.getInt(index, this.f1999c);
            } else if (index == b0.d.OnSwipe_nestedScrollFlags) {
                this.f2021y = typedArray.getInteger(index, 0);
            } else if (index == b0.d.OnSwipe_limitBoundsTo) {
                this.f2002f = typedArray.getResourceId(index, 0);
            } else if (index == b0.d.OnSwipe_rotationCenterId) {
                this.f2007k = typedArray.getResourceId(index, this.f2007k);
            } else if (index == b0.d.OnSwipe_springDamping) {
                this.A = typedArray.getFloat(index, this.A);
            } else if (index == b0.d.OnSwipe_springMass) {
                this.B = typedArray.getFloat(index, this.B);
            } else if (index == b0.d.OnSwipe_springStiffness) {
                this.C = typedArray.getFloat(index, this.C);
            } else if (index == b0.d.OnSwipe_springStopThreshold) {
                this.D = typedArray.getFloat(index, this.D);
            } else if (index == b0.d.OnSwipe_springBoundary) {
                this.E = typedArray.getInt(index, this.E);
            } else if (index == b0.d.OnSwipe_autoCompleteMode) {
                this.F = typedArray.getInt(index, this.F);
            }
        }
    }

    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b0.d.OnSwipe);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int d() {
        return this.F;
    }

    public int e() {
        return this.f2021y;
    }

    public RectF f(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f2002f;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public float g() {
        return this.f2018v;
    }

    public float h() {
        return this.f2017u;
    }

    public boolean i() {
        return this.f2019w;
    }

    public float j(float f10, float f11) throws Resources.NotFoundException {
        this.f2016t.n0(this.f2000d, this.f2016t.getProgress(), this.f2004h, this.f2003g, this.f2012p);
        float f12 = this.f2009m;
        if (f12 != 0.0f) {
            float[] fArr = this.f2012p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f10 * f12) / fArr[0];
        }
        float[] fArr2 = this.f2012p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f11 * this.f2010n) / fArr2[1];
    }

    public int k() {
        return this.E;
    }

    public float l() {
        return this.A;
    }

    public float m() {
        return this.B;
    }

    public float n() {
        return this.C;
    }

    public float o() {
        return this.D;
    }

    public RectF p(ViewGroup viewGroup, RectF rectF) {
        View viewFindViewById;
        int i10 = this.f2001e;
        if (i10 == -1 || (viewFindViewById = viewGroup.findViewById(i10)) == null) {
            return null;
        }
        rectF.set(viewFindViewById.getLeft(), viewFindViewById.getTop(), viewFindViewById.getRight(), viewFindViewById.getBottom());
        return rectF;
    }

    public int q() {
        return this.f2001e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    public void r(MotionEvent motionEvent, MotionLayout.g gVar, int i10, androidx.constraintlayout.motion.widget.a aVar) throws Resources.NotFoundException {
        char c10;
        int i11;
        ?? r23;
        float f10;
        ?? r24;
        if (this.f2008l) {
            s(motionEvent, gVar, i10, aVar);
            return;
        }
        gVar.a(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2014r = motionEvent.getRawX();
            this.f2015s = motionEvent.getRawY();
            this.f2011o = false;
            return;
        }
        if (action == 1) {
            this.f2011o = false;
            gVar.e(1000);
            float fC = gVar.c();
            float fB = gVar.b();
            float progress = this.f2016t.getProgress();
            int i12 = this.f2000d;
            if (i12 != -1) {
                this.f2016t.n0(i12, progress, this.f2004h, this.f2003g, this.f2012p);
                c10 = 0;
            } else {
                float fMin = Math.min(this.f2016t.getWidth(), this.f2016t.getHeight());
                float[] fArr = this.f2012p;
                fArr[1] = this.f2010n * fMin;
                c10 = 0;
                fArr[0] = fMin * this.f2009m;
            }
            float f11 = this.f2009m;
            float[] fArr2 = this.f2012p;
            float fAbs = f11 != 0.0f ? fC / fArr2[c10] : fB / fArr2[1];
            float f12 = !Float.isNaN(fAbs) ? (fAbs / 3.0f) + progress : progress;
            if (f12 == 0.0f || f12 == 1.0f || (i11 = this.f1999c) == 3) {
                if (0.0f >= f12 || 1.0f <= f12) {
                    this.f2016t.setState(MotionLayout.TransitionState.FINISHED);
                    return;
                }
                return;
            }
            float f13 = ((double) f12) < 0.5d ? 0.0f : 1.0f;
            if (i11 == 6) {
                if (progress + fAbs < 0.0f) {
                    fAbs = Math.abs(fAbs);
                }
                f13 = 1.0f;
            }
            if (this.f1999c == 7) {
                if (progress + fAbs > 1.0f) {
                    fAbs = -Math.abs(fAbs);
                }
                f13 = 0.0f;
            }
            this.f2016t.D0(this.f1999c, f13, fAbs);
            if (0.0f >= progress || 1.0f <= progress) {
                this.f2016t.setState(MotionLayout.TransitionState.FINISHED);
                return;
            }
            return;
        }
        if (action != 2) {
            return;
        }
        float rawY = motionEvent.getRawY() - this.f2015s;
        float rawX = motionEvent.getRawX() - this.f2014r;
        if (Math.abs((this.f2009m * rawX) + (this.f2010n * rawY)) > this.f2022z || this.f2011o) {
            float progress2 = this.f2016t.getProgress();
            if (!this.f2011o) {
                this.f2011o = true;
                this.f2016t.setProgress(progress2);
            }
            int i13 = this.f2000d;
            if (i13 != -1) {
                r23 = 1;
                r24 = 0;
                f10 = progress2;
                this.f2016t.n0(i13, f10, this.f2004h, this.f2003g, this.f2012p);
            } else {
                r23 = 1;
                f10 = progress2;
                r24 = 0;
                float fMin2 = Math.min(this.f2016t.getWidth(), this.f2016t.getHeight());
                float[] fArr3 = this.f2012p;
                fArr3[1] = this.f2010n * fMin2;
                fArr3[0] = fMin2 * this.f2009m;
            }
            float f14 = this.f2009m;
            float[] fArr4 = this.f2012p;
            if (Math.abs(((f14 * fArr4[r24]) + (this.f2010n * fArr4[r23])) * this.f2020x) < 0.01d) {
                float[] fArr5 = this.f2012p;
                fArr5[r24] = 0.01f;
                fArr5[r23] = 0.01f;
            }
            float fMax = Math.max(Math.min(f10 + (this.f2009m != 0.0f ? rawX / this.f2012p[r24] : rawY / this.f2012p[r23]), 1.0f), 0.0f);
            if (this.f1999c == 6) {
                fMax = Math.max(fMax, 0.01f);
            }
            if (this.f1999c == 7) {
                fMax = Math.min(fMax, 0.99f);
            }
            float progress3 = this.f2016t.getProgress();
            if (fMax != progress3) {
                if (progress3 == 0.0f || progress3 == 1.0f) {
                    this.f2016t.i0(progress3 == 0.0f ? r23 : r24);
                }
                this.f2016t.setProgress(fMax);
                gVar.e(1000);
                this.f2016t.B = this.f2009m != 0.0f ? gVar.c() / this.f2012p[r24] : gVar.b() / this.f2012p[r23];
            } else {
                this.f2016t.B = 0.0f;
            }
            this.f2014r = motionEvent.getRawX();
            this.f2015s = motionEvent.getRawY();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(android.view.MotionEvent r24, androidx.constraintlayout.motion.widget.MotionLayout.g r25, int r26, androidx.constraintlayout.motion.widget.a r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.b.s(android.view.MotionEvent, androidx.constraintlayout.motion.widget.MotionLayout$g, int, androidx.constraintlayout.motion.widget.a):void");
    }

    public void t(float f10, float f11) throws Resources.NotFoundException {
        float progress = this.f2016t.getProgress();
        if (!this.f2011o) {
            this.f2011o = true;
            this.f2016t.setProgress(progress);
        }
        this.f2016t.n0(this.f2000d, progress, this.f2004h, this.f2003g, this.f2012p);
        float f12 = this.f2009m;
        float[] fArr = this.f2012p;
        if (Math.abs((f12 * fArr[0]) + (this.f2010n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.f2012p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f13 = this.f2009m;
        float fMax = Math.max(Math.min(progress + (f13 != 0.0f ? (f10 * f13) / this.f2012p[0] : (f11 * this.f2010n) / this.f2012p[1]), 1.0f), 0.0f);
        if (fMax != this.f2016t.getProgress()) {
            this.f2016t.setProgress(fMax);
        }
    }

    public String toString() {
        if (Float.isNaN(this.f2009m)) {
            return "rotation";
        }
        return this.f2009m + " , " + this.f2010n;
    }

    public void u(float f10, float f11) throws Resources.NotFoundException {
        this.f2011o = false;
        float progress = this.f2016t.getProgress();
        this.f2016t.n0(this.f2000d, progress, this.f2004h, this.f2003g, this.f2012p);
        float f12 = this.f2009m;
        float[] fArr = this.f2012p;
        float f13 = f12 != 0.0f ? (f10 * f12) / fArr[0] : (f11 * this.f2010n) / fArr[1];
        if (!Float.isNaN(f13)) {
            progress += f13 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z10 = progress != 1.0f;
            int i10 = this.f1999c;
            if ((i10 != 3) && z10) {
                this.f2016t.D0(i10, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f13);
            }
        }
    }

    public void v(float f10, float f11) {
        this.f2014r = f10;
        this.f2015s = f11;
    }

    public void w(boolean z10) {
        if (z10) {
            float[][] fArr = H;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = G;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = H;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = G;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = G[this.f1997a];
        this.f2004h = fArr5[0];
        this.f2003g = fArr5[1];
        int i10 = this.f1998b;
        float[][] fArr6 = H;
        if (i10 >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i10];
        this.f2009m = fArr7[0];
        this.f2010n = fArr7[1];
    }

    public void x(float f10, float f11) {
        this.f2014r = f10;
        this.f2015s = f11;
        this.f2011o = false;
    }

    public void y() {
        View viewFindViewById;
        int i10 = this.f2000d;
        if (i10 != -1) {
            viewFindViewById = this.f2016t.findViewById(i10);
            if (viewFindViewById == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + a0.a.c(this.f2016t.getContext(), this.f2000d));
            }
        } else {
            viewFindViewById = null;
        }
        if (viewFindViewById instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) viewFindViewById;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new C0012b());
        }
    }
}
