package k3;

import android.view.View;

/* loaded from: classes.dex */
public final class c extends AbstractC2626a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f21785a;

    public c(e eVar) {
        this.f21785a = eVar;
    }

    @Override // k3.AbstractC2626a
    public final void c(int i, View view) {
        if (i == 5) {
            this.f21785a.cancel();
        }
    }

    @Override // k3.AbstractC2626a
    public final void b(View view) {
    }
}
