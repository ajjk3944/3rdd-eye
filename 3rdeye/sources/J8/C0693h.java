package J8;

import android.animation.ValueAnimator;
import android.view.View;
import g0.C4362i;
import i2.C4444d;
import i2.EnumC4441a;
import p4.C5452b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: J8.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0693h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2865b;

    public /* synthetic */ C0693h(Object obj, int i) {
        this.f2864a = i;
        this.f2865b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        switch (this.f2864a) {
            case 0:
                kotlin.jvm.internal.l.f(it, "it");
                Object animatedValue = it.getAnimatedValue();
                kotlin.jvm.internal.l.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                ((View) this.f2865b).setAlpha(((Float) animatedValue).floatValue());
                break;
            case 1:
                C4362i c4362i = (C4362i) this.f2865b;
                c4362i.getClass();
                C.S.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) it.getAnimatedValue()).floatValue());
                c4362i.setAlpha(((Float) it.getAnimatedValue()).floatValue());
                break;
            case 2:
                i2.z zVar = (i2.z) this.f2865b;
                EnumC4441a enumC4441a = zVar.f38417L;
                if (enumC4441a == null) {
                    enumC4441a = C4444d.f38338a;
                }
                if (enumC4441a != EnumC4441a.ENABLED) {
                    q2.c cVar = zVar.f38437q;
                    if (cVar != null) {
                        cVar.s(zVar.f38424c.d());
                        break;
                    }
                } else {
                    zVar.invalidateSelf();
                    break;
                }
                break;
            default:
                C5452b c5452b = (C5452b) this.f2865b;
                c5452b.getClass();
                c5452b.f45151d.setAlpha(((Float) it.getAnimatedValue()).floatValue());
                break;
        }
    }
}
