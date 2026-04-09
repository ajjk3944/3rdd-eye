package f3;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f20110a = {R.attr.stateListAnimator};

    public static void a(AppBarLayout appBarLayout, float f2) {
        int integer = appBarLayout.getResources().getInteger(com.apm.insight.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j6 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.apm.insight.R.attr.state_liftable, -2130969749}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j6));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f2).setDuration(j6));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }
}
