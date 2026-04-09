package o4;

import android.animation.AnimatorSet;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f18804a = new i();

    public final void a(AnimatorSet animatorSet) {
        br.l.e(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j) {
        br.l.e(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j);
    }
}
