package com.bytedance.sdk.component.adexpress.dynamic.animation.ouw;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj extends yu {
    ouw fkw;

    /* renamed from: le, reason: collision with root package name */
    float f7221le;
    private float ra;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class ouw {
        View ouw;

        public ouw(View view) {
            this.ouw = view;
        }
    }

    public tlj(View view, com.bytedance.sdk.component.adexpress.dynamic.yu.ouw ouwVar) {
        super(view, ouwVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.yu
    public final List<ObjectAnimator> ouw() {
        int i4;
        String str;
        View view = this.yu;
        if ((view instanceof ImageView) && (view.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw)) {
            this.yu = (View) this.yu.getParent();
        }
        this.yu.setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.yu, "alpha", 0.0f, 1.0f).setDuration((int) (this.vt.vt * 1000.0d));
        this.fkw = new ouw(this.yu);
        final int i10 = this.yu.getLayoutParams().height;
        this.f7221le = i10;
        this.ra = this.yu.getLayoutParams().width;
        if ("left".equals(this.vt.qbp) || "right".equals(this.vt.qbp)) {
            i4 = (int) this.ra;
            str = "width";
        } else {
            str = "height";
            i4 = i10;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.fkw, str, 0, i4).setDuration((int) (this.vt.vt * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(ouw(duration));
        arrayList.add(ouw(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.ouw.tlj.1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator, boolean z3) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ouw ouwVar = tlj.this.fkw;
                int i11 = i10;
                if (!"top".equals(tlj.this.vt.qbp)) {
                    ViewGroup.LayoutParams layoutParams = ouwVar.ouw.getLayoutParams();
                    layoutParams.height = i11;
                    ouwVar.ouw.setLayoutParams(layoutParams);
                    ouwVar.ouw.requestLayout();
                    return;
                }
                if (tlj.this.yu instanceof ViewGroup) {
                    for (int i12 = 0; i12 < ((ViewGroup) tlj.this.yu).getChildCount(); i12++) {
                        ((ViewGroup) tlj.this.yu).getChildAt(i12).setTranslationY(i11 - tlj.this.f7221le);
                    }
                }
                tlj tljVar = tlj.this;
                tljVar.yu.setTranslationY(tljVar.f7221le - i11);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator, boolean z3) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }
        });
        return arrayList;
    }
}
