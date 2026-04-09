package androidx.datastore.preferences.protobuf;

import N7.C1154e9;
import androidx.datastore.preferences.protobuf.I;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes.dex */
public final class L implements K {
    @Override // androidx.datastore.preferences.protobuf.K
    public final J a() {
        return J.f15554c.e();
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final J forMapData(Object obj) {
        return (J) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final I.a<?, ?> forMapMetadata(Object obj) {
        return ((I) obj).f15550a;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final J forMutableMapData(Object obj) {
        return (J) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final int getSerializedSize(int i, Object obj, Object obj2) {
        J j4 = (J) obj;
        I i10 = (I) obj2;
        int iC = 0;
        if (j4.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : j4.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            i10.getClass();
            int iJ = AbstractC1733k.j(i);
            int iA = I.a(i10.f15550a, key, value);
            iC = C1154e9.c(iA, iA, iJ, iC);
        }
        return iC;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final boolean isImmutable(Object obj) {
        return !((J) obj).f15555b;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final J mergeFrom(Object obj, Object obj2) {
        J jE = (J) obj;
        J j4 = (J) obj2;
        if (!j4.isEmpty()) {
            if (!jE.f15555b) {
                jE = jE.e();
            }
            jE.d();
            if (!j4.isEmpty()) {
                jE.putAll(j4);
            }
        }
        return jE;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public final Object toImmutable(Object obj) {
        ((J) obj).f15555b = false;
        return obj;
    }
}
