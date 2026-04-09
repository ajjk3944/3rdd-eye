package L3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import m0.C5316i;

/* compiled from: MotionSpec.java */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final C5316i<String, h> f4046a = new C5316i<>();

    /* renamed from: b, reason: collision with root package name */
    public final C5316i<String, PropertyValuesHolder[]> f4047b = new C5316i<>();

    public static g a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static g b(Context context, int i) throws Resources.NotFoundException {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
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
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e4);
            return null;
        }
    }

    public static g c(ArrayList arrayList) {
        g gVar = new g();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            gVar.f4047b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = a.f4035b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = a.f4036c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = a.f4037d;
            }
            h hVar = new h();
            hVar.f4051d = 0;
            hVar.f4052e = 1;
            hVar.f4048a = startDelay;
            hVar.f4049b = duration;
            hVar.f4050c = interpolator;
            hVar.f4051d = objectAnimator.getRepeatCount();
            hVar.f4052e = objectAnimator.getRepeatMode();
            gVar.f4046a.put(propertyName, hVar);
        }
        return gVar;
    }

    public final h d(String str) {
        C5316i<String, h> c5316i = this.f4046a;
        if (c5316i.get(str) != null) {
            return c5316i.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f4046a.equals(((g) obj).f4046a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4046a.hashCode();
    }

    public final String toString() {
        return "\n" + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4046a + "}\n";
    }
}
