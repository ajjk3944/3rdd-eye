package e4;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f22404a;

    public v(NestedScrollView nestedScrollView) {
        this.f22404a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // e4.w
    public final void onScrollLimit(int i4, int i10, int i11, boolean z3) {
        this.f22404a.onScrollLimit(i4, i10, i11, z3);
    }

    @Override // e4.w
    public final void onScrollProgress(int i4, int i10, int i11, int i12) {
        this.f22404a.onScrollProgress(i4, i10, i11, i12);
    }
}
