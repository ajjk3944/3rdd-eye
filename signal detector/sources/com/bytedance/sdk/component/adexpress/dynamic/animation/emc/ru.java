package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ru extends dg {
    private float bw;
    private emc dg;
    private float ycc;

    public class emc {
        private View ypw;

        public emc(View view) {
            this.ypw = view;
        }

        public void emc(int i) {
            if (!"top".equals(ru.this.ypw.emc())) {
                ViewGroup.LayoutParams layoutParams = this.ypw.getLayoutParams();
                layoutParams.height = i;
                this.ypw.setLayoutParams(layoutParams);
                this.ypw.requestLayout();
                return;
            }
            if (ru.this.xq instanceof ViewGroup) {
                for (int i3 = 0; i3 < ((ViewGroup) ru.this.xq).getChildCount(); i3++) {
                    ((ViewGroup) ru.this.xq).getChildAt(i3).setTranslationY(i - ru.this.bw);
                }
            }
            ru ruVar = ru.this;
            ruVar.xq.setTranslationY(ruVar.bw - i);
        }
    }

    public ru(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        super(view, emcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg
    public List<ObjectAnimator> emc() {
        int i;
        String str;
        View view = this.xq;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw)) {
            this.xq = (View) this.xq.getParent();
        }
        this.xq.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "alpha", 0.0f, 1.0f).setDuration((int) (this.ypw.ru() * 1000.0d));
        this.dg = new emc(this.xq);
        final int i3 = this.xq.getLayoutParams().height;
        this.bw = i3;
        this.ycc = this.xq.getLayoutParams().width;
        if ("left".equals(this.ypw.emc()) || "right".equals(this.ypw.emc())) {
            i = (int) this.ycc;
            str = "width";
        } else {
            str = "height";
            i = i3;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.dg, str, 0, i).setDuration((int) (this.ypw.ru() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(emc(duration));
        arrayList.add(emc(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.emc.ru.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z6) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ru.this.dg.emc(i3);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z6) {
            }
        });
        return arrayList;
    }
}
