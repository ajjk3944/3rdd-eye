package j6;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public final View f27458b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f27457a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f27459c = new ArrayList();

    public v(View view) {
        this.f27458b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f27458b == vVar.f27458b && this.f27457a.equals(vVar.f27457a);
    }

    public final int hashCode() {
        return this.f27457a.hashCode() + (this.f27458b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbB = i3.e.b("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbB.append(this.f27458b);
        sbB.append("\n");
        String strS = d.h.s(sbB.toString(), "    values:");
        HashMap map = this.f27457a;
        for (String str : map.keySet()) {
            strS = strS + "    " + str + ": " + map.get(str) + "\n";
        }
        return strS;
    }
}
