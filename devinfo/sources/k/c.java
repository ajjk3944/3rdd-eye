package k;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends com.bumptech.glide.d {

    /* renamed from: a, reason: collision with root package name */
    public final ObjectAnimator f27747a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27748b;

    public c(AnimationDrawable animationDrawable, boolean z3, boolean z10) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i4 = z3 ? numberOfFrames - 1 : 0;
        int i10 = z3 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f27750b = numberOfFrames2;
        int[] iArr = dVar.f27749a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f27749a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f27749a;
        int i11 = 0;
        for (int i12 = 0; i12 < numberOfFrames2; i12++) {
            int duration = animationDrawable.getDuration(z3 ? (numberOfFrames2 - i12) - 1 : i12);
            iArr2[i12] = duration;
            i11 += duration;
        }
        dVar.f27751c = i11;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i4, i10);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(dVar.f27751c);
        objectAnimatorOfInt.setInterpolator(dVar);
        this.f27748b = z10;
        this.f27747a = objectAnimatorOfInt;
    }

    @Override // com.bumptech.glide.d
    public final void A() {
        this.f27747a.start();
    }

    @Override // com.bumptech.glide.d
    public final void B() {
        this.f27747a.cancel();
    }

    @Override // com.bumptech.glide.d
    public final boolean e() {
        return this.f27748b;
    }

    @Override // com.bumptech.glide.d
    public final void y() {
        this.f27747a.reverse();
    }
}
