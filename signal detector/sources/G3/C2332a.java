package g3;

import D3.e;
import G3.j;
import G3.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.apm.insight.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import x3.AbstractC2993B;
import x3.x;
import x3.y;

/* renamed from: g3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2332a extends Drawable implements x {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f20168a;

    /* renamed from: b, reason: collision with root package name */
    public final j f20169b;

    /* renamed from: c, reason: collision with root package name */
    public final y f20170c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f20171d;

    /* renamed from: e, reason: collision with root package name */
    public final C2335d f20172e;

    /* renamed from: f, reason: collision with root package name */
    public float f20173f;

    /* renamed from: g, reason: collision with root package name */
    public float f20174g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20175h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f20176j;

    /* renamed from: k, reason: collision with root package name */
    public float f20177k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f20178l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f20179m;

    public C2332a(Context context, C2334c c2334c) {
        e eVar;
        WeakReference weakReference = new WeakReference(context);
        this.f20168a = weakReference;
        AbstractC2993B.c(context, AbstractC2993B.f24036b, "Theme.MaterialComponents");
        this.f20171d = new Rect();
        y yVar = new y(this);
        this.f20170c = yVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = yVar.f24176a;
        textPaint.setTextAlign(align);
        C2335d c2335d = new C2335d(context, c2334c);
        this.f20172e = c2335d;
        boolean zG = g();
        C2334c c2334c2 = c2335d.f20211b;
        j jVar = new j(o.a(context, zG ? c2334c2.f20203g.intValue() : c2334c2.f20201e.intValue(), g() ? c2334c2.f20204h.intValue() : c2334c2.f20202f.intValue()).a());
        this.f20169b = jVar;
        i();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && yVar.f24182g != (eVar = new e(context2, c2334c2.f20200d.intValue()))) {
            yVar.c(eVar, context2);
            textPaint.setColor(c2334c2.f20199c.intValue());
            invalidateSelf();
            k();
            invalidateSelf();
        }
        int i = c2334c2.f20207l;
        if (i != -2) {
            this.f20175h = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.f20175h = c2334c2.f20208m;
        }
        yVar.f24180e = true;
        k();
        invalidateSelf();
        yVar.f24180e = true;
        i();
        k();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(c2334c2.f20198b.intValue());
        if (jVar.f1597b.f1563d != colorStateListValueOf) {
            jVar.q(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(c2334c2.f20199c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f20178l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f20178l.get();
            WeakReference weakReference3 = this.f20179m;
            j(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        k();
        setVisible(c2334c2.f20186H.booleanValue(), false);
    }

    @Override // x3.x
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    public final void b(View view, View view2) {
        float y3;
        float x6;
        View parent;
        boolean z6;
        FrameLayout frameLayoutE = e();
        if (frameLayoutE == null) {
            float y4 = view.getY();
            x6 = view.getX();
            parent = view.getParent();
            y3 = y4;
        } else {
            y3 = 0.0f;
            x6 = 0.0f;
            parent = frameLayoutE;
        }
        while (true) {
            z6 = parent instanceof View;
            if (!z6 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = parent;
            y3 += view3.getY();
            x6 += view3.getX();
            parent = parent.getParent();
        }
        if (z6) {
            float f2 = (this.f20174g - this.f20177k) + y3;
            float f5 = (this.f20173f - this.f20176j) + x6;
            View view4 = parent;
            float height = ((this.f20174g + this.f20177k) - view4.getHeight()) + y3;
            float width = ((this.f20173f + this.f20176j) - view4.getWidth()) + x6;
            if (f2 < 0.0f) {
                this.f20174g = Math.abs(f2) + this.f20174g;
            }
            if (f5 < 0.0f) {
                this.f20173f = Math.abs(f5) + this.f20173f;
            }
            if (height > 0.0f) {
                this.f20174g -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.f20173f -= Math.abs(width);
            }
        }
    }

    public final String c() {
        C2335d c2335d = this.f20172e;
        C2334c c2334c = c2335d.f20211b;
        C2334c c2334c2 = c2335d.f20211b;
        String str = c2334c.f20205j;
        WeakReference weakReference = this.f20168a;
        if (str == null) {
            if (!h()) {
                return null;
            }
            int i = this.f20175h;
            if (i == -2 || f() <= i) {
                return NumberFormat.getInstance(c2334c2.f20209n).format(f());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(c2334c2.f20209n, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        int i3 = c2334c.f20207l;
        if (i3 == -2 || str == null || str.length() <= i3) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i3 - 1), "…");
    }

    public final CharSequence d() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        C2335d c2335d = this.f20172e;
        C2334c c2334c = c2335d.f20211b;
        C2334c c2334c2 = c2335d.f20211b;
        if (c2334c.f20205j != null) {
            CharSequence charSequence = c2334c.f20181C;
            return charSequence != null ? charSequence : c2335d.f20211b.f20205j;
        }
        if (!h()) {
            return c2334c2.f20182D;
        }
        if (c2334c2.f20183E == 0 || (context = (Context) this.f20168a.get()) == null) {
            return null;
        }
        int i = this.f20175h;
        return (i == -2 || f() <= i) ? context.getResources().getQuantityString(c2334c2.f20183E, f(), Integer.valueOf(f())) : context.getString(c2334c2.f20184F, Integer.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strC;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f20169b.draw(canvas);
        if (!g() || (strC = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        y yVar = this.f20170c;
        yVar.f24176a.getTextBounds(strC, 0, strC.length(), rect);
        float fExactCenterY = this.f20174g - rect.exactCenterY();
        canvas.drawText(strC, this.f20173f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), yVar.f24176a);
    }

    public final FrameLayout e() {
        WeakReference weakReference = this.f20179m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int f() {
        int i = this.f20172e.f20211b.f20206k;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean g() {
        return this.f20172e.f20211b.f20205j != null || h();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f20172e.f20211b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f20171d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f20171d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean h() {
        C2334c c2334c = this.f20172e.f20211b;
        return c2334c.f20205j == null && c2334c.f20206k != -1;
    }

    public final void i() {
        Context context = (Context) this.f20168a.get();
        if (context == null) {
            return;
        }
        boolean zG = g();
        C2335d c2335d = this.f20172e;
        this.f20169b.setShapeAppearanceModel(o.a(context, zG ? c2335d.f20211b.f20203g.intValue() : c2335d.f20211b.f20201e.intValue(), g() ? c2335d.f20211b.f20204h.intValue() : c2335d.f20211b.f20202f.intValue()).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j(View view, FrameLayout frameLayout) {
        this.f20178l = new WeakReference(view);
        this.f20179m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        k();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0112 A[PHI: r13
  0x0112: PHI (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:41:0x00de, B:43:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.C2332a.k():void");
    }

    @Override // android.graphics.drawable.Drawable, x3.x
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C2335d c2335d = this.f20172e;
        c2335d.f20210a.i = i;
        c2335d.f20211b.i = i;
        this.f20170c.f24176a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
