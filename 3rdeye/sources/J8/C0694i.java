package J8;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.lifecycle.AbstractC1781n;
import b9.C1992A;
import java.util.Arrays;

/* compiled from: Animations.kt */
/* renamed from: J8.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0694i {

    /* compiled from: Animations.kt */
    /* renamed from: J8.i$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2866a;

        static {
            int[] iArr = new int[AbstractC1781n.a.values().length];
            try {
                iArr[AbstractC1781n.a.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1781n.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1781n.a.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2866a = iArr;
        }
    }

    public static final ValueAnimator a(View view, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(Arrays.copyOf(fArr, fArr.length));
        valueAnimatorOfFloat.addUpdateListener(new C0693h(view, 0));
        return valueAnimatorOfFloat;
    }

    public static final void b(Animator animator, AbstractC1781n lifecycle, AbstractC1781n.a event) {
        kotlin.jvm.internal.l.f(lifecycle, "lifecycle");
        kotlin.jvm.internal.l.f(event, "event");
        int i = a.f2866a[event.ordinal()];
        if (i == 1) {
            lifecycle.addObserver(new A(new C0691f(animator, 0)));
            return;
        }
        if (i == 2) {
            lifecycle.addObserver(new B(new C0692g(animator, 0)));
        } else if (i != 3) {
            C1992A c1992a = C1992A.f18074a;
        } else {
            lifecycle.addObserver(new z(new D8.g(animator, 1)));
        }
    }

    public static final void c(Animator animator) {
        animator.removeAllListeners();
        if (animator.isRunning()) {
            animator.cancel();
        }
    }
}
