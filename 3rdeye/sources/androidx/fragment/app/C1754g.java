package androidx.fragment.app;

import L0.I;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.C1763p;
import androidx.fragment.app.S;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m0.C5308a;

/* compiled from: DefaultSpecialEffectsController.kt */
/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1754g extends S {

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* renamed from: androidx.fragment.app.g$a */
    public static final class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public final boolean f15878c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f15879d;

        /* renamed from: e, reason: collision with root package name */
        public C1763p.a f15880e;

        public a(S.b bVar, G0.e eVar, boolean z10) {
            super(bVar, eVar);
            this.f15878c = z10;
        }

        public final C1763p.a c(Context context) throws Resources.NotFoundException {
            Animation animationLoadAnimation;
            C1763p.a aVar;
            if (this.f15879d) {
                return this.f15880e;
            }
            S.b bVar = this.f15881a;
            boolean z10 = bVar.f15839a == S.b.EnumC0238b.VISIBLE;
            ComponentCallbacksC1759l componentCallbacksC1759l = bVar.f15841c;
            int nextTransition = componentCallbacksC1759l.getNextTransition();
            int popEnterAnim = this.f15878c ? z10 ? componentCallbacksC1759l.getPopEnterAnim() : componentCallbacksC1759l.getPopExitAnim() : z10 ? componentCallbacksC1759l.getEnterAnim() : componentCallbacksC1759l.getExitAnim();
            componentCallbacksC1759l.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = componentCallbacksC1759l.mContainer;
            C1763p.a aVar2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                componentCallbacksC1759l.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = componentCallbacksC1759l.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation animationOnCreateAnimation = componentCallbacksC1759l.onCreateAnimation(nextTransition, z10, popEnterAnim);
                if (animationOnCreateAnimation != null) {
                    aVar2 = new C1763p.a(animationOnCreateAnimation);
                } else {
                    Animator animatorOnCreateAnimator = componentCallbacksC1759l.onCreateAnimator(nextTransition, z10, popEnterAnim);
                    if (animatorOnCreateAnimator != null) {
                        aVar2 = new C1763p.a(animatorOnCreateAnimator);
                    } else {
                        if (popEnterAnim == 0 && nextTransition != 0) {
                            popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z10 ? C1763p.a(context, android.R.attr.activityOpenEnterAnimation) : C1763p.a(context, android.R.attr.activityOpenExitAnimation) : z10 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z10 ? C1763p.a(context, android.R.attr.activityCloseEnterAnimation) : C1763p.a(context, android.R.attr.activityCloseExitAnimation) : z10 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z10 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                        }
                        if (popEnterAnim != 0) {
                            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                            if (zEquals) {
                                try {
                                    animationLoadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                } catch (Resources.NotFoundException e4) {
                                    throw e4;
                                } catch (RuntimeException unused) {
                                }
                                if (animationLoadAnimation != null) {
                                    aVar = new C1763p.a(animationLoadAnimation);
                                    aVar2 = aVar;
                                }
                            } else {
                                try {
                                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                    if (animatorLoadAnimator != null) {
                                        aVar = new C1763p.a(animatorLoadAnimator);
                                        aVar2 = aVar;
                                    }
                                } catch (RuntimeException e10) {
                                    if (zEquals) {
                                        throw e10;
                                    }
                                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                    if (animationLoadAnimation2 != null) {
                                        aVar2 = new C1763p.a(animationLoadAnimation2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.f15880e = aVar2;
            this.f15879d = true;
            return aVar2;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* renamed from: androidx.fragment.app.g$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final S.b f15881a;

        /* renamed from: b, reason: collision with root package name */
        public final G0.e f15882b;

        public b(S.b bVar, G0.e eVar) {
            this.f15881a = bVar;
            this.f15882b = eVar;
        }

        public final void a() {
            S.b bVar = this.f15881a;
            G0.e eVar = this.f15882b;
            LinkedHashSet linkedHashSet = bVar.f15843e;
            if (linkedHashSet.remove(eVar) && linkedHashSet.isEmpty()) {
                bVar.b();
            }
        }

        public final boolean b() {
            S.b.EnumC0238b.a aVar = S.b.EnumC0238b.Companion;
            S.b bVar = this.f15881a;
            View view = bVar.f15841c.mView;
            kotlin.jvm.internal.l.e(view, "operation.fragment.mView");
            aVar.getClass();
            S.b.EnumC0238b enumC0238bA = S.b.EnumC0238b.a.a(view);
            S.b.EnumC0238b enumC0238b = bVar.f15839a;
            if (enumC0238bA == enumC0238b) {
                return true;
            }
            S.b.EnumC0238b enumC0238b2 = S.b.EnumC0238b.VISIBLE;
            return (enumC0238bA == enumC0238b2 || enumC0238b == enumC0238b2) ? false : true;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    /* renamed from: androidx.fragment.app.g$c */
    public static final class c extends b {

        /* renamed from: c, reason: collision with root package name */
        public final Object f15883c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f15884d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f15885e;

        public c(S.b bVar, G0.e eVar, boolean z10, boolean z11) {
            super(bVar, eVar);
            S.b.EnumC0238b enumC0238b = bVar.f15839a;
            S.b.EnumC0238b enumC0238b2 = S.b.EnumC0238b.VISIBLE;
            ComponentCallbacksC1759l componentCallbacksC1759l = bVar.f15841c;
            this.f15883c = enumC0238b == enumC0238b2 ? z10 ? componentCallbacksC1759l.getReenterTransition() : componentCallbacksC1759l.getEnterTransition() : z10 ? componentCallbacksC1759l.getReturnTransition() : componentCallbacksC1759l.getExitTransition();
            this.f15884d = bVar.f15839a == enumC0238b2 ? z10 ? componentCallbacksC1759l.getAllowReturnTransitionOverlap() : componentCallbacksC1759l.getAllowEnterTransitionOverlap() : true;
            this.f15885e = z11 ? z10 ? componentCallbacksC1759l.getSharedElementReturnTransition() : componentCallbacksC1759l.getSharedElementEnterTransition() : null;
        }

        public final N c() {
            Object obj = this.f15883c;
            N nD = d(obj);
            Object obj2 = this.f15885e;
            N nD2 = d(obj2);
            if (nD == null || nD2 == null || nD == nD2) {
                return nD == null ? nD2 : nD;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f15881a.f15841c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final N d(Object obj) {
            if (obj == null) {
                return null;
            }
            J j4 = I.f15807a;
            if (j4 != null && (obj instanceof Transition)) {
                return j4;
            }
            N n9 = I.f15808b;
            if (n9 != null && n9.e(obj)) {
                return n9;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f15881a.f15841c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public static void i(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (L0.L.b(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                i(childAt, arrayList);
            }
        }
    }

    public static void j(C5308a c5308a, View view) {
        WeakHashMap<View, L0.S> weakHashMap = L0.I.f3792a;
        String strK = I.d.k(view);
        if (strK != null) {
            c5308a.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    j(c5308a, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x09ac A[LOOP:10: B:320:0x09a6->B:322:0x09ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x08de A[EDGE_INSN: B:358:0x08de->B:290:0x08de BREAK  A[LOOP:8: B:262:0x0829->B:279:0x0887], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:420:? A[RETURN, SYNTHETIC] */
    @Override // androidx.fragment.app.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.ArrayList r40, final boolean r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1754g.b(java.util.ArrayList, boolean):void");
    }
}
