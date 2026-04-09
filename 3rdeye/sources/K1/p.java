package K1;

import N7.G8;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: TransitionValues.java */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"UnknownNullness"})
    public final View f3032b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3031a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<i> f3033c = new ArrayList<>();

    @Deprecated
    public p() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f3032b == pVar.f3032b && this.f3031a.equals(pVar.f3031a);
    }

    public final int hashCode() {
        return this.f3031a.hashCode() + (this.f3032b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbV = G8.v("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbV.append(this.f3032b);
        sbV.append("\n");
        String strS = G8.s(sbV.toString(), "    values:");
        HashMap map = this.f3031a;
        for (String str : map.keySet()) {
            strS = strS + "    " + str + ": " + map.get(str) + "\n";
        }
        return strS;
    }

    public p(View view) {
        this.f3032b = view;
    }
}
