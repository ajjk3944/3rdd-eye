package hd;

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
import be.d;
import com.google.android.material.badge.BadgeState$State;
import ed.j;
import ed.k;
import ee.i;
import ee.l;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import xd.g;
import xd.h;

/* loaded from: classes.dex */
public final class a extends Drawable implements g {
    public static final int J = k.Widget_MaterialComponents_Badge;
    public static final int K = ed.b.badgeStyle;
    public float B;
    public final int D;
    public float E;
    public float F;
    public float G;
    public WeakReference H;
    public WeakReference I;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f10620a;

    /* renamed from: d, reason: collision with root package name */
    public final i f10621d;

    /* renamed from: g, reason: collision with root package name */
    public final h f10622g;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f10623r;

    /* renamed from: x, reason: collision with root package name */
    public final b f10624x;

    /* renamed from: y, reason: collision with root package name */
    public float f10625y;

    public a(Context context, BadgeState$State badgeState$State) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f10620a = weakReference;
        xd.k.c(context, xd.k.f25296b, "Theme.MaterialComponents");
        this.f10623r = new Rect();
        h hVar = new h(this);
        this.f10622g = hVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = hVar.f25288a;
        textPaint.setTextAlign(align);
        b bVar = new b(context, badgeState$State);
        this.f10624x = bVar;
        boolean zG = g();
        BadgeState$State badgeState$State2 = bVar.f10627b;
        i iVar = new i(l.a(context, zG ? badgeState$State2.B.intValue() : badgeState$State2.f5474x.intValue(), g() ? badgeState$State2.D.intValue() : badgeState$State2.f5475y.intValue()).b());
        this.f10621d = iVar;
        i();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && hVar.f25294g != (dVar = new d(context2, badgeState$State2.f5473r.intValue()))) {
            hVar.b(dVar, context2);
            textPaint.setColor(badgeState$State2.f5472g.intValue());
            invalidateSelf();
            k();
            invalidateSelf();
        }
        int i10 = badgeState$State2.H;
        if (i10 != -2) {
            this.D = ((int) Math.pow(10.0d, i10 - 1.0d)) - 1;
        } else {
            this.D = badgeState$State2.I;
        }
        hVar.f25292e = true;
        k();
        invalidateSelf();
        hVar.f25292e = true;
        i();
        k();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(badgeState$State2.f5471d.intValue());
        if (iVar.f8117d.f8100d != colorStateListValueOf) {
            iVar.q(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(badgeState$State2.f5472g.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.H;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.H.get();
            WeakReference weakReference3 = this.I;
            j(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        k();
        setVisible(badgeState$State2.P.booleanValue(), false);
    }

    @Override // xd.g
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
        float y10;
        float x10;
        View parent;
        boolean z10;
        FrameLayout frameLayoutE = e();
        if (frameLayoutE == null) {
            float y11 = view.getY();
            x10 = view.getX();
            parent = view.getParent();
            y10 = y11;
        } else {
            y10 = 0.0f;
            x10 = 0.0f;
            parent = frameLayoutE;
        }
        while (true) {
            z10 = parent instanceof View;
            if (!z10 || parent == view2) {
                break;
            }
            ViewParent parent2 = parent.getParent();
            if (!(parent2 instanceof ViewGroup) || ((ViewGroup) parent2).getClipChildren()) {
                break;
            }
            View view3 = parent;
            y10 += view3.getY();
            x10 += view3.getX();
            parent = parent.getParent();
        }
        if (z10) {
            float f10 = (this.B - this.G) + y10;
            float f11 = (this.f10625y - this.F) + x10;
            View view4 = parent;
            float height = ((this.B + this.G) - view4.getHeight()) + y10;
            float width = ((this.f10625y + this.F) - view4.getWidth()) + x10;
            if (f10 < 0.0f) {
                this.B = Math.abs(f10) + this.B;
            }
            if (f11 < 0.0f) {
                this.f10625y = Math.abs(f11) + this.f10625y;
            }
            if (height > 0.0f) {
                this.B -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.f10625y -= Math.abs(width);
            }
        }
    }

    public final String c() {
        b bVar = this.f10624x;
        BadgeState$State badgeState$State = bVar.f10627b;
        BadgeState$State badgeState$State2 = bVar.f10627b;
        String str = badgeState$State.F;
        WeakReference weakReference = this.f10620a;
        if (str == null) {
            if (!h()) {
                return null;
            }
            if (this.D == -2 || f() <= this.D) {
                return NumberFormat.getInstance(badgeState$State2.J).format(f());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(badgeState$State2.J, context.getString(j.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.D), "+");
        }
        int i10 = badgeState$State.H;
        if (i10 == -2 || str == null || str.length() <= i10) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(j.m3_exceed_max_badge_text_suffix), str.substring(0, i10 - 1), "…");
    }

    public final CharSequence d() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        b bVar = this.f10624x;
        BadgeState$State badgeState$State = bVar.f10627b;
        BadgeState$State badgeState$State2 = bVar.f10627b;
        if (badgeState$State.F != null) {
            CharSequence charSequence = badgeState$State.K;
            return charSequence != null ? charSequence : bVar.f10627b.F;
        }
        if (!h()) {
            return badgeState$State2.L;
        }
        if (badgeState$State2.M == 0 || (context = (Context) this.f10620a.get()) == null) {
            return null;
        }
        if (this.D != -2) {
            int iF = f();
            int i10 = this.D;
            if (iF > i10) {
                return context.getString(badgeState$State2.N, Integer.valueOf(i10));
            }
        }
        return context.getResources().getQuantityString(badgeState$State2.M, f(), Integer.valueOf(f()));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strC;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f10621d.draw(canvas);
        if (!g() || (strC = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        h hVar = this.f10622g;
        hVar.f25288a.getTextBounds(strC, 0, strC.length(), rect);
        float fExactCenterY = this.B - rect.exactCenterY();
        canvas.drawText(strC, this.f10625y, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), hVar.f25288a);
    }

    public final FrameLayout e() {
        WeakReference weakReference = this.I;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int f() {
        int i10 = this.f10624x.f10627b.G;
        if (i10 != -1) {
            return i10;
        }
        return 0;
    }

    public final boolean g() {
        return this.f10624x.f10627b.F != null || h();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f10624x.f10627b.E;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f10623r.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f10623r.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean h() {
        BadgeState$State badgeState$State = this.f10624x.f10627b;
        return badgeState$State.F == null && badgeState$State.G != -1;
    }

    public final void i() {
        Context context = (Context) this.f10620a.get();
        if (context == null) {
            return;
        }
        boolean zG = g();
        b bVar = this.f10624x;
        this.f10621d.setShapeAppearanceModel(l.a(context, zG ? bVar.f10627b.B.intValue() : bVar.f10627b.f5474x.intValue(), g() ? bVar.f10627b.D.intValue() : bVar.f10627b.f5475y.intValue()).b());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j(View view, FrameLayout frameLayout) {
        this.H = new WeakReference(view);
        this.I = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        k();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x011a A[PHI: r13
  0x011a: PHI (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:45:0x00e6, B:47:0x00f4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.a.k():void");
    }

    @Override // android.graphics.drawable.Drawable, xd.g
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        b bVar = this.f10624x;
        bVar.f10626a.E = i10;
        bVar.f10627b.E = i10;
        this.f10622g.f25288a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
