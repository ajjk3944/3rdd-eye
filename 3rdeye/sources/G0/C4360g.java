package g0;

import C.J;
import C.S;
import J8.C0693h;
import android.animation.ValueAnimator;
import java.util.Objects;

/* compiled from: ScreenFlashView.java */
/* renamed from: g0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4360g implements J.g {

    /* renamed from: a, reason: collision with root package name */
    public float f37911a;

    /* renamed from: b, reason: collision with root package name */
    public ValueAnimator f37912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4362i f37913c;

    public C4360g(C4362i c4362i) {
        this.f37913c = c4362i;
    }

    @Override // C.J.g
    public final void a(long j4, J.h hVar) {
        S.a("ScreenFlashView", "ScreenFlash#apply");
        C4362i c4362i = this.f37913c;
        this.f37911a = c4362i.getBrightness();
        c4362i.setBrightness(1.0f);
        ValueAnimator valueAnimator = this.f37912b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Objects.requireNonNull(hVar);
        C8.a aVar = new C8.a(hVar, 16);
        S.a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(c4362i.getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new C0693h(c4362i, 1));
        valueAnimatorOfFloat.addListener(new C4361h(aVar));
        valueAnimatorOfFloat.start();
        this.f37912b = valueAnimatorOfFloat;
    }

    @Override // C.J.g
    public final void clear() {
        S.a("ScreenFlashView", "ScreenFlash#clearScreenFlashUi");
        ValueAnimator valueAnimator = this.f37912b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f37912b = null;
        }
        C4362i c4362i = this.f37913c;
        c4362i.setAlpha(0.0f);
        c4362i.setBrightness(this.f37911a);
    }
}
