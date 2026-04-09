package j;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2537c extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final ObjectAnimator f21257a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f21258b;

    public C2537c(AnimationDrawable animationDrawable, boolean z6, boolean z7) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z6 ? numberOfFrames - 1 : 0;
        int i3 = z6 ? 0 : numberOfFrames - 1;
        C2538d c2538d = new C2538d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        c2538d.f21260b = numberOfFrames2;
        int[] iArr = c2538d.f21259a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            c2538d.f21259a = new int[numberOfFrames2];
        }
        int[] iArr2 = c2538d.f21259a;
        int i6 = 0;
        for (int i7 = 0; i7 < numberOfFrames2; i7++) {
            int duration = animationDrawable.getDuration(z6 ? (numberOfFrames2 - i7) - 1 : i7);
            iArr2[i7] = duration;
            i6 += duration;
        }
        c2538d.f21261c = i6;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i3);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c2538d.f21261c);
        objectAnimatorOfInt.setInterpolator(c2538d);
        this.f21258b = z7;
        this.f21257a = objectAnimatorOfInt;
    }

    @Override // com.bumptech.glide.d
    public final void Q() {
        this.f21257a.reverse();
    }

    @Override // com.bumptech.glide.d
    public final void Z() {
        this.f21257a.start();
    }

    @Override // com.bumptech.glide.d
    public final void c0() {
        this.f21257a.cancel();
    }

    @Override // com.bumptech.glide.d
    public final boolean i() {
        return this.f21258b;
    }
}
