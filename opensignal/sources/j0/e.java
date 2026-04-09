package j0;

import a0.k;
import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.lifecycle.f0;
import androidx.lifecycle.p0;
import br.l;
import g1.r;

/* loaded from: classes.dex */
public final class e extends View {

    /* renamed from: a, reason: collision with root package name */
    public i f13030a;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f13031d;

    /* renamed from: g, reason: collision with root package name */
    public Long f13032g;

    /* renamed from: r, reason: collision with root package name */
    public f0 f13033r;

    /* renamed from: x, reason: collision with root package name */
    public p0 f13034x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f13029y = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] B = new int[0];

    private final void setRippleState(boolean z10) throws Throwable {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f13033r;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f13032g;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f13029y : B;
            i iVar = this.f13030a;
            if (iVar != null) {
                iVar.setState(iArr);
            }
        } else {
            f0 f0Var = new f0(29, this);
            this.f13033r = f0Var;
            postDelayed(f0Var, 50L);
        }
        this.f13032g = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(e eVar) {
        i iVar = eVar.f13030a;
        if (iVar != null) {
            iVar.setState(B);
        }
        eVar.f13033r = null;
    }

    public final void b(k kVar, boolean z10, long j, int i10, long j7, float f10, p0 p0Var) throws Throwable {
        if (this.f13030a == null || !Boolean.valueOf(z10).equals(this.f13031d)) {
            i iVar = new i(z10);
            setBackground(iVar);
            this.f13030a = iVar;
            this.f13031d = Boolean.valueOf(z10);
        }
        i iVar2 = this.f13030a;
        l.b(iVar2);
        this.f13034x = p0Var;
        e(j, i10, j7, f10);
        if (z10) {
            iVar2.setHotspot(f1.b.b(kVar.f8a), f1.b.c(kVar.f8a));
        } else {
            iVar2.setHotspot(iVar2.getBounds().centerX(), iVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() throws Throwable {
        this.f13034x = null;
        f0 f0Var = this.f13033r;
        if (f0Var != null) {
            removeCallbacks(f0Var);
            f0 f0Var2 = this.f13033r;
            l.b(f0Var2);
            f0Var2.run();
        } else {
            i iVar = this.f13030a;
            if (iVar != null) {
                iVar.setState(B);
            }
        }
        i iVar2 = this.f13030a;
        if (iVar2 == null) {
            return;
        }
        iVar2.setVisible(false, false);
        unscheduleDrawable(iVar2);
    }

    public final void d() throws Throwable {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) throws Throwable {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j, int i10, long j7, float f10) {
        i iVar = this.f13030a;
        if (iVar == null) {
            return;
        }
        Integer num = iVar.f13043g;
        if (num == null || num.intValue() != i10) {
            iVar.f13043g = Integer.valueOf(i10);
            iVar.setRadius(i10);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        long jB = r.b(j7, f10);
        r rVar = iVar.f13042d;
        if (!(rVar == null ? false : r.c(rVar.f9271a, jB))) {
            iVar.f13042d = new r(jB);
            iVar.setColor(ColorStateList.valueOf(g1.f0.q(jB)));
        }
        Rect rect = new Rect(0, 0, dr.a.F(Float.intBitsToFloat((int) (j >> 32))), dr.a.F(Float.intBitsToFloat((int) (j & 4294967295L))));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        iVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        p0 p0Var = this.f13034x;
        if (p0Var != null) {
            p0Var.c();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
