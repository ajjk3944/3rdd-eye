package o4;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes.dex */
public final class o extends ic.a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f18824g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f18825r;

    public o(p pVar, s sVar) {
        this.f18825r = pVar;
        this.f18824g = sVar;
    }

    @Override // ic.a
    public final View B(int i10) {
        s sVar = this.f18824g;
        if (sVar.C()) {
            return sVar.B(i10);
        }
        Dialog dialog = this.f18825r.H0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // ic.a
    public final boolean C() {
        return this.f18824g.C() || this.f18825r.L0;
    }
}
