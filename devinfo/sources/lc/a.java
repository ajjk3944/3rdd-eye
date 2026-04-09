package lc;

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
import bd.d;
import com.liuzh.deviceinfo.R;
import ed.o;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import zc.j;
import zc.k;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends Drawable implements j {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f28652a;

    /* renamed from: b, reason: collision with root package name */
    public final ed.j f28653b;

    /* renamed from: c, reason: collision with root package name */
    public final k f28654c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f28655d;

    /* renamed from: e, reason: collision with root package name */
    public final c f28656e;

    /* renamed from: f, reason: collision with root package name */
    public float f28657f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public final int f28658h;

    /* renamed from: i, reason: collision with root package name */
    public float f28659i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f28660k;

    /* renamed from: l, reason: collision with root package name */
    public WeakReference f28661l;

    /* renamed from: m, reason: collision with root package name */
    public WeakReference f28662m;

    public a(Context context) {
        d dVar;
        WeakReference weakReference = new WeakReference(context);
        this.f28652a = weakReference;
        m.c(context, m.f38235b, "Theme.MaterialComponents");
        this.f28655d = new Rect();
        k kVar = new k(this);
        this.f28654c = kVar;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = kVar.f38228a;
        textPaint.setTextAlign(align);
        c cVar = new c(context);
        this.f28656e = cVar;
        boolean zF = f();
        b bVar = cVar.f28688b;
        ed.j jVar = new ed.j(o.a(context, zF ? bVar.g.intValue() : bVar.f28667e.intValue(), f() ? bVar.f28669h.intValue() : bVar.f28668f.intValue()).a());
        this.f28653b = jVar;
        h();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && kVar.g != (dVar = new d(context2, bVar.f28666d.intValue()))) {
            kVar.c(dVar, context2);
            textPaint.setColor(bVar.f28665c.intValue());
            invalidateSelf();
            j();
            invalidateSelf();
        }
        int i4 = bVar.f28672l;
        if (i4 != -2) {
            this.f28658h = ((int) Math.pow(10.0d, i4 - 1.0d)) - 1;
        } else {
            this.f28658h = bVar.f28673m;
        }
        kVar.f38232e = true;
        j();
        invalidateSelf();
        kVar.f38232e = true;
        h();
        j();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(bVar.f28664b.intValue());
        if (jVar.f23316b.f23301d != colorStateListValueOf) {
            jVar.o(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(bVar.f28665c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f28661l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f28661l.get();
            WeakReference weakReference3 = this.f28662m;
            i(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        j();
        setVisible(bVar.f28680t.booleanValue(), false);
    }

    @Override // zc.j
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
        boolean z3;
        FrameLayout frameLayoutD = d();
        if (frameLayoutD == null) {
            float y11 = view.getY();
            x10 = view.getX();
            parent = view.getParent();
            y10 = y11;
        } else {
            y10 = 0.0f;
            x10 = 0.0f;
            parent = frameLayoutD;
        }
        while (true) {
            z3 = parent instanceof View;
            if (!z3 || parent == view2) {
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
        if (z3) {
            float f10 = (this.g - this.f28660k) + y10;
            float f11 = (this.f28657f - this.j) + x10;
            View view4 = parent;
            float height = ((this.g + this.f28660k) - view4.getHeight()) + y10;
            float width = ((this.f28657f + this.j) - view4.getWidth()) + x10;
            if (f10 < 0.0f) {
                this.g = Math.abs(f10) + this.g;
            }
            if (f11 < 0.0f) {
                this.f28657f = Math.abs(f11) + this.f28657f;
            }
            if (height > 0.0f) {
                this.g -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.f28657f -= Math.abs(width);
            }
        }
    }

    public final String c() {
        c cVar = this.f28656e;
        b bVar = cVar.f28688b;
        b bVar2 = cVar.f28688b;
        String str = bVar.j;
        WeakReference weakReference = this.f28652a;
        if (str == null) {
            if (!g()) {
                return null;
            }
            int i4 = this.f28658h;
            if (i4 == -2 || e() <= i4) {
                return NumberFormat.getInstance(bVar2.f28674n).format(e());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(bVar2.f28674n, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i4), "+");
        }
        int i10 = bVar.f28672l;
        if (i10 == -2 || str == null || str.length() <= i10) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i10 - 1), "…");
    }

    public final FrameLayout d() {
        WeakReference weakReference = this.f28662m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strC;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f28653b.draw(canvas);
        if (!f() || (strC = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        k kVar = this.f28654c;
        kVar.f38228a.getTextBounds(strC, 0, strC.length(), rect);
        float fExactCenterY = this.g - rect.exactCenterY();
        canvas.drawText(strC, this.f28657f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), kVar.f38228a);
    }

    public final int e() {
        int i4 = this.f28656e.f28688b.f28671k;
        if (i4 != -1) {
            return i4;
        }
        return 0;
    }

    public final boolean f() {
        return this.f28656e.f28688b.j != null || g();
    }

    public final boolean g() {
        b bVar = this.f28656e.f28688b;
        return bVar.j == null && bVar.f28671k != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f28656e.f28688b.f28670i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f28655d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f28655d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        Context context = (Context) this.f28652a.get();
        if (context == null) {
            return;
        }
        boolean zF = f();
        c cVar = this.f28656e;
        this.f28653b.setShapeAppearanceModel(o.a(context, zF ? cVar.f28688b.g.intValue() : cVar.f28688b.f28667e.intValue(), f() ? cVar.f28688b.f28669h.intValue() : cVar.f28688b.f28668f.intValue()).a());
        invalidateSelf();
    }

    public final void i(View view, FrameLayout frameLayout) {
        this.f28661l = new WeakReference(view);
        this.f28662m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        j();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0116 A[PHI: r14
  0x0116: PHI (r14v2 int) = (r14v1 int), (r14v8 int) binds: [B:41:0x00e0, B:43:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.a.j():void");
    }

    @Override // android.graphics.drawable.Drawable, zc.j
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        c cVar = this.f28656e;
        cVar.f28687a.f28670i = i4;
        cVar.f28688b.f28670i = i4;
        this.f28654c.f38228a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
