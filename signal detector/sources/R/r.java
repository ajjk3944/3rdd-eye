package R;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class r implements InterfaceC0191s {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f3357a;

    public r(NestedScrollView nestedScrollView) {
        this.f3357a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // R.InterfaceC0191s
    public final void onScrollLimit(int i, int i3, int i6, boolean z6) {
        this.f3357a.onScrollLimit(i, i3, i6, z6);
    }

    @Override // R.InterfaceC0191s
    public final void onScrollProgress(int i, int i3, int i6, int i7) {
        this.f3357a.onScrollProgress(i, i3, i6, i7);
    }
}
