package com.github.appintro.internal.viewpager;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.github.appintro.AppIntroPageTransformerType;
import com.github.appintro.R;
import com.github.appintro.internal.LogHelper;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;

/* compiled from: ViewPagerTransformer.kt */
/* loaded from: classes.dex */
public final class ViewPagerTransformer implements ViewPager.k {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = LogHelper.INSTANCE.makeLogTag(x.a(ViewPagerTransformer.class));
    private double descriptionPF;
    private double imagePF;
    private double titlePF;
    private final AppIntroPageTransformerType transformType;

    /* compiled from: ViewPagerTransformer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public ViewPagerTransformer(AppIntroPageTransformerType transformType) {
        l.f(transformType, "transformType");
        this.transformType = transformType;
    }

    private final void applyParallax(View view, float f10) {
        ((TextView) view.findViewById(R.id.title)).setTranslationX(computeParallax(view, f10, this.titlePF));
        ((ImageView) view.findViewById(R.id.image)).setTranslationX(computeParallax(view, f10, this.imagePF));
        ((TextView) view.findViewById(R.id.description)).setTranslationX(computeParallax(view, f10, this.descriptionPF));
    }

    private final float computeParallax(View view, float f10, double d10) {
        return (float) ((view.getWidth() / d10) * (-f10));
    }

    private final void transformDepth(float f10, View view) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            ViewPagerTransformerKt.transformDefaults(view);
            return;
        }
        float f11 = 1;
        view.setAlpha(f11 - f10);
        ViewPagerTransformerKt.setScaleXY(view, ((f11 - Math.abs(f10)) * 0.25f) + 0.75f);
        view.setTranslationX(view.getWidth() * (-f10));
    }

    private final void transformFade(float f10, View view) {
        if (f10 <= -1.0f || f10 >= 1.0f) {
            view.setTranslationX(view.getWidth());
            view.setAlpha(0.0f);
            view.setClickable(false);
        } else if (f10 != 0.0f) {
            view.setTranslationX(view.getWidth() * (-f10));
            view.setAlpha(1.0f - Math.abs(f10));
        } else {
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
            view.setClickable(true);
        }
    }

    private final void transformParallax(float f10, View view) {
        if (f10 <= -1.0f || f10 >= 1.0f) {
            return;
        }
        try {
            applyParallax(view, f10);
        } catch (IllegalStateException e4) {
            LogHelper.e(TAG, "Failed to apply parallax effect", e4);
        }
    }

    private final void transformSlideOver(float f10, View view) {
        if (f10 >= 0.0f || f10 <= -1.0f) {
            ViewPagerTransformerKt.transformDefaults(view);
            return;
        }
        float f11 = 1;
        ViewPagerTransformerKt.setScaleXY(view, (Math.abs(Math.abs(f10) - f11) * 0.14999998f) + 0.85f);
        view.setAlpha(Math.max(0.35f, f11 - Math.abs(f10)));
        float f12 = -view.getWidth();
        float f13 = f10 * f12;
        if (f13 > f12) {
            view.setTranslationX(f13);
        } else {
            view.setTranslationX(0.0f);
        }
    }

    private final void transformZoom(float f10, View view) {
        if (f10 < -1.0f || f10 > 1.0f) {
            ViewPagerTransformerKt.transformDefaults(view);
            return;
        }
        float f11 = 1;
        ViewPagerTransformerKt.setScaleXY(view, Math.max(0.85f, f11 - Math.abs(f10)));
        view.setAlpha((((ViewPagerTransformerKt.getScaleXY(view) - 0.85f) / 0.14999998f) * 0.5f) + 0.5f);
        float f12 = 2;
        float scaleXY = ((f11 - ViewPagerTransformerKt.getScaleXY(view)) * view.getHeight()) / f12;
        float scaleXY2 = ((f11 - ViewPagerTransformerKt.getScaleXY(view)) * view.getWidth()) / f12;
        if (f10 < 0.0f) {
            view.setTranslationX(scaleXY2 - (scaleXY / f12));
        } else {
            view.setTranslationX((scaleXY / f12) + (-scaleXY2));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.k
    public void transformPage(View page, float f10) {
        l.f(page, "page");
        AppIntroPageTransformerType appIntroPageTransformerType = this.transformType;
        if (l.b(appIntroPageTransformerType, AppIntroPageTransformerType.Flow.INSTANCE)) {
            page.setRotationY(f10 * (-30.0f));
            return;
        }
        if (l.b(appIntroPageTransformerType, AppIntroPageTransformerType.SlideOver.INSTANCE)) {
            transformSlideOver(f10, page);
            return;
        }
        if (l.b(appIntroPageTransformerType, AppIntroPageTransformerType.Depth.INSTANCE)) {
            transformDepth(f10, page);
            return;
        }
        if (l.b(appIntroPageTransformerType, AppIntroPageTransformerType.Zoom.INSTANCE)) {
            transformZoom(f10, page);
            return;
        }
        if (l.b(appIntroPageTransformerType, AppIntroPageTransformerType.Fade.INSTANCE)) {
            transformFade(f10, page);
        } else if (appIntroPageTransformerType instanceof AppIntroPageTransformerType.Parallax) {
            this.titlePF = ((AppIntroPageTransformerType.Parallax) this.transformType).getTitleParallaxFactor();
            this.imagePF = ((AppIntroPageTransformerType.Parallax) this.transformType).getImageParallaxFactor();
            this.descriptionPF = ((AppIntroPageTransformerType.Parallax) this.transformType).getDescriptionParallaxFactor();
            transformParallax(f10, page);
        }
    }
}
