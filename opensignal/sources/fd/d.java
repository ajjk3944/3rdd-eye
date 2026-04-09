package fd;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import u.i0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f8829a = new i0(0);

    /* renamed from: b, reason: collision with root package name */
    public final i0 f8830b = new i0(0);

    public static d a(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static d b(Context context, int i10) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return c(arrayList);
        } catch (Exception e4) {
            e0.q("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e4);
            return null;
        }
    }

    public static d c(ArrayList arrayList) {
        d dVar = new d();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            dVar.f8830b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            e eVar = new e();
            eVar.f8834d = 0;
            eVar.f8835e = 1;
            eVar.f8831a = startDelay;
            eVar.f8832b = duration;
            eVar.f8833c = interpolator;
            eVar.f8834d = objectAnimator.getRepeatCount();
            eVar.f8835e = objectAnimator.getRepeatMode();
            dVar.f8829a.put(propertyName, eVar);
        }
        return dVar;
    }

    public final e d(String str) {
        i0 i0Var = this.f8829a;
        if (i0Var.get(str) != null) {
            return (e) i0Var.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.f8829a.equals(((d) obj).f8829a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8829a.hashCode();
    }

    public final String toString() {
        return "\n" + d.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f8829a + "}\n";
    }
}
