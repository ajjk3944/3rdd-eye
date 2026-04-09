package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ax extends m61 {
    public static final zw h = new zw(0);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public ax(boolean z) {
        this.e = z;
    }

    @Override // defpackage.m61
    public final void b() {
        if (xw.F(3)) {
            toString();
        }
        this.f = true;
    }

    public final void c(String str) {
        HashMap map = this.c;
        ax axVar = (ax) map.get(str);
        if (axVar != null) {
            axVar.b();
            map.remove(str);
        }
        HashMap map2 = this.d;
        q61 q61Var = (q61) map2.get(str);
        if (q61Var != null) {
            q61Var.a();
            map2.remove(str);
        }
    }

    public final void d(iw iwVar) {
        if (this.g) {
            xw.F(2);
        } else {
            if (this.b.remove(iwVar.j) == null || !xw.F(2)) {
                return;
            }
            iwVar.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ax.class == obj.getClass()) {
            ax axVar = (ax) obj;
            if (this.b.equals(axVar.b) && this.c.equals(axVar.c) && this.d.equals(axVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
