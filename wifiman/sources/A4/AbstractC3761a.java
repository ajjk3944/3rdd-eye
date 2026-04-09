package a4;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;

/* renamed from: a4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3761a {

    /* renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f25720a;

    /* renamed from: b, reason: collision with root package name */
    protected final View f25721b;

    /* renamed from: c, reason: collision with root package name */
    protected final int f25722c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f25723d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f25724e;

    public AbstractC3761a(View view) {
        this.f25721b = view;
        Context context = view.getContext();
        this.f25720a = AbstractC3764d.g(context, O3.a.f16952F, H1.a.a(0.0f, 0.0f, 0.0f, 1.0f));
        this.f25722c = AbstractC3764d.f(context, O3.a.f16985x, 300);
        this.f25723d = AbstractC3764d.f(context, O3.a.f16947A, 150);
        this.f25724e = AbstractC3764d.f(context, O3.a.f16987z, 100);
    }
}
