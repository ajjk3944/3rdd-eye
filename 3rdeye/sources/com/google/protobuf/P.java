package com.google.protobuf;

import com.google.protobuf.M;
import java.util.Map;

/* compiled from: MapFieldSchemaLite.java */
/* loaded from: classes2.dex */
public class P implements O {
    private static <K, V> int getSerializedSizeLite(int i, Object obj, Object obj2) {
        N n9 = (N) obj;
        M m10 = (M) obj2;
        int iComputeMessageSize = 0;
        if (n9.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : n9.entrySet()) {
            iComputeMessageSize += m10.computeMessageSize(i, entry.getKey(), entry.getValue());
        }
        return iComputeMessageSize;
    }

    private static <K, V> N<K, V> mergeFromLite(Object obj, Object obj2) {
        N<K, V> nMutableCopy = (N) obj;
        N<K, V> n9 = (N) obj2;
        if (!n9.isEmpty()) {
            if (!nMutableCopy.isMutable()) {
                nMutableCopy = nMutableCopy.mutableCopy();
            }
            nMutableCopy.mergeFrom(n9);
        }
        return nMutableCopy;
    }

    @Override // com.google.protobuf.O
    public Map<?, ?> forMapData(Object obj) {
        return (N) obj;
    }

    @Override // com.google.protobuf.O
    public M.b<?, ?> forMapMetadata(Object obj) {
        return ((M) obj).getMetadata();
    }

    @Override // com.google.protobuf.O
    public Map<?, ?> forMutableMapData(Object obj) {
        return (N) obj;
    }

    @Override // com.google.protobuf.O
    public int getSerializedSize(int i, Object obj, Object obj2) {
        return getSerializedSizeLite(i, obj, obj2);
    }

    @Override // com.google.protobuf.O
    public boolean isImmutable(Object obj) {
        return !((N) obj).isMutable();
    }

    @Override // com.google.protobuf.O
    public Object mergeFrom(Object obj, Object obj2) {
        return mergeFromLite(obj, obj2);
    }

    @Override // com.google.protobuf.O
    public Object newMapField(Object obj) {
        return N.emptyMapField().mutableCopy();
    }

    @Override // com.google.protobuf.O
    public Object toImmutable(Object obj) {
        ((N) obj).makeImmutable();
        return obj;
    }
}
