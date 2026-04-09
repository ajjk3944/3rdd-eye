package com.survicate.surveys.presentation.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bq.b;
import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.material.datepicker.g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import on.r;
import on.t;
import on.u;
import u3.i0;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/survicate/surveys/presentation/widget/MicroDotsProgressBar;", "Landroid/widget/FrameLayout;", "survicate-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MicroDotsProgressBar extends FrameLayout {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f6547r = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6548a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6549d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6550g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicroDotsProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        l.e(context, "context");
        int i10 = 0;
        ArrayList arrayList = new ArrayList();
        this.f6548a = arrayList;
        this.f6549d = new ArrayList();
        View viewInflate = View.inflate(context, t.view_micro_dots_progress_bar, this);
        View viewFindViewById = viewInflate.findViewById(r.view_micro_dots_progress_bar_dot_left);
        l.d(viewFindViewById, "findViewById(...)");
        arrayList.add(viewFindViewById);
        View viewFindViewById2 = viewInflate.findViewById(r.view_micro_dots_progress_bar_dot_center);
        l.d(viewFindViewById2, "findViewById(...)");
        arrayList.add(viewFindViewById2);
        View viewFindViewById3 = viewInflate.findViewById(r.view_micro_dots_progress_bar_dot_right);
        l.d(viewFindViewById3, "findViewById(...)");
        arrayList.add(viewFindViewById3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ImageView imageView = (ImageView) it.next();
            imageView.setScaleX(0.3f);
            imageView.setScaleY(0.3f);
        }
        i0.n(this, new g(6));
        setContentDescription(getContext().getString(u.survicate_micro_dots_progress_bar_content_description));
        Iterator it2 = this.f6548a.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                e5.Q();
                throw null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.3f, 1.0f, 0.3f, 0.3f);
            valueAnimatorOfFloat.setDuration(1500L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setRepeatMode(1);
            valueAnimatorOfFloat.setStartDelay(i11 * 500);
            valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new b(i10, (ImageView) next));
            this.f6549d.add(valueAnimatorOfFloat);
            i11 = i12;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ArrayList arrayList = this.f6550g ? this.f6549d : null;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ValueAnimator) it.next()).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator it = this.f6549d.iterator();
        while (it.hasNext()) {
            ((ValueAnimator) it.next()).cancel();
        }
    }
}
