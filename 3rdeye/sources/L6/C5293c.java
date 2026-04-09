package l6;

import H6.C0675l;
import N7.C1175g0;
import android.animation.Animator;
import java.util.Iterator;
import java.util.List;

/* compiled from: Animator.kt */
/* renamed from: l6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5293c implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f43863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0675l f43864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A7.d f43865c;

    public C5293c(List list, C0675l c0675l, A7.d dVar) {
        this.f43863a = list;
        this.f43864b = c0675l;
        this.f43865c = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Iterator it = this.f43863a.iterator();
        while (it.hasNext()) {
            this.f43864b.B((C1175g0) it.next(), "animation_cancel", this.f43865c);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
