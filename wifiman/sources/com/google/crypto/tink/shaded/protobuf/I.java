package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.F;
import f.AbstractC5487d;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
class I implements H {
    I() {
    }

    private static int i(int i10, Object obj, Object obj2) {
        G g10 = (G) obj;
        AbstractC5487d.a(obj2);
        if (g10.isEmpty()) {
            return 0;
        }
        Iterator it = g10.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
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

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public Object b(Object obj) {
        ((G) obj).E();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public F.a c(Object obj) {
        AbstractC5487d.a(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public Map d(Object obj) {
        return (G) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public Object e(Object obj) {
        return G.n().P();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public int f(int i10, Object obj, Object obj2) {
        return i(i10, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public boolean g(Object obj) {
        return !((G) obj).B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.H
    public Map h(Object obj) {
        return (G) obj;
    }
}
