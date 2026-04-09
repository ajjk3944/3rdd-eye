package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.List;

/* loaded from: classes.dex */
public class bw extends dg {
    public bw(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        super(view, emcVar);
    }

    private void dg(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.ypw.ul())).setDuration((int) (this.ypw.ru() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        list.add(emc(duration));
    }

    private void xq(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.ypw.ul())).setDuration((int) (this.ypw.ru() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.emc.bw.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                bw.this.xq.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(emc(duration));
    }

    private void ypw(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.ypw.ul())).setDuration((int) (this.ypw.ru() * 1000.0d));
        duration.setInterpolator(new BounceInterpolator());
        duration.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.emc.bw.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                bw.this.xq.setTranslationY(0.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        list.add(emc(duration));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<android.animation.ObjectAnimator> emc() {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.sdk.component.adexpress.dynamic.dg.emc r1 = r5.ypw
            java.lang.String r1 = r1.ylm()
            int r2 = r1.hashCode()
            r3 = 1
            r4 = 2
            switch(r2) {
                case 3029889: goto L33;
                case 3387192: goto L29;
                case 483313230: goto L1f;
                case 1356771568: goto L15;
                default: goto L14;
            }
        L14:
            goto L3d
        L15:
            java.lang.String r2 = "backwards"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = r4
            goto L3e
        L1f:
            java.lang.String r2 = "forwards"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = r3
            goto L3e
        L29:
            java.lang.String r2 = "none"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = 3
            goto L3e
        L33:
            java.lang.String r2 = "both"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            r1 = 0
            goto L3e
        L3d:
            r1 = -1
        L3e:
            if (r1 == 0) goto L50
            if (r1 == r3) goto L4c
            if (r1 == r4) goto L48
            r5.xq(r0)
            return r0
        L48:
            r5.ypw(r0)
            return r0
        L4c:
            r5.dg(r0)
            return r0
        L50:
            r5.emc(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.animation.emc.bw.emc():java.util.List");
    }

    private void emc(List<ObjectAnimator> list) {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "translationY", 0.0f, -com.bytedance.sdk.component.adexpress.dg.uym.emc(com.bytedance.sdk.component.adexpress.dg.emc(), this.ypw.ul())).setDuration(((int) (this.ypw.ru() * 1000.0d)) / 2);
        duration.setInterpolator(new LinearInterpolator());
        duration.setRepeatMode(2);
        com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar = this.ypw;
        emcVar.ycc(emcVar.cf() * 2);
        list.add(emc(duration));
    }
}
