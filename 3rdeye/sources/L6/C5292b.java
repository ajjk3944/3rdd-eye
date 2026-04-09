package l6;

import H6.C0675l;
import N7.C1175g0;
import android.animation.Animator;
import java.util.Iterator;
import java.util.List;

/* compiled from: Animator.kt */
/* renamed from: l6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5292b implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f43860a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0675l f43861b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A7.d f43862c;

    public C5292b(List list, C0675l c0675l, A7.d dVar) {
        this.f43860a = list;
        this.f43861b = c0675l;
        this.f43862c = dVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Iterator it = this.f43860a.iterator();
        while (it.hasNext()) {
            this.f43861b.B((C1175g0) it.next(), "animation_end", this.f43862c);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
