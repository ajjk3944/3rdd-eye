package I6;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import b9.C1992A;

/* compiled from: Utils.kt */
/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.m implements p9.p<View, MotionEvent, C1992A> {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Animation f2581g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Animation f2582h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Animation animation, Animation animation2) {
        super(2);
        this.f2581g = animation;
        this.f2582h = animation2;
    }

    @Override // p9.p
    public final C1992A invoke(View view, MotionEvent motionEvent) {
        Animation animation;
        View v10 = view;
        MotionEvent event = motionEvent;
        kotlin.jvm.internal.l.f(v10, "v");
        kotlin.jvm.internal.l.f(event, "event");
        if (v10.isEnabled() && v10.isClickable() && v10.hasOnClickListeners()) {
            int action = event.getAction();
            if (action == 0) {
                Animation animation2 = this.f2581g;
                if (animation2 != null) {
                    v10.startAnimation(animation2);
                }
            } else if ((action == 1 || action == 3) && (animation = this.f2582h) != null) {
                v10.startAnimation(animation);
            }
        }
        return C1992A.f18074a;
    }
}
