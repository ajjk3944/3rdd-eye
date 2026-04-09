package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ww implements vw {
    public final int a;
    public final /* synthetic */ xw b;

    public ww(xw xwVar, int i) {
        this.b = xwVar;
        this.a = i;
    }

    @Override // defpackage.vw
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        xw xwVar = this.b;
        iw iwVar = xwVar.w;
        int i = this.a;
        if (iwVar == null || i >= 0 || !iwVar.h().N(-1, 0)) {
            return xwVar.O(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
