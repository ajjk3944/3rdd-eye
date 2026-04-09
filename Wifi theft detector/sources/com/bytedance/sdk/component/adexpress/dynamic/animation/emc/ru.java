package com.bytedance.sdk.component.adexpress.dynamic.animation.emc;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
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

        public void emc(int i10) {
            if (!"top".equals(ru.this.ypw.emc())) {
                ViewGroup.LayoutParams layoutParams = this.ypw.getLayoutParams();
                layoutParams.height = i10;
                this.ypw.setLayoutParams(layoutParams);
                this.ypw.requestLayout();
                return;
            }
            if (ru.this.xq instanceof ViewGroup) {
                for (int i11 = 0; i11 < ((ViewGroup) ru.this.xq).getChildCount(); i11++) {
                    ((ViewGroup) ru.this.xq).getChildAt(i11).setTranslationY(i10 - ru.this.bw);
                }
            }
            ru ruVar = ru.this;
            ruVar.xq.setTranslationY(ruVar.bw - i10);
        }
    }

    public ru(View view, com.bytedance.sdk.component.adexpress.dynamic.dg.emc emcVar) {
        super(view, emcVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.emc.dg
    public List<ObjectAnimator> emc() {
        int i10;
        String str;
        View view = this.xq;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.bw)) {
            this.xq = (View) this.xq.getParent();
        }
        this.xq.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.xq, "alpha", 0.0f, 1.0f).setDuration((int) (this.ypw.ru() * 1000.0d));
        this.dg = new emc(this.xq);
        final int i11 = this.xq.getLayoutParams().height;
        this.bw = i11;
        this.ycc = this.xq.getLayoutParams().width;
        if (TtmlNode.LEFT.equals(this.ypw.emc()) || TtmlNode.RIGHT.equals(this.ypw.emc())) {
            i10 = (int) this.ycc;
            str = "width";
        } else {
            str = "height";
            i10 = i11;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.dg, str, 0, i10).setDuration((int) (this.ypw.ru() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(emc(duration));
        arrayList.add(emc(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.emc.ru.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator, boolean z10) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ru.this.dg.emc(i11);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator, boolean z10) {
            }
        });
        return arrayList;
    }
}
