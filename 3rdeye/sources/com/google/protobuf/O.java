package com.google.protobuf;

import com.google.protobuf.M;
import java.util.Map;

/* compiled from: MapFieldSchema.java */
/* loaded from: classes2.dex */
public interface O {
    Map<?, ?> forMapData(Object obj);

    M.b<?, ?> forMapMetadata(Object obj);

    Map<?, ?> forMutableMapData(Object obj);

    int getSerializedSize(int i, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    Object mergeFrom(Object obj, Object obj2);

    Object newMapField(Object obj);

    Object toImmutable(Object obj);
}
