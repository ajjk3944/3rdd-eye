package z4;

import android.animation.Animator;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public Animator f25327a;

    public void a() {
        Animator animator = this.f25327a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void b() {
        this.f25327a = null;
    }

    public void c(Animator animator) {
        a();
        this.f25327a = animator;
    }
}
