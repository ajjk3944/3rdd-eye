package defpackage;

import android.view.View;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gw extends i30 {
    public final /* synthetic */ iw w;

    public gw(iw iwVar) {
        this.w = iwVar;
    }

    @Override // defpackage.i30
    public final View K(int i) {
        iw iwVar = this.w;
        View view = iwVar.J;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + iwVar + " does not have a view");
    }

    @Override // defpackage.i30
    public final boolean L() {
        return this.w.J != null;
    }
}
