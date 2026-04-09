package r7;

import L0.I;
import L0.S;
import Q9.C1553s;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.WeakHashMap;
import kotlin.jvm.internal.x;

/* compiled from: AspectImageView.kt */
/* renamed from: r7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5530a extends AppCompatImageView implements X6.e {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w9.i<Object>[] f45748j;

    /* renamed from: e, reason: collision with root package name */
    public final H7.e f45749e;

    /* renamed from: f, reason: collision with root package name */
    public final C1553s f45750f;

    /* renamed from: g, reason: collision with root package name */
    public final C1553s f45751g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f45752h;
    public boolean i;

    /* compiled from: AspectImageView.kt */
    /* renamed from: r7.a$a, reason: collision with other inner class name */
    public enum EnumC0523a {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* compiled from: AspectImageView.kt */
    /* renamed from: r7.a$b */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45753a;

        static {
            int[] iArr = new int[EnumC0523a.values().length];
            try {
                iArr[EnumC0523a.NO_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC0523a.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC0523a.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC0523a.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f45753a = iArr;
        }
    }

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(C5530a.class, "gravity", "getGravity()I");
        x.f43661a.getClass();
        f45748j = new w9.i[]{nVar, new kotlin.jvm.internal.n(C5530a.class, "aspectRatio", "getAspectRatio()F"), new kotlin.jvm.internal.n(C5530a.class, "imageScale", "getImageScale()Lcom/yandex/div/internal/widget/AspectImageView$Scale;")};
    }

    public C5530a(Context context, int i) {
        super(context, null, i);
        H7.e eVar = new H7.e();
        eVar.f2291b = 0;
        this.f45749e = eVar;
        this.f45750f = new C1553s(Float.valueOf(0.0f), X6.d.f13581g);
        this.f45751g = X6.r.a(EnumC0523a.NO_SCALE);
        this.f45752h = new Matrix();
        this.i = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final float getAspectRatio() {
        return ((Number) this.f45750f.a(this, f45748j[1])).floatValue();
    }

    @Override // android.widget.ImageView, android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    public final int getGravity() {
        w9.i<Object> property = f45748j[0];
        H7.e eVar = this.f45749e;
        eVar.getClass();
        kotlin.jvm.internal.l.f(property, "property");
        return ((Number) eVar.f2291b).intValue();
    }

    public final EnumC0523a getImageScale() {
        return (EnumC0523a) this.f45751g.a(this, f45748j[2]);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.i = true;
    }

    public boolean l(int i) {
        return View.MeasureSpec.getMode(i) != 1073741824;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        float fMin;
        kotlin.jvm.internal.l.f(canvas, "canvas");
        Matrix imageMatrix = getImageMatrix();
        Matrix matrix = this.f45752h;
        if ((imageMatrix == null || kotlin.jvm.internal.l.b(getImageMatrix(), matrix)) && this.i && getWidth() > 0 && getHeight() > 0) {
            int width = getWidth();
            int height = getHeight();
            Drawable drawable = getDrawable();
            if (drawable != null) {
                int paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
                if (paddingLeft < 0) {
                    paddingLeft = 0;
                }
                float f10 = paddingLeft;
                int paddingTop = (height - getPaddingTop()) - getPaddingBottom();
                if (paddingTop < 0) {
                    paddingTop = 0;
                }
                float f11 = paddingTop;
                float intrinsicWidth = drawable.getIntrinsicWidth();
                float intrinsicHeight = drawable.getIntrinsicHeight();
                int gravity = getGravity();
                WeakHashMap<View, S> weakHashMap = I.f3792a;
                int absoluteGravity = Gravity.getAbsoluteGravity(gravity, getLayoutDirection());
                EnumC0523a imageScale = getImageScale();
                int[] iArr = b.f45753a;
                int i = iArr[imageScale.ordinal()];
                if (i == 1) {
                    fMin = 1.0f;
                } else if (i == 2) {
                    fMin = Math.min(f10 / intrinsicWidth, f11 / intrinsicHeight);
                } else if (i == 3) {
                    fMin = Math.max(f10 / intrinsicWidth, f11 / intrinsicHeight);
                } else {
                    if (i != 4) {
                        throw new b9.j();
                    }
                    fMin = f10 / intrinsicWidth;
                }
                float f12 = iArr[getImageScale().ordinal()] == 4 ? f11 / intrinsicHeight : fMin;
                int i10 = absoluteGravity & 7;
                float f13 = 0.0f;
                float f14 = i10 != 1 ? i10 != 5 ? 0.0f : f10 - (intrinsicWidth * fMin) : (f10 - (intrinsicWidth * fMin)) / 2;
                int i11 = absoluteGravity & 112;
                if (i11 == 16) {
                    f13 = (f11 - (intrinsicHeight * f12)) / 2;
                } else if (i11 == 80) {
                    f13 = f11 - (intrinsicHeight * f12);
                }
                matrix.reset();
                matrix.postScale(fMin, f12);
                matrix.postTranslate(f14, f13);
                setImageMatrix(matrix);
            }
            this.i = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        super.onLayout(z10, i, i10, i11, i12);
        this.i = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        float aspectRatio = getAspectRatio();
        if (aspectRatio == 0.0f) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i10);
        boolean zL = l(i);
        boolean z10 = View.MeasureSpec.getMode(i10) != 1073741824;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!zL && !z10) {
            measuredHeight = com.google.gson.internal.c.y(measuredWidth / aspectRatio);
        } else if (!zL && z10) {
            measuredHeight = com.google.gson.internal.c.y(measuredWidth / aspectRatio);
        } else if (zL && !z10) {
            measuredWidth = com.google.gson.internal.c.y(measuredHeight * aspectRatio);
        } else if (zL && z10) {
            measuredHeight = com.google.gson.internal.c.y(measuredWidth / aspectRatio);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.i = true;
    }

    @Override // X6.e
    public final void setAspectRatio(float f10) {
        this.f45750f.e(this, f45748j[1], Float.valueOf(f10));
    }

    public final void setGravity(int i) {
        w9.i<Object> property = f45748j[0];
        Integer numValueOf = Integer.valueOf(i);
        H7.e eVar = this.f45749e;
        eVar.getClass();
        kotlin.jvm.internal.l.f(property, "property");
        if (eVar.f2291b.equals(numValueOf)) {
            return;
        }
        eVar.f2291b = numValueOf;
        invalidate();
    }

    public final void setImageScale(EnumC0523a enumC0523a) {
        kotlin.jvm.internal.l.f(enumC0523a, "<set-?>");
        this.f45751g.e(this, f45748j[2], enumC0523a);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }
}
