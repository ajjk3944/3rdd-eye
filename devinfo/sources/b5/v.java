package b5;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v extends com.bumptech.glide.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f1901a;

    public v(z zVar) {
        this.f1901a = zVar;
    }

    @Override // com.bumptech.glide.e
    public final View I(int i4) {
        z zVar = this.f1901a;
        View view = zVar.H;
        if (view != null) {
            return view.findViewById(i4);
        }
        throw new IllegalStateException("Fragment " + zVar + " does not have a view");
    }

    @Override // com.bumptech.glide.e
    public final boolean J() {
        return this.f1901a.H != null;
    }
}
