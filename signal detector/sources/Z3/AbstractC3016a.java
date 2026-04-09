package z3;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import c.C0377b;
import com.apm.insight.R;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3016a {

    /* renamed from: a, reason: collision with root package name */
    public final PathInterpolator f24462a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final View f24463b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24464c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24465d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24466e;

    /* renamed from: f, reason: collision with root package name */
    public C0377b f24467f;

    public AbstractC3016a(View view) {
        this.f24463b = view;
        Context context = view.getContext();
        this.f24464c = com.bumptech.glide.d.O(context, R.attr.motionDurationMedium2, 300);
        this.f24465d = com.bumptech.glide.d.O(context, R.attr.motionDurationShort3, 150);
        this.f24466e = com.bumptech.glide.d.O(context, R.attr.motionDurationShort2, 100);
    }
}
