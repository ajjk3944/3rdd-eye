package defpackage;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wo extends i30 {
    public final /* synthetic */ gw w;
    public final /* synthetic */ xo x;

    public wo(xo xoVar, gw gwVar) {
        this.x = xoVar;
        this.w = gwVar;
    }

    @Override // defpackage.i30
    public final View K(int i) {
        gw gwVar = this.w;
        if (gwVar.L()) {
            return gwVar.K(i);
        }
        Dialog dialog = this.x.k0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.i30
    public final boolean L() {
        return this.w.L() || this.x.o0;
    }
}
