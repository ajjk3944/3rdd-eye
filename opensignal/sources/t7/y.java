package t7;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public final View f22529b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f22528a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22530c = new ArrayList();

    public y(View view) {
        this.f22529b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f22529b == yVar.f22529b && this.f22528a.equals(yVar.f22528a);
    }

    public final int hashCode() {
        return this.f22528a.hashCode() + (this.f22529b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbL = w.g.l("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbL.append(this.f22529b);
        sbL.append("\n");
        String strF = w.g.f(sbL.toString(), "    values:");
        HashMap map = this.f22528a;
        for (String str : map.keySet()) {
            strF = strF + "    " + str + ": " + map.get(str) + "\n";
        }
        return strF;
    }
}
