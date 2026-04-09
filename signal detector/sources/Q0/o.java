package q0;

import androidx.lifecycle.P;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class o extends X {

    /* renamed from: c, reason: collision with root package name */
    public static final P f23002c = new P(4);

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f23003b = new LinkedHashMap();

    @Override // androidx.lifecycle.X
    public final void d() {
        LinkedHashMap linkedHashMap = this.f23003b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((a0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f23003b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        q5.i.d(string, "sb.toString()");
        return string;
    }
}
