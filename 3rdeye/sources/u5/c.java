package U5;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.applovin.impl.r7;
import kotlin.jvm.internal.l;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12490c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f12491d;

    public /* synthetic */ c(View view, long j4, int i) {
        this.f12489b = i;
        this.f12491d = view;
        this.f12490c = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12489b) {
            case 0:
                View this_circularRevealed = this.f12491d;
                l.f(this_circularRevealed, "$this_circularRevealed");
                if (this_circularRevealed.isAttachedToWindow()) {
                    this_circularRevealed.setVisibility(0);
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(this_circularRevealed, (this_circularRevealed.getRight() + this_circularRevealed.getLeft()) / 2, (this_circularRevealed.getBottom() + this_circularRevealed.getTop()) / 2, 0.0f, Math.max(this_circularRevealed.getWidth(), this_circularRevealed.getHeight()));
                    animatorCreateCircularReveal.setDuration(this.f12490c);
                    animatorCreateCircularReveal.start();
                    break;
                }
                break;
            default:
                r7.b((com.applovin.impl.adview.l) this.f12491d, this.f12490c, (Runnable) null);
                break;
        }
    }
}
