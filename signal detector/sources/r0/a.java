package R0;

import U4.m;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f3371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f3373c;

    public a(m mVar, FrameLayout frameLayout, e eVar) {
        this.f3373c = mVar;
        this.f3371a = frameLayout;
        this.f3372b = eVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i3, int i6, int i7, int i8, int i9, int i10, int i11) {
        FrameLayout frameLayout = this.f3371a;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.f3373c.e(this.f3372b);
        }
    }
}
