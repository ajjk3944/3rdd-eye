package B6;

import K6.C0713c;
import N7.C1439yb;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: DivTooltipAnimation.kt */
/* loaded from: classes.dex */
public final class r extends Visibility {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f573d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final C1439yb.a f574b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f575c;

    /* compiled from: DivTooltipAnimation.kt */
    public static final class a {
        public static final float a(View view) {
            int i = r.f573d;
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            kotlin.jvm.internal.l.e(displayMetrics, "resources.displayMetrics");
            return C0713c.D(10, displayMetrics);
        }
    }

    /* compiled from: DivTooltipAnimation.kt */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f576a;

        static {
            int[] iArr = new int[C1439yb.a.values().length];
            try {
                iArr[C1439yb.a.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C1439yb.a.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C1439yb.a.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C1439yb.a.TOP_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C1439yb.a.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[C1439yb.a.BOTTOM_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[C1439yb.a.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[C1439yb.a.TOP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[C1439yb.a.BOTTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f576a = iArr;
        }
    }

    public r(C1439yb.a position, Float f10) {
        kotlin.jvm.internal.l.f(position, "position");
        this.f574b = position;
        this.f575c = f10;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        float f10;
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(startValues, "startValues");
        kotlin.jvm.internal.l.f(endValues, "endValues");
        int[] iArr = b.f576a;
        C1439yb.a aVar = this.f574b;
        float f11 = 1.0f;
        switch (iArr[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                f10 = 1.0f;
                break;
            case 4:
            case 5:
            case 6:
                f10 = -1.0f;
                break;
            case 7:
                f10 = 0.5f;
                break;
            case 8:
            case 9:
                f10 = 0.0f;
                break;
            default:
                throw new b9.j();
        }
        switch (iArr[aVar.ordinal()]) {
            case 1:
            case 4:
            case 8:
                break;
            case 2:
            case 5:
                f11 = 0.0f;
                break;
            case 3:
            case 6:
            case 9:
                f11 = -1.0f;
                break;
            case 7:
                f11 = 0.5f;
                break;
            default:
                throw new b9.j();
        }
        Float f12 = this.f575c;
        view.setTranslationX(f10 * (f12 != null ? f12.floatValue() * view.getWidth() : a.a(view)));
        view.setTranslationY(f11 * (f12 != null ? f12.floatValue() * view.getHeight() : a.a(view)));
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, view.getTranslationX(), 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getTranslationY(), 0.0f));
        kotlin.jvm.internal.l.e(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(\n…f\n            )\n        )");
        return objectAnimatorOfPropertyValuesHolder;
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup sceneRoot, View view, TransitionValues startValues, TransitionValues endValues) {
        float f10;
        kotlin.jvm.internal.l.f(sceneRoot, "sceneRoot");
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(startValues, "startValues");
        kotlin.jvm.internal.l.f(endValues, "endValues");
        int[] iArr = b.f576a;
        C1439yb.a aVar = this.f574b;
        float f11 = 1.0f;
        switch (iArr[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                f10 = 1.0f;
                break;
            case 4:
            case 5:
            case 6:
                f10 = -1.0f;
                break;
            case 7:
                f10 = 0.5f;
                break;
            case 8:
            case 9:
                f10 = 0.0f;
                break;
            default:
                throw new b9.j();
        }
        switch (iArr[aVar.ordinal()]) {
            case 1:
            case 4:
            case 8:
                break;
            case 2:
            case 5:
                f11 = 0.0f;
                break;
            case 3:
            case 6:
            case 9:
                f11 = -1.0f;
                break;
            case 7:
                f11 = 0.5f;
                break;
            default:
                throw new b9.j();
        }
        Property property = View.TRANSLATION_X;
        Float f12 = this.f575c;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) property, 0.0f, f10 * (f12 != null ? f12.floatValue() * view.getWidth() : a.a(view))), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, 0.0f, f11 * (f12 != null ? f12.floatValue() * view.getHeight() : a.a(view))));
        kotlin.jvm.internal.l.e(objectAnimatorOfPropertyValuesHolder, "ofPropertyValuesHolder(\n…n\n            )\n        )");
        return objectAnimatorOfPropertyValuesHolder;
    }
}
