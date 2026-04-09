package b5;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r extends com.bumptech.glide.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f1855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1856b;

    public r(s sVar, v vVar) {
        this.f1856b = sVar;
        this.f1855a = vVar;
    }

    @Override // com.bumptech.glide.e
    public final View I(int i4) {
        v vVar = this.f1855a;
        if (vVar.J()) {
            return vVar.I(i4);
        }
        Dialog dialog = this.f1856b.f1867k0;
        if (dialog != null) {
            return dialog.findViewById(i4);
        }
        return null;
    }

    @Override // com.bumptech.glide.e
    public final boolean J() {
        return this.f1855a.J() || this.f1856b.f1871o0;
    }
}
