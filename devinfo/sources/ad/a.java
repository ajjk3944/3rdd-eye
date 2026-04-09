package ad;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.liuzh.deviceinfo.R;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final PathInterpolator f321a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final View f322b;

    /* renamed from: c, reason: collision with root package name */
    public final int f323c;

    /* renamed from: d, reason: collision with root package name */
    public final int f324d;

    /* renamed from: e, reason: collision with root package name */
    public final int f325e;

    /* renamed from: f, reason: collision with root package name */
    public d.a f326f;

    public a(View view) {
        this.f322b = view;
        Context context = view.getContext();
        this.f323c = nh.a.v(context, R.attr.motionDurationMedium2, 300);
        this.f324d = nh.a.v(context, R.attr.motionDurationShort3, 150);
        this.f325e = nh.a.v(context, R.attr.motionDurationShort2, 100);
    }
}
