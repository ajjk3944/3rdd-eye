package o4;

import android.view.View;

/* loaded from: classes.dex */
public final class s extends ic.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.b f18849g;

    public s(androidx.fragment.app.b bVar) {
        this.f18849g = bVar;
    }

    @Override // ic.a
    public final View B(int i10) {
        androidx.fragment.app.b bVar = this.f18849g;
        View view = bVar.f1413e0;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException("Fragment " + bVar + " does not have a view");
    }

    @Override // ic.a
    public final boolean C() {
        return this.f18849g.f1413e0 != null;
    }
}
