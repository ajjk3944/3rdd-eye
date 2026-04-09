package y2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.activity.OnBoardingActivity;

/* compiled from: OnboardingPagerAdapter.java */
/* renamed from: y2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5801c extends androidx.viewpager.widget.a {

    /* renamed from: a, reason: collision with root package name */
    public final OnBoardingActivity f48018a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f48019b;

    public C5801c(OnBoardingActivity onBoardingActivity, int[] iArr) {
        this.f48018a = onBoardingActivity;
        this.f48019b = iArr;
    }

    @Override // androidx.viewpager.widget.a
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public final int getCount() {
        return this.f48019b.length;
    }

    @Override // androidx.viewpager.widget.a
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.f48018a).inflate(this.f48019b[i], viewGroup, false);
        viewGroup.addView(viewInflate);
        return viewInflate;
    }

    @Override // androidx.viewpager.widget.a
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
