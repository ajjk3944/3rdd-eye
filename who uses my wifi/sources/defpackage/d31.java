package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d31 {
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList c = new ArrayList();

    public d31(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d31)) {
            return false;
        }
        d31 d31Var = (d31) obj;
        return this.b == d31Var.b && this.a.equals(d31Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        String strG = ex0.g(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n", "    values:");
        HashMap map = this.a;
        for (String str : map.keySet()) {
            strG = strG + "    " + str + ": " + map.get(str) + "\n";
        }
        return strG;
    }
}
