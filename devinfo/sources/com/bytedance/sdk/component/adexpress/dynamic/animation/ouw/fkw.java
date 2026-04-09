package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class fkw extends yu {
    public fkw(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        ArrayList arrayList = new ArrayList();
        String str = this.vt.vpp;
        switch (str.hashCode()) {
            case 3029889:
                if (str.equals("both")) {
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.vt.zin)).setDuration(((int) (this.vt.vt * 1000.0d)) / 2);
                    duration.setInterpolator(new LinearInterpolator());
                    duration.setRepeatMode(2);
                    this.vt.ra *= 2;
                    arrayList.add(ouw(duration));
                    return arrayList;
                }
                break;
            case 3387192:
                str.equals("none");
                break;
            case 483313230:
                if (str.equals("forwards")) {
                    ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.yu, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.vt.zin)).setDuration((int) (this.vt.vt * 1000.0d));
                    duration2.setInterpolator(new BounceInterpolator());
                    arrayList.add(ouw(duration2));
                    return arrayList;
                }
                break;
            case 1356771568:
                if (str.equals("backwards")) {
                    ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.yu, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.vt.zin)).setDuration((int) (this.vt.vt * 1000.0d));
                    duration3.setInterpolator(new BounceInterpolator());
                    duration3.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.fkw.1
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            fkw.this.yu.setTranslationY(0.0f);
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                        }
                    });
                    arrayList.add(ouw(duration3));
                    return arrayList;
                }
                break;
        }
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.yu, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), this.vt.zin)).setDuration((int) (this.vt.vt * 1000.0d));
        duration4.setInterpolator(new BounceInterpolator());
        duration4.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.fkw.2
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                fkw.this.yu.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }
        });
        arrayList.add(ouw(duration4));
        return arrayList;
    }
}
