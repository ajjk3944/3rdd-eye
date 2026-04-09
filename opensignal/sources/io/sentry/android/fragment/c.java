package io.sentry.android.fragment;

import br.l;
import br.w;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.r3;
import io.sentry.z0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements r3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11818a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f11819d;

    public /* synthetic */ c(w wVar, int i10) {
        this.f11818a = i10;
        this.f11819d = wVar;
    }

    @Override // io.sentry.r3
    public final void i(z0 z0Var) {
        int i10 = this.f11818a;
        w wVar = this.f11819d;
        switch (i10) {
            case 0:
                l.e(z0Var, "it");
                wVar.f2917a = z0Var.l();
                break;
            case 1:
                int i11 = ReplayIntegration.M;
                l.e(z0Var, "it");
                String strF = z0Var.F();
                wVar.f2917a = strF != null ? tt.l.T0('.', strF, strF) : null;
                break;
            default:
                l.e(z0Var, "scope");
                wVar.f2917a = new ArrayList(z0Var.s());
                break;
        }
    }
}
