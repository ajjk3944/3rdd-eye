package o;

import D0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import g.C4353a;

/* compiled from: AppCompatSeekBarHelper.java */
/* renamed from: o.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5400s extends C5397o {

    /* renamed from: d, reason: collision with root package name */
    public final r f44707d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f44708e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f44709f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f44710g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f44711h;
    public boolean i;

    public C5400s(r rVar) {
        super(rVar);
        this.f44709f = null;
        this.f44710g = null;
        this.f44711h = false;
        this.i = false;
        this.f44707d = rVar;
    }

    @Override // o.C5397o
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, R.attr.seekBarStyle);
        r rVar = this.f44707d;
        Context context = rVar.getContext();
        int[] iArr = C4353a.f37882g;
        X xE = X.e(context, attributeSet, iArr, R.attr.seekBarStyle);
        L0.I.n(rVar, rVar.getContext(), iArr, attributeSet, xE.f44608b, R.attr.seekBarStyle);
        Drawable drawableC = xE.c(0);
        if (drawableC != null) {
            rVar.setThumb(drawableC);
        }
        Drawable drawableB = xE.b(1);
        Drawable drawable = this.f44708e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f44708e = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(rVar);
            a.b.b(drawableB, rVar.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(rVar.getDrawableState());
            }
            c();
        }
        rVar.invalidate();
        TypedArray typedArray = xE.f44608b;
        if (typedArray.hasValue(3)) {
            this.f44710g = C5375C.c(typedArray.getInt(3, -1), this.f44710g);
            this.i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f44709f = xE.a(2);
            this.f44711h = true;
        }
        xE.f();
        c();
    }

    public final void c() {
        Drawable drawable = this.f44708e;
        if (drawable != null) {
            if (this.f44711h || this.i) {
                Drawable drawableMutate = drawable.mutate();
                this.f44708e = drawableMutate;
                if (this.f44711h) {
                    a.C0009a.h(drawableMutate, this.f44709f);
                }
                if (this.i) {
                    a.C0009a.i(this.f44708e, this.f44710g);
                }
                if (this.f44708e.isStateful()) {
                    this.f44708e.setState(this.f44707d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.f44708e != null) {
            int max = this.f44707d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f44708e.getIntrinsicWidth();
                int intrinsicHeight = this.f44708e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i10 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f44708e.setBounds(-i, -i10, i, i10);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f44708e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
