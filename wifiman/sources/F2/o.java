package f2;

import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class o extends N implements InterfaceC5497C {

    /* renamed from: c, reason: collision with root package name */
    public static final b f46823c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    private static final P.c f46824d = new a();

    /* renamed from: b, reason: collision with root package name */
    private final Map f46825b = new LinkedHashMap();

    public static final class a implements P.c {
        a() {
        }

        @Override // androidx.lifecycle.P.c
        public N a(Class modelClass) {
            AbstractC6492s.i(modelClass, "modelClass");
            return new o();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(Q viewModelStore) {
            AbstractC6492s.i(viewModelStore, "viewModelStore");
            return (o) new P(viewModelStore, o.f46824d, null, 4, null).a(o.class);
        }

        private b() {
        }
    }

    @Override // androidx.lifecycle.N
    protected void W() {
        Iterator it = this.f46825b.values().iterator();
        while (it.hasNext()) {
            ((Q) it.next()).a();
        }
        this.f46825b.clear();
    }

    public final void Y(String backStackEntryId) {
        AbstractC6492s.i(backStackEntryId, "backStackEntryId");
        Q q10 = (Q) this.f46825b.remove(backStackEntryId);
        if (q10 != null) {
            q10.a();
        }
    }

    @Override // f2.InterfaceC5497C
    public Q l(String backStackEntryId) {
        AbstractC6492s.i(backStackEntryId, "backStackEntryId");
        Q q10 = (Q) this.f46825b.get(backStackEntryId);
        if (q10 != null) {
            return q10;
        }
        Q q11 = new Q();
        this.f46825b.put(backStackEntryId, q11);
        return q11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f46825b.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String string = sb2.toString();
        AbstractC6492s.h(string, "sb.toString()");
        return string;
    }
}
