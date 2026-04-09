package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1730h;
import androidx.datastore.preferences.protobuf.AbstractC1744w;
import java.io.IOException;

/* compiled from: MessageLite.java */
/* loaded from: classes.dex */
public interface P extends Q {
    void b(AbstractC1733k abstractC1733k) throws IOException;

    int getSerializedSize();

    AbstractC1744w.a newBuilderForType();

    AbstractC1744w.a toBuilder();

    AbstractC1730h.e toByteString();
}
