package L0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import o4.AbstractC2763b;
import x.AbstractC2984e;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public final View f2489b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2488a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2490c = new ArrayList();

    public t(View view) {
        this.f2489b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2489b == tVar.f2489b && this.f2488a.equals(tVar.f2488a);
    }

    public final int hashCode() {
        return this.f2488a.hashCode() + (this.f2489b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbB = AbstractC2984e.b("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbB.append(this.f2489b);
        sbB.append("\n");
        String strE = AbstractC2763b.e(sbB.toString(), "    values:");
        HashMap map = this.f2488a;
        for (String str : map.keySet()) {
            strE = strE + "    " + str + ": " + map.get(str) + "\n";
        }
        return strE;
    }
}
