package ql;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final d5.a f32444d = new d5.a(2);

    /* renamed from: e, reason: collision with root package name */
    public static final d5.a f32445e = new d5.a(0);

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView f32446a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f32447b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32448c;

    public a(RecyclerView recyclerView) {
        this.f32446a = recyclerView;
    }

    public final void a(View view, View view2) {
        if (this.f32447b) {
            return;
        }
        this.f32447b = true;
        ViewPropertyAnimator duration = view.animate().alpha(1.0f).translationX(0.0f).setDuration(150L);
        d5.a aVar = f32444d;
        duration.setInterpolator(aVar).start();
        view2.animate().alpha(1.0f).translationX(0.0f).setDuration(150L).setInterpolator(aVar).start();
    }
}
