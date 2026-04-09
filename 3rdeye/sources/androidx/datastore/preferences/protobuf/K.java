package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.I;

/* compiled from: MapFieldSchema.java */
/* loaded from: classes.dex */
public interface K {
    J a();

    J forMapData(Object obj);

    I.a<?, ?> forMapMetadata(Object obj);

    J forMutableMapData(Object obj);

    int getSerializedSize(int i, Object obj, Object obj2);

    boolean isImmutable(Object obj);

    J mergeFrom(Object obj, Object obj2);

    Object toImmutable(Object obj);
}
