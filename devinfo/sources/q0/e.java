package q0;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import e0.k;
import ig.l;
import p1.s;
import p1.z;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends View {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f32051f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] g = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public h f32052a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f32053b;

    /* renamed from: c, reason: collision with root package name */
    public Long f32054c;

    /* renamed from: d, reason: collision with root package name */
    public l f32055d;

    /* renamed from: e, reason: collision with root package name */
    public a6.e f32056e;

    private final void setRippleState(boolean z3) throws Resources.NotFoundException {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f32055d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f32054c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z3 || jLongValue >= 5) {
            int[] iArr = z3 ? f32051f : g;
            h hVar = this.f32052a;
            if (hVar != null) {
                hVar.setState(iArr);
            }
        } else {
            l lVar = new l(12, this);
            this.f32055d = lVar;
            postDelayed(lVar, 50L);
        }
        this.f32054c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$1(e eVar) {
        h hVar = eVar.f32052a;
        if (hVar != null) {
            hVar.setState(g);
        }
        eVar.f32055d = null;
    }

    public final void b(k kVar, boolean z3, long j, int i4, long j8, a6.e eVar) throws Resources.NotFoundException {
        if (this.f32052a == null || !Boolean.valueOf(z3).equals(this.f32053b)) {
            h hVar = new h(z3);
            setBackground(hVar);
            this.f32052a = hVar;
            this.f32053b = Boolean.valueOf(z3);
        }
        h hVar2 = this.f32052a;
        nk.k.b(hVar2);
        this.f32056e = eVar;
        e(j, j8, i4);
        if (z3) {
            hVar2.setHotspot(o1.b.d(kVar.f22292a), o1.b.e(kVar.f22292a));
        } else {
            hVar2.setHotspot(hVar2.getBounds().centerX(), hVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() throws Resources.NotFoundException {
        this.f32056e = null;
        l lVar = this.f32055d;
        if (lVar != null) {
            removeCallbacks(lVar);
            l lVar2 = this.f32055d;
            nk.k.b(lVar2);
            lVar2.run();
        } else {
            h hVar = this.f32052a;
            if (hVar != null) {
                hVar.setState(g);
            }
        }
        h hVar2 = this.f32052a;
        if (hVar2 == null) {
            return;
        }
        hVar2.setVisible(false, false);
        unscheduleDrawable(hVar2);
    }

    public final void d() throws Resources.NotFoundException {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) throws Resources.NotFoundException {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j, long j8, int i4) {
        h hVar = this.f32052a;
        if (hVar == null) {
            return;
        }
        Integer num = hVar.f32064c;
        if (num == null || num.intValue() != i4) {
            hVar.f32064c = Integer.valueOf(i4);
            hVar.setRadius(i4);
        }
        float f10 = Build.VERSION.SDK_INT < 28 ? 0.1f * 2 : 0.1f;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        long jB = s.b(j8, f10);
        s sVar = hVar.f32063b;
        if (!(sVar == null ? false : s.c(sVar.f31020a, jB))) {
            hVar.f32063b = new s(jB);
            hVar.setColor(ColorStateList.valueOf(z.u(jB)));
        }
        Rect rect = new Rect(0, 0, pk.a.s(Float.intBitsToFloat((int) (j >> 32))), pk.a.s(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        hVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        a6.e eVar = this.f32056e;
        if (eVar != null) {
            eVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
    }
}
