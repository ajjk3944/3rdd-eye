package y1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class q {

    /* renamed from: b, reason: collision with root package name */
    public View f25090b;

    /* renamed from: a, reason: collision with root package name */
    public final Map f25089a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f25091c = new ArrayList();

    public q(View view) {
        this.f25090b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f25090b == qVar.f25090b && this.f25089a.equals(qVar.f25089a);
    }

    public int hashCode() {
        return (this.f25090b.hashCode() * 31) + this.f25089a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f25090b + "\n") + "    values:";
        for (String str2 : this.f25089a.keySet()) {
            str = str + "    " + str2 + ": " + this.f25089a.get(str2) + "\n";
        }
        return str;
    }
}
