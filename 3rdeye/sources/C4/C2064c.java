package c4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: FloatingActionButtonImpl.java */
/* renamed from: c4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2064c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f18480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.a f18481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.b f18482c;

    public C2064c(com.google.android.material.floatingactionbutton.b bVar, boolean z10, com.google.android.material.floatingactionbutton.a aVar) {
        this.f18482c = bVar;
        this.f18480a = z10;
        this.f18481b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.google.android.material.floatingactionbutton.b bVar = this.f18482c;
        bVar.f22949r = 0;
        bVar.f22943l = null;
        com.google.android.material.floatingactionbutton.a aVar = this.f18481b;
        if (aVar != null) {
            aVar.f22918a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        com.google.android.material.floatingactionbutton.b bVar = this.f18482c;
        bVar.f22953v.b(0, this.f18480a);
        bVar.f22949r = 2;
        bVar.f22943l = animator;
    }
}
