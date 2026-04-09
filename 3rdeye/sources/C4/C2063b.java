package c4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: FloatingActionButtonImpl.java */
/* renamed from: c4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2063b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18476a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f18477b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.a f18478c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.floatingactionbutton.b f18479d;

    public C2063b(com.google.android.material.floatingactionbutton.b bVar, boolean z10, com.google.android.material.floatingactionbutton.a aVar) {
        this.f18479d = bVar;
        this.f18477b = z10;
        this.f18478c = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f18476a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.google.android.material.floatingactionbutton.b bVar = this.f18479d;
        bVar.f22949r = 0;
        bVar.f22943l = null;
        if (this.f18476a) {
            return;
        }
        boolean z10 = this.f18477b;
        bVar.f22953v.b(z10 ? 8 : 4, z10);
        com.google.android.material.floatingactionbutton.a aVar = this.f18478c;
        if (aVar != null) {
            aVar.f22918a.a(aVar.f22919b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        com.google.android.material.floatingactionbutton.b bVar = this.f18479d;
        bVar.f22953v.b(0, this.f18477b);
        bVar.f22949r = 1;
        bVar.f22943l = animator;
        this.f18476a = false;
    }
}
