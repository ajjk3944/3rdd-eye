package hh;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u extends com.liuzh.deviceinfo.utilities.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f25131b;

    public u(v vVar) {
        this.f25131b = vVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        nk.k.e(view, "widget");
        b5.t tVar = this.f25131b.f25135d0;
        if (tVar != null) {
            tVar.a(Boolean.FALSE);
        } else {
            nk.k.k("loginLauncher");
            throw null;
        }
    }
}
