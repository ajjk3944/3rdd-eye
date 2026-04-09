package d4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: StateListAnimator.java */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f37496a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public ValueAnimator f37497b = null;

    /* renamed from: c, reason: collision with root package name */
    public final a f37498c = new a();

    /* compiled from: StateListAnimator.java */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            if (fVar.f37497b == animator) {
                fVar.f37497b = null;
            }
        }
    }

    /* compiled from: StateListAnimator.java */
    public static class b {
    }

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b();
        valueAnimator.addListener(this.f37498c);
        this.f37496a.add(bVar);
    }
}
