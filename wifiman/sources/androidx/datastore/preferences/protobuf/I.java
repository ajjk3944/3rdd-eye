package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.F;
import java.util.Map;

/* loaded from: classes.dex */
class I implements H {
    I() {
    }

    private static int i(int i10, Object obj, Object obj2) {
        G g10 = (G) obj;
        F f10 = (F) obj2;
        int iA = 0;
        if (g10.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : g10.entrySet()) {
            iA += f10.a(i10, entry.getKey(), entry.getValue());
        }
        return iA;
    }

    private static G j(Object obj, Object obj2) {
        G gP = (G) obj;
        G g10 = (G) obj2;
        if (!g10.isEmpty()) {
            if (!gP.B()) {
                gP = gP.P();
            }
            gP.K(g10);
        }
        return gP;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public Object b(Object obj) {
        ((G) obj).E();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public F.a c(Object obj) {
        return ((F) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public Map d(Object obj) {
        return (G) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public Object e(Object obj) {
        return G.n().P();
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public int f(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public boolean g(Object obj) {
        return !((G) obj).B();
    }

    @Override // androidx.datastore.preferences.protobuf.H
    public Map h(Object obj) {
        return (G) obj;
    }
}
