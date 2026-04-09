package o4;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f18780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f18781b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f18782c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f18783d;

    public c(s0 s0Var, ViewGroup viewGroup, View view, d dVar) {
        this.f18780a = s0Var;
        this.f18781b = viewGroup;
        this.f18782c = view;
        this.f18783d = dVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        br.l.e(animation, "animation");
        ViewGroup viewGroup = this.f18781b;
        viewGroup.post(new ch.a(viewGroup, this.f18782c, this.f18783d, 13));
        if (androidx.fragment.app.d.K(2)) {
            Objects.toString(this.f18780a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        br.l.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        br.l.e(animation, "animation");
        if (androidx.fragment.app.d.K(2)) {
            Objects.toString(this.f18780a);
        }
    }
}
