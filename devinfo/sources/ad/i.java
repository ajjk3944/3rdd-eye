package ad;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f335a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f336b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f337c;

    public i(j jVar, boolean z3, int i4) {
        this.f337c = jVar;
        this.f335a = z3;
        this.f336b = i4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j jVar = this.f337c;
        jVar.f322b.setTranslationX(0.0f);
        jVar.a(this.f336b, 0.0f, this.f335a);
    }
}
